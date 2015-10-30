/*
Construção de Compiladores 2
T3

*/

grammar Receita;

@members {
   public static String grupo="<<379387, 379352, 489450, 551740>>";
   TabelaDeSimbolos TabelaIngradientes = new TabelaDeSimbolos("Ingredientes");
   TabelaDeSimbolos TabelaUtensilios = new TabelaDeSimbolos("Utensilios");
   TabelaDeSimbolos TabelaMedidas = new TabelaDeSimbolos("Unidades de Medida");
   String error="";
}

//A seguir declaramos todas as palavras e simbolos reservados da linguagem Receita como tokens do ANTLR
INICIANTE: 'iniciante';
INTERMEDIARIO: 'intermediario';
EXPERIENTE: 'experiente';
MASTER_CHEF: 'master_chef';
RENDIMENTO: 'rendimento';
FIM_RENDIMENTO: 'fim_rendimento';
DOIS_PONTOS: ':';
INGREDIENTES: 'ingredientes';
FIM_INGREDIENTES: 'fim_ingredientes';
UTENSILIOS: 'utensilios';
FIM_UTENSILIOS: 'fim_utensilios';
MODO_PREPARO: 'modo_preparo';
FIM_MODO_PREPARO: 'fim_modo_preparo';
PONTO: '.';
DE: 'de';
KILO: 'kg';
GRAMA: 'g';
LATA: 'lata';
XICARA: 'xicara(cha)';
XICARAS: 'xicaras(cha)';
COLHER_SOPA: 'colher(sopa)';
COLHER_CHA: 'colher(cha)';
COLHERES_SOPA: 'colheres(sopa)';
COLHERES_CHA: 'colheres(cha)';
COPO_AMERICANO: 'copo(americano)';
COPOS_AMERICANO: 'copos(americano)';
UNIDADE: 'unidade';
UNIDADES: 'unidades';
CUBO: 'cubo';
MILI_LITRO: 'ml';
LITRO: 'l';
VIRGULA: ',';
ABRE_PARENTESE: '(';
FECHA_PARENTESE: ')';
POR: 'por';
SEGUNDO: 'seg';
MINUTO: 'min';
HORA: 'hr';
ACRESCENTAR: 'acrescentar';
ADICIONAR: 'adicionar';
ASSAR: 'assar';
BATER: 'bater';
COLOCAR: 'colocar';
ESPREMER: 'espremer';
CORTAR: 'cortar';
FERVER: 'ferver';
FATIAR: 'fatiar';
PENEIRAR: 'peneirar';
PICAR: 'picar';
SEPARAR: 'separar';
TEMPERAR: 'temperar';
UNTAR: 'untar';
MEXER: 'mexer';
FRITAR: 'fritar';
MISTURAR: 'misturar';
FOGO: 'fogo';

// Sequencia de caracteres entre aspas dupla de apenas uma linha
TITULO : '\'' ~('\n' | '\r' | '\'')* '\'' | '"' ~('\n' | '\r' | '"')* '"';

