package t3;

public class GeradorDeCodigo extends ReceitaBaseListener {

    SaidaParser saida;

    public GeradorDeCodigo(SaidaParser saida) {
        this.saida = saida;
    }

    @Override
    public void enterReceita(ReceitaParser.ReceitaContext ctx) {
        saida.println(
                "<!DOCTYPE html>\n"
                + "<html lang=\"en\">\n"
                + "<head>\n"
                + "    <meta charset=\"utf-8\">\n"
                + "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n"
                + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n"
                + "    <meta name=\"description\" content=\"\">\n"
                + "    <meta name=\"author\" content=\"\">\n"
                + "    <title>RECEITA-CC2</title>\n"
                + "    <!-- Bootstrap Core CSS -->\n"
                + "    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n"
                + "    <!-- Custom CSS -->\n"
                + "    <link href=\"css/scrolling-nav.css\" rel=\"stylesheet\">\n"
                + "</head>\n"
                + "\n"
                + "<body id=\"page-top\" data-spy=\"scroll\" data-target=\".navbar-fixed-top\">\n"
                + "\n"
                + "    <!-- jQuery -->\n"
                + "    <script src=\"js/jquery.js\"></script>\n"
                + "    <!-- Bootstrap Core JavaScript -->\n"
                + "    <script src=\"js/bootstrap.min.js\"></script>\n"
                + "    <!-- Scrolling Nav JavaScript -->\n"
                + "    <script src=\"js/jquery.easing.min.js\"></script>\n"
                + "    <script src=\"js/scrolling-nav.js\"></script>\n"
                + "    <!-- Navigation -->\n"
                + "    <nav class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">\n"
                + "        <div class=\"container\">\n"
                + "            <div class=\"navbar-header page-scroll\">\n"
                + "                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\n"
                + "                    <span class=\"sr-only\">Toggle navigation</span>\n"
                + "                    <span class=\"icon-bar\"></span>\n"
                + "                    <span class=\"icon-bar\"></span>\n"
                + "                    <span class=\"icon-bar\"></span>\n"
                + "                </button>\n"
                + "                <a class=\"navbar-brand page-scroll\" href=\"#page-top\">" + ctx.TITULO().getText().replaceAll("\"", " ") + "</a>\n"
                + "            </div>\n"
                + "            <!-- Collect the nav links, forms, and other content for toggling -->\n"
                + "            <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\n"
                + "                <ul class=\"nav navbar-nav\" style=\" float:right\">\n"
                + "                    <!-- Hidden li included to remove active class from about link when scrolled up past about section -->\n"
                + "                    <li class=\"hidden\">\n"
                + "                        <a class=\"page-scroll\" href=\"#page-top\"></a>\n"
                + "                    </li>\n"
                + "                    <li>\n"
                + "                        <a class=\"page-scroll\" href=\"#about\"> Ingredientes </a>\n"
                + "                    </li>\n"
                + "                    <li>\n"
                + "                        <a class=\"page-scroll\" href=\"#services\">Modo de Preparo</a>\n"
                + "                    </li>\n"
                + "                    <li>\n"
                + "                        <a class=\"page-scroll\" href=\"#contact\">Rendimento</a>\n"
                + "                    </li>\n"
                + "                </ul>\n"
                + "            </div>\n"
                + "            <!-- /.navbar-collapse -->\n"
                + "        </div>\n"
                + "        <!-- /.container -->\n"
                + "    </nav>"
                + "<!-- Intro Section -->\n"
                + "    <section id=\"intro\" class=\"intro-section\">\n"
                + "        <div class=\"container\">\n"
                + "            <div class=\"row\">\n"
                + "                <div class=\"col-lg-12\">\n"
                + "                    <h1>" + ctx.TITULO().getText().replaceAll("\"", " ") + "</h1>\n"
                + "                    <a class=\"btn btn-default page-scroll\" href=\"#about\">Ver receita!</a>\n"
                + "                </div>\n"
                + "            </div>\n"
                + "        </div>\n"
                + "    </section>"
        );

    }

    @Override
    public void exitReceita(ReceitaParser.ReceitaContext ctx) {
        saida.println(
                "</body>\n"
                + "</html>");
    }

