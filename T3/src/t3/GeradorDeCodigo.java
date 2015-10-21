package t3;

public class GeradorDeCodigo  {

    SaidaParser saida;

    public GeradorDeCodigo(SaidaParser saida) {
        this.saida = saida;
    }

   /* @Override
    public void enterPrograma(LAParser.ProgramaContext ctx) {
        saida.println("#include <stdio.h>");
        saida.println("#include <stdlib.h>");
        saida.println("int main(){");

    }

    @Override
    public void exitPrograma(LAParser.ProgramaContext ctx) {
        saida.println("return 0;");
        saida.println("}");
    }

    @Override
    public void enterCmd(LAParser.CmdContext ctx) {
        if (ctx.tipoCmd.equals("leia")) {
            saida.println("scanf(\"%" + verifica_tipo(ctx.identificador().tipoSimbolo) + "\",&" + ctx.identificador().txt + ");");
        } else {
            if (ctx.tipoCmd.equals("escreva")) {
                saida.println("printf(\"%" + verifica_tipo(ctx.expressao().tipoSimbolo) +  "\"," + ctx.expressao().txt +  ");");
            }
            else
                 if (ctx.tipoCmd.equals("se")) {
                saida.println("if("+ctx.expressao().getText()+"){");
                }
                 if (ctx.tipoCmd.equals("senao")){
                     saida.println("}else{");
                 }
            
        }

    }
    
    @Override
    public void enterComandos (LAParser.ComandosContext ctx)
    {
       
    }
    
    @Override
    public void enterDecl_local(LAParser.Decl_localContext ctx)
    {
      if(ctx.variavel.tipoSimbolo.equals("inteiro"))
          saida.println("int " + ctx.variavel.nomes.toString().substring(1, ctx.variavel.nomes.toString().length()-1) + ";") ;
      else
      {
          if(ctx.variavel.tipoSimbolo.equals("real"))
          saida.println("float " + ctx.variavel.nomes.toString().substring(1, ctx.variavel.nomes.toString().length()-1)+ ";") ;
          else
          {
             if(ctx.variavel.tipoSimbolo.equals("literal"))
                  saida.println("char " + ctx.variavel.nomes.toString().substring(1, ctx.variavel.nomes.toString().length()-1) + "[80]" + ";") ;
             else
                 if(ctx.variavel.tipoSimbolo.equals("logico"))
                  saida.println("bool " + ctx.variavel.nomes.toString().substring(1, ctx.variavel.nomes.toString().length()-1)+ ";") ;
          }
      }
    
    }

    public char verifica_tipo(String tipo) {
        if (tipo.equals("literal")) {
            return 's';
        } else {
            if (tipo.equals("inteiro")) {
                return 'd';
            } else {
                if (tipo.equals("real")) {
                    return 'f';
                }
            }
        }
        return 'd';
    }*/

}
