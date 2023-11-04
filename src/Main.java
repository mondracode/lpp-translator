import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            // crear un analizador léxico
            lppLexer lexer;
            if (args.length>0)
                lexer = new lppLexer(CharStreams.fromFileName(args[0]));
            else
                lexer = new lppLexer(CharStreams.fromStream(System.in));
            // Identificar al analizador léxico como fuente de tokens para el sintactico
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // Crear el analizador sintáctico que se alimenta a partir del buffer de tokens
            lppParser parser = new lppParser(tokens);
            ParseTree tree = parser.s(); // comienza el análisis en la regla inicial
            System.out.println(tree.toStringTree(parser)); // imprime el árbol en forma textual

            LppToGoListener listener = new LppToGoListener();

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(listener, tree);
            System.out.println();
            System.out.println("-----------------------------------");

            listener.translatedGo.insert(0, listener.codeHeader);
            System.out.println(listener.translatedGo);

        } catch (Exception e){
            System.err.println("Error (Test): " + e);
        }
    }
}