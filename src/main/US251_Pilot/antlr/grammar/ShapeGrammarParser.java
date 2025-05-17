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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, ID=37, SIGNED_NUMBER=38, 
		DIGIT=39, WS=40, COMMENT=41;
	public static final int
		RULE_program = 0, RULE_shapeBlock = 1, RULE_shapeDefinition = 2, RULE_shapeWithSingleSize = 3, 
		RULE_rectangleShape = 4, RULE_coordinateList = 5, RULE_animation = 6, 
		RULE_moveAnimation = 7, RULE_rotateAnimation = 8, RULE_turnAnimation = 9, 
		RULE_pauseAnimation = 10, RULE_shapeTypeSingleSize = 11, RULE_coordinate = 12, 
		RULE_sizeValue = 13, RULE_droneAmount = 14, RULE_angle = 15, RULE_time = 16, 
		RULE_axis = 17, RULE_colour = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "shapeBlock", "shapeDefinition", "shapeWithSingleSize", "rectangleShape", 
			"coordinateList", "animation", "moveAnimation", "rotateAnimation", "turnAnimation", 
			"pauseAnimation", "shapeTypeSingleSize", "coordinate", "sizeValue", "droneAmount", 
			"angle", "time", "axis", "colour"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'SIZE'", "'WITH'", "'DRONES'", "'RECTANGLE'", "','", 
			"'MOVE'", "'TO'", "'IN'", "'ROTATE'", "'BY'", "'<'", "'>'", "'ON'", "'TURN'", 
			"'FOR'", "'PAUSE'", "'SQUARE'", "'TRIANGLE'", "'HEXAGON'", "'CIRCLE'", 
			"'LINE'", "'m'", "'\\u00BA'", "'s'", "'x'", "'y'", "'z'", "'RED'", "'GREEN'", 
			"'BLUE'", "'MAGENTA'", "'YELLOW'", "'CYAN'", "'WHITE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ID", "SIGNED_NUMBER", "DIGIT", "WS", "COMMENT"
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
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				shapeBlock();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16252992L) != 0) );
			setState(43);
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
		public List<AnimationContext> animation() {
			return getRuleContexts(AnimationContext.class);
		}
		public AnimationContext animation(int i) {
			return getRuleContext(AnimationContext.class,i);
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
			setState(45);
			shapeDefinition();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 329984L) != 0)) {
				{
				{
				setState(46);
				animation();
				}
				}
				setState(51);
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
	public static class ShapeDefinitionContext extends ParserRuleContext {
		public ShapeWithSingleSizeContext shapeWithSingleSize() {
			return getRuleContext(ShapeWithSingleSizeContext.class,0);
		}
		public RectangleShapeContext rectangleShape() {
			return getRuleContext(RectangleShapeContext.class,0);
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
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				shapeWithSingleSize();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				rectangleShape();
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
	public static class ShapeWithSingleSizeContext extends ParserRuleContext {
		public ShapeTypeSingleSizeContext shapeTypeSingleSize() {
			return getRuleContext(ShapeTypeSingleSizeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ShapeGrammarParser.ID, 0); }
		public CoordinateListContext coordinateList() {
			return getRuleContext(CoordinateListContext.class,0);
		}
		public SizeValueContext sizeValue() {
			return getRuleContext(SizeValueContext.class,0);
		}
		public DroneAmountContext droneAmount() {
			return getRuleContext(DroneAmountContext.class,0);
		}
		public ShapeWithSingleSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shapeWithSingleSize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).enterShapeWithSingleSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).exitShapeWithSingleSize(this);
		}
	}

	public final ShapeWithSingleSizeContext shapeWithSingleSize() throws RecognitionException {
		ShapeWithSingleSizeContext _localctx = new ShapeWithSingleSizeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_shapeWithSingleSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			shapeTypeSingleSize();
			setState(57);
			match(ID);
			setState(58);
			match(T__0);
			setState(59);
			coordinateList();
			setState(60);
			match(T__1);
			setState(61);
			match(T__2);
			setState(62);
			sizeValue();
			setState(63);
			match(T__3);
			setState(64);
			droneAmount();
			setState(65);
			match(T__4);
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
	public static class RectangleShapeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ShapeGrammarParser.ID, 0); }
		public CoordinateListContext coordinateList() {
			return getRuleContext(CoordinateListContext.class,0);
		}
		public List<SizeValueContext> sizeValue() {
			return getRuleContexts(SizeValueContext.class);
		}
		public SizeValueContext sizeValue(int i) {
			return getRuleContext(SizeValueContext.class,i);
		}
		public DroneAmountContext droneAmount() {
			return getRuleContext(DroneAmountContext.class,0);
		}
		public RectangleShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rectangleShape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).enterRectangleShape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).exitRectangleShape(this);
		}
	}

	public final RectangleShapeContext rectangleShape() throws RecognitionException {
		RectangleShapeContext _localctx = new RectangleShapeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rectangleShape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__5);
			setState(68);
			match(ID);
			setState(69);
			match(T__0);
			setState(70);
			coordinateList();
			setState(71);
			match(T__1);
			setState(72);
			match(T__2);
			setState(73);
			sizeValue();
			setState(74);
			match(T__6);
			setState(75);
			sizeValue();
			setState(76);
			match(T__3);
			setState(77);
			droneAmount();
			setState(78);
			match(T__4);
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
		enterRule(_localctx, 10, RULE_coordinateList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			coordinate();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(81);
				match(T__6);
				setState(82);
				coordinate();
				}
				}
				setState(87);
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
		public PauseAnimationContext pauseAnimation() {
			return getRuleContext(PauseAnimationContext.class,0);
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
		enterRule(_localctx, 12, RULE_animation);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				moveAnimation();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				rotateAnimation();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				turnAnimation();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				pauseAnimation();
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
		enterRule(_localctx, 14, RULE_moveAnimation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__7);
			setState(95);
			match(ID);
			setState(96);
			match(T__8);
			setState(97);
			match(T__0);
			setState(98);
			coordinateList();
			setState(99);
			match(T__1);
			setState(100);
			match(T__9);
			setState(101);
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
		enterRule(_localctx, 16, RULE_rotateAnimation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__10);
			setState(104);
			match(ID);
			setState(105);
			match(T__11);
			setState(106);
			match(T__12);
			setState(107);
			angle();
			setState(108);
			match(T__13);
			setState(109);
			match(T__14);
			setState(110);
			axis();
			setState(111);
			match(T__9);
			setState(112);
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
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
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
		enterRule(_localctx, 18, RULE_turnAnimation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__15);
			setState(115);
			match(ID);
			setState(116);
			match(T__12);
			setState(117);
			colour();
			setState(118);
			match(T__13);
			setState(119);
			match(T__16);
			setState(120);
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
	public static class PauseAnimationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ShapeGrammarParser.ID, 0); }
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public PauseAnimationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pauseAnimation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).enterPauseAnimation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).exitPauseAnimation(this);
		}
	}

	public final PauseAnimationContext pauseAnimation() throws RecognitionException {
		PauseAnimationContext _localctx = new PauseAnimationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pauseAnimation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__17);
			setState(123);
			match(ID);
			setState(124);
			match(T__16);
			setState(125);
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
	public static class ShapeTypeSingleSizeContext extends ParserRuleContext {
		public ShapeTypeSingleSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shapeTypeSingleSize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).enterShapeTypeSingleSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).exitShapeTypeSingleSize(this);
		}
	}

	public final ShapeTypeSingleSizeContext shapeTypeSingleSize() throws RecognitionException {
		ShapeTypeSingleSizeContext _localctx = new ShapeTypeSingleSizeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_shapeTypeSingleSize);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16252928L) != 0)) ) {
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
		enterRule(_localctx, 24, RULE_coordinate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
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
	public static class SizeValueContext extends ParserRuleContext {
		public TerminalNode SIGNED_NUMBER() { return getToken(ShapeGrammarParser.SIGNED_NUMBER, 0); }
		public SizeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).enterSizeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeGrammarListener ) ((ShapeGrammarListener)listener).exitSizeValue(this);
		}
	}

	public final SizeValueContext sizeValue() throws RecognitionException {
		SizeValueContext _localctx = new SizeValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sizeValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(SIGNED_NUMBER);
			setState(132);
			match(T__23);
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
		enterRule(_localctx, 28, RULE_droneAmount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
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
		enterRule(_localctx, 30, RULE_angle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(SIGNED_NUMBER);
			setState(137);
			match(T__24);
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
		enterRule(_localctx, 32, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(SIGNED_NUMBER);
			setState(140);
			match(T__25);
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
		enterRule(_localctx, 34, RULE_axis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) ) {
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
		enterRule(_localctx, 36, RULE_colour);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 136365211648L) != 0)) ) {
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
		"\u0004\u0001)\u0093\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0004\u0000(\b\u0000\u000b\u0000\f\u0000)\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0005\u00010\b\u0001\n\u0001\f\u00013\t"+
		"\u0001\u0001\u0002\u0001\u0002\u0003\u00027\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005T\b\u0005\n\u0005\f\u0005W\t\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006]\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0000\u0000\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0003\u0001\u0000"+
		"\u0013\u0017\u0001\u0000\u001b\u001d\u0001\u0000\u001e$\u0086\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0002-\u0001\u0000\u0000\u0000\u00046\u0001\u0000"+
		"\u0000\u0000\u00068\u0001\u0000\u0000\u0000\bC\u0001\u0000\u0000\u0000"+
		"\nP\u0001\u0000\u0000\u0000\f\\\u0001\u0000\u0000\u0000\u000e^\u0001\u0000"+
		"\u0000\u0000\u0010g\u0001\u0000\u0000\u0000\u0012r\u0001\u0000\u0000\u0000"+
		"\u0014z\u0001\u0000\u0000\u0000\u0016\u007f\u0001\u0000\u0000\u0000\u0018"+
		"\u0081\u0001\u0000\u0000\u0000\u001a\u0083\u0001\u0000\u0000\u0000\u001c"+
		"\u0086\u0001\u0000\u0000\u0000\u001e\u0088\u0001\u0000\u0000\u0000 \u008b"+
		"\u0001\u0000\u0000\u0000\"\u008e\u0001\u0000\u0000\u0000$\u0090\u0001"+
		"\u0000\u0000\u0000&(\u0003\u0002\u0001\u0000\'&\u0001\u0000\u0000\u0000"+
		"()\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000"+
		"\u0000*+\u0001\u0000\u0000\u0000+,\u0005\u0000\u0000\u0001,\u0001\u0001"+
		"\u0000\u0000\u0000-1\u0003\u0004\u0002\u0000.0\u0003\f\u0006\u0000/.\u0001"+
		"\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u0000"+
		"12\u0001\u0000\u0000\u00002\u0003\u0001\u0000\u0000\u000031\u0001\u0000"+
		"\u0000\u000047\u0003\u0006\u0003\u000057\u0003\b\u0004\u000064\u0001\u0000"+
		"\u0000\u000065\u0001\u0000\u0000\u00007\u0005\u0001\u0000\u0000\u0000"+
		"89\u0003\u0016\u000b\u00009:\u0005%\u0000\u0000:;\u0005\u0001\u0000\u0000"+
		";<\u0003\n\u0005\u0000<=\u0005\u0002\u0000\u0000=>\u0005\u0003\u0000\u0000"+
		">?\u0003\u001a\r\u0000?@\u0005\u0004\u0000\u0000@A\u0003\u001c\u000e\u0000"+
		"AB\u0005\u0005\u0000\u0000B\u0007\u0001\u0000\u0000\u0000CD\u0005\u0006"+
		"\u0000\u0000DE\u0005%\u0000\u0000EF\u0005\u0001\u0000\u0000FG\u0003\n"+
		"\u0005\u0000GH\u0005\u0002\u0000\u0000HI\u0005\u0003\u0000\u0000IJ\u0003"+
		"\u001a\r\u0000JK\u0005\u0007\u0000\u0000KL\u0003\u001a\r\u0000LM\u0005"+
		"\u0004\u0000\u0000MN\u0003\u001c\u000e\u0000NO\u0005\u0005\u0000\u0000"+
		"O\t\u0001\u0000\u0000\u0000PU\u0003\u0018\f\u0000QR\u0005\u0007\u0000"+
		"\u0000RT\u0003\u0018\f\u0000SQ\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000"+
		"\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000V\u000b\u0001"+
		"\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000X]\u0003\u000e\u0007\u0000"+
		"Y]\u0003\u0010\b\u0000Z]\u0003\u0012\t\u0000[]\u0003\u0014\n\u0000\\X"+
		"\u0001\u0000\u0000\u0000\\Y\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000"+
		"\u0000\\[\u0001\u0000\u0000\u0000]\r\u0001\u0000\u0000\u0000^_\u0005\b"+
		"\u0000\u0000_`\u0005%\u0000\u0000`a\u0005\t\u0000\u0000ab\u0005\u0001"+
		"\u0000\u0000bc\u0003\n\u0005\u0000cd\u0005\u0002\u0000\u0000de\u0005\n"+
		"\u0000\u0000ef\u0003 \u0010\u0000f\u000f\u0001\u0000\u0000\u0000gh\u0005"+
		"\u000b\u0000\u0000hi\u0005%\u0000\u0000ij\u0005\f\u0000\u0000jk\u0005"+
		"\r\u0000\u0000kl\u0003\u001e\u000f\u0000lm\u0005\u000e\u0000\u0000mn\u0005"+
		"\u000f\u0000\u0000no\u0003\"\u0011\u0000op\u0005\n\u0000\u0000pq\u0003"+
		" \u0010\u0000q\u0011\u0001\u0000\u0000\u0000rs\u0005\u0010\u0000\u0000"+
		"st\u0005%\u0000\u0000tu\u0005\r\u0000\u0000uv\u0003$\u0012\u0000vw\u0005"+
		"\u000e\u0000\u0000wx\u0005\u0011\u0000\u0000xy\u0003 \u0010\u0000y\u0013"+
		"\u0001\u0000\u0000\u0000z{\u0005\u0012\u0000\u0000{|\u0005%\u0000\u0000"+
		"|}\u0005\u0011\u0000\u0000}~\u0003 \u0010\u0000~\u0015\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0007\u0000\u0000\u0000\u0080\u0017\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0005&\u0000\u0000\u0082\u0019\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0005&\u0000\u0000\u0084\u0085\u0005\u0018\u0000\u0000\u0085"+
		"\u001b\u0001\u0000\u0000\u0000\u0086\u0087\u0005&\u0000\u0000\u0087\u001d"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0005&\u0000\u0000\u0089\u008a\u0005"+
		"\u0019\u0000\u0000\u008a\u001f\u0001\u0000\u0000\u0000\u008b\u008c\u0005"+
		"&\u0000\u0000\u008c\u008d\u0005\u001a\u0000\u0000\u008d!\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0007\u0001\u0000\u0000\u008f#\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0007\u0002\u0000\u0000\u0091%\u0001\u0000\u0000\u0000\u0005"+
		")16U\\";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}