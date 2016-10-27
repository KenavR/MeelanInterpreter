package at.technikum.spko.meelan.parser;

import at.technikum.spko.meelan.antlr.MeelanLexer;
import at.technikum.spko.meelan.antlr.MeelanParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MeelanInterpreter {

    private MeelanVisitorImpl visitor;

    public MeelanInterpreter() {
        this.visitor = new MeelanVisitorImpl();
    }

    public void interpretProgram(String source) {
        TokenStream tokenStream = new CommonTokenStream(new MeelanLexer(new ANTLRInputStream(source)));

        MeelanParser parser = new MeelanParser(tokenStream);
        visitor.resetState();
        visitor.visit(parser.statements());
    }

    public String readFile(String path, Charset encoding) throws IOException {
            byte[] encoded = Files.readAllBytes(Paths.get(path));
            return new String(encoded, encoding);
    }

    public void interpretFromFile(String path) throws IOException {
        String source = readFile(path, Charset.defaultCharset());
        interpretProgram(source);
    }

    public static void main(String... args) {
        MeelanInterpreter interpreter = new MeelanInterpreter();

        System.out.println("-------------------------------------------");

        File testFilesFolder = new File("src/main/resources/snippets");

        for (final File fileEntry : testFilesFolder.listFiles()) {
            try {
                System.out.println("TEST FOR "+fileEntry.getName()+"("+fileEntry.getPath()+")");
                interpreter.interpretFromFile(fileEntry.getPath());

            } catch (IOException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
            System.out.println("-------------------------------------------");
        }
    }

}
