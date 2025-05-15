import java.util.List;

public class Position {
    //attributes
    private int X;
    private int Y;
    private int Z;

    //constructors
    public Position(int x, int y, int z) {
        this.X = x;
        this.Y = y;
        this.Z = z;
    }

    public Position(List<String> coords) {
        if (coords.size() != 3) { return; }
        this.X = Integer.parseInt(coords.get(0));
        this.Y = Integer.parseInt(coords.get(1));
        this.Z = Integer.parseInt(coords.get(2));
    }

    //getters
    public int getX() { return this.X; }

    public int getY() { return this.Y; }

    public int getZ() { return this.Z; }

    //methods
    public static void calculateVelocity(Position destiny, Double time) throws NoSuchMethodException {
        throw new NoSuchMethodException("Not implemented Yet");
    }

    @Override
    public String toString() {
        return "X=" + this.X + ", Y=" + this.Y + ", Z=" + this.Z;
    }
}
