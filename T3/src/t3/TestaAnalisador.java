package t3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class TestaAnalisador {

    public static void main(String args[]) throws IOException, RecognitionException {
        SaidaParser out = new SaidaParser();
        ANTLRInputStream input = new ANTLRInputStream(TestaAnalisador.class.getResourceAsStream("../casosDeTeste/ct1.rec"));
        //ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(args[0]));
        ReceitaLexer lexer = new ReceitaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ReceitaParser parser = new ReceitaParser(tokens);
        try {
            //inicialização do Gerador de Código
            //GeradorDeCodigo gdc = new GeradorDeCodigo(out);

            // Adição dos listeners no LEXER e no PARSER
            lexer.addErrorListener(new T3ErrorListenerLexer(out));
            parser.addErrorListener(new T3ErrorListener(out));

            // Inicio 
            ReceitaParser.ReceitaContext raiz = parser.receita();
            ParseTreeWalker ptw = new ParseTreeWalker();
            //ptw.walk(gdc, raiz);
        } catch (RuntimeException e) {
            // Pega as mensagens de erro semanticas
            if (e.getMessage() != null) {
                out.println(e.getMessage() + "Fim da compilacao");
            }
        }

        PrintWriter pw = new PrintWriter(new File("resposta.txt"));
        pw.print(out.toString());
        pw.flush();
        pw.close();
        
    }
}
