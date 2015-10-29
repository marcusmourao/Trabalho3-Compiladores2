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
		T__51=1, T__50=2, T__49=3, T__48=4, T__47=5, T__46=6, T__45=7, T__44=8, 
		T__43=9, T__42=10, T__41=11, T__40=12, T__39=13, T__38=14, T__37=15, T__36=16, 
		T__35=17, T__34=18, T__33=19, T__32=20, T__31=21, T__30=22, T__29=23, 
		T__28=24, T__27=25, T__26=26, T__25=27, T__24=28, T__23=29, T__22=30, 
		T__21=31, T__20=32, T__19=33, T__18=34, T__17=35, T__16=36, T__15=37, 
		T__14=38, T__13=39, T__12=40, T__11=41, T__10=42, T__9=43, T__8=44, T__7=45, 
		T__6=46, T__5=47, T__4=48, T__3=49, T__2=50, T__1=51, T__0=52, TITULO=53, 
		ID=54, INTEIRO=55, REAL=56, WS=57, COMENTARIO=58;
	public static final String[] tokenNames = {
		"<INVALID>", "'misturar'", "'temperar'", "'xicaras(cha)'", "'min'", "'unidades'", 
		"'colher(sopa)'", "'colocar'", "'seg'", "'mexer'", "'copo(americano)'", 
		"'ingredientes'", "'ferver'", "'fim_utensilios'", "'fritar'", "'untar'", 
		"'kg'", "'lata'", "')'", "'por'", "'cubo'", "'iniciante'", "'separar'", 
		"'assar'", "'colheres(sopa)'", "'experiente'", "'acrescentar'", "'fim_ingredientes'", 
		"'g'", "'fim_modo_preparo'", "'utensilios'", "','", "'('", "':'", "'peneirar'", 
		"'cortar'", "'espremer'", "'unidade'", "'.'", "'adicionar'", "'master_chef'", 
		"'bater'", "'modo_preparo'", "'fogo'", "'intermediario'", "'rendimento'", 
		"'copos(americano)'", "'picar'", "'fatiar'", "'xicara(cha)'", "'de'", 
		"'fim_rendimento'", "'hr'", "TITULO", "ID", "INTEIRO", "REAL", "WS", "COMENTARIO"
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
	   TabelaDeSimbolos TabelaDeTipos = new TabelaDeSimbolos("tipos");
	   PilhaDeTabelas TabelasDeRegistros = new PilhaDeTabelas();
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
			setState(34); match(TITULO);
			setState(35); nivel();
			setState(36); corpo_receita();
			setState(37); rendimento();
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 21) | (1L << 25) | (1L << 40) | (1L << 44))) != 0)) ) {
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
			setState(41); ingredientes();
			setState(42); utensilios();
			setState(43); preparo();
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
			setState(45); match(45);
			setState(46); match(33);
			setState(47); numero();
			setState(48); match(51);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
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
		public Lista_ingredientesContext lista_ingredientes() {
			return getRuleContext(Lista_ingredientesContext.class,0);
		}
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
			setState(52); match(11);
			setState(53); match(33);
			setState(54); lista_ingredientes();
			setState(55); match(27);
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
			setState(57); match(30);
			setState(58); match(33);
			setState(59); lista_utensilios();
			setState(60); match(13);
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
		public ProcedimentoContext procedimento() {
			return getRuleContext(ProcedimentoContext.class,0);
		}
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
			setState(62); match(42);
			setState(63); match(33);
			setState(64); procedimento();
			setState(65); match(29);
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
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67); quantidade();
				setState(68); match(ID);
				setState(69); match(38);
				}
				}
				setState(73); 
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
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(75); match(ID);
				setState(76); match(38);
				}
				}
				setState(79); 
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
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81); verbo();
				}
				}
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 7) | (1L << 9) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 22) | (1L << 23) | (1L << 26) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 39) | (1L << 41) | (1L << 43) | (1L << 47) | (1L << 48))) != 0) );
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
			setState(86); numero();
			setState(87); unidade_de_medida();
			setState(89);
			_la = _input.LA(1);
			if (_la==50) {
				{
				setState(88); match(50);
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
			setState(91);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 5) | (1L << 6) | (1L << 10) | (1L << 16) | (1L << 17) | (1L << 20) | (1L << 24) | (1L << 28) | (1L << 37) | (1L << 46) | (1L << 49))) != 0)) ) {
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
		public Mais_idContext mais_id() {
			return getRuleContext(Mais_idContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public Unidade_de_medidaContext unidade_de_medida() {
			return getRuleContext(Unidade_de_medidaContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(ReceitaParser.ID); }
		public Unidade_de_tempoContext unidade_de_tempo() {
			return getRuleContext(Unidade_de_tempoContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(ReceitaParser.ID, i);
		}
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
			setState(258);
			switch (_input.LA(1)) {
			case 26:
				enterOuterAlt(_localctx, 1);
				{
				setState(93); match(26);
				setState(94); match(32);
				setState(95); numero();
				setState(96); match(31);
				setState(97); unidade_de_medida();
				setState(98); match(31);
				setState(99); match(ID);
				setState(100); match(18);
				setState(101); match(38);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 2);
				{
				setState(103); match(39);
				setState(104); match(32);
				setState(105); numero();
				setState(106); match(31);
				setState(107); unidade_de_medida();
				setState(108); match(31);
				setState(109); match(ID);
				setState(110); match(18);
				setState(111); match(38);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 3);
				{
				setState(113); match(23);
				setState(114); match(32);
				setState(115); match(ID);
				setState(116); match(31);
				setState(117); numero();
				setState(118); match(31);
				setState(119); unidade_de_tempo();
				setState(120); match(18);
				setState(121); match(38);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 4);
				{
				setState(123); match(41);
				setState(124); match(32);
				setState(125); numero();
				setState(126); match(31);
				setState(127); unidade_de_medida();
				setState(128); match(31);
				setState(129); match(ID);
				setState(130); mais_id();
				setState(131); match(18);
				setState(132); match(38);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 5);
				{
				setState(134); match(7);
				setState(135); match(32);
				setState(136); match(ID);
				setState(137); match(31);
				setState(138); match(ID);
				setState(139); match(18);
				setState(140); match(38);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 6);
				{
				setState(141); match(35);
				setState(142); match(32);
				setState(143); numero();
				setState(144); match(31);
				setState(145); unidade_de_medida();
				setState(146); match(31);
				setState(147); match(ID);
				setState(148); match(18);
				setState(149); match(38);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 7);
				{
				setState(151); match(36);
				setState(152); match(32);
				setState(153); numero();
				setState(154); match(31);
				setState(155); unidade_de_medida();
				setState(156); match(31);
				setState(157); match(ID);
				setState(158); match(18);
				setState(159); match(38);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 8);
				{
				setState(161); match(12);
				setState(162); match(32);
				setState(163); numero();
				setState(164); match(31);
				setState(165); unidade_de_medida();
				setState(166); match(31);
				setState(167); match(ID);
				setState(168); match(18);
				setState(169); match(38);
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 9);
				{
				setState(171); match(48);
				setState(172); match(32);
				setState(173); numero();
				setState(174); match(31);
				setState(175); unidade_de_medida();
				setState(176); match(31);
				setState(177); match(ID);
				setState(178); match(18);
				setState(179); match(38);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 10);
				{
				setState(181); match(34);
				setState(182); match(32);
				setState(183); numero();
				setState(184); match(31);
				setState(185); unidade_de_medida();
				setState(186); match(31);
				setState(187); match(ID);
				setState(188); match(18);
				setState(189); match(38);
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 11);
				{
				setState(191); match(47);
				setState(192); match(32);
				setState(193); numero();
				setState(194); match(31);
				setState(195); unidade_de_medida();
				setState(196); match(31);
				setState(197); match(ID);
				setState(198); match(18);
				setState(199); match(38);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 12);
				{
				setState(201); match(22);
				setState(202); match(32);
				setState(203); numero();
				setState(204); match(31);
				setState(205); unidade_de_medida();
				setState(206); match(31);
				setState(207); match(ID);
				setState(208); mais_id();
				setState(209); match(18);
				setState(210); match(38);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 13);
				{
				setState(212); match(2);
				setState(213); match(32);
				setState(214); numero();
				setState(215); match(31);
				setState(216); unidade_de_medida();
				setState(217); match(31);
				setState(218); match(ID);
				setState(219); match(18);
				setState(220); match(38);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 14);
				{
				setState(222); match(15);
				setState(223); match(32);
				setState(224); match(ID);
				setState(225); match(18);
				setState(226); match(38);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 15);
				{
				setState(227); match(14);
				setState(228); match(32);
				setState(229); match(ID);
				setState(230); match(18);
				setState(231); match(38);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 16);
				{
				setState(232); match(9);
				setState(233); match(32);
				setState(234); match(ID);
				setState(235); match(18);
				setState(236); match(38);
				}
				break;
			case 1:
				enterOuterAlt(_localctx, 17);
				{
				setState(237); match(1);
				setState(238); match(32);
				setState(239); numero();
				setState(240); match(31);
				setState(241); unidade_de_medida();
				setState(242); match(31);
				setState(243); match(ID);
				setState(244); mais_id();
				setState(245); match(18);
				setState(246); match(38);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 18);
				{
				setState(248); match(43);
				setState(249); match(32);
				setState(250); match(ID);
				setState(251); match(31);
				setState(252); numero();
				setState(253); match(31);
				setState(254); unidade_de_tempo();
				setState(255); match(18);
				setState(256); match(38);
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
		public Unidade_de_medidaContext unidade_de_medida() {
			return getRuleContext(Unidade_de_medidaContext.class,0);
		}
		public TerminalNode ID() { return getToken(ReceitaParser.ID, 0); }
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
			setState(269);
			switch (_input.LA(1)) {
			case 31:
				enterOuterAlt(_localctx, 1);
				{
				setState(260); match(31);
				setState(261); numero();
				setState(262); match(31);
				setState(263); unidade_de_medida();
				setState(264); match(31);
				setState(265); match(ID);
				setState(266); mais_id();
				}
				break;
			case 18:
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
			setState(276);
			switch (_input.LA(1)) {
			case 19:
				enterOuterAlt(_localctx, 1);
				{
				setState(271); match(19);
				setState(272); numero();
				setState(273); unidade_de_tempo();
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
			setState(278);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 8) | (1L << 52))) != 0)) ) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3<\u011b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\6\nJ\n\n\r\n\16\nK\3\13\3\13\6\13P\n\13\r\13\16\13Q\3\f\6\fU"+
		"\n\f\r\f\16\fV\3\r\3\r\3\r\5\r\\\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
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
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0105\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u0110\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u0117"+
		"\n\21\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"\2\6\6\2\27\27\33\33**..\3\29:\f\2\5\5\7\b\f\f\22\23\26\26\32\32\36\36"+
		"\'\'\60\60\63\63\5\2\6\6\n\n\66\66\u0120\2$\3\2\2\2\4)\3\2\2\2\6+\3\2"+
		"\2\2\b/\3\2\2\2\n\64\3\2\2\2\f\66\3\2\2\2\16;\3\2\2\2\20@\3\2\2\2\22I"+
		"\3\2\2\2\24O\3\2\2\2\26T\3\2\2\2\30X\3\2\2\2\32]\3\2\2\2\34\u0104\3\2"+
		"\2\2\36\u010f\3\2\2\2 \u0116\3\2\2\2\"\u0118\3\2\2\2$%\7\67\2\2%&\5\4"+
		"\3\2&\'\5\6\4\2\'(\5\b\5\2(\3\3\2\2\2)*\t\2\2\2*\5\3\2\2\2+,\5\f\7\2,"+
		"-\5\16\b\2-.\5\20\t\2.\7\3\2\2\2/\60\7/\2\2\60\61\7#\2\2\61\62\5\n\6\2"+
		"\62\63\7\65\2\2\63\t\3\2\2\2\64\65\t\3\2\2\65\13\3\2\2\2\66\67\7\r\2\2"+
		"\678\7#\2\289\5\22\n\29:\7\35\2\2:\r\3\2\2\2;<\7 \2\2<=\7#\2\2=>\5\24"+
		"\13\2>?\7\17\2\2?\17\3\2\2\2@A\7,\2\2AB\7#\2\2BC\5\26\f\2CD\7\37\2\2D"+
		"\21\3\2\2\2EF\5\30\r\2FG\78\2\2GH\7(\2\2HJ\3\2\2\2IE\3\2\2\2JK\3\2\2\2"+
		"KI\3\2\2\2KL\3\2\2\2L\23\3\2\2\2MN\78\2\2NP\7(\2\2OM\3\2\2\2PQ\3\2\2\2"+
		"QO\3\2\2\2QR\3\2\2\2R\25\3\2\2\2SU\5\34\17\2TS\3\2\2\2UV\3\2\2\2VT\3\2"+
		"\2\2VW\3\2\2\2W\27\3\2\2\2XY\5\n\6\2Y[\5\32\16\2Z\\\7\64\2\2[Z\3\2\2\2"+
		"[\\\3\2\2\2\\\31\3\2\2\2]^\t\4\2\2^\33\3\2\2\2_`\7\34\2\2`a\7\"\2\2ab"+
		"\5\n\6\2bc\7!\2\2cd\5\32\16\2de\7!\2\2ef\78\2\2fg\7\24\2\2gh\7(\2\2h\u0105"+
		"\3\2\2\2ij\7)\2\2jk\7\"\2\2kl\5\n\6\2lm\7!\2\2mn\5\32\16\2no\7!\2\2op"+
		"\78\2\2pq\7\24\2\2qr\7(\2\2r\u0105\3\2\2\2st\7\31\2\2tu\7\"\2\2uv\78\2"+
		"\2vw\7!\2\2wx\5\n\6\2xy\7!\2\2yz\5\"\22\2z{\7\24\2\2{|\7(\2\2|\u0105\3"+
		"\2\2\2}~\7+\2\2~\177\7\"\2\2\177\u0080\5\n\6\2\u0080\u0081\7!\2\2\u0081"+
		"\u0082\5\32\16\2\u0082\u0083\7!\2\2\u0083\u0084\78\2\2\u0084\u0085\5\36"+
		"\20\2\u0085\u0086\7\24\2\2\u0086\u0087\7(\2\2\u0087\u0105\3\2\2\2\u0088"+
		"\u0089\7\t\2\2\u0089\u008a\7\"\2\2\u008a\u008b\78\2\2\u008b\u008c\7!\2"+
		"\2\u008c\u008d\78\2\2\u008d\u008e\7\24\2\2\u008e\u0105\7(\2\2\u008f\u0090"+
		"\7%\2\2\u0090\u0091\7\"\2\2\u0091\u0092\5\n\6\2\u0092\u0093\7!\2\2\u0093"+
		"\u0094\5\32\16\2\u0094\u0095\7!\2\2\u0095\u0096\78\2\2\u0096\u0097\7\24"+
		"\2\2\u0097\u0098\7(\2\2\u0098\u0105\3\2\2\2\u0099\u009a\7&\2\2\u009a\u009b"+
		"\7\"\2\2\u009b\u009c\5\n\6\2\u009c\u009d\7!\2\2\u009d\u009e\5\32\16\2"+
		"\u009e\u009f\7!\2\2\u009f\u00a0\78\2\2\u00a0\u00a1\7\24\2\2\u00a1\u00a2"+
		"\7(\2\2\u00a2\u0105\3\2\2\2\u00a3\u00a4\7\16\2\2\u00a4\u00a5\7\"\2\2\u00a5"+
		"\u00a6\5\n\6\2\u00a6\u00a7\7!\2\2\u00a7\u00a8\5\32\16\2\u00a8\u00a9\7"+
		"!\2\2\u00a9\u00aa\78\2\2\u00aa\u00ab\7\24\2\2\u00ab\u00ac\7(\2\2\u00ac"+
		"\u0105\3\2\2\2\u00ad\u00ae\7\62\2\2\u00ae\u00af\7\"\2\2\u00af\u00b0\5"+
		"\n\6\2\u00b0\u00b1\7!\2\2\u00b1\u00b2\5\32\16\2\u00b2\u00b3\7!\2\2\u00b3"+
		"\u00b4\78\2\2\u00b4\u00b5\7\24\2\2\u00b5\u00b6\7(\2\2\u00b6\u0105\3\2"+
		"\2\2\u00b7\u00b8\7$\2\2\u00b8\u00b9\7\"\2\2\u00b9\u00ba\5\n\6\2\u00ba"+
		"\u00bb\7!\2\2\u00bb\u00bc\5\32\16\2\u00bc\u00bd\7!\2\2\u00bd\u00be\78"+
		"\2\2\u00be\u00bf\7\24\2\2\u00bf\u00c0\7(\2\2\u00c0\u0105\3\2\2\2\u00c1"+
		"\u00c2\7\61\2\2\u00c2\u00c3\7\"\2\2\u00c3\u00c4\5\n\6\2\u00c4\u00c5\7"+
		"!\2\2\u00c5\u00c6\5\32\16\2\u00c6\u00c7\7!\2\2\u00c7\u00c8\78\2\2\u00c8"+
		"\u00c9\7\24\2\2\u00c9\u00ca\7(\2\2\u00ca\u0105\3\2\2\2\u00cb\u00cc\7\30"+
		"\2\2\u00cc\u00cd\7\"\2\2\u00cd\u00ce\5\n\6\2\u00ce\u00cf\7!\2\2\u00cf"+
		"\u00d0\5\32\16\2\u00d0\u00d1\7!\2\2\u00d1\u00d2\78\2\2\u00d2\u00d3\5\36"+
		"\20\2\u00d3\u00d4\7\24\2\2\u00d4\u00d5\7(\2\2\u00d5\u0105\3\2\2\2\u00d6"+
		"\u00d7\7\4\2\2\u00d7\u00d8\7\"\2\2\u00d8\u00d9\5\n\6\2\u00d9\u00da\7!"+
		"\2\2\u00da\u00db\5\32\16\2\u00db\u00dc\7!\2\2\u00dc\u00dd\78\2\2\u00dd"+
		"\u00de\7\24\2\2\u00de\u00df\7(\2\2\u00df\u0105\3\2\2\2\u00e0\u00e1\7\21"+
		"\2\2\u00e1\u00e2\7\"\2\2\u00e2\u00e3\78\2\2\u00e3\u00e4\7\24\2\2\u00e4"+
		"\u0105\7(\2\2\u00e5\u00e6\7\20\2\2\u00e6\u00e7\7\"\2\2\u00e7\u00e8\78"+
		"\2\2\u00e8\u00e9\7\24\2\2\u00e9\u0105\7(\2\2\u00ea\u00eb\7\13\2\2\u00eb"+
		"\u00ec\7\"\2\2\u00ec\u00ed\78\2\2\u00ed\u00ee\7\24\2\2\u00ee\u0105\7("+
		"\2\2\u00ef\u00f0\7\3\2\2\u00f0\u00f1\7\"\2\2\u00f1\u00f2\5\n\6\2\u00f2"+
		"\u00f3\7!\2\2\u00f3\u00f4\5\32\16\2\u00f4\u00f5\7!\2\2\u00f5\u00f6\78"+
		"\2\2\u00f6\u00f7\5\36\20\2\u00f7\u00f8\7\24\2\2\u00f8\u00f9\7(\2\2\u00f9"+
		"\u0105\3\2\2\2\u00fa\u00fb\7-\2\2\u00fb\u00fc\7\"\2\2\u00fc\u00fd\78\2"+
		"\2\u00fd\u00fe\7!\2\2\u00fe\u00ff\5\n\6\2\u00ff\u0100\7!\2\2\u0100\u0101"+
		"\5\"\22\2\u0101\u0102\7\24\2\2\u0102\u0103\7(\2\2\u0103\u0105\3\2\2\2"+
		"\u0104_\3\2\2\2\u0104i\3\2\2\2\u0104s\3\2\2\2\u0104}\3\2\2\2\u0104\u0088"+
		"\3\2\2\2\u0104\u008f\3\2\2\2\u0104\u0099\3\2\2\2\u0104\u00a3\3\2\2\2\u0104"+
		"\u00ad\3\2\2\2\u0104\u00b7\3\2\2\2\u0104\u00c1\3\2\2\2\u0104\u00cb\3\2"+
		"\2\2\u0104\u00d6\3\2\2\2\u0104\u00e0\3\2\2\2\u0104\u00e5\3\2\2\2\u0104"+
		"\u00ea\3\2\2\2\u0104\u00ef\3\2\2\2\u0104\u00fa\3\2\2\2\u0105\35\3\2\2"+
		"\2\u0106\u0107\7!\2\2\u0107\u0108\5\n\6\2\u0108\u0109\7!\2\2\u0109\u010a"+
		"\5\32\16\2\u010a\u010b\7!\2\2\u010b\u010c\78\2\2\u010c\u010d\5\36\20\2"+
		"\u010d\u0110\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u0106\3\2\2\2\u010f\u010e"+
		"\3\2\2\2\u0110\37\3\2\2\2\u0111\u0112\7\25\2\2\u0112\u0113\5\n\6\2\u0113"+
		"\u0114\5\"\22\2\u0114\u0117\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0111\3"+
		"\2\2\2\u0116\u0115\3\2\2\2\u0117!\3\2\2\2\u0118\u0119\t\5\2\2\u0119#\3"+
		"\2\2\2\tKQV[\u0104\u010f\u0116";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}