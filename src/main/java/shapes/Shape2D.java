package shapes;

import java.util.List;
import java.awt.Rectangle;

public interface Shape2D {
    void setCenter(Point center);
    Point getCenter();
    double getArea();
    List<Point> getOccupiedPoints(); // includes vertex + edge drones
    boolean collidesWith(Shape2D other);
    String toReportString();
    Shape2D clone();
}

