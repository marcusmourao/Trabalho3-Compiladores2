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
	   PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();
	   TabelaDeSimbolos TabelaIngradientes = new TabelaDeSimbolos("Ingredientes");
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
			        TabelaMedidas.adicionarSimbolo("colheres(sopa)","colheres(sopa)");
			        TabelaMedidas.adicionarSimbolo("colheres(cha)","colheres(cha)");
			        TabelaMedidas.adicionarSimbolo("copo(americano)","copo(americano)");
			        TabelaMedidas.adicionarSimbolo("copos(americano)","copos(americano)");
			        TabelaMedidas.adicionarSimbolo("unidade","unidade");
			        TabelaMedidas.adicionarSimbolo("unidades","unidades");
			        TabelaMedidas.adicionarSimbolo("cubo","cubo");
			        TabelaMedidas.adicionarSimbolo("ml","ml");
			        TabelaMedidas.adicionarSimbolo("l","l");
			       
			setState(35); match(TITULO);
			setState(36); nivel();
			setState(37); corpo_receita();
			setState(38); rendimento();
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
			setState(48);
			switch (_input.LA(1)) {
			case INICIANTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(40); match(INICIANTE);
				((NivelContext)_localctx).nome_nivel =  "iniciante";
				}
				break;
			case INTERMEDIARIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(42); match(INTERMEDIARIO);
				((NivelContext)_localctx).nome_nivel =  "intermediario";
				}
				break;
			case EXPERIENTE:
				enterOuterAlt(_localctx, 3);
				{
				setState(44); match(EXPERIENTE);
				((NivelContext)_localctx).nome_nivel =  "experiente";
				}
				break;
			case MASTER_CHEF:
				enterOuterAlt(_localctx, 4);
				{
				setState(46); match(MASTER_CHEF);
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
			setState(50); ingredientes();
			setState(51); utensilios();
			setState(52); preparo();
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
			setState(54); match(RENDIMENTO);
			setState(55); match(DOIS_PONTOS);
			setState(56); numero();
			setState(57); match(FIM_RENDIMENTO);
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
		public float qnt_numero;
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
		((NumeroContext)_localctx).qnt_numero =  -1;
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_la = _input.LA(1);
			if ( !(_la==INTEIRO || _la==REAL) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
			setState(61); match(INGREDIENTES);
			setState(62); match(DOIS_PONTOS);
			setState(63); lista_ingredientes();
			setState(64); match(FIM_INGREDIENTES);
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
			setState(66); match(UTENSILIOS);
			setState(67); match(DOIS_PONTOS);
			setState(68); lista_utensilios();
			setState(69); match(FIM_UTENSILIOS);
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
			setState(71); match(MODO_PREPARO);
			setState(72); match(DOIS_PONTOS);
			setState(73); procedimento();
			setState(74); match(FIM_MODO_PREPARO);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76); quantidade();
				setState(77); match(ID);
				setState(78); match(PONTO);
				}
				}
				setState(82); 
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
				setState(84); match(ID);
				setState(85); match(PONTO);
				}
				}
				setState(88); 
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
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90); verbo();
				}
				}
				setState(93); 
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); numero();
			setState(96); unidade_de_medida();
			setState(98);
			_la = _input.LA(1);
			if (_la==DE) {
				{
				setState(97); match(DE);
				}
			}

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
		public TerminalNode MILI_LITRO() { return getToken(ReceitaParser.MILI_LITRO, 0); }
		public TerminalNode COLHER_SOPA() { return getToken(ReceitaParser.COLHER_SOPA, 0); }
		public TerminalNode UNIDADES() { return getToken(ReceitaParser.UNIDADES, 0); }
		public TerminalNode COPO_AMERICANO() { return getToken(ReceitaParser.COPO_AMERICANO, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KILO) | (1L << GRAMA) | (1L << LATA) | (1L << XICARA) | (1L << XICARAS) | (1L << COLHER_SOPA) | (1L << COLHER_CHA) | (1L << COLHERES_SOPA) | (1L << COLHERES_CHA) | (1L << COPO_AMERICANO) | (1L << COPOS_AMERICANO) | (1L << UNIDADE) | (1L << UNIDADES) | (1L << CUBO) | (1L << MILI_LITRO) | (1L << LITRO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
			setState(267);
			switch (_input.LA(1)) {
			case ACRESCENTAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(102); match(ACRESCENTAR);
				setState(103); match(ABRE_PARENTESE);
				setState(104); numero();
				setState(105); match(VIRGULA);
				setState(106); unidade_de_medida();
				setState(107); match(VIRGULA);
				setState(108); match(ID);
				setState(109); match(FECHA_PARENTESE);
				setState(110); match(PONTO);
				}
				break;
			case ADICIONAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(112); match(ADICIONAR);
				setState(113); match(ABRE_PARENTESE);
				setState(114); numero();
				setState(115); match(VIRGULA);
				setState(116); unidade_de_medida();
				setState(117); match(VIRGULA);
				setState(118); match(ID);
				setState(119); match(FECHA_PARENTESE);
				setState(120); match(PONTO);
				}
				break;
			case ASSAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(122); match(ASSAR);
				setState(123); match(ABRE_PARENTESE);
				setState(124); match(ID);
				setState(125); match(VIRGULA);
				setState(126); numero();
				setState(127); match(VIRGULA);
				setState(128); unidade_de_tempo();
				setState(129); match(FECHA_PARENTESE);
				setState(130); match(PONTO);
				}
				break;
			case BATER:
				enterOuterAlt(_localctx, 4);
				{
				setState(132); match(BATER);
				setState(133); match(ABRE_PARENTESE);
				setState(134); numero();
				setState(135); match(VIRGULA);
				setState(136); unidade_de_medida();
				setState(137); match(VIRGULA);
				setState(138); match(ID);
				setState(139); mais_id();
				setState(140); match(FECHA_PARENTESE);
				setState(141); match(PONTO);
				}
				break;
			case COLOCAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(143); match(COLOCAR);
				setState(144); match(ABRE_PARENTESE);
				setState(145); match(ID);
				setState(146); match(VIRGULA);
				setState(147); match(ID);
				setState(148); match(FECHA_PARENTESE);
				setState(149); match(PONTO);
				}
				break;
			case CORTAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(150); match(CORTAR);
				setState(151); match(ABRE_PARENTESE);
				setState(152); numero();
				setState(153); match(VIRGULA);
				setState(154); unidade_de_medida();
				setState(155); match(VIRGULA);
				setState(156); match(ID);
				setState(157); match(FECHA_PARENTESE);
				setState(158); match(PONTO);
				}
				break;
			case ESPREMER:
				enterOuterAlt(_localctx, 7);
				{
				setState(160); match(ESPREMER);
				setState(161); match(ABRE_PARENTESE);
				setState(162); numero();
				setState(163); match(VIRGULA);
				setState(164); unidade_de_medida();
				setState(165); match(VIRGULA);
				setState(166); match(ID);
				setState(167); match(FECHA_PARENTESE);
				setState(168); match(PONTO);
				}
				break;
			case FERVER:
				enterOuterAlt(_localctx, 8);
				{
				setState(170); match(FERVER);
				setState(171); match(ABRE_PARENTESE);
				setState(172); numero();
				setState(173); match(VIRGULA);
				setState(174); unidade_de_medida();
				setState(175); match(VIRGULA);
				setState(176); match(ID);
				setState(177); match(FECHA_PARENTESE);
				setState(178); match(PONTO);
				}
				break;
			case FATIAR:
				enterOuterAlt(_localctx, 9);
				{
				setState(180); match(FATIAR);
				setState(181); match(ABRE_PARENTESE);
				setState(182); numero();
				setState(183); match(VIRGULA);
				setState(184); unidade_de_medida();
				setState(185); match(VIRGULA);
				setState(186); match(ID);
				setState(187); match(FECHA_PARENTESE);
				setState(188); match(PONTO);
				}
				break;
			case PENEIRAR:
				enterOuterAlt(_localctx, 10);
				{
				setState(190); match(PENEIRAR);
				setState(191); match(ABRE_PARENTESE);
				setState(192); numero();
				setState(193); match(VIRGULA);
				setState(194); unidade_de_medida();
				setState(195); match(VIRGULA);
				setState(196); match(ID);
				setState(197); match(FECHA_PARENTESE);
				setState(198); match(PONTO);
				}
				break;
			case PICAR:
				enterOuterAlt(_localctx, 11);
				{
				setState(200); match(PICAR);
				setState(201); match(ABRE_PARENTESE);
				setState(202); numero();
				setState(203); match(VIRGULA);
				setState(204); unidade_de_medida();
				setState(205); match(VIRGULA);
				setState(206); match(ID);
				setState(207); match(FECHA_PARENTESE);
				setState(208); match(PONTO);
				}
				break;
			case SEPARAR:
				enterOuterAlt(_localctx, 12);
				{
				setState(210); match(SEPARAR);
				setState(211); match(ABRE_PARENTESE);
				setState(212); numero();
				setState(213); match(VIRGULA);
				setState(214); unidade_de_medida();
				setState(215); match(VIRGULA);
				setState(216); match(ID);
				setState(217); mais_id();
				setState(218); match(FECHA_PARENTESE);
				setState(219); match(PONTO);
				}
				break;
			case TEMPERAR:
				enterOuterAlt(_localctx, 13);
				{
				setState(221); match(TEMPERAR);
				setState(222); match(ABRE_PARENTESE);
				setState(223); numero();
				setState(224); match(VIRGULA);
				setState(225); unidade_de_medida();
				setState(226); match(VIRGULA);
				setState(227); match(ID);
				setState(228); match(FECHA_PARENTESE);
				setState(229); match(PONTO);
				}
				break;
			case UNTAR:
				enterOuterAlt(_localctx, 14);
				{
				setState(231); match(UNTAR);
				setState(232); match(ABRE_PARENTESE);
				setState(233); match(ID);
				setState(234); match(FECHA_PARENTESE);
				setState(235); match(PONTO);
				}
				break;
			case FRITAR:
				enterOuterAlt(_localctx, 15);
				{
				setState(236); match(FRITAR);
				setState(237); match(ABRE_PARENTESE);
				setState(238); match(ID);
				setState(239); match(FECHA_PARENTESE);
				setState(240); match(PONTO);
				}
				break;
			case MEXER:
				enterOuterAlt(_localctx, 16);
				{
				setState(241); match(MEXER);
				setState(242); match(ABRE_PARENTESE);
				setState(243); match(ID);
				setState(244); match(FECHA_PARENTESE);
				setState(245); match(PONTO);
				}
				break;
			case MISTURAR:
				enterOuterAlt(_localctx, 17);
				{
				setState(246); match(MISTURAR);
				setState(247); match(ABRE_PARENTESE);
				setState(248); numero();
				setState(249); match(VIRGULA);
				setState(250); unidade_de_medida();
				setState(251); match(VIRGULA);
				setState(252); match(ID);
				setState(253); mais_id();
				setState(254); match(FECHA_PARENTESE);
				setState(255); match(PONTO);
				}
				break;
			case FOGO:
				enterOuterAlt(_localctx, 18);
				{
				setState(257); match(FOGO);
				setState(258); match(ABRE_PARENTESE);
				setState(259); match(ID);
				setState(260); match(VIRGULA);
				setState(261); numero();
				setState(262); match(VIRGULA);
				setState(263); unidade_de_tempo();
				setState(264); match(FECHA_PARENTESE);
				setState(265); match(PONTO);
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
		try {
			setState(278);
			switch (_input.LA(1)) {
			case VIRGULA:
				enterOuterAlt(_localctx, 1);
				{
				setState(269); match(VIRGULA);
				setState(270); numero();
				setState(271); match(VIRGULA);
				setState(272); unidade_de_medida();
				setState(273); match(VIRGULA);
				setState(274); match(ID);
				setState(275); mais_id();
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
		try {
			setState(285);
			switch (_input.LA(1)) {
			case POR:
				enterOuterAlt(_localctx, 1);
				{
				setState(280); match(POR);
				setState(281); numero();
				setState(282); unidade_de_tempo();
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEGUNDO) | (1L << MINUTO) | (1L << HORA))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3@\u0124\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\63\n\3\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\6\nS\n\n\r\n\16\nT\3"+
		"\13\3\13\6\13Y\n\13\r\13\16\13Z\3\f\6\f^\n\f\r\f\16\f_\3\r\3\r\3\r\5\r"+
		"e\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
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
		"\5\17\u010e\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0119"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u0120\n\21\3\22\3\22\3\22\2\2\23\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\5\3\2=>\3\2\22!\3\2&(\u012c"+
		"\2$\3\2\2\2\4\62\3\2\2\2\6\64\3\2\2\2\b8\3\2\2\2\n=\3\2\2\2\f?\3\2\2\2"+
		"\16D\3\2\2\2\20I\3\2\2\2\22R\3\2\2\2\24X\3\2\2\2\26]\3\2\2\2\30a\3\2\2"+
		"\2\32f\3\2\2\2\34\u010d\3\2\2\2\36\u0118\3\2\2\2 \u011f\3\2\2\2\"\u0121"+
		"\3\2\2\2$%\b\2\1\2%&\7;\2\2&\'\5\4\3\2\'(\5\6\4\2()\5\b\5\2)\3\3\2\2\2"+
		"*+\7\3\2\2+\63\b\3\1\2,-\7\4\2\2-\63\b\3\1\2./\7\5\2\2/\63\b\3\1\2\60"+
		"\61\7\6\2\2\61\63\b\3\1\2\62*\3\2\2\2\62,\3\2\2\2\62.\3\2\2\2\62\60\3"+
		"\2\2\2\63\5\3\2\2\2\64\65\5\f\7\2\65\66\5\16\b\2\66\67\5\20\t\2\67\7\3"+
		"\2\2\289\7\7\2\29:\7\t\2\2:;\5\n\6\2;<\7\b\2\2<\t\3\2\2\2=>\t\2\2\2>\13"+
		"\3\2\2\2?@\7\n\2\2@A\7\t\2\2AB\5\22\n\2BC\7\13\2\2C\r\3\2\2\2DE\7\f\2"+
		"\2EF\7\t\2\2FG\5\24\13\2GH\7\r\2\2H\17\3\2\2\2IJ\7\16\2\2JK\7\t\2\2KL"+
		"\5\26\f\2LM\7\17\2\2M\21\3\2\2\2NO\5\30\r\2OP\7<\2\2PQ\7\20\2\2QS\3\2"+
		"\2\2RN\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\23\3\2\2\2VW\7<\2\2WY\7"+
		"\20\2\2XV\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\25\3\2\2\2\\^\5\34\17"+
		"\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\27\3\2\2\2ab\5\n\6\2bd\5"+
		"\32\16\2ce\7\21\2\2dc\3\2\2\2de\3\2\2\2e\31\3\2\2\2fg\t\3\2\2g\33\3\2"+
		"\2\2hi\7)\2\2ij\7#\2\2jk\5\n\6\2kl\7\"\2\2lm\5\32\16\2mn\7\"\2\2no\7<"+
		"\2\2op\7$\2\2pq\7\20\2\2q\u010e\3\2\2\2rs\7*\2\2st\7#\2\2tu\5\n\6\2uv"+
		"\7\"\2\2vw\5\32\16\2wx\7\"\2\2xy\7<\2\2yz\7$\2\2z{\7\20\2\2{\u010e\3\2"+
		"\2\2|}\7+\2\2}~\7#\2\2~\177\7<\2\2\177\u0080\7\"\2\2\u0080\u0081\5\n\6"+
		"\2\u0081\u0082\7\"\2\2\u0082\u0083\5\"\22\2\u0083\u0084\7$\2\2\u0084\u0085"+
		"\7\20\2\2\u0085\u010e\3\2\2\2\u0086\u0087\7,\2\2\u0087\u0088\7#\2\2\u0088"+
		"\u0089\5\n\6\2\u0089\u008a\7\"\2\2\u008a\u008b\5\32\16\2\u008b\u008c\7"+
		"\"\2\2\u008c\u008d\7<\2\2\u008d\u008e\5\36\20\2\u008e\u008f\7$\2\2\u008f"+
		"\u0090\7\20\2\2\u0090\u010e\3\2\2\2\u0091\u0092\7-\2\2\u0092\u0093\7#"+
		"\2\2\u0093\u0094\7<\2\2\u0094\u0095\7\"\2\2\u0095\u0096\7<\2\2\u0096\u0097"+
		"\7$\2\2\u0097\u010e\7\20\2\2\u0098\u0099\7/\2\2\u0099\u009a\7#\2\2\u009a"+
		"\u009b\5\n\6\2\u009b\u009c\7\"\2\2\u009c\u009d\5\32\16\2\u009d\u009e\7"+
		"\"\2\2\u009e\u009f\7<\2\2\u009f\u00a0\7$\2\2\u00a0\u00a1\7\20\2\2\u00a1"+
		"\u010e\3\2\2\2\u00a2\u00a3\7.\2\2\u00a3\u00a4\7#\2\2\u00a4\u00a5\5\n\6"+
		"\2\u00a5\u00a6\7\"\2\2\u00a6\u00a7\5\32\16\2\u00a7\u00a8\7\"\2\2\u00a8"+
		"\u00a9\7<\2\2\u00a9\u00aa\7$\2\2\u00aa\u00ab\7\20\2\2\u00ab\u010e\3\2"+
		"\2\2\u00ac\u00ad\7\60\2\2\u00ad\u00ae\7#\2\2\u00ae\u00af\5\n\6\2\u00af"+
		"\u00b0\7\"\2\2\u00b0\u00b1\5\32\16\2\u00b1\u00b2\7\"\2\2\u00b2\u00b3\7"+
		"<\2\2\u00b3\u00b4\7$\2\2\u00b4\u00b5\7\20\2\2\u00b5\u010e\3\2\2\2\u00b6"+
		"\u00b7\7\61\2\2\u00b7\u00b8\7#\2\2\u00b8\u00b9\5\n\6\2\u00b9\u00ba\7\""+
		"\2\2\u00ba\u00bb\5\32\16\2\u00bb\u00bc\7\"\2\2\u00bc\u00bd\7<\2\2\u00bd"+
		"\u00be\7$\2\2\u00be\u00bf\7\20\2\2\u00bf\u010e\3\2\2\2\u00c0\u00c1\7\62"+
		"\2\2\u00c1\u00c2\7#\2\2\u00c2\u00c3\5\n\6\2\u00c3\u00c4\7\"\2\2\u00c4"+
		"\u00c5\5\32\16\2\u00c5\u00c6\7\"\2\2\u00c6\u00c7\7<\2\2\u00c7\u00c8\7"+
		"$\2\2\u00c8\u00c9\7\20\2\2\u00c9\u010e\3\2\2\2\u00ca\u00cb\7\63\2\2\u00cb"+
		"\u00cc\7#\2\2\u00cc\u00cd\5\n\6\2\u00cd\u00ce\7\"\2\2\u00ce\u00cf\5\32"+
		"\16\2\u00cf\u00d0\7\"\2\2\u00d0\u00d1\7<\2\2\u00d1\u00d2\7$\2\2\u00d2"+
		"\u00d3\7\20\2\2\u00d3\u010e\3\2\2\2\u00d4\u00d5\7\64\2\2\u00d5\u00d6\7"+
		"#\2\2\u00d6\u00d7\5\n\6\2\u00d7\u00d8\7\"\2\2\u00d8\u00d9\5\32\16\2\u00d9"+
		"\u00da\7\"\2\2\u00da\u00db\7<\2\2\u00db\u00dc\5\36\20\2\u00dc\u00dd\7"+
		"$\2\2\u00dd\u00de\7\20\2\2\u00de\u010e\3\2\2\2\u00df\u00e0\7\65\2\2\u00e0"+
		"\u00e1\7#\2\2\u00e1\u00e2\5\n\6\2\u00e2\u00e3\7\"\2\2\u00e3\u00e4\5\32"+
		"\16\2\u00e4\u00e5\7\"\2\2\u00e5\u00e6\7<\2\2\u00e6\u00e7\7$\2\2\u00e7"+
		"\u00e8\7\20\2\2\u00e8\u010e\3\2\2\2\u00e9\u00ea\7\66\2\2\u00ea\u00eb\7"+
		"#\2\2\u00eb\u00ec\7<\2\2\u00ec\u00ed\7$\2\2\u00ed\u010e\7\20\2\2\u00ee"+
		"\u00ef\78\2\2\u00ef\u00f0\7#\2\2\u00f0\u00f1\7<\2\2\u00f1\u00f2\7$\2\2"+
		"\u00f2\u010e\7\20\2\2\u00f3\u00f4\7\67\2\2\u00f4\u00f5\7#\2\2\u00f5\u00f6"+
		"\7<\2\2\u00f6\u00f7\7$\2\2\u00f7\u010e\7\20\2\2\u00f8\u00f9\79\2\2\u00f9"+
		"\u00fa\7#\2\2\u00fa\u00fb\5\n\6\2\u00fb\u00fc\7\"\2\2\u00fc\u00fd\5\32"+
		"\16\2\u00fd\u00fe\7\"\2\2\u00fe\u00ff\7<\2\2\u00ff\u0100\5\36\20\2\u0100"+
		"\u0101\7$\2\2\u0101\u0102\7\20\2\2\u0102\u010e\3\2\2\2\u0103\u0104\7:"+
		"\2\2\u0104\u0105\7#\2\2\u0105\u0106\7<\2\2\u0106\u0107\7\"\2\2\u0107\u0108"+
		"\5\n\6\2\u0108\u0109\7\"\2\2\u0109\u010a\5\"\22\2\u010a\u010b\7$\2\2\u010b"+
		"\u010c\7\20\2\2\u010c\u010e\3\2\2\2\u010dh\3\2\2\2\u010dr\3\2\2\2\u010d"+
		"|\3\2\2\2\u010d\u0086\3\2\2\2\u010d\u0091\3\2\2\2\u010d\u0098\3\2\2\2"+
		"\u010d\u00a2\3\2\2\2\u010d\u00ac\3\2\2\2\u010d\u00b6\3\2\2\2\u010d\u00c0"+
		"\3\2\2\2\u010d\u00ca\3\2\2\2\u010d\u00d4\3\2\2\2\u010d\u00df\3\2\2\2\u010d"+
		"\u00e9\3\2\2\2\u010d\u00ee\3\2\2\2\u010d\u00f3\3\2\2\2\u010d\u00f8\3\2"+
		"\2\2\u010d\u0103\3\2\2\2\u010e\35\3\2\2\2\u010f\u0110\7\"\2\2\u0110\u0111"+
		"\5\n\6\2\u0111\u0112\7\"\2\2\u0112\u0113\5\32\16\2\u0113\u0114\7\"\2\2"+
		"\u0114\u0115\7<\2\2\u0115\u0116\5\36\20\2\u0116\u0119\3\2\2\2\u0117\u0119"+
		"\3\2\2\2\u0118\u010f\3\2\2\2\u0118\u0117\3\2\2\2\u0119\37\3\2\2\2\u011a"+
		"\u011b\7%\2\2\u011b\u011c\5\n\6\2\u011c\u011d\5\"\22\2\u011d\u0120\3\2"+
		"\2\2\u011e\u0120\3\2\2\2\u011f\u011a\3\2\2\2\u011f\u011e\3\2\2\2\u0120"+
		"!\3\2\2\2\u0121\u0122\t\4\2\2\u0122#\3\2\2\2\n\62TZ_d\u010d\u0118\u011f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}