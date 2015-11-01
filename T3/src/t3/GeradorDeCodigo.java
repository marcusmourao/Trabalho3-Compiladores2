package t3;

public class GeradorDeCodigo extends ReceitaBaseListener {

    SaidaParser saida;

    public GeradorDeCodigo(SaidaParser saida) {
        this.saida = saida;
    }

   @Override
   public void enterReceita(ReceitaParser.ReceitaContext ctx){
       saida.println(
"<html lang=' pt-BR' >\n" +
"<head>\n" +
"<meta charset=\"UTF-8\">\n" +
"<title>" + ctx.TITULO().getText().replaceAll("\"", " ")  +" - Linguagem Receita</title>\n" +
"</head>\n" +
"<body>\n" +
"<!-- O seu HTML vem aqui! -->\n" +
        "<h1>"+ ctx.TITULO().getText().replaceAll("\"", " ") + " - (" + ctx.nivel().nome_nivel+ ")</h1>");
   
   }
   
   @Override
   public void exitReceita(ReceitaParser.ReceitaContext ctx){
       saida.println(
               "</body>\n" +
               "</html>");
   }
   
   @Override 
   public void enterIngredientes( ReceitaParser.IngredientesContext ctx){
       saida.println("<h2> Lista de Ingredientes:  </h2>");

   }
   
   @Override
   public void enterLista_ingredientes(ReceitaParser.Lista_ingredientesContext ctx){
       String ingrediente,numero,unidade_medida;
       for(int i=0; i<ctx.list_Ingredientes.size(); i++){
           ingrediente = ctx.list_Ingredientes.get(i);
           numero = ctx._numero.get(i);
           unidade_medida = ctx.unidade_Medidas.get(i);
           if(unidade_medida.equals("unidade") || unidade_medida.equals("unidades") )
                saida.println("<p>"+ numero +" " + ingrediente  + "</p>");
           else
                saida.println("<p>"+ numero +" " + unidade_medida +" " + "de " + ingrediente  + "</p>");

       }
   }
   
   @Override public void enterPreparo(ReceitaParser.PreparoContext ctx){
       saida.println("<h2> Modo de Preparo </h2>");
   }
   
  
   
   @Override public void enterVerbo(ReceitaParser.VerboContext ctx){
       saida.println("<p>" + ctx.comando + "</p>");
   }
   
   
   }
