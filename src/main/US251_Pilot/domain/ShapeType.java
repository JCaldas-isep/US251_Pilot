package domain;

public enum ShapeType {
    SQUARE("SQUARE", 4),
    TRIANGLE("TRIANGLE", 3),
    HEXAGON("HEXAGON", 6),
    CIRCLE("CIRCLE", 1),
    RECTANGLE("RECTANGLE", 4),
    LINE("LINE", 2);

    //attributes
    private String lexerIdentifier;
    private int minDrone;

    //constructors
    private ShapeType(String lexer, int minDrone) {
        this.lexerIdentifier = lexer;
        this.minDrone = minDrone;
    }

    //getters
    public String getLexerIdentifier() { return this.lexerIdentifier; }

    public int getMinDrone() { return this.minDrone; }

    //methods
    public static ShapeType fromLexerIdentifier(String lexerIdentifier) {
        for (ShapeType shapeType : ShapeType.values()) {
            if (shapeType.lexerIdentifier.equals(lexerIdentifier)) {
                return shapeType;
            }
        }
        return null;
    }
}
