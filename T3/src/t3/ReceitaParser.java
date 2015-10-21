// Generated from C:\Users\Marcus\Downloads\Trabalho1-Compiladores2-Grupo2\T1\src\t3\Receita.g4 by ANTLR 4.2.2
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
		T__43=1, T__42=2, T__41=3, T__40=4, T__39=5, T__38=6, T__37=7, T__36=8, 
		T__35=9, T__34=10, T__33=11, T__32=12, T__31=13, T__30=14, T__29=15, T__28=16, 
		T__27=17, T__26=18, T__25=19, T__24=20, T__23=21, T__22=22, T__21=23, 
		T__20=24, T__19=25, T__18=26, T__17=27, T__16=28, T__15=29, T__14=30, 
		T__13=31, T__12=32, T__11=33, T__10=34, T__9=35, T__8=36, T__7=37, T__6=38, 
		T__5=39, T__4=40, T__3=41, T__2=42, T__1=43, T__0=44, TITULO=45, ID=46, 
		INTEIRO=47, REAL=48, WS=49, COMENTARIO=50;
	public static final String[] tokenNames = {
		"<INVALID>", "'fim_modo_preparo'", "'temperar'", "'misturar'", "'utensilios'", 
		"','", "'min'", "':'", "'('", "'colher(sopa)'", "'colocar'", "'seg'", 
		"'copo(americano)'", "'peneirar'", "'cortar'", "'ingredientes'", "'ferver'", 
		"'fim_utensilios'", "'fritar'", "'untar'", "'lata'", "'kg'", "'.'", "')'", 
		"'por'", "'adicionar'", "'master_chef'", "'iniciante'", "'modo_preparo'", 
		"'bater'", "'intermediario'", "'separar'", "'copos(americano)'", "'rendimento'", 
		"'assar'", "'colheres(sopa)'", "'picar'", "'xicara(cha)'", "'experiente'", 
		"'de'", "'fim_rendimento'", "'hr'", "'acrescentar'", "'fim_ingredientes'", 
		"'g'", "TITULO", "ID", "INTEIRO", "REAL", "WS", "COMENTARIO"
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 26) | (1L << 27) | (1L << 30) | (1L << 38))) != 0)) ) {
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
			setState(45); match(33);
			setState(46); numero();
			setState(47); match(40);
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
			setState(49);
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
			setState(51); match(15);
			setState(52); match(7);
			setState(53); lista_ingredientes();
			setState(54); match(43);
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
			setState(56); match(4);
			setState(57); lista_utensilios();
			setState(58); match(17);
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
			setState(60); match(28);
			setState(61); match(7);
			setState(62); procedimento();
			setState(63); match(1);
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
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65); quantidade();
				setState(66); match(ID);
				setState(67); match(22);
				}
				}
				setState(71); 
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
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73); match(ID);
				setState(74); match(22);
				}
				}
				setState(77); 
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
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79); verbo();
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 10) | (1L << 13) | (1L << 14) | (1L << 16) | (1L << 18) | (1L << 19) | (1L << 25) | (1L << 29) | (1L << 31) | (1L << 34) | (1L << 36) | (1L << 42))) != 0) );
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
			setState(84); numero();
			setState(85); unidade_de_medida();
			setState(87);
			_la = _input.LA(1);
			if (_la==39) {
				{
				setState(86); match(39);
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
			setState(89);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 12) | (1L << 20) | (1L << 21) | (1L << 32) | (1L << 35) | (1L << 37) | (1L << 44))) != 0)) ) {
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
		public TerminalNode ID() { return getToken(ReceitaParser.ID, 0); }
		public QuantidadeContext quantidade() {
			return getRuleContext(QuantidadeContext.class,0);
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
			setState(205);
			switch (_input.LA(1)) {
			case 42:
				enterOuterAlt(_localctx, 1);
				{
				setState(91); match(42);
				setState(92); match(8);
				setState(93); quantidade();
				setState(94); match(5);
				setState(95); match(ID);
				setState(96); match(23);
				setState(97); match(22);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 2);
				{
				setState(99); match(25);
				setState(100); match(8);
				setState(101); quantidade();
				setState(102); match(5);
				setState(103); match(ID);
				setState(104); match(23);
				setState(105); match(22);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 3);
				{
				setState(107); match(34);
				setState(108); match(8);
				setState(109); match(ID);
				setState(110); match(5);
				setState(111); numero();
				setState(112); match(23);
				setState(113); match(22);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 4);
				{
				setState(115); match(29);
				setState(116); match(8);
				setState(117); quantidade();
				setState(118); match(5);
				setState(119); match(ID);
				setState(120); match(23);
				setState(121); match(22);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 5);
				{
				setState(123); match(10);
				setState(124); match(8);
				setState(125); quantidade();
				setState(126); match(5);
				setState(127); match(ID);
				setState(128); match(23);
				setState(129); match(22);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 6);
				{
				setState(131); match(14);
				setState(132); match(8);
				setState(133); quantidade();
				setState(134); match(5);
				setState(135); match(ID);
				setState(136); match(23);
				setState(137); match(22);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 7);
				{
				setState(139); match(16);
				setState(140); match(8);
				setState(141); quantidade();
				setState(142); match(5);
				setState(143); match(ID);
				setState(144); match(23);
				setState(145); match(22);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 8);
				{
				setState(147); match(18);
				setState(148); match(8);
				setState(149); quantidade();
				setState(150); match(5);
				setState(151); match(ID);
				setState(152); match(23);
				setState(153); match(22);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 9);
				{
				setState(155); match(13);
				setState(156); match(8);
				setState(157); quantidade();
				setState(158); match(5);
				setState(159); match(ID);
				setState(160); match(23);
				setState(161); match(22);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 10);
				{
				setState(163); match(36);
				setState(164); match(8);
				setState(165); quantidade();
				setState(166); match(5);
				setState(167); match(ID);
				setState(168); match(23);
				setState(169); match(22);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 11);
				{
				setState(171); match(31);
				setState(172); match(8);
				setState(173); quantidade();
				setState(174); match(5);
				setState(175); match(ID);
				setState(176); mais_id();
				setState(177); match(23);
				setState(178); match(22);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 12);
				{
				setState(180); match(2);
				setState(181); match(8);
				setState(182); quantidade();
				setState(183); match(5);
				setState(184); match(ID);
				setState(185); match(23);
				setState(186); match(22);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 13);
				{
				setState(188); match(19);
				setState(189); match(8);
				setState(190); quantidade();
				setState(191); match(5);
				setState(192); match(ID);
				setState(193); match(23);
				setState(194); match(22);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 14);
				{
				setState(196); match(3);
				setState(197); match(8);
				setState(198); quantidade();
				setState(199); match(5);
				setState(200); match(ID);
				setState(201); mais_id();
				setState(202); match(23);
				setState(203); match(22);
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
		public TerminalNode ID() { return getToken(ReceitaParser.ID, 0); }
		public QuantidadeContext quantidade() {
			return getRuleContext(QuantidadeContext.class,0);
		}
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
			setState(213);
			switch (_input.LA(1)) {
			case 5:
				enterOuterAlt(_localctx, 1);
				{
				setState(207); match(5);
				setState(208); quantidade();
				setState(209); match(ID);
				setState(210); mais_id();
				}
				break;
			case 23:
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
			setState(220);
			switch (_input.LA(1)) {
			case 24:
				enterOuterAlt(_localctx, 1);
				{
				setState(215); match(24);
				setState(216); numero();
				setState(217); unidade_de_tempo();
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
			setState(222);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 11) | (1L << 41))) != 0)) ) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\u00e3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\6\nH\n\n\r\n\16\nI\3\13\3\13\6\13N\n\13\r\13\16\13O\3\f\6\fS\n\f\r\f"+
		"\16\fT\3\r\3\r\3\r\5\rZ\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d0\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u00d8\n\20\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u00df\n\21\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"\2\6\5\2\34\35  ((\3\2\61\62\t\2\13\13\16\16\26\27\"\"%%\'\'..\5"+
		"\2\b\b\r\r++\u00e4\2$\3\2\2\2\4)\3\2\2\2\6+\3\2\2\2\b/\3\2\2\2\n\63\3"+
		"\2\2\2\f\65\3\2\2\2\16:\3\2\2\2\20>\3\2\2\2\22G\3\2\2\2\24M\3\2\2\2\26"+
		"R\3\2\2\2\30V\3\2\2\2\32[\3\2\2\2\34\u00cf\3\2\2\2\36\u00d7\3\2\2\2 \u00de"+
		"\3\2\2\2\"\u00e0\3\2\2\2$%\7/\2\2%&\5\4\3\2&\'\5\6\4\2\'(\5\b\5\2(\3\3"+
		"\2\2\2)*\t\2\2\2*\5\3\2\2\2+,\5\f\7\2,-\5\16\b\2-.\5\20\t\2.\7\3\2\2\2"+
		"/\60\7#\2\2\60\61\5\n\6\2\61\62\7*\2\2\62\t\3\2\2\2\63\64\t\3\2\2\64\13"+
		"\3\2\2\2\65\66\7\21\2\2\66\67\7\t\2\2\678\5\22\n\289\7-\2\29\r\3\2\2\2"+
		":;\7\6\2\2;<\5\24\13\2<=\7\23\2\2=\17\3\2\2\2>?\7\36\2\2?@\7\t\2\2@A\5"+
		"\26\f\2AB\7\3\2\2B\21\3\2\2\2CD\5\30\r\2DE\7\60\2\2EF\7\30\2\2FH\3\2\2"+
		"\2GC\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\23\3\2\2\2KL\7\60\2\2LN\7"+
		"\30\2\2MK\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\25\3\2\2\2QS\5\34\17"+
		"\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\27\3\2\2\2VW\5\n\6\2WY\5\32"+
		"\16\2XZ\7)\2\2YX\3\2\2\2YZ\3\2\2\2Z\31\3\2\2\2[\\\t\4\2\2\\\33\3\2\2\2"+
		"]^\7,\2\2^_\7\n\2\2_`\5\30\r\2`a\7\7\2\2ab\7\60\2\2bc\7\31\2\2cd\7\30"+
		"\2\2d\u00d0\3\2\2\2ef\7\33\2\2fg\7\n\2\2gh\5\30\r\2hi\7\7\2\2ij\7\60\2"+
		"\2jk\7\31\2\2kl\7\30\2\2l\u00d0\3\2\2\2mn\7$\2\2no\7\n\2\2op\7\60\2\2"+
		"pq\7\7\2\2qr\5\n\6\2rs\7\31\2\2st\7\30\2\2t\u00d0\3\2\2\2uv\7\37\2\2v"+
		"w\7\n\2\2wx\5\30\r\2xy\7\7\2\2yz\7\60\2\2z{\7\31\2\2{|\7\30\2\2|\u00d0"+
		"\3\2\2\2}~\7\f\2\2~\177\7\n\2\2\177\u0080\5\30\r\2\u0080\u0081\7\7\2\2"+
		"\u0081\u0082\7\60\2\2\u0082\u0083\7\31\2\2\u0083\u0084\7\30\2\2\u0084"+
		"\u00d0\3\2\2\2\u0085\u0086\7\20\2\2\u0086\u0087\7\n\2\2\u0087\u0088\5"+
		"\30\r\2\u0088\u0089\7\7\2\2\u0089\u008a\7\60\2\2\u008a\u008b\7\31\2\2"+
		"\u008b\u008c\7\30\2\2\u008c\u00d0\3\2\2\2\u008d\u008e\7\22\2\2\u008e\u008f"+
		"\7\n\2\2\u008f\u0090\5\30\r\2\u0090\u0091\7\7\2\2\u0091\u0092\7\60\2\2"+
		"\u0092\u0093\7\31\2\2\u0093\u0094\7\30\2\2\u0094\u00d0\3\2\2\2\u0095\u0096"+
		"\7\24\2\2\u0096\u0097\7\n\2\2\u0097\u0098\5\30\r\2\u0098\u0099\7\7\2\2"+
		"\u0099\u009a\7\60\2\2\u009a\u009b\7\31\2\2\u009b\u009c\7\30\2\2\u009c"+
		"\u00d0\3\2\2\2\u009d\u009e\7\17\2\2\u009e\u009f\7\n\2\2\u009f\u00a0\5"+
		"\30\r\2\u00a0\u00a1\7\7\2\2\u00a1\u00a2\7\60\2\2\u00a2\u00a3\7\31\2\2"+
		"\u00a3\u00a4\7\30\2\2\u00a4\u00d0\3\2\2\2\u00a5\u00a6\7&\2\2\u00a6\u00a7"+
		"\7\n\2\2\u00a7\u00a8\5\30\r\2\u00a8\u00a9\7\7\2\2\u00a9\u00aa\7\60\2\2"+
		"\u00aa\u00ab\7\31\2\2\u00ab\u00ac\7\30\2\2\u00ac\u00d0\3\2\2\2\u00ad\u00ae"+
		"\7!\2\2\u00ae\u00af\7\n\2\2\u00af\u00b0\5\30\r\2\u00b0\u00b1\7\7\2\2\u00b1"+
		"\u00b2\7\60\2\2\u00b2\u00b3\5\36\20\2\u00b3\u00b4\7\31\2\2\u00b4\u00b5"+
		"\7\30\2\2\u00b5\u00d0\3\2\2\2\u00b6\u00b7\7\4\2\2\u00b7\u00b8\7\n\2\2"+
		"\u00b8\u00b9\5\30\r\2\u00b9\u00ba\7\7\2\2\u00ba\u00bb\7\60\2\2\u00bb\u00bc"+
		"\7\31\2\2\u00bc\u00bd\7\30\2\2\u00bd\u00d0\3\2\2\2\u00be\u00bf\7\25\2"+
		"\2\u00bf\u00c0\7\n\2\2\u00c0\u00c1\5\30\r\2\u00c1\u00c2\7\7\2\2\u00c2"+
		"\u00c3\7\60\2\2\u00c3\u00c4\7\31\2\2\u00c4\u00c5\7\30\2\2\u00c5\u00d0"+
		"\3\2\2\2\u00c6\u00c7\7\5\2\2\u00c7\u00c8\7\n\2\2\u00c8\u00c9\5\30\r\2"+
		"\u00c9\u00ca\7\7\2\2\u00ca\u00cb\7\60\2\2\u00cb\u00cc\5\36\20\2\u00cc"+
		"\u00cd\7\31\2\2\u00cd\u00ce\7\30\2\2\u00ce\u00d0\3\2\2\2\u00cf]\3\2\2"+
		"\2\u00cfe\3\2\2\2\u00cfm\3\2\2\2\u00cfu\3\2\2\2\u00cf}\3\2\2\2\u00cf\u0085"+
		"\3\2\2\2\u00cf\u008d\3\2\2\2\u00cf\u0095\3\2\2\2\u00cf\u009d\3\2\2\2\u00cf"+
		"\u00a5\3\2\2\2\u00cf\u00ad\3\2\2\2\u00cf\u00b6\3\2\2\2\u00cf\u00be\3\2"+
		"\2\2\u00cf\u00c6\3\2\2\2\u00d0\35\3\2\2\2\u00d1\u00d2\7\7\2\2\u00d2\u00d3"+
		"\5\30\r\2\u00d3\u00d4\7\60\2\2\u00d4\u00d5\5\36\20\2\u00d5\u00d8\3\2\2"+
		"\2\u00d6\u00d8\3\2\2\2\u00d7\u00d1\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\37"+
		"\3\2\2\2\u00d9\u00da\7\32\2\2\u00da\u00db\5\n\6\2\u00db\u00dc\5\"\22\2"+
		"\u00dc\u00df\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00d9\3\2\2\2\u00de\u00dd"+
		"\3\2\2\2\u00df!\3\2\2\2\u00e0\u00e1\t\5\2\2\u00e1#\3\2\2\2\tIOTY\u00cf"+
		"\u00d7\u00de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}