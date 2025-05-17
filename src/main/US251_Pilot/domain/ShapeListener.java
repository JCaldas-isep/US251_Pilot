package domain;

import antlr.grammar.ShapeGrammarBaseListener;
import antlr.grammar.ShapeGrammarParser;

import java.util.*;
import java.util.stream.Collectors;

public class ShapeListener extends ShapeGrammarBaseListener {
    private String currentType;
    private String currentId;
    private List<String> currentCoords = new ArrayList<>();
    private int droneAmount;
    private Integer sizeValue = null;
    private List<Integer> sizeValues = null;  // for rectangles with two sizes

    public Map<String, Shape> shapeStack = new HashMap<>();

    public Map<String, Shape> getResult() { return this.shapeStack; }

    @Override
    public void enterShapeWithSingleSize(ShapeGrammarParser.ShapeWithSingleSizeContext ctx) {
        this.currentType = ctx.shapeTypeSingleSize().getText();
        this.currentId = ctx.ID().getText();
        this.currentCoords.clear();
        this.sizeValue = Integer.parseInt(ctx.sizeValue().SIGNED_NUMBER().getText());
        this.sizeValues = null;  // clear multi sizes
        this.droneAmount = Integer.parseInt(ctx.droneAmount().getText());
        // coords will be collected in enterCoordinate
    }

    @Override
    public void enterRectangleShape(ShapeGrammarParser.RectangleShapeContext ctx) {
        this.currentType = "RECTANGLE";
        this.currentId = ctx.ID().getText();
        this.currentCoords.clear();

        // Get sizes (two values)
        this.sizeValues = new ArrayList<>();
        this.sizeValues.add(Integer.parseInt(ctx.sizeValue(0).SIGNED_NUMBER().getText()));
        this.sizeValues.add(Integer.parseInt(ctx.sizeValue(1).SIGNED_NUMBER().getText()));

        this.sizeValue = null; // clear single size
        this.droneAmount = Integer.parseInt(ctx.droneAmount().getText());
        // coords will be collected in enterCoordinate
    }

    @Override
    public void enterCoordinate(ShapeGrammarParser.CoordinateContext ctx) {
        this.currentCoords.add(ctx.getText());
    }

    @Override
    public void exitShapeDefinition(ShapeGrammarParser.ShapeDefinitionContext ctx) {
        Position position = new Position(this.currentCoords);

        ShapeType shapeType = ShapeType.fromLexerIdentifier(this.currentType);

        Shape shape;
        if (sizeValue != null) {
            shape = new Shape(shapeType, currentId, position, droneAmount, sizeValue);
        } else if (sizeValues != null) {
            shape = new Shape(shapeType, currentId, position, droneAmount, sizeValues);
        } else {
            // fallback: size info missing, construct without size (optional)
            shape = new Shape(shapeType, currentId, position, droneAmount, 0);
        }

        this.shapeStack.put(this.currentId, shape);
    }

    // The rest remains the same for animations...

    @Override
    public void exitMoveAnimation(ShapeGrammarParser.MoveAnimationContext ctx) {
        String id = ctx.ID().getText();
        List<String> coords = ctx.coordinateList().coordinate().stream().map(x -> x.getText()).collect(Collectors.toList());
        Position destination = new Position(coords);
        double time = Double.parseDouble(ctx.time().SIGNED_NUMBER().getText());

        Move move = new Move(destination, time);
        Shape target = this.shapeStack.get(id);
        if (target != null) { target.addAnimation(move); }
    }

    @Override
    public void exitRotateAnimation(ShapeGrammarParser.RotateAnimationContext ctx) {
        String id = ctx.ID().getText();
        int angle = Integer.parseInt(ctx.angle().SIGNED_NUMBER().getText());
        String axis = ctx.axis().getText();
        double time = Double.parseDouble(ctx.time().SIGNED_NUMBER().getText());

        Rotate rotate = new Rotate(angle, axis, time);
        Shape target = this.shapeStack.get(id);
        if (target != null) { target.addAnimation(rotate); }
    }

    @Override
    public void exitTurnAnimation(ShapeGrammarParser.TurnAnimationContext ctx) {
        String id = ctx.ID().getText();
        String colour = ctx.colour().getText();
        Double time = Double.parseDouble(ctx.time().SIGNED_NUMBER().getText());

        Turn turn = new Turn(colour, time);
        Shape target = this.shapeStack.get(id);
        if (target != null) { target.addAnimation(turn); }
    }

    @Override
    public void exitPauseAnimation(ShapeGrammarParser.PauseAnimationContext ctx) {
        String id = ctx.ID().getText();
        double time = Double.parseDouble(ctx.time().SIGNED_NUMBER().getText());

        Pause pause = new Pause(time);
        Shape target = this.shapeStack.get(id);
        if (target != null) { target.addAnimation(pause); }
    }
}
