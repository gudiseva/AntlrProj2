import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class AntlrParser {
    public static void main(String[] args) throws IOException {

        CharStream charStream = CharStreams.fromFileName("./example.cc");
        CPP14Lexer cpp14Lexer = new CPP14Lexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(cpp14Lexer);
        CPP14Parser cpp14Parser = new CPP14Parser(commonTokenStream);

        ParseTree parseTree = cpp14Parser.translationunit();

        System.out.println("done");

    }
}
