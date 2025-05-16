package domain;

public class Pause implements Animation {
    private final double time;

    public Pause(Double time) {
        this.time = time;
    }

    public String getType() {
        return "PAUSE";
    }

    @Override
    public String toString() {
        return "Pauses for " + this.time + " seconds.";
    }
}
