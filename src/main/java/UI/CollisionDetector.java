package UI;

import shapes.*;

import java.util.ArrayList;

public class CollisionDetector {
    public static boolean collidesWithAny(Shape2D newShape, ArrayList<Shape2D> existingShapes) {
        for (Shape2D existing : existingShapes) {
            if (newShape.collidesWith(existing)) return true;
        }
        return false;
    }
}
