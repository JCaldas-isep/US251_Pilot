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

    public Map<String, Shape> shapeStack = new HashMap<>();

    public Map<String, Shape> getResult() { return this.shapeStack; }

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
    public void enterDroneAmount(ShapeGrammarParser.DroneAmountContext ctx) {
        this.droneAmount = Integer.parseInt(ctx.getText());
    }

    @Override
    public void exitShapeDefinition(ShapeGrammarParser.ShapeDefinitionContext ctx) {
        System.out.println();
        this.shapeStack.put(this.currentId, new Shape(ShapeType.fromLexerIdentifier(this.currentType),
                                                    this.currentId,
                                                    new Position(this.currentCoords),
                                                    this.droneAmount));
    }

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
