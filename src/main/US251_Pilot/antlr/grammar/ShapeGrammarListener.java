// Generated from ./ShapeGrammar.g4 by ANTLR 4.13.2

package antlr.grammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ShapeGrammarParser}.
 */
public interface ShapeGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ShapeGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ShapeGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ShapeGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeGrammarParser#shapeBlock}.
	 * @param ctx the parse tree
	 */
	void enterShapeBlock(ShapeGrammarParser.ShapeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeGrammarParser#shapeBlock}.
	 * @param ctx the parse tree
	 */
	void exitShapeBlock(ShapeGrammarParser.ShapeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeGrammarParser#shapeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterShapeDefinition(ShapeGrammarParser.ShapeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeGrammarParser#shapeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitShapeDefinition(ShapeGrammarParser.ShapeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeGrammarParser#coordinateList}.
	 * @param ctx the parse tree
	 */
	void enterCoordinateList(ShapeGrammarParser.CoordinateListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeGrammarParser#coordinateList}.
	 * @param ctx the parse tree
	 */
	void exitCoordinateList(ShapeGrammarParser.CoordinateListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeGrammarParser#animation}.
	 * @param ctx the parse tree
	 */
	void enterAnimation(ShapeGrammarParser.AnimationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeGrammarParser#animation}.
	 * @param ctx the parse tree
	 */
	void exitAnimation(ShapeGrammarParser.AnimationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeGrammarParser#moveAnimation}.
	 * @param ctx the parse tree
	 */
	void enterMoveAnimation(ShapeGrammarParser.MoveAnimationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeGrammarParser#moveAnimation}.
	 * @param ctx the parse tree
	 */
	void exitMoveAnimation(ShapeGrammarParser.MoveAnimationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeGrammarParser#rotateAnimation}.
	 * @param ctx the parse tree
	 */
	void enterRotateAnimation(ShapeGrammarParser.RotateAnimationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeGrammarParser#rotateAnimation}.
	 * @param ctx the parse tree
	 */
	void exitRotateAnimation(ShapeGrammarParser.RotateAnimationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeGrammarParser#turnAnimation}.
	 * @param ctx the parse tree
	 */
	void enterTurnAnimation(ShapeGrammarParser.TurnAnimationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeGrammarParser#turnAnimation}.
	 * @param ctx the parse tree
	 */
	void exitTurnAnimation(ShapeGrammarParser.TurnAnimationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeGrammarParser#pauseAnimation}.
	 * @param ctx the parse tree
	 */
	void enterPauseAnimation(ShapeGrammarParser.PauseAnimationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeGrammarParser#pauseAnimation}.
	 * @param ctx the parse tree
	 */
	void exitPauseAnimation(ShapeGrammarParser.PauseAnimationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeGrammarParser#shapeType}.
	 * @param ctx the parse tree
	 */
	void enterShapeType(ShapeGrammarParser.ShapeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeGrammarParser#shapeType}.
	 * @param ctx the parse tree
	 */
	void exitShapeType(ShapeGrammarParser.ShapeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeGrammarParser#coordinate}.
	 * @param ctx the parse tree
	 */
	void enterCoordinate(ShapeGrammarParser.CoordinateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeGrammarParser#coordinate}.
	 * @param ctx the parse tree
	 */
	void exitCoordinate(ShapeGrammarParser.CoordinateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeGrammarParser#droneAmount}.
	 * @param ctx the parse tree
	 */
	void enterDroneAmount(ShapeGrammarParser.DroneAmountContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeGrammarParser#droneAmount}.
	 * @param ctx the parse tree
	 */
	void exitDroneAmount(ShapeGrammarParser.DroneAmountContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeGrammarParser#angle}.
	 * @param ctx the parse tree
	 */
	void enterAngle(ShapeGrammarParser.AngleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeGrammarParser#angle}.
	 * @param ctx the parse tree
	 */
	void exitAngle(ShapeGrammarParser.AngleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeGrammarParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(ShapeGrammarParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeGrammarParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(ShapeGrammarParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeGrammarParser#axis}.
	 * @param ctx the parse tree
	 */
	void enterAxis(ShapeGrammarParser.AxisContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeGrammarParser#axis}.
	 * @param ctx the parse tree
	 */
	void exitAxis(ShapeGrammarParser.AxisContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeGrammarParser#colour}.
	 * @param ctx the parse tree
	 */
	void enterColour(ShapeGrammarParser.ColourContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeGrammarParser#colour}.
	 * @param ctx the parse tree
	 */
	void exitColour(ShapeGrammarParser.ColourContext ctx);
}