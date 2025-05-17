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
    private Integer size;
    private List<Integer> sizes;

    //constructors
    // For single size:
    public Shape(ShapeType type, String customID, Position originalPosition, int droneAmount, int size) {
        // if (droneAmount < type.getMinDrone()) { return;}
        this.type = type;
        this.customID = customID;
        this.originalPosition = originalPosition;
        this.droneAmount = droneAmount;
        this.size = size;
        this.sizes = null;
        this.animations = new ArrayList<>();
    }

    // For multiple sizes:
    public Shape(ShapeType type, String customID, Position originalPosition, int droneAmount, List<Integer> sizes) {
        // if (droneAmount < type.getMinDrone()) { return;}
        this.type = type;
        this.customID = customID;
        this.originalPosition = originalPosition;
        this.droneAmount = droneAmount;
        this.size = null;
        this.sizes = sizes;
        this.animations = new ArrayList<>();
    }

    //getters
    public ShapeType getType() { return this.type; }

    public String getCustomID() { return this.customID; }

    public Position getOriginalPosition() { return this.originalPosition; }

    public int getDroneAmount() { return this.droneAmount; }

    public List<Integer> getSizes() {
        return sizes;
    }

    public Integer getSize() {
        return size;
    }

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
        if (size != null) {
            System.out.println("SIZE: " + size);
        } else if (sizes != null && !sizes.isEmpty()) {
            System.out.println("SIZES: " + sizes);
        }
        System.out.println("COORDINATES: " + this.originalPosition.toString());
        System.out.println("DRONES: " + this.droneAmount);
        if (!this.animations.isEmpty()) {
            for (Animation animation : this.animations) {
                System.out.println(animation.toString());
                if (animation instanceof Move) {
                    System.out.println(Velocity.printAbsolute(
                            this.originalPosition, ((Move) animation).getDestination(), ((Move) animation).getTime()));
                }
            }
        } else {
            System.out.println("No animations assigned to this shape.");
        }
        System.out.println("\n");
    }
}
