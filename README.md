# Trabalho3-Compiladores2
Terceiro trabalho prático Construção de Compiladores 2

Grupo 2:
Bruno Afonso Teixeira dos Santos - 379387
Eduardo Fernando Stenico - 379352
Fernando Messias da Silva - 489450
Marcus Marangon Mourão - 551740


Utilizamos o NetBeans 7.4 como ambiente de desenvolvimento e a biblioteca antlr 4.5.1.complete.
Este .zip é um projeto do NetBeans,  para compila-lo você pode gerar os arquivos "Receita.tokens", "ReceitaBaseListener.java", "ReceitaLexer.java", "ReceitaLexer.tokens", "ReceitaListener.java", "ReceitaParser.java" por meio de um plugin do ANTLR no próprio NetBeans ou utilizar a ferramenta ANTLR Works (todos os arquivos devem pertencer ao "package t3").


Para executar nosso compilador acesse a pasta "raiz_do_projeto/T3/dist", esta pasta conterá um arquivo chamado "T3.jar" que é o executável do nosso trabalho.

Dentro da pasta dist basta executar o seguinte comando:
      java -jar T3.jar args[0] args[1] args[2]

Sendo que:
    args[0] = Caminho do caso de teste
    args[1] = Caminho do arquivo .html gerado **IMPORTANTE** Os arquivos .html devem ser gerados na pasta "raiz_do_projeto/HTML" pois utilizam arquivos .css e .js contidos nesta pasta.
    args[2] = Caminho do arquivo .txt gerado


Localização dos arquivos:
    * Arquivos .html gerados: raiz_do_projeto/HTML
    * Arquivos casos de teste: raiz_do_projeto/T3/src/casosDeTeste
    * Arquivos saída gerada: raiz_do_projeto/T3/src/saida


Nome dos arquivos para os casos de teste sem extensão:
    * ct1
    * ct2
    * ct3
    * erro1-Simbolo-nao-identificado
    * erro2-Comentario-nao-fechado
    * erro3-sintatico
    * erro4-sintatico
    * erro5-sintatico
    * erro6-Identificador-ja-declarado
    * erro7-Identificador-ja-declarado
    * erro8-Ingrediente-nao-declarado
    * erro9-Utensilio-nao-declarado

Exemplos em meu computador pessoal:

1. java -jar T3.jar "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\T3\src\casosDeTeste\ct1.rec" "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\HTML\ct1.html" "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\T3\src\saida\ct1.txt"
2. java -jar T3.jar "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\T3\src\casosDeTeste\ct2.rec" "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\HTML\ct2.html" "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\T3\src\saida\ct2.txt"
3. java -jar T3.jar "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\T3\src\casosDeTeste\ct3.rec" "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\HTML\ct3.html" "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\T3\src\saida\ct3.txt"
4. java -jar T3.jar "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\T3\src\casosDeTeste\erro1-Simbolo-nao-identificado.rec" "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\HTML\erro1-Simbolo-nao-identificado.html" "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\T3\src\saida\erro1-Simbolo-nao-identificado.txt" 
5. java -jar T3.jar "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\T3\src\casosDeTeste\erro2-Comentario-nao-fechado.rec" "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\HTML\erro2-Comentario-nao-fechado.html" "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\T3\src\saida\erro2-Comentario-nao-fechado.txt"
6. java -jar T3.jar "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\T3\src\casosDeTeste\erro3-sintatico.rec" "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\HTML\erro3-sintatico.html" "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\T3\src\saida\erro3-sintatico.txt"
7. java -jar T3.jar "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\T3\src\casosDeTeste\erro4-sintatico.rec" "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\HTML\erro4-sintatico.html" "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\T3\src\saida\erro4-sintatico.txt"
8. java -jar T3.jar "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\T3\src\casosDeTeste\erro5-sintatico.rec" "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\HTML\erro5-sintatico.html" "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\T3\src\saida\erro5-sintatico.txt"
9. java -jar T3.jar "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\T3\src\casosDeTeste\erro6-Identificador-ja-declarado.rec" "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\HTML\erro6-Identificador-ja-declarado.html" "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\T3\src\saida\erro6-Identificador-ja-declarado.txt"
10. java -jar T3.jar "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\T3\src\casosDeTeste\erro7-Identificador-ja-declarado.rec" "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\HTML\erro7-Identificador-ja-declarado.html" "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\T3\src\saida\erro7-Identificador-ja-declarado.txt"
11. java -jar T3.jar "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\T3\src\casosDeTeste\erro8-Ingrediente-nao-declarado.rec" "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\HTML\erro8-Ingrediente-nao-declarado.html" "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\T3\src\saida\erro8-Ingrediente-nao-declarado.txt"
12. java -jar T3.jar "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\T3\src\casosDeTeste\erro9-Utensilio-nao-declarado.rec" "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\HTML\erro9-Utensilio-nao-declarado.html" "C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\T3\src\saida\erro9-Utensilio-nao-declarado.txt" 

