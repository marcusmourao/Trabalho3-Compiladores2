package t3;

public class SaidaParser {

    StringBuffer conteudo;
    boolean modificado;

    public SaidaParser() {
        conteudo = new StringBuffer();
        modificado = false;
    }

    public void println(String texto) {
        if(!modificado) modificado = true;
        conteudo.append(texto);
        conteudo.append("\n");
    }
    
    public boolean isModificado() {
        return modificado;
    }
    
    public void modifica(){
        modificado = true;
    }

    @Override
    public String toString() {
        return conteudo.toString();
    }
}