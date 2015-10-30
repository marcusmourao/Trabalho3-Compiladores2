// Generated from C:\Users\Marcus\Documents\GitHub\Trabalho3-Compiladores2\T3\src\t3\Receita.g4 by ANTLR 4.2.2
package t3;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ReceitaParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INICIANTE=1, INTERMEDIARIO=2, EXPERIENTE=3, MASTER_CHEF=4, RENDIMENTO=5, 
		FIM_RENDIMENTO=6, DOIS_PONTOS=7, INGREDIENTES=8, FIM_INGREDIENTES=9, UTENSILIOS=10, 
		FIM_UTENSILIOS=11, MODO_PREPARO=12, FIM_MODO_PREPARO=13, PONTO=14, DE=15, 
		KILO=16, GRAMA=17, LATA=18, XICARA=19, XICARAS=20, COLHER_SOPA=21, COLHER_CHA=22, 
		COLHERES_SOPA=23, COLHERES_CHA=24, COPO_AMERICANO=25, COPOS_AMERICANO=26, 
		UNIDADE=27, UNIDADES=28, CUBO=29, MILI_LITRO=30, LITRO=31, VIRGULA=32, 
		ABRE_PARENTESE=33, FECHA_PARENTESE=34, POR=35, SEGUNDO=36, MINUTO=37, 
		HORA=38, ACRESCENTAR=39, ADICIONAR=40, ASSAR=41, BATER=42, COLOCAR=43, 
		ESPREMER=44, CORTAR=45, FERVER=46, FATIAR=47, PENEIRAR=48, PICAR=49, SEPARAR=50, 
		TEMPERAR=51, UNTAR=52, MEXER=53, FRITAR=54, MISTURAR=55, FOGO=56, TITULO=57, 
		ID=58, INTEIRO=59, REAL=60, WS=61, COMENTARIO=62;
	public static final String[] tokenNames = {
		"<INVALID>", "'iniciante'", "'intermediario'", "'experiente'", "'master_chef'", 
		"'rendimento'", "'fim_rendimento'", "':'", "'ingredientes'", "'fim_ingredientes'", 
		"'utensilios'", "'fim_utensilios'", "'modo_preparo'", "'fim_modo_preparo'", 
		"'.'", "'de'", "'kg'", "'g'", "'lata'", "'xicara(cha)'", "'xicaras(cha)'", 
		"'colher(sopa)'", "'colher(cha)'", "'colheres(sopa)'", "'colheres(cha)'", 
		"'copo(americano)'", "'copos(americano)'", "'unidade'", "'unidades'", 
		"'cubo'", "'ml'", "'l'", "','", "'('", "')'", "'por'", "'seg'", "'min'", 
		"'hr'", "'acrescentar'", "'adicionar'", "'assar'", "'bater'", "'colocar'", 
		"'espremer'", "'cortar'", "'ferver'", "'fatiar'", "'peneirar'", "'picar'", 
		"'separar'", "'temperar'", "'untar'", "'mexer'", "'fritar'", "'misturar'", 
		"'fogo'", "TITULO", "ID", "INTEIRO", "REAL", "WS", "COMENTARIO"
	};
	public static final int
		RULE_receita = 0, RULE_nivel = 1, RULE_corpo_receita = 2, RULE_rendimento = 3, 
		RULE_numero = 4, RULE_ingredientes = 5, RULE_utensilios = 6, RULE_preparo = 7, 
		RULE_lista_ingredientes = 8, RULE_lista_utensilios = 9, RULE_procedimento = 10, 
		RULE_quantidade = 11, RULE_unidade_de_medida = 12, RULE_verbo = 13, RULE_mais_id = 14, 
		RULE_tempo = 15, RULE_unidade_de_tempo = 16;
	public static final String[] ruleNames = {
		"receita", "nivel", "corpo_receita", "rendimento", "numero", "ingredientes", 
		"utensilios", "preparo", "lista_ingredientes", "lista_utensilios", "procedimento", 
		"quantidade", "unidade_de_medida", "verbo", "mais_id", "tempo", "unidade_de_tempo"
	};

	@Override
	public String getGrammarFileName() { return "Receita.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	   public static String grupo="<<379387, 379352, 489450, 551740>>";
	   TabelaDeSimbolos TabelaIngredientes = new TabelaDeSimbolos("Ingredientes");
	   TabelaDeSimbolos TabelaUtensilios = new TabelaDeSimbolos("Utensilios");
	   TabelaDeSimbolos TabelaMedidas = new TabelaDeSimbolos("Unidades de Medida");
	   String error="";

	public ReceitaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ReceitaContext extends ParserRuleContext {
		public RendimentoContext rendimento() {
			return getRuleContext(RendimentoContext.class,0);
		}
		public Corpo_receitaContext corpo_receita() {
			return getRuleContext(Corpo_receitaContext.class,0);
		}
		public TerminalNode TITULO() { return getToken(ReceitaParser.TITULO, 0); }
		public NivelContext nivel() {
			return getRuleContext(NivelContext.class,0);
		}
		public ReceitaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).enterReceita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).exitReceita(this);
		}
	}

	public final ReceitaContext receita() throws RecognitionException {
		ReceitaContext _localctx = new ReceitaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_receita);
		try {
			enterOuterAlt(_localctx, 1);
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
			        TabelaMedidas.adicionarSimbolo("ml","ml");
			        TabelaMedidas.adicionarSimbolo("l","l");
			        TabelaIngredientes.adicionarSimbolo("mistura","mistura");
			        TabelaIngredientes.adicionarSimbolo("todos_ingredientes","todos_ingredientes");

			       
			setState(35); match(TITULO);
			setState(36); nivel();
			setState(37); corpo_receita();
			setState(38); rendimento();
			if(error!="")throw new RuntimeException(error);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NivelContext extends ParserRuleContext {
		public String nome_nivel;
		public TerminalNode EXPERIENTE() { return getToken(ReceitaParser.EXPERIENTE, 0); }
		public TerminalNode INICIANTE() { return getToken(ReceitaParser.INICIANTE, 0); }
		public TerminalNode MASTER_CHEF() { return getToken(ReceitaParser.MASTER_CHEF, 0); }
		public TerminalNode INTERMEDIARIO() { return getToken(ReceitaParser.INTERMEDIARIO, 0); }
		public NivelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nivel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).enterNivel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).exitNivel(this);
		}
	}

	public final NivelContext nivel() throws RecognitionException {
		NivelContext _localctx = new NivelContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_nivel);
		 ((NivelContext)_localctx).nome_nivel =  "";
		try {
			setState(49);
			switch (_input.LA(1)) {
			case INICIANTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(41); match(INICIANTE);
				((NivelContext)_localctx).nome_nivel =  "iniciante";
				}
				break;
			case INTERMEDIARIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(43); match(INTERMEDIARIO);
				((NivelContext)_localctx).nome_nivel =  "intermediario";
				}
				break;
			case EXPERIENTE:
				enterOuterAlt(_localctx, 3);
				{
				setState(45); match(EXPERIENTE);
				((NivelContext)_localctx).nome_nivel =  "experiente";
				}
				break;
			case MASTER_CHEF:
				enterOuterAlt(_localctx, 4);
				{
				setState(47); match(MASTER_CHEF);
				((NivelContext)_localctx).nome_nivel =  "master_chef";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Corpo_receitaContext extends ParserRuleContext {
		public UtensiliosContext utensilios() {
			return getRuleContext(UtensiliosContext.class,0);
		}
		public PreparoContext preparo() {
			return getRuleContext(PreparoContext.class,0);
		}
		public IngredientesContext ingredientes() {
			return getRuleContext(IngredientesContext.class,0);
		}
		public Corpo_receitaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo_receita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).enterCorpo_receita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).exitCorpo_receita(this);
		}
	}

	public final Corpo_receitaContext corpo_receita() throws RecognitionException {
		Corpo_receitaContext _localctx = new Corpo_receitaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_corpo_receita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); ingredientes();
			setState(52); utensilios();
			setState(53); preparo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RendimentoContext extends ParserRuleContext {
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode DOIS_PONTOS() { return getToken(ReceitaParser.DOIS_PONTOS, 0); }
		public TerminalNode FIM_RENDIMENTO() { return getToken(ReceitaParser.FIM_RENDIMENTO, 0); }
		public TerminalNode RENDIMENTO() { return getToken(ReceitaParser.RENDIMENTO, 0); }
		public RendimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rendimento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).enterRendimento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).exitRendimento(this);
		}
	}

	public final RendimentoContext rendimento() throws RecognitionException {
		RendimentoContext _localctx = new RendimentoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rendimento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); match(RENDIMENTO);
			setState(56); match(DOIS_PONTOS);
			setState(57); numero();
			setState(58); match(FIM_RENDIMENTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumeroContext extends ParserRuleContext {
		public String qnt_numero;
		public Token v1;
		public Token v2;
		public TerminalNode INTEIRO() { return getToken(ReceitaParser.INTEIRO, 0); }
		public TerminalNode REAL() { return getToken(ReceitaParser.REAL, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).exitNumero(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_numero);
		((NumeroContext)_localctx).qnt_numero =  "";
		try {
			setState(64);
			switch (_input.LA(1)) {
			case INTEIRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(60); ((NumeroContext)_localctx).v1 = match(INTEIRO);
				((NumeroContext)_localctx).qnt_numero =  ((NumeroContext)_localctx).v1.getText();
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(62); ((NumeroContext)_localctx).v2 = match(REAL);
				((NumeroContext)_localctx).qnt_numero =  ((NumeroContext)_localctx).v2.getText();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IngredientesContext extends ParserRuleContext {
		public TerminalNode FIM_INGREDIENTES() { return getToken(ReceitaParser.FIM_INGREDIENTES, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(ReceitaParser.DOIS_PONTOS, 0); }
		public Lista_ingredientesContext lista_ingredientes() {
			return getRuleContext(Lista_ingredientesContext.class,0);
		}
		public TerminalNode INGREDIENTES() { return getToken(ReceitaParser.INGREDIENTES, 0); }
		public IngredientesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ingredientes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).enterIngredientes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).exitIngredientes(this);
		}
	}

	public final IngredientesContext ingredientes() throws RecognitionException {
		IngredientesContext _localctx = new IngredientesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ingredientes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); match(INGREDIENTES);
			setState(67); match(DOIS_PONTOS);
			setState(68); lista_ingredientes();
			setState(69); match(FIM_INGREDIENTES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UtensiliosContext extends ParserRuleContext {
		public Lista_utensiliosContext lista_utensilios() {
			return getRuleContext(Lista_utensiliosContext.class,0);
		}
		public TerminalNode DOIS_PONTOS() { return getToken(ReceitaParser.DOIS_PONTOS, 0); }
		public TerminalNode UTENSILIOS() { return getToken(ReceitaParser.UTENSILIOS, 0); }
		public TerminalNode FIM_UTENSILIOS() { return getToken(ReceitaParser.FIM_UTENSILIOS, 0); }
		public UtensiliosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_utensilios; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).enterUtensilios(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).exitUtensilios(this);
		}
	}

	public final UtensiliosContext utensilios() throws RecognitionException {
		UtensiliosContext _localctx = new UtensiliosContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_utensilios);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); match(UTENSILIOS);
			setState(72); match(DOIS_PONTOS);
			setState(73); lista_utensilios();
			setState(74); match(FIM_UTENSILIOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreparoContext extends ParserRuleContext {
		public TerminalNode DOIS_PONTOS() { return getToken(ReceitaParser.DOIS_PONTOS, 0); }
		public ProcedimentoContext procedimento() {
			return getRuleContext(ProcedimentoContext.class,0);
		}
		public TerminalNode FIM_MODO_PREPARO() { return getToken(ReceitaParser.FIM_MODO_PREPARO, 0); }
		public TerminalNode MODO_PREPARO() { return getToken(ReceitaParser.MODO_PREPARO, 0); }
		public PreparoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preparo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).enterPreparo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).exitPreparo(this);
		}
	}

	public final PreparoContext preparo() throws RecognitionException {
		PreparoContext _localctx = new PreparoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_preparo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(MODO_PREPARO);
			setState(77); match(DOIS_PONTOS);
			setState(78); procedimento();
			setState(79); match(FIM_MODO_PREPARO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lista_ingredientesContext extends ParserRuleContext {
		public List<String> list_Ingredientes;
		public List<String> unidade_Medidas;
		public QuantidadeContext v2;
		public Token v1;
		public List<TerminalNode> ID() { return getTokens(ReceitaParser.ID); }
		public QuantidadeContext quantidade(int i) {
			return getRuleContext(QuantidadeContext.class,i);
		}
		public List<QuantidadeContext> quantidade() {
			return getRuleContexts(QuantidadeContext.class);
		}
		public TerminalNode PONTO(int i) {
			return getToken(ReceitaParser.PONTO, i);
		}
		public List<TerminalNode> PONTO() { return getTokens(ReceitaParser.PONTO); }
		public TerminalNode ID(int i) {
			return getToken(ReceitaParser.ID, i);
		}
		public Lista_ingredientesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_ingredientes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).enterLista_ingredientes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).exitLista_ingredientes(this);
		}
	}

	public final Lista_ingredientesContext lista_ingredientes() throws RecognitionException {
		Lista_ingredientesContext _localctx = new Lista_ingredientesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lista_ingredientes);

		      ((Lista_ingredientesContext)_localctx).list_Ingredientes =  new ArrayList<String>(); 
		      ((Lista_ingredientesContext)_localctx).unidade_Medidas =  new ArrayList<String>(); 

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81); ((Lista_ingredientesContext)_localctx).v2 = quantidade();
				setState(82); ((Lista_ingredientesContext)_localctx).v1 = match(ID);
				setState(83); match(PONTO);

				                                   
				                                   if(!TabelaIngredientes.existeSimbolo(((Lista_ingredientesContext)_localctx).v1.getText())){
				                                         TabelaIngredientes.adicionarSimbolo(((Lista_ingredientesContext)_localctx).v1.getText(), ((Lista_ingredientesContext)_localctx).v2._unidade_medida);
				                                   }
				                                   else{
				                                        error += "Linha: "+ ((Lista_ingredientesContext)_localctx).v1.getLine() + " - Identificador " + ((Lista_ingredientesContext)_localctx).v1.getText() + " já declarado\n";
				                                   }
				                                   
				                                   
				                                  
				}
				}
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INTEIRO || _la==REAL );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lista_utensiliosContext extends ParserRuleContext {
		public List<String> list_Utensilios;
		public Token v1;
		public List<TerminalNode> ID() { return getTokens(ReceitaParser.ID); }
		public TerminalNode PONTO(int i) {
			return getToken(ReceitaParser.PONTO, i);
		}
		public List<TerminalNode> PONTO() { return getTokens(ReceitaParser.PONTO); }
		public TerminalNode ID(int i) {
			return getToken(ReceitaParser.ID, i);
		}
		public Lista_utensiliosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_utensilios; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).enterLista_utensilios(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).exitLista_utensilios(this);
		}
	}

	public final Lista_utensiliosContext lista_utensilios() throws RecognitionException {
		Lista_utensiliosContext _localctx = new Lista_utensiliosContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lista_utensilios);
		((Lista_utensiliosContext)_localctx).list_Utensilios =  new ArrayList<String>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90); ((Lista_utensiliosContext)_localctx).v1 = match(ID);
				setState(91); match(PONTO);

				                                   
				                                   if(!TabelaUtensilios.existeSimbolo(((Lista_utensiliosContext)_localctx).v1.getText())){
				                                         TabelaUtensilios.adicionarSimbolo(((Lista_utensiliosContext)_localctx).v1.getText(), "utensilio");
				                                   }
				                                   else{
				                                        error += "Linha: "+ ((Lista_utensiliosContext)_localctx).v1.getLine() + " - Identificador " + ((Lista_utensiliosContext)_localctx).v1.getText() + " já declarado\n";
				                                   }
				                                   
				                                   
				                                  
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedimentoContext extends ParserRuleContext {
		public List<VerboContext> verbo() {
			return getRuleContexts(VerboContext.class);
		}
		public VerboContext verbo(int i) {
			return getRuleContext(VerboContext.class,i);
		}
		public ProcedimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedimento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).enterProcedimento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).exitProcedimento(this);
		}
	}

	public final ProcedimentoContext procedimento() throws RecognitionException {
		ProcedimentoContext _localctx = new ProcedimentoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_procedimento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97); verbo();
				}
				}
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACRESCENTAR) | (1L << ADICIONAR) | (1L << ASSAR) | (1L << BATER) | (1L << COLOCAR) | (1L << ESPREMER) | (1L << CORTAR) | (1L << FERVER) | (1L << FATIAR) | (1L << PENEIRAR) | (1L << PICAR) | (1L << SEPARAR) | (1L << TEMPERAR) | (1L << UNTAR) | (1L << MEXER) | (1L << FRITAR) | (1L << MISTURAR) | (1L << FOGO))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantidadeContext extends ParserRuleContext {
		public String _quantidade;
		public String _unidade_medida;
		public NumeroContext v1;
		public Unidade_de_medidaContext v2;
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public Unidade_de_medidaContext unidade_de_medida() {
			return getRuleContext(Unidade_de_medidaContext.class,0);
		}
		public TerminalNode DE() { return getToken(ReceitaParser.DE, 0); }
		public QuantidadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantidade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).enterQuantidade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).exitQuantidade(this);
		}
	}

	public final QuantidadeContext quantidade() throws RecognitionException {
		QuantidadeContext _localctx = new QuantidadeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_quantidade);
		((QuantidadeContext)_localctx)._quantidade =  ""; ((QuantidadeContext)_localctx)._unidade_medida = "";
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); ((QuantidadeContext)_localctx).v1 = numero();
			setState(103); ((QuantidadeContext)_localctx).v2 = unidade_de_medida();
			setState(105);
			_la = _input.LA(1);
			if (_la==DE) {
				{
				setState(104); match(DE);
				}
			}

			 
			        ((QuantidadeContext)_localctx)._unidade_medida =  ((QuantidadeContext)_localctx).v2.unidade_medida;
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unidade_de_medidaContext extends ParserRuleContext {
		public String unidade_medida;
		public Token v1;
		public TerminalNode MILI_LITRO() { return getToken(ReceitaParser.MILI_LITRO, 0); }
		public TerminalNode COLHER_SOPA() { return getToken(ReceitaParser.COLHER_SOPA, 0); }
		public TerminalNode UNIDADES() { return getToken(ReceitaParser.UNIDADES, 0); }
		public TerminalNode COPO_AMERICANO() { return getToken(ReceitaParser.COPO_AMERICANO, 0); }
		public TerminalNode ID() { return getToken(ReceitaParser.ID, 0); }
		public TerminalNode KILO() { return getToken(ReceitaParser.KILO, 0); }
		public TerminalNode XICARAS() { return getToken(ReceitaParser.XICARAS, 0); }
		public TerminalNode COLHER_CHA() { return getToken(ReceitaParser.COLHER_CHA, 0); }
		public TerminalNode COLHERES_SOPA() { return getToken(ReceitaParser.COLHERES_SOPA, 0); }
		public TerminalNode CUBO() { return getToken(ReceitaParser.CUBO, 0); }
		public TerminalNode GRAMA() { return getToken(ReceitaParser.GRAMA, 0); }
		public TerminalNode COLHERES_CHA() { return getToken(ReceitaParser.COLHERES_CHA, 0); }
		public TerminalNode UNIDADE() { return getToken(ReceitaParser.UNIDADE, 0); }
		public TerminalNode COPOS_AMERICANO() { return getToken(ReceitaParser.COPOS_AMERICANO, 0); }
		public TerminalNode XICARA() { return getToken(ReceitaParser.XICARA, 0); }
		public TerminalNode LITRO() { return getToken(ReceitaParser.LITRO, 0); }
		public TerminalNode LATA() { return getToken(ReceitaParser.LATA, 0); }
		public Unidade_de_medidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unidade_de_medida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).enterUnidade_de_medida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).exitUnidade_de_medida(this);
		}
	}

	public final Unidade_de_medidaContext unidade_de_medida() throws RecognitionException {
		Unidade_de_medidaContext _localctx = new Unidade_de_medidaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unidade_de_medida);
		((Unidade_de_medidaContext)_localctx).unidade_medida =  "";
		try {
			setState(143);
			switch (_input.LA(1)) {
			case KILO:
				enterOuterAlt(_localctx, 1);
				{
				setState(109); match(KILO);
				((Unidade_de_medidaContext)_localctx).unidade_medida =  "kg";
				}
				break;
			case GRAMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(111); match(GRAMA);
				((Unidade_de_medidaContext)_localctx).unidade_medida =  "g";
				}
				break;
			case LATA:
				enterOuterAlt(_localctx, 3);
				{
				setState(113); match(LATA);
				((Unidade_de_medidaContext)_localctx).unidade_medida =  "lata";
				}
				break;
			case XICARA:
				enterOuterAlt(_localctx, 4);
				{
				setState(115); match(XICARA);
				((Unidade_de_medidaContext)_localctx).unidade_medida =  "xicara(cha)";
				}
				break;
			case XICARAS:
				enterOuterAlt(_localctx, 5);
				{
				setState(117); match(XICARAS);
				((Unidade_de_medidaContext)_localctx).unidade_medida =  "xicaras(cha)";
				}
				break;
			case COLHER_CHA:
				enterOuterAlt(_localctx, 6);
				{
				setState(119); match(COLHER_CHA);
				((Unidade_de_medidaContext)_localctx).unidade_medida =  "colher(cha)";
				}
				break;
			case COLHERES_CHA:
				enterOuterAlt(_localctx, 7);
				{
				setState(121); match(COLHERES_CHA);
				((Unidade_de_medidaContext)_localctx).unidade_medida =  "colheres(cha)";
				}
				break;
			case COLHER_SOPA:
				enterOuterAlt(_localctx, 8);
				{
				setState(123); match(COLHER_SOPA);
				((Unidade_de_medidaContext)_localctx).unidade_medida =  "colher(sopa)";
				}
				break;
			case COLHERES_SOPA:
				enterOuterAlt(_localctx, 9);
				{
				setState(125); match(COLHERES_SOPA);
				((Unidade_de_medidaContext)_localctx).unidade_medida =  "colheres(sopa)";
				}
				break;
			case COPO_AMERICANO:
				enterOuterAlt(_localctx, 10);
				{
				setState(127); match(COPO_AMERICANO);
				((Unidade_de_medidaContext)_localctx).unidade_medida =  "copo(americano)";
				}
				break;
			case COPOS_AMERICANO:
				enterOuterAlt(_localctx, 11);
				{
				setState(129); match(COPOS_AMERICANO);
				((Unidade_de_medidaContext)_localctx).unidade_medida =  "copos(americano)";
				}
				break;
			case UNIDADE:
				enterOuterAlt(_localctx, 12);
				{
				setState(131); match(UNIDADE);
				((Unidade_de_medidaContext)_localctx).unidade_medida =  "unidade";
				}
				break;
			case UNIDADES:
				enterOuterAlt(_localctx, 13);
				{
				setState(133); match(UNIDADES);
				((Unidade_de_medidaContext)_localctx).unidade_medida =  "unidades";
				}
				break;
			case CUBO:
				enterOuterAlt(_localctx, 14);
				{
				setState(135); match(CUBO);
				((Unidade_de_medidaContext)_localctx).unidade_medida =  "cubo";
				}
				break;
			case MILI_LITRO:
				enterOuterAlt(_localctx, 15);
				{
				setState(137); match(MILI_LITRO);
				((Unidade_de_medidaContext)_localctx).unidade_medida =  "mL";
				}
				break;
			case LITRO:
				enterOuterAlt(_localctx, 16);
				{
				setState(139); match(LITRO);
				((Unidade_de_medidaContext)_localctx).unidade_medida =  "L";
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 17);
				{
				setState(141); ((Unidade_de_medidaContext)_localctx).v1 = match(ID);
				((Unidade_de_medidaContext)_localctx).unidade_medida =  ((Unidade_de_medidaContext)_localctx).v1.getText();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VerboContext extends ParserRuleContext {
		public Unidade_de_medidaContext v2;
		public Token v1;
		public Mais_idContext v3;
		public Token vv2;
		public TerminalNode FATIAR() { return getToken(ReceitaParser.FATIAR, 0); }
		public Unidade_de_medidaContext unidade_de_medida() {
			return getRuleContext(Unidade_de_medidaContext.class,0);
		}
		public TerminalNode ADICIONAR() { return getToken(ReceitaParser.ADICIONAR, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(ReceitaParser.VIRGULA); }
		public Unidade_de_tempoContext unidade_de_tempo() {
			return getRuleContext(Unidade_de_tempoContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode FECHA_PARENTESE() { return getToken(ReceitaParser.FECHA_PARENTESE, 0); }
		public TerminalNode ESPREMER() { return getToken(ReceitaParser.ESPREMER, 0); }
		public TerminalNode CORTAR() { return getToken(ReceitaParser.CORTAR, 0); }
		public TerminalNode FRITAR() { return getToken(ReceitaParser.FRITAR, 0); }
		public TerminalNode ABRE_PARENTESE() { return getToken(ReceitaParser.ABRE_PARENTESE, 0); }
		public TerminalNode FERVER() { return getToken(ReceitaParser.FERVER, 0); }
		public TerminalNode PONTO() { return getToken(ReceitaParser.PONTO, 0); }
		public TerminalNode MISTURAR() { return getToken(ReceitaParser.MISTURAR, 0); }
		public TerminalNode ASSAR() { return getToken(ReceitaParser.ASSAR, 0); }
		public TerminalNode SEPARAR() { return getToken(ReceitaParser.SEPARAR, 0); }
		public TerminalNode ID(int i) {
			return getToken(ReceitaParser.ID, i);
		}
		public Mais_idContext mais_id() {
			return getRuleContext(Mais_idContext.class,0);
		}
		public TerminalNode PICAR() { return getToken(ReceitaParser.PICAR, 0); }
		public TerminalNode FOGO() { return getToken(ReceitaParser.FOGO, 0); }
		public TerminalNode VIRGULA(int i) {
			return getToken(ReceitaParser.VIRGULA, i);
		}
		public TerminalNode COLOCAR() { return getToken(ReceitaParser.COLOCAR, 0); }
		public List<TerminalNode> ID() { return getTokens(ReceitaParser.ID); }
		public TerminalNode MEXER() { return getToken(ReceitaParser.MEXER, 0); }
		public TerminalNode ACRESCENTAR() { return getToken(ReceitaParser.ACRESCENTAR, 0); }
		public TerminalNode PENEIRAR() { return getToken(ReceitaParser.PENEIRAR, 0); }
		public TerminalNode TEMPERAR() { return getToken(ReceitaParser.TEMPERAR, 0); }
		public TerminalNode UNTAR() { return getToken(ReceitaParser.UNTAR, 0); }
		public TerminalNode BATER() { return getToken(ReceitaParser.BATER, 0); }
		public VerboContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).enterVerbo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).exitVerbo(this);
		}
	}

	public final VerboContext verbo() throws RecognitionException {
		VerboContext _localctx = new VerboContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_verbo);
		try {
			setState(328);
			switch (_input.LA(1)) {
			case ACRESCENTAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(145); match(ACRESCENTAR);
				setState(146); match(ABRE_PARENTESE);
				setState(147); numero();
				setState(148); match(VIRGULA);
				setState(149); ((VerboContext)_localctx).v2 = unidade_de_medida();
				setState(150); match(VIRGULA);
				setState(151); ((VerboContext)_localctx).v1 = match(ID);
				setState(152); match(FECHA_PARENTESE);
				setState(153); match(PONTO);

				         if(!TabelaIngredientes.existeSimbolo(((VerboContext)_localctx).v1.getText())){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Identificador " + ((VerboContext)_localctx).v1.getText() + " não declarado\n";
				         }
				         if(!TabelaMedidas.existeSimbolo(((VerboContext)_localctx).v2.unidade_medida)){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Unidade de medida \"" + ((VerboContext)_localctx).v2.unidade_medida + "\" inválida\n";
				         }
				       
				}
				break;
			case ADICIONAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(156); match(ADICIONAR);
				setState(157); match(ABRE_PARENTESE);
				setState(158); numero();
				setState(159); match(VIRGULA);
				setState(160); ((VerboContext)_localctx).v2 = unidade_de_medida();
				setState(161); match(VIRGULA);
				setState(162); ((VerboContext)_localctx).v1 = match(ID);
				setState(163); match(FECHA_PARENTESE);
				setState(164); match(PONTO);

				         if(!TabelaIngredientes.existeSimbolo(((VerboContext)_localctx).v1.getText())){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Identificador " + ((VerboContext)_localctx).v1.getText() + " não declarado\n";
				         }
				         if(!TabelaMedidas.existeSimbolo(((VerboContext)_localctx).v2.unidade_medida)){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Unidade de medida \"" + ((VerboContext)_localctx).v2.unidade_medida + "\" inválida\n";
				         }
				       
				}
				break;
			case ASSAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(167); match(ASSAR);
				setState(168); match(ABRE_PARENTESE);
				setState(169); ((VerboContext)_localctx).v1 = match(ID);
				setState(170); match(VIRGULA);
				setState(171); numero();
				setState(172); match(VIRGULA);
				setState(173); unidade_de_tempo();
				setState(174); match(FECHA_PARENTESE);
				setState(175); match(PONTO);

				        if(!TabelaIngredientes.existeSimbolo(((VerboContext)_localctx).v1.getText())){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Ingrediente " + ((VerboContext)_localctx).v1.getText() + " não declarado\n";
				         }
				       
				}
				break;
			case BATER:
				enterOuterAlt(_localctx, 4);
				{
				setState(178); match(BATER);
				setState(179); match(ABRE_PARENTESE);
				setState(180); numero();
				setState(181); match(VIRGULA);
				setState(182); ((VerboContext)_localctx).v2 = unidade_de_medida();
				setState(183); match(VIRGULA);
				setState(184); ((VerboContext)_localctx).v1 = match(ID);
				setState(185); ((VerboContext)_localctx).v3 = mais_id();
				setState(186); match(FECHA_PARENTESE);
				setState(187); match(PONTO);

				        if(!TabelaIngredientes.existeSimbolo(((VerboContext)_localctx).v1.getText())){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Ingrediente " + ((VerboContext)_localctx).v1.getText() + " não declarado\n";
				         }
				        if(!TabelaMedidas.existeSimbolo(((VerboContext)_localctx).v2.unidade_medida)){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Unidade de medida \"" + ((VerboContext)_localctx).v2.unidade_medida + "\" inválida\n";
				         }
				        for(String s: ((VerboContext)_localctx).v3.list_Ingredientes)
				        {
				            if(!TabelaIngredientes.existeSimbolo(s)){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Ingrediente " + s + " não declarado\n";
				         }
				        }
				        
				        for(String u: ((VerboContext)_localctx).v3.unidade_Medidas)
				        {
				            if(!TabelaMedidas.existeSimbolo(u)){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Unidade de medida \"" + u + "\" inválida\n";
				         }
				        }
				       
				}
				break;
			case COLOCAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(190); match(COLOCAR);
				setState(191); match(ABRE_PARENTESE);
				setState(192); ((VerboContext)_localctx).v1 = match(ID);
				setState(193); match(VIRGULA);
				setState(194); ((VerboContext)_localctx).vv2 = match(ID);
				setState(195); match(FECHA_PARENTESE);
				setState(196); match(PONTO);

				        if(!TabelaIngredientes.existeSimbolo(((VerboContext)_localctx).v1.getText())){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Ingrediente " + ((VerboContext)_localctx).v1.getText() + " não declarado\n";
				         }
				        if(!TabelaUtensilios.existeSimbolo(((VerboContext)_localctx).vv2.getText())){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Utenselio \"" + ((VerboContext)_localctx).vv2.getText() + "\" não declarado\n";
				         }
				        
				       
				}
				break;
			case CORTAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(198); match(CORTAR);
				setState(199); match(ABRE_PARENTESE);
				setState(200); numero();
				setState(201); match(VIRGULA);
				setState(202); ((VerboContext)_localctx).v2 = unidade_de_medida();
				setState(203); match(VIRGULA);
				setState(204); ((VerboContext)_localctx).v1 = match(ID);
				setState(205); match(FECHA_PARENTESE);
				setState(206); match(PONTO);

				         if(!TabelaIngredientes.existeSimbolo(((VerboContext)_localctx).v1.getText())){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Ingrediente " + ((VerboContext)_localctx).v1.getText() + " não declarado\n";
				         }
				         if(!TabelaMedidas.existeSimbolo(((VerboContext)_localctx).v2.unidade_medida)){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Unidade de medida \"" + ((VerboContext)_localctx).v2.unidade_medida + "\" inválida\n";
				         }
				       
				}
				break;
			case ESPREMER:
				enterOuterAlt(_localctx, 7);
				{
				setState(209); match(ESPREMER);
				setState(210); match(ABRE_PARENTESE);
				setState(211); numero();
				setState(212); match(VIRGULA);
				setState(213); ((VerboContext)_localctx).v2 = unidade_de_medida();
				setState(214); match(VIRGULA);
				setState(215); ((VerboContext)_localctx).v1 = match(ID);
				setState(216); match(FECHA_PARENTESE);
				setState(217); match(PONTO);

				         if(!TabelaIngredientes.existeSimbolo(((VerboContext)_localctx).v1.getText())){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Ingrediente " + ((VerboContext)_localctx).v1.getText() + " não declarado\n";
				         }
				         if(!TabelaMedidas.existeSimbolo(((VerboContext)_localctx).v2.unidade_medida)){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Unidade de medida \"" + ((VerboContext)_localctx).v2.unidade_medida + "\" inválida\n";
				         }
				       
				}
				break;
			case FERVER:
				enterOuterAlt(_localctx, 8);
				{
				setState(220); match(FERVER);
				setState(221); match(ABRE_PARENTESE);
				setState(222); numero();
				setState(223); match(VIRGULA);
				setState(224); ((VerboContext)_localctx).v2 = unidade_de_medida();
				setState(225); match(VIRGULA);
				setState(226); ((VerboContext)_localctx).v1 = match(ID);
				setState(227); match(FECHA_PARENTESE);
				setState(228); match(PONTO);

				         if(!TabelaIngredientes.existeSimbolo(((VerboContext)_localctx).v1.getText())){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Ingrediente " + ((VerboContext)_localctx).v1.getText() + " não declarado\n";
				         }
				         if(!TabelaMedidas.existeSimbolo(((VerboContext)_localctx).v2.unidade_medida)){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Unidade de medida \"" + ((VerboContext)_localctx).v2.unidade_medida + "\" inválida\n";
				         }
				       
				}
				break;
			case FATIAR:
				enterOuterAlt(_localctx, 9);
				{
				setState(231); match(FATIAR);
				setState(232); match(ABRE_PARENTESE);
				setState(233); numero();
				setState(234); match(VIRGULA);
				setState(235); ((VerboContext)_localctx).v2 = unidade_de_medida();
				setState(236); match(VIRGULA);
				setState(237); ((VerboContext)_localctx).v1 = match(ID);
				setState(238); match(FECHA_PARENTESE);
				setState(239); match(PONTO);

				         if(!TabelaIngredientes.existeSimbolo(((VerboContext)_localctx).v1.getText())){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Ingrediente " + ((VerboContext)_localctx).v1.getText() + " não declarado\n";
				         }
				         if(!TabelaMedidas.existeSimbolo(((VerboContext)_localctx).v2.unidade_medida)){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Unidade de medida \"" + ((VerboContext)_localctx).v2.unidade_medida + "\" inválida\n";
				         }
				       
				}
				break;
			case PENEIRAR:
				enterOuterAlt(_localctx, 10);
				{
				setState(242); match(PENEIRAR);
				setState(243); match(ABRE_PARENTESE);
				setState(244); numero();
				setState(245); match(VIRGULA);
				setState(246); ((VerboContext)_localctx).v2 = unidade_de_medida();
				setState(247); match(VIRGULA);
				setState(248); ((VerboContext)_localctx).v1 = match(ID);
				setState(249); match(FECHA_PARENTESE);
				setState(250); match(PONTO);

				         if(!TabelaIngredientes.existeSimbolo(((VerboContext)_localctx).v1.getText())){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Ingrediente " + ((VerboContext)_localctx).v1.getText() + " não declarado\n";
				         }
				         if(!TabelaMedidas.existeSimbolo(((VerboContext)_localctx).v2.unidade_medida)){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Unidade de medida \"" + ((VerboContext)_localctx).v2.unidade_medida + "\" inválida\n";
				         }
				       
				}
				break;
			case PICAR:
				enterOuterAlt(_localctx, 11);
				{
				setState(253); match(PICAR);
				setState(254); match(ABRE_PARENTESE);
				setState(255); numero();
				setState(256); match(VIRGULA);
				setState(257); ((VerboContext)_localctx).v2 = unidade_de_medida();
				setState(258); match(VIRGULA);
				setState(259); ((VerboContext)_localctx).v1 = match(ID);
				setState(260); match(FECHA_PARENTESE);
				setState(261); match(PONTO);

				         if(!TabelaIngredientes.existeSimbolo(((VerboContext)_localctx).v1.getText())){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Ingrediente " + ((VerboContext)_localctx).v1.getText() + " não declarado\n";
				         }
				         if(!TabelaMedidas.existeSimbolo(((VerboContext)_localctx).v2.unidade_medida)){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Unidade de medida \"" + ((VerboContext)_localctx).v2.unidade_medida + "\" inválida\n";
				         }
				       
				}
				break;
			case SEPARAR:
				enterOuterAlt(_localctx, 12);
				{
				setState(264); match(SEPARAR);
				setState(265); match(ABRE_PARENTESE);
				setState(266); numero();
				setState(267); match(VIRGULA);
				setState(268); ((VerboContext)_localctx).v2 = unidade_de_medida();
				setState(269); match(VIRGULA);
				setState(270); ((VerboContext)_localctx).v1 = match(ID);
				setState(271); ((VerboContext)_localctx).v3 = mais_id();
				setState(272); match(FECHA_PARENTESE);
				setState(273); match(PONTO);

				        if(!TabelaIngredientes.existeSimbolo(((VerboContext)_localctx).v1.getText())){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Ingrediente " + ((VerboContext)_localctx).v1.getText() + " não declarado\n";
				         }
				        if(!TabelaMedidas.existeSimbolo(((VerboContext)_localctx).v2.unidade_medida)){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Unidade de medida \"" + ((VerboContext)_localctx).v2.unidade_medida + "\" inválida\n";
				         }
				        for(String s: ((VerboContext)_localctx).v3.list_Ingredientes)
				        {
				            if(!TabelaIngredientes.existeSimbolo(s)){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Ingrediente " + s + " não declarado\n";
				         }
				        }
				        
				        for(String u: ((VerboContext)_localctx).v3.unidade_Medidas)
				        {
				            if(!TabelaMedidas.existeSimbolo(u)){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Unidade de medida \"" + u + "\" inválida\n";
				         }
				        }
				       
				}
				break;
			case TEMPERAR:
				enterOuterAlt(_localctx, 13);
				{
				setState(276); match(TEMPERAR);
				setState(277); match(ABRE_PARENTESE);
				setState(278); numero();
				setState(279); match(VIRGULA);
				setState(280); ((VerboContext)_localctx).v2 = unidade_de_medida();
				setState(281); match(VIRGULA);
				setState(282); ((VerboContext)_localctx).v1 = match(ID);
				setState(283); match(FECHA_PARENTESE);
				setState(284); match(PONTO);

				         if(!TabelaIngredientes.existeSimbolo(((VerboContext)_localctx).v1.getText())){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Ingrediente " + ((VerboContext)_localctx).v1.getText() + " não declarado\n";
				         }
				         if(!TabelaMedidas.existeSimbolo(((VerboContext)_localctx).v2.unidade_medida)){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Unidade de medida \"" + ((VerboContext)_localctx).v2.unidade_medida + "\" inválida\n";
				         }
				       
				}
				break;
			case UNTAR:
				enterOuterAlt(_localctx, 14);
				{
				setState(287); match(UNTAR);
				setState(288); match(ABRE_PARENTESE);
				setState(289); ((VerboContext)_localctx).v1 = match(ID);
				setState(290); match(FECHA_PARENTESE);
				setState(291); match(PONTO);

				         if(!TabelaUtensilios.existeSimbolo(((VerboContext)_localctx).v1.getText())){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Utensílio " + ((VerboContext)_localctx).v1.getText() + " não declarado\n";
				         }
				       
				}
				break;
			case FRITAR:
				enterOuterAlt(_localctx, 15);
				{
				setState(293); match(FRITAR);
				setState(294); match(ABRE_PARENTESE);
				setState(295); ((VerboContext)_localctx).v1 = match(ID);
				setState(296); match(FECHA_PARENTESE);
				setState(297); match(PONTO);

				         if(!TabelaIngredientes.existeSimbolo(((VerboContext)_localctx).v1.getText())){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Ingrediente " + ((VerboContext)_localctx).v1.getText() + " não declarado\n";
				         }
				         
				       
				}
				break;
			case MEXER:
				enterOuterAlt(_localctx, 16);
				{
				setState(299); match(MEXER);
				setState(300); match(ABRE_PARENTESE);
				setState(301); ((VerboContext)_localctx).v1 = match(ID);
				setState(302); match(FECHA_PARENTESE);
				setState(303); match(PONTO);

				         if(!TabelaIngredientes.existeSimbolo(((VerboContext)_localctx).v1.getText())){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Ingrediente " + ((VerboContext)_localctx).v1.getText() + " não declarado\n";
				         }
				         
				       
				}
				break;
			case MISTURAR:
				enterOuterAlt(_localctx, 17);
				{
				setState(305); match(MISTURAR);
				setState(306); match(ABRE_PARENTESE);
				setState(307); numero();
				setState(308); match(VIRGULA);
				setState(309); ((VerboContext)_localctx).v2 = unidade_de_medida();
				setState(310); match(VIRGULA);
				setState(311); ((VerboContext)_localctx).v1 = match(ID);
				setState(312); ((VerboContext)_localctx).v3 = mais_id();
				setState(313); match(FECHA_PARENTESE);
				setState(314); match(PONTO);

				        if(!TabelaIngredientes.existeSimbolo(((VerboContext)_localctx).v1.getText())){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Ingrediente " + ((VerboContext)_localctx).v1.getText() + " não declarado\n";
				         }
				        if(!TabelaMedidas.existeSimbolo(((VerboContext)_localctx).v2.unidade_medida)){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Unidade de medida \"" + ((VerboContext)_localctx).v2.unidade_medida + "\" inválida\n";
				         }
				        for(String s: ((VerboContext)_localctx).v3.list_Ingredientes)
				        {
				            if(!TabelaIngredientes.existeSimbolo(s)){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Ingrediente " + s + " não declarado\n";
				         }
				        }
				        
				        for(String u: ((VerboContext)_localctx).v3.unidade_Medidas)
				        {
				            if(!TabelaMedidas.existeSimbolo(u)){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Unidade de medida \"" + u + "\" inválida\n";
				         }
				        }
				       
				}
				break;
			case FOGO:
				enterOuterAlt(_localctx, 18);
				{
				setState(317); match(FOGO);
				setState(318); match(ABRE_PARENTESE);
				setState(319); ((VerboContext)_localctx).v1 = match(ID);
				setState(320); match(VIRGULA);
				setState(321); numero();
				setState(322); match(VIRGULA);
				setState(323); unidade_de_tempo();
				setState(324); match(FECHA_PARENTESE);
				setState(325); match(PONTO);

				         if(!TabelaUtensilios.existeSimbolo(((VerboContext)_localctx).v1.getText())){
				             error += "Linha: "+ ((VerboContext)_localctx).v1.getLine() + " - Utensílio " + ((VerboContext)_localctx).v1.getText() + " não declarado\n";
				         }
				       
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mais_idContext extends ParserRuleContext {
		public List<String> list_Ingredientes;
		public List<String> unidade_Medidas;
		public Unidade_de_medidaContext v2;
		public Token v1;
		public Mais_idContext v3;
		public Mais_idContext mais_id() {
			return getRuleContext(Mais_idContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode VIRGULA(int i) {
			return getToken(ReceitaParser.VIRGULA, i);
		}
		public Unidade_de_medidaContext unidade_de_medida() {
			return getRuleContext(Unidade_de_medidaContext.class,0);
		}
		public TerminalNode ID() { return getToken(ReceitaParser.ID, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(ReceitaParser.VIRGULA); }
		public Mais_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).enterMais_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).exitMais_id(this);
		}
	}

	public final Mais_idContext mais_id() throws RecognitionException {
		Mais_idContext _localctx = new Mais_idContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mais_id);

		      ((Mais_idContext)_localctx).list_Ingredientes =  new ArrayList<String>(); 
		      ((Mais_idContext)_localctx).unidade_Medidas =  new ArrayList<String>(); 

		try {
			setState(340);
			switch (_input.LA(1)) {
			case VIRGULA:
				enterOuterAlt(_localctx, 1);
				{
				setState(330); match(VIRGULA);
				setState(331); numero();
				setState(332); match(VIRGULA);
				setState(333); ((Mais_idContext)_localctx).v2 = unidade_de_medida();
				setState(334); match(VIRGULA);
				setState(335); ((Mais_idContext)_localctx).v1 = match(ID);
				setState(336); ((Mais_idContext)_localctx).v3 = mais_id();

				         _localctx.list_Ingredientes.add(((Mais_idContext)_localctx).v1.getText());
				         _localctx.unidade_Medidas.add(((Mais_idContext)_localctx).v2.unidade_medida);
				         _localctx.list_Ingredientes.addAll(((Mais_idContext)_localctx).v3.list_Ingredientes);
				         _localctx.unidade_Medidas.addAll(((Mais_idContext)_localctx).v3.unidade_Medidas);

				      
				}
				break;
			case FECHA_PARENTESE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TempoContext extends ParserRuleContext {
		public int _tempo;
		public String _unidade_Tempo;
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode POR() { return getToken(ReceitaParser.POR, 0); }
		public Unidade_de_tempoContext unidade_de_tempo() {
			return getRuleContext(Unidade_de_tempoContext.class,0);
		}
		public TempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).enterTempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).exitTempo(this);
		}
	}

	public final TempoContext tempo() throws RecognitionException {
		TempoContext _localctx = new TempoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tempo);
		((TempoContext)_localctx)._tempo =  -1; ((TempoContext)_localctx)._unidade_Tempo =  "";
		try {
			setState(347);
			switch (_input.LA(1)) {
			case POR:
				enterOuterAlt(_localctx, 1);
				{
				setState(342); match(POR);
				setState(343); numero();
				setState(344); unidade_de_tempo();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unidade_de_tempoContext extends ParserRuleContext {
		public String unidade_tempo;
		public TerminalNode SEGUNDO() { return getToken(ReceitaParser.SEGUNDO, 0); }
		public TerminalNode HORA() { return getToken(ReceitaParser.HORA, 0); }
		public TerminalNode MINUTO() { return getToken(ReceitaParser.MINUTO, 0); }
		public Unidade_de_tempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unidade_de_tempo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).enterUnidade_de_tempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitaListener ) ((ReceitaListener)listener).exitUnidade_de_tempo(this);
		}
	}

	public final Unidade_de_tempoContext unidade_de_tempo() throws RecognitionException {
		Unidade_de_tempoContext _localctx = new Unidade_de_tempoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_unidade_de_tempo);
		((Unidade_de_tempoContext)_localctx).unidade_tempo =  "";
		try {
			setState(355);
			switch (_input.LA(1)) {
			case SEGUNDO:
				enterOuterAlt(_localctx, 1);
				{
				setState(349); match(SEGUNDO);
				((Unidade_de_tempoContext)_localctx).unidade_tempo =  "seg";
				}
				break;
			case MINUTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(351); match(MINUTO);
				((Unidade_de_tempoContext)_localctx).unidade_tempo =  "min";
				}
				break;
			case HORA:
				enterOuterAlt(_localctx, 3);
				{
				setState(353); match(HORA);
				((Unidade_de_tempoContext)_localctx).unidade_tempo =  "hr";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3@\u0168\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\64\n"+
		"\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6C\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\6\nY\n\n\r\n\16\nZ\3\13\3\13\3\13\6\13`\n\13\r\13\16\13a\3\f\6\f"+
		"e\n\f\r\f\16\ff\3\r\3\r\3\r\5\rl\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0092\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u014b\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u0157\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u015e"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0166\n\22\3\22\2\2\23\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\2\u0183\2$\3\2\2\2\4\63\3\2\2\2"+
		"\6\65\3\2\2\2\b9\3\2\2\2\nB\3\2\2\2\fD\3\2\2\2\16I\3\2\2\2\20N\3\2\2\2"+
		"\22X\3\2\2\2\24_\3\2\2\2\26d\3\2\2\2\30h\3\2\2\2\32\u0091\3\2\2\2\34\u014a"+
		"\3\2\2\2\36\u0156\3\2\2\2 \u015d\3\2\2\2\"\u0165\3\2\2\2$%\b\2\1\2%&\7"+
		";\2\2&\'\5\4\3\2\'(\5\6\4\2()\5\b\5\2)*\b\2\1\2*\3\3\2\2\2+,\7\3\2\2,"+
		"\64\b\3\1\2-.\7\4\2\2.\64\b\3\1\2/\60\7\5\2\2\60\64\b\3\1\2\61\62\7\6"+
		"\2\2\62\64\b\3\1\2\63+\3\2\2\2\63-\3\2\2\2\63/\3\2\2\2\63\61\3\2\2\2\64"+
		"\5\3\2\2\2\65\66\5\f\7\2\66\67\5\16\b\2\678\5\20\t\28\7\3\2\2\29:\7\7"+
		"\2\2:;\7\t\2\2;<\5\n\6\2<=\7\b\2\2=\t\3\2\2\2>?\7=\2\2?C\b\6\1\2@A\7>"+
		"\2\2AC\b\6\1\2B>\3\2\2\2B@\3\2\2\2C\13\3\2\2\2DE\7\n\2\2EF\7\t\2\2FG\5"+
		"\22\n\2GH\7\13\2\2H\r\3\2\2\2IJ\7\f\2\2JK\7\t\2\2KL\5\24\13\2LM\7\r\2"+
		"\2M\17\3\2\2\2NO\7\16\2\2OP\7\t\2\2PQ\5\26\f\2QR\7\17\2\2R\21\3\2\2\2"+
		"ST\5\30\r\2TU\7<\2\2UV\7\20\2\2VW\b\n\1\2WY\3\2\2\2XS\3\2\2\2YZ\3\2\2"+
		"\2ZX\3\2\2\2Z[\3\2\2\2[\23\3\2\2\2\\]\7<\2\2]^\7\20\2\2^`\b\13\1\2_\\"+
		"\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\25\3\2\2\2ce\5\34\17\2dc\3\2\2"+
		"\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\27\3\2\2\2hi\5\n\6\2ik\5\32\16\2jl\7"+
		"\21\2\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\b\r\1\2n\31\3\2\2\2op\7\22\2\2"+
		"p\u0092\b\16\1\2qr\7\23\2\2r\u0092\b\16\1\2st\7\24\2\2t\u0092\b\16\1\2"+
		"uv\7\25\2\2v\u0092\b\16\1\2wx\7\26\2\2x\u0092\b\16\1\2yz\7\30\2\2z\u0092"+
		"\b\16\1\2{|\7\32\2\2|\u0092\b\16\1\2}~\7\27\2\2~\u0092\b\16\1\2\177\u0080"+
		"\7\31\2\2\u0080\u0092\b\16\1\2\u0081\u0082\7\33\2\2\u0082\u0092\b\16\1"+
		"\2\u0083\u0084\7\34\2\2\u0084\u0092\b\16\1\2\u0085\u0086\7\35\2\2\u0086"+
		"\u0092\b\16\1\2\u0087\u0088\7\36\2\2\u0088\u0092\b\16\1\2\u0089\u008a"+
		"\7\37\2\2\u008a\u0092\b\16\1\2\u008b\u008c\7 \2\2\u008c\u0092\b\16\1\2"+
		"\u008d\u008e\7!\2\2\u008e\u0092\b\16\1\2\u008f\u0090\7<\2\2\u0090\u0092"+
		"\b\16\1\2\u0091o\3\2\2\2\u0091q\3\2\2\2\u0091s\3\2\2\2\u0091u\3\2\2\2"+
		"\u0091w\3\2\2\2\u0091y\3\2\2\2\u0091{\3\2\2\2\u0091}\3\2\2\2\u0091\177"+
		"\3\2\2\2\u0091\u0081\3\2\2\2\u0091\u0083\3\2\2\2\u0091\u0085\3\2\2\2\u0091"+
		"\u0087\3\2\2\2\u0091\u0089\3\2\2\2\u0091\u008b\3\2\2\2\u0091\u008d\3\2"+
		"\2\2\u0091\u008f\3\2\2\2\u0092\33\3\2\2\2\u0093\u0094\7)\2\2\u0094\u0095"+
		"\7#\2\2\u0095\u0096\5\n\6\2\u0096\u0097\7\"\2\2\u0097\u0098\5\32\16\2"+
		"\u0098\u0099\7\"\2\2\u0099\u009a\7<\2\2\u009a\u009b\7$\2\2\u009b\u009c"+
		"\7\20\2\2\u009c\u009d\b\17\1\2\u009d\u014b\3\2\2\2\u009e\u009f\7*\2\2"+
		"\u009f\u00a0\7#\2\2\u00a0\u00a1\5\n\6\2\u00a1\u00a2\7\"\2\2\u00a2\u00a3"+
		"\5\32\16\2\u00a3\u00a4\7\"\2\2\u00a4\u00a5\7<\2\2\u00a5\u00a6\7$\2\2\u00a6"+
		"\u00a7\7\20\2\2\u00a7\u00a8\b\17\1\2\u00a8\u014b\3\2\2\2\u00a9\u00aa\7"+
		"+\2\2\u00aa\u00ab\7#\2\2\u00ab\u00ac\7<\2\2\u00ac\u00ad\7\"\2\2\u00ad"+
		"\u00ae\5\n\6\2\u00ae\u00af\7\"\2\2\u00af\u00b0\5\"\22\2\u00b0\u00b1\7"+
		"$\2\2\u00b1\u00b2\7\20\2\2\u00b2\u00b3\b\17\1\2\u00b3\u014b\3\2\2\2\u00b4"+
		"\u00b5\7,\2\2\u00b5\u00b6\7#\2\2\u00b6\u00b7\5\n\6\2\u00b7\u00b8\7\"\2"+
		"\2\u00b8\u00b9\5\32\16\2\u00b9\u00ba\7\"\2\2\u00ba\u00bb\7<\2\2\u00bb"+
		"\u00bc\5\36\20\2\u00bc\u00bd\7$\2\2\u00bd\u00be\7\20\2\2\u00be\u00bf\b"+
		"\17\1\2\u00bf\u014b\3\2\2\2\u00c0\u00c1\7-\2\2\u00c1\u00c2\7#\2\2\u00c2"+
		"\u00c3\7<\2\2\u00c3\u00c4\7\"\2\2\u00c4\u00c5\7<\2\2\u00c5\u00c6\7$\2"+
		"\2\u00c6\u00c7\7\20\2\2\u00c7\u014b\b\17\1\2\u00c8\u00c9\7/\2\2\u00c9"+
		"\u00ca\7#\2\2\u00ca\u00cb\5\n\6\2\u00cb\u00cc\7\"\2\2\u00cc\u00cd\5\32"+
		"\16\2\u00cd\u00ce\7\"\2\2\u00ce\u00cf\7<\2\2\u00cf\u00d0\7$\2\2\u00d0"+
		"\u00d1\7\20\2\2\u00d1\u00d2\b\17\1\2\u00d2\u014b\3\2\2\2\u00d3\u00d4\7"+
		".\2\2\u00d4\u00d5\7#\2\2\u00d5\u00d6\5\n\6\2\u00d6\u00d7\7\"\2\2\u00d7"+
		"\u00d8\5\32\16\2\u00d8\u00d9\7\"\2\2\u00d9\u00da\7<\2\2\u00da\u00db\7"+
		"$\2\2\u00db\u00dc\7\20\2\2\u00dc\u00dd\b\17\1\2\u00dd\u014b\3\2\2\2\u00de"+
		"\u00df\7\60\2\2\u00df\u00e0\7#\2\2\u00e0\u00e1\5\n\6\2\u00e1\u00e2\7\""+
		"\2\2\u00e2\u00e3\5\32\16\2\u00e3\u00e4\7\"\2\2\u00e4\u00e5\7<\2\2\u00e5"+
		"\u00e6\7$\2\2\u00e6\u00e7\7\20\2\2\u00e7\u00e8\b\17\1\2\u00e8\u014b\3"+
		"\2\2\2\u00e9\u00ea\7\61\2\2\u00ea\u00eb\7#\2\2\u00eb\u00ec\5\n\6\2\u00ec"+
		"\u00ed\7\"\2\2\u00ed\u00ee\5\32\16\2\u00ee\u00ef\7\"\2\2\u00ef\u00f0\7"+
		"<\2\2\u00f0\u00f1\7$\2\2\u00f1\u00f2\7\20\2\2\u00f2\u00f3\b\17\1\2\u00f3"+
		"\u014b\3\2\2\2\u00f4\u00f5\7\62\2\2\u00f5\u00f6\7#\2\2\u00f6\u00f7\5\n"+
		"\6\2\u00f7\u00f8\7\"\2\2\u00f8\u00f9\5\32\16\2\u00f9\u00fa\7\"\2\2\u00fa"+
		"\u00fb\7<\2\2\u00fb\u00fc\7$\2\2\u00fc\u00fd\7\20\2\2\u00fd\u00fe\b\17"+
		"\1\2\u00fe\u014b\3\2\2\2\u00ff\u0100\7\63\2\2\u0100\u0101\7#\2\2\u0101"+
		"\u0102\5\n\6\2\u0102\u0103\7\"\2\2\u0103\u0104\5\32\16\2\u0104\u0105\7"+
		"\"\2\2\u0105\u0106\7<\2\2\u0106\u0107\7$\2\2\u0107\u0108\7\20\2\2\u0108"+
		"\u0109\b\17\1\2\u0109\u014b\3\2\2\2\u010a\u010b\7\64\2\2\u010b\u010c\7"+
		"#\2\2\u010c\u010d\5\n\6\2\u010d\u010e\7\"\2\2\u010e\u010f\5\32\16\2\u010f"+
		"\u0110\7\"\2\2\u0110\u0111\7<\2\2\u0111\u0112\5\36\20\2\u0112\u0113\7"+
		"$\2\2\u0113\u0114\7\20\2\2\u0114\u0115\b\17\1\2\u0115\u014b\3\2\2\2\u0116"+
		"\u0117\7\65\2\2\u0117\u0118\7#\2\2\u0118\u0119\5\n\6\2\u0119\u011a\7\""+
		"\2\2\u011a\u011b\5\32\16\2\u011b\u011c\7\"\2\2\u011c\u011d\7<\2\2\u011d"+
		"\u011e\7$\2\2\u011e\u011f\7\20\2\2\u011f\u0120\b\17\1\2\u0120\u014b\3"+
		"\2\2\2\u0121\u0122\7\66\2\2\u0122\u0123\7#\2\2\u0123\u0124\7<\2\2\u0124"+
		"\u0125\7$\2\2\u0125\u0126\7\20\2\2\u0126\u014b\b\17\1\2\u0127\u0128\7"+
		"8\2\2\u0128\u0129\7#\2\2\u0129\u012a\7<\2\2\u012a\u012b\7$\2\2\u012b\u012c"+
		"\7\20\2\2\u012c\u014b\b\17\1\2\u012d\u012e\7\67\2\2\u012e\u012f\7#\2\2"+
		"\u012f\u0130\7<\2\2\u0130\u0131\7$\2\2\u0131\u0132\7\20\2\2\u0132\u014b"+
		"\b\17\1\2\u0133\u0134\79\2\2\u0134\u0135\7#\2\2\u0135\u0136\5\n\6\2\u0136"+
		"\u0137\7\"\2\2\u0137\u0138\5\32\16\2\u0138\u0139\7\"\2\2\u0139\u013a\7"+
		"<\2\2\u013a\u013b\5\36\20\2\u013b\u013c\7$\2\2\u013c\u013d\7\20\2\2\u013d"+
		"\u013e\b\17\1\2\u013e\u014b\3\2\2\2\u013f\u0140\7:\2\2\u0140\u0141\7#"+
		"\2\2\u0141\u0142\7<\2\2\u0142\u0143\7\"\2\2\u0143\u0144\5\n\6\2\u0144"+
		"\u0145\7\"\2\2\u0145\u0146\5\"\22\2\u0146\u0147\7$\2\2\u0147\u0148\7\20"+
		"\2\2\u0148\u0149\b\17\1\2\u0149\u014b\3\2\2\2\u014a\u0093\3\2\2\2\u014a"+
		"\u009e\3\2\2\2\u014a\u00a9\3\2\2\2\u014a\u00b4\3\2\2\2\u014a\u00c0\3\2"+
		"\2\2\u014a\u00c8\3\2\2\2\u014a\u00d3\3\2\2\2\u014a\u00de\3\2\2\2\u014a"+
		"\u00e9\3\2\2\2\u014a\u00f4\3\2\2\2\u014a\u00ff\3\2\2\2\u014a\u010a\3\2"+
		"\2\2\u014a\u0116\3\2\2\2\u014a\u0121\3\2\2\2\u014a\u0127\3\2\2\2\u014a"+
		"\u012d\3\2\2\2\u014a\u0133\3\2\2\2\u014a\u013f\3\2\2\2\u014b\35\3\2\2"+
		"\2\u014c\u014d\7\"\2\2\u014d\u014e\5\n\6\2\u014e\u014f\7\"\2\2\u014f\u0150"+
		"\5\32\16\2\u0150\u0151\7\"\2\2\u0151\u0152\7<\2\2\u0152\u0153\5\36\20"+
		"\2\u0153\u0154\b\20\1\2\u0154\u0157\3\2\2\2\u0155\u0157\3\2\2\2\u0156"+
		"\u014c\3\2\2\2\u0156\u0155\3\2\2\2\u0157\37\3\2\2\2\u0158\u0159\7%\2\2"+
		"\u0159\u015a\5\n\6\2\u015a\u015b\5\"\22\2\u015b\u015e\3\2\2\2\u015c\u015e"+
		"\3\2\2\2\u015d\u0158\3\2\2\2\u015d\u015c\3\2\2\2\u015e!\3\2\2\2\u015f"+
		"\u0160\7&\2\2\u0160\u0166\b\22\1\2\u0161\u0162\7\'\2\2\u0162\u0166\b\22"+
		"\1\2\u0163\u0164\7(\2\2\u0164\u0166\b\22\1\2\u0165\u015f\3\2\2\2\u0165"+
		"\u0161\3\2\2\2\u0165\u0163\3\2\2\2\u0166#\3\2\2\2\r\63BZafk\u0091\u014a"+
		"\u0156\u015d\u0165";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}