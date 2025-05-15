import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.ArrayList;

public class InteractiveShapePlacer extends JFrame {
    private final DrawingPanel drawingPanel;
    private final JComboBox<String> shapeSelector;
    private final JTextField sideField;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(InteractiveShapePlacer::new);
    }

    public InteractiveShapePlacer() {
        super("Interactive Shape Placer");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 700);
        setLayout(new BorderLayout());

        // Top Control Panel
        JPanel controlPanel = new JPanel();
        shapeSelector = new JComboBox<>(new String[]{"Square", "Triangle", "Hexagon"});
        sideField = new JTextField("50", 5);
        controlPanel.add(new JLabel("Shape:"));
        controlPanel.add(shapeSelector);
        controlPanel.add(new JLabel("Side Length:"));
        controlPanel.add(sideField);

        add(controlPanel, BorderLayout.NORTH);

        // Drawing Panel
        drawingPanel = new DrawingPanel();
        add(drawingPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    class DrawingPanel extends JPanel {
        private final ArrayList<Shape> shapes = new ArrayList<>();

        public DrawingPanel() {
            setBackground(Color.WHITE);

            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    String shapeType = (String) shapeSelector.getSelectedItem();
                    double side;
                    try {
                        side = Double.parseDouble(sideField.getText());
                        if (side <= 0) throw new NumberFormatException();
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Please enter a positive number for side length.");
                        return;
                    }

                    double x = e.getX();
                    double y = e.getY();

                    Shape shape = switch (shapeType) {
                        case "Square" -> createSquare(x, y, side);
                        case "Triangle" -> createTriangle(x, y, side);
                        case "Hexagon" -> createHexagon(x, y, side);
                        default -> null;
                    };

                    if (shape != null && !intersectsExisting(shape)) {
                        shapes.add(shape);
                        repaint();
                    } else if (shape != null) {
                        JOptionPane.showMessageDialog(null, "Cannot place shape here – overlaps with another.");
                    }
                }
            });
        }

        private boolean intersectsExisting(Shape newShape) {
            for (Shape s : shapes) {
                Area area = new Area(s);
                area.intersect(new Area(newShape));
                if (!area.isEmpty()) return true;
            }
            return false;
        }

        private Shape createSquare(double cx, double cy, double side) {
            double half = side / 2;
            return new Rectangle2D.Double(cx - half, cy - half, side, side);
        }

        private Shape createTriangle(double cx, double cy, double side) {
            double height = Math.sqrt(3) / 2 * side;
            Polygon p = new Polygon();
            p.addPoint((int) cx, (int) (cy - 2.0 / 3 * height));
            p.addPoint((int) (cx - side / 2), (int) (cy + height / 3));
            p.addPoint((int) (cx + side / 2), (int) (cy + height / 3));
            return p;
        }

        private Shape createHexagon(double cx, double cy, double side) {
            Polygon p = new Polygon();
            for (int i = 0; i < 6; i++) {
                double angle = Math.PI / 3 * i - Math.PI / 6;
                int x = (int) (cx + side * Math.cos(angle));
                int y = (int) (cy + side * Math.sin(angle));
                p.addPoint(x, y);
            }
            return p;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;

            for (Shape s : shapes) {
                g2.setColor(Color.CYAN);
                g2.fill(s);
                g2.setColor(Color.BLACK);
                g2.draw(s);
            }
        }
    }
}
