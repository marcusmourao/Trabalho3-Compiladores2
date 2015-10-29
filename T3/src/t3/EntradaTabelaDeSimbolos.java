package t3;
/* Classe que define como os simbolos serão armazenados. Todos terão um nome e um tipo associado.
*/
public class EntradaTabelaDeSimbolos {
    private String nome, unidade_medida;
    
    public EntradaTabelaDeSimbolos(String nome, String unidade_medida) {
        this.nome = nome;
        this.unidade_medida = unidade_medida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUnidade_medida() {
        return unidade_medida;
    }

    public void setUnidade_medida(String unidade_medida) {
        this.unidade_medida = unidade_medida;
    }

    @Override
    public String toString() {
        return "EntradaTabelaDeSimbolos{" + "nome=" + nome + ", unidade_medida=" + unidade_medida + '}';
    }
    
    
}
