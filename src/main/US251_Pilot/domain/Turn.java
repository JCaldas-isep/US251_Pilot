package domain;

public class Turn implements Animation {
    private final String colour;

    public Turn(String colour) {
        this.colour = colour;
    }

    public String getColour() { return this.colour; }

    public String getType() {
        return "TURN";
    }

    @Override
    public String toString() {
        return "Turns " + this.colour + ".";
    }
}

