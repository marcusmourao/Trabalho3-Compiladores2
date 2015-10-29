//Classe Tabela de Simbolos, possui um escopo e uma lista de simbolos
package t3;

import java.util.ArrayList;
import java.util.List;

public class TabelaDeSimbolos {
    private String escopo;
    private List<EntradaTabelaDeSimbolos> simbolos;
    
    public TabelaDeSimbolos(String escopo) {
        simbolos = new ArrayList<EntradaTabelaDeSimbolos>();
        this.escopo = escopo;
    }
    
    public void adicionarSimbolo(String nome, String tipo) {
        simbolos.add(new EntradaTabelaDeSimbolos(nome,tipo));
    }
    
    public void adicionarSimbolos(List<String> nomes, String tipo) {
        for(String s:nomes) {
            simbolos.add(new EntradaTabelaDeSimbolos(s, tipo));
        }
    }
    
    public List<String> getSimbolos(){
        List<String> atributos = new ArrayList<String>();
        for(int i=0; i< simbolos.size();i++){
            atributos.add("." + simbolos.get(i).getNome());
        }
        return atributos;
    }
    
    public List<String> getSimbolos_unidades_medida(){
        List<String> atributos = new ArrayList<String>();
        for(int i=0; i< simbolos.size();i++){
            atributos.add(simbolos.get(i).getUnidade_medida());
        }
        return atributos;
    }//Retorna uma lista com tosos os tipos dos simbolos
    
    public List<EntradaTabelaDeSimbolos> getSimbolos2(){
        List<EntradaTabelaDeSimbolos> atributos = new ArrayList<EntradaTabelaDeSimbolos>();
        for(int i=0; i< simbolos.size();i++){
            atributos.add(simbolos.get(i));
        }
        return atributos;
    }//Retorna uma lista com todos os SIMBOLOS da tabela
    
    
    public String getEscopo(){
        return this.escopo;
        } //Retorna o escopo da tabela
    
    public boolean existeSimbolo(String nome) {
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            if(etds.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }//Verifica se um simbolo pertence à tabela
    
    public EntradaTabelaDeSimbolos getSimbolo(String nome){
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            if(etds.getNome().equals(nome)) {
                return etds;
            }
        }
        return null;
    } //Retorna o simbolo de acordo com o nome passado como parâmetro se o simbolo existir na tabela
    
    public String GetUnidadeMedidaSimbolo(String nome) {
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            if(etds.getNome().equals(nome)) {
                return etds.getUnidade_medida();
            }
        }
        return "SEM_TIPO";
    }// Retorna o tipo do simbolo caso o simbolo esteja presente na tabela
    
    @Override
    public String toString() {
        String ret = "Escopo: "+escopo;
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            ret += "\n   "+etds;
        }
        return ret;
    }
}
