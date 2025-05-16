package domain;

public class Move implements Animation {
    private final Position destination;
    private final double time;

    public Move(Position destination, double time) {
        this.destination = destination;
        this.time = time;
    }

    public Position getDestination() { return this.destination; }

    public double getTime() { return this.time; }

    public String getType() {
        return "MOVE";
    }

    @Override
    public String toString() {
        return "Moves to " + this.destination + " taking " + this.time + " seconds.";
    }

}
