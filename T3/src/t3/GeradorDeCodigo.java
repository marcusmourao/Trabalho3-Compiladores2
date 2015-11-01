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
      
       if(ctx.comando.equals("acrescentar")){
       
       }
       else{
           if(ctx.comando.equals("adicionar")){
       
           }
           else{
               if(ctx.comando.equals("assar")){
       
               }
               else{
                   if(ctx.comando.equals("bater")){
                       if(ctx.unidade_de_medida().unidade_medida.equals("unidade") || ctx.unidade_de_medida().unidade_medida.equals("unidades"))
                           saida.println("<p> Bata " + ctx.numero().qnt_numero +" "+ ctx._id + "</p>");
                       else
                           saida.println("<p> Bata " + ctx.numero().qnt_numero +" "+ ctx.unidade_de_medida().unidade_medida+ " de "+ ctx._id + "</p>");

                   }
                   else{
                       if(ctx.comando.equals("colocar")){
       
                       }
                       else{
                           if(ctx.comando.equals("cortar")){
       
                           }
                           else{
                               if(ctx.comando.equals("espremer")){
       
                               }
                               else{
                                   if(ctx.comando.equals("ferver")){
       
                                   }
                                   else{
                                       if(ctx.comando.equals("fatiar")){
       
                                       }
                                       else{
                                           if(ctx.comando.equals("peneirar")){
       
                                           }
                                           else{
                                               if(ctx.comando.equals("picar")){
       
                                               }
                                               else{
                                                   if(ctx.comando.equals("separar")){
       
                                                   }
                                                   else{
                                                       if(ctx.comando.equals("temperar")){
       
                                                       }
                                                       else{
                                                           if(ctx.comando.equals("untar")){
       
                                                           }
                                                           else{
                                                               if(ctx.comando.equals("fritar")){
       
                                                               }
                                                               else{
                                                                   if(ctx.comando.equals("mexer")){
       
                                                                   }
                                                                   else{
                                                                       if(ctx.comando.equals("misturar")){
       
                                                                       }
                                                                       else{
                                                                           if(ctx.comando.equals("fogo")){
       
                                                                           }
                                                                       }
                                                                   }
                                                               }
                                                           }
                                                       }
                                                   }
                                               }
                                           }
                                       }
                                   }
                               }
                           }
                       }
                   }
               }
           }
       }
       
       //saida.println("<p>" + ctx.comando + "</p>");
       
   }
   
   
   }
