//Listener Parser para identificar erros sintáticos
package t3;

import java.util.BitSet;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

public class T3ErrorListener implements ANTLRErrorListener {
    SaidaParser sp;
    
    public T3ErrorListener(SaidaParser sp) {
        this.sp = sp;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> rcgnzr, Object o, int i, int i1, String string, RecognitionException re) {
        int indice = string.indexOf("expecting");
        String s = string;
        if(indice != -1) {
            s = s.substring(0,indice+9);
        }
        Token t = (Token)o;          
        
   
            if(t.getText()=="<EOF>"){
                sp.println("Linha " + i + ": erro sintatico proximo a EOF\nFim da compilacao");
            }
            else{
                sp.println("Linha " + i + ": erro sintatico proximo a " + t.getText()+"\nFim da compilacao");
            }
            throw new RuntimeException();
        
        
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
