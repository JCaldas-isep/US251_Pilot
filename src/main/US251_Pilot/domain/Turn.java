package domain;

public class Turn implements Animation {
    private final String colour;
    private final double time;

    public Turn(String colour, double time) {
        this.colour = colour;
        this.time = time;
    }

    public String getColour() { return this.colour; }

    public Double getTime() { return this.time; }

    public String getType() {
        return "TURN";
    }

    @Override
    public String toString() {
        return "Turns " + this.colour + " for " + this.time + " seconds.";
    }
}

