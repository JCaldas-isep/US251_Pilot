import shapes.*;

import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Shape2D> shapes = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to the 2D Drone Figure Simulator (no animation mode)");

        boolean running = true;
        while (running) {
            Shape2D shape = promptShape();
            if (shape == null) continue;

            boolean collides = false;
            for (Shape2D existing : shapes) {
                if (shape.collidesWith(existing)) {
                    collides = true;
                    break;
                }
            }

            if (collides) {
                System.out.println("❌ Error: Shape collides with existing shape. Try different coordinates or size.");
                continue;
            }

            shapes.add(shape);
            System.out.println("✅ Shape added successfully. Add another? (y/n)");
            String again = scanner.nextLine();
            running = again.equalsIgnoreCase("y");
        }

        System.out.println("\n=== FINAL REPORT ===");
        for (Shape2D shape : shapes) {
            System.out.println(shape.toReportString());
        }
    }

    private static Shape2D promptShape() {
        System.out.println("Choose a shape:\n1. Square\n2. Triangle\n3. Hexagon");
        int choice = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter center X: ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter center Y: ");
        int y = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter number of drones: ");
        int drones = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter desired side length (in meters): ");
        double sideLength = Double.parseDouble(scanner.nextLine());

        Point center = new Point(x, y);

        return switch (choice) {
            case 1 -> new Square(center, drones, sideLength);
            case 2 -> new Triangle(center, drones, sideLength);
            case 3 -> new Hexagon(center, drones, sideLength);
            default -> {
                System.out.println("Invalid choice.");
                yield null;
            }
        };
    }
}
