// Generated from C:\Users\Marcus\Downloads\Trabalho1-Compiladores2-Grupo2\T1\src\t3\Receita.g4 by ANTLR 4.2.2
package t3;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReceitaParser}.
 */
public interface ReceitaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReceitaParser#unidade_de_tempo}.
	 * @param ctx the parse tree
	 */
	void enterUnidade_de_tempo(@NotNull ReceitaParser.Unidade_de_tempoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceitaParser#unidade_de_tempo}.
	 * @param ctx the parse tree
	 */
	void exitUnidade_de_tempo(@NotNull ReceitaParser.Unidade_de_tempoContext ctx);

	/**
	 * Enter a parse tree produced by {@link ReceitaParser#mais_id}.
	 * @param ctx the parse tree
	 */
	void enterMais_id(@NotNull ReceitaParser.Mais_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceitaParser#mais_id}.
	 * @param ctx the parse tree
	 */
	void exitMais_id(@NotNull ReceitaParser.Mais_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link ReceitaParser#unidade_de_medida}.
	 * @param ctx the parse tree
	 */
	void enterUnidade_de_medida(@NotNull ReceitaParser.Unidade_de_medidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceitaParser#unidade_de_medida}.
	 * @param ctx the parse tree
	 */
	void exitUnidade_de_medida(@NotNull ReceitaParser.Unidade_de_medidaContext ctx);

	/**
	 * Enter a parse tree produced by {@link ReceitaParser#tempo}.
	 * @param ctx the parse tree
	 */
	void enterTempo(@NotNull ReceitaParser.TempoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceitaParser#tempo}.
	 * @param ctx the parse tree
	 */
	void exitTempo(@NotNull ReceitaParser.TempoContext ctx);

	/**
	 * Enter a parse tree produced by {@link ReceitaParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(@NotNull ReceitaParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceitaParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(@NotNull ReceitaParser.NumeroContext ctx);

	/**
	 * Enter a parse tree produced by {@link ReceitaParser#corpo_receita}.
	 * @param ctx the parse tree
	 */
	void enterCorpo_receita(@NotNull ReceitaParser.Corpo_receitaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceitaParser#corpo_receita}.
	 * @param ctx the parse tree
	 */
	void exitCorpo_receita(@NotNull ReceitaParser.Corpo_receitaContext ctx);

	/**
	 * Enter a parse tree produced by {@link ReceitaParser#quantidade}.
	 * @param ctx the parse tree
	 */
	void enterQuantidade(@NotNull ReceitaParser.QuantidadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceitaParser#quantidade}.
	 * @param ctx the parse tree
	 */
	void exitQuantidade(@NotNull ReceitaParser.QuantidadeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ReceitaParser#ingredientes}.
	 * @param ctx the parse tree
	 */
	void enterIngredientes(@NotNull ReceitaParser.IngredientesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceitaParser#ingredientes}.
	 * @param ctx the parse tree
	 */
	void exitIngredientes(@NotNull ReceitaParser.IngredientesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ReceitaParser#lista_utensilios}.
	 * @param ctx the parse tree
	 */
	void enterLista_utensilios(@NotNull ReceitaParser.Lista_utensiliosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceitaParser#lista_utensilios}.
	 * @param ctx the parse tree
	 */
	void exitLista_utensilios(@NotNull ReceitaParser.Lista_utensiliosContext ctx);

	/**
	 * Enter a parse tree produced by {@link ReceitaParser#rendimento}.
	 * @param ctx the parse tree
	 */
	void enterRendimento(@NotNull ReceitaParser.RendimentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceitaParser#rendimento}.
	 * @param ctx the parse tree
	 */
	void exitRendimento(@NotNull ReceitaParser.RendimentoContext ctx);

	/**
	 * Enter a parse tree produced by {@link ReceitaParser#receita}.
	 * @param ctx the parse tree
	 */
	void enterReceita(@NotNull ReceitaParser.ReceitaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceitaParser#receita}.
	 * @param ctx the parse tree
	 */
	void exitReceita(@NotNull ReceitaParser.ReceitaContext ctx);

	/**
	 * Enter a parse tree produced by {@link ReceitaParser#preparo}.
	 * @param ctx the parse tree
	 */
	void enterPreparo(@NotNull ReceitaParser.PreparoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceitaParser#preparo}.
	 * @param ctx the parse tree
	 */
	void exitPreparo(@NotNull ReceitaParser.PreparoContext ctx);

	/**
	 * Enter a parse tree produced by {@link ReceitaParser#lista_ingredientes}.
	 * @param ctx the parse tree
	 */
	void enterLista_ingredientes(@NotNull ReceitaParser.Lista_ingredientesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceitaParser#lista_ingredientes}.
	 * @param ctx the parse tree
	 */
	void exitLista_ingredientes(@NotNull ReceitaParser.Lista_ingredientesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ReceitaParser#verbo}.
	 * @param ctx the parse tree
	 */
	void enterVerbo(@NotNull ReceitaParser.VerboContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceitaParser#verbo}.
	 * @param ctx the parse tree
	 */
	void exitVerbo(@NotNull ReceitaParser.VerboContext ctx);

	/**
	 * Enter a parse tree produced by {@link ReceitaParser#utensilios}.
	 * @param ctx the parse tree
	 */
	void enterUtensilios(@NotNull ReceitaParser.UtensiliosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceitaParser#utensilios}.
	 * @param ctx the parse tree
	 */
	void exitUtensilios(@NotNull ReceitaParser.UtensiliosContext ctx);

	/**
	 * Enter a parse tree produced by {@link ReceitaParser#procedimento}.
	 * @param ctx the parse tree
	 */
	void enterProcedimento(@NotNull ReceitaParser.ProcedimentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceitaParser#procedimento}.
	 * @param ctx the parse tree
	 */
	void exitProcedimento(@NotNull ReceitaParser.ProcedimentoContext ctx);

	/**
	 * Enter a parse tree produced by {@link ReceitaParser#nivel}.
	 * @param ctx the parse tree
	 */
	void enterNivel(@NotNull ReceitaParser.NivelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceitaParser#nivel}.
	 * @param ctx the parse tree
	 */
	void exitNivel(@NotNull ReceitaParser.NivelContext ctx);
}