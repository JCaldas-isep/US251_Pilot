//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.awt.geom.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//public class GridShapePlacer extends JFrame {
//    private final DrawingPanel drawingPanel;
//    private final JComboBox<String> shapeSelector;
//    private final JTextField sideField;
//    private final int gridSize = 50;
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(GridShapePlacer::new);
//    }
//
//    public GridShapePlacer() {
//        super("Grid Shape Placer");
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setSize(1000, 700);
//        setLayout(new BorderLayout());
//
//        JPanel controlPanel = new JPanel();
//        shapeSelector = new JComboBox<>(new String[]{"Square", "Triangle", "Hexagon"});
//        sideField = new JTextField("1", 5);
//        JButton finishButton = new JButton("Finish");
//        JButton playButton = new JButton("Play Animation");
//
//        controlPanel.add(new JLabel("Shape:"));
//        controlPanel.add(shapeSelector);
//        controlPanel.add(new JLabel("Side Length:"));
//        controlPanel.add(sideField);
//        controlPanel.add(playButton);
//        controlPanel.add(finishButton);
//
//        add(controlPanel, BorderLayout.NORTH);
//
//        drawingPanel = new DrawingPanel();
//        add(drawingPanel, BorderLayout.CENTER);
//
//        finishButton.addActionListener(e -> {
//            ReportGenerator.generate(drawingPanel.getShapeData());
//            dispose();
//        });
//
//        playButton.addActionListener(e -> drawingPanel.startAnimation());
//
//        setVisible(true);
//    }
//
//    class DrawingPanel extends JPanel {
//        private final ArrayList<PlacedShape> placedShapes = new ArrayList<>();
//        private final Random rand = new Random();
//        private final Timer animationTimer;
//        private boolean animationStarted = false;
//
//        public void startAnimation() {
//            this.animationStarted = true;
//        }
//
//        public DrawingPanel() {
//            setBackground(Color.WHITE);
//
//            addMouseListener(new MouseAdapter() {
//                @Override
//                public void mouseClicked(MouseEvent e) {
//                    if (SwingUtilities.isRightMouseButton(e)) {
//                        selectedShape = getShapeAtPoint(e.getPoint());
//                        if (selectedShape != null) {
//                            popupMenu.show(DrawingPanel.this, e.getX(), e.getY());
//                        }
//                        return;
//                    }
//
//                    String shapeType = (String) shapeSelector.getSelectedItem();
//                    int gridLength;
//                    try {
//                        gridLength = Integer.parseInt(sideField.getText());
//                        if (gridLength <= 0) throw new NumberFormatException();
//                    } catch (NumberFormatException ex) {
//                        JOptionPane.showMessageDialog(null, "Enter a valid side length in grid units.");
//                        return;
//                    }
//
//                    double side = gridLength * gridSize;
//                    int gx = Math.round(e.getX() / (float) gridSize);
//                    int gy = Math.round(e.getY() / (float) gridSize);
//                    double cx = gx * gridSize;
//                    double cy = gy * gridSize;
//
//                    List<Point2D> vertices = switch (shapeType) {
//                        case "Square" -> squareVertices(cx, cy, side);
//                        case "Triangle" -> triangleVertices(cx, cy, side);
//                        case "Hexagon" -> hexagonVertices(cx, cy, side);
//                        default -> null;
//                    };
//
//                    if (vertices != null) {
//                        Path2D hitArea = toPath(vertices);
//                        if (!intersectsExisting(hitArea)) {
//                            Color shapeColor = new Color(rand.nextInt(200), rand.nextInt(200), rand.nextInt(200));
//                            placedShapes.add(new PlacedShape(shapeType, gx, gy, side, vertices, shapeColor));
//                            repaint();
//                        } else {
//                            JOptionPane.showMessageDialog(null, "Can't place shape — overlaps another.");
//                        }
//                    }
//                }
//            });
//
//            animationTimer = new Timer(20, e -> {
//                if (!animationStarted) return;
//
//                for (PlacedShape s : placedShapes) {
//                    if (s.rotating) {
//                        double deltaAngle = 360.0 / (s.rotationDuration * 1000 / 20.0);
//                        s.currentAngle = (s.currentAngle + deltaAngle) % 360;
//                        s.updateTransformedShape();
//                    }
//                    if (s.translating) {
//                        double dx = (s.targetX - s.translationStartX) / (s.translationDuration * 1000 / 20.0);
//                        double dy = (s.targetY - s.translationStartY) / (s.translationDuration * 1000 / 20.0);
//                        double tentativeX = s.translationStartX + s.translationProgressX + dx;
//                        double tentativeY = s.translationStartY + s.translationProgressY + dy;
//
//                        s.updateTransformedShape(tentativeX, tentativeY);
//                        if (!intersectsAnyBut(s, s.getTransformedShape())) {
//                            s.translationProgressX += dx;
//                            s.translationProgressY += dy;
//                            if (Math.abs(tentativeX - s.targetX) < 1 && Math.abs(tentativeY - s.targetY) < 1) {
//                                s.gridX = (int) Math.round(s.targetX / gridSize);
//                                s.gridY = (int) Math.round(s.targetY / gridSize);
//                                s.translationProgressX = 0;
//                                s.translationProgressY = 0;
//                                s.translating = false;
//                            }
//                        } else {
//                            s.translating = false;
//                            JOptionPane.showMessageDialog(null, "Translation stopped due to collision.");
//                        }
//                        s.updateTransformedShape();
//                    }
//                }
//                repaint();
//            });
//            animationTimer.start();
//        }
//
//        private boolean intersectsAnyBut(PlacedShape self, Shape shape) {
//            Area testArea = new Area(shape);
//            for (PlacedShape s : placedShapes) {
//                if (s == self) continue;
//                Area other = new Area(s.getTransformedShape());
//                other.intersect(testArea);
//                if (!other.isEmpty()) return true;
//            }
//            return false;
//        }
//
//        private Path2D toPath(List<Point2D> points) {
//            Path2D path = new Path2D.Double();
//            path.moveTo(points.get(0).getX(), points.get(0).getY());
//            for (int i = 1; i < points.size(); i++) {
//                path.lineTo(points.get(i).getX(), points.get(i).getY());
//            }
//            path.closePath();
//            return path;
//        }
//
//        private boolean intersectsExisting(Shape newShape) {
//            Area testArea = new Area(newShape);
//            for (PlacedShape s : placedShapes) {
//                Area other = new Area(s.getTransformedShape());
//                other.intersect(testArea);
//                if (!other.isEmpty()) return true;
//            }
//            return false;
//        }
//
//        private List<Point2D> squareVertices(double cx, double cy, double side) {
//            double h = side / 2;
//            return List.of(
//                    new Point2D.Double(cx - h, cy - h), new Point2D.Double(cx + h, cy - h),
//                    new Point2D.Double(cx + h, cy + h), new Point2D.Double(cx - h, cy + h)
//            );
//        }
//
//        private List<Point2D> triangleVertices(double cx, double cy, double side) {
//            double h = Math.sqrt(3) / 2 * side;
//            return List.of(
//                    new Point2D.Double(cx, cy - 2.0 / 3 * h),
//                    new Point2D.Double(cx - side / 2, cy + h / 3),
//                    new Point2D.Double(cx + side / 2, cy + h / 3)
//            );
//        }
//
//        private List<Point2D> hexagonVertices(double cx, double cy, double side) {
//            List<Point2D> pts = new ArrayList<>();
//            for (int i = 0; i < 6; i++) {
//                double angle = Math.PI / 3 * i;
//                pts.add(new Point2D.Double(cx + side * Math.cos(angle), cy + side * Math.sin(angle)));
//            }
//            return pts;
//        }
//
//        public ArrayList<PlacedShape> getShapeData() {
//            return placedShapes;
//        }
//
//        private final JPopupMenu popupMenu = new JPopupMenu();
//        private PlacedShape selectedShape = null;
//
//        {
//            JMenuItem randomColorItem = new JMenuItem("Randomize Color");
//            randomColorItem.addActionListener(e -> {
//                if (selectedShape != null) {
//                    selectedShape.color = new Color(rand.nextInt(200), rand.nextInt(200), rand.nextInt(200));
//                    repaint();
//                }
//            });
//
//            JMenu colorMenu = new JMenu("Set Color");
//            Color[] colorValues = {Color.RED, Color.GREEN, Color.BLUE, Color.ORANGE, Color.MAGENTA, Color.CYAN};
//            String[] names = {"Red", "Green", "Blue", "Orange", "Magenta", "Cyan"};
//            for (int i = 0; i < names.length; i++) {
//                JMenuItem item = new JMenuItem(names[i]);
//                Color c = colorValues[i];
//                item.addActionListener(e -> {
//                    if (selectedShape != null) {
//                        selectedShape.color = c;
//                        repaint();
//                    }
//                });
//                colorMenu.add(item);
//            }
//
//            JMenuItem rotateItem = new JMenuItem("Rotate Shape");
//            rotateItem.addActionListener(e -> {
//                if (selectedShape != null && !selectedShape.rotating) {
//                    String input = JOptionPane.showInputDialog("Enter duration (sec) for full rotation:");
//                    try {
//                        double sec = Double.parseDouble(input);
//                        selectedShape.rotating = true;
//                        selectedShape.rotationDuration = sec;
//                        selectedShape.updateTransformedShape();
//                    } catch (Exception ignored) {}
//                }
//            });
//
//            JMenuItem moveItem = new JMenuItem("Translate Shape");
//            moveItem.addActionListener(e -> {
//                if (selectedShape != null && !selectedShape.translating) {
//                    String inputX = JOptionPane.showInputDialog("Enter new grid X:");
//                    String inputY = JOptionPane.showInputDialog("Enter new grid Y:");
//                    String duration = JOptionPane.showInputDialog("Enter duration (sec) for movement:");
//                    try {
//                        int gx = Integer.parseInt(inputX);
//                        int gy = Integer.parseInt(inputY);
//                        double sec = Double.parseDouble(duration);
//                        double tx = gx * gridSize;
//                        double ty = gy * gridSize;
//                        Area movementTest = new Area(selectedShape.hitArea);
//                        AffineTransform move = AffineTransform.getTranslateInstance(tx - selectedShape.gridX * gridSize, ty - selectedShape.gridY * gridSize);
//                        movementTest.transform(move);
//                        if (!intersectsExisting(movementTest)) {
//                            selectedShape.translationStartX = selectedShape.gridX * gridSize;
//                            selectedShape.translationStartY = selectedShape.gridY * gridSize;
//                            selectedShape.targetX = tx;
//                            selectedShape.targetY = ty;
//                            selectedShape.translationDuration = sec;
//                            selectedShape.hasTranslation = true;
//                            selectedShape.translating = true;
//                        } else {
//                            JOptionPane.showMessageDialog(null, "Can't move shape — would collide.");
//                        }
//                    } catch (Exception ignored) {}
//                }
//            });
//
//            JMenuItem deleteItem = new JMenuItem("Delete Shape");
//            deleteItem.addActionListener(e -> {
//                placedShapes.remove(selectedShape);
//                selectedShape = null;
//                repaint();
//            });
//
//            popupMenu.add(randomColorItem);
//            popupMenu.add(colorMenu);
//            popupMenu.add(rotateItem);
//            popupMenu.add(moveItem);
//            popupMenu.addSeparator();
//            popupMenu.add(deleteItem);
//        }
//
//        private PlacedShape getShapeAtPoint(Point p) {
//            for (PlacedShape s : placedShapes) {
//                Shape shape = s.getTransformedShape();
//                if (shape.contains(p)) return s;
//            }
//            return null;
//        }
//
//        @Override
//        protected void paintComponent(Graphics g) {
//            super.paintComponent(g);
//            Graphics2D g2 = (Graphics2D) g;
//            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//
//            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.2f));
//            g2.setColor(Color.GRAY);
//            for (int x = 0; x < getWidth(); x += gridSize)
//                g2.drawLine(x, 0, x, getHeight());
//            for (int y = 0; y < getHeight(); y += gridSize)
//                g2.drawLine(0, y, getWidth(), y);
//            g2.setComposite(AlphaComposite.SrcOver);
//
//            g2.setColor(Color.DARK_GRAY);
//            for (int x = 0; x < getWidth(); x += gridSize)
//                g2.drawString(String.valueOf(x / gridSize), x + 2, 12);
//            for (int y = 0; y < getHeight(); y += gridSize)
//                g2.drawString(String.valueOf(y / gridSize), 2, y - 2);
//
//            for (PlacedShape s : placedShapes) {
//                g2.setColor(s.color);
//                g2.draw(s.getTransformedShape());
//            }
//        }
//    }
//
//    static class PlacedShape {
//        String type;
//        int gridX, gridY;
//        double side;
//        Color color;
//        List<Point2D> originalPoints;
//        Path2D hitArea;
//        boolean rotating = false;
//        double rotationDuration = 0;
//        double currentAngle = 0;
//        boolean translating = false;
//        boolean hasTranslation = false;
//        double translationDuration = 0;
//        double translationStartX = 0, translationStartY = 0;
//        double targetX = 0, targetY = 0;
//        double translationProgressX = 0, translationProgressY = 0;
//        Shape transformedShape;
//
//        PlacedShape(String type, int gridX, int gridY, double side, List<Point2D> points, Color color) {
//            this.type = type;
//            this.gridX = gridX;
//            this.gridY = gridY;
//            this.side = side;
//            this.color = color;
//            this.originalPoints = points;
//            this.hitArea = toPath(points);
//            this.updateTransformedShape();
//        }
//
//        void updateTransformedShape() {
//            updateTransformedShape(gridX * 50 + translationProgressX, gridY * 50 + translationProgressY);
//        }
//
//        void updateTransformedShape(double centerX, double centerY) {
//            AffineTransform transform = new AffineTransform();
//            transform.translate(centerX - gridX * 50, centerY - gridY * 50);
//            transform.rotate(Math.toRadians(currentAngle), gridX * 50, gridY * 50);
//            this.transformedShape = transform.createTransformedShape(hitArea);
//        }
//
//        Shape getTransformedShape() {
//            return transformedShape;
//        }
//
//        private Path2D toPath(List<Point2D> points) {
//            Path2D path = new Path2D.Double();
//            path.moveTo(points.get(0).getX(), points.get(0).getY());
//            for (int i = 1; i < points.size(); i++) {
//                path.lineTo(points.get(i).getX(), points.get(i).getY());
//            }
//            path.closePath();
//            return path;
//        }
//    }
//
//    static class ReportGenerator {
//        public static void generate(ArrayList<PlacedShape> shapes) {
//            System.out.println("=== Shape Placement Report ===");
//            for (PlacedShape s : shapes) {
//                double area = switch (s.type) {
//                    case "Square" -> s.side * s.side;
//                    case "Triangle" -> (Math.sqrt(3) / 4) * s.side * s.side;
//                    case "Hexagon" -> (3 * Math.sqrt(3) / 2) * s.side * s.side;
//                    default -> 0;
//                };
//                System.out.printf("Type: %s | Grid Position: (%d, %d) | Area: %.2f", s.type, s.gridX, s.gridY, area);
//                if (s.rotating) {
//                    System.out.printf(" | Rotates every %.2f seconds", s.rotationDuration);
//                }
//                if (s.hasTranslation) {
//                    System.out.printf(" | Moves to (%.0f, %.0f) in %.2f seconds", s.targetX / 50, s.targetY / 50, s.translationDuration);
//                }
//                System.out.println();
//            }
//            System.out.println("=== End of Report ===");
//        }
//    }
//}
