//import shapes.*;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class ShapeCollisionTest {
//
//    @Test
//    public void testSquareTriangleNoCollision() {
//        Shape2D square = new Square(new Point(0, 0), 8);
//        Shape2D triangle = new Triangle(new Point(20, 20), 6);
//
//        assertFalse(square.collidesWith(triangle));
//    }
//
//    @Test
//    public void testSquareTriangleCollision() {
//        Shape2D square = new Square(new Point(0, 0), 8);
//        Shape2D triangle = new Triangle(new Point(1, 1), 6);
//
//        assertTrue(square.collidesWith(triangle));
//    }
//
//    @Test
//    public void testHexagonCollision() {
//        Shape2D h1 = new Hexagon(new Point(0, 0), 12);
//        Shape2D h2 = new Hexagon(new Point(2, 0), 12); // Close enough to overlap
//
//        assertTrue(h1.collidesWith(h2));
//    }
//
//    @Test
//    public void testHexagonNoCollision() {
//        Shape2D h1 = new Hexagon(new Point(0, 0), 12);
//        Shape2D h2 = new Hexagon(new Point(50, 50), 12);
//
//        assertFalse(h1.collidesWith(h2));
//    }
//}
