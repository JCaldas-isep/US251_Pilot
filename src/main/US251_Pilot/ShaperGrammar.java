import java.io.*;
import java.util.Set;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ShaperGrammar {
    public static void main(String[] args) throws IOException {
        ShapeGrammarLexer lexer = new ShapeGrammarLexer(CharStreams.fromFileName("src/main/US251_Pilot/input.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ShapeGrammarParser parser = new ShapeGrammarParser(tokens);
        ParseTree tree = parser.program(); // parse
        parseWithListener(tree);
    }
    public static void parseWithListener(ParseTree tree) throws IOException {
        ParseTreeWalker walker = new ParseTreeWalker();
        ShapeListener sListener = new ShapeListener();
        walker.walk(sListener, tree);
        Set<Shape> shapesList = sListener.getResult();
        for (Shape shape : shapesList) { shape.printShape(); }
    }
}