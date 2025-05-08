package shapes;

import java.util.*;

public class Triangle implements Shape2D {
    private Point center;
    private int droneCount;
    private double sideLength;

    private static final int MIN_DRONES = 3;

    public Triangle(Point center, int droneCount, double sideLength) {
        if (droneCount < MIN_DRONES) {
            throw new IllegalArgumentException("Triangle needs at least 3 drones.");
        }
        this.center = center;
        this.droneCount = droneCount;
        this.sideLength = sideLength;
    }

    @Override
    public Point getCenter() { return center; }

    @Override
    public void setCenter(Point center) { this.center = center; }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * sideLength * sideLength;
    }

    private List<Point> getVertices() {
        List<Point> vertices = new ArrayList<>();
        double radius = sideLength / Math.sqrt(3); // circumradius of equilateral triangle
        for (int i = 0; i < 3; i++) {
            double angle = Math.toRadians(120 * i - 90);
            int x = center.x + (int) Math.round(radius * Math.cos(angle));
            int y = center.y + (int) Math.round(radius * Math.sin(angle));
            vertices.add(new Point(x, y));
        }
        return vertices;
    }

    @Override
    public List<Point> getOccupiedPoints() {
        List<Point> occupied = new ArrayList<>(getVertices());
        List<Point> vertices = getVertices();
        int edges = vertices.size();

        int remaining = droneCount - edges;
        int perEdge = remaining / edges;
        int extra = remaining % edges;

        for (int i = 0; i < edges; i++) {
            Point a = vertices.get(i);
            Point b = vertices.get((i + 1) % edges);
            int count = perEdge + (i < extra ? 1 : 0);
            occupied.addAll(distributeDronesAlongEdge(a, b, count));
        }

        return occupied;
    }

    private List<Point> distributeDronesAlongEdge(Point a, Point b, int count) {
        List<Point> result = new ArrayList<>();
        double dx = (b.x - a.x) / (double)(count + 1);
        double dy = (b.y - a.y) / (double)(count + 1);
        for (int i = 1; i <= count; i++) {
            int x = (int) Math.round(a.x + dx * i);
            int y = (int) Math.round(a.y + dy * i);
            result.add(new Point(x, y));
        }
        return result;
    }

    @Override
    public boolean collidesWith(Shape2D other) {
        Set<Point> points = new HashSet<>(getOccupiedPoints());
        for (Point p : other.getOccupiedPoints()) {
            if (points.contains(p)) return true;
        }
        return false;
    }

    @Override
    public String toReportString() {
        return "Triangle centered at " + center + " with side " + sideLength + "m and " + droneCount + " drones.";
    }

    @Override
    public Shape2D clone() {
        return new Triangle(new Point(center.x, center.y), droneCount, sideLength);
    }
}
