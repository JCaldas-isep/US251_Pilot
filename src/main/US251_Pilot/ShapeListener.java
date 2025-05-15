import java.util.*;

public class ShapeListener extends ShapeGrammarBaseListener {
    private String currentType;
    private String currentId;
    private List<String> currentCoords = new ArrayList<>();

    private final Set<Shape> shapeStack = new HashSet<>();

    public Set<Shape> getResult() { return shapeStack; }

    @Override
    public void enterShapeType(ShapeGrammarParser.ShapeTypeContext ctx) {
        this.currentType = ctx.getText();
    }

    @Override
    public void enterShapeDefinition(ShapeGrammarParser.ShapeDefinitionContext ctx) {
        this.currentId = ctx.ID().getText();
        this.currentCoords.clear();
    }

    @Override
    public void enterCoordinate(ShapeGrammarParser.CoordinateContext ctx) {
        this.currentCoords.add(ctx.getText());
    }

    @Override
    public void exitShapeDefinition(ShapeGrammarParser.ShapeDefinitionContext ctx) {
        // System.out.println("SHAPE TYPE: " + this.currentType);
        // System.out.println("ID: " + this.currentId);
        // System.out.println("COORDINATES: " + String.join(", ", this.currentCoords));
        System.out.println();
        this.shapeStack.add(new Shape(ShapeType.fromLexerIdentifier(this.currentType),
                            this.currentId,
                            new Position(this.currentCoords)));
    }
}
