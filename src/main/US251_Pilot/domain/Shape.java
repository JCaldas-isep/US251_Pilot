package domain;

import java.util.ArrayList;
import java.util.List;

public class Shape {
    //attributes
    private ShapeType type;
    private String customID;
    private Position originalPosition;
    private int droneAmount;
    private final List<Animation> animations;

    //constructors
    public Shape(ShapeType type, String customID, Position originalPosition, int droneAmount) {
        // if (droneAmount < type.getMinDrone()) { return;}
        this.type = type;
        this.customID = customID;
        this.originalPosition = originalPosition;
        this.droneAmount = droneAmount;
        this.animations = new ArrayList<>();
    }

    //getters
    public ShapeType getType() { return this.type; }

    public String getCustomID() { return this.customID; }

    public Position getOriginalPosition() { return this.originalPosition; }

    public int getDroneAmount() { return this.droneAmount; }

    public List<Animation> getAnimations() {
        return this.animations;
    }

    //methods
    public void addAnimation(Animation animation) {
        this.animations.add(animation);
    }

    public void printShape() {
        System.out.println("SHAPE TYPE: " + this.type.getLexerIdentifier());
        System.out.println("ID: " + this.customID);
        System.out.println("COORDINATES: " + this.originalPosition.toString());
        System.out.println("DRONES: " + this.droneAmount);
        if (!this.animations.isEmpty()) {
            for (Animation animation : this.animations) {
                System.out.println(animation.toString());
            }
        } else {
            System.out.println("No animations assigned to this shape.");
        }
        System.out.println("\n");
    }
}
