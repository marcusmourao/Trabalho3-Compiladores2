/*
Construção de Compiladores 2
T3

*/

grammar Receita;

@members {
   public static String grupo="<<379387, 379352, 489450, 551740>>";
   PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();
   TabelaDeSimbolos TabelaDeTipos = new TabelaDeSimbolos("tipos");
   PilhaDeTabelas TabelasDeRegistros = new PilhaDeTabelas();
   String error="";
}

//A seguir declaramos todas as palavras e simbolos reservados da linguagem Receita como tokens do ANTLR

//Raiz do programa
receita: TITULO nivel corpo_receita rendimento ;

nivel
     : INICIANTE
     | INTERMEDIARIO
     | EXPERIENTE
     | MASTER_CHEF
     ;

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
XICARAS: 'xicaraS(cha)';
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

corpo_receita: ingredientes utensilios preparo ;

rendimento: RENDIMENTO DOIS_PONTOS numero FIM_RENDIMENTO ;

numero: INTEIRO
      | REAL
;

ingredientes: INGREDIENTES DOIS_PONTOS lista_ingredientes FIM_INGREDIENTES ;

utensilios: UTENSILIOS DOIS_PONTOS lista_utensilios FIM_UTENSILIOS ;

preparo: MODO_PREPARO DOIS_PONTOS procedimento FIM_MODO_PREPARO ;
           
lista_ingredientes: (quantidade ID PONTO)+ ;           

lista_utensilios: (ID PONTO)+ ;

procedimento: (verbo)+ ;

quantidade: numero unidade_de_medida (DE)? ;

/*ordem:
         verbo (artigo|preposicao)? quantidade? ID (maid_ID)* tempo PONTO
;*/



unidade_de_medida:
                     KILO|
                     GRAMA|
                     LATA|
                     XICARA|
                     XICARAS|
                     COLHER_CHA|
                     COLHERES_CHA|
                     COLHER_SOPA|
                     COLHERES_SOPA|
                     COPO_AMERICANO|
                     COPOS_AMERICANO|
                     UNIDADE |
                     UNIDADES |
                     CUBO|
                     MILI_LITRO|
                     LITRO
;

verbo:
       ACRESCENTAR ABRE_PARENTESE numero VIRGULA unidade_de_medida VIRGULA ID FECHA_PARENTESE PONTO
     | ADICIONAR ABRE_PARENTESE numero VIRGULA unidade_de_medida  VIRGULA ID FECHA_PARENTESE PONTO
     | ASSAR ABRE_PARENTESE ID VIRGULA numero VIRGULA unidade_de_tempo FECHA_PARENTESE PONTO
     | BATER ABRE_PARENTESE numero VIRGULA unidade_de_medida  VIRGULA ID mais_id FECHA_PARENTESE PONTO
     | COLOCAR ABRE_PARENTESE ID VIRGULA ID FECHA_PARENTESE PONTO
     | CORTAR ABRE_PARENTESE numero VIRGULA unidade_de_medida  VIRGULA ID FECHA_PARENTESE PONTO
     | ESPREMER ABRE_PARENTESE numero VIRGULA unidade_de_medida  VIRGULA ID FECHA_PARENTESE PONTO
     | FERVER ABRE_PARENTESE numero VIRGULA unidade_de_medida  VIRGULA ID FECHA_PARENTESE PONTO
     | FATIAR ABRE_PARENTESE numero VIRGULA unidade_de_medida  VIRGULA ID FECHA_PARENTESE PONTO
     | PENEIRAR ABRE_PARENTESE numero VIRGULA unidade_de_medida  VIRGULA ID FECHA_PARENTESE PONTO
     | PICAR ABRE_PARENTESE numero VIRGULA unidade_de_medida  VIRGULA ID FECHA_PARENTESE PONTO
     | SEPARAR ABRE_PARENTESE numero VIRGULA unidade_de_medida  VIRGULA ID mais_id FECHA_PARENTESE PONTO
     | TEMPERAR ABRE_PARENTESE numero VIRGULA unidade_de_medida  VIRGULA ID FECHA_PARENTESE PONTO
     | UNTAR ABRE_PARENTESE ID FECHA_PARENTESE PONTO
     | FRITAR ABRE_PARENTESE ID FECHA_PARENTESE PONTO
     | MEXER ABRE_PARENTESE ID FECHA_PARENTESE PONTO
     | MISTURAR ABRE_PARENTESE numero VIRGULA unidade_de_medida  VIRGULA ID mais_id FECHA_PARENTESE PONTO
     | FOGO ABRE_PARENTESE ID VIRGULA numero  VIRGULA unidade_de_tempo FECHA_PARENTESE PONTO
;

mais_id: VIRGULA numero VIRGULA unidade_de_medida VIRGULA ID mais_id
       |
       ;

tempo:
         POR numero unidade_de_tempo |
;

unidade_de_tempo:
                    SEGUNDO|
                    MINUTO|
                    HORA
;

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