// Sequencia de letras e underscore, comecando por letra e terminando por letra
ID : ('_'|'a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'_')* | 'todos_ingredientes' | 'mistura';

// Sequencia de digitos
INTEIRO : ('0'..'9')+;

// Pelo menos um digito seguido de um ponto decimal e de uma sequencia de um ou mais digitos
REAL : ('0'..'9')+ PONTO ('0'..'9')+;

//Espacos em branco, tabulacao e quebra de linha ignorados pelo analisador lexico.
WS : ( ' ' |'\t' | '\r' | '\n') {skip();}; 

//Comentarios curtos ignorados pelo analisador lexico.
COMENTARIO : '{' ~('\n'|'\r'|'\t')* '\r'? '\n'? '}'('\n'('\n'|'\t'))* {skip();};

//Raiz do programa
receita:
       {
        TabelaMedidas.adicionarSimbolo("kg","kg");
        TabelaMedidas.adicionarSimbolo("g","g");
        TabelaMedidas.adicionarSimbolo("lata","lata");
        TabelaMedidas.adicionarSimbolo("xicara(cha)","xicara(cha)");
        TabelaMedidas.adicionarSimbolo("xicaras(cha)","xicaras(cha)");
        TabelaMedidas.adicionarSimbolo("colher(sopa)","colher(sopa)");
        TabelaMedidas.adicionarSimbolo("colheres(sopa)","colheres(sopa)");
        TabelaMedidas.adicionarSimbolo("colheres(cha)","colheres(cha)");
        TabelaMedidas.adicionarSimbolo("copo(americano)","copo(americano)");
        TabelaMedidas.adicionarSimbolo("copos(americano)","copos(americano)");
        TabelaMedidas.adicionarSimbolo("unidade","unidade");
        TabelaMedidas.adicionarSimbolo("unidades","unidades");
        TabelaMedidas.adicionarSimbolo("cubo","cubo");
        TabelaMedidas.adicionarSimbolo("ml","ml");
        TabelaMedidas.adicionarSimbolo("l","l");
       }
       TITULO nivel corpo_receita rendimento 
       {if(error!="")throw new RuntimeException(error);}
       ;

nivel returns[ String nome_nivel]
@init{ $nome_nivel = "";}
     : INICIANTE {$nome_nivel = "iniciante";}
     | INTERMEDIARIO {$nome_nivel = "intermediario";}
     | EXPERIENTE {$nome_nivel = "experiente";}
     | MASTER_CHEF {$nome_nivel = "master_chef";}
     ;

corpo_receita: ingredientes utensilios preparo ;

rendimento: RENDIMENTO DOIS_PONTOS numero FIM_RENDIMENTO ;

numero returns[ String qnt_numero]
@init{$qnt_numero = "";}
    : v1=INTEIRO {$qnt_numero = $v1.getText();}
    | v2=REAL {$qnt_numero = $v2.getText();}
;

ingredientes: INGREDIENTES DOIS_PONTOS lista_ingredientes FIM_INGREDIENTES ;

utensilios: UTENSILIOS DOIS_PONTOS lista_utensilios FIM_UTENSILIOS ;

preparo: MODO_PREPARO DOIS_PONTOS procedimento FIM_MODO_PREPARO ;
           
lista_ingredientes returns[ List<String> list_Ingredientes, List<String> unidade_Medidas]
@init{
      $list_Ingredientes = new ArrayList<String>(); 
      $unidade_Medidas = new ArrayList<String>(); 
}
    : ( v2=quantidade v1=ID PONTO {
                                   
                                   if(!TabelaIngradientes.existeSimbolo($v1.getText())){
                                         TabelaIngradientes.adicionarSimbolo($v1.getText(), $v2._unidade_medida);
                                   }
                                   else{
                                        error += "Linha: "+ $v1.getLine() + " - Identificador " + $v1.getText() + " já declarado\n";
                                   }
                                   
                                   
                                  } )+ ;           

lista_utensilios returns[ List<String> list_Utensilios]
@init{$list_Utensilios = new ArrayList<String>();}
    : (v1=ID PONTO {
                                   
                                   if(!TabelaUtensilios.existeSimbolo($v1.getText())){
                                         TabelaUtensilios.adicionarSimbolo($v1.getText(), "utensilio");
                                   }
                                   else{
                                        error += "Linha: "+ $v1.getLine() + " - Identificador " + $v1.getText() + " já declarado\n";
                                   }
                                   
                                   
                                  } )+ ;

procedimento: (verbo)+ ;

quantidade returns[String _quantidade, String _unidade_medida]
@init{$_quantidade = ""; $_unidade_medida="";}
    : v1=numero v2=unidade_de_medida (DE)?
      { 
        $_unidade_medida = $v2.unidade_medida;
      }
    ;

unidade_de_medida returns[ String unidade_medida]
@init {$unidade_medida = "";}
    : KILO {$unidade_medida = "kg";}
    |GRAMA {$unidade_medida = "g";}
    |LATA  {$unidade_medida = "lata";}
    |XICARA {$unidade_medida = "xicara";}
    |XICARAS {$unidade_medida = "xicaras";}
    |COLHER_CHA {$unidade_medida = "colher(chá)";}
    |COLHERES_CHA {$unidade_medida = "colheres(chá)";}
    |COLHER_SOPA {$unidade_medida = "colher(sopa)";}
    |COLHERES_SOPA {$unidade_medida = "colheres(sopa)";}
    |COPO_AMERICANO {$unidade_medida = "copo(americano)";}
    |COPOS_AMERICANO {$unidade_medida = "copos(americano)";}
    |UNIDADE {$unidade_medida = "unidade";}
    |UNIDADES {$unidade_medida = "unidades";}
    |CUBO {$unidade_medida = "cubo";}
    |MILI_LITRO {$unidade_medida = "mL";}
    |LITRO {$unidade_medida = "L";}
    | v1=ID {$unidade_medida = $v1.getText();}
    ;

verbo:
       ACRESCENTAR ABRE_PARENTESE numero VIRGULA v2=unidade_de_medida VIRGULA v1=ID FECHA_PARENTESE PONTO
       {
         if(!TabelaIngradientes.existeSimbolo($v1.getText())){
             error += "Linha: "+ $v1.getLine() + " - Identificador " + $v1.getText() + " não declarado\n";
         }
         if(!TabelaMedidas.existeSimbolo($v2.unidade_medida)){
             error += "Linha: "+ $v1.getLine() + " - Unidade de medida \"" + $v2.unidade_medida + "\" inválida\n";
         }
       }//apenas 1 ID
     | ADICIONAR ABRE_PARENTESE numero VIRGULA v2=unidade_de_medida  VIRGULA v1=ID FECHA_PARENTESE PONTO  //apenas 1 ID
       {
         if(!TabelaIngradientes.existeSimbolo($v1.getText())){
             error += "Linha: "+ $v1.getLine() + " - Identificador " + $v1.getText() + " não declarado\n";
         }
         if(!TabelaMedidas.existeSimbolo($v2.unidade_medida)){
             error += "Linha: "+ $v1.getLine() + " - Unidade de medida \"" + $v2.unidade_medida + "\" inválida\n";
         }
       }
     | ASSAR ABRE_PARENTESE ID VIRGULA numero VIRGULA unidade_de_tempo FECHA_PARENTESE PONTO        //apenas 1 ID
       
     | BATER ABRE_PARENTESE numero VIRGULA unidade_de_medida  VIRGULA ID mais_id FECHA_PARENTESE PONTO // 1 ou + ID
     | COLOCAR ABRE_PARENTESE ID VIRGULA ID FECHA_PARENTESE PONTO  // 2 ID
     | CORTAR ABRE_PARENTESE numero VIRGULA v2=unidade_de_medida  VIRGULA v1=ID FECHA_PARENTESE PONTO //apenas 1 ID
       {
         if(!TabelaIngradientes.existeSimbolo($v1.getText())){
             error += "Linha: "+ $v1.getLine() + " - Ingrediente " + $v1.getText() + " não declarado\n";
         }
         if(!TabelaMedidas.existeSimbolo($v2.unidade_medida)){
             error += "Linha: "+ $v1.getLine() + " - Unidade de medida \"" + $v2.unidade_medida + "\" inválida\n";
         }
       }//apenas 1 ID
     | ESPREMER ABRE_PARENTESE numero VIRGULA v2=unidade_de_medida  VIRGULA v1=ID FECHA_PARENTESE PONTO //apenas 1 ID
       {
         if(!TabelaIngradientes.existeSimbolo($v1.getText())){
             error += "Linha: "+ $v1.getLine() + " - Ingrediente " + $v1.getText() + " não declarado\n";
         }
         if(!TabelaMedidas.existeSimbolo($v2.unidade_medida)){
             error += "Linha: "+ $v1.getLine() + " - Unidade de medida \"" + $v2.unidade_medida + "\" inválida\n";
         }
       }//apenas 1 ID
     | FERVER ABRE_PARENTESE numero VIRGULA v2=unidade_de_medida  VIRGULA v1=ID FECHA_PARENTESE PONTO //apenas 1 ID
       {
         if(!TabelaIngradientes.existeSimbolo($v1.getText())){
             error += "Linha: "+ $v1.getLine() + " - Ingrediente " + $v1.getText() + " não declarado\n";
         }
         if(!TabelaMedidas.existeSimbolo($v2.unidade_medida)){
             error += "Linha: "+ $v1.getLine() + " - Unidade de medida \"" + $v2.unidade_medida + "\" inválida\n";
         }
       }//apenas 1 ID
     | FATIAR ABRE_PARENTESE numero VIRGULA v2=unidade_de_medida  VIRGULA v1=ID FECHA_PARENTESE PONTO //apenas 1 ID
       {
         if(!TabelaIngradientes.existeSimbolo($v1.getText())){
             error += "Linha: "+ $v1.getLine() + " - Ingrediente " + $v1.getText() + " não declarado\n";
         }
         if(!TabelaMedidas.existeSimbolo($v2.unidade_medida)){
             error += "Linha: "+ $v1.getLine() + " - Unidade de medida \"" + $v2.unidade_medida + "\" inválida\n";
         }
       }//apenas 1 ID
     | PENEIRAR ABRE_PARENTESE numero VIRGULA v2=unidade_de_medida  VIRGULA v1=ID FECHA_PARENTESE PONTO //apenas 1 ID
       {
         if(!TabelaIngradientes.existeSimbolo($v1.getText())){
             error += "Linha: "+ $v1.getLine() + " - Ingrediente " + $v1.getText() + " não declarado\n";
         }
         if(!TabelaMedidas.existeSimbolo($v2.unidade_medida)){
             error += "Linha: "+ $v1.getLine() + " - Unidade de medida \"" + $v2.unidade_medida + "\" inválida\n";
         }
       }//apenas 1 ID
     | PICAR ABRE_PARENTESE numero VIRGULA v2=unidade_de_medida  VIRGULA v1=ID FECHA_PARENTESE PONTO  //apenas 1 ID
       {
         if(!TabelaIngradientes.existeSimbolo($v1.getText())){
             error += "Linha: "+ $v1.getLine() + " - Ingrediente " + $v1.getText() + " não declarado\n";
         }
         if(!TabelaMedidas.existeSimbolo($v2.unidade_medida)){
             error += "Linha: "+ $v1.getLine() + " - Unidade de medida \"" + $v2.unidade_medida + "\" inválida\n";
         }
       }//apenas 1 ID
     | SEPARAR ABRE_PARENTESE numero VIRGULA unidade_de_medida  VIRGULA ID mais_id FECHA_PARENTESE PONTO // 1 ou + ID
     | TEMPERAR ABRE_PARENTESE numero VIRGULA v2=unidade_de_medida  VIRGULA v1=ID FECHA_PARENTESE PONTO  //apenas 1 ID
       {
         if(!TabelaIngradientes.existeSimbolo($v1.getText())){
             error += "Linha: "+ $v1.getLine() + " - Ingrediente " + $v1.getText() + " não declarado\n";
         }
         if(!TabelaMedidas.existeSimbolo($v2.unidade_medida)){
             error += "Linha: "+ $v1.getLine() + " - Unidade de medida \"" + $v2.unidade_medida + "\" inválida\n";
         }
       }//apenas 1 ID
     | UNTAR ABRE_PARENTESE v1=ID FECHA_PARENTESE PONTO //apenas 1 ID
       {
         if(!TabelaUtensilios.existeSimbolo($v1.getText())){
             error += "Linha: "+ $v1.getLine() + " - Utensílio " + $v1.getText() + " não declarado\n";
         }
       }//apenas 1 ID
     | FRITAR ABRE_PARENTESE v1=ID FECHA_PARENTESE PONTO //apenas 1 ID
       {
         if(!TabelaIngradientes.existeSimbolo($v1.getText())){
             error += "Linha: "+ $v1.getLine() + " - Ingrediente " + $v1.getText() + " não declarado\n";
         }
         
       }//apenas 1 ID
     | MEXER ABRE_PARENTESE v1=ID FECHA_PARENTESE PONTO //apenas 1 ID
       {
         if(!TabelaIngradientes.existeSimbolo($v1.getText())){
             error += "Linha: "+ $v1.getLine() + " - Ingrediente " + $v1.getText() + " não declarado\n";
         }
         
       }//apenas 1 ID
     | MISTURAR ABRE_PARENTESE numero VIRGULA unidade_de_medida  VIRGULA ID mais_id FECHA_PARENTESE PONTO // 1 ou + ID
       
     | FOGO ABRE_PARENTESE v1=ID VIRGULA numero  VIRGULA unidade_de_tempo FECHA_PARENTESE PONTO //apenas 1 ID
       {
         if(!TabelaUtensilios.existeSimbolo($v1.getText())){
             error += "Linha: "+ $v1.getLine() + " - Utensílio " + $v1.getText() + " não declarado\n";
         }
       }//apenas 1 ID
;

mais_id returns[ List<String> list_Ingredientes, List<String> unidade_Medidas]
@init{
      $list_Ingredientes = new ArrayList<String>(); 
      $unidade_Medidas = new ArrayList<String>(); 
}
    : VIRGULA numero VIRGULA unidade_de_medida VIRGULA ID mais_id
    |
    ;

tempo returns [int _tempo, String _unidade_Tempo]
@init{$_tempo = -1; $_unidade_Tempo = "";}
    : POR numero unidade_de_tempo
    |
;

unidade_de_tempo returns [String unidade_tempo]
@init {$unidade_tempo = "";}
    : SEGUNDO {$unidade_tempo = "seg";}
    | MINUTO {$unidade_tempo = "min";}
    | HORA {$unidade_tempo = "hr";}
;


