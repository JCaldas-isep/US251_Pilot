import java.util.HashSet;
import java.util.Set;

public class Shape {
    //attributes
    private ShapeType type;
    private String customID;
    private Position originalPosition;

    //constructors
    public Shape(ShapeType type, String customID, Position originalPosition) {
        this.type = type;
        this.customID = customID;
        this.originalPosition = originalPosition;
    }

    //getters
    public ShapeType getType() { return type; }
    public String getCustomID() { return customID; }
    public Position getOriginalPosition() { return originalPosition; }

    //methods
    public void printShape() {
        System.out.println("SHAPE TYPE: " + this.type.getLexerIdentifier());
        System.out.println("ID: " + this.customID);
        System.out.println("COORDINATES: " + this.originalPosition.toString() + "\n");
    }
}
