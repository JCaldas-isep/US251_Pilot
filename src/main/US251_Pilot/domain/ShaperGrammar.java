// antlr4 .\ShapeGrammar.g4
// antlr4-parse ShapeGrammar.g4 program -gui ../../resources/input.txt

package domain;

import java.io.*;
import java.util.Map;
import java.util.Set;

import antlr.grammar.ShapeGrammarLexer;
import antlr.grammar.ShapeGrammarParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ShaperGrammar {
    public static void main(String[] args) throws IOException {
        ShapeGrammarLexer lexer = new ShapeGrammarLexer(CharStreams.fromFileName("src/main/US251_Pilot/resources/input.md"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ShapeGrammarParser parser = new ShapeGrammarParser(tokens);
        ParseTree tree = parser.program(); // parse
        parseWithListener(tree);
    }
    public static void parseWithListener(ParseTree tree) throws IOException {
        ParseTreeWalker walker = new ParseTreeWalker();
        ShapeListener sListener = new ShapeListener();
        walker.walk(sListener, tree);
        Map<String, Shape> shapesList = sListener.getResult();
        // for (Map.Entry<String, Shape> entry : shapesList.entrySet()) {
        //     Shape shape = entry.getValue();
        //     shape.printShape();
        // }
        DSLGenerator generator = new DSLGenerator(shapesList);
        String dslOutput = generator.generate();

        // STEP 4: Write to resources/output.txt
        try (FileWriter writer = new FileWriter("src/main/US251_Pilot/resources/output.txt")) {
            writer.write(dslOutput);
            System.out.println("✅ DSL output saved to resources/output.txt");
        } catch (IOException e) {
            System.err.println("❌ Failed to write file: " + e.getMessage());
        }
    }
}