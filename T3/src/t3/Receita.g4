/*
Construção de Compiladores 2
T3

*/

grammar Receita;

@members {
   public static String grupo="<<379387, 379352, 489450, 551740>>";
   TabelaDeSimbolos TabelaIngredientes = new TabelaDeSimbolos("Ingredientes");
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
CUBOS: 'cubos';
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
        TabelaMedidas.adicionarSimbolo("colher(cha)","colher(cha)");
        TabelaMedidas.adicionarSimbolo("colheres(sopa)","colheres(sopa)");
        TabelaMedidas.adicionarSimbolo("colheres(cha)","colheres(cha)");
        TabelaMedidas.adicionarSimbolo("copo(americano)","copo(americano)");
        TabelaMedidas.adicionarSimbolo("copos(americano)","copos(americano)");
        TabelaMedidas.adicionarSimbolo("unidade","unidade");
        TabelaMedidas.adicionarSimbolo("unidades","unidades");
        TabelaMedidas.adicionarSimbolo("cubo","cubo");
        TabelaMedidas.adicionarSimbolo("cubos","cubos");
        TabelaMedidas.adicionarSimbolo("mL","mL");
        TabelaMedidas.adicionarSimbolo("L","L");
        TabelaIngredientes.adicionarSimbolo("mistura","mistura");
        TabelaIngredientes.adicionarSimbolo("todos_ingredientes","todos_ingredientes");

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
           
lista_ingredientes returns[ List<String> list_Ingredientes, List<String> unidade_Medidas, List<String> _numero]
@init{
      $list_Ingredientes = new ArrayList<String>(); 
      $unidade_Medidas = new ArrayList<String>();
      $_numero = new ArrayList<String>(); 
}
    : ( v2=quantidade v1=ID PONTO {
                                   
                                   if(!TabelaIngredientes.existeSimbolo($v1.getText())){
                                         TabelaIngredientes.adicionarSimbolo($v1.getText(), $v2._unidade_medida);
                                   }
                                   else{
                                        error += "Linha: "+ $v1.getLine() + " - Identificador " + $v1.getText() + " já declarado\n";
                                   }
                                   
                                   $list_Ingredientes.add($v1.getText()); 
                                   $unidade_Medidas.add($v2._unidade_medida);
                                   $_numero.add($v2._quantidade);
                                   
                                   
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

procedimento returns[String comando]
@init{$comando="";}
    : (v1=verbo{$comando=$v1.comando;})+ ;

quantidade returns[String _quantidade, String _unidade_medida]
@init{$_quantidade = ""; $_unidade_medida="";}
    : v1=numero v2=unidade_de_medida (DE)?
      { 
        $_unidade_medida = $v2.unidade_medida;
        $_quantidade = $v1.qnt_numero;
      }
    ;

unidade_de_medida returns[ String unidade_medida]
@init {$unidade_medida = "";}
    : KILO {$unidade_medida = "kg";}
    |GRAMA {$unidade_medida = "g";}
    |LATA  {$unidade_medida = "lata";}
    |XICARA {$unidade_medida = "xicara(cha)";}
    |XICARAS {$unidade_medida = "xicaras(cha)";}
    |COLHER_CHA {$unidade_medida = "colher(cha)";}
    |COLHERES_CHA {$unidade_medida = "colheres(cha)";}
    |COLHER_SOPA {$unidade_medida = "colher(sopa)";}
    |COLHERES_SOPA {$unidade_medida = "colheres(sopa)";}
    |COPO_AMERICANO {$unidade_medida = "copo(americano)";}
    |COPOS_AMERICANO {$unidade_medida = "copos(americano)";}
    |UNIDADE {$unidade_medida = "unidade";}
    |UNIDADES {$unidade_medida = "unidades";}
    |CUBO {$unidade_medida = "cubo";}
    |CUBOS {$unidade_medida = "cubos";}
    |MILI_LITRO {$unidade_medida = "mL";}
    |LITRO {$unidade_medida = "L";}
    | v1=ID {$unidade_medida = $v1.getText();}
    ;

verbo returns[String comando, String _id, String _id2]
@init{$comando = ""; $_id=""; $_id2="";}
    :
       ACRESCENTAR ABRE_PARENTESE numero VIRGULA v2=unidade_de_medida VIRGULA v1=ID FECHA_PARENTESE PONTO
       {
         if(!TabelaIngredientes.existeSimbolo($v1.getText())){
             error += "Linha: "+ $v1.getLine() + " - Identificador " + $v1.getText() + " não declarado\n";
         }
         if(!TabelaMedidas.existeSimbolo($v2.unidade_medida)){
             error += "Linha: "+ $v1.getLine() + " - Unidade de medida \"" + $v2.unidade_medida + "\" inválida\n";
         }
         $comando = "acrescentar";
         $_id=$v1.getText();
       }
     | ADICIONAR ABRE_PARENTESE numero VIRGULA v2=unidade_de_medida  VIRGULA v1=ID FECHA_PARENTESE PONTO
       {
         if(!TabelaIngredientes.existeSimbolo($v1.getText())){
             error += "Linha: "+ $v1.getLine() + " - Identificador " + $v1.getText() + " não declarado\n";
         }
         if(!TabelaMedidas.existeSimbolo($v2.unidade_medida)){
             error += "Linha: "+ $v1.getLine() + " - Unidade de medida \"" + $v2.unidade_medida + "\" inválida\n";
         }
         $comando = "adicionar";
         $_id=$v1.getText();

       }
     | ASSAR ABRE_PARENTESE v1=ID VIRGULA numero VIRGULA unidade_de_tempo FECHA_PARENTESE PONTO
       {
        if(!TabelaIngredientes.existeSimbolo($v1.getText())){
             error += "Linha: "+ $v1.getLine() + " - Ingrediente " + $v1.getText() + " não declarado\n";
         }
         $comando = "assar";
         $_id=$v1.getText();

       }
     | BATER ABRE_PARENTESE numero VIRGULA v2=unidade_de_medida  VIRGULA v1=ID v3=mais_id FECHA_PARENTESE PONTO // 1 ou + ID
       {
        if(!TabelaIngredientes.existeSimbolo($v1.getText())){
             error += "Linha: "+ $v1.getLine() + " - Ingrediente " + $v1.getText() + " não declarado\n";
         }
        if(!TabelaMedidas.existeSimbolo($v2.unidade_medida)){
             error += "Linha: "+ $v1.getLine() + " - Unidade de medida \"" + $v2.unidade_medida + "\" inválida\n";
         }
        for(String s: $v3.list_Ingredientes)
        {
            if(!TabelaIngredientes.existeSimbolo(s)){
             error += "Linha: "+ $v1.getLine() + " - Ingrediente " + s + " não declarado\n";
         }
        }
        
        for(String u: $v3.unidade_Medidas)
        {
            if(!TabelaMedidas.existeSimbolo(u)){
             error += "Linha: "+ $v1.getLine() + " - Unidade de medida \"" + u + "\" inválida\n";
         }
        }
         $comando = "bater";
         $_id = $v1.getText();
       }
     | COLOCAR ABRE_PARENTESE v1=ID VIRGULA vv2=ID FECHA_PARENTESE PONTO // 2 ID
       {
        if(!TabelaIngredientes.existeSimbolo($v1.getText())){
             error += "Linha: "+ $v1.getLine() + " - Ingrediente " + $v1.getText() + " não declarado\n";
         }
        if(!TabelaUtensilios.existeSimbolo($vv2.getText())){
             error += "Linha: "+ $v1.getLine() + " - Utenselio \"" + $vv2.getText() + "\" não declarado\n";
         }
         $comando = "colocar";
         $_id=$v1.getText();
         $_id2=$vv2.getText();

       }
     | CORTAR ABRE_PARENTESE numero VIRGULA v2=unidade_de_medida  VIRGULA v1=ID FECHA_PARENTESE PONTO 
       {
         if(!TabelaIngredientes.existeSimbolo($v1.getText())){
             error += "Linha: "+ $v1.getLine() + " - Ingrediente " + $v1.getText() + " não declarado\n";
         }
         if(!TabelaMedidas.existeSimbolo($v2.unidade_medida)){
             error += "Linha: "+ $v1.getLine() + " - Unidade de medida \"" + $v2.unidade_medida + "\" inválida\n";
         }
         $comando = "cortar";
         $_id=$v1.getText();
       }
     | ESPREMER ABRE_PARENTESE numero VIRGULA v2=unidade_de_medida  VIRGULA v1=ID FECHA_PARENTESE PONTO
       {
         if(!TabelaIngredientes.existeSimbolo($v1.getText())){
             error += "Linha: "+ $v1.getLine() + " - Ingrediente " + $v1.getText() + " não declarado\n";
         }
         if(!TabelaMedidas.existeSimbolo($v2.unidade_medida)){
             error += "Linha: "+ $v1.getLine() + " - Unidade de medida \"" + $v2.unidade_medida + "\" inválida\n";
         }
         $comando = "espremer";
         $_id=$v1.getText();
       }
     | FERVER ABRE_PARENTESE numero VIRGULA v2=unidade_de_medida  VIRGULA v1=ID FECHA_PARENTESE PONTO
       {
         if(!TabelaIngredientes.existeSimbolo($v1.getText())){
             error += "Linha: "+ $v1.getLine() + " - Ingrediente " + $v1.getText() + " não declarado\n";
         }
         if(!TabelaMedidas.existeSimbolo($v2.unidade_medida)){
             error += "Linha: "+ $v1.getLine() + " - Unidade de medida \"" + $v2.unidade_medida + "\" inválida\n";
         }
         $comando = "ferver";
         $_id=$v1.getText();

       }
     | FATIAR ABRE_PARENTESE numero VIRGULA v2=unidade_de_medida  VIRGULA v1=ID FECHA_PARENTESE PONTO
       {
         if(!TabelaIngredientes.existeSimbolo($v1.getText())){
             error += "Linha: "+ $v1.getLine() + " - Ingrediente " + $v1.getText() + " não declarado\n";
         }
         if(!TabelaMedidas.existeSimbolo($v2.unidade_medida)){
             error += "Linha: "+ $v1.getLine() + " - Unidade de medida \"" + $v2.unidade_medida + "\" inválida\n";
         }
         $comando = "fatiar";
         $_id=$v1.getText();

       }
     | PENEIRAR ABRE_PARENTESE numero VIRGULA v2=unidade_de_medida  VIRGULA v1=ID FECHA_PARENTESE PONTO
       {
         if(!TabelaIngredientes.existeSimbolo($v1.getText())){
             error += "Linha: "+ $v1.getLine() + " - Ingrediente " + $v1.getText() + " não declarado\n";
         }
         if(!TabelaMedidas.existeSimbolo($v2.unidade_medida)){
             error += "Linha: "+ $v1.getLine() + " - Unidade de medida \"" + $v2.unidade_medida + "\" inválida\n";
         }
         $comando = "peneirar";
         $_id=$v1.getText();

       }
     | PICAR ABRE_PARENTESE numero VIRGULA v2=unidade_de_medida  VIRGULA v1=ID FECHA_PARENTESE PONTO
       {
         if(!TabelaIngredientes.existeSimbolo($v1.getText())){
             error += "Linha: "+ $v1.getLine() + " - Ingrediente " + $v1.getText() + " não declarado\n";
         }
         if(!TabelaMedidas.existeSimbolo($v2.unidade_medida)){
             error += "Linha: "+ $v1.getLine() + " - Unidade de medida \"" + $v2.unidade_medida + "\" inválida\n";
         }
         $comando = "picar";
         $_id=$v1.getText();

       }
     | SEPARAR ABRE_PARENTESE numero VIRGULA v2=unidade_de_medida  VIRGULA v1=ID v3=mais_id FECHA_PARENTESE PONTO
       {
        if(!TabelaIngredientes.existeSimbolo($v1.getText())){
             error += "Linha: "+ $v1.getLine() + " - Ingrediente " + $v1.getText() + " não declarado\n";
         }
        if(!TabelaMedidas.existeSimbolo($v2.unidade_medida)){
             error += "Linha: "+ $v1.getLine() + " - Unidade de medida \"" + $v2.unidade_medida + "\" inválida\n";
         }
        for(String s: $v3.list_Ingredientes)
        {
            if(!TabelaIngredientes.existeSimbolo(s)){
             error += "Linha: "+ $v1.getLine() + " - Ingrediente " + s + " não declarado\n";
         }
        }
        
        for(String u: $v3.unidade_Medidas)
        {
            if(!TabelaMedidas.existeSimbolo(u)){
             error += "Linha: "+ $v1.getLine() + " - Unidade de medida \"" + u + "\" inválida\n";
         }
        }
         $comando = "separar";
         $_id=$v1.getText();

       }
     | TEMPERAR ABRE_PARENTESE numero VIRGULA v2=unidade_de_medida  VIRGULA v1=ID FECHA_PARENTESE PONTO
       {
         if(!TabelaIngredientes.existeSimbolo($v1.getText())){
             error += "Linha: "+ $v1.getLine() + " - Ingrediente " + $v1.getText() + " não declarado\n";
         }
         if(!TabelaMedidas.existeSimbolo($v2.unidade_medida)){
             error += "Linha: "+ $v1.getLine() + " - Unidade de medida \"" + $v2.unidade_medida + "\" inválida\n";
         }
         $comando = "temperar";
         $_id=$v1.getText();

       }
     | UNTAR ABRE_PARENTESE v1=ID FECHA_PARENTESE PONTO
       {
         if(!TabelaUtensilios.existeSimbolo($v1.getText())){
             error += "Linha: "+ $v1.getLine() + " - Utensílio " + $v1.getText() + " não declarado\n";
         }
         $comando = "untar";
         $_id=$v1.getText();

       }
     | FRITAR ABRE_PARENTESE v1=ID FECHA_PARENTESE PONTO
       {
         if(!TabelaIngredientes.existeSimbolo($v1.getText())){
             error += "Linha: "+ $v1.getLine() + " - Ingrediente " + $v1.getText() + " não declarado\n";
         }
         $comando = "fritar";
         $_id=$v1.getText();

       }
     | MEXER ABRE_PARENTESE v1=ID FECHA_PARENTESE PONTO
       {
         if(!TabelaIngredientes.existeSimbolo($v1.getText())){
             error += "Linha: "+ $v1.getLine() + " - Ingrediente " + $v1.getText() + " não declarado\n";
         }
         $comando = "mexer";
         $_id=$v1.getText();

       }
     | MISTURAR ABRE_PARENTESE numero VIRGULA v2=unidade_de_medida  VIRGULA v1=ID v3=mais_id FECHA_PARENTESE PONTO
       {
        if(!TabelaIngredientes.existeSimbolo($v1.getText())){
             error += "Linha: "+ $v1.getLine() + " - Ingrediente " + $v1.getText() + " não declarado\n";
         }
        if(!TabelaMedidas.existeSimbolo($v2.unidade_medida)){
             error += "Linha: "+ $v1.getLine() + " - Unidade de medida \"" + $v2.unidade_medida + "\" inválida\n";
         }
        for(String s: $v3.list_Ingredientes)
        {
            if(!TabelaIngredientes.existeSimbolo(s)){
             error += "Linha: "+ $v1.getLine() + " - Ingrediente " + s + " não declarado\n";
         }
        }
        
        for(String u: $v3.unidade_Medidas)
        {
            if(!TabelaMedidas.existeSimbolo(u)){
             error += "Linha: "+ $v1.getLine() + " - Unidade de medida \"" + u + "\" inválida\n";
         }
        }
        $comando = "misturar";
         $_id=$v1.getText();

       }
       
     | FOGO ABRE_PARENTESE v1=ID VIRGULA numero  VIRGULA unidade_de_tempo FECHA_PARENTESE PONTO 
       {
         if(!TabelaUtensilios.existeSimbolo($v1.getText())){
             error += "Linha: "+ $v1.getLine() + " - Utensílio " + $v1.getText() + " não declarado\n";
         }
         $comando = "fogo";
         $_id=$v1.getText();

       }
;

mais_id returns[ List<String> list_Ingredientes, List<String> unidade_Medidas, List<String> _numero]
@init{
      $list_Ingredientes = new ArrayList<String>(); 
      $unidade_Medidas = new ArrayList<String>();
      $_numero = new ArrayList<String>();
}
    : VIRGULA v4=numero VIRGULA v2=unidade_de_medida VIRGULA v1=ID v3=mais_id
      {
         $list_Ingredientes.add($v1.getText());
         $unidade_Medidas.add($v2.unidade_medida);
         $_numero.add($v4.qnt_numero);
         $list_Ingredientes.addAll($v3.list_Ingredientes);
         $unidade_Medidas.addAll($v3.unidade_Medidas);
         $_numero.addAll($v3._numero);
      }
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