    @Override
    public void enterIngredientes(ReceitaParser.IngredientesContext ctx) {
        saida.println("<!-- About Section -->\n"
                + "    <section id=\"about\" class=\"about-section\">\n"
                + "        <div class=\"container\">\n"
                + "            <div class=\"row\">\n"
                + "                <div class=\"col-lg-12\">\n"
                + "                    <h1>Ingredientes</h1>\n"
                + "                </div>\n");

    }

    @Override
    public void exitIngredientes(ReceitaParser.IngredientesContext ctx) {

        saida.println("</div>\n"
                + "        </div>\n"
                + "    </section>");
    }

    @Override
    public void enterLista_ingredientes(ReceitaParser.Lista_ingredientesContext ctx) {
        String ingrediente, numero, unidade_medida;
        for (int i = 0; i < ctx.list_Ingredientes.size(); i++) {
            ingrediente = ctx.list_Ingredientes.get(i);
            numero = ctx._numero.get(i);
            unidade_medida = ctx.unidade_Medidas.get(i);
            if (unidade_medida.equals("unidade") || unidade_medida.equals("unidades")) {
                saida.println("<p>" + numero + " " + ingrediente + "</p>");
            } else {
                saida.println("<p>" + numero + " " + unidade_medida + " " + "de " + ingrediente + "</p>");
            }

        }
    }

    @Override
    public void enterPreparo(ReceitaParser.PreparoContext ctx) {
        saida.println("<!-- Services Section -->\n"
                + "    <section id=\"services\" class=\"services-section\">\n"
                + "        <div class=\"container\">\n"
                + "            <div class=\"row\">\n"
                + "                <div class=\"col-lg-12\">\n"
                + "                    <h1>Modo de Preparo</h1>\n"
                + "                </div>");
    }

    @Override
    public void exitPreparo(ReceitaParser.PreparoContext ctx) {
        saida.println("   </div>\n"
                + "        </div>\n"
                + "    </section>");
    }

    @Override
    public void enterRendimento(ReceitaParser.RendimentoContext ctx) {
        saida.println("<!-- Contact Section -->\n"
                + "    <section id=\"contact\" class=\"contact-section\">\n"
                + "        <div class=\"container\">\n"
                + "            <div class=\"row\">\n"
                + "                <div class=\"col-lg-12\">\n"
                + "                    <h1>Rendimento</h1>\n"
                + "                </div>");
        float rendi = Float.valueOf(ctx.numero().qnt_numero);
        if (rendi <= 1.0) {
            saida.println("<p>" + ctx.numero().qnt_numero + " porcao </p>");
        } else {
            saida.println("<p>" + ctx.numero().qnt_numero + " porcoes </p>");
        }

    }

    @Override
    public void exitRendimento(ReceitaParser.RendimentoContext ctx) {
        saida.println("  </div>\n"
                + "        </div>\n"
                + "    </section>");
    }

