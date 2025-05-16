package domain;

public class Rotate implements Animation {
    private final int angle;
    private final String axis;
    private final double time;

    public Rotate(int angle, String axis, double time) {
        this.angle = angle;
        this.axis = axis;
        this.time = time;
    }

    public int getAngle() { return this.angle; }

    public String getAxis( ) { return this.axis; }

    public double getTime() { return this.time; }

    public String getType() {
        return "ROTATE";
    }

    @Override
    public String toString() {
        return "Rotates " + this.angle + "º on the " + this.axis.toUpperCase() + " axis taking " + this.time + " seconds.";
    }
}

