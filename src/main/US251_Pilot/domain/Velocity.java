package domain;

import java.util.List;

public class Velocity {
    //attributes
    private double vX;
    private double vY;
    private double vZ;

    //constructors
    public Velocity(Double vx, Double vy, Double vz) {
        this.vX = vx;
        this.vY = vy;
        this.vZ = vz;
    }

    public Velocity(List<String> vector) {
        if (vector.size() != 3) { return; }
        this.vX = Double.parseDouble(vector.get(0));
        this.vY = Double.parseDouble(vector.get(1));
        this.vZ = Double.parseDouble(vector.get(2));
    }

    public Velocity(Position origin, Position destination, Double interval) {
        if (origin.equals(destination)) {
            this.vX = 0.0;
            this.vY = 0.0;
            this.vZ = 0.0;
        } else {
            this.vX = (destination.getX() - origin.getX()) / interval;
            this.vY = (destination.getY() - origin.getY()) / interval;
            this.vZ = (destination.getZ() - origin.getZ()) / interval;
        }
    }

    //getters
    public Double getX() { return this.vX; }

    public Double getY() { return this.vY; }

    public Double getZ() { return this.vZ; }

    //methods
    public static Double calculateVelocity(Velocity vel) {
        return Math.round(Math.sqrt(vel.getX() * vel.getX() + vel.getY() * vel.getY() + vel.getZ() * vel.getZ()) * 100.0) / 100.0;
    }

    public static String printAbsolute(Position origin, Position destination, Double interval) {
        return Velocity.calculateVelocity(new Velocity(origin, destination, interval)) + "m/s";
    }

    @Override
    public String toString() {
        return "vX=" + this.vX + ", vY=" + this.vY + ", vZ=" + this.vZ;
    }

    public String toTuple() { return "(" + this.vX + ", " + this.vY + ", " + this.vZ + ")"; }


}
