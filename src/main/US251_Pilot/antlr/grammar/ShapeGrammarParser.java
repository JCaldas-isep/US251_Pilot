// Generated from ./ShapeGrammar.g4 by ANTLR 4.13.2

package antlr.grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ShapeGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, ID=28, SIGNED_NUMBER=29, DIGIT=30, WS=31, 
		COMMENT=32;
	public static final int
		RULE_program = 0, RULE_shapeBlock = 1, RULE_shapeDefinition = 2, RULE_coordinateList = 3, 
		RULE_animation = 4, RULE_moveAnimation = 5, RULE_rotateAnimation = 6, 
		RULE_turnAnimation = 7, RULE_shapeType = 8, RULE_coordinate = 9, RULE_droneAmount = 10, 
		RULE_angle = 11, RULE_time = 12, RULE_axis = 13, RULE_colour = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "shapeBlock", "shapeDefinition", "coordinateList", "animation", 
			"moveAnimation", "rotateAnimation", "turnAnimation", "shapeType", "coordinate", 
			"droneAmount", "angle", "time", "axis", "colour"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'>'", "'WITH'", "','", "'MOVE'", "'TO'", "'IN'", "'ROTATE'", 
			"'BY'", "'ON'", "'TURN'", "'SQUARE'", "'TRIANGLE'", "'HEXAGON'", "'CIRCLE'", 
			"'\\u00BA'", "'s'", "'x'", "'y'", "'z'", "'RED'", "'GREEN'", "'BLUE'", 
			"'MAGENTA'", "'YELLOW'", "'CYAN'", "'WHITE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "ID", "SIGNED_NUMBER", "DIGIT", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ShapeGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ShapeGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ShapeGrammarParser.EOF, 0); }
		public List<ShapeBlockContext> shapeBlock() {
			return getRuleContexts(ShapeBlockContext.class);
		}
		public ShapeBlockContext shapeBlock(int i) {
			return getRuleContext(ShapeBlockContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				shapeBlock();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 61440L) != 0) );
			setState(35);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShapeBlockContext extends ParserRuleContext {
		public ShapeDefinitionContext shapeDefinition() {
			return getRuleContext(ShapeDefinitionContext.class,0);
		}
		public AnimationContext animation() {
			return getRuleContext(AnimationContext.class,0);
		}
		public ShapeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shapeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).enterShapeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).exitShapeBlock(this);
		}
	}

	public final ShapeBlockContext shapeBlock() throws RecognitionException {
		ShapeBlockContext _localctx = new ShapeBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_shapeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			shapeDefinition();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2336L) != 0)) {
				{
				setState(38);
				animation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShapeDefinitionContext extends ParserRuleContext {
		public ShapeTypeContext shapeType() {
			return getRuleContext(ShapeTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ShapeGrammarParser.ID, 0); }
		public CoordinateListContext coordinateList() {
			return getRuleContext(CoordinateListContext.class,0);
		}
		public DroneAmountContext droneAmount() {
			return getRuleContext(DroneAmountContext.class,0);
		}
		public ShapeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shapeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).enterShapeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).exitShapeDefinition(this);
		}
	}

	public final ShapeDefinitionContext shapeDefinition() throws RecognitionException {
		ShapeDefinitionContext _localctx = new ShapeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_shapeDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			shapeType();
			setState(42);
			match(ID);
			setState(43);
			match(T__0);
			setState(44);
			coordinateList();
			setState(45);
			match(T__1);
			setState(46);
			match(T__2);
			setState(47);
			droneAmount();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CoordinateListContext extends ParserRuleContext {
		public List<CoordinateContext> coordinate() {
			return getRuleContexts(CoordinateContext.class);
		}
		public CoordinateContext coordinate(int i) {
			return getRuleContext(CoordinateContext.class,i);
		}
		public CoordinateListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordinateList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).enterCoordinateList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).exitCoordinateList(this);
		}
	}

	public final CoordinateListContext coordinateList() throws RecognitionException {
		CoordinateListContext _localctx = new CoordinateListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_coordinateList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			coordinate();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(50);
				match(T__3);
				setState(51);
				coordinate();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnimationContext extends ParserRuleContext {
		public MoveAnimationContext moveAnimation() {
			return getRuleContext(MoveAnimationContext.class,0);
		}
		public RotateAnimationContext rotateAnimation() {
			return getRuleContext(RotateAnimationContext.class,0);
		}
		public TurnAnimationContext turnAnimation() {
			return getRuleContext(TurnAnimationContext.class,0);
		}
		public AnimationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_animation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).enterAnimation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).exitAnimation(this);
		}
	}

	public final AnimationContext animation() throws RecognitionException {
		AnimationContext _localctx = new AnimationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_animation);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				moveAnimation();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				rotateAnimation();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				turnAnimation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MoveAnimationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ShapeGrammarParser.ID, 0); }
		public CoordinateListContext coordinateList() {
			return getRuleContext(CoordinateListContext.class,0);
		}
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public MoveAnimationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveAnimation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).enterMoveAnimation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).exitMoveAnimation(this);
		}
	}

	public final MoveAnimationContext moveAnimation() throws RecognitionException {
		MoveAnimationContext _localctx = new MoveAnimationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_moveAnimation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__4);
			setState(63);
			match(ID);
			setState(64);
			match(T__5);
			setState(65);
			match(T__0);
			setState(66);
			coordinateList();
			setState(67);
			match(T__1);
			setState(68);
			match(T__6);
			setState(69);
			time();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RotateAnimationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ShapeGrammarParser.ID, 0); }
		public AngleContext angle() {
			return getRuleContext(AngleContext.class,0);
		}
		public AxisContext axis() {
			return getRuleContext(AxisContext.class,0);
		}
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public RotateAnimationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotateAnimation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).enterRotateAnimation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).exitRotateAnimation(this);
		}
	}

	public final RotateAnimationContext rotateAnimation() throws RecognitionException {
		RotateAnimationContext _localctx = new RotateAnimationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rotateAnimation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__7);
			setState(72);
			match(ID);
			setState(73);
			match(T__8);
			setState(74);
			match(T__0);
			setState(75);
			angle();
			setState(76);
			match(T__1);
			setState(77);
			match(T__9);
			setState(78);
			axis();
			setState(79);
			match(T__6);
			setState(80);
			time();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TurnAnimationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ShapeGrammarParser.ID, 0); }
		public ColourContext colour() {
			return getRuleContext(ColourContext.class,0);
		}
		public TurnAnimationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turnAnimation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).enterTurnAnimation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).exitTurnAnimation(this);
		}
	}

	public final TurnAnimationContext turnAnimation() throws RecognitionException {
		TurnAnimationContext _localctx = new TurnAnimationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_turnAnimation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__10);
			setState(83);
			match(ID);
			setState(84);
			match(T__0);
			setState(85);
			colour();
			setState(86);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShapeTypeContext extends ParserRuleContext {
		public ShapeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shapeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).enterShapeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).exitShapeType(this);
		}
	}

	public final ShapeTypeContext shapeType() throws RecognitionException {
		ShapeTypeContext _localctx = new ShapeTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_shapeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 61440L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CoordinateContext extends ParserRuleContext {
		public TerminalNode SIGNED_NUMBER() { return getToken(ShapeGrammarParser.SIGNED_NUMBER, 0); }
		public CoordinateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordinate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).enterCoordinate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).exitCoordinate(this);
		}
	}

	public final CoordinateContext coordinate() throws RecognitionException {
		CoordinateContext _localctx = new CoordinateContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_coordinate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(SIGNED_NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DroneAmountContext extends ParserRuleContext {
		public TerminalNode SIGNED_NUMBER() { return getToken(ShapeGrammarParser.SIGNED_NUMBER, 0); }
		public DroneAmountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_droneAmount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).enterDroneAmount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).exitDroneAmount(this);
		}
	}

	public final DroneAmountContext droneAmount() throws RecognitionException {
		DroneAmountContext _localctx = new DroneAmountContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_droneAmount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(SIGNED_NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AngleContext extends ParserRuleContext {
		public TerminalNode SIGNED_NUMBER() { return getToken(ShapeGrammarParser.SIGNED_NUMBER, 0); }
		public AngleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).enterAngle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).exitAngle(this);
		}
	}

	public final AngleContext angle() throws RecognitionException {
		AngleContext _localctx = new AngleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_angle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(SIGNED_NUMBER);
			setState(95);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TimeContext extends ParserRuleContext {
		public TerminalNode SIGNED_NUMBER() { return getToken(ShapeGrammarParser.SIGNED_NUMBER, 0); }
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).exitTime(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(SIGNED_NUMBER);
			setState(98);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AxisContext extends ParserRuleContext {
		public AxisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_axis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).enterAxis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).exitAxis(this);
		}
	}

	public final AxisContext axis() throws RecognitionException {
		AxisContext _localctx = new AxisContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_axis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColourContext extends ParserRuleContext {
		public ColourContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colour; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).enterColour(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).exitColour(this);
		}
	}

	public final ColourContext colour() throws RecognitionException {
		ColourContext _localctx = new ColourContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_colour);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 266338304L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001 i\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007"+
		"\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0004\u0000 \b"+
		"\u0000\u000b\u0000\f\u0000!\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0003\u0001(\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u00035\b\u0003\n\u0003\f\u00038\t\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004=\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0000\u0000\u000f\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0003\u0001\u0000"+
		"\f\u000f\u0001\u0000\u0012\u0014\u0001\u0000\u0015\u001b^\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0002%\u0001\u0000\u0000\u0000\u0004)\u0001\u0000"+
		"\u0000\u0000\u00061\u0001\u0000\u0000\u0000\b<\u0001\u0000\u0000\u0000"+
		"\n>\u0001\u0000\u0000\u0000\fG\u0001\u0000\u0000\u0000\u000eR\u0001\u0000"+
		"\u0000\u0000\u0010X\u0001\u0000\u0000\u0000\u0012Z\u0001\u0000\u0000\u0000"+
		"\u0014\\\u0001\u0000\u0000\u0000\u0016^\u0001\u0000\u0000\u0000\u0018"+
		"a\u0001\u0000\u0000\u0000\u001ad\u0001\u0000\u0000\u0000\u001cf\u0001"+
		"\u0000\u0000\u0000\u001e \u0003\u0002\u0001\u0000\u001f\u001e\u0001\u0000"+
		"\u0000\u0000 !\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000"+
		"!\"\u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#$\u0005\u0000\u0000"+
		"\u0001$\u0001\u0001\u0000\u0000\u0000%\'\u0003\u0004\u0002\u0000&(\u0003"+
		"\b\u0004\u0000\'&\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000("+
		"\u0003\u0001\u0000\u0000\u0000)*\u0003\u0010\b\u0000*+\u0005\u001c\u0000"+
		"\u0000+,\u0005\u0001\u0000\u0000,-\u0003\u0006\u0003\u0000-.\u0005\u0002"+
		"\u0000\u0000./\u0005\u0003\u0000\u0000/0\u0003\u0014\n\u00000\u0005\u0001"+
		"\u0000\u0000\u000016\u0003\u0012\t\u000023\u0005\u0004\u0000\u000035\u0003"+
		"\u0012\t\u000042\u0001\u0000\u0000\u000058\u0001\u0000\u0000\u000064\u0001"+
		"\u0000\u0000\u000067\u0001\u0000\u0000\u00007\u0007\u0001\u0000\u0000"+
		"\u000086\u0001\u0000\u0000\u00009=\u0003\n\u0005\u0000:=\u0003\f\u0006"+
		"\u0000;=\u0003\u000e\u0007\u0000<9\u0001\u0000\u0000\u0000<:\u0001\u0000"+
		"\u0000\u0000<;\u0001\u0000\u0000\u0000=\t\u0001\u0000\u0000\u0000>?\u0005"+
		"\u0005\u0000\u0000?@\u0005\u001c\u0000\u0000@A\u0005\u0006\u0000\u0000"+
		"AB\u0005\u0001\u0000\u0000BC\u0003\u0006\u0003\u0000CD\u0005\u0002\u0000"+
		"\u0000DE\u0005\u0007\u0000\u0000EF\u0003\u0018\f\u0000F\u000b\u0001\u0000"+
		"\u0000\u0000GH\u0005\b\u0000\u0000HI\u0005\u001c\u0000\u0000IJ\u0005\t"+
		"\u0000\u0000JK\u0005\u0001\u0000\u0000KL\u0003\u0016\u000b\u0000LM\u0005"+
		"\u0002\u0000\u0000MN\u0005\n\u0000\u0000NO\u0003\u001a\r\u0000OP\u0005"+
		"\u0007\u0000\u0000PQ\u0003\u0018\f\u0000Q\r\u0001\u0000\u0000\u0000RS"+
		"\u0005\u000b\u0000\u0000ST\u0005\u001c\u0000\u0000TU\u0005\u0001\u0000"+
		"\u0000UV\u0003\u001c\u000e\u0000VW\u0005\u0002\u0000\u0000W\u000f\u0001"+
		"\u0000\u0000\u0000XY\u0007\u0000\u0000\u0000Y\u0011\u0001\u0000\u0000"+
		"\u0000Z[\u0005\u001d\u0000\u0000[\u0013\u0001\u0000\u0000\u0000\\]\u0005"+
		"\u001d\u0000\u0000]\u0015\u0001\u0000\u0000\u0000^_\u0005\u001d\u0000"+
		"\u0000_`\u0005\u0010\u0000\u0000`\u0017\u0001\u0000\u0000\u0000ab\u0005"+
		"\u001d\u0000\u0000bc\u0005\u0011\u0000\u0000c\u0019\u0001\u0000\u0000"+
		"\u0000de\u0007\u0001\u0000\u0000e\u001b\u0001\u0000\u0000\u0000fg\u0007"+
		"\u0002\u0000\u0000g\u001d\u0001\u0000\u0000\u0000\u0004!\'6<";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}