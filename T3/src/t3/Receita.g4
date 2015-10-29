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
     : 'iniciante'
     | 'intermediario'
     | 'experiente'
     | 'master_chef'
     ;

corpo_receita: ingredientes utensilios preparo ;

rendimento: 'rendimento' ':' numero 'fim_rendimento' ;

numero: INTEIRO
      | REAL
;

ingredientes: 'ingredientes' ':' lista_ingredientes 'fim_ingredientes' ;

utensilios: 'utensilios' ':' lista_utensilios 'fim_utensilios' ;

preparo: 'modo_preparo' ':' procedimento 'fim_modo_preparo' ;
           
lista_ingredientes: (quantidade ID '.')+ ;           

lista_utensilios: (ID '.')+ ;

procedimento: (verbo)+ ;

quantidade: numero unidade_de_medida ('de')? ;

/*ordem:
         verbo (artigo|preposicao)? quantidade? ID (maid_ID)* tempo '.'
;*/

unidade_de_medida:
                     'kg'|
                     'g'|
                     'lata'|
                     'xicara(cha)'|
                     'xicaras(cha)'|
                     'colher(sopa)'|
                     'colheres(sopa)'|
                     'copo(americano)'|
                     'copos(americano)'|
                     'unidade' |
                     'unidades' |
                     'cubo'
;

verbo:
       'acrescentar' '(' numero ',' unidade_de_medida ',' ID ')' '.'
     | 'adicionar' '(' numero ',' unidade_de_medida  ',' ID ')' '.'
     | 'assar' '(' ID ',' numero ',' unidade_de_tempo ')' '.'
     | 'bater' '(' numero ',' unidade_de_medida  ',' ID mais_id ')' '.'
     | 'colocar' '(' ID ',' ID ')' '.'
     | 'cortar' '(' numero ',' unidade_de_medida  ',' ID ')' '.'
     | 'espremer' '(' numero ',' unidade_de_medida  ',' ID ')' '.'
     | 'ferver' '(' numero ',' unidade_de_medida  ',' ID ')' '.'
     | 'fatiar' '(' numero ',' unidade_de_medida  ',' ID ')' '.'
     | 'peneirar' '(' numero ',' unidade_de_medida  ',' ID ')' '.'
     | 'picar' '(' numero ',' unidade_de_medida  ',' ID ')' '.'
     | 'separar' '(' numero ',' unidade_de_medida  ',' ID mais_id')' '.'
     | 'temperar' '(' numero ',' unidade_de_medida  ',' ID ')' '.'
     | 'untar' '(' ID ')' '.'
     | 'fritar' '(' ID ')' '.'
     | 'mexer' '(' ID ')' '.'
     | 'misturar' '(' numero ',' unidade_de_medida  ',' ID mais_id ')' '.'
     | 'fogo' '(' ID ',' numero  ',' unidade_de_tempo ')' '.'
;

mais_id: ',' numero ',' unidade_de_medida ',' ID mais_id
       |
       ;

tempo:
         'por' numero unidade_de_tempo |
;

unidade_de_tempo:
                    'seg'|
                    'min'|
                    'hr'
;

// Sequencia de caracteres entre aspas dupla de apenas uma linha
TITULO : '\'' ~('\n' | '\r' | '\'')* '\'' | '"' ~('\n' | '\r' | '"')* '"';

// Sequencia de letras e underscore, comecando por letra e terminando por letra
ID : ('_'|'a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'_')* | 'todos_ingredientes' | 'mistura';

// Sequencia de digitos
INTEIRO : ('0'..'9')+;

// Pelo menos um digito seguido de um ponto decimal e de uma sequencia de um ou mais digitos
REAL : ('0'..'9')+ '.' ('0'..'9')+;

//Espacos em branco, tabulacao e quebra de linha ignorados pelo analisador lexico.
WS : ( ' ' |'\t' | '\r' | '\n') {skip();}; 

//Comentarios curtos ignorados pelo analisador lexico.
COMENTARIO : '{' ~('\n'|'\r'|'\t')* '\r'? '\n'? '}'('\n'('\n'|'\t'))* {skip();};

