
package t3;

import java.util.BitSet;
import org.antlr.v4.runtime.ANTLRErrorListener;
//Listener Lexer para identificar erros
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;


public class T1ErrorListenerLexer implements ANTLRErrorListener{
    SaidaParser sp;
    
    public T1ErrorListenerLexer(SaidaParser sp){
        this.sp=sp;
    }
    
    @Override
    public void syntaxError(Recognizer<?, ?> rcgnzr, Object o, int i, int i1, String string, RecognitionException re) {
        { 
            String s = string.split(" ")[4].split("'")[1];
            if(s.equals("{"))
                sp.println("Linha " + ++i + ": " + "comentario nao fechado\nFim da compilacao");
            else
                sp.println("Linha " + i + ": " + s + " - simbolo nao identificado\nFim da compilacao");
            throw new RuntimeException();
        }
    }
    
    @Override
    public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean bln, BitSet bitset, ATNConfigSet atncs) {
      
    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitset, ATNConfigSet atncs) {
    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atncs) {
    }
}