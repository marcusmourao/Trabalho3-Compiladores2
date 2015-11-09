package t3;

public class GeradorDeCodigo extends ReceitaBaseListener {

    SaidaParser saida;

    public GeradorDeCodigo(SaidaParser saida) {
        this.saida = saida;
    }

    @Override
    public void enterReceita(ReceitaParser.ReceitaContext ctx) {
        saida.println(
                "<html lang=' pt-BR' >\n"
                + "<head>\n"
                + "<meta charset=\"UTF-8\">\n"
                + "<title>" + ctx.TITULO().getText().replaceAll("\"", " ") + " - Linguagem Receita</title>\n"
                + "</head>\n"
                + "<body>\n"
                + "<!-- O seu HTML vem aqui! -->\n"
                + "<h1>" + ctx.TITULO().getText().replaceAll("\"", " ") + " - (" + ctx.nivel().nome_nivel + ")</h1>");

    }

    @Override
    public void exitReceita(ReceitaParser.ReceitaContext ctx) {
        saida.println(
                "</body>\n"
                + "</html>");
    }

    @Override
    public void enterIngredientes(ReceitaParser.IngredientesContext ctx) {
        saida.println("<h2> Lista de Ingredientes </h2>");

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
        saida.println("<h2> Modo de Preparo </h2>");
    }

    @Override
    public void enterRendimento(ReceitaParser.RendimentoContext ctx) {
        float rendi = Float.valueOf(ctx.numero().qnt_numero);
        if(rendi <= 1.0)
            saida.println("<h2> Rendimento </h2> <p>" + ctx.numero().qnt_numero + " porcao </p>");
        else
            saida.println("<h2> Rendimento </h2> <p>" + ctx.numero().qnt_numero + " porcoes </p>");

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