    @Override
    public void enterVerbo(ReceitaParser.VerboContext ctx) {

        if (ctx.comando.equals("acrescentar")) {
            if (ctx.unidade_de_medida().unidade_medida.equals("unidade") || ctx.unidade_de_medida().unidade_medida.equals("unidades")) {
                saida.println("<p> Acrescente " + ctx.numero().qnt_numero + " " + ctx._id + "</p>");
            } else {
                saida.println("<p> Acrescente " + ctx.numero().qnt_numero + " " + ctx.unidade_de_medida().unidade_medida + " de " + ctx._id + "</p>");
            }
        } else {
            if (ctx.comando.equals("adicionar")) {
                if (ctx.unidade_de_medida().unidade_medida.equals("unidade") || ctx.unidade_de_medida().unidade_medida.equals("unidades")) {
                    saida.println("<p> Adicione " + ctx.numero().qnt_numero + " " + ctx._id + "</p>");
                } else {
                    saida.println("<p> Adicione " + ctx.numero().qnt_numero + " " + ctx.unidade_de_medida().unidade_medida + " de " + ctx._id + "</p>");
                }

            } else {
                if (ctx.comando.equals("assar")) {
                    saida.println("<p> Asse as" + ctx._id + "por " + ctx.numero().qnt_numero + " " + ctx.unidade_de_tempo().unidade_tempo + "</p>");

                } else {
                    if (ctx.comando.equals("bater")) {
                        if (ctx._id.equals("mistura")) {
                            saida.println("<p> Bata a mistura ");
                        } else {
                            if (ctx.unidade_de_medida().unidade_medida.equals("unidade") || ctx.unidade_de_medida().unidade_medida.equals("unidades")) {
                                saida.println("<p> Bata " + ctx.numero().qnt_numero + " " + ctx._id);
                            } else {
                                saida.println("<p> Bata " + ctx.numero().qnt_numero + " " + ctx.unidade_de_medida().unidade_medida + " de " + ctx._id);
                            }
                        }
                        if (ctx.mais_id().list_Ingredientes.isEmpty()) {
                            saida.println("</p>");
                        } else {
                            if (ctx.mais_id().list_Ingredientes.get(0).equals("mistura")) {
                                saida.println(" com a mistura </p>");
                            } else {
                                if (ctx.mais_id().unidade_Medidas.get(0).equals("unidade") || ctx.mais_id().unidade_Medidas.get(0).equals("unidades")) {
                                    saida.println(" com " + ctx.mais_id()._numero.get(0) + " " + ctx.mais_id().list_Ingredientes.get(0) + " </p>");
                                } else {
                                    saida.println(" com " + ctx.mais_id()._numero.get(0) + " " + ctx.mais_id().unidade_Medidas.get(0) + " de " + ctx.mais_id().list_Ingredientes.get(0) + " </p>");
                                }
                            }

                        }

                    } else {
                        if (ctx.comando.equals("colocar")) {
                            saida.println("<p> Coloque a " + ctx._id + " na " + ctx._id2 + "</p>");

                        } else {
                            if (ctx.comando.equals("cortar")) {
                                if (ctx.unidade_de_medida().unidade_medida.equals("unidade") || ctx.unidade_de_medida().unidade_medida.equals("unidades")) {
                                    saida.println("<p> Corte " + ctx.numero().qnt_numero + " " + ctx._id + "</p>");
                                } else {
                                    saida.println("<p> Corte " + ctx.numero().qnt_numero + " " + ctx.unidade_de_medida().unidade_medida + " de " + ctx._id + "</p>");
                                }
                            } else {
                                if (ctx.comando.equals("espremer")) {
                                    if (ctx.unidade_de_medida().unidade_medida.equals("unidade") || ctx.unidade_de_medida().unidade_medida.equals("unidades")) {
                                        saida.println("<p> Esprema " + ctx.numero().qnt_numero + " " + ctx._id + "</p>");
                                    } else {
                                        saida.println("<p> Esprema " + ctx.numero().qnt_numero + " " + ctx.unidade_de_medida().unidade_medida + " de " + ctx._id + "</p>");
                                    }
                                } else {
                                    if (ctx.comando.equals("ferver")) {
                                        if (ctx.unidade_de_medida().unidade_medida.equals("unidade") || ctx.unidade_de_medida().unidade_medida.equals("unidades")) {
                                            saida.println("<p> Ferva " + ctx.numero().qnt_numero + " " + ctx._id + "</p>");
                                        } else {
                                            saida.println("<p> Ferva " + ctx.numero().qnt_numero + " " + ctx.unidade_de_medida().unidade_medida + " de " + ctx._id + "</p>");
                                        }
                                    } else {
                                        if (ctx.comando.equals("fatiar")) {
                                            if (ctx.unidade_de_medida().unidade_medida.equals("unidade") || ctx.unidade_de_medida().unidade_medida.equals("unidades")) {
                                                saida.println("<p> Fatie " + ctx.numero().qnt_numero + " " + ctx._id + "</p>");
                                            } else {
                                                saida.println("<p> Fatie " + ctx.numero().qnt_numero + " " + ctx.unidade_de_medida().unidade_medida + " de " + ctx._id + "</p>");
                                            }

                                        } else {
                                            if (ctx.comando.equals("peneirar")) {
                                                if (ctx.unidade_de_medida().unidade_medida.equals("unidade") || ctx.unidade_de_medida().unidade_medida.equals("unidades")) {
                                                    saida.println("<p> Peneire " + ctx.numero().qnt_numero + " " + ctx._id + "</p>");
                                                } else {
                                                    saida.println("<p> Peneire " + ctx.numero().qnt_numero + " " + ctx.unidade_de_medida().unidade_medida + " de " + ctx._id + "</p>");
                                                }

                                            } else {
                                                if (ctx.comando.equals("picar")) {
                                                    if (ctx.unidade_de_medida().unidade_medida.equals("unidade") || ctx.unidade_de_medida().unidade_medida.equals("unidades")) {
                                                        saida.println("<p> Pique " + ctx.numero().qnt_numero + " " + ctx._id + "</p>");
                                                    } else {
                                                        saida.println("<p> Pique " + ctx.numero().qnt_numero + " " + ctx.unidade_de_medida().unidade_medida + " de " + ctx._id + "</p>");
                                                    }

                                                } else {
                                                    if (ctx.comando.equals("separar")) {
                                                        if (ctx.unidade_de_medida().unidade_medida.equals("unidade") || ctx.unidade_de_medida().unidade_medida.equals("unidades")) {
                                                            saida.println("<p> Separe " + ctx.numero().qnt_numero + " " + ctx._id);
                                                        } else {
                                                            saida.println("<p> Separe " + ctx.numero().qnt_numero + " " + ctx.unidade_de_medida().unidade_medida + " de " + ctx._id);
                                                        }
                                                        if (ctx.mais_id().list_Ingredientes.isEmpty()) {
                                                            saida.println("</p>");
                                                        } else {
                                                            if (ctx.mais_id().unidade_Medidas.get(0).equals("unidade") || ctx.mais_id().unidade_Medidas.get(0).equals("unidades")) {
                                                                saida.println(" de " + ctx.mais_id()._numero.get(0) + " " + ctx.mais_id().list_Ingredientes.get(0) + " </p>");
                                                            } else {
                                                                saida.println(" de " + ctx.mais_id()._numero.get(0) + " " + ctx.mais_id().unidade_Medidas.get(0) + " de " + ctx.mais_id().list_Ingredientes.get(0) + " </p>");
                                                            }
                                                        }

                                                    } else {
                                                        if (ctx.comando.equals("temperar")) {
                                                            if (ctx.unidade_de_medida().unidade_medida.equals("unidade") || ctx.unidade_de_medida().unidade_medida.equals("unidades")) {
                                                                saida.println("<p> Tempere " + ctx.numero().qnt_numero + " " + ctx._id + "</p>");
                                                            } else {
                                                                saida.println("<p> Tempere " + ctx.numero().qnt_numero + " " + ctx.unidade_de_medida().unidade_medida + " de " + ctx._id + "</p>");
                                                            }

                                                        } else {
                                                            if (ctx.comando.equals("untar")) {
                                                                saida.println("<p> Unte uma " + ctx._id + "</p>");

                                                            } else {
                                                                if (ctx.comando.equals("fritar")) {
                                                                    saida.println("<p> Frite a " + ctx._id + "</p>");
                                                                } else {
                                                                    if (ctx.comando.equals("mexer")) {
                                                                        saida.println("<p> Mexa a " + ctx._id + "</p>");
                                                                    } else {
                                                                        if (ctx.comando.equals("misturar")) {
                                                                            if (ctx.unidade_de_medida().unidade_medida.equals("unidade") || ctx.unidade_de_medida().unidade_medida.equals("unidades")) {
                                                                                saida.println("<p> Misture " + ctx.numero().qnt_numero + " " + ctx._id);
                                                                            } else {
                                                                                saida.println("<p> Misture " + ctx.numero().qnt_numero + " " + ctx.unidade_de_medida().unidade_medida + " de " + ctx._id);
                                                                            }
                                                                            if (ctx.mais_id().list_Ingredientes.isEmpty()) {
                                                                                saida.println("</p>");
                                                                            } else {
                                                                                if (ctx.mais_id().unidade_Medidas.get(0).equals("unidade") || ctx.mais_id().unidade_Medidas.get(0).equals("unidades")) {
                                                                                    saida.println(" com " + ctx.mais_id()._numero.get(0) + " " + ctx.mais_id().list_Ingredientes.get(0) + " </p>");
                                                                                } else {
                                                                                    saida.println(" com " + ctx.mais_id()._numero.get(0) + " " + ctx.mais_id().unidade_Medidas.get(0) + " de " + ctx.mais_id().list_Ingredientes.get(0) + " </p>");
                                                                                }
                                                                            }

                                                                        } else {
                                                                            if (ctx.comando.equals("fogo")) {
                                                                                saida.println("<p> Leve a " + ctx._id + " ao forno por " + ctx.numero().qnt_numero + " " + ctx.unidade_de_tempo().unidade_tempo + "</p>");

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
    }

}
