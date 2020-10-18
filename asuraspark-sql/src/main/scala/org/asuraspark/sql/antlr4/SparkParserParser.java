// Generated from E:\IdeaProjects\asuraspark\asuraspark-sql\src\main\scala\org\asuraspark\sql\antlr4\SparkParser.g4 by ANTLR 4.8
package org.asuraspark.sql.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SparkParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, SELECT=11, FROM=12, ADD=13, AS=14, ALL=15, ANY=16, DISTINCT=17, 
		WHERE=18, GROUP=19, BY=20, GROUPING=21, SETS=22, CUBE=23, ROLLUP=24, ORDER=25, 
		HAVING=26, LIMIT=27, AT=28, OR=29, AND=30, IN=31, NOT=32, NO=33, EXISTS=34, 
		BETWEEN=35, LIKE=36, RLIKE=37, IS=38, NULL=39, TRUE=40, FALSE=41, NULLS=42, 
		ASC=43, DESC=44, FOR=45, INTERVAL=46, CASE=47, WHEN=48, THEN=49, ELSE=50, 
		END=51, JOIN=52, CROSS=53, OUTER=54, INNER=55, LEFT=56, SEMI=57, RIGHT=58, 
		FULL=59, NATURAL=60, ON=61, PIVOT=62, LATERAL=63, WINDOW=64, OVER=65, 
		PARTITION=66, RANGE=67, ROWS=68, UNBOUNDED=69, PRECEDING=70, FOLLOWING=71, 
		CURRENT=72, FIRST=73, AFTER=74, LAST=75, ROW=76, WITH=77, VALUES=78, CREATE=79, 
		TABLE=80, DIRECTORY=81, VIEW=82, REPLACE=83, INSERT=84, DELETE=85, INTO=86, 
		DESCRIBE=87, EXPLAIN=88, FORMAT=89, LOGICAL=90, CODEGEN=91, COST=92, CAST=93, 
		SHOW=94, TABLES=95, COLUMNS=96, COLUMN=97, USE=98, PARTITIONS=99, FUNCTIONS=100, 
		DROP=101, UNION=102, EXCEPT=103, SETMINUS=104, INTERSECT=105, TO=106, 
		TABLESAMPLE=107, STRATIFY=108, ALTER=109, RENAME=110, ARRAY=111, MAP=112, 
		STRUCT=113, COMMENT=114, SET=115, RESET=116, DATA=117, START=118, TRANSACTION=119, 
		COMMIT=120, ROLLBACK=121, MACRO=122, IGNORE=123, BOTH=124, LEADING=125, 
		TRAILING=126, IF=127, POSITION=128, EXTRACT=129, EQ=130, NSEQ=131, NEQ=132, 
		NEQJ=133, LT=134, LTE=135, GT=136, GTE=137, PLUS=138, MINUS=139, ASTERISK=140, 
		SLASH=141, PERCENT=142, DIV=143, TILDE=144, AMPERSAND=145, PIPE=146, CONCAT_PIPE=147, 
		HAT=148, PERCENTLIT=149, BUCKET=150, OUT=151, OF=152, SORT=153, CLUSTER=154, 
		DISTRIBUTE=155, OVERWRITE=156, TRANSFORM=157, REDUCE=158, USING=159, SERDE=160, 
		SERDEPROPERTIES=161, RECORDREADER=162, RECORDWRITER=163, DELIMITED=164, 
		FIELDS=165, TERMINATED=166, COLLECTION=167, ITEMS=168, KEYS=169, ESCAPED=170, 
		LINES=171, SEPARATED=172, FUNCTION=173, EXTENDED=174, REFRESH=175, CLEAR=176, 
		CACHE=177, UNCACHE=178, LAZY=179, FORMATTED=180, GLOBAL=181, TEMPORARY=182, 
		OPTIONS=183, UNSET=184, TBLPROPERTIES=185, DBPROPERTIES=186, BUCKETS=187, 
		SKEWED=188, STORED=189, DIRECTORIES=190, LOCATION=191, EXCHANGE=192, ARCHIVE=193, 
		UNARCHIVE=194, FILEFORMAT=195, TOUCH=196, COMPACT=197, CONCATENATE=198, 
		CHANGE=199, CASCADE=200, RESTRICT=201, CLUSTERED=202, SORTED=203, PURGE=204, 
		INPUTFORMAT=205, OUTPUTFORMAT=206, DATABASE=207, DATABASES=208, DFS=209, 
		TRUNCATE=210, ANALYZE=211, COMPUTE=212, LIST=213, STATISTICS=214, PARTITIONED=215, 
		EXTERNAL=216, DEFINED=217, REVOKE=218, GRANT=219, LOCK=220, UNLOCK=221, 
		MSCK=222, REPAIR=223, RECOVER=224, EXPORT=225, IMPORT=226, LOAD=227, ROLE=228, 
		ROLES=229, COMPACTIONS=230, PRINCIPALS=231, TRANSACTIONS=232, INDEX=233, 
		INDEXES=234, LOCKS=235, OPTION=236, ANTI=237, LOCAL=238, INPATH=239, MERGE=240, 
		STRING=241, BIGINT_LITERAL=242, SMALLINT_LITERAL=243, TINYINT_LITERAL=244, 
		INTEGER_VALUE=245, DECIMAL_VALUE=246, DOUBLE_LITERAL=247, BIGDECIMAL_LITERAL=248, 
		IDENTIFIER=249, BACKQUOTED_IDENTIFIER=250, SIMPLE_COMMENT=251, BRACKETED_EMPTY_COMMENT=252, 
		BRACKETED_COMMENT=253, WS=254, UNRECOGNIZED=255;
	public static final int
		RULE_singleStatement = 0, RULE_singleExpression = 1, RULE_singleTableIdentifier = 2, 
		RULE_singleFunctionIdentifier = 3, RULE_singleDataType = 4, RULE_singleTableSchema = 5, 
		RULE_statement = 6, RULE_unsupportedHiveNativeCommands = 7, RULE_createTableHeader = 8, 
		RULE_bucketSpec = 9, RULE_skewSpec = 10, RULE_locationSpec = 11, RULE_query = 12, 
		RULE_insertInto = 13, RULE_partitionSpecLocation = 14, RULE_partitionSpec = 15, 
		RULE_partitionVal = 16, RULE_describeFuncName = 17, RULE_describeColName = 18, 
		RULE_ctes = 19, RULE_namedQuery = 20, RULE_tableProvider = 21, RULE_tablePropertyList = 22, 
		RULE_tableProperty = 23, RULE_tablePropertyKey = 24, RULE_tablePropertyValue = 25, 
		RULE_constantList = 26, RULE_nestedConstantList = 27, RULE_createFileFormat = 28, 
		RULE_fileFormat = 29, RULE_storageHandler = 30, RULE_resource = 31, RULE_queryNoWith = 32, 
		RULE_queryOrganization = 33, RULE_multiInsertQueryBody = 34, RULE_queryTerm = 35, 
		RULE_queryPrimary = 36, RULE_sortItem = 37, RULE_querySpecification = 38, 
		RULE_hint = 39, RULE_hintStatement = 40, RULE_fromClause = 41, RULE_aggregation = 42, 
		RULE_groupingSet = 43, RULE_pivotClause = 44, RULE_pivotColumn = 45, RULE_pivotValue = 46, 
		RULE_lateralView = 47, RULE_setQuantifier = 48, RULE_relation = 49, RULE_joinRelation = 50, 
		RULE_joinType = 51, RULE_joinCriteria = 52, RULE_sample = 53, RULE_sampleMethod = 54, 
		RULE_identifierList = 55, RULE_identifierSeq = 56, RULE_orderedIdentifierList = 57, 
		RULE_orderedIdentifier = 58, RULE_identifierCommentList = 59, RULE_identifierComment = 60, 
		RULE_relationPrimary = 61, RULE_inlineTable = 62, RULE_functionTable = 63, 
		RULE_tableAlias = 64, RULE_rowFormat = 65, RULE_tableIdentifier = 66, 
		RULE_functionIdentifier = 67, RULE_namedExpression = 68, RULE_namedExpressionSeq = 69, 
		RULE_expression = 70, RULE_booleanExpression = 71, RULE_predicate = 72, 
		RULE_valueExpression = 73, RULE_primaryExpression = 74, RULE_constant = 75, 
		RULE_comparisonOperator = 76, RULE_arithmeticOperator = 77, RULE_predicateOperator = 78, 
		RULE_booleanValue = 79, RULE_interval = 80, RULE_intervalField = 81, RULE_intervalValue = 82, 
		RULE_colPosition = 83, RULE_dataType = 84, RULE_colTypeList = 85, RULE_colType = 86, 
		RULE_complexColTypeList = 87, RULE_complexColType = 88, RULE_whenClause = 89, 
		RULE_windows = 90, RULE_namedWindow = 91, RULE_windowSpec = 92, RULE_windowFrame = 93, 
		RULE_frameBound = 94, RULE_qualifiedName = 95, RULE_identifier = 96, RULE_strictIdentifier = 97, 
		RULE_quotedIdentifier = 98, RULE_number = 99, RULE_nonReserved = 100;
	private static String[] makeRuleNames() {
		return new String[] {
			"singleStatement", "singleExpression", "singleTableIdentifier", "singleFunctionIdentifier", 
			"singleDataType", "singleTableSchema", "statement", "unsupportedHiveNativeCommands", 
			"createTableHeader", "bucketSpec", "skewSpec", "locationSpec", "query", 
			"insertInto", "partitionSpecLocation", "partitionSpec", "partitionVal", 
			"describeFuncName", "describeColName", "ctes", "namedQuery", "tableProvider", 
			"tablePropertyList", "tableProperty", "tablePropertyKey", "tablePropertyValue", 
			"constantList", "nestedConstantList", "createFileFormat", "fileFormat", 
			"storageHandler", "resource", "queryNoWith", "queryOrganization", "multiInsertQueryBody", 
			"queryTerm", "queryPrimary", "sortItem", "querySpecification", "hint", 
			"hintStatement", "fromClause", "aggregation", "groupingSet", "pivotClause", 
			"pivotColumn", "pivotValue", "lateralView", "setQuantifier", "relation", 
			"joinRelation", "joinType", "joinCriteria", "sample", "sampleMethod", 
			"identifierList", "identifierSeq", "orderedIdentifierList", "orderedIdentifier", 
			"identifierCommentList", "identifierComment", "relationPrimary", "inlineTable", 
			"functionTable", "tableAlias", "rowFormat", "tableIdentifier", "functionIdentifier", 
			"namedExpression", "namedExpressionSeq", "expression", "booleanExpression", 
			"predicate", "valueExpression", "primaryExpression", "constant", "comparisonOperator", 
			"arithmeticOperator", "predicateOperator", "booleanValue", "interval", 
			"intervalField", "intervalValue", "colPosition", "dataType", "colTypeList", 
			"colType", "complexColTypeList", "complexColType", "whenClause", "windows", 
			"namedWindow", "windowSpec", "windowFrame", "frameBound", "qualifiedName", 
			"identifier", "strictIdentifier", "quotedIdentifier", "number", "nonReserved"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'.'", "'/*+'", "'*/'", "'->'", "'['", "']'", 
			"':'", "'SELECT'", "'FROM'", "'ADD'", "'AS'", "'ALL'", "'ANY'", "'DISTINCT'", 
			"'WHERE'", "'GROUP'", "'BY'", "'GROUPING'", "'SETS'", "'CUBE'", "'ROLLUP'", 
			"'ORDER'", "'HAVING'", "'LIMIT'", "'AT'", "'OR'", "'AND'", "'IN'", null, 
			"'NO'", "'EXISTS'", "'BETWEEN'", "'LIKE'", null, "'IS'", "'NULL'", "'TRUE'", 
			"'FALSE'", "'NULLS'", "'ASC'", "'DESC'", "'FOR'", "'INTERVAL'", "'CASE'", 
			"'WHEN'", "'THEN'", "'ELSE'", "'END'", "'JOIN'", "'CROSS'", "'OUTER'", 
			"'INNER'", "'LEFT'", "'SEMI'", "'RIGHT'", "'FULL'", "'NATURAL'", "'ON'", 
			"'PIVOT'", "'LATERAL'", "'WINDOW'", "'OVER'", "'PARTITION'", "'RANGE'", 
			"'ROWS'", "'UNBOUNDED'", "'PRECEDING'", "'FOLLOWING'", "'CURRENT'", "'FIRST'", 
			"'AFTER'", "'LAST'", "'ROW'", "'WITH'", "'VALUES'", "'CREATE'", "'TABLE'", 
			"'DIRECTORY'", "'VIEW'", "'REPLACE'", "'INSERT'", "'DELETE'", "'INTO'", 
			"'DESCRIBE'", "'EXPLAIN'", "'FORMAT'", "'LOGICAL'", "'CODEGEN'", "'COST'", 
			"'CAST'", "'SHOW'", "'TABLES'", "'COLUMNS'", "'COLUMN'", "'USE'", "'PARTITIONS'", 
			"'FUNCTIONS'", "'DROP'", "'UNION'", "'EXCEPT'", "'MINUS'", "'INTERSECT'", 
			"'TO'", "'TABLESAMPLE'", "'STRATIFY'", "'ALTER'", "'RENAME'", "'ARRAY'", 
			"'MAP'", "'STRUCT'", "'COMMENT'", "'SET'", "'RESET'", "'DATA'", "'START'", 
			"'TRANSACTION'", "'COMMIT'", "'ROLLBACK'", "'MACRO'", "'IGNORE'", "'BOTH'", 
			"'LEADING'", "'TRAILING'", "'IF'", "'POSITION'", "'EXTRACT'", null, "'<=>'", 
			"'<>'", "'!='", "'<'", null, "'>'", null, "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'DIV'", "'~'", "'&'", "'|'", "'||'", "'^'", "'PERCENT'", "'BUCKET'", 
			"'OUT'", "'OF'", "'SORT'", "'CLUSTER'", "'DISTRIBUTE'", "'OVERWRITE'", 
			"'TRANSFORM'", "'REDUCE'", "'USING'", "'SERDE'", "'SERDEPROPERTIES'", 
			"'RECORDREADER'", "'RECORDWRITER'", "'DELIMITED'", "'FIELDS'", "'TERMINATED'", 
			"'COLLECTION'", "'ITEMS'", "'KEYS'", "'ESCAPED'", "'LINES'", "'SEPARATED'", 
			"'FUNCTION'", "'EXTENDED'", "'REFRESH'", "'CLEAR'", "'CACHE'", "'UNCACHE'", 
			"'LAZY'", "'FORMATTED'", "'GLOBAL'", null, "'OPTIONS'", "'UNSET'", "'TBLPROPERTIES'", 
			"'DBPROPERTIES'", "'BUCKETS'", "'SKEWED'", "'STORED'", "'DIRECTORIES'", 
			"'LOCATION'", "'EXCHANGE'", "'ARCHIVE'", "'UNARCHIVE'", "'FILEFORMAT'", 
			"'TOUCH'", "'COMPACT'", "'CONCATENATE'", "'CHANGE'", "'CASCADE'", "'RESTRICT'", 
			"'CLUSTERED'", "'SORTED'", "'PURGE'", "'INPUTFORMAT'", "'OUTPUTFORMAT'", 
			null, null, "'DFS'", "'TRUNCATE'", "'ANALYZE'", "'COMPUTE'", "'LIST'", 
			"'STATISTICS'", "'PARTITIONED'", "'EXTERNAL'", "'DEFINED'", "'REVOKE'", 
			"'GRANT'", "'LOCK'", "'UNLOCK'", "'MSCK'", "'REPAIR'", "'RECOVER'", "'EXPORT'", 
			"'IMPORT'", "'LOAD'", "'ROLE'", "'ROLES'", "'COMPACTIONS'", "'PRINCIPALS'", 
			"'TRANSACTIONS'", "'INDEX'", "'INDEXES'", "'LOCKS'", "'OPTION'", "'ANTI'", 
			"'LOCAL'", "'INPATH'", "'MERGE'", null, null, null, null, null, null, 
			null, null, null, null, null, "'/**/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "SELECT", 
			"FROM", "ADD", "AS", "ALL", "ANY", "DISTINCT", "WHERE", "GROUP", "BY", 
			"GROUPING", "SETS", "CUBE", "ROLLUP", "ORDER", "HAVING", "LIMIT", "AT", 
			"OR", "AND", "IN", "NOT", "NO", "EXISTS", "BETWEEN", "LIKE", "RLIKE", 
			"IS", "NULL", "TRUE", "FALSE", "NULLS", "ASC", "DESC", "FOR", "INTERVAL", 
			"CASE", "WHEN", "THEN", "ELSE", "END", "JOIN", "CROSS", "OUTER", "INNER", 
			"LEFT", "SEMI", "RIGHT", "FULL", "NATURAL", "ON", "PIVOT", "LATERAL", 
			"WINDOW", "OVER", "PARTITION", "RANGE", "ROWS", "UNBOUNDED", "PRECEDING", 
			"FOLLOWING", "CURRENT", "FIRST", "AFTER", "LAST", "ROW", "WITH", "VALUES", 
			"CREATE", "TABLE", "DIRECTORY", "VIEW", "REPLACE", "INSERT", "DELETE", 
			"INTO", "DESCRIBE", "EXPLAIN", "FORMAT", "LOGICAL", "CODEGEN", "COST", 
			"CAST", "SHOW", "TABLES", "COLUMNS", "COLUMN", "USE", "PARTITIONS", "FUNCTIONS", 
			"DROP", "UNION", "EXCEPT", "SETMINUS", "INTERSECT", "TO", "TABLESAMPLE", 
			"STRATIFY", "ALTER", "RENAME", "ARRAY", "MAP", "STRUCT", "COMMENT", "SET", 
			"RESET", "DATA", "START", "TRANSACTION", "COMMIT", "ROLLBACK", "MACRO", 
			"IGNORE", "BOTH", "LEADING", "TRAILING", "IF", "POSITION", "EXTRACT", 
			"EQ", "NSEQ", "NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", 
			"ASTERISK", "SLASH", "PERCENT", "DIV", "TILDE", "AMPERSAND", "PIPE", 
			"CONCAT_PIPE", "HAT", "PERCENTLIT", "BUCKET", "OUT", "OF", "SORT", "CLUSTER", 
			"DISTRIBUTE", "OVERWRITE", "TRANSFORM", "REDUCE", "USING", "SERDE", "SERDEPROPERTIES", 
			"RECORDREADER", "RECORDWRITER", "DELIMITED", "FIELDS", "TERMINATED", 
			"COLLECTION", "ITEMS", "KEYS", "ESCAPED", "LINES", "SEPARATED", "FUNCTION", 
			"EXTENDED", "REFRESH", "CLEAR", "CACHE", "UNCACHE", "LAZY", "FORMATTED", 
			"GLOBAL", "TEMPORARY", "OPTIONS", "UNSET", "TBLPROPERTIES", "DBPROPERTIES", 
			"BUCKETS", "SKEWED", "STORED", "DIRECTORIES", "LOCATION", "EXCHANGE", 
			"ARCHIVE", "UNARCHIVE", "FILEFORMAT", "TOUCH", "COMPACT", "CONCATENATE", 
			"CHANGE", "CASCADE", "RESTRICT", "CLUSTERED", "SORTED", "PURGE", "INPUTFORMAT", 
			"OUTPUTFORMAT", "DATABASE", "DATABASES", "DFS", "TRUNCATE", "ANALYZE", 
			"COMPUTE", "LIST", "STATISTICS", "PARTITIONED", "EXTERNAL", "DEFINED", 
			"REVOKE", "GRANT", "LOCK", "UNLOCK", "MSCK", "REPAIR", "RECOVER", "EXPORT", 
			"IMPORT", "LOAD", "ROLE", "ROLES", "COMPACTIONS", "PRINCIPALS", "TRANSACTIONS", 
			"INDEX", "INDEXES", "LOCKS", "OPTION", "ANTI", "LOCAL", "INPATH", "MERGE", 
			"STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", "TINYINT_LITERAL", "INTEGER_VALUE", 
			"DECIMAL_VALUE", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", "IDENTIFIER", 
			"BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", 
			"BRACKETED_COMMENT", "WS", "UNRECOGNIZED"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SparkParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  /**
	   * When false, INTERSECT is given the greater precedence over the other set
	   * operations (UNION, EXCEPT and MINUS) as per the SQL standard.
	   */
	  public boolean legacy_setops_precedence_enbled = false;

	  /**
	   * Verify whether current token is a valid decimal token (which contains dot).
	   * Returns true if the character that follows the token is not a digit or letter or underscore.
	   *
	   * For example:
	   * For char stream "2.3", "2." is not a valid decimal token, because it is followed by digit '3'.
	   * For char stream "2.3_", "2.3" is not a valid decimal token, because it is followed by '_'.
	   * For char stream "2.3W", "2.3" is not a valid decimal token, because it is followed by 'W'.
	   * For char stream "12.0D 34.E2+0.12 "  12.0D is a valid decimal token because it is followed
	   * by a space. 34.E2 is a valid decimal token because it is followed by symbol '+'
	   * which is not a digit or letter or underscore.
	   */
	  public boolean isValidDecimal() {
	    int nextChar = _input.LA(1);
	    if (nextChar >= 'A' && nextChar <= 'Z' || nextChar >= '0' && nextChar <= '9' ||
	      nextChar == '_') {
	      return false;
	    } else {
	      return true;
	    }
	  }

	public SparkParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SparkParserParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			statement();
			setState(203);
			match(EOF);
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

	public static class SingleExpressionContext extends ParserRuleContext {
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SparkParserParser.EOF, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			namedExpression();
			setState(206);
			match(EOF);
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

	public static class SingleTableIdentifierContext extends ParserRuleContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SparkParserParser.EOF, 0); }
		public SingleTableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterSingleTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitSingleTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitSingleTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableIdentifierContext singleTableIdentifier() throws RecognitionException {
		SingleTableIdentifierContext _localctx = new SingleTableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleTableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			tableIdentifier();
			setState(209);
			match(EOF);
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

	public static class SingleFunctionIdentifierContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SparkParserParser.EOF, 0); }
		public SingleFunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleFunctionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterSingleFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitSingleFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitSingleFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleFunctionIdentifierContext singleFunctionIdentifier() throws RecognitionException {
		SingleFunctionIdentifierContext _localctx = new SingleFunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleFunctionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			functionIdentifier();
			setState(212);
			match(EOF);
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

	public static class SingleDataTypeContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SparkParserParser.EOF, 0); }
		public SingleDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterSingleDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitSingleDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitSingleDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDataTypeContext singleDataType() throws RecognitionException {
		SingleDataTypeContext _localctx = new SingleDataTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			dataType();
			setState(215);
			match(EOF);
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

	public static class SingleTableSchemaContext extends ParserRuleContext {
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SparkParserParser.EOF, 0); }
		public SingleTableSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableSchema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterSingleTableSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitSingleTableSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitSingleTableSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableSchemaContext singleTableSchema() throws RecognitionException {
		SingleTableSchemaContext _localctx = new SingleTableSchemaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleTableSchema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			colTypeList();
			setState(218);
			match(EOF);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(SparkParserParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LOGICAL() { return getToken(SparkParserParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(SparkParserParser.FORMATTED, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkParserParser.EXTENDED, 0); }
		public TerminalNode CODEGEN() { return getToken(SparkParserParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(SparkParserParser.COST, 0); }
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropDatabaseContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SparkParserParser.DROP, 0); }
		public TerminalNode DATABASE() { return getToken(SparkParserParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkParserParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkParserParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(SparkParserParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(SparkParserParser.CASCADE, 0); }
		public DropDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterDropDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitDropDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitDropDatabase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SparkParserParser.RESET, 0); }
		public ResetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterResetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitResetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitResetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeDatabaseContext extends StatementContext {
		public TerminalNode DATABASE() { return getToken(SparkParserParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SparkParserParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkParserParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkParserParser.EXTENDED, 0); }
		public DescribeDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterDescribeDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitDescribeDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitDescribeDatabase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterViewQueryContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkParserParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(SparkParserParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkParserParser.AS, 0); }
		public AlterViewQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterAlterViewQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitAlterViewQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitAlterViewQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseContext extends StatementContext {
		public IdentifierContext db;
		public TerminalNode USE() { return getToken(SparkParserParser.USE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTempViewUsingContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SparkParserParser.CREATE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkParserParser.TEMPORARY, 0); }
		public TerminalNode VIEW() { return getToken(SparkParserParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode OR() { return getToken(SparkParserParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SparkParserParser.REPLACE, 0); }
		public TerminalNode GLOBAL() { return getToken(SparkParserParser.GLOBAL, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SparkParserParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public CreateTempViewUsingContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterCreateTempViewUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitCreateTempViewUsing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitCreateTempViewUsing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableContext extends StatementContext {
		public TableIdentifierContext from;
		public TableIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SparkParserParser.ALTER, 0); }
		public TerminalNode RENAME() { return getToken(SparkParserParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SparkParserParser.TO, 0); }
		public TerminalNode TABLE() { return getToken(SparkParserParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SparkParserParser.VIEW, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FailNativeCommandContext extends StatementContext {
		public TerminalNode SET() { return getToken(SparkParserParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(SparkParserParser.ROLE, 0); }
		public UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() {
			return getRuleContext(UnsupportedHiveNativeCommandsContext.class,0);
		}
		public FailNativeCommandContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterFailNativeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitFailNativeCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitFailNativeCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClearCacheContext extends StatementContext {
		public TerminalNode CLEAR() { return getToken(SparkParserParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(SparkParserParser.CACHE, 0); }
		public ClearCacheContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterClearCache(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitClearCache(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitClearCache(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesContext extends StatementContext {
		public IdentifierContext db;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SparkParserParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SparkParserParser.TABLES, 0); }
		public TerminalNode FROM() { return getToken(SparkParserParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SparkParserParser.IN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkParserParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SparkParserParser.LIKE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RecoverPartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkParserParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkParserParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode RECOVER() { return getToken(SparkParserParser.RECOVER, 0); }
		public TerminalNode PARTITIONS() { return getToken(SparkParserParser.PARTITIONS, 0); }
		public RecoverPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterRecoverPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitRecoverPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitRecoverPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTablePartitionContext extends StatementContext {
		public PartitionSpecContext from;
		public PartitionSpecContext to;
		public TerminalNode ALTER() { return getToken(SparkParserParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkParserParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(SparkParserParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SparkParserParser.TO, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public RenameTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterRenameTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitRenameTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitRenameTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepairTableContext extends StatementContext {
		public TerminalNode MSCK() { return getToken(SparkParserParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(SparkParserParser.REPAIR, 0); }
		public TerminalNode TABLE() { return getToken(SparkParserParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public RepairTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterRepairTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitRepairTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitRepairTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshResourceContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SparkParserParser.REFRESH, 0); }
		public TerminalNode STRING() { return getToken(SparkParserParser.STRING, 0); }
		public RefreshResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterRefreshResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitRefreshResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitRefreshResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SparkParserParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SparkParserParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SparkParserParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitShowCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitShowCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowColumnsContext extends StatementContext {
		public IdentifierContext db;
		public TerminalNode SHOW() { return getToken(SparkParserParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkParserParser.COLUMNS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public List<TerminalNode> FROM() { return getTokens(SparkParserParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(SparkParserParser.FROM, i);
		}
		public List<TerminalNode> IN() { return getTokens(SparkParserParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(SparkParserParser.IN, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitShowColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MergeTableContext extends StatementContext {
		public TerminalNode MERGE() { return getToken(SparkParserParser.MERGE, 0); }
		public TerminalNode TABLE() { return getToken(SparkParserParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkParserParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkParserParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkParserParser.EXISTS, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public MergeTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterMergeTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitMergeTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitMergeTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTablePartitionContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkParserParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkParserParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SparkParserParser.ADD, 0); }
		public TerminalNode IF() { return getToken(SparkParserParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkParserParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkParserParser.EXISTS, 0); }
		public List<PartitionSpecLocationContext> partitionSpecLocation() {
			return getRuleContexts(PartitionSpecLocationContext.class);
		}
		public PartitionSpecLocationContext partitionSpecLocation(int i) {
			return getRuleContext(PartitionSpecLocationContext.class,i);
		}
		public TerminalNode VIEW() { return getToken(SparkParserParser.VIEW, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public AddTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterAddTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitAddTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitAddTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshTableContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SparkParserParser.REFRESH, 0); }
		public TerminalNode TABLE() { return getToken(SparkParserParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public RefreshTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterRefreshTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitRefreshTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitRefreshTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ManageResourceContext extends StatementContext {
		public Token op;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SparkParserParser.ADD, 0); }
		public TerminalNode LIST() { return getToken(SparkParserParser.LIST, 0); }
		public ManageResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterManageResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitManageResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitManageResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateDatabaseContext extends StatementContext {
		public Token comment;
		public TerminalNode CREATE() { return getToken(SparkParserParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(SparkParserParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkParserParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkParserParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkParserParser.EXISTS, 0); }
		public TerminalNode COMMENT() { return getToken(SparkParserParser.COMMENT, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SparkParserParser.WITH, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SparkParserParser.DBPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkParserParser.STRING, 0); }
		public CreateDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterCreateDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitCreateDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitCreateDatabase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(SparkParserParser.ANALYZE, 0); }
		public TerminalNode TABLE() { return getToken(SparkParserParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode COMPUTE() { return getToken(SparkParserParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(SparkParserParser.STATISTICS, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SparkParserParser.FOR, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkParserParser.COLUMNS, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterAnalyze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitAnalyze(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitAnalyze(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateHiveTableContext extends StatementContext {
		public ColTypeListContext columns;
		public Token comment;
		public ColTypeListContext partitionColumns;
		public TablePropertyListContext tableProps;
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public List<BucketSpecContext> bucketSpec() {
			return getRuleContexts(BucketSpecContext.class);
		}
		public BucketSpecContext bucketSpec(int i) {
			return getRuleContext(BucketSpecContext.class,i);
		}
		public List<SkewSpecContext> skewSpec() {
			return getRuleContexts(SkewSpecContext.class);
		}
		public SkewSpecContext skewSpec(int i) {
			return getRuleContext(SkewSpecContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<ColTypeListContext> colTypeList() {
			return getRuleContexts(ColTypeListContext.class);
		}
		public ColTypeListContext colTypeList(int i) {
			return getRuleContext(ColTypeListContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(SparkParserParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(SparkParserParser.COMMENT, i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SparkParserParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SparkParserParser.PARTITIONED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SparkParserParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkParserParser.BY, i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SparkParserParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SparkParserParser.TBLPROPERTIES, i);
		}
		public List<TerminalNode> STRING() { return getTokens(SparkParserParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SparkParserParser.STRING, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public TerminalNode AS() { return getToken(SparkParserParser.AS, 0); }
		public CreateHiveTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterCreateHiveTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitCreateHiveTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitCreateHiveTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateFunctionContext extends StatementContext {
		public Token className;
		public TerminalNode CREATE() { return getToken(SparkParserParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SparkParserParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkParserParser.AS, 0); }
		public TerminalNode STRING() { return getToken(SparkParserParser.STRING, 0); }
		public TerminalNode OR() { return getToken(SparkParserParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SparkParserParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkParserParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SparkParserParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkParserParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkParserParser.EXISTS, 0); }
		public TerminalNode USING() { return getToken(SparkParserParser.USING, 0); }
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public CreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTableContext extends StatementContext {
		public IdentifierContext db;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SparkParserParser.SHOW, 0); }
		public TerminalNode TABLE() { return getToken(SparkParserParser.TABLE, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkParserParser.EXTENDED, 0); }
		public TerminalNode LIKE() { return getToken(SparkParserParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SparkParserParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SparkParserParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SparkParserParser.IN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ShowTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterShowTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitShowTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitShowTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetDatabasePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkParserParser.ALTER, 0); }
		public TerminalNode DATABASE() { return getToken(SparkParserParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SparkParserParser.SET, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SparkParserParser.DBPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public SetDatabasePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterSetDatabaseProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitSetDatabaseProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitSetDatabaseProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public TablePropertyListContext options;
		public IdentifierListContext partitionColumnNames;
		public Token comment;
		public TablePropertyListContext tableProps;
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public List<BucketSpecContext> bucketSpec() {
			return getRuleContexts(BucketSpecContext.class);
		}
		public BucketSpecContext bucketSpec(int i) {
			return getRuleContext(BucketSpecContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<TerminalNode> OPTIONS() { return getTokens(SparkParserParser.OPTIONS); }
		public TerminalNode OPTIONS(int i) {
			return getToken(SparkParserParser.OPTIONS, i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SparkParserParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SparkParserParser.PARTITIONED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SparkParserParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkParserParser.BY, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(SparkParserParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(SparkParserParser.COMMENT, i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SparkParserParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SparkParserParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(SparkParserParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SparkParserParser.STRING, i);
		}
		public TerminalNode AS() { return getToken(SparkParserParser.AS, 0); }
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeTableContext extends StatementContext {
		public Token option;
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SparkParserParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkParserParser.DESCRIBE, 0); }
		public TerminalNode TABLE() { return getToken(SparkParserParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public DescribeColNameContext describeColName() {
			return getRuleContext(DescribeColNameContext.class,0);
		}
		public TerminalNode EXTENDED() { return getToken(SparkParserParser.EXTENDED, 0); }
		public TerminalNode FORMATTED() { return getToken(SparkParserParser.FORMATTED, 0); }
		public DescribeTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterDescribeTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitDescribeTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitDescribeTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableLikeContext extends StatementContext {
		public TableIdentifierContext target;
		public TableIdentifierContext source;
		public TerminalNode CREATE() { return getToken(SparkParserParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SparkParserParser.TABLE, 0); }
		public TerminalNode LIKE() { return getToken(SparkParserParser.LIKE, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public TerminalNode IF() { return getToken(SparkParserParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkParserParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkParserParser.EXISTS, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public CreateTableLikeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterCreateTableLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitCreateTableLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitCreateTableLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UncacheTableContext extends StatementContext {
		public TerminalNode UNCACHE() { return getToken(SparkParserParser.UNCACHE, 0); }
		public TerminalNode TABLE() { return getToken(SparkParserParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkParserParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkParserParser.EXISTS, 0); }
		public UncacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterUncacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitUncacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitUncacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropFunctionContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SparkParserParser.DROP, 0); }
		public TerminalNode FUNCTION() { return getToken(SparkParserParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SparkParserParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SparkParserParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkParserParser.EXISTS, 0); }
		public DropFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterDropFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitDropFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitDropFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoadDataContext extends StatementContext {
		public Token path;
		public TerminalNode LOAD() { return getToken(SparkParserParser.LOAD, 0); }
		public TerminalNode DATA() { return getToken(SparkParserParser.DATA, 0); }
		public TerminalNode INPATH() { return getToken(SparkParserParser.INPATH, 0); }
		public TerminalNode INTO() { return getToken(SparkParserParser.INTO, 0); }
		public TerminalNode TABLE() { return getToken(SparkParserParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkParserParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SparkParserParser.LOCAL, 0); }
		public TerminalNode OVERWRITE() { return getToken(SparkParserParser.OVERWRITE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LoadDataContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterLoadData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitLoadData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitLoadData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowPartitionsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SparkParserParser.SHOW, 0); }
		public TerminalNode PARTITIONS() { return getToken(SparkParserParser.PARTITIONS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public ShowPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterShowPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitShowPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitShowPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeFunctionContext extends StatementContext {
		public TerminalNode FUNCTION() { return getToken(SparkParserParser.FUNCTION, 0); }
		public DescribeFuncNameContext describeFuncName() {
			return getRuleContext(DescribeFuncNameContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SparkParserParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkParserParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkParserParser.EXTENDED, 0); }
		public DescribeFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterDescribeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitDescribeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitDescribeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChangeColumnContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkParserParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkParserParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode CHANGE() { return getToken(SparkParserParser.CHANGE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SparkParserParser.COLUMN, 0); }
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public ChangeColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterChangeColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitChangeColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitChangeColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TruncateTableContext extends StatementContext {
		public TerminalNode TRUNCATE() { return getToken(SparkParserParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(SparkParserParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TruncateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterTruncateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitTruncateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitTruncateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableSerDeContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkParserParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkParserParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SparkParserParser.SET, 0); }
		public TerminalNode SERDE() { return getToken(SparkParserParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SparkParserParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SparkParserParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SparkParserParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public SetTableSerDeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterSetTableSerDe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitSetTableSerDe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitSetTableSerDe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SparkParserParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SparkParserParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkParserParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(SparkParserParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SparkParserParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkParserParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SparkParserParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkParserParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkParserParser.EXISTS, 0); }
		public IdentifierCommentListContext identifierCommentList() {
			return getRuleContext(IdentifierCommentListContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SparkParserParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SparkParserParser.STRING, 0); }
		public TerminalNode PARTITIONED() { return getToken(SparkParserParser.PARTITIONED, 0); }
		public TerminalNode ON() { return getToken(SparkParserParser.ON, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode TBLPROPERTIES() { return getToken(SparkParserParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode GLOBAL() { return getToken(SparkParserParser.GLOBAL, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTablePartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkParserParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkParserParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SparkParserParser.DROP, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public TerminalNode IF() { return getToken(SparkParserParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkParserParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SparkParserParser.PURGE, 0); }
		public TerminalNode VIEW() { return getToken(SparkParserParser.VIEW, 0); }
		public DropTablePartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterDropTablePartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitDropTablePartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitDropTablePartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(SparkParserParser.SET, 0); }
		public SetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterSetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitSetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitSetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SparkParserParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SparkParserParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkParserParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkParserParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SparkParserParser.PURGE, 0); }
		public TerminalNode VIEW() { return getToken(SparkParserParser.VIEW, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowDatabasesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SparkParserParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(SparkParserParser.DATABASES, 0); }
		public TerminalNode STRING() { return getToken(SparkParserParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SparkParserParser.LIKE, 0); }
		public ShowDatabasesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterShowDatabases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitShowDatabases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitShowDatabases(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTblPropertiesContext extends StatementContext {
		public TableIdentifierContext table;
		public TablePropertyKeyContext key;
		public TerminalNode SHOW() { return getToken(SparkParserParser.SHOW, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SparkParserParser.TBLPROPERTIES, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public ShowTblPropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterShowTblProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitShowTblProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitShowTblProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnsetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkParserParser.ALTER, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode UNSET() { return getToken(SparkParserParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SparkParserParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SparkParserParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SparkParserParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SparkParserParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkParserParser.EXISTS, 0); }
		public UnsetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterUnsetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitUnsetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitUnsetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkParserParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkParserParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SparkParserParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public SetTableLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterSetTableLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitSetTableLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitSetTableLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowFunctionsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SparkParserParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SparkParserParser.FUNCTIONS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SparkParserParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SparkParserParser.STRING, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitShowFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitShowFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CacheTableContext extends StatementContext {
		public TerminalNode CACHE() { return getToken(SparkParserParser.CACHE, 0); }
		public TerminalNode TABLE() { return getToken(SparkParserParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode LAZY() { return getToken(SparkParserParser.LAZY, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkParserParser.AS, 0); }
		public CacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterCacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitCacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitCacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTableColumnsContext extends StatementContext {
		public ColTypeListContext columns;
		public TerminalNode ALTER() { return getToken(SparkParserParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkParserParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SparkParserParser.ADD, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkParserParser.COLUMNS, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public AddTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterAddTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitAddTableColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitAddTableColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkParserParser.ALTER, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SparkParserParser.SET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SparkParserParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SparkParserParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SparkParserParser.VIEW, 0); }
		public SetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterSetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitSetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitSetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				query();
				}
				break;
			case 2:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(USE);
				setState(222);
				((UseContext)_localctx).db = identifier();
				}
				break;
			case 3:
				_localctx = new CreateDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				match(CREATE);
				setState(224);
				match(DATABASE);
				setState(228);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(225);
					match(IF);
					setState(226);
					match(NOT);
					setState(227);
					match(EXISTS);
					}
					break;
				}
				setState(230);
				identifier();
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(231);
					match(COMMENT);
					setState(232);
					((CreateDatabaseContext)_localctx).comment = match(STRING);
					}
				}

				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(235);
					locationSpec();
					}
				}

				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(238);
					match(WITH);
					setState(239);
					match(DBPROPERTIES);
					setState(240);
					tablePropertyList();
					}
				}

				}
				break;
			case 4:
				_localctx = new SetDatabasePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				match(ALTER);
				setState(244);
				match(DATABASE);
				setState(245);
				identifier();
				setState(246);
				match(SET);
				setState(247);
				match(DBPROPERTIES);
				setState(248);
				tablePropertyList();
				}
				break;
			case 5:
				_localctx = new DropDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(250);
				match(DROP);
				setState(251);
				match(DATABASE);
				setState(254);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(252);
					match(IF);
					setState(253);
					match(EXISTS);
					}
					break;
				}
				setState(256);
				identifier();
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(257);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 6:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(260);
				createTableHeader();
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(261);
					match(T__0);
					setState(262);
					colTypeList();
					setState(263);
					match(T__1);
					}
				}

				setState(267);
				tableProvider();
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || ((((_la - 183)) & ~0x3f) == 0 && ((1L << (_la - 183)) & ((1L << (OPTIONS - 183)) | (1L << (TBLPROPERTIES - 183)) | (1L << (LOCATION - 183)) | (1L << (CLUSTERED - 183)) | (1L << (PARTITIONED - 183)))) != 0)) {
					{
					setState(279);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPTIONS:
						{
						{
						setState(268);
						match(OPTIONS);
						setState(269);
						((CreateTableContext)_localctx).options = tablePropertyList();
						}
						}
						break;
					case PARTITIONED:
						{
						{
						setState(270);
						match(PARTITIONED);
						setState(271);
						match(BY);
						setState(272);
						((CreateTableContext)_localctx).partitionColumnNames = identifierList();
						}
						}
						break;
					case CLUSTERED:
						{
						setState(273);
						bucketSpec();
						}
						break;
					case LOCATION:
						{
						setState(274);
						locationSpec();
						}
						break;
					case COMMENT:
						{
						{
						setState(275);
						match(COMMENT);
						setState(276);
						((CreateTableContext)_localctx).comment = match(STRING);
						}
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(277);
						match(TBLPROPERTIES);
						setState(278);
						((CreateTableContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (WITH - 77)) | (1L << (VALUES - 77)) | (1L << (TABLE - 77)) | (1L << (INSERT - 77)) | (1L << (MAP - 77)))) != 0) || _la==REDUCE) {
					{
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(284);
						match(AS);
						}
					}

					setState(287);
					query();
					}
				}

				}
				break;
			case 7:
				_localctx = new CreateHiveTableContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(290);
				createTableHeader();
				setState(295);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(291);
					match(T__0);
					setState(292);
					((CreateHiveTableContext)_localctx).columns = colTypeList();
					setState(293);
					match(T__1);
					}
					break;
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ROW || _la==COMMENT || ((((_la - 185)) & ~0x3f) == 0 && ((1L << (_la - 185)) & ((1L << (TBLPROPERTIES - 185)) | (1L << (SKEWED - 185)) | (1L << (STORED - 185)) | (1L << (LOCATION - 185)) | (1L << (CLUSTERED - 185)) | (1L << (PARTITIONED - 185)))) != 0)) {
					{
					setState(312);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						{
						setState(297);
						match(COMMENT);
						setState(298);
						((CreateHiveTableContext)_localctx).comment = match(STRING);
						}
						}
						break;
					case PARTITIONED:
						{
						{
						setState(299);
						match(PARTITIONED);
						setState(300);
						match(BY);
						setState(301);
						match(T__0);
						setState(302);
						((CreateHiveTableContext)_localctx).partitionColumns = colTypeList();
						setState(303);
						match(T__1);
						}
						}
						break;
					case CLUSTERED:
						{
						setState(305);
						bucketSpec();
						}
						break;
					case SKEWED:
						{
						setState(306);
						skewSpec();
						}
						break;
					case ROW:
						{
						setState(307);
						rowFormat();
						}
						break;
					case STORED:
						{
						setState(308);
						createFileFormat();
						}
						break;
					case LOCATION:
						{
						setState(309);
						locationSpec();
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(310);
						match(TBLPROPERTIES);
						setState(311);
						((CreateHiveTableContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(316);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (WITH - 77)) | (1L << (VALUES - 77)) | (1L << (TABLE - 77)) | (1L << (INSERT - 77)) | (1L << (MAP - 77)))) != 0) || _la==REDUCE) {
					{
					setState(318);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(317);
						match(AS);
						}
					}

					setState(320);
					query();
					}
				}

				}
				break;
			case 8:
				_localctx = new CreateTableLikeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(323);
				match(CREATE);
				setState(324);
				match(TABLE);
				setState(328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(325);
					match(IF);
					setState(326);
					match(NOT);
					setState(327);
					match(EXISTS);
					}
					break;
				}
				setState(330);
				((CreateTableLikeContext)_localctx).target = tableIdentifier();
				setState(331);
				match(LIKE);
				setState(332);
				((CreateTableLikeContext)_localctx).source = tableIdentifier();
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(333);
					locationSpec();
					}
				}

				}
				break;
			case 9:
				_localctx = new MergeTableContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(336);
				match(MERGE);
				setState(337);
				match(TABLE);
				setState(341);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(338);
					match(IF);
					setState(339);
					match(NOT);
					setState(340);
					match(EXISTS);
					}
					break;
				}
				setState(343);
				tableIdentifier();
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(344);
					partitionSpec();
					}
				}

				}
				break;
			case 10:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(347);
				match(ANALYZE);
				setState(348);
				match(TABLE);
				setState(349);
				tableIdentifier();
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(350);
					partitionSpec();
					}
				}

				setState(353);
				match(COMPUTE);
				setState(354);
				match(STATISTICS);
				setState(359);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(355);
					identifier();
					}
					break;
				case 2:
					{
					setState(356);
					match(FOR);
					setState(357);
					match(COLUMNS);
					setState(358);
					identifierSeq();
					}
					break;
				}
				}
				break;
			case 11:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(361);
				match(ALTER);
				setState(362);
				match(TABLE);
				setState(363);
				tableIdentifier();
				setState(364);
				match(ADD);
				setState(365);
				match(COLUMNS);
				setState(366);
				match(T__0);
				setState(367);
				((AddTableColumnsContext)_localctx).columns = colTypeList();
				setState(368);
				match(T__1);
				}
				break;
			case 12:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(370);
				match(ALTER);
				setState(371);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(372);
				((RenameTableContext)_localctx).from = tableIdentifier();
				setState(373);
				match(RENAME);
				setState(374);
				match(TO);
				setState(375);
				((RenameTableContext)_localctx).to = tableIdentifier();
				}
				break;
			case 13:
				_localctx = new SetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(377);
				match(ALTER);
				setState(378);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(379);
				tableIdentifier();
				setState(380);
				match(SET);
				setState(381);
				match(TBLPROPERTIES);
				setState(382);
				tablePropertyList();
				}
				break;
			case 14:
				_localctx = new UnsetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(384);
				match(ALTER);
				setState(385);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(386);
				tableIdentifier();
				setState(387);
				match(UNSET);
				setState(388);
				match(TBLPROPERTIES);
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(389);
					match(IF);
					setState(390);
					match(EXISTS);
					}
				}

				setState(393);
				tablePropertyList();
				}
				break;
			case 15:
				_localctx = new ChangeColumnContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(395);
				match(ALTER);
				setState(396);
				match(TABLE);
				setState(397);
				tableIdentifier();
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(398);
					partitionSpec();
					}
				}

				setState(401);
				match(CHANGE);
				setState(403);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(402);
					match(COLUMN);
					}
					break;
				}
				setState(405);
				identifier();
				setState(406);
				colType();
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FIRST || _la==AFTER) {
					{
					setState(407);
					colPosition();
					}
				}

				}
				break;
			case 16:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(410);
				match(ALTER);
				setState(411);
				match(TABLE);
				setState(412);
				tableIdentifier();
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(413);
					partitionSpec();
					}
				}

				setState(416);
				match(SET);
				setState(417);
				match(SERDE);
				setState(418);
				match(STRING);
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(419);
					match(WITH);
					setState(420);
					match(SERDEPROPERTIES);
					setState(421);
					tablePropertyList();
					}
				}

				}
				break;
			case 17:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(424);
				match(ALTER);
				setState(425);
				match(TABLE);
				setState(426);
				tableIdentifier();
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(427);
					partitionSpec();
					}
				}

				setState(430);
				match(SET);
				setState(431);
				match(SERDEPROPERTIES);
				setState(432);
				tablePropertyList();
				}
				break;
			case 18:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(434);
				match(ALTER);
				setState(435);
				match(TABLE);
				setState(436);
				tableIdentifier();
				setState(437);
				match(ADD);
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(438);
					match(IF);
					setState(439);
					match(NOT);
					setState(440);
					match(EXISTS);
					}
				}

				setState(444); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(443);
					partitionSpecLocation();
					}
					}
					setState(446); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 19:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(448);
				match(ALTER);
				setState(449);
				match(VIEW);
				setState(450);
				tableIdentifier();
				setState(451);
				match(ADD);
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(452);
					match(IF);
					setState(453);
					match(NOT);
					setState(454);
					match(EXISTS);
					}
				}

				setState(458); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(457);
					partitionSpec();
					}
					}
					setState(460); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 20:
				_localctx = new RenameTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(462);
				match(ALTER);
				setState(463);
				match(TABLE);
				setState(464);
				tableIdentifier();
				setState(465);
				((RenameTablePartitionContext)_localctx).from = partitionSpec();
				setState(466);
				match(RENAME);
				setState(467);
				match(TO);
				setState(468);
				((RenameTablePartitionContext)_localctx).to = partitionSpec();
				}
				break;
			case 21:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(470);
				match(ALTER);
				setState(471);
				match(TABLE);
				setState(472);
				tableIdentifier();
				setState(473);
				match(DROP);
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(474);
					match(IF);
					setState(475);
					match(EXISTS);
					}
				}

				setState(478);
				partitionSpec();
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(479);
					match(T__2);
					setState(480);
					partitionSpec();
					}
					}
					setState(485);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(486);
					match(PURGE);
					}
				}

				}
				break;
			case 22:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(489);
				match(ALTER);
				setState(490);
				match(VIEW);
				setState(491);
				tableIdentifier();
				setState(492);
				match(DROP);
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(493);
					match(IF);
					setState(494);
					match(EXISTS);
					}
				}

				setState(497);
				partitionSpec();
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(498);
					match(T__2);
					setState(499);
					partitionSpec();
					}
					}
					setState(504);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 23:
				_localctx = new SetTableLocationContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(505);
				match(ALTER);
				setState(506);
				match(TABLE);
				setState(507);
				tableIdentifier();
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(508);
					partitionSpec();
					}
				}

				setState(511);
				match(SET);
				setState(512);
				locationSpec();
				}
				break;
			case 24:
				_localctx = new RecoverPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(514);
				match(ALTER);
				setState(515);
				match(TABLE);
				setState(516);
				tableIdentifier();
				setState(517);
				match(RECOVER);
				setState(518);
				match(PARTITIONS);
				}
				break;
			case 25:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(520);
				match(DROP);
				setState(521);
				match(TABLE);
				setState(524);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(522);
					match(IF);
					setState(523);
					match(EXISTS);
					}
					break;
				}
				setState(526);
				tableIdentifier();
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(527);
					match(PURGE);
					}
				}

				}
				break;
			case 26:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(530);
				match(DROP);
				setState(531);
				match(VIEW);
				setState(534);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(532);
					match(IF);
					setState(533);
					match(EXISTS);
					}
					break;
				}
				setState(536);
				tableIdentifier();
				}
				break;
			case 27:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(537);
				match(CREATE);
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(538);
					match(OR);
					setState(539);
					match(REPLACE);
					}
				}

				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==TEMPORARY) {
					{
					setState(543);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GLOBAL) {
						{
						setState(542);
						match(GLOBAL);
						}
					}

					setState(545);
					match(TEMPORARY);
					}
				}

				setState(548);
				match(VIEW);
				setState(552);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(549);
					match(IF);
					setState(550);
					match(NOT);
					setState(551);
					match(EXISTS);
					}
					break;
				}
				setState(554);
				tableIdentifier();
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(555);
					identifierCommentList();
					}
				}

				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(558);
					match(COMMENT);
					setState(559);
					match(STRING);
					}
				}

				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(562);
					match(PARTITIONED);
					setState(563);
					match(ON);
					setState(564);
					identifierList();
					}
				}

				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TBLPROPERTIES) {
					{
					setState(567);
					match(TBLPROPERTIES);
					setState(568);
					tablePropertyList();
					}
				}

				setState(571);
				match(AS);
				setState(572);
				query();
				}
				break;
			case 28:
				_localctx = new CreateTempViewUsingContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(574);
				match(CREATE);
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(575);
					match(OR);
					setState(576);
					match(REPLACE);
					}
				}

				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(579);
					match(GLOBAL);
					}
				}

				setState(582);
				match(TEMPORARY);
				setState(583);
				match(VIEW);
				setState(584);
				tableIdentifier();
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(585);
					match(T__0);
					setState(586);
					colTypeList();
					setState(587);
					match(T__1);
					}
				}

				setState(591);
				tableProvider();
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(592);
					match(OPTIONS);
					setState(593);
					tablePropertyList();
					}
				}

				}
				break;
			case 29:
				_localctx = new AlterViewQueryContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(596);
				match(ALTER);
				setState(597);
				match(VIEW);
				setState(598);
				tableIdentifier();
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(599);
					match(AS);
					}
				}

				setState(602);
				query();
				}
				break;
			case 30:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(604);
				match(CREATE);
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(605);
					match(OR);
					setState(606);
					match(REPLACE);
					}
				}

				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(609);
					match(TEMPORARY);
					}
				}

				setState(612);
				match(FUNCTION);
				setState(616);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(613);
					match(IF);
					setState(614);
					match(NOT);
					setState(615);
					match(EXISTS);
					}
					break;
				}
				setState(618);
				qualifiedName();
				setState(619);
				match(AS);
				setState(620);
				((CreateFunctionContext)_localctx).className = match(STRING);
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(621);
					match(USING);
					setState(622);
					resource();
					setState(627);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(623);
						match(T__2);
						setState(624);
						resource();
						}
						}
						setState(629);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 31:
				_localctx = new DropFunctionContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(632);
				match(DROP);
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(633);
					match(TEMPORARY);
					}
				}

				setState(636);
				match(FUNCTION);
				setState(639);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(637);
					match(IF);
					setState(638);
					match(EXISTS);
					}
					break;
				}
				setState(641);
				qualifiedName();
				}
				break;
			case 32:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(642);
				match(EXPLAIN);
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (LOGICAL - 90)) | (1L << (CODEGEN - 90)) | (1L << (COST - 90)))) != 0) || _la==EXTENDED || _la==FORMATTED) {
					{
					setState(643);
					_la = _input.LA(1);
					if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (LOGICAL - 90)) | (1L << (CODEGEN - 90)) | (1L << (COST - 90)))) != 0) || _la==EXTENDED || _la==FORMATTED) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(646);
				statement();
				}
				break;
			case 33:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(647);
				match(SHOW);
				setState(648);
				match(TABLES);
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(649);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(650);
					((ShowTablesContext)_localctx).db = identifier();
					}
				}

				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(654);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(653);
						match(LIKE);
						}
					}

					setState(656);
					((ShowTablesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 34:
				_localctx = new ShowTableContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(659);
				match(SHOW);
				setState(660);
				match(TABLE);
				setState(661);
				match(EXTENDED);
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(662);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(663);
					((ShowTableContext)_localctx).db = identifier();
					}
				}

				setState(666);
				match(LIKE);
				setState(667);
				((ShowTableContext)_localctx).pattern = match(STRING);
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(668);
					partitionSpec();
					}
				}

				}
				break;
			case 35:
				_localctx = new ShowDatabasesContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(671);
				match(SHOW);
				setState(672);
				match(DATABASES);
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(674);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(673);
						match(LIKE);
						}
					}

					setState(676);
					((ShowDatabasesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 36:
				_localctx = new ShowTblPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(679);
				match(SHOW);
				setState(680);
				match(TBLPROPERTIES);
				setState(681);
				((ShowTblPropertiesContext)_localctx).table = tableIdentifier();
				setState(686);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(682);
					match(T__0);
					setState(683);
					((ShowTblPropertiesContext)_localctx).key = tablePropertyKey();
					setState(684);
					match(T__1);
					}
				}

				}
				break;
			case 37:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(688);
				match(SHOW);
				setState(689);
				match(COLUMNS);
				setState(690);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(691);
				tableIdentifier();
				setState(694);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(692);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(693);
					((ShowColumnsContext)_localctx).db = identifier();
					}
				}

				}
				break;
			case 38:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(696);
				match(SHOW);
				setState(697);
				match(PARTITIONS);
				setState(698);
				tableIdentifier();
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(699);
					partitionSpec();
					}
				}

				}
				break;
			case 39:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(702);
				match(SHOW);
				setState(704);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(703);
					identifier();
					}
					break;
				}
				setState(706);
				match(FUNCTIONS);
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (DIV - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)) | (1L << (LOCATION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(708);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						setState(707);
						match(LIKE);
						}
						break;
					}
					setState(712);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SELECT:
					case FROM:
					case ADD:
					case AS:
					case ALL:
					case ANY:
					case DISTINCT:
					case WHERE:
					case GROUP:
					case BY:
					case GROUPING:
					case SETS:
					case CUBE:
					case ROLLUP:
					case ORDER:
					case HAVING:
					case LIMIT:
					case AT:
					case OR:
					case AND:
					case IN:
					case NOT:
					case NO:
					case EXISTS:
					case BETWEEN:
					case LIKE:
					case RLIKE:
					case IS:
					case NULL:
					case TRUE:
					case FALSE:
					case NULLS:
					case ASC:
					case DESC:
					case FOR:
					case INTERVAL:
					case CASE:
					case WHEN:
					case THEN:
					case ELSE:
					case END:
					case JOIN:
					case CROSS:
					case OUTER:
					case INNER:
					case LEFT:
					case SEMI:
					case RIGHT:
					case FULL:
					case NATURAL:
					case ON:
					case PIVOT:
					case LATERAL:
					case WINDOW:
					case OVER:
					case PARTITION:
					case RANGE:
					case ROWS:
					case UNBOUNDED:
					case PRECEDING:
					case FOLLOWING:
					case CURRENT:
					case FIRST:
					case AFTER:
					case LAST:
					case ROW:
					case WITH:
					case VALUES:
					case CREATE:
					case TABLE:
					case DIRECTORY:
					case VIEW:
					case REPLACE:
					case INSERT:
					case DELETE:
					case INTO:
					case DESCRIBE:
					case EXPLAIN:
					case FORMAT:
					case LOGICAL:
					case CODEGEN:
					case COST:
					case CAST:
					case SHOW:
					case TABLES:
					case COLUMNS:
					case COLUMN:
					case USE:
					case PARTITIONS:
					case FUNCTIONS:
					case DROP:
					case UNION:
					case EXCEPT:
					case SETMINUS:
					case INTERSECT:
					case TO:
					case TABLESAMPLE:
					case STRATIFY:
					case ALTER:
					case RENAME:
					case ARRAY:
					case MAP:
					case STRUCT:
					case COMMENT:
					case SET:
					case RESET:
					case DATA:
					case START:
					case TRANSACTION:
					case COMMIT:
					case ROLLBACK:
					case MACRO:
					case IGNORE:
					case BOTH:
					case LEADING:
					case TRAILING:
					case IF:
					case POSITION:
					case EXTRACT:
					case DIV:
					case PERCENTLIT:
					case BUCKET:
					case OUT:
					case OF:
					case SORT:
					case CLUSTER:
					case DISTRIBUTE:
					case OVERWRITE:
					case TRANSFORM:
					case REDUCE:
					case SERDE:
					case SERDEPROPERTIES:
					case RECORDREADER:
					case RECORDWRITER:
					case DELIMITED:
					case FIELDS:
					case TERMINATED:
					case COLLECTION:
					case ITEMS:
					case KEYS:
					case ESCAPED:
					case LINES:
					case SEPARATED:
					case FUNCTION:
					case EXTENDED:
					case REFRESH:
					case CLEAR:
					case CACHE:
					case UNCACHE:
					case LAZY:
					case FORMATTED:
					case GLOBAL:
					case TEMPORARY:
					case OPTIONS:
					case UNSET:
					case TBLPROPERTIES:
					case DBPROPERTIES:
					case BUCKETS:
					case SKEWED:
					case STORED:
					case DIRECTORIES:
					case LOCATION:
					case EXCHANGE:
					case ARCHIVE:
					case UNARCHIVE:
					case FILEFORMAT:
					case TOUCH:
					case COMPACT:
					case CONCATENATE:
					case CHANGE:
					case CASCADE:
					case RESTRICT:
					case CLUSTERED:
					case SORTED:
					case PURGE:
					case INPUTFORMAT:
					case OUTPUTFORMAT:
					case DATABASE:
					case DATABASES:
					case DFS:
					case TRUNCATE:
					case ANALYZE:
					case COMPUTE:
					case LIST:
					case STATISTICS:
					case PARTITIONED:
					case EXTERNAL:
					case DEFINED:
					case REVOKE:
					case GRANT:
					case LOCK:
					case UNLOCK:
					case MSCK:
					case REPAIR:
					case RECOVER:
					case EXPORT:
					case IMPORT:
					case LOAD:
					case ROLE:
					case ROLES:
					case COMPACTIONS:
					case PRINCIPALS:
					case TRANSACTIONS:
					case INDEX:
					case INDEXES:
					case LOCKS:
					case OPTION:
					case ANTI:
					case LOCAL:
					case INPATH:
					case IDENTIFIER:
					case BACKQUOTED_IDENTIFIER:
						{
						setState(710);
						qualifiedName();
						}
						break;
					case STRING:
						{
						setState(711);
						((ShowFunctionsContext)_localctx).pattern = match(STRING);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
			case 40:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(716);
				match(SHOW);
				setState(717);
				match(CREATE);
				setState(718);
				match(TABLE);
				setState(719);
				tableIdentifier();
				}
				break;
			case 41:
				_localctx = new DescribeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(720);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(721);
				match(FUNCTION);
				setState(723);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(722);
					match(EXTENDED);
					}
					break;
				}
				setState(725);
				describeFuncName();
				}
				break;
			case 42:
				_localctx = new DescribeDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(726);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(727);
				match(DATABASE);
				setState(729);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(728);
					match(EXTENDED);
					}
					break;
				}
				setState(731);
				identifier();
				}
				break;
			case 43:
				_localctx = new DescribeTableContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(732);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(734);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(733);
					match(TABLE);
					}
					break;
				}
				setState(737);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(736);
					((DescribeTableContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXTENDED || _la==FORMATTED) ) {
						((DescribeTableContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(739);
				tableIdentifier();
				setState(741);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(740);
					partitionSpec();
					}
					break;
				}
				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (DIV - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)) | (1L << (LOCATION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(743);
					describeColName();
					}
				}

				}
				break;
			case 44:
				_localctx = new RefreshTableContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(746);
				match(REFRESH);
				setState(747);
				match(TABLE);
				setState(748);
				tableIdentifier();
				}
				break;
			case 45:
				_localctx = new RefreshResourceContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(749);
				match(REFRESH);
				setState(757);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(750);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(754);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(751);
							matchWildcard();
							}
							} 
						}
						setState(756);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 46:
				_localctx = new CacheTableContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(759);
				match(CACHE);
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAZY) {
					{
					setState(760);
					match(LAZY);
					}
				}

				setState(763);
				match(TABLE);
				setState(764);
				tableIdentifier();
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (WITH - 77)) | (1L << (VALUES - 77)) | (1L << (TABLE - 77)) | (1L << (INSERT - 77)) | (1L << (MAP - 77)))) != 0) || _la==REDUCE) {
					{
					setState(766);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(765);
						match(AS);
						}
					}

					setState(768);
					query();
					}
				}

				}
				break;
			case 47:
				_localctx = new UncacheTableContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(771);
				match(UNCACHE);
				setState(772);
				match(TABLE);
				setState(775);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(773);
					match(IF);
					setState(774);
					match(EXISTS);
					}
					break;
				}
				setState(777);
				tableIdentifier();
				}
				break;
			case 48:
				_localctx = new ClearCacheContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(778);
				match(CLEAR);
				setState(779);
				match(CACHE);
				}
				break;
			case 49:
				_localctx = new LoadDataContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(780);
				match(LOAD);
				setState(781);
				match(DATA);
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(782);
					match(LOCAL);
					}
				}

				setState(785);
				match(INPATH);
				setState(786);
				((LoadDataContext)_localctx).path = match(STRING);
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(787);
					match(OVERWRITE);
					}
				}

				setState(790);
				match(INTO);
				setState(791);
				match(TABLE);
				setState(792);
				tableIdentifier();
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(793);
					partitionSpec();
					}
				}

				}
				break;
			case 50:
				_localctx = new TruncateTableContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(796);
				match(TRUNCATE);
				setState(797);
				match(TABLE);
				setState(798);
				tableIdentifier();
				setState(800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(799);
					partitionSpec();
					}
				}

				}
				break;
			case 51:
				_localctx = new RepairTableContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(802);
				match(MSCK);
				setState(803);
				match(REPAIR);
				setState(804);
				match(TABLE);
				setState(805);
				tableIdentifier();
				}
				break;
			case 52:
				_localctx = new ManageResourceContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(806);
				((ManageResourceContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==LIST) ) {
					((ManageResourceContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(807);
				identifier();
				setState(811);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(808);
						matchWildcard();
						}
						} 
					}
					setState(813);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				}
				}
				break;
			case 53:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(814);
				match(SET);
				setState(815);
				match(ROLE);
				setState(819);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(816);
						matchWildcard();
						}
						} 
					}
					setState(821);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				}
				}
				break;
			case 54:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(822);
				match(SET);
				setState(826);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(823);
						matchWildcard();
						}
						} 
					}
					setState(828);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				}
				}
				break;
			case 55:
				_localctx = new ResetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(829);
				match(RESET);
				}
				break;
			case 56:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 56);
				{
				setState(830);
				unsupportedHiveNativeCommands();
				setState(834);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(831);
						matchWildcard();
						}
						} 
					}
					setState(836);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				}
				}
				break;
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

	public static class UnsupportedHiveNativeCommandsContext extends ParserRuleContext {
		public Token kw1;
		public Token kw2;
		public Token kw3;
		public Token kw4;
		public Token kw5;
		public Token kw6;
		public TerminalNode CREATE() { return getToken(SparkParserParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(SparkParserParser.ROLE, 0); }
		public TerminalNode DROP() { return getToken(SparkParserParser.DROP, 0); }
		public TerminalNode GRANT() { return getToken(SparkParserParser.GRANT, 0); }
		public TerminalNode REVOKE() { return getToken(SparkParserParser.REVOKE, 0); }
		public TerminalNode SHOW() { return getToken(SparkParserParser.SHOW, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SparkParserParser.PRINCIPALS, 0); }
		public TerminalNode ROLES() { return getToken(SparkParserParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(SparkParserParser.CURRENT, 0); }
		public TerminalNode EXPORT() { return getToken(SparkParserParser.EXPORT, 0); }
		public TerminalNode TABLE() { return getToken(SparkParserParser.TABLE, 0); }
		public TerminalNode IMPORT() { return getToken(SparkParserParser.IMPORT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SparkParserParser.COMPACTIONS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SparkParserParser.TRANSACTIONS, 0); }
		public TerminalNode INDEXES() { return getToken(SparkParserParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(SparkParserParser.LOCKS, 0); }
		public TerminalNode INDEX() { return getToken(SparkParserParser.INDEX, 0); }
		public TerminalNode ALTER() { return getToken(SparkParserParser.ALTER, 0); }
		public TerminalNode LOCK() { return getToken(SparkParserParser.LOCK, 0); }
		public TerminalNode DATABASE() { return getToken(SparkParserParser.DATABASE, 0); }
		public TerminalNode UNLOCK() { return getToken(SparkParserParser.UNLOCK, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkParserParser.TEMPORARY, 0); }
		public TerminalNode MACRO() { return getToken(SparkParserParser.MACRO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SparkParserParser.NOT, 0); }
		public TerminalNode CLUSTERED() { return getToken(SparkParserParser.CLUSTERED, 0); }
		public TerminalNode BY() { return getToken(SparkParserParser.BY, 0); }
		public TerminalNode SORTED() { return getToken(SparkParserParser.SORTED, 0); }
		public TerminalNode SKEWED() { return getToken(SparkParserParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(SparkParserParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SparkParserParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SparkParserParser.DIRECTORIES, 0); }
		public TerminalNode SET() { return getToken(SparkParserParser.SET, 0); }
		public TerminalNode LOCATION() { return getToken(SparkParserParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(SparkParserParser.EXCHANGE, 0); }
		public TerminalNode PARTITION() { return getToken(SparkParserParser.PARTITION, 0); }
		public TerminalNode ARCHIVE() { return getToken(SparkParserParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SparkParserParser.UNARCHIVE, 0); }
		public TerminalNode TOUCH() { return getToken(SparkParserParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(SparkParserParser.COMPACT, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode CONCATENATE() { return getToken(SparkParserParser.CONCATENATE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SparkParserParser.FILEFORMAT, 0); }
		public TerminalNode REPLACE() { return getToken(SparkParserParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkParserParser.COLUMNS, 0); }
		public TerminalNode START() { return getToken(SparkParserParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SparkParserParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(SparkParserParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SparkParserParser.ROLLBACK, 0); }
		public TerminalNode DFS() { return getToken(SparkParserParser.DFS, 0); }
		public TerminalNode DELETE() { return getToken(SparkParserParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SparkParserParser.FROM, 0); }
		public UnsupportedHiveNativeCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsupportedHiveNativeCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterUnsupportedHiveNativeCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitUnsupportedHiveNativeCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitUnsupportedHiveNativeCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() throws RecognitionException {
		UnsupportedHiveNativeCommandsContext _localctx = new UnsupportedHiveNativeCommandsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unsupportedHiveNativeCommands);
		int _la;
		try {
			setState(1009);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(839);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(840);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(841);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(842);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(843);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(GRANT);
				setState(845);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(844);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(847);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(REVOKE);
				setState(849);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(848);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(851);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(852);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(GRANT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(853);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(854);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				setState(856);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(855);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(GRANT);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(858);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(859);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(PRINCIPALS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(860);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(861);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(862);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(863);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CURRENT);
				setState(864);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ROLES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(865);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(EXPORT);
				setState(866);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(867);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(IMPORT);
				setState(868);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(869);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(870);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(COMPACTIONS);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(871);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(872);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CREATE);
				setState(873);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(874);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(875);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTIONS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(876);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(877);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEXES);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(878);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(879);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(LOCKS);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(880);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(881);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(882);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(883);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(884);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(885);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(886);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(887);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(888);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(889);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(890);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(891);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(892);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(893);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(894);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(895);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(896);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(897);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(898);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(899);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(900);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(901);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(902);
				tableIdentifier();
				setState(903);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(904);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(CLUSTERED);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(906);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(907);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(908);
				tableIdentifier();
				setState(909);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CLUSTERED);
				setState(910);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(912);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(913);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(914);
				tableIdentifier();
				setState(915);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(916);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SORTED);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(918);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(919);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(920);
				tableIdentifier();
				setState(921);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SKEWED);
				setState(922);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(924);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(925);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(926);
				tableIdentifier();
				setState(927);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(928);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(930);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(931);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(932);
				tableIdentifier();
				setState(933);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(934);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(STORED);
				setState(935);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(AS);
				setState(936);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw6 = match(DIRECTORIES);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(938);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(939);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(940);
				tableIdentifier();
				setState(941);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(942);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				setState(943);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(LOCATION);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(945);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(946);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(947);
				tableIdentifier();
				setState(948);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(EXCHANGE);
				setState(949);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(951);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(952);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(953);
				tableIdentifier();
				setState(954);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ARCHIVE);
				setState(955);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(957);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(958);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(959);
				tableIdentifier();
				setState(960);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(UNARCHIVE);
				setState(961);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(963);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(964);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(965);
				tableIdentifier();
				setState(966);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TOUCH);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(968);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(969);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(970);
				tableIdentifier();
				setState(972);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(971);
					partitionSpec();
					}
				}

				setState(974);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(COMPACT);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(976);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(977);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(978);
				tableIdentifier();
				setState(980);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(979);
					partitionSpec();
					}
				}

				setState(982);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CONCATENATE);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(984);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(985);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(986);
				tableIdentifier();
				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(987);
					partitionSpec();
					}
				}

				setState(990);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(991);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(FILEFORMAT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(993);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(994);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(995);
				tableIdentifier();
				setState(997);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(996);
					partitionSpec();
					}
				}

				setState(999);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(REPLACE);
				setState(1000);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1002);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(START);
				setState(1003);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTION);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1004);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(COMMIT);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1005);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ROLLBACK);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(1006);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DFS);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(1007);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DELETE);
				setState(1008);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(FROM);
				}
				break;
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

	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SparkParserParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SparkParserParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SparkParserParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(SparkParserParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(SparkParserParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkParserParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkParserParser.EXISTS, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterCreateTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitCreateTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitCreateTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			match(CREATE);
			setState(1013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1012);
				match(TEMPORARY);
				}
			}

			setState(1016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1015);
				match(EXTERNAL);
				}
			}

			setState(1018);
			match(TABLE);
			setState(1022);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(1019);
				match(IF);
				setState(1020);
				match(NOT);
				setState(1021);
				match(EXISTS);
				}
				break;
			}
			setState(1024);
			tableIdentifier();
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

	public static class BucketSpecContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SparkParserParser.CLUSTERED, 0); }
		public List<TerminalNode> BY() { return getTokens(SparkParserParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkParserParser.BY, i);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SparkParserParser.INTO, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SparkParserParser.INTEGER_VALUE, 0); }
		public TerminalNode BUCKETS() { return getToken(SparkParserParser.BUCKETS, 0); }
		public TerminalNode SORTED() { return getToken(SparkParserParser.SORTED, 0); }
		public OrderedIdentifierListContext orderedIdentifierList() {
			return getRuleContext(OrderedIdentifierListContext.class,0);
		}
		public BucketSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucketSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterBucketSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitBucketSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitBucketSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucketSpecContext bucketSpec() throws RecognitionException {
		BucketSpecContext _localctx = new BucketSpecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bucketSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			match(CLUSTERED);
			setState(1027);
			match(BY);
			setState(1028);
			identifierList();
			setState(1032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(1029);
				match(SORTED);
				setState(1030);
				match(BY);
				setState(1031);
				orderedIdentifierList();
				}
			}

			setState(1034);
			match(INTO);
			setState(1035);
			match(INTEGER_VALUE);
			setState(1036);
			match(BUCKETS);
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

	public static class SkewSpecContext extends ParserRuleContext {
		public TerminalNode SKEWED() { return getToken(SparkParserParser.SKEWED, 0); }
		public TerminalNode BY() { return getToken(SparkParserParser.BY, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ON() { return getToken(SparkParserParser.ON, 0); }
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public NestedConstantListContext nestedConstantList() {
			return getRuleContext(NestedConstantListContext.class,0);
		}
		public TerminalNode STORED() { return getToken(SparkParserParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SparkParserParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SparkParserParser.DIRECTORIES, 0); }
		public SkewSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterSkewSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitSkewSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitSkewSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkewSpecContext skewSpec() throws RecognitionException {
		SkewSpecContext _localctx = new SkewSpecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_skewSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			match(SKEWED);
			setState(1039);
			match(BY);
			setState(1040);
			identifierList();
			setState(1041);
			match(ON);
			setState(1044);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(1042);
				constantList();
				}
				break;
			case 2:
				{
				setState(1043);
				nestedConstantList();
				}
				break;
			}
			setState(1049);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(1046);
				match(STORED);
				setState(1047);
				match(AS);
				setState(1048);
				match(DIRECTORIES);
				}
				break;
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

	public static class LocationSpecContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(SparkParserParser.LOCATION, 0); }
		public TerminalNode STRING() { return getToken(SparkParserParser.STRING, 0); }
		public LocationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterLocationSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitLocationSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitLocationSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationSpecContext locationSpec() throws RecognitionException {
		LocationSpecContext _localctx = new LocationSpecContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_locationSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			match(LOCATION);
			setState(1052);
			match(STRING);
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

	public static class QueryContext extends ParserRuleContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1054);
				ctes();
				}
			}

			setState(1057);
			queryNoWith();
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

	public static class InsertIntoContext extends ParserRuleContext {
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
	 
		public InsertIntoContext() { }
		public void copyFrom(InsertIntoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsertOverwriteHiveDirContext extends InsertIntoContext {
		public Token path;
		public TerminalNode INSERT() { return getToken(SparkParserParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SparkParserParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SparkParserParser.DIRECTORY, 0); }
		public TerminalNode STRING() { return getToken(SparkParserParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SparkParserParser.LOCAL, 0); }
		public RowFormatContext rowFormat() {
			return getRuleContext(RowFormatContext.class,0);
		}
		public CreateFileFormatContext createFileFormat() {
			return getRuleContext(CreateFileFormatContext.class,0);
		}
		public InsertOverwriteHiveDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterInsertOverwriteHiveDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitInsertOverwriteHiveDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitInsertOverwriteHiveDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteDirContext extends InsertIntoContext {
		public Token path;
		public TablePropertyListContext options;
		public TerminalNode INSERT() { return getToken(SparkParserParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SparkParserParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SparkParserParser.DIRECTORY, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(SparkParserParser.LOCAL, 0); }
		public TerminalNode OPTIONS() { return getToken(SparkParserParser.OPTIONS, 0); }
		public TerminalNode STRING() { return getToken(SparkParserParser.STRING, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public InsertOverwriteDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterInsertOverwriteDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitInsertOverwriteDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitInsertOverwriteDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SparkParserParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SparkParserParser.OVERWRITE, 0); }
		public TerminalNode TABLE() { return getToken(SparkParserParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkParserParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkParserParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkParserParser.EXISTS, 0); }
		public InsertOverwriteTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterInsertOverwriteTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitInsertOverwriteTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitInsertOverwriteTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertIntoTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SparkParserParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SparkParserParser.INTO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SparkParserParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public InsertIntoTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterInsertIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitInsertIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitInsertIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_insertInto);
		int _la;
		try {
			setState(1107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				_localctx = new InsertOverwriteTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1059);
				match(INSERT);
				setState(1060);
				match(OVERWRITE);
				setState(1061);
				match(TABLE);
				setState(1062);
				tableIdentifier();
				setState(1069);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1063);
					partitionSpec();
					setState(1067);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(1064);
						match(IF);
						setState(1065);
						match(NOT);
						setState(1066);
						match(EXISTS);
						}
					}

					}
				}

				}
				break;
			case 2:
				_localctx = new InsertIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1071);
				match(INSERT);
				setState(1072);
				match(INTO);
				setState(1074);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1073);
					match(TABLE);
					}
					break;
				}
				setState(1076);
				tableIdentifier();
				setState(1078);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1077);
					partitionSpec();
					}
				}

				}
				break;
			case 3:
				_localctx = new InsertOverwriteHiveDirContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1080);
				match(INSERT);
				setState(1081);
				match(OVERWRITE);
				setState(1083);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1082);
					match(LOCAL);
					}
				}

				setState(1085);
				match(DIRECTORY);
				setState(1086);
				((InsertOverwriteHiveDirContext)_localctx).path = match(STRING);
				setState(1088);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1087);
					rowFormat();
					}
				}

				setState(1091);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(1090);
					createFileFormat();
					}
				}

				}
				break;
			case 4:
				_localctx = new InsertOverwriteDirContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1093);
				match(INSERT);
				setState(1094);
				match(OVERWRITE);
				setState(1096);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1095);
					match(LOCAL);
					}
				}

				setState(1098);
				match(DIRECTORY);
				setState(1100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(1099);
					((InsertOverwriteDirContext)_localctx).path = match(STRING);
					}
				}

				setState(1102);
				tableProvider();
				setState(1105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1103);
					match(OPTIONS);
					setState(1104);
					((InsertOverwriteDirContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
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

	public static class PartitionSpecLocationContext extends ParserRuleContext {
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpecLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterPartitionSpecLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitPartitionSpecLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitPartitionSpecLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecLocationContext partitionSpecLocation() throws RecognitionException {
		PartitionSpecLocationContext _localctx = new PartitionSpecLocationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_partitionSpecLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			partitionSpec();
			setState(1111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(1110);
				locationSpec();
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

	public static class PartitionSpecContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SparkParserParser.PARTITION, 0); }
		public List<PartitionValContext> partitionVal() {
			return getRuleContexts(PartitionValContext.class);
		}
		public PartitionValContext partitionVal(int i) {
			return getRuleContext(PartitionValContext.class,i);
		}
		public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterPartitionSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitPartitionSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitPartitionSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecContext partitionSpec() throws RecognitionException {
		PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_partitionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1113);
			match(PARTITION);
			setState(1114);
			match(T__0);
			setState(1115);
			partitionVal();
			setState(1120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1116);
				match(T__2);
				setState(1117);
				partitionVal();
				}
				}
				setState(1122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1123);
			match(T__1);
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

	public static class PartitionValContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SparkParserParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PartitionValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterPartitionVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitPartitionVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitPartitionVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionValContext partitionVal() throws RecognitionException {
		PartitionValContext _localctx = new PartitionValContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_partitionVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1125);
			identifier();
			setState(1128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1126);
				match(EQ);
				setState(1127);
				constant();
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

	public static class DescribeFuncNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkParserParser.STRING, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public PredicateOperatorContext predicateOperator() {
			return getRuleContext(PredicateOperatorContext.class,0);
		}
		public DescribeFuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeFuncName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterDescribeFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitDescribeFuncName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitDescribeFuncName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeFuncNameContext describeFuncName() throws RecognitionException {
		DescribeFuncNameContext _localctx = new DescribeFuncNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_describeFuncName);
		try {
			setState(1135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1130);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1131);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1132);
				comparisonOperator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1133);
				arithmeticOperator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1134);
				predicateOperator();
				}
				break;
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

	public static class DescribeColNameContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> nameParts = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public DescribeColNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeColName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterDescribeColName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitDescribeColName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitDescribeColName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeColNameContext describeColName() throws RecognitionException {
		DescribeColNameContext _localctx = new DescribeColNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_describeColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137);
			((DescribeColNameContext)_localctx).identifier = identifier();
			((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
			setState(1142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1138);
				match(T__3);
				setState(1139);
				((DescribeColNameContext)_localctx).identifier = identifier();
				((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
				}
				}
				setState(1144);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class CtesContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SparkParserParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterCtes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitCtes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitCtes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1145);
			match(WITH);
			setState(1146);
			namedQuery();
			setState(1151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1147);
				match(T__2);
				setState(1148);
				namedQuery();
				}
				}
				setState(1153);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class NamedQueryContext extends ParserRuleContext {
		public IdentifierContext name;
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkParserParser.AS, 0); }
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitNamedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1154);
			((NamedQueryContext)_localctx).name = identifier();
			setState(1156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1155);
				match(AS);
				}
			}

			setState(1158);
			match(T__0);
			setState(1159);
			query();
			setState(1160);
			match(T__1);
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

	public static class TableProviderContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(SparkParserParser.USING, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableProviderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProvider; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterTableProvider(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitTableProvider(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitTableProvider(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableProviderContext tableProvider() throws RecognitionException {
		TableProviderContext _localctx = new TableProviderContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tableProvider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1162);
			match(USING);
			setState(1163);
			qualifiedName();
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

	public static class TablePropertyListContext extends ParserRuleContext {
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public TablePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterTablePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitTablePropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitTablePropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyListContext tablePropertyList() throws RecognitionException {
		TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tablePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1165);
			match(T__0);
			setState(1166);
			tableProperty();
			setState(1171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1167);
				match(T__2);
				setState(1168);
				tableProperty();
				}
				}
				setState(1173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1174);
			match(T__1);
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

	public static class TablePropertyContext extends ParserRuleContext {
		public TablePropertyKeyContext key;
		public TablePropertyValueContext value;
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public TablePropertyValueContext tablePropertyValue() {
			return getRuleContext(TablePropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SparkParserParser.EQ, 0); }
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterTableProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitTableProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitTableProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tableProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176);
			((TablePropertyContext)_localctx).key = tablePropertyKey();
			setState(1181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRUE || _la==FALSE || _la==EQ || ((((_la - 241)) & ~0x3f) == 0 && ((1L << (_la - 241)) & ((1L << (STRING - 241)) | (1L << (INTEGER_VALUE - 241)) | (1L << (DECIMAL_VALUE - 241)))) != 0)) {
				{
				setState(1178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1177);
					match(EQ);
					}
				}

				setState(1180);
				((TablePropertyContext)_localctx).value = tablePropertyValue();
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

	public static class TablePropertyKeyContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode STRING() { return getToken(SparkParserParser.STRING, 0); }
		public TablePropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterTablePropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitTablePropertyKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitTablePropertyKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyKeyContext tablePropertyKey() throws RecognitionException {
		TablePropertyKeyContext _localctx = new TablePropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tablePropertyKey);
		int _la;
		try {
			setState(1192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case ANY:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case PIVOT:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case SETMINUS:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case EXTRACT:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1183);
				identifier();
				setState(1188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1184);
					match(T__3);
					setState(1185);
					identifier();
					}
					}
					setState(1190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1191);
				match(STRING);
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

	public static class TablePropertyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SparkParserParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SparkParserParser.DECIMAL_VALUE, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkParserParser.STRING, 0); }
		public TablePropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterTablePropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitTablePropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitTablePropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyValueContext tablePropertyValue() throws RecognitionException {
		TablePropertyValueContext _localctx = new TablePropertyValueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tablePropertyValue);
		try {
			setState(1198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1194);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1195);
				match(DECIMAL_VALUE);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1196);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1197);
				match(STRING);
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

	public static class ConstantListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			match(T__0);
			setState(1201);
			constant();
			setState(1206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1202);
				match(T__2);
				setState(1203);
				constant();
				}
				}
				setState(1208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1209);
			match(T__1);
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

	public static class NestedConstantListContext extends ParserRuleContext {
		public List<ConstantListContext> constantList() {
			return getRuleContexts(ConstantListContext.class);
		}
		public ConstantListContext constantList(int i) {
			return getRuleContext(ConstantListContext.class,i);
		}
		public NestedConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterNestedConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitNestedConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitNestedConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedConstantListContext nestedConstantList() throws RecognitionException {
		NestedConstantListContext _localctx = new NestedConstantListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_nestedConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			match(T__0);
			setState(1212);
			constantList();
			setState(1217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1213);
				match(T__2);
				setState(1214);
				constantList();
				}
				}
				setState(1219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1220);
			match(T__1);
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

	public static class CreateFileFormatContext extends ParserRuleContext {
		public TerminalNode STORED() { return getToken(SparkParserParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SparkParserParser.AS, 0); }
		public FileFormatContext fileFormat() {
			return getRuleContext(FileFormatContext.class,0);
		}
		public TerminalNode BY() { return getToken(SparkParserParser.BY, 0); }
		public StorageHandlerContext storageHandler() {
			return getRuleContext(StorageHandlerContext.class,0);
		}
		public CreateFileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFileFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterCreateFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitCreateFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitCreateFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFileFormatContext createFileFormat() throws RecognitionException {
		CreateFileFormatContext _localctx = new CreateFileFormatContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_createFileFormat);
		try {
			setState(1228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1222);
				match(STORED);
				setState(1223);
				match(AS);
				setState(1224);
				fileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1225);
				match(STORED);
				setState(1226);
				match(BY);
				setState(1227);
				storageHandler();
				}
				break;
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

	public static class FileFormatContext extends ParserRuleContext {
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
	 
		public FileFormatContext() { }
		public void copyFrom(FileFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableFileFormatContext extends FileFormatContext {
		public Token inFmt;
		public Token outFmt;
		public TerminalNode INPUTFORMAT() { return getToken(SparkParserParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SparkParserParser.OUTPUTFORMAT, 0); }
		public List<TerminalNode> STRING() { return getTokens(SparkParserParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SparkParserParser.STRING, i);
		}
		public TableFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterTableFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitTableFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitTableFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenericFileFormatContext extends FileFormatContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterGenericFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitGenericFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitGenericFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileFormatContext fileFormat() throws RecognitionException {
		FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fileFormat);
		try {
			setState(1235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1230);
				match(INPUTFORMAT);
				setState(1231);
				((TableFileFormatContext)_localctx).inFmt = match(STRING);
				setState(1232);
				match(OUTPUTFORMAT);
				setState(1233);
				((TableFileFormatContext)_localctx).outFmt = match(STRING);
				}
				break;
			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1234);
				identifier();
				}
				break;
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

	public static class StorageHandlerContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SparkParserParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SparkParserParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SparkParserParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public StorageHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterStorageHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitStorageHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitStorageHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageHandlerContext storageHandler() throws RecognitionException {
		StorageHandlerContext _localctx = new StorageHandlerContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_storageHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1237);
			match(STRING);
			setState(1241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1238);
				match(WITH);
				setState(1239);
				match(SERDEPROPERTIES);
				setState(1240);
				tablePropertyList();
				}
				break;
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

	public static class ResourceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkParserParser.STRING, 0); }
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			identifier();
			setState(1244);
			match(STRING);
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

	public static class QueryNoWithContext extends ParserRuleContext {
		public QueryNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryNoWith; }
	 
		public QueryNoWithContext() { }
		public void copyFrom(QueryNoWithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleInsertQueryContext extends QueryNoWithContext {
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public SingleInsertQueryContext(QueryNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterSingleInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitSingleInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitSingleInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiInsertQueryContext extends QueryNoWithContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<MultiInsertQueryBodyContext> multiInsertQueryBody() {
			return getRuleContexts(MultiInsertQueryBodyContext.class);
		}
		public MultiInsertQueryBodyContext multiInsertQueryBody(int i) {
			return getRuleContext(MultiInsertQueryBodyContext.class,i);
		}
		public MultiInsertQueryContext(QueryNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterMultiInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitMultiInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitMultiInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryNoWithContext queryNoWith() throws RecognitionException {
		QueryNoWithContext _localctx = new QueryNoWithContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_queryNoWith);
		int _la;
		try {
			setState(1258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INSERT) {
					{
					setState(1246);
					insertInto();
					}
				}

				setState(1249);
				queryTerm(0);
				setState(1250);
				queryOrganization();
				}
				break;
			case 2:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1252);
				fromClause();
				setState(1254); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1253);
					multiInsertQueryBody();
					}
					}
					setState(1256); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SELECT || _la==FROM || _la==INSERT || _la==MAP || _la==REDUCE );
				}
				break;
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

	public static class QueryOrganizationContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> clusterBy = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> distributeBy = new ArrayList<ExpressionContext>();
		public List<SortItemContext> sort = new ArrayList<SortItemContext>();
		public ExpressionContext limit;
		public TerminalNode ORDER() { return getToken(SparkParserParser.ORDER, 0); }
		public List<TerminalNode> BY() { return getTokens(SparkParserParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkParserParser.BY, i);
		}
		public TerminalNode CLUSTER() { return getToken(SparkParserParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SparkParserParser.DISTRIBUTE, 0); }
		public TerminalNode SORT() { return getToken(SparkParserParser.SORT, 0); }
		public WindowsContext windows() {
			return getRuleContext(WindowsContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(SparkParserParser.LIMIT, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SparkParserParser.ALL, 0); }
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterQueryOrganization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitQueryOrganization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitQueryOrganization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_queryOrganization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1260);
				match(ORDER);
				setState(1261);
				match(BY);
				setState(1262);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1263);
					match(T__2);
					setState(1264);
					((QueryOrganizationContext)_localctx).sortItem = sortItem();
					((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
					}
					}
					setState(1269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTER) {
				{
				setState(1272);
				match(CLUSTER);
				setState(1273);
				match(BY);
				setState(1274);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1275);
					match(T__2);
					setState(1276);
					((QueryOrganizationContext)_localctx).expression = expression();
					((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
					}
					}
					setState(1281);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTRIBUTE) {
				{
				setState(1284);
				match(DISTRIBUTE);
				setState(1285);
				match(BY);
				setState(1286);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1287);
					match(T__2);
					setState(1288);
					((QueryOrganizationContext)_localctx).expression = expression();
					((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
					}
					}
					setState(1293);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORT) {
				{
				setState(1296);
				match(SORT);
				setState(1297);
				match(BY);
				setState(1298);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1299);
					match(T__2);
					setState(1300);
					((QueryOrganizationContext)_localctx).sortItem = sortItem();
					((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
					}
					}
					setState(1305);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(1308);
				windows();
				}
			}

			setState(1316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1311);
				match(LIMIT);
				setState(1314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(1312);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(1313);
					((QueryOrganizationContext)_localctx).limit = expression();
					}
					break;
				}
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

	public static class MultiInsertQueryBodyContext extends ParserRuleContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public MultiInsertQueryBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiInsertQueryBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterMultiInsertQueryBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitMultiInsertQueryBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitMultiInsertQueryBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiInsertQueryBodyContext multiInsertQueryBody() throws RecognitionException {
		MultiInsertQueryBodyContext _localctx = new MultiInsertQueryBodyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_multiInsertQueryBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INSERT) {
				{
				setState(1318);
				insertInto();
				}
			}

			setState(1321);
			querySpecification();
			setState(1322);
			queryOrganization();
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

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(SparkParserParser.INTERSECT, 0); }
		public TerminalNode UNION() { return getToken(SparkParserParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(SparkParserParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(SparkParserParser.SETMINUS, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1325);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(1350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1348);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1327);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1328);
						if (!(legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "legacy_setops_precedence_enbled");
						setState(1329);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (UNION - 102)) | (1L << (EXCEPT - 102)) | (1L << (SETMINUS - 102)) | (1L << (INTERSECT - 102)))) != 0)) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1331);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1330);
							setQuantifier();
							}
						}

						setState(1333);
						((SetOperationContext)_localctx).right = queryTerm(4);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1334);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1335);
						if (!(!legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enbled");
						setState(1336);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(1338);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1337);
							setQuantifier();
							}
						}

						setState(1340);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 3:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1341);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1342);
						if (!(!legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enbled");
						setState(1343);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (UNION - 102)) | (1L << (EXCEPT - 102)) | (1L << (SETMINUS - 102)))) != 0)) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1345);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1344);
							setQuantifier();
							}
						}

						setState(1347);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(1352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault1Context extends QueryPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault1Context(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterInlineTableDefault1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitInlineTableDefault1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitInlineTableDefault1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(SparkParserParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_queryPrimary);
		try {
			setState(1361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case MAP:
			case REDUCE:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1353);
				querySpecification();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1354);
				match(TABLE);
				setState(1355);
				tableIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1356);
				inlineTable();
				}
				break;
			case T__0:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1357);
				match(T__0);
				setState(1358);
				queryNoWith();
				setState(1359);
				match(T__1);
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

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrder;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SparkParserParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(SparkParserParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SparkParserParser.DESC, 0); }
		public TerminalNode LAST() { return getToken(SparkParserParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(SparkParserParser.FIRST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
			expression();
			setState(1365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1364);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(1367);
				match(NULLS);
				setState(1368);
				((SortItemContext)_localctx).nullOrder = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrder = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class QuerySpecificationContext extends ParserRuleContext {
		public Token kind;
		public RowFormatContext inRowFormat;
		public Token recordWriter;
		public Token script;
		public RowFormatContext outRowFormat;
		public Token recordReader;
		public BooleanExpressionContext where;
		public HintContext hint;
		public List<HintContext> hints = new ArrayList<HintContext>();
		public BooleanExpressionContext having;
		public TerminalNode USING() { return getToken(SparkParserParser.USING, 0); }
		public List<TerminalNode> STRING() { return getTokens(SparkParserParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SparkParserParser.STRING, i);
		}
		public TerminalNode RECORDWRITER() { return getToken(SparkParserParser.RECORDWRITER, 0); }
		public TerminalNode AS() { return getToken(SparkParserParser.AS, 0); }
		public TerminalNode RECORDREADER() { return getToken(SparkParserParser.RECORDREADER, 0); }
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SparkParserParser.WHERE, 0); }
		public TerminalNode SELECT() { return getToken(SparkParserParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode TRANSFORM() { return getToken(SparkParserParser.TRANSFORM, 0); }
		public TerminalNode MAP() { return getToken(SparkParserParser.MAP, 0); }
		public TerminalNode REDUCE() { return getToken(SparkParserParser.REDUCE, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public AggregationContext aggregation() {
			return getRuleContext(AggregationContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(SparkParserParser.HAVING, 0); }
		public WindowsContext windows() {
			return getRuleContext(WindowsContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public List<HintContext> hint() {
			return getRuleContexts(HintContext.class);
		}
		public HintContext hint(int i) {
			return getRuleContext(HintContext.class,i);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_querySpecification);
		int _la;
		try {
			int _alt;
			setState(1464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				{
				setState(1381);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(1371);
					match(SELECT);
					setState(1372);
					((QuerySpecificationContext)_localctx).kind = match(TRANSFORM);
					setState(1373);
					match(T__0);
					setState(1374);
					namedExpressionSeq();
					setState(1375);
					match(T__1);
					}
					break;
				case MAP:
					{
					setState(1377);
					((QuerySpecificationContext)_localctx).kind = match(MAP);
					setState(1378);
					namedExpressionSeq();
					}
					break;
				case REDUCE:
					{
					setState(1379);
					((QuerySpecificationContext)_localctx).kind = match(REDUCE);
					setState(1380);
					namedExpressionSeq();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1383);
					((QuerySpecificationContext)_localctx).inRowFormat = rowFormat();
					}
				}

				setState(1388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RECORDWRITER) {
					{
					setState(1386);
					match(RECORDWRITER);
					setState(1387);
					((QuerySpecificationContext)_localctx).recordWriter = match(STRING);
					}
				}

				setState(1390);
				match(USING);
				setState(1391);
				((QuerySpecificationContext)_localctx).script = match(STRING);
				setState(1404);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
				case 1:
					{
					setState(1392);
					match(AS);
					setState(1402);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
					case 1:
						{
						setState(1393);
						identifierSeq();
						}
						break;
					case 2:
						{
						setState(1394);
						colTypeList();
						}
						break;
					case 3:
						{
						{
						setState(1395);
						match(T__0);
						setState(1398);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
						case 1:
							{
							setState(1396);
							identifierSeq();
							}
							break;
						case 2:
							{
							setState(1397);
							colTypeList();
							}
							break;
						}
						setState(1400);
						match(T__1);
						}
						}
						break;
					}
					}
					break;
				}
				setState(1407);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1406);
					((QuerySpecificationContext)_localctx).outRowFormat = rowFormat();
					}
					break;
				}
				setState(1411);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1409);
					match(RECORDREADER);
					setState(1410);
					((QuerySpecificationContext)_localctx).recordReader = match(STRING);
					}
					break;
				}
				setState(1414);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1413);
					fromClause();
					}
					break;
				}
				setState(1418);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1416);
					match(WHERE);
					setState(1417);
					((QuerySpecificationContext)_localctx).where = booleanExpression(0);
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1442);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(1420);
					((QuerySpecificationContext)_localctx).kind = match(SELECT);
					setState(1424);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(1421);
						((QuerySpecificationContext)_localctx).hint = hint();
						((QuerySpecificationContext)_localctx).hints.add(((QuerySpecificationContext)_localctx).hint);
						}
						}
						setState(1426);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1428);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
					case 1:
						{
						setState(1427);
						setQuantifier();
						}
						break;
					}
					setState(1430);
					namedExpressionSeq();
					setState(1432);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
					case 1:
						{
						setState(1431);
						fromClause();
						}
						break;
					}
					}
					break;
				case FROM:
					{
					setState(1434);
					fromClause();
					setState(1440);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
					case 1:
						{
						setState(1435);
						((QuerySpecificationContext)_localctx).kind = match(SELECT);
						setState(1437);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
						case 1:
							{
							setState(1436);
							setQuantifier();
							}
							break;
						}
						setState(1439);
						namedExpressionSeq();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1444);
						lateralView();
						}
						} 
					}
					setState(1449);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
				}
				setState(1452);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(1450);
					match(WHERE);
					setState(1451);
					((QuerySpecificationContext)_localctx).where = booleanExpression(0);
					}
					break;
				}
				setState(1455);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1454);
					aggregation();
					}
					break;
				}
				setState(1459);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1457);
					match(HAVING);
					setState(1458);
					((QuerySpecificationContext)_localctx).having = booleanExpression(0);
					}
					break;
				}
				setState(1462);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1461);
					windows();
					}
					break;
				}
				}
				}
				break;
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

	public static class HintContext extends ParserRuleContext {
		public HintStatementContext hintStatement;
		public List<HintStatementContext> hintStatements = new ArrayList<HintStatementContext>();
		public List<HintStatementContext> hintStatement() {
			return getRuleContexts(HintStatementContext.class);
		}
		public HintStatementContext hintStatement(int i) {
			return getRuleContext(HintStatementContext.class,i);
		}
		public HintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintContext hint() throws RecognitionException {
		HintContext _localctx = new HintContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_hint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1466);
			match(T__4);
			setState(1467);
			((HintContext)_localctx).hintStatement = hintStatement();
			((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
			setState(1474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (DIV - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)) | (1L << (LOCATION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
				{
				{
				setState(1469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1468);
					match(T__2);
					}
				}

				setState(1471);
				((HintContext)_localctx).hintStatement = hintStatement();
				((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
				}
				}
				setState(1476);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1477);
			match(T__5);
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

	public static class HintStatementContext extends ParserRuleContext {
		public IdentifierContext hintName;
		public PrimaryExpressionContext primaryExpression;
		public List<PrimaryExpressionContext> parameters = new ArrayList<PrimaryExpressionContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public HintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterHintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitHintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitHintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintStatementContext hintStatement() throws RecognitionException {
		HintStatementContext _localctx = new HintStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_hintStatement);
		int _la;
		try {
			setState(1492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1479);
				((HintStatementContext)_localctx).hintName = identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1480);
				((HintStatementContext)_localctx).hintName = identifier();
				setState(1481);
				match(T__0);
				setState(1482);
				((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
				setState(1487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1483);
					match(T__2);
					setState(1484);
					((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
					}
					}
					setState(1489);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1490);
				match(T__1);
				}
				break;
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

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SparkParserParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public PivotClauseContext pivotClause() {
			return getRuleContext(PivotClauseContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1494);
			match(FROM);
			setState(1495);
			relation();
			setState(1500);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1496);
					match(T__2);
					setState(1497);
					relation();
					}
					} 
				}
				setState(1502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
			}
			setState(1506);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1503);
					lateralView();
					}
					} 
				}
				setState(1508);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			}
			setState(1510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1509);
				pivotClause();
				}
				break;
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

	public static class AggregationContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public Token kind;
		public TerminalNode GROUP() { return getToken(SparkParserParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SparkParserParser.BY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SparkParserParser.WITH, 0); }
		public TerminalNode SETS() { return getToken(SparkParserParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode ROLLUP() { return getToken(SparkParserParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(SparkParserParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(SparkParserParser.GROUPING, 0); }
		public AggregationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterAggregation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitAggregation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitAggregation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationContext aggregation() throws RecognitionException {
		AggregationContext _localctx = new AggregationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_aggregation);
		int _la;
		try {
			int _alt;
			setState(1556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1512);
				match(GROUP);
				setState(1513);
				match(BY);
				setState(1514);
				((AggregationContext)_localctx).expression = expression();
				((AggregationContext)_localctx).groupingExpressions.add(((AggregationContext)_localctx).expression);
				setState(1519);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1515);
						match(T__2);
						setState(1516);
						((AggregationContext)_localctx).expression = expression();
						((AggregationContext)_localctx).groupingExpressions.add(((AggregationContext)_localctx).expression);
						}
						} 
					}
					setState(1521);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
				}
				setState(1539);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1522);
					match(WITH);
					setState(1523);
					((AggregationContext)_localctx).kind = match(ROLLUP);
					}
					break;
				case 2:
					{
					setState(1524);
					match(WITH);
					setState(1525);
					((AggregationContext)_localctx).kind = match(CUBE);
					}
					break;
				case 3:
					{
					setState(1526);
					((AggregationContext)_localctx).kind = match(GROUPING);
					setState(1527);
					match(SETS);
					setState(1528);
					match(T__0);
					setState(1529);
					groupingSet();
					setState(1534);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1530);
						match(T__2);
						setState(1531);
						groupingSet();
						}
						}
						setState(1536);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1537);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1541);
				match(GROUP);
				setState(1542);
				match(BY);
				setState(1543);
				((AggregationContext)_localctx).kind = match(GROUPING);
				setState(1544);
				match(SETS);
				setState(1545);
				match(T__0);
				setState(1546);
				groupingSet();
				setState(1551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1547);
					match(T__2);
					setState(1548);
					groupingSet();
					}
					}
					setState(1553);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1554);
				match(T__1);
				}
				break;
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

	public static class GroupingSetContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_groupingSet);
		int _la;
		try {
			setState(1571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1558);
				match(T__0);
				setState(1567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)) | (1L << (LOCATION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (BIGDECIMAL_LITERAL - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(1559);
					expression();
					setState(1564);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1560);
						match(T__2);
						setState(1561);
						expression();
						}
						}
						setState(1566);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1569);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1570);
				expression();
				}
				break;
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

	public static class PivotClauseContext extends ParserRuleContext {
		public NamedExpressionSeqContext aggregates;
		public PivotValueContext pivotValue;
		public List<PivotValueContext> pivotValues = new ArrayList<PivotValueContext>();
		public TerminalNode PIVOT() { return getToken(SparkParserParser.PIVOT, 0); }
		public TerminalNode FOR() { return getToken(SparkParserParser.FOR, 0); }
		public PivotColumnContext pivotColumn() {
			return getRuleContext(PivotColumnContext.class,0);
		}
		public TerminalNode IN() { return getToken(SparkParserParser.IN, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<PivotValueContext> pivotValue() {
			return getRuleContexts(PivotValueContext.class);
		}
		public PivotValueContext pivotValue(int i) {
			return getRuleContext(PivotValueContext.class,i);
		}
		public PivotClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterPivotClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitPivotClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitPivotClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotClauseContext pivotClause() throws RecognitionException {
		PivotClauseContext _localctx = new PivotClauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_pivotClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1573);
			match(PIVOT);
			setState(1574);
			match(T__0);
			setState(1575);
			((PivotClauseContext)_localctx).aggregates = namedExpressionSeq();
			setState(1576);
			match(FOR);
			setState(1577);
			pivotColumn();
			setState(1578);
			match(IN);
			setState(1579);
			match(T__0);
			setState(1580);
			((PivotClauseContext)_localctx).pivotValue = pivotValue();
			((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
			setState(1585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1581);
				match(T__2);
				setState(1582);
				((PivotClauseContext)_localctx).pivotValue = pivotValue();
				((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
				}
				}
				setState(1587);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1588);
			match(T__1);
			setState(1589);
			match(T__1);
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

	public static class PivotColumnContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> identifiers = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public PivotColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterPivotColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitPivotColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitPivotColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotColumnContext pivotColumn() throws RecognitionException {
		PivotColumnContext _localctx = new PivotColumnContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_pivotColumn);
		int _la;
		try {
			setState(1603);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case ANY:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case PIVOT:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case SETMINUS:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case EXTRACT:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1591);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(1592);
				match(T__0);
				setState(1593);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				setState(1598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1594);
					match(T__2);
					setState(1595);
					((PivotColumnContext)_localctx).identifier = identifier();
					((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
					}
					}
					setState(1600);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1601);
				match(T__1);
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

	public static class PivotValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkParserParser.AS, 0); }
		public PivotValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterPivotValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitPivotValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitPivotValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotValueContext pivotValue() throws RecognitionException {
		PivotValueContext _localctx = new PivotValueContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_pivotValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1605);
			expression();
			setState(1610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (DIV - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)) | (1L << (LOCATION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
				{
				setState(1607);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1606);
					match(AS);
					}
					break;
				}
				setState(1609);
				identifier();
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

	public static class LateralViewContext extends ParserRuleContext {
		public IdentifierContext tblName;
		public IdentifierContext identifier;
		public List<IdentifierContext> colName = new ArrayList<IdentifierContext>();
		public TerminalNode LATERAL() { return getToken(SparkParserParser.LATERAL, 0); }
		public TerminalNode VIEW() { return getToken(SparkParserParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OUTER() { return getToken(SparkParserParser.OUTER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AS() { return getToken(SparkParserParser.AS, 0); }
		public LateralViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateralView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterLateralView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitLateralView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitLateralView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LateralViewContext lateralView() throws RecognitionException {
		LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_lateralView);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1612);
			match(LATERAL);
			setState(1613);
			match(VIEW);
			setState(1615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				{
				setState(1614);
				match(OUTER);
				}
				break;
			}
			setState(1617);
			qualifiedName();
			setState(1618);
			match(T__0);
			setState(1627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)) | (1L << (LOCATION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (BIGDECIMAL_LITERAL - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
				{
				setState(1619);
				expression();
				setState(1624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1620);
					match(T__2);
					setState(1621);
					expression();
					}
					}
					setState(1626);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1629);
			match(T__1);
			setState(1630);
			((LateralViewContext)_localctx).tblName = identifier();
			setState(1642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1632);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
				case 1:
					{
					setState(1631);
					match(AS);
					}
					break;
				}
				setState(1634);
				((LateralViewContext)_localctx).identifier = identifier();
				((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
				setState(1639);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1635);
						match(T__2);
						setState(1636);
						((LateralViewContext)_localctx).identifier = identifier();
						((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
						}
						} 
					}
					setState(1641);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
				}
				}
				break;
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

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SparkParserParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SparkParserParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1644);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public List<JoinRelationContext> joinRelation() {
			return getRuleContexts(JoinRelationContext.class);
		}
		public JoinRelationContext joinRelation(int i) {
			return getRuleContext(JoinRelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1646);
			relationPrimary();
			setState(1650);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1647);
					joinRelation();
					}
					} 
				}
				setState(1652);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
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

	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(SparkParserParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SparkParserParser.NATURAL, 0); }
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_joinRelation);
		try {
			setState(1664);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN:
			case CROSS:
			case INNER:
			case LEFT:
			case RIGHT:
			case FULL:
			case ANTI:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1653);
				joinType();
				}
				setState(1654);
				match(JOIN);
				setState(1655);
				((JoinRelationContext)_localctx).right = relationPrimary();
				setState(1657);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1656);
					joinCriteria();
					}
					break;
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1659);
				match(NATURAL);
				setState(1660);
				joinType();
				setState(1661);
				match(JOIN);
				setState(1662);
				((JoinRelationContext)_localctx).right = relationPrimary();
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

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(SparkParserParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(SparkParserParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(SparkParserParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SparkParserParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(SparkParserParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(SparkParserParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SparkParserParser.FULL, 0); }
		public TerminalNode ANTI() { return getToken(SparkParserParser.ANTI, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_joinType);
		int _la;
		try {
			setState(1688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(1666);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1669);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1670);
				match(LEFT);
				setState(1672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1671);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1674);
				match(LEFT);
				setState(1675);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1676);
				match(RIGHT);
				setState(1678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1677);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1680);
				match(FULL);
				setState(1682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1681);
					match(OUTER);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1685);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(1684);
					match(LEFT);
					}
				}

				setState(1687);
				match(ANTI);
				}
				break;
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

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SparkParserParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SparkParserParser.USING, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_joinCriteria);
		int _la;
		try {
			setState(1704);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1690);
				match(ON);
				setState(1691);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1692);
				match(USING);
				setState(1693);
				match(T__0);
				setState(1694);
				identifier();
				setState(1699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1695);
					match(T__2);
					setState(1696);
					identifier();
					}
					}
					setState(1701);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1702);
				match(T__1);
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

	public static class SampleContext extends ParserRuleContext {
		public TerminalNode TABLESAMPLE() { return getToken(SparkParserParser.TABLESAMPLE, 0); }
		public SampleMethodContext sampleMethod() {
			return getRuleContext(SampleMethodContext.class,0);
		}
		public SampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterSample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitSample(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitSample(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleContext sample() throws RecognitionException {
		SampleContext _localctx = new SampleContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_sample);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706);
			match(TABLESAMPLE);
			setState(1707);
			match(T__0);
			setState(1709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)) | (1L << (LOCATION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (BIGDECIMAL_LITERAL - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
				{
				setState(1708);
				sampleMethod();
				}
			}

			setState(1711);
			match(T__1);
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

	public static class SampleMethodContext extends ParserRuleContext {
		public SampleMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleMethod; }
	 
		public SampleMethodContext() { }
		public void copyFrom(SampleMethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SampleByRowsContext extends SampleMethodContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(SparkParserParser.ROWS, 0); }
		public SampleByRowsContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterSampleByRows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitSampleByRows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitSampleByRows(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByPercentileContext extends SampleMethodContext {
		public Token negativeSign;
		public Token percentage;
		public TerminalNode PERCENTLIT() { return getToken(SparkParserParser.PERCENTLIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SparkParserParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SparkParserParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SparkParserParser.MINUS, 0); }
		public SampleByPercentileContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterSampleByPercentile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitSampleByPercentile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitSampleByPercentile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBucketContext extends SampleMethodContext {
		public Token sampleType;
		public Token numerator;
		public Token denominator;
		public TerminalNode OUT() { return getToken(SparkParserParser.OUT, 0); }
		public TerminalNode OF() { return getToken(SparkParserParser.OF, 0); }
		public TerminalNode BUCKET() { return getToken(SparkParserParser.BUCKET, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SparkParserParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SparkParserParser.INTEGER_VALUE, i);
		}
		public TerminalNode ON() { return getToken(SparkParserParser.ON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SampleByBucketContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterSampleByBucket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitSampleByBucket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitSampleByBucket(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBytesContext extends SampleMethodContext {
		public ExpressionContext bytes;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SampleByBytesContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterSampleByBytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitSampleByBytes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitSampleByBytes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleMethodContext sampleMethod() throws RecognitionException {
		SampleMethodContext _localctx = new SampleMethodContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_sampleMethod);
		int _la;
		try {
			setState(1737);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				_localctx = new SampleByPercentileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1713);
					((SampleByPercentileContext)_localctx).negativeSign = match(MINUS);
					}
				}

				setState(1716);
				((SampleByPercentileContext)_localctx).percentage = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((SampleByPercentileContext)_localctx).percentage = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1717);
				match(PERCENTLIT);
				}
				break;
			case 2:
				_localctx = new SampleByRowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1718);
				expression();
				setState(1719);
				match(ROWS);
				}
				break;
			case 3:
				_localctx = new SampleByBucketContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1721);
				((SampleByBucketContext)_localctx).sampleType = match(BUCKET);
				setState(1722);
				((SampleByBucketContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(1723);
				match(OUT);
				setState(1724);
				match(OF);
				setState(1725);
				((SampleByBucketContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(1734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1726);
					match(ON);
					setState(1732);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
					case 1:
						{
						setState(1727);
						identifier();
						}
						break;
					case 2:
						{
						setState(1728);
						qualifiedName();
						setState(1729);
						match(T__0);
						setState(1730);
						match(T__1);
						}
						break;
					}
					}
				}

				}
				break;
			case 4:
				_localctx = new SampleByBytesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1736);
				((SampleByBytesContext)_localctx).bytes = expression();
				}
				break;
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

	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1739);
			match(T__0);
			setState(1740);
			identifierSeq();
			setState(1741);
			match(T__1);
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

	public static class IdentifierSeqContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterIdentifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitIdentifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitIdentifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_identifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1743);
			identifier();
			setState(1748);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1744);
					match(T__2);
					setState(1745);
					identifier();
					}
					} 
				}
				setState(1750);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
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

	public static class OrderedIdentifierListContext extends ParserRuleContext {
		public List<OrderedIdentifierContext> orderedIdentifier() {
			return getRuleContexts(OrderedIdentifierContext.class);
		}
		public OrderedIdentifierContext orderedIdentifier(int i) {
			return getRuleContext(OrderedIdentifierContext.class,i);
		}
		public OrderedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterOrderedIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitOrderedIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitOrderedIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierListContext orderedIdentifierList() throws RecognitionException {
		OrderedIdentifierListContext _localctx = new OrderedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_orderedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1751);
			match(T__0);
			setState(1752);
			orderedIdentifier();
			setState(1757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1753);
				match(T__2);
				setState(1754);
				orderedIdentifier();
				}
				}
				setState(1759);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1760);
			match(T__1);
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

	public static class OrderedIdentifierContext extends ParserRuleContext {
		public Token ordering;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SparkParserParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SparkParserParser.DESC, 0); }
		public OrderedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterOrderedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitOrderedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitOrderedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierContext orderedIdentifier() throws RecognitionException {
		OrderedIdentifierContext _localctx = new OrderedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_orderedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1762);
			identifier();
			setState(1764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1763);
				((OrderedIdentifierContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderedIdentifierContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class IdentifierCommentListContext extends ParserRuleContext {
		public List<IdentifierCommentContext> identifierComment() {
			return getRuleContexts(IdentifierCommentContext.class);
		}
		public IdentifierCommentContext identifierComment(int i) {
			return getRuleContext(IdentifierCommentContext.class,i);
		}
		public IdentifierCommentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierCommentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterIdentifierCommentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitIdentifierCommentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitIdentifierCommentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentListContext identifierCommentList() throws RecognitionException {
		IdentifierCommentListContext _localctx = new IdentifierCommentListContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_identifierCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1766);
			match(T__0);
			setState(1767);
			identifierComment();
			setState(1772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1768);
				match(T__2);
				setState(1769);
				identifierComment();
				}
				}
				setState(1774);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1775);
			match(T__1);
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

	public static class IdentifierCommentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SparkParserParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SparkParserParser.STRING, 0); }
		public IdentifierCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterIdentifierComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitIdentifierComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitIdentifierComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentContext identifierComment() throws RecognitionException {
		IdentifierCommentContext _localctx = new IdentifierCommentContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_identifierComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1777);
			identifier();
			setState(1780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1778);
				match(COMMENT);
				setState(1779);
				match(STRING);
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

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableValuedFunctionContext extends RelationPrimaryContext {
		public FunctionTableContext functionTable() {
			return getRuleContext(FunctionTableContext.class,0);
		}
		public TableValuedFunctionContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterTableValuedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitTableValuedFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitTableValuedFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault2Context extends RelationPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault2Context(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterInlineTableDefault2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitInlineTableDefault2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitInlineTableDefault2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterAliasedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitAliasedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitAliasedQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_relationPrimary);
		try {
			setState(1806);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1782);
				tableIdentifier();
				setState(1784);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(1783);
					sample();
					}
					break;
				}
				setState(1786);
				tableAlias();
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1788);
				match(T__0);
				setState(1789);
				queryNoWith();
				setState(1790);
				match(T__1);
				setState(1792);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
				case 1:
					{
					setState(1791);
					sample();
					}
					break;
				}
				setState(1794);
				tableAlias();
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1796);
				match(T__0);
				setState(1797);
				relation();
				setState(1798);
				match(T__1);
				setState(1800);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
				case 1:
					{
					setState(1799);
					sample();
					}
					break;
				}
				setState(1802);
				tableAlias();
				}
				break;
			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1804);
				inlineTable();
				}
				break;
			case 5:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1805);
				functionTable();
				}
				break;
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

	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(SparkParserParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1808);
			match(VALUES);
			setState(1809);
			expression();
			setState(1814);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1810);
					match(T__2);
					setState(1811);
					expression();
					}
					} 
				}
				setState(1816);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			}
			setState(1817);
			tableAlias();
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

	public static class FunctionTableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterFunctionTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitFunctionTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitFunctionTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTableContext functionTable() throws RecognitionException {
		FunctionTableContext _localctx = new FunctionTableContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_functionTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1819);
			identifier();
			setState(1820);
			match(T__0);
			setState(1829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)) | (1L << (LOCATION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (BIGDECIMAL_LITERAL - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
				{
				setState(1821);
				expression();
				setState(1826);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1822);
					match(T__2);
					setState(1823);
					expression();
					}
					}
					setState(1828);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1831);
			match(T__1);
			setState(1832);
			tableAlias();
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

	public static class TableAliasContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkParserParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterTableAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitTableAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitTableAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1841);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				{
				setState(1835);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
				case 1:
					{
					setState(1834);
					match(AS);
					}
					break;
				}
				setState(1837);
				strictIdentifier();
				setState(1839);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
				case 1:
					{
					setState(1838);
					identifierList();
					}
					break;
				}
				}
				break;
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

	public static class RowFormatContext extends ParserRuleContext {
		public RowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormat; }
	 
		public RowFormatContext() { }
		public void copyFrom(RowFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RowFormatSerdeContext extends RowFormatContext {
		public Token name;
		public TablePropertyListContext props;
		public TerminalNode ROW() { return getToken(SparkParserParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SparkParserParser.FORMAT, 0); }
		public TerminalNode SERDE() { return getToken(SparkParserParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SparkParserParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SparkParserParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SparkParserParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public RowFormatSerdeContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterRowFormatSerde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitRowFormatSerde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitRowFormatSerde(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowFormatDelimitedContext extends RowFormatContext {
		public Token fieldsTerminatedBy;
		public Token escapedBy;
		public Token collectionItemsTerminatedBy;
		public Token keysTerminatedBy;
		public Token linesSeparatedBy;
		public Token nullDefinedAs;
		public TerminalNode ROW() { return getToken(SparkParserParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SparkParserParser.FORMAT, 0); }
		public TerminalNode DELIMITED() { return getToken(SparkParserParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(SparkParserParser.FIELDS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(SparkParserParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(SparkParserParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SparkParserParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkParserParser.BY, i);
		}
		public TerminalNode COLLECTION() { return getToken(SparkParserParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(SparkParserParser.ITEMS, 0); }
		public TerminalNode MAP() { return getToken(SparkParserParser.MAP, 0); }
		public TerminalNode KEYS() { return getToken(SparkParserParser.KEYS, 0); }
		public TerminalNode LINES() { return getToken(SparkParserParser.LINES, 0); }
		public TerminalNode NULL() { return getToken(SparkParserParser.NULL, 0); }
		public TerminalNode DEFINED() { return getToken(SparkParserParser.DEFINED, 0); }
		public TerminalNode AS() { return getToken(SparkParserParser.AS, 0); }
		public List<TerminalNode> STRING() { return getTokens(SparkParserParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SparkParserParser.STRING, i);
		}
		public TerminalNode ESCAPED() { return getToken(SparkParserParser.ESCAPED, 0); }
		public RowFormatDelimitedContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterRowFormatDelimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitRowFormatDelimited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitRowFormatDelimited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowFormatContext rowFormat() throws RecognitionException {
		RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_rowFormat);
		try {
			setState(1892);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1843);
				match(ROW);
				setState(1844);
				match(FORMAT);
				setState(1845);
				match(SERDE);
				setState(1846);
				((RowFormatSerdeContext)_localctx).name = match(STRING);
				setState(1850);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
				case 1:
					{
					setState(1847);
					match(WITH);
					setState(1848);
					match(SERDEPROPERTIES);
					setState(1849);
					((RowFormatSerdeContext)_localctx).props = tablePropertyList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RowFormatDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1852);
				match(ROW);
				setState(1853);
				match(FORMAT);
				setState(1854);
				match(DELIMITED);
				setState(1864);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
				case 1:
					{
					setState(1855);
					match(FIELDS);
					setState(1856);
					match(TERMINATED);
					setState(1857);
					match(BY);
					setState(1858);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = match(STRING);
					setState(1862);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
					case 1:
						{
						setState(1859);
						match(ESCAPED);
						setState(1860);
						match(BY);
						setState(1861);
						((RowFormatDelimitedContext)_localctx).escapedBy = match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(1871);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
				case 1:
					{
					setState(1866);
					match(COLLECTION);
					setState(1867);
					match(ITEMS);
					setState(1868);
					match(TERMINATED);
					setState(1869);
					match(BY);
					setState(1870);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = match(STRING);
					}
					break;
				}
				setState(1878);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
				case 1:
					{
					setState(1873);
					match(MAP);
					setState(1874);
					match(KEYS);
					setState(1875);
					match(TERMINATED);
					setState(1876);
					match(BY);
					setState(1877);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = match(STRING);
					}
					break;
				}
				setState(1884);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
				case 1:
					{
					setState(1880);
					match(LINES);
					setState(1881);
					match(TERMINATED);
					setState(1882);
					match(BY);
					setState(1883);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = match(STRING);
					}
					break;
				}
				setState(1890);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
				case 1:
					{
					setState(1886);
					match(NULL);
					setState(1887);
					match(DEFINED);
					setState(1888);
					match(AS);
					setState(1889);
					((RowFormatDelimitedContext)_localctx).nullDefinedAs = match(STRING);
					}
					break;
				}
				}
				break;
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

	public static class TableIdentifierContext extends ParserRuleContext {
		public IdentifierContext db;
		public IdentifierContext table;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1897);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				{
				setState(1894);
				((TableIdentifierContext)_localctx).db = identifier();
				setState(1895);
				match(T__3);
				}
				break;
			}
			setState(1899);
			((TableIdentifierContext)_localctx).table = identifier();
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

	public static class FunctionIdentifierContext extends ParserRuleContext {
		public IdentifierContext db;
		public IdentifierContext function;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1904);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				{
				setState(1901);
				((FunctionIdentifierContext)_localctx).db = identifier();
				setState(1902);
				match(T__3);
				}
				break;
			}
			setState(1906);
			((FunctionIdentifierContext)_localctx).function = identifier();
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

	public static class NamedExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkParserParser.AS, 0); }
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitNamedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitNamedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1908);
			expression();
			setState(1916);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				{
				setState(1910);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
				case 1:
					{
					setState(1909);
					match(AS);
					}
					break;
				}
				setState(1914);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
				case FROM:
				case ADD:
				case AS:
				case ALL:
				case ANY:
				case DISTINCT:
				case WHERE:
				case GROUP:
				case BY:
				case GROUPING:
				case SETS:
				case CUBE:
				case ROLLUP:
				case ORDER:
				case HAVING:
				case LIMIT:
				case AT:
				case OR:
				case AND:
				case IN:
				case NOT:
				case NO:
				case EXISTS:
				case BETWEEN:
				case LIKE:
				case RLIKE:
				case IS:
				case NULL:
				case TRUE:
				case FALSE:
				case NULLS:
				case ASC:
				case DESC:
				case FOR:
				case INTERVAL:
				case CASE:
				case WHEN:
				case THEN:
				case ELSE:
				case END:
				case JOIN:
				case CROSS:
				case OUTER:
				case INNER:
				case LEFT:
				case SEMI:
				case RIGHT:
				case FULL:
				case NATURAL:
				case ON:
				case PIVOT:
				case LATERAL:
				case WINDOW:
				case OVER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case UNBOUNDED:
				case PRECEDING:
				case FOLLOWING:
				case CURRENT:
				case FIRST:
				case AFTER:
				case LAST:
				case ROW:
				case WITH:
				case VALUES:
				case CREATE:
				case TABLE:
				case DIRECTORY:
				case VIEW:
				case REPLACE:
				case INSERT:
				case DELETE:
				case INTO:
				case DESCRIBE:
				case EXPLAIN:
				case FORMAT:
				case LOGICAL:
				case CODEGEN:
				case COST:
				case CAST:
				case SHOW:
				case TABLES:
				case COLUMNS:
				case COLUMN:
				case USE:
				case PARTITIONS:
				case FUNCTIONS:
				case DROP:
				case UNION:
				case EXCEPT:
				case SETMINUS:
				case INTERSECT:
				case TO:
				case TABLESAMPLE:
				case STRATIFY:
				case ALTER:
				case RENAME:
				case ARRAY:
				case MAP:
				case STRUCT:
				case COMMENT:
				case SET:
				case RESET:
				case DATA:
				case START:
				case TRANSACTION:
				case COMMIT:
				case ROLLBACK:
				case MACRO:
				case IGNORE:
				case BOTH:
				case LEADING:
				case TRAILING:
				case IF:
				case POSITION:
				case EXTRACT:
				case DIV:
				case PERCENTLIT:
				case BUCKET:
				case OUT:
				case OF:
				case SORT:
				case CLUSTER:
				case DISTRIBUTE:
				case OVERWRITE:
				case TRANSFORM:
				case REDUCE:
				case SERDE:
				case SERDEPROPERTIES:
				case RECORDREADER:
				case RECORDWRITER:
				case DELIMITED:
				case FIELDS:
				case TERMINATED:
				case COLLECTION:
				case ITEMS:
				case KEYS:
				case ESCAPED:
				case LINES:
				case SEPARATED:
				case FUNCTION:
				case EXTENDED:
				case REFRESH:
				case CLEAR:
				case CACHE:
				case UNCACHE:
				case LAZY:
				case FORMATTED:
				case GLOBAL:
				case TEMPORARY:
				case OPTIONS:
				case UNSET:
				case TBLPROPERTIES:
				case DBPROPERTIES:
				case BUCKETS:
				case SKEWED:
				case STORED:
				case DIRECTORIES:
				case LOCATION:
				case EXCHANGE:
				case ARCHIVE:
				case UNARCHIVE:
				case FILEFORMAT:
				case TOUCH:
				case COMPACT:
				case CONCATENATE:
				case CHANGE:
				case CASCADE:
				case RESTRICT:
				case CLUSTERED:
				case SORTED:
				case PURGE:
				case INPUTFORMAT:
				case OUTPUTFORMAT:
				case DATABASE:
				case DATABASES:
				case DFS:
				case TRUNCATE:
				case ANALYZE:
				case COMPUTE:
				case LIST:
				case STATISTICS:
				case PARTITIONED:
				case EXTERNAL:
				case DEFINED:
				case REVOKE:
				case GRANT:
				case LOCK:
				case UNLOCK:
				case MSCK:
				case REPAIR:
				case RECOVER:
				case EXPORT:
				case IMPORT:
				case LOAD:
				case ROLE:
				case ROLES:
				case COMPACTIONS:
				case PRINCIPALS:
				case TRANSACTIONS:
				case INDEX:
				case INDEXES:
				case LOCKS:
				case OPTION:
				case ANTI:
				case LOCAL:
				case INPATH:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(1912);
					identifier();
					}
					break;
				case T__0:
					{
					setState(1913);
					identifierList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
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

	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterNamedExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitNamedExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitNamedExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1918);
			namedExpression();
			setState(1923);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1919);
					match(T__2);
					setState(1920);
					namedExpression();
					}
					} 
				}
				setState(1925);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1926);
			booleanExpression(0);
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(SparkParserParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends BooleanExpressionContext {
		public TerminalNode EXISTS() { return getToken(SparkParserParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SparkParserParser.AND, 0); }
		public TerminalNode OR() { return getToken(SparkParserParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1940);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1929);
				match(NOT);
				setState(1930);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1931);
				match(EXISTS);
				setState(1932);
				match(T__0);
				setState(1933);
				query();
				setState(1934);
				match(T__1);
				}
				break;
			case 3:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1936);
				valueExpression(0);
				setState(1938);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
				case 1:
					{
					setState(1937);
					predicate();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1950);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1948);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1942);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1943);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(1944);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1945);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1946);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(1947);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(1952);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public ValueExpressionContext right;
		public TerminalNode AND() { return getToken(SparkParserParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(SparkParserParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SparkParserParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(SparkParserParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RLIKE() { return getToken(SparkParserParser.RLIKE, 0); }
		public TerminalNode LIKE() { return getToken(SparkParserParser.LIKE, 0); }
		public TerminalNode IS() { return getToken(SparkParserParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SparkParserParser.NULL, 0); }
		public TerminalNode FROM() { return getToken(SparkParserParser.FROM, 0); }
		public TerminalNode DISTINCT() { return getToken(SparkParserParser.DISTINCT, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_predicate);
		int _la;
		try {
			setState(2001);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1954);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1953);
					match(NOT);
					}
				}

				setState(1956);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(1957);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(1958);
				match(AND);
				setState(1959);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1962);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1961);
					match(NOT);
					}
				}

				setState(1964);
				((PredicateContext)_localctx).kind = match(IN);
				setState(1965);
				match(T__0);
				setState(1966);
				expression();
				setState(1971);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1967);
					match(T__2);
					setState(1968);
					expression();
					}
					}
					setState(1973);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1974);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1977);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1976);
					match(NOT);
					}
				}

				setState(1979);
				((PredicateContext)_localctx).kind = match(IN);
				setState(1980);
				match(T__0);
				setState(1981);
				query();
				setState(1982);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1985);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1984);
					match(NOT);
					}
				}

				setState(1987);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==RLIKE) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1988);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1989);
				match(IS);
				setState(1991);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1990);
					match(NOT);
					}
				}

				setState(1993);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1994);
				match(IS);
				setState(1996);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1995);
					match(NOT);
					}
				}

				setState(1998);
				((PredicateContext)_localctx).kind = match(DISTINCT);
				setState(1999);
				match(FROM);
				setState(2000);
				((PredicateContext)_localctx).right = valueExpression(0);
				}
				break;
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

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(SparkParserParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SparkParserParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SparkParserParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SparkParserParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(SparkParserParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SparkParserParser.MINUS, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SparkParserParser.CONCAT_PIPE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SparkParserParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(SparkParserParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(SparkParserParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SparkParserParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SparkParserParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SparkParserParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 146;
		enterRecursionRule(_localctx, 146, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2007);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2004);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2005);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (PLUS - 138)) | (1L << (MINUS - 138)) | (1L << (TILDE - 138)))) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2006);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2030);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2028);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2009);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2010);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (ASTERISK - 140)) | (1L << (SLASH - 140)) | (1L << (PERCENT - 140)) | (1L << (DIV - 140)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2011);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2012);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2013);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (PLUS - 138)) | (1L << (MINUS - 138)) | (1L << (CONCAT_PIPE - 138)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2014);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2015);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2016);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(2017);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2018);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2019);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(2020);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2021);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2022);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(2023);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2024);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2025);
						comparisonOperator();
						setState(2026);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(2032);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructContext extends PrimaryExpressionContext {
		public NamedExpressionContext namedExpression;
		public List<NamedExpressionContext> argument = new ArrayList<NamedExpressionContext>();
		public TerminalNode STRUCT() { return getToken(SparkParserParser.STRUCT, 0); }
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public StructContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext value;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SparkParserParser.CASE, 0); }
		public TerminalNode END() { return getToken(SparkParserParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SparkParserParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LastContext extends PrimaryExpressionContext {
		public TerminalNode LAST() { return getToken(SparkParserParser.LAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SparkParserParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SparkParserParser.NULLS, 0); }
		public LastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitLast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitLast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(SparkParserParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(SparkParserParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkParserParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitConstantDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitConstantDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaContext extends PrimaryExpressionContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SparkParserParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SparkParserParser.IDENTIFIER, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExtractContext extends PrimaryExpressionContext {
		public IdentifierContext field;
		public ValueExpressionContext source;
		public TerminalNode EXTRACT() { return getToken(SparkParserParser.EXTRACT, 0); }
		public TerminalNode FROM() { return getToken(SparkParserParser.FROM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public ExpressionContext expression;
		public List<ExpressionContext> argument = new ArrayList<ExpressionContext>();
		public Token trimOption;
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode OVER() { return getToken(SparkParserParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SparkParserParser.FROM, 0); }
		public TerminalNode BOTH() { return getToken(SparkParserParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(SparkParserParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(SparkParserParser.TRAILING, 0); }
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SparkParserParser.CASE, 0); }
		public TerminalNode END() { return getToken(SparkParserParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SparkParserParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositionContext extends PrimaryExpressionContext {
		public ValueExpressionContext substr;
		public ValueExpressionContext str;
		public TerminalNode POSITION() { return getToken(SparkParserParser.POSITION, 0); }
		public TerminalNode IN() { return getToken(SparkParserParser.IN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FirstContext extends PrimaryExpressionContext {
		public TerminalNode FIRST() { return getToken(SparkParserParser.FIRST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SparkParserParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SparkParserParser.NULLS, 0); }
		public FirstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 148;
		enterRecursionRule(_localctx, 148, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2034);
				match(CASE);
				setState(2036); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2035);
					whenClause();
					}
					}
					setState(2038); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2042);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2040);
					match(ELSE);
					setState(2041);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2044);
				match(END);
				}
				break;
			case 2:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2046);
				match(CASE);
				setState(2047);
				((SimpleCaseContext)_localctx).value = expression();
				setState(2049); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2048);
					whenClause();
					}
					}
					setState(2051); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2055);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2053);
					match(ELSE);
					setState(2054);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2057);
				match(END);
				}
				break;
			case 3:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2059);
				match(CAST);
				setState(2060);
				match(T__0);
				setState(2061);
				expression();
				setState(2062);
				match(AS);
				setState(2063);
				dataType();
				setState(2064);
				match(T__1);
				}
				break;
			case 4:
				{
				_localctx = new StructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2066);
				match(STRUCT);
				setState(2067);
				match(T__0);
				setState(2076);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)) | (1L << (LOCATION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (BIGDECIMAL_LITERAL - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(2068);
					((StructContext)_localctx).namedExpression = namedExpression();
					((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
					setState(2073);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2069);
						match(T__2);
						setState(2070);
						((StructContext)_localctx).namedExpression = namedExpression();
						((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
						}
						}
						setState(2075);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2078);
				match(T__1);
				}
				break;
			case 5:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2079);
				match(FIRST);
				setState(2080);
				match(T__0);
				setState(2081);
				expression();
				setState(2084);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2082);
					match(IGNORE);
					setState(2083);
					match(NULLS);
					}
				}

				setState(2086);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2088);
				match(LAST);
				setState(2089);
				match(T__0);
				setState(2090);
				expression();
				setState(2093);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2091);
					match(IGNORE);
					setState(2092);
					match(NULLS);
					}
				}

				setState(2095);
				match(T__1);
				}
				break;
			case 7:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2097);
				match(POSITION);
				setState(2098);
				match(T__0);
				setState(2099);
				((PositionContext)_localctx).substr = valueExpression(0);
				setState(2100);
				match(IN);
				setState(2101);
				((PositionContext)_localctx).str = valueExpression(0);
				setState(2102);
				match(T__1);
				}
				break;
			case 8:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2104);
				constant();
				}
				break;
			case 9:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2105);
				match(ASTERISK);
				}
				break;
			case 10:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2106);
				qualifiedName();
				setState(2107);
				match(T__3);
				setState(2108);
				match(ASTERISK);
				}
				break;
			case 11:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2110);
				match(T__0);
				setState(2111);
				namedExpression();
				setState(2114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2112);
					match(T__2);
					setState(2113);
					namedExpression();
					}
					}
					setState(2116); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(2118);
				match(T__1);
				}
				break;
			case 12:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2120);
				match(T__0);
				setState(2121);
				query();
				setState(2122);
				match(T__1);
				}
				break;
			case 13:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2124);
				qualifiedName();
				setState(2125);
				match(T__0);
				setState(2137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)) | (1L << (LOCATION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (BIGDECIMAL_LITERAL - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(2127);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
					case 1:
						{
						setState(2126);
						setQuantifier();
						}
						break;
					}
					setState(2129);
					((FunctionCallContext)_localctx).expression = expression();
					((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
					setState(2134);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2130);
						match(T__2);
						setState(2131);
						((FunctionCallContext)_localctx).expression = expression();
						((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
						}
						}
						setState(2136);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2139);
				match(T__1);
				setState(2142);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
				case 1:
					{
					setState(2140);
					match(OVER);
					setState(2141);
					windowSpec();
					}
					break;
				}
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2144);
				qualifiedName();
				setState(2145);
				match(T__0);
				setState(2146);
				((FunctionCallContext)_localctx).trimOption = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & ((1L << (BOTH - 124)) | (1L << (LEADING - 124)) | (1L << (TRAILING - 124)))) != 0)) ) {
					((FunctionCallContext)_localctx).trimOption = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2147);
				((FunctionCallContext)_localctx).expression = expression();
				((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
				setState(2148);
				match(FROM);
				setState(2149);
				((FunctionCallContext)_localctx).expression = expression();
				((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
				setState(2150);
				match(T__1);
				}
				break;
			case 15:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2152);
				match(IDENTIFIER);
				setState(2153);
				match(T__6);
				setState(2154);
				expression();
				}
				break;
			case 16:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2155);
				match(T__0);
				setState(2156);
				match(IDENTIFIER);
				setState(2159); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2157);
					match(T__2);
					setState(2158);
					match(IDENTIFIER);
					}
					}
					setState(2161); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(2163);
				match(T__1);
				setState(2164);
				match(T__6);
				setState(2165);
				expression();
				}
				break;
			case 17:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2166);
				identifier();
				}
				break;
			case 18:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2167);
				match(T__0);
				setState(2168);
				expression();
				setState(2169);
				match(T__1);
				}
				break;
			case 19:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2171);
				match(EXTRACT);
				setState(2172);
				match(T__0);
				setState(2173);
				((ExtractContext)_localctx).field = identifier();
				setState(2174);
				match(FROM);
				setState(2175);
				((ExtractContext)_localctx).source = valueExpression(0);
				setState(2176);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2188);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2180);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2181);
						match(T__7);
						setState(2182);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(2183);
						match(T__8);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2185);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2186);
						match(T__3);
						setState(2187);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(2192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(SparkParserParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends ConstantContext {
		public List<TerminalNode> STRING() { return getTokens(SparkParserParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SparkParserParser.STRING, i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkParserParser.STRING, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends ConstantContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_constant);
		try {
			int _alt;
			setState(2205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2193);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2194);
				interval();
				}
				break;
			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2195);
				identifier();
				setState(2196);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2198);
				number();
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2199);
				booleanValue();
				}
				break;
			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2201); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2200);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2203); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,290,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SparkParserParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SparkParserParser.NEQ, 0); }
		public TerminalNode NEQJ() { return getToken(SparkParserParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(SparkParserParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SparkParserParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SparkParserParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SparkParserParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(SparkParserParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2207);
			_la = _input.LA(1);
			if ( !(((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (EQ - 130)) | (1L << (NSEQ - 130)) | (1L << (NEQ - 130)) | (1L << (NEQJ - 130)) | (1L << (LT - 130)) | (1L << (LTE - 130)) | (1L << (GT - 130)) | (1L << (GTE - 130)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SparkParserParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SparkParserParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(SparkParserParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SparkParserParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SparkParserParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SparkParserParser.DIV, 0); }
		public TerminalNode TILDE() { return getToken(SparkParserParser.TILDE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SparkParserParser.AMPERSAND, 0); }
		public TerminalNode PIPE() { return getToken(SparkParserParser.PIPE, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SparkParserParser.CONCAT_PIPE, 0); }
		public TerminalNode HAT() { return getToken(SparkParserParser.HAT, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitArithmeticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2209);
			_la = _input.LA(1);
			if ( !(((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (PLUS - 138)) | (1L << (MINUS - 138)) | (1L << (ASTERISK - 138)) | (1L << (SLASH - 138)) | (1L << (PERCENT - 138)) | (1L << (DIV - 138)) | (1L << (TILDE - 138)) | (1L << (AMPERSAND - 138)) | (1L << (PIPE - 138)) | (1L << (CONCAT_PIPE - 138)) | (1L << (HAT - 138)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class PredicateOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(SparkParserParser.OR, 0); }
		public TerminalNode AND() { return getToken(SparkParserParser.AND, 0); }
		public TerminalNode IN() { return getToken(SparkParserParser.IN, 0); }
		public TerminalNode NOT() { return getToken(SparkParserParser.NOT, 0); }
		public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterPredicateOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitPredicateOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitPredicateOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateOperatorContext predicateOperator() throws RecognitionException {
		PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2211);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SparkParserParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SparkParserParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2213);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(SparkParserParser.INTERVAL, 0); }
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_interval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2215);
			match(INTERVAL);
			setState(2219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,292,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2216);
					intervalField();
					}
					} 
				}
				setState(2221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,292,_ctx);
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

	public static class IntervalFieldContext extends ParserRuleContext {
		public IntervalValueContext value;
		public IdentifierContext unit;
		public IdentifierContext to;
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode TO() { return getToken(SparkParserParser.TO, 0); }
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterIntervalField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitIntervalField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitIntervalField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_intervalField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2222);
			((IntervalFieldContext)_localctx).value = intervalValue();
			setState(2223);
			((IntervalFieldContext)_localctx).unit = identifier();
			setState(2226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				{
				setState(2224);
				match(TO);
				setState(2225);
				((IntervalFieldContext)_localctx).to = identifier();
				}
				break;
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

	public static class IntervalValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SparkParserParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SparkParserParser.DECIMAL_VALUE, 0); }
		public TerminalNode PLUS() { return getToken(SparkParserParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SparkParserParser.MINUS, 0); }
		public TerminalNode STRING() { return getToken(SparkParserParser.STRING, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterIntervalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitIntervalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitIntervalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_intervalValue);
		int _la;
		try {
			setState(2233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2228);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2231);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2232);
				match(STRING);
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

	public static class ColPositionContext extends ParserRuleContext {
		public TerminalNode FIRST() { return getToken(SparkParserParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(SparkParserParser.AFTER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterColPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitColPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitColPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColPositionContext colPosition() throws RecognitionException {
		ColPositionContext _localctx = new ColPositionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_colPosition);
		try {
			setState(2238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2235);
				match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2236);
				match(AFTER);
				setState(2237);
				identifier();
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

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public TerminalNode LT() { return getToken(SparkParserParser.LT, 0); }
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(SparkParserParser.GT, 0); }
		public TerminalNode ARRAY() { return getToken(SparkParserParser.ARRAY, 0); }
		public TerminalNode MAP() { return getToken(SparkParserParser.MAP, 0); }
		public TerminalNode STRUCT() { return getToken(SparkParserParser.STRUCT, 0); }
		public TerminalNode NEQ() { return getToken(SparkParserParser.NEQ, 0); }
		public ComplexColTypeListContext complexColTypeList() {
			return getRuleContext(ComplexColTypeListContext.class,0);
		}
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterComplexDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitComplexDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitComplexDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SparkParserParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SparkParserParser.INTEGER_VALUE, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_dataType);
		int _la;
		try {
			setState(2274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2240);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(2241);
				match(LT);
				setState(2242);
				dataType();
				setState(2243);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2245);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(2246);
				match(LT);
				setState(2247);
				dataType();
				setState(2248);
				match(T__2);
				setState(2249);
				dataType();
				setState(2250);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2252);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(2259);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(2253);
					match(LT);
					setState(2255);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (DIV - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)) | (1L << (LOCATION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
						{
						setState(2254);
						complexColTypeList();
						}
					}

					setState(2257);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(2258);
					match(NEQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2261);
				identifier();
				setState(2272);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
				case 1:
					{
					setState(2262);
					match(T__0);
					setState(2263);
					match(INTEGER_VALUE);
					setState(2268);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2264);
						match(T__2);
						setState(2265);
						match(INTEGER_VALUE);
						}
						}
						setState(2270);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2271);
					match(T__1);
					}
					break;
				}
				}
				break;
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

	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_colTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2276);
			colType();
			setState(2281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2277);
					match(T__2);
					setState(2278);
					colType();
					}
					} 
				}
				setState(2283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
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

	public static class ColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SparkParserParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SparkParserParser.STRING, 0); }
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_colType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2284);
			identifier();
			setState(2285);
			dataType();
			setState(2288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
			case 1:
				{
				setState(2286);
				match(COMMENT);
				setState(2287);
				match(STRING);
				}
				break;
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

	public static class ComplexColTypeListContext extends ParserRuleContext {
		public List<ComplexColTypeContext> complexColType() {
			return getRuleContexts(ComplexColTypeContext.class);
		}
		public ComplexColTypeContext complexColType(int i) {
			return getRuleContext(ComplexColTypeContext.class,i);
		}
		public ComplexColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterComplexColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitComplexColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitComplexColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeListContext complexColTypeList() throws RecognitionException {
		ComplexColTypeListContext _localctx = new ComplexColTypeListContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2290);
			complexColType();
			setState(2295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(2291);
				match(T__2);
				setState(2292);
				complexColType();
				}
				}
				setState(2297);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ComplexColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SparkParserParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SparkParserParser.STRING, 0); }
		public ComplexColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterComplexColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitComplexColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitComplexColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeContext complexColType() throws RecognitionException {
		ComplexColTypeContext _localctx = new ComplexColTypeContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2298);
			identifier();
			setState(2299);
			match(T__9);
			setState(2300);
			dataType();
			setState(2303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2301);
				match(COMMENT);
				setState(2302);
				match(STRING);
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

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(SparkParserParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(SparkParserParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2305);
			match(WHEN);
			setState(2306);
			((WhenClauseContext)_localctx).condition = expression();
			setState(2307);
			match(THEN);
			setState(2308);
			((WhenClauseContext)_localctx).result = expression();
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

	public static class WindowsContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(SparkParserParser.WINDOW, 0); }
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public WindowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterWindows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitWindows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitWindows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowsContext windows() throws RecognitionException {
		WindowsContext _localctx = new WindowsContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_windows);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2310);
			match(WINDOW);
			setState(2311);
			namedWindow();
			setState(2316);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2312);
					match(T__2);
					setState(2313);
					namedWindow();
					}
					} 
				}
				setState(2318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
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

	public static class NamedWindowContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkParserParser.AS, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public NamedWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterNamedWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitNamedWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitNamedWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedWindowContext namedWindow() throws RecognitionException {
		NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2319);
			identifier();
			setState(2320);
			match(AS);
			setState(2321);
			windowSpec();
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

	public static class WindowSpecContext extends ParserRuleContext {
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	 
		public WindowSpecContext() { }
		public void copyFrom(WindowSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WindowRefContext extends WindowSpecContext {
		public IdentifierContext name;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public WindowRefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterWindowRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitWindowRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitWindowRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WindowDefContext extends WindowSpecContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode CLUSTER() { return getToken(SparkParserParser.CLUSTER, 0); }
		public List<TerminalNode> BY() { return getTokens(SparkParserParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkParserParser.BY, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode PARTITION() { return getToken(SparkParserParser.PARTITION, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SparkParserParser.DISTRIBUTE, 0); }
		public TerminalNode ORDER() { return getToken(SparkParserParser.ORDER, 0); }
		public TerminalNode SORT() { return getToken(SparkParserParser.SORT, 0); }
		public WindowDefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterWindowDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitWindowDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitWindowDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_windowSpec);
		int _la;
		try {
			setState(2369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2323);
				((WindowRefContext)_localctx).name = identifier();
				}
				break;
			case 2:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2324);
				match(T__0);
				setState(2325);
				((WindowRefContext)_localctx).name = identifier();
				setState(2326);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2328);
				match(T__0);
				setState(2363);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(2329);
					match(CLUSTER);
					setState(2330);
					match(BY);
					setState(2331);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(2336);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2332);
						match(T__2);
						setState(2333);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(2338);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__1:
				case ORDER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case SORT:
				case DISTRIBUTE:
					{
					setState(2349);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PARTITION || _la==DISTRIBUTE) {
						{
						setState(2339);
						_la = _input.LA(1);
						if ( !(_la==PARTITION || _la==DISTRIBUTE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2340);
						match(BY);
						setState(2341);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(2346);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(2342);
							match(T__2);
							setState(2343);
							((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(2348);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(2361);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(2351);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2352);
						match(BY);
						setState(2353);
						sortItem();
						setState(2358);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(2354);
							match(T__2);
							setState(2355);
							sortItem();
							}
							}
							setState(2360);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(2365);
					windowFrame();
					}
				}

				setState(2368);
				match(T__1);
				}
				break;
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

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(SparkParserParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(SparkParserParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(SparkParserParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SparkParserParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_windowFrame);
		try {
			setState(2387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2371);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2372);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2373);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2374);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2375);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2376);
				match(BETWEEN);
				setState(2377);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2378);
				match(AND);
				setState(2379);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2381);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2382);
				match(BETWEEN);
				setState(2383);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2384);
				match(AND);
				setState(2385);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
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

	public static class FrameBoundContext extends ParserRuleContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(SparkParserParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SparkParserParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SparkParserParser.FOLLOWING, 0); }
		public TerminalNode ROW() { return getToken(SparkParserParser.ROW, 0); }
		public TerminalNode CURRENT() { return getToken(SparkParserParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterFrameBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitFrameBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitFrameBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_frameBound);
		int _la;
		try {
			setState(2396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2389);
				match(UNBOUNDED);
				setState(2390);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRECEDING || _la==FOLLOWING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2391);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(2392);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2393);
				expression();
				setState(2394);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRECEDING || _la==FOLLOWING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2398);
			identifier();
			setState(2403);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2399);
					match(T__3);
					setState(2400);
					identifier();
					}
					} 
				}
				setState(2405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
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

	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode ANTI() { return getToken(SparkParserParser.ANTI, 0); }
		public TerminalNode FULL() { return getToken(SparkParserParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(SparkParserParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(SparkParserParser.LEFT, 0); }
		public TerminalNode SEMI() { return getToken(SparkParserParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(SparkParserParser.RIGHT, 0); }
		public TerminalNode NATURAL() { return getToken(SparkParserParser.NATURAL, 0); }
		public TerminalNode JOIN() { return getToken(SparkParserParser.JOIN, 0); }
		public TerminalNode CROSS() { return getToken(SparkParserParser.CROSS, 0); }
		public TerminalNode ON() { return getToken(SparkParserParser.ON, 0); }
		public TerminalNode UNION() { return getToken(SparkParserParser.UNION, 0); }
		public TerminalNode INTERSECT() { return getToken(SparkParserParser.INTERSECT, 0); }
		public TerminalNode EXCEPT() { return getToken(SparkParserParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(SparkParserParser.SETMINUS, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_identifier);
		try {
			setState(2421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case ANY:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case PIVOT:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case EXTRACT:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2406);
				strictIdentifier();
				}
				break;
			case ANTI:
				enterOuterAlt(_localctx, 2);
				{
				setState(2407);
				match(ANTI);
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2408);
				match(FULL);
				}
				break;
			case INNER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2409);
				match(INNER);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2410);
				match(LEFT);
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 6);
				{
				setState(2411);
				match(SEMI);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 7);
				{
				setState(2412);
				match(RIGHT);
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(2413);
				match(NATURAL);
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 9);
				{
				setState(2414);
				match(JOIN);
				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 10);
				{
				setState(2415);
				match(CROSS);
				}
				break;
			case ON:
				enterOuterAlt(_localctx, 11);
				{
				setState(2416);
				match(ON);
				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 12);
				{
				setState(2417);
				match(UNION);
				}
				break;
			case INTERSECT:
				enterOuterAlt(_localctx, 13);
				{
				setState(2418);
				match(INTERSECT);
				}
				break;
			case EXCEPT:
				enterOuterAlt(_localctx, 14);
				{
				setState(2419);
				match(EXCEPT);
				}
				break;
			case SETMINUS:
				enterOuterAlt(_localctx, 15);
				{
				setState(2420);
				match(SETMINUS);
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

	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(SparkParserParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_strictIdentifier);
		try {
			setState(2426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2423);
				match(IDENTIFIER);
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2424);
				quotedIdentifier();
				}
				break;
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case ANY:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case PIVOT:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case EXTRACT:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case LOCAL:
			case INPATH:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2425);
				nonReserved();
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

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SparkParserParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2428);
			match(BACKQUOTED_IDENTIFIER);
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

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(SparkParserParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SparkParserParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(SparkParserParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SparkParserParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitBigIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitBigIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(SparkParserParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SparkParserParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitTinyIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitTinyIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(SparkParserParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SparkParserParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterBigDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitBigDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitBigDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(SparkParserParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SparkParserParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SparkParserParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SparkParserParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(SparkParserParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SparkParserParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitSmallIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitSmallIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_number);
		int _la;
		try {
			setState(2458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2430);
					match(MINUS);
					}
				}

				setState(2433);
				match(DECIMAL_VALUE);
				}
				break;
			case 2:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2434);
					match(MINUS);
					}
				}

				setState(2437);
				match(INTEGER_VALUE);
				}
				break;
			case 3:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2438);
					match(MINUS);
					}
				}

				setState(2441);
				match(BIGINT_LITERAL);
				}
				break;
			case 4:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2442);
					match(MINUS);
					}
				}

				setState(2445);
				match(SMALLINT_LITERAL);
				}
				break;
			case 5:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2446);
					match(MINUS);
					}
				}

				setState(2449);
				match(TINYINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2450);
					match(MINUS);
					}
				}

				setState(2453);
				match(DOUBLE_LITERAL);
				}
				break;
			case 7:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2454);
					match(MINUS);
					}
				}

				setState(2457);
				match(BIGDECIMAL_LITERAL);
				}
				break;
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

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(SparkParserParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SparkParserParser.TABLES, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkParserParser.COLUMNS, 0); }
		public TerminalNode COLUMN() { return getToken(SparkParserParser.COLUMN, 0); }
		public TerminalNode PARTITIONS() { return getToken(SparkParserParser.PARTITIONS, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SparkParserParser.FUNCTIONS, 0); }
		public TerminalNode DATABASES() { return getToken(SparkParserParser.DATABASES, 0); }
		public TerminalNode ADD() { return getToken(SparkParserParser.ADD, 0); }
		public TerminalNode OVER() { return getToken(SparkParserParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(SparkParserParser.PARTITION, 0); }
		public TerminalNode RANGE() { return getToken(SparkParserParser.RANGE, 0); }
		public TerminalNode ROWS() { return getToken(SparkParserParser.ROWS, 0); }
		public TerminalNode PRECEDING() { return getToken(SparkParserParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SparkParserParser.FOLLOWING, 0); }
		public TerminalNode CURRENT() { return getToken(SparkParserParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(SparkParserParser.ROW, 0); }
		public TerminalNode LAST() { return getToken(SparkParserParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(SparkParserParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(SparkParserParser.AFTER, 0); }
		public TerminalNode MAP() { return getToken(SparkParserParser.MAP, 0); }
		public TerminalNode ARRAY() { return getToken(SparkParserParser.ARRAY, 0); }
		public TerminalNode STRUCT() { return getToken(SparkParserParser.STRUCT, 0); }
		public TerminalNode PIVOT() { return getToken(SparkParserParser.PIVOT, 0); }
		public TerminalNode LATERAL() { return getToken(SparkParserParser.LATERAL, 0); }
		public TerminalNode WINDOW() { return getToken(SparkParserParser.WINDOW, 0); }
		public TerminalNode REDUCE() { return getToken(SparkParserParser.REDUCE, 0); }
		public TerminalNode TRANSFORM() { return getToken(SparkParserParser.TRANSFORM, 0); }
		public TerminalNode SERDE() { return getToken(SparkParserParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SparkParserParser.SERDEPROPERTIES, 0); }
		public TerminalNode RECORDREADER() { return getToken(SparkParserParser.RECORDREADER, 0); }
		public TerminalNode DELIMITED() { return getToken(SparkParserParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(SparkParserParser.FIELDS, 0); }
		public TerminalNode TERMINATED() { return getToken(SparkParserParser.TERMINATED, 0); }
		public TerminalNode COLLECTION() { return getToken(SparkParserParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(SparkParserParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SparkParserParser.KEYS, 0); }
		public TerminalNode ESCAPED() { return getToken(SparkParserParser.ESCAPED, 0); }
		public TerminalNode LINES() { return getToken(SparkParserParser.LINES, 0); }
		public TerminalNode SEPARATED() { return getToken(SparkParserParser.SEPARATED, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkParserParser.EXTENDED, 0); }
		public TerminalNode REFRESH() { return getToken(SparkParserParser.REFRESH, 0); }
		public TerminalNode CLEAR() { return getToken(SparkParserParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(SparkParserParser.CACHE, 0); }
		public TerminalNode UNCACHE() { return getToken(SparkParserParser.UNCACHE, 0); }
		public TerminalNode LAZY() { return getToken(SparkParserParser.LAZY, 0); }
		public TerminalNode GLOBAL() { return getToken(SparkParserParser.GLOBAL, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkParserParser.TEMPORARY, 0); }
		public TerminalNode OPTIONS() { return getToken(SparkParserParser.OPTIONS, 0); }
		public TerminalNode GROUPING() { return getToken(SparkParserParser.GROUPING, 0); }
		public TerminalNode CUBE() { return getToken(SparkParserParser.CUBE, 0); }
		public TerminalNode ROLLUP() { return getToken(SparkParserParser.ROLLUP, 0); }
		public TerminalNode EXPLAIN() { return getToken(SparkParserParser.EXPLAIN, 0); }
		public TerminalNode FORMAT() { return getToken(SparkParserParser.FORMAT, 0); }
		public TerminalNode LOGICAL() { return getToken(SparkParserParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(SparkParserParser.FORMATTED, 0); }
		public TerminalNode CODEGEN() { return getToken(SparkParserParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(SparkParserParser.COST, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SparkParserParser.TABLESAMPLE, 0); }
		public TerminalNode USE() { return getToken(SparkParserParser.USE, 0); }
		public TerminalNode TO() { return getToken(SparkParserParser.TO, 0); }
		public TerminalNode BUCKET() { return getToken(SparkParserParser.BUCKET, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SparkParserParser.PERCENTLIT, 0); }
		public TerminalNode OUT() { return getToken(SparkParserParser.OUT, 0); }
		public TerminalNode OF() { return getToken(SparkParserParser.OF, 0); }
		public TerminalNode SET() { return getToken(SparkParserParser.SET, 0); }
		public TerminalNode RESET() { return getToken(SparkParserParser.RESET, 0); }
		public TerminalNode VIEW() { return getToken(SparkParserParser.VIEW, 0); }
		public TerminalNode REPLACE() { return getToken(SparkParserParser.REPLACE, 0); }
		public TerminalNode IF() { return getToken(SparkParserParser.IF, 0); }
		public TerminalNode POSITION() { return getToken(SparkParserParser.POSITION, 0); }
		public TerminalNode EXTRACT() { return getToken(SparkParserParser.EXTRACT, 0); }
		public TerminalNode NO() { return getToken(SparkParserParser.NO, 0); }
		public TerminalNode DATA() { return getToken(SparkParserParser.DATA, 0); }
		public TerminalNode START() { return getToken(SparkParserParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SparkParserParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(SparkParserParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SparkParserParser.ROLLBACK, 0); }
		public TerminalNode IGNORE() { return getToken(SparkParserParser.IGNORE, 0); }
		public TerminalNode SORT() { return getToken(SparkParserParser.SORT, 0); }
		public TerminalNode CLUSTER() { return getToken(SparkParserParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SparkParserParser.DISTRIBUTE, 0); }
		public TerminalNode UNSET() { return getToken(SparkParserParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SparkParserParser.TBLPROPERTIES, 0); }
		public TerminalNode SKEWED() { return getToken(SparkParserParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(SparkParserParser.STORED, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SparkParserParser.DIRECTORIES, 0); }
		public TerminalNode LOCATION() { return getToken(SparkParserParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(SparkParserParser.EXCHANGE, 0); }
		public TerminalNode ARCHIVE() { return getToken(SparkParserParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SparkParserParser.UNARCHIVE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SparkParserParser.FILEFORMAT, 0); }
		public TerminalNode TOUCH() { return getToken(SparkParserParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(SparkParserParser.COMPACT, 0); }
		public TerminalNode CONCATENATE() { return getToken(SparkParserParser.CONCATENATE, 0); }
		public TerminalNode CHANGE() { return getToken(SparkParserParser.CHANGE, 0); }
		public TerminalNode CASCADE() { return getToken(SparkParserParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(SparkParserParser.RESTRICT, 0); }
		public TerminalNode BUCKETS() { return getToken(SparkParserParser.BUCKETS, 0); }
		public TerminalNode CLUSTERED() { return getToken(SparkParserParser.CLUSTERED, 0); }
		public TerminalNode SORTED() { return getToken(SparkParserParser.SORTED, 0); }
		public TerminalNode PURGE() { return getToken(SparkParserParser.PURGE, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SparkParserParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SparkParserParser.OUTPUTFORMAT, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SparkParserParser.DBPROPERTIES, 0); }
		public TerminalNode DFS() { return getToken(SparkParserParser.DFS, 0); }
		public TerminalNode TRUNCATE() { return getToken(SparkParserParser.TRUNCATE, 0); }
		public TerminalNode COMPUTE() { return getToken(SparkParserParser.COMPUTE, 0); }
		public TerminalNode LIST() { return getToken(SparkParserParser.LIST, 0); }
		public TerminalNode STATISTICS() { return getToken(SparkParserParser.STATISTICS, 0); }
		public TerminalNode ANALYZE() { return getToken(SparkParserParser.ANALYZE, 0); }
		public TerminalNode PARTITIONED() { return getToken(SparkParserParser.PARTITIONED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SparkParserParser.EXTERNAL, 0); }
		public TerminalNode DEFINED() { return getToken(SparkParserParser.DEFINED, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SparkParserParser.RECORDWRITER, 0); }
		public TerminalNode REVOKE() { return getToken(SparkParserParser.REVOKE, 0); }
		public TerminalNode GRANT() { return getToken(SparkParserParser.GRANT, 0); }
		public TerminalNode LOCK() { return getToken(SparkParserParser.LOCK, 0); }
		public TerminalNode UNLOCK() { return getToken(SparkParserParser.UNLOCK, 0); }
		public TerminalNode MSCK() { return getToken(SparkParserParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(SparkParserParser.REPAIR, 0); }
		public TerminalNode RECOVER() { return getToken(SparkParserParser.RECOVER, 0); }
		public TerminalNode EXPORT() { return getToken(SparkParserParser.EXPORT, 0); }
		public TerminalNode IMPORT() { return getToken(SparkParserParser.IMPORT, 0); }
		public TerminalNode LOAD() { return getToken(SparkParserParser.LOAD, 0); }
		public TerminalNode VALUES() { return getToken(SparkParserParser.VALUES, 0); }
		public TerminalNode COMMENT() { return getToken(SparkParserParser.COMMENT, 0); }
		public TerminalNode ROLE() { return getToken(SparkParserParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SparkParserParser.ROLES, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SparkParserParser.COMPACTIONS, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SparkParserParser.PRINCIPALS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SparkParserParser.TRANSACTIONS, 0); }
		public TerminalNode INDEX() { return getToken(SparkParserParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SparkParserParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(SparkParserParser.LOCKS, 0); }
		public TerminalNode OPTION() { return getToken(SparkParserParser.OPTION, 0); }
		public TerminalNode LOCAL() { return getToken(SparkParserParser.LOCAL, 0); }
		public TerminalNode INPATH() { return getToken(SparkParserParser.INPATH, 0); }
		public TerminalNode ASC() { return getToken(SparkParserParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SparkParserParser.DESC, 0); }
		public TerminalNode LIMIT() { return getToken(SparkParserParser.LIMIT, 0); }
		public TerminalNode RENAME() { return getToken(SparkParserParser.RENAME, 0); }
		public TerminalNode SETS() { return getToken(SparkParserParser.SETS, 0); }
		public TerminalNode AT() { return getToken(SparkParserParser.AT, 0); }
		public TerminalNode NULLS() { return getToken(SparkParserParser.NULLS, 0); }
		public TerminalNode OVERWRITE() { return getToken(SparkParserParser.OVERWRITE, 0); }
		public TerminalNode ALL() { return getToken(SparkParserParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(SparkParserParser.ANY, 0); }
		public TerminalNode ALTER() { return getToken(SparkParserParser.ALTER, 0); }
		public TerminalNode AS() { return getToken(SparkParserParser.AS, 0); }
		public TerminalNode BETWEEN() { return getToken(SparkParserParser.BETWEEN, 0); }
		public TerminalNode BY() { return getToken(SparkParserParser.BY, 0); }
		public TerminalNode CREATE() { return getToken(SparkParserParser.CREATE, 0); }
		public TerminalNode DELETE() { return getToken(SparkParserParser.DELETE, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkParserParser.DESCRIBE, 0); }
		public TerminalNode DROP() { return getToken(SparkParserParser.DROP, 0); }
		public TerminalNode EXISTS() { return getToken(SparkParserParser.EXISTS, 0); }
		public TerminalNode FALSE() { return getToken(SparkParserParser.FALSE, 0); }
		public TerminalNode FOR() { return getToken(SparkParserParser.FOR, 0); }
		public TerminalNode GROUP() { return getToken(SparkParserParser.GROUP, 0); }
		public TerminalNode IN() { return getToken(SparkParserParser.IN, 0); }
		public TerminalNode INSERT() { return getToken(SparkParserParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SparkParserParser.INTO, 0); }
		public TerminalNode IS() { return getToken(SparkParserParser.IS, 0); }
		public TerminalNode LIKE() { return getToken(SparkParserParser.LIKE, 0); }
		public TerminalNode NULL() { return getToken(SparkParserParser.NULL, 0); }
		public TerminalNode ORDER() { return getToken(SparkParserParser.ORDER, 0); }
		public TerminalNode OUTER() { return getToken(SparkParserParser.OUTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkParserParser.TABLE, 0); }
		public TerminalNode TRUE() { return getToken(SparkParserParser.TRUE, 0); }
		public TerminalNode WITH() { return getToken(SparkParserParser.WITH, 0); }
		public TerminalNode RLIKE() { return getToken(SparkParserParser.RLIKE, 0); }
		public TerminalNode AND() { return getToken(SparkParserParser.AND, 0); }
		public TerminalNode CASE() { return getToken(SparkParserParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(SparkParserParser.CAST, 0); }
		public TerminalNode DISTINCT() { return getToken(SparkParserParser.DISTINCT, 0); }
		public TerminalNode DIV() { return getToken(SparkParserParser.DIV, 0); }
		public TerminalNode ELSE() { return getToken(SparkParserParser.ELSE, 0); }
		public TerminalNode END() { return getToken(SparkParserParser.END, 0); }
		public TerminalNode FUNCTION() { return getToken(SparkParserParser.FUNCTION, 0); }
		public TerminalNode INTERVAL() { return getToken(SparkParserParser.INTERVAL, 0); }
		public TerminalNode MACRO() { return getToken(SparkParserParser.MACRO, 0); }
		public TerminalNode OR() { return getToken(SparkParserParser.OR, 0); }
		public TerminalNode STRATIFY() { return getToken(SparkParserParser.STRATIFY, 0); }
		public TerminalNode THEN() { return getToken(SparkParserParser.THEN, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SparkParserParser.UNBOUNDED, 0); }
		public TerminalNode WHEN() { return getToken(SparkParserParser.WHEN, 0); }
		public TerminalNode DATABASE() { return getToken(SparkParserParser.DATABASE, 0); }
		public TerminalNode SELECT() { return getToken(SparkParserParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(SparkParserParser.FROM, 0); }
		public TerminalNode WHERE() { return getToken(SparkParserParser.WHERE, 0); }
		public TerminalNode HAVING() { return getToken(SparkParserParser.HAVING, 0); }
		public TerminalNode NOT() { return getToken(SparkParserParser.NOT, 0); }
		public TerminalNode DIRECTORY() { return getToken(SparkParserParser.DIRECTORY, 0); }
		public TerminalNode BOTH() { return getToken(SparkParserParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(SparkParserParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(SparkParserParser.TRAILING, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkParserListener ) ((SparkParserListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkParserVisitor ) return ((SparkParserVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2460);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << OUTER) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (DIV - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)) | (1L << (LOCATION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 35:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 71:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 73:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 74:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return legacy_setops_precedence_enbled;
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return !legacy_setops_precedence_enbled;
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return !legacy_setops_precedence_enbled;
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 5);
		case 15:
			return precpred(_ctx, 3);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0101\u09a1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u00e7\n\b\3\b\3\b\3\b\5\b\u00ec\n\b\3\b\5\b\u00ef\n\b\3\b\3\b"+
		"\3\b\5\b\u00f4\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0101"+
		"\n\b\3\b\3\b\5\b\u0105\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u010c\n\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u011a\n\b\f\b\16\b\u011d\13"+
		"\b\3\b\5\b\u0120\n\b\3\b\5\b\u0123\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u012a\n"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u013b"+
		"\n\b\f\b\16\b\u013e\13\b\3\b\5\b\u0141\n\b\3\b\5\b\u0144\n\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u014b\n\b\3\b\3\b\3\b\3\b\5\b\u0151\n\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u0158\n\b\3\b\3\b\5\b\u015c\n\b\3\b\3\b\3\b\3\b\5\b\u0162\n\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u016a\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u018a\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0192\n\b"+
		"\3\b\3\b\5\b\u0196\n\b\3\b\3\b\3\b\5\b\u019b\n\b\3\b\3\b\3\b\3\b\5\b\u01a1"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01a9\n\b\3\b\3\b\3\b\3\b\5\b\u01af\n"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01bc\n\b\3\b\6\b\u01bf"+
		"\n\b\r\b\16\b\u01c0\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01ca\n\b\3\b\6\b"+
		"\u01cd\n\b\r\b\16\b\u01ce\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u01df\n\b\3\b\3\b\3\b\7\b\u01e4\n\b\f\b\16\b\u01e7\13"+
		"\b\3\b\5\b\u01ea\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01f2\n\b\3\b\3\b\3\b"+
		"\7\b\u01f7\n\b\f\b\16\b\u01fa\13\b\3\b\3\b\3\b\3\b\5\b\u0200\n\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u020f\n\b\3\b\3\b\5"+
		"\b\u0213\n\b\3\b\3\b\3\b\3\b\5\b\u0219\n\b\3\b\3\b\3\b\3\b\5\b\u021f\n"+
		"\b\3\b\5\b\u0222\n\b\3\b\5\b\u0225\n\b\3\b\3\b\3\b\3\b\5\b\u022b\n\b\3"+
		"\b\3\b\5\b\u022f\n\b\3\b\3\b\5\b\u0233\n\b\3\b\3\b\3\b\5\b\u0238\n\b\3"+
		"\b\3\b\5\b\u023c\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0244\n\b\3\b\5\b\u0247"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0250\n\b\3\b\3\b\3\b\5\b\u0255\n"+
		"\b\3\b\3\b\3\b\3\b\5\b\u025b\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0262\n\b\3\b"+
		"\5\b\u0265\n\b\3\b\3\b\3\b\3\b\5\b\u026b\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\7\b\u0274\n\b\f\b\16\b\u0277\13\b\5\b\u0279\n\b\3\b\3\b\5\b\u027d\n"+
		"\b\3\b\3\b\3\b\5\b\u0282\n\b\3\b\3\b\3\b\5\b\u0287\n\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u028e\n\b\3\b\5\b\u0291\n\b\3\b\5\b\u0294\n\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u029b\n\b\3\b\3\b\3\b\5\b\u02a0\n\b\3\b\3\b\3\b\5\b\u02a5\n\b"+
		"\3\b\5\b\u02a8\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u02b1\n\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u02b9\n\b\3\b\3\b\3\b\3\b\5\b\u02bf\n\b\3\b\3\b\5\b"+
		"\u02c3\n\b\3\b\3\b\5\b\u02c7\n\b\3\b\3\b\5\b\u02cb\n\b\5\b\u02cd\n\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u02d6\n\b\3\b\3\b\3\b\3\b\5\b\u02dc\n\b"+
		"\3\b\3\b\3\b\5\b\u02e1\n\b\3\b\5\b\u02e4\n\b\3\b\3\b\5\b\u02e8\n\b\3\b"+
		"\5\b\u02eb\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u02f3\n\b\f\b\16\b\u02f6\13"+
		"\b\5\b\u02f8\n\b\3\b\3\b\5\b\u02fc\n\b\3\b\3\b\3\b\5\b\u0301\n\b\3\b\5"+
		"\b\u0304\n\b\3\b\3\b\3\b\3\b\5\b\u030a\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u0312\n\b\3\b\3\b\3\b\5\b\u0317\n\b\3\b\3\b\3\b\3\b\5\b\u031d\n\b\3\b"+
		"\3\b\3\b\3\b\5\b\u0323\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u032c\n\b\f"+
		"\b\16\b\u032f\13\b\3\b\3\b\3\b\7\b\u0334\n\b\f\b\16\b\u0337\13\b\3\b\3"+
		"\b\7\b\u033b\n\b\f\b\16\b\u033e\13\b\3\b\3\b\3\b\7\b\u0343\n\b\f\b\16"+
		"\b\u0346\13\b\5\b\u0348\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0350\n\t\3\t"+
		"\3\t\5\t\u0354\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u035b\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u03cf\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u03d7\n\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u03df\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u03e8\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u03f4\n\t\3\n\3"+
		"\n\5\n\u03f8\n\n\3\n\5\n\u03fb\n\n\3\n\3\n\3\n\3\n\5\n\u0401\n\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u040b\n\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\u0417\n\f\3\f\3\f\3\f\5\f\u041c\n\f\3\r\3\r"+
		"\3\r\3\16\5\16\u0422\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u042e\n\17\5\17\u0430\n\17\3\17\3\17\3\17\5\17\u0435\n\17\3"+
		"\17\3\17\5\17\u0439\n\17\3\17\3\17\3\17\5\17\u043e\n\17\3\17\3\17\3\17"+
		"\5\17\u0443\n\17\3\17\5\17\u0446\n\17\3\17\3\17\3\17\5\17\u044b\n\17\3"+
		"\17\3\17\5\17\u044f\n\17\3\17\3\17\3\17\5\17\u0454\n\17\5\17\u0456\n\17"+
		"\3\20\3\20\5\20\u045a\n\20\3\21\3\21\3\21\3\21\3\21\7\21\u0461\n\21\f"+
		"\21\16\21\u0464\13\21\3\21\3\21\3\22\3\22\3\22\5\22\u046b\n\22\3\23\3"+
		"\23\3\23\3\23\3\23\5\23\u0472\n\23\3\24\3\24\3\24\7\24\u0477\n\24\f\24"+
		"\16\24\u047a\13\24\3\25\3\25\3\25\3\25\7\25\u0480\n\25\f\25\16\25\u0483"+
		"\13\25\3\26\3\26\5\26\u0487\n\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\7\30\u0494\n\30\f\30\16\30\u0497\13\30\3\30\3\30\3"+
		"\31\3\31\5\31\u049d\n\31\3\31\5\31\u04a0\n\31\3\32\3\32\3\32\7\32\u04a5"+
		"\n\32\f\32\16\32\u04a8\13\32\3\32\5\32\u04ab\n\32\3\33\3\33\3\33\3\33"+
		"\5\33\u04b1\n\33\3\34\3\34\3\34\3\34\7\34\u04b7\n\34\f\34\16\34\u04ba"+
		"\13\34\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u04c2\n\35\f\35\16\35\u04c5"+
		"\13\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u04cf\n\36\3\37\3"+
		"\37\3\37\3\37\3\37\5\37\u04d6\n\37\3 \3 \3 \3 \5 \u04dc\n \3!\3!\3!\3"+
		"\"\5\"\u04e2\n\"\3\"\3\"\3\"\3\"\3\"\6\"\u04e9\n\"\r\"\16\"\u04ea\5\""+
		"\u04ed\n\"\3#\3#\3#\3#\3#\7#\u04f4\n#\f#\16#\u04f7\13#\5#\u04f9\n#\3#"+
		"\3#\3#\3#\3#\7#\u0500\n#\f#\16#\u0503\13#\5#\u0505\n#\3#\3#\3#\3#\3#\7"+
		"#\u050c\n#\f#\16#\u050f\13#\5#\u0511\n#\3#\3#\3#\3#\3#\7#\u0518\n#\f#"+
		"\16#\u051b\13#\5#\u051d\n#\3#\5#\u0520\n#\3#\3#\3#\5#\u0525\n#\5#\u0527"+
		"\n#\3$\5$\u052a\n$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\5%\u0536\n%\3%\3%\3%"+
		"\3%\3%\5%\u053d\n%\3%\3%\3%\3%\3%\5%\u0544\n%\3%\7%\u0547\n%\f%\16%\u054a"+
		"\13%\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0554\n&\3\'\3\'\5\'\u0558\n\'\3\'\3\'"+
		"\5\'\u055c\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0568\n(\3(\5(\u056b\n"+
		"(\3(\3(\5(\u056f\n(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0579\n(\3(\3(\5(\u057d"+
		"\n(\5(\u057f\n(\3(\5(\u0582\n(\3(\3(\5(\u0586\n(\3(\5(\u0589\n(\3(\3("+
		"\5(\u058d\n(\3(\3(\7(\u0591\n(\f(\16(\u0594\13(\3(\5(\u0597\n(\3(\3(\5"+
		"(\u059b\n(\3(\3(\3(\5(\u05a0\n(\3(\5(\u05a3\n(\5(\u05a5\n(\3(\7(\u05a8"+
		"\n(\f(\16(\u05ab\13(\3(\3(\5(\u05af\n(\3(\5(\u05b2\n(\3(\3(\5(\u05b6\n"+
		"(\3(\5(\u05b9\n(\5(\u05bb\n(\3)\3)\3)\5)\u05c0\n)\3)\7)\u05c3\n)\f)\16"+
		")\u05c6\13)\3)\3)\3*\3*\3*\3*\3*\3*\7*\u05d0\n*\f*\16*\u05d3\13*\3*\3"+
		"*\5*\u05d7\n*\3+\3+\3+\3+\7+\u05dd\n+\f+\16+\u05e0\13+\3+\7+\u05e3\n+"+
		"\f+\16+\u05e6\13+\3+\5+\u05e9\n+\3,\3,\3,\3,\3,\7,\u05f0\n,\f,\16,\u05f3"+
		"\13,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\7,\u05ff\n,\f,\16,\u0602\13,\3,\3,"+
		"\5,\u0606\n,\3,\3,\3,\3,\3,\3,\3,\3,\7,\u0610\n,\f,\16,\u0613\13,\3,\3"+
		",\5,\u0617\n,\3-\3-\3-\3-\7-\u061d\n-\f-\16-\u0620\13-\5-\u0622\n-\3-"+
		"\3-\5-\u0626\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u0632\n.\f.\16.\u0635"+
		"\13.\3.\3.\3.\3/\3/\3/\3/\3/\7/\u063f\n/\f/\16/\u0642\13/\3/\3/\5/\u0646"+
		"\n/\3\60\3\60\5\60\u064a\n\60\3\60\5\60\u064d\n\60\3\61\3\61\3\61\5\61"+
		"\u0652\n\61\3\61\3\61\3\61\3\61\3\61\7\61\u0659\n\61\f\61\16\61\u065c"+
		"\13\61\5\61\u065e\n\61\3\61\3\61\3\61\5\61\u0663\n\61\3\61\3\61\3\61\7"+
		"\61\u0668\n\61\f\61\16\61\u066b\13\61\5\61\u066d\n\61\3\62\3\62\3\63\3"+
		"\63\7\63\u0673\n\63\f\63\16\63\u0676\13\63\3\64\3\64\3\64\3\64\5\64\u067c"+
		"\n\64\3\64\3\64\3\64\3\64\3\64\5\64\u0683\n\64\3\65\5\65\u0686\n\65\3"+
		"\65\3\65\3\65\5\65\u068b\n\65\3\65\3\65\3\65\3\65\5\65\u0691\n\65\3\65"+
		"\3\65\5\65\u0695\n\65\3\65\5\65\u0698\n\65\3\65\5\65\u069b\n\65\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\7\66\u06a4\n\66\f\66\16\66\u06a7\13\66\3"+
		"\66\3\66\5\66\u06ab\n\66\3\67\3\67\3\67\5\67\u06b0\n\67\3\67\3\67\38\5"+
		"8\u06b5\n8\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\58\u06c7\n"+
		"8\58\u06c9\n8\38\58\u06cc\n8\39\39\39\39\3:\3:\3:\7:\u06d5\n:\f:\16:\u06d8"+
		"\13:\3;\3;\3;\3;\7;\u06de\n;\f;\16;\u06e1\13;\3;\3;\3<\3<\5<\u06e7\n<"+
		"\3=\3=\3=\3=\7=\u06ed\n=\f=\16=\u06f0\13=\3=\3=\3>\3>\3>\5>\u06f7\n>\3"+
		"?\3?\5?\u06fb\n?\3?\3?\3?\3?\3?\3?\5?\u0703\n?\3?\3?\3?\3?\3?\3?\5?\u070b"+
		"\n?\3?\3?\3?\3?\5?\u0711\n?\3@\3@\3@\3@\7@\u0717\n@\f@\16@\u071a\13@\3"+
		"@\3@\3A\3A\3A\3A\3A\7A\u0723\nA\fA\16A\u0726\13A\5A\u0728\nA\3A\3A\3A"+
		"\3B\5B\u072e\nB\3B\3B\5B\u0732\nB\5B\u0734\nB\3C\3C\3C\3C\3C\3C\3C\5C"+
		"\u073d\nC\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u0749\nC\5C\u074b\nC\3C\3C"+
		"\3C\3C\3C\5C\u0752\nC\3C\3C\3C\3C\3C\5C\u0759\nC\3C\3C\3C\3C\5C\u075f"+
		"\nC\3C\3C\3C\3C\5C\u0765\nC\5C\u0767\nC\3D\3D\3D\5D\u076c\nD\3D\3D\3E"+
		"\3E\3E\5E\u0773\nE\3E\3E\3F\3F\5F\u0779\nF\3F\3F\5F\u077d\nF\5F\u077f"+
		"\nF\3G\3G\3G\7G\u0784\nG\fG\16G\u0787\13G\3H\3H\3I\3I\3I\3I\3I\3I\3I\3"+
		"I\3I\3I\5I\u0795\nI\5I\u0797\nI\3I\3I\3I\3I\3I\3I\7I\u079f\nI\fI\16I\u07a2"+
		"\13I\3J\5J\u07a5\nJ\3J\3J\3J\3J\3J\3J\5J\u07ad\nJ\3J\3J\3J\3J\3J\7J\u07b4"+
		"\nJ\fJ\16J\u07b7\13J\3J\3J\3J\5J\u07bc\nJ\3J\3J\3J\3J\3J\3J\5J\u07c4\n"+
		"J\3J\3J\3J\3J\5J\u07ca\nJ\3J\3J\3J\5J\u07cf\nJ\3J\3J\3J\5J\u07d4\nJ\3"+
		"K\3K\3K\3K\5K\u07da\nK\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3"+
		"K\3K\3K\3K\7K\u07ef\nK\fK\16K\u07f2\13K\3L\3L\3L\6L\u07f7\nL\rL\16L\u07f8"+
		"\3L\3L\5L\u07fd\nL\3L\3L\3L\3L\3L\6L\u0804\nL\rL\16L\u0805\3L\3L\5L\u080a"+
		"\nL\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\7L\u081a\nL\fL\16L\u081d"+
		"\13L\5L\u081f\nL\3L\3L\3L\3L\3L\3L\5L\u0827\nL\3L\3L\3L\3L\3L\3L\3L\5"+
		"L\u0830\nL\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\6"+
		"L\u0845\nL\rL\16L\u0846\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u0852\nL\3L\3L\3"+
		"L\7L\u0857\nL\fL\16L\u085a\13L\5L\u085c\nL\3L\3L\3L\5L\u0861\nL\3L\3L"+
		"\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\6L\u0872\nL\rL\16L\u0873\3L\3"+
		"L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u0885\nL\3L\3L\3L\3L\3L\3"+
		"L\3L\3L\7L\u088f\nL\fL\16L\u0892\13L\3M\3M\3M\3M\3M\3M\3M\3M\6M\u089c"+
		"\nM\rM\16M\u089d\5M\u08a0\nM\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\7R\u08ac\n"+
		"R\fR\16R\u08af\13R\3S\3S\3S\3S\5S\u08b5\nS\3T\5T\u08b8\nT\3T\3T\5T\u08bc"+
		"\nT\3U\3U\3U\5U\u08c1\nU\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V"+
		"\5V\u08d2\nV\3V\3V\5V\u08d6\nV\3V\3V\3V\3V\3V\7V\u08dd\nV\fV\16V\u08e0"+
		"\13V\3V\5V\u08e3\nV\5V\u08e5\nV\3W\3W\3W\7W\u08ea\nW\fW\16W\u08ed\13W"+
		"\3X\3X\3X\3X\5X\u08f3\nX\3Y\3Y\3Y\7Y\u08f8\nY\fY\16Y\u08fb\13Y\3Z\3Z\3"+
		"Z\3Z\3Z\5Z\u0902\nZ\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\7\\\u090d\n\\\f\\\16"+
		"\\\u0910\13\\\3]\3]\3]\3]\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\7^\u0921\n"+
		"^\f^\16^\u0924\13^\3^\3^\3^\3^\3^\7^\u092b\n^\f^\16^\u092e\13^\5^\u0930"+
		"\n^\3^\3^\3^\3^\3^\7^\u0937\n^\f^\16^\u093a\13^\5^\u093c\n^\5^\u093e\n"+
		"^\3^\5^\u0941\n^\3^\5^\u0944\n^\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3"+
		"_\3_\3_\3_\5_\u0956\n_\3`\3`\3`\3`\3`\3`\3`\5`\u095f\n`\3a\3a\3a\7a\u0964"+
		"\na\fa\16a\u0967\13a\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\5b\u0978"+
		"\nb\3c\3c\3c\5c\u097d\nc\3d\3d\3e\5e\u0982\ne\3e\3e\5e\u0986\ne\3e\3e"+
		"\5e\u098a\ne\3e\3e\5e\u098e\ne\3e\3e\5e\u0992\ne\3e\3e\5e\u0996\ne\3e"+
		"\3e\5e\u099a\ne\3e\5e\u099d\ne\3f\3f\3f\7\u02f4\u032d\u0335\u033c\u0344"+
		"\6H\u0090\u0094\u0096g\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\2\35\3\2"+
		"\u00ca\u00cb\4\2RRTT\5\2\\^\u00b0\u00b0\u00b6\u00b6\4\2\16\16!!\4\2.."+
		"YY\4\2\u00b0\u00b0\u00b6\u00b6\4\2\17\17\u00d7\u00d7\3\2hk\3\2hj\3\2-"+
		".\4\2KKMM\4\2\21\21\23\23\3\2\u00f7\u00f8\3\2&\'\4\2\u008c\u008d\u0092"+
		"\u0092\3\2\u008e\u0091\4\2\u008c\u008d\u0095\u0095\3\2~\u0080\3\2\u0084"+
		"\u008b\3\2\u008c\u0096\3\2\37\"\3\2*+\3\2\u008c\u008d\4\2DD\u009d\u009d"+
		"\4\2\33\33\u009b\u009b\3\2HI\n\2\r\6588@gl\u0083\u0091\u0091\u0097\u00a0"+
		"\u00a2\u00ee\u00f0\u00f1\2\u0b3e\2\u00cc\3\2\2\2\4\u00cf\3\2\2\2\6\u00d2"+
		"\3\2\2\2\b\u00d5\3\2\2\2\n\u00d8\3\2\2\2\f\u00db\3\2\2\2\16\u0347\3\2"+
		"\2\2\20\u03f3\3\2\2\2\22\u03f5\3\2\2\2\24\u0404\3\2\2\2\26\u0410\3\2\2"+
		"\2\30\u041d\3\2\2\2\32\u0421\3\2\2\2\34\u0455\3\2\2\2\36\u0457\3\2\2\2"+
		" \u045b\3\2\2\2\"\u0467\3\2\2\2$\u0471\3\2\2\2&\u0473\3\2\2\2(\u047b\3"+
		"\2\2\2*\u0484\3\2\2\2,\u048c\3\2\2\2.\u048f\3\2\2\2\60\u049a\3\2\2\2\62"+
		"\u04aa\3\2\2\2\64\u04b0\3\2\2\2\66\u04b2\3\2\2\28\u04bd\3\2\2\2:\u04ce"+
		"\3\2\2\2<\u04d5\3\2\2\2>\u04d7\3\2\2\2@\u04dd\3\2\2\2B\u04ec\3\2\2\2D"+
		"\u04f8\3\2\2\2F\u0529\3\2\2\2H\u052e\3\2\2\2J\u0553\3\2\2\2L\u0555\3\2"+
		"\2\2N\u05ba\3\2\2\2P\u05bc\3\2\2\2R\u05d6\3\2\2\2T\u05d8\3\2\2\2V\u0616"+
		"\3\2\2\2X\u0625\3\2\2\2Z\u0627\3\2\2\2\\\u0645\3\2\2\2^\u0647\3\2\2\2"+
		"`\u064e\3\2\2\2b\u066e\3\2\2\2d\u0670\3\2\2\2f\u0682\3\2\2\2h\u069a\3"+
		"\2\2\2j\u06aa\3\2\2\2l\u06ac\3\2\2\2n\u06cb\3\2\2\2p\u06cd\3\2\2\2r\u06d1"+
		"\3\2\2\2t\u06d9\3\2\2\2v\u06e4\3\2\2\2x\u06e8\3\2\2\2z\u06f3\3\2\2\2|"+
		"\u0710\3\2\2\2~\u0712\3\2\2\2\u0080\u071d\3\2\2\2\u0082\u0733\3\2\2\2"+
		"\u0084\u0766\3\2\2\2\u0086\u076b\3\2\2\2\u0088\u0772\3\2\2\2\u008a\u0776"+
		"\3\2\2\2\u008c\u0780\3\2\2\2\u008e\u0788\3\2\2\2\u0090\u0796\3\2\2\2\u0092"+
		"\u07d3\3\2\2\2\u0094\u07d9\3\2\2\2\u0096\u0884\3\2\2\2\u0098\u089f\3\2"+
		"\2\2\u009a\u08a1\3\2\2\2\u009c\u08a3\3\2\2\2\u009e\u08a5\3\2\2\2\u00a0"+
		"\u08a7\3\2\2\2\u00a2\u08a9\3\2\2\2\u00a4\u08b0\3\2\2\2\u00a6\u08bb\3\2"+
		"\2\2\u00a8\u08c0\3\2\2\2\u00aa\u08e4\3\2\2\2\u00ac\u08e6\3\2\2\2\u00ae"+
		"\u08ee\3\2\2\2\u00b0\u08f4\3\2\2\2\u00b2\u08fc\3\2\2\2\u00b4\u0903\3\2"+
		"\2\2\u00b6\u0908\3\2\2\2\u00b8\u0911\3\2\2\2\u00ba\u0943\3\2\2\2\u00bc"+
		"\u0955\3\2\2\2\u00be\u095e\3\2\2\2\u00c0\u0960\3\2\2\2\u00c2\u0977\3\2"+
		"\2\2\u00c4\u097c\3\2\2\2\u00c6\u097e\3\2\2\2\u00c8\u099c\3\2\2\2\u00ca"+
		"\u099e\3\2\2\2\u00cc\u00cd\5\16\b\2\u00cd\u00ce\7\2\2\3\u00ce\3\3\2\2"+
		"\2\u00cf\u00d0\5\u008aF\2\u00d0\u00d1\7\2\2\3\u00d1\5\3\2\2\2\u00d2\u00d3"+
		"\5\u0086D\2\u00d3\u00d4\7\2\2\3\u00d4\7\3\2\2\2\u00d5\u00d6\5\u0088E\2"+
		"\u00d6\u00d7\7\2\2\3\u00d7\t\3\2\2\2\u00d8\u00d9\5\u00aaV\2\u00d9\u00da"+
		"\7\2\2\3\u00da\13\3\2\2\2\u00db\u00dc\5\u00acW\2\u00dc\u00dd\7\2\2\3\u00dd"+
		"\r\3\2\2\2\u00de\u0348\5\32\16\2\u00df\u00e0\7d\2\2\u00e0\u0348\5\u00c2"+
		"b\2\u00e1\u00e2\7Q\2\2\u00e2\u00e6\7\u00d1\2\2\u00e3\u00e4\7\u0081\2\2"+
		"\u00e4\u00e5\7\"\2\2\u00e5\u00e7\7$\2\2\u00e6\u00e3\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00eb\5\u00c2b\2\u00e9\u00ea\7t\2\2"+
		"\u00ea\u00ec\7\u00f3\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ee\3\2\2\2\u00ed\u00ef\5\30\r\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3"+
		"\2\2\2\u00ef\u00f3\3\2\2\2\u00f0\u00f1\7O\2\2\u00f1\u00f2\7\u00bc\2\2"+
		"\u00f2\u00f4\5.\30\2\u00f3\u00f0\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u0348"+
		"\3\2\2\2\u00f5\u00f6\7o\2\2\u00f6\u00f7\7\u00d1\2\2\u00f7\u00f8\5\u00c2"+
		"b\2\u00f8\u00f9\7u\2\2\u00f9\u00fa\7\u00bc\2\2\u00fa\u00fb\5.\30\2\u00fb"+
		"\u0348\3\2\2\2\u00fc\u00fd\7g\2\2\u00fd\u0100\7\u00d1\2\2\u00fe\u00ff"+
		"\7\u0081\2\2\u00ff\u0101\7$\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2"+
		"\2\u0101\u0102\3\2\2\2\u0102\u0104\5\u00c2b\2\u0103\u0105\t\2\2\2\u0104"+
		"\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0348\3\2\2\2\u0106\u010b\5\22"+
		"\n\2\u0107\u0108\7\3\2\2\u0108\u0109\5\u00acW\2\u0109\u010a\7\4\2\2\u010a"+
		"\u010c\3\2\2\2\u010b\u0107\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2"+
		"\2\2\u010d\u011b\5,\27\2\u010e\u010f\7\u00b9\2\2\u010f\u011a\5.\30\2\u0110"+
		"\u0111\7\u00d9\2\2\u0111\u0112\7\26\2\2\u0112\u011a\5p9\2\u0113\u011a"+
		"\5\24\13\2\u0114\u011a\5\30\r\2\u0115\u0116\7t\2\2\u0116\u011a\7\u00f3"+
		"\2\2\u0117\u0118\7\u00bb\2\2\u0118\u011a\5.\30\2\u0119\u010e\3\2\2\2\u0119"+
		"\u0110\3\2\2\2\u0119\u0113\3\2\2\2\u0119\u0114\3\2\2\2\u0119\u0115\3\2"+
		"\2\2\u0119\u0117\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u0122\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0120\7\20"+
		"\2\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0123\5\32\16\2\u0122\u011f\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0348\3"+
		"\2\2\2\u0124\u0129\5\22\n\2\u0125\u0126\7\3\2\2\u0126\u0127\5\u00acW\2"+
		"\u0127\u0128\7\4\2\2\u0128\u012a\3\2\2\2\u0129\u0125\3\2\2\2\u0129\u012a"+
		"\3\2\2\2\u012a\u013c\3\2\2\2\u012b\u012c\7t\2\2\u012c\u013b\7\u00f3\2"+
		"\2\u012d\u012e\7\u00d9\2\2\u012e\u012f\7\26\2\2\u012f\u0130\7\3\2\2\u0130"+
		"\u0131\5\u00acW\2\u0131\u0132\7\4\2\2\u0132\u013b\3\2\2\2\u0133\u013b"+
		"\5\24\13\2\u0134\u013b\5\26\f\2\u0135\u013b\5\u0084C\2\u0136\u013b\5:"+
		"\36\2\u0137\u013b\5\30\r\2\u0138\u0139\7\u00bb\2\2\u0139\u013b\5.\30\2"+
		"\u013a\u012b\3\2\2\2\u013a\u012d\3\2\2\2\u013a\u0133\3\2\2\2\u013a\u0134"+
		"\3\2\2\2\u013a\u0135\3\2\2\2\u013a\u0136\3\2\2\2\u013a\u0137\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013d\u0143\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0141\7\20\2\2\u0140"+
		"\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\5\32"+
		"\16\2\u0143\u0140\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0348\3\2\2\2\u0145"+
		"\u0146\7Q\2\2\u0146\u014a\7R\2\2\u0147\u0148\7\u0081\2\2\u0148\u0149\7"+
		"\"\2\2\u0149\u014b\7$\2\2\u014a\u0147\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u014d\5\u0086D\2\u014d\u014e\7&\2\2\u014e\u0150\5"+
		"\u0086D\2\u014f\u0151\5\30\r\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2"+
		"\u0151\u0348\3\2\2\2\u0152\u0153\7\u00f2\2\2\u0153\u0157\7R\2\2\u0154"+
		"\u0155\7\u0081\2\2\u0155\u0156\7\"\2\2\u0156\u0158\7$\2\2\u0157\u0154"+
		"\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\5\u0086D"+
		"\2\u015a\u015c\5 \21\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u0348"+
		"\3\2\2\2\u015d\u015e\7\u00d5\2\2\u015e\u015f\7R\2\2\u015f\u0161\5\u0086"+
		"D\2\u0160\u0162\5 \21\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163\u0164\7\u00d6\2\2\u0164\u0169\7\u00d8\2\2\u0165\u016a"+
		"\5\u00c2b\2\u0166\u0167\7/\2\2\u0167\u0168\7b\2\2\u0168\u016a\5r:\2\u0169"+
		"\u0165\3\2\2\2\u0169\u0166\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0348\3\2"+
		"\2\2\u016b\u016c\7o\2\2\u016c\u016d\7R\2\2\u016d\u016e\5\u0086D\2\u016e"+
		"\u016f\7\17\2\2\u016f\u0170\7b\2\2\u0170\u0171\7\3\2\2\u0171\u0172\5\u00ac"+
		"W\2\u0172\u0173\7\4\2\2\u0173\u0348\3\2\2\2\u0174\u0175\7o\2\2\u0175\u0176"+
		"\t\3\2\2\u0176\u0177\5\u0086D\2\u0177\u0178\7p\2\2\u0178\u0179\7l\2\2"+
		"\u0179\u017a\5\u0086D\2\u017a\u0348\3\2\2\2\u017b\u017c\7o\2\2\u017c\u017d"+
		"\t\3\2\2\u017d\u017e\5\u0086D\2\u017e\u017f\7u\2\2\u017f\u0180\7\u00bb"+
		"\2\2\u0180\u0181\5.\30\2\u0181\u0348\3\2\2\2\u0182\u0183\7o\2\2\u0183"+
		"\u0184\t\3\2\2\u0184\u0185\5\u0086D\2\u0185\u0186\7\u00ba\2\2\u0186\u0189"+
		"\7\u00bb\2\2\u0187\u0188\7\u0081\2\2\u0188\u018a\7$\2\2\u0189\u0187\3"+
		"\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\5.\30\2\u018c"+
		"\u0348\3\2\2\2\u018d\u018e\7o\2\2\u018e\u018f\7R\2\2\u018f\u0191\5\u0086"+
		"D\2\u0190\u0192\5 \21\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"\u0193\3\2\2\2\u0193\u0195\7\u00c9\2\2\u0194\u0196\7c\2\2\u0195\u0194"+
		"\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\5\u00c2b"+
		"\2\u0198\u019a\5\u00aeX\2\u0199\u019b\5\u00a8U\2\u019a\u0199\3\2\2\2\u019a"+
		"\u019b\3\2\2\2\u019b\u0348\3\2\2\2\u019c\u019d\7o\2\2\u019d\u019e\7R\2"+
		"\2\u019e\u01a0\5\u0086D\2\u019f\u01a1\5 \21\2\u01a0\u019f\3\2\2\2\u01a0"+
		"\u01a1\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\7u\2\2\u01a3\u01a4\7\u00a2"+
		"\2\2\u01a4\u01a8\7\u00f3\2\2\u01a5\u01a6\7O\2\2\u01a6\u01a7\7\u00a3\2"+
		"\2\u01a7\u01a9\5.\30\2\u01a8\u01a5\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u0348"+
		"\3\2\2\2\u01aa\u01ab\7o\2\2\u01ab\u01ac\7R\2\2\u01ac\u01ae\5\u0086D\2"+
		"\u01ad\u01af\5 \21\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0"+
		"\3\2\2\2\u01b0\u01b1\7u\2\2\u01b1\u01b2\7\u00a3\2\2\u01b2\u01b3\5.\30"+
		"\2\u01b3\u0348\3\2\2\2\u01b4\u01b5\7o\2\2\u01b5\u01b6\7R\2\2\u01b6\u01b7"+
		"\5\u0086D\2\u01b7\u01bb\7\17\2\2\u01b8\u01b9\7\u0081\2\2\u01b9\u01ba\7"+
		"\"\2\2\u01ba\u01bc\7$\2\2\u01bb\u01b8\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\u01be\3\2\2\2\u01bd\u01bf\5\36\20\2\u01be\u01bd\3\2\2\2\u01bf\u01c0\3"+
		"\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u0348\3\2\2\2\u01c2"+
		"\u01c3\7o\2\2\u01c3\u01c4\7T\2\2\u01c4\u01c5\5\u0086D\2\u01c5\u01c9\7"+
		"\17\2\2\u01c6\u01c7\7\u0081\2\2\u01c7\u01c8\7\"\2\2\u01c8\u01ca\7$\2\2"+
		"\u01c9\u01c6\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cc\3\2\2\2\u01cb\u01cd"+
		"\5 \21\2\u01cc\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cf\u0348\3\2\2\2\u01d0\u01d1\7o\2\2\u01d1\u01d2\7R\2"+
		"\2\u01d2\u01d3\5\u0086D\2\u01d3\u01d4\5 \21\2\u01d4\u01d5\7p\2\2\u01d5"+
		"\u01d6\7l\2\2\u01d6\u01d7\5 \21\2\u01d7\u0348\3\2\2\2\u01d8\u01d9\7o\2"+
		"\2\u01d9\u01da\7R\2\2\u01da\u01db\5\u0086D\2\u01db\u01de\7g\2\2\u01dc"+
		"\u01dd\7\u0081\2\2\u01dd\u01df\7$\2\2\u01de\u01dc\3\2\2\2\u01de\u01df"+
		"\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e5\5 \21\2\u01e1\u01e2\7\5\2\2\u01e2"+
		"\u01e4\5 \21\2\u01e3\u01e1\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2"+
		"\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8"+
		"\u01ea\7\u00ce\2\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u0348"+
		"\3\2\2\2\u01eb\u01ec\7o\2\2\u01ec\u01ed\7T\2\2\u01ed\u01ee\5\u0086D\2"+
		"\u01ee\u01f1\7g\2\2\u01ef\u01f0\7\u0081\2\2\u01f0\u01f2\7$\2\2\u01f1\u01ef"+
		"\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f8\5 \21\2\u01f4"+
		"\u01f5\7\5\2\2\u01f5\u01f7\5 \21\2\u01f6\u01f4\3\2\2\2\u01f7\u01fa\3\2"+
		"\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u0348\3\2\2\2\u01fa"+
		"\u01f8\3\2\2\2\u01fb\u01fc\7o\2\2\u01fc\u01fd\7R\2\2\u01fd\u01ff\5\u0086"+
		"D\2\u01fe\u0200\5 \21\2\u01ff\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2\u0200"+
		"\u0201\3\2\2\2\u0201\u0202\7u\2\2\u0202\u0203\5\30\r\2\u0203\u0348\3\2"+
		"\2\2\u0204\u0205\7o\2\2\u0205\u0206\7R\2\2\u0206\u0207\5\u0086D\2\u0207"+
		"\u0208\7\u00e2\2\2\u0208\u0209\7e\2\2\u0209\u0348\3\2\2\2\u020a\u020b"+
		"\7g\2\2\u020b\u020e\7R\2\2\u020c\u020d\7\u0081\2\2\u020d\u020f\7$\2\2"+
		"\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0212"+
		"\5\u0086D\2\u0211\u0213\7\u00ce\2\2\u0212\u0211\3\2\2\2\u0212\u0213\3"+
		"\2\2\2\u0213\u0348\3\2\2\2\u0214\u0215\7g\2\2\u0215\u0218\7T\2\2\u0216"+
		"\u0217\7\u0081\2\2\u0217\u0219\7$\2\2\u0218\u0216\3\2\2\2\u0218\u0219"+
		"\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u0348\5\u0086D\2\u021b\u021e\7Q\2\2"+
		"\u021c\u021d\7\37\2\2\u021d\u021f\7U\2\2\u021e\u021c\3\2\2\2\u021e\u021f"+
		"\3\2\2\2\u021f\u0224\3\2\2\2\u0220\u0222\7\u00b7\2\2\u0221\u0220\3\2\2"+
		"\2\u0221\u0222\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0225\7\u00b8\2\2\u0224"+
		"\u0221\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u022a\7T"+
		"\2\2\u0227\u0228\7\u0081\2\2\u0228\u0229\7\"\2\2\u0229\u022b\7$\2\2\u022a"+
		"\u0227\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022e\5\u0086"+
		"D\2\u022d\u022f\5x=\2\u022e\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0232"+
		"\3\2\2\2\u0230\u0231\7t\2\2\u0231\u0233\7\u00f3\2\2\u0232\u0230\3\2\2"+
		"\2\u0232\u0233\3\2\2\2\u0233\u0237\3\2\2\2\u0234\u0235\7\u00d9\2\2\u0235"+
		"\u0236\7?\2\2\u0236\u0238\5p9\2\u0237\u0234\3\2\2\2\u0237\u0238\3\2\2"+
		"\2\u0238\u023b\3\2\2\2\u0239\u023a\7\u00bb\2\2\u023a\u023c\5.\30\2\u023b"+
		"\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023e\7\20"+
		"\2\2\u023e\u023f\5\32\16\2\u023f\u0348\3\2\2\2\u0240\u0243\7Q\2\2\u0241"+
		"\u0242\7\37\2\2\u0242\u0244\7U\2\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2"+
		"\2\2\u0244\u0246\3\2\2\2\u0245\u0247\7\u00b7\2\2\u0246\u0245\3\2\2\2\u0246"+
		"\u0247\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249\7\u00b8\2\2\u0249\u024a"+
		"\7T\2\2\u024a\u024f\5\u0086D\2\u024b\u024c\7\3\2\2\u024c\u024d\5\u00ac"+
		"W\2\u024d\u024e\7\4\2\2\u024e\u0250\3\2\2\2\u024f\u024b\3\2\2\2\u024f"+
		"\u0250\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0254\5,\27\2\u0252\u0253\7\u00b9"+
		"\2\2\u0253\u0255\5.\30\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255"+
		"\u0348\3\2\2\2\u0256\u0257\7o\2\2\u0257\u0258\7T\2\2\u0258\u025a\5\u0086"+
		"D\2\u0259\u025b\7\20\2\2\u025a\u0259\3\2\2\2\u025a\u025b\3\2\2\2\u025b"+
		"\u025c\3\2\2\2\u025c\u025d\5\32\16\2\u025d\u0348\3\2\2\2\u025e\u0261\7"+
		"Q\2\2\u025f\u0260\7\37\2\2\u0260\u0262\7U\2\2\u0261\u025f\3\2\2\2\u0261"+
		"\u0262\3\2\2\2\u0262\u0264\3\2\2\2\u0263\u0265\7\u00b8\2\2\u0264\u0263"+
		"\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u026a\7\u00af\2"+
		"\2\u0267\u0268\7\u0081\2\2\u0268\u0269\7\"\2\2\u0269\u026b\7$\2\2\u026a"+
		"\u0267\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026d\5\u00c0"+
		"a\2\u026d\u026e\7\20\2\2\u026e\u0278\7\u00f3\2\2\u026f\u0270\7\u00a1\2"+
		"\2\u0270\u0275\5@!\2\u0271\u0272\7\5\2\2\u0272\u0274\5@!\2\u0273\u0271"+
		"\3\2\2\2\u0274\u0277\3\2\2\2\u0275\u0273\3\2\2\2\u0275\u0276\3\2\2\2\u0276"+
		"\u0279\3\2\2\2\u0277\u0275\3\2\2\2\u0278\u026f\3\2\2\2\u0278\u0279\3\2"+
		"\2\2\u0279\u0348\3\2\2\2\u027a\u027c\7g\2\2\u027b\u027d\7\u00b8\2\2\u027c"+
		"\u027b\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0281\7\u00af"+
		"\2\2\u027f\u0280\7\u0081\2\2\u0280\u0282\7$\2\2\u0281\u027f\3\2\2\2\u0281"+
		"\u0282\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0348\5\u00c0a\2\u0284\u0286"+
		"\7Z\2\2\u0285\u0287\t\4\2\2\u0286\u0285\3\2\2\2\u0286\u0287\3\2\2\2\u0287"+
		"\u0288\3\2\2\2\u0288\u0348\5\16\b\2\u0289\u028a\7`\2\2\u028a\u028d\7a"+
		"\2\2\u028b\u028c\t\5\2\2\u028c\u028e\5\u00c2b\2\u028d\u028b\3\2\2\2\u028d"+
		"\u028e\3\2\2\2\u028e\u0293\3\2\2\2\u028f\u0291\7&\2\2\u0290\u028f\3\2"+
		"\2\2\u0290\u0291\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0294\7\u00f3\2\2\u0293"+
		"\u0290\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0348\3\2\2\2\u0295\u0296\7`"+
		"\2\2\u0296\u0297\7R\2\2\u0297\u029a\7\u00b0\2\2\u0298\u0299\t\5\2\2\u0299"+
		"\u029b\5\u00c2b\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029c"+
		"\3\2\2\2\u029c\u029d\7&\2\2\u029d\u029f\7\u00f3\2\2\u029e\u02a0\5 \21"+
		"\2\u029f\u029e\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u0348\3\2\2\2\u02a1\u02a2"+
		"\7`\2\2\u02a2\u02a7\7\u00d2\2\2\u02a3\u02a5\7&\2\2\u02a4\u02a3\3\2\2\2"+
		"\u02a4\u02a5\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a8\7\u00f3\2\2\u02a7"+
		"\u02a4\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u0348\3\2\2\2\u02a9\u02aa\7`"+
		"\2\2\u02aa\u02ab\7\u00bb\2\2\u02ab\u02b0\5\u0086D\2\u02ac\u02ad\7\3\2"+
		"\2\u02ad\u02ae\5\62\32\2\u02ae\u02af\7\4\2\2\u02af\u02b1\3\2\2\2\u02b0"+
		"\u02ac\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u0348\3\2\2\2\u02b2\u02b3\7`"+
		"\2\2\u02b3\u02b4\7b\2\2\u02b4\u02b5\t\5\2\2\u02b5\u02b8\5\u0086D\2\u02b6"+
		"\u02b7\t\5\2\2\u02b7\u02b9\5\u00c2b\2\u02b8\u02b6\3\2\2\2\u02b8\u02b9"+
		"\3\2\2\2\u02b9\u0348\3\2\2\2\u02ba\u02bb\7`\2\2\u02bb\u02bc\7e\2\2\u02bc"+
		"\u02be\5\u0086D\2\u02bd\u02bf\5 \21\2\u02be\u02bd\3\2\2\2\u02be\u02bf"+
		"\3\2\2\2\u02bf\u0348\3\2\2\2\u02c0\u02c2\7`\2\2\u02c1\u02c3\5\u00c2b\2"+
		"\u02c2\u02c1\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02cc"+
		"\7f\2\2\u02c5\u02c7\7&\2\2\u02c6\u02c5\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7"+
		"\u02ca\3\2\2\2\u02c8\u02cb\5\u00c0a\2\u02c9\u02cb\7\u00f3\2\2\u02ca\u02c8"+
		"\3\2\2\2\u02ca\u02c9\3\2\2\2\u02cb\u02cd\3\2\2\2\u02cc\u02c6\3\2\2\2\u02cc"+
		"\u02cd\3\2\2\2\u02cd\u0348\3\2\2\2\u02ce\u02cf\7`\2\2\u02cf\u02d0\7Q\2"+
		"\2\u02d0\u02d1\7R\2\2\u02d1\u0348\5\u0086D\2\u02d2\u02d3\t\6\2\2\u02d3"+
		"\u02d5\7\u00af\2\2\u02d4\u02d6\7\u00b0\2\2\u02d5\u02d4\3\2\2\2\u02d5\u02d6"+
		"\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u0348\5$\23\2\u02d8\u02d9\t\6\2\2\u02d9"+
		"\u02db\7\u00d1\2\2\u02da\u02dc\7\u00b0\2\2\u02db\u02da\3\2\2\2\u02db\u02dc"+
		"\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u0348\5\u00c2b\2\u02de\u02e0\t\6\2"+
		"\2\u02df\u02e1\7R\2\2\u02e0\u02df\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e3"+
		"\3\2\2\2\u02e2\u02e4\t\7\2\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4"+
		"\u02e5\3\2\2\2\u02e5\u02e7\5\u0086D\2\u02e6\u02e8\5 \21\2\u02e7\u02e6"+
		"\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02ea\3\2\2\2\u02e9\u02eb\5&\24\2\u02ea"+
		"\u02e9\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u0348\3\2\2\2\u02ec\u02ed\7\u00b1"+
		"\2\2\u02ed\u02ee\7R\2\2\u02ee\u0348\5\u0086D\2\u02ef\u02f7\7\u00b1\2\2"+
		"\u02f0\u02f8\7\u00f3\2\2\u02f1\u02f3\13\2\2\2\u02f2\u02f1\3\2\2\2\u02f3"+
		"\u02f6\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f5\u02f8\3\2"+
		"\2\2\u02f6\u02f4\3\2\2\2\u02f7\u02f0\3\2\2\2\u02f7\u02f4\3\2\2\2\u02f8"+
		"\u0348\3\2\2\2\u02f9\u02fb\7\u00b3\2\2\u02fa\u02fc\7\u00b5\2\2\u02fb\u02fa"+
		"\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\7R\2\2\u02fe"+
		"\u0303\5\u0086D\2\u02ff\u0301\7\20\2\2\u0300\u02ff\3\2\2\2\u0300\u0301"+
		"\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0304\5\32\16\2\u0303\u0300\3\2\2\2"+
		"\u0303\u0304\3\2\2\2\u0304\u0348\3\2\2\2\u0305\u0306\7\u00b4\2\2\u0306"+
		"\u0309\7R\2\2\u0307\u0308\7\u0081\2\2\u0308\u030a\7$\2\2\u0309\u0307\3"+
		"\2\2\2\u0309\u030a\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u0348\5\u0086D\2"+
		"\u030c\u030d\7\u00b2\2\2\u030d\u0348\7\u00b3\2\2\u030e\u030f\7\u00e5\2"+
		"\2\u030f\u0311\7w\2\2\u0310\u0312\7\u00f0\2\2\u0311\u0310\3\2\2\2\u0311"+
		"\u0312\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0314\7\u00f1\2\2\u0314\u0316"+
		"\7\u00f3\2\2\u0315\u0317\7\u009e\2\2\u0316\u0315\3\2\2\2\u0316\u0317\3"+
		"\2\2\2\u0317\u0318\3\2\2\2\u0318\u0319\7X\2\2\u0319\u031a\7R\2\2\u031a"+
		"\u031c\5\u0086D\2\u031b\u031d\5 \21\2\u031c\u031b\3\2\2\2\u031c\u031d"+
		"\3\2\2\2\u031d\u0348\3\2\2\2\u031e\u031f\7\u00d4\2\2\u031f\u0320\7R\2"+
		"\2\u0320\u0322\5\u0086D\2\u0321\u0323\5 \21\2\u0322\u0321\3\2\2\2\u0322"+
		"\u0323\3\2\2\2\u0323\u0348\3\2\2\2\u0324\u0325\7\u00e0\2\2\u0325\u0326"+
		"\7\u00e1\2\2\u0326\u0327\7R\2\2\u0327\u0348\5\u0086D\2\u0328\u0329\t\b"+
		"\2\2\u0329\u032d\5\u00c2b\2\u032a\u032c\13\2\2\2\u032b\u032a\3\2\2\2\u032c"+
		"\u032f\3\2\2\2\u032d\u032e\3\2\2\2\u032d\u032b\3\2\2\2\u032e\u0348\3\2"+
		"\2\2\u032f\u032d\3\2\2\2\u0330\u0331\7u\2\2\u0331\u0335\7\u00e6\2\2\u0332"+
		"\u0334\13\2\2\2\u0333\u0332\3\2\2\2\u0334\u0337\3\2\2\2\u0335\u0336\3"+
		"\2\2\2\u0335\u0333\3\2\2\2\u0336\u0348\3\2\2\2\u0337\u0335\3\2\2\2\u0338"+
		"\u033c\7u\2\2\u0339\u033b\13\2\2\2\u033a\u0339\3\2\2\2\u033b\u033e\3\2"+
		"\2\2\u033c\u033d\3\2\2\2\u033c\u033a\3\2\2\2\u033d\u0348\3\2\2\2\u033e"+
		"\u033c\3\2\2\2\u033f\u0348\7v\2\2\u0340\u0344\5\20\t\2\u0341\u0343\13"+
		"\2\2\2\u0342\u0341\3\2\2\2\u0343\u0346\3\2\2\2\u0344\u0345\3\2\2\2\u0344"+
		"\u0342\3\2\2\2\u0345\u0348\3\2\2\2\u0346\u0344\3\2\2\2\u0347\u00de\3\2"+
		"\2\2\u0347\u00df\3\2\2\2\u0347\u00e1\3\2\2\2\u0347\u00f5\3\2\2\2\u0347"+
		"\u00fc\3\2\2\2\u0347\u0106\3\2\2\2\u0347\u0124\3\2\2\2\u0347\u0145\3\2"+
		"\2\2\u0347\u0152\3\2\2\2\u0347\u015d\3\2\2\2\u0347\u016b\3\2\2\2\u0347"+
		"\u0174\3\2\2\2\u0347\u017b\3\2\2\2\u0347\u0182\3\2\2\2\u0347\u018d\3\2"+
		"\2\2\u0347\u019c\3\2\2\2\u0347\u01aa\3\2\2\2\u0347\u01b4\3\2\2\2\u0347"+
		"\u01c2\3\2\2\2\u0347\u01d0\3\2\2\2\u0347\u01d8\3\2\2\2\u0347\u01eb\3\2"+
		"\2\2\u0347\u01fb\3\2\2\2\u0347\u0204\3\2\2\2\u0347\u020a\3\2\2\2\u0347"+
		"\u0214\3\2\2\2\u0347\u021b\3\2\2\2\u0347\u0240\3\2\2\2\u0347\u0256\3\2"+
		"\2\2\u0347\u025e\3\2\2\2\u0347\u027a\3\2\2\2\u0347\u0284\3\2\2\2\u0347"+
		"\u0289\3\2\2\2\u0347\u0295\3\2\2\2\u0347\u02a1\3\2\2\2\u0347\u02a9\3\2"+
		"\2\2\u0347\u02b2\3\2\2\2\u0347\u02ba\3\2\2\2\u0347\u02c0\3\2\2\2\u0347"+
		"\u02ce\3\2\2\2\u0347\u02d2\3\2\2\2\u0347\u02d8\3\2\2\2\u0347\u02de\3\2"+
		"\2\2\u0347\u02ec\3\2\2\2\u0347\u02ef\3\2\2\2\u0347\u02f9\3\2\2\2\u0347"+
		"\u0305\3\2\2\2\u0347\u030c\3\2\2\2\u0347\u030e\3\2\2\2\u0347\u031e\3\2"+
		"\2\2\u0347\u0324\3\2\2\2\u0347\u0328\3\2\2\2\u0347\u0330\3\2\2\2\u0347"+
		"\u0338\3\2\2\2\u0347\u033f\3\2\2\2\u0347\u0340\3\2\2\2\u0348\17\3\2\2"+
		"\2\u0349\u034a\7Q\2\2\u034a\u03f4\7\u00e6\2\2\u034b\u034c\7g\2\2\u034c"+
		"\u03f4\7\u00e6\2\2\u034d\u034f\7\u00dd\2\2\u034e\u0350\7\u00e6\2\2\u034f"+
		"\u034e\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u03f4\3\2\2\2\u0351\u0353\7\u00dc"+
		"\2\2\u0352\u0354\7\u00e6\2\2\u0353\u0352\3\2\2\2\u0353\u0354\3\2\2\2\u0354"+
		"\u03f4\3\2\2\2\u0355\u0356\7`\2\2\u0356\u03f4\7\u00dd\2\2\u0357\u0358"+
		"\7`\2\2\u0358\u035a\7\u00e6\2\2\u0359\u035b\7\u00dd\2\2\u035a\u0359\3"+
		"\2\2\2\u035a\u035b\3\2\2\2\u035b\u03f4\3\2\2\2\u035c\u035d\7`\2\2\u035d"+
		"\u03f4\7\u00e9\2\2\u035e\u035f\7`\2\2\u035f\u03f4\7\u00e7\2\2\u0360\u0361"+
		"\7`\2\2\u0361\u0362\7J\2\2\u0362\u03f4\7\u00e7\2\2\u0363\u0364\7\u00e3"+
		"\2\2\u0364\u03f4\7R\2\2\u0365\u0366\7\u00e4\2\2\u0366\u03f4\7R\2\2\u0367"+
		"\u0368\7`\2\2\u0368\u03f4\7\u00e8\2\2\u0369\u036a\7`\2\2\u036a\u036b\7"+
		"Q\2\2\u036b\u03f4\7R\2\2\u036c\u036d\7`\2\2\u036d\u03f4\7\u00ea\2\2\u036e"+
		"\u036f\7`\2\2\u036f\u03f4\7\u00ec\2\2\u0370\u0371\7`\2\2\u0371\u03f4\7"+
		"\u00ed\2\2\u0372\u0373\7Q\2\2\u0373\u03f4\7\u00eb\2\2\u0374\u0375\7g\2"+
		"\2\u0375\u03f4\7\u00eb\2\2\u0376\u0377\7o\2\2\u0377\u03f4\7\u00eb\2\2"+
		"\u0378\u0379\7\u00de\2\2\u0379\u03f4\7R\2\2\u037a\u037b\7\u00de\2\2\u037b"+
		"\u03f4\7\u00d1\2\2\u037c\u037d\7\u00df\2\2\u037d\u03f4\7R\2\2\u037e\u037f"+
		"\7\u00df\2\2\u037f\u03f4\7\u00d1\2\2\u0380\u0381\7Q\2\2\u0381\u0382\7"+
		"\u00b8\2\2\u0382\u03f4\7|\2\2\u0383\u0384\7g\2\2\u0384\u0385\7\u00b8\2"+
		"\2\u0385\u03f4\7|\2\2\u0386\u0387\7o\2\2\u0387\u0388\7R\2\2\u0388\u0389"+
		"\5\u0086D\2\u0389\u038a\7\"\2\2\u038a\u038b\7\u00cc\2\2\u038b\u03f4\3"+
		"\2\2\2\u038c\u038d\7o\2\2\u038d\u038e\7R\2\2\u038e\u038f\5\u0086D\2\u038f"+
		"\u0390\7\u00cc\2\2\u0390\u0391\7\26\2\2\u0391\u03f4\3\2\2\2\u0392\u0393"+
		"\7o\2\2\u0393\u0394\7R\2\2\u0394\u0395\5\u0086D\2\u0395\u0396\7\"\2\2"+
		"\u0396\u0397\7\u00cd\2\2\u0397\u03f4\3\2\2\2\u0398\u0399\7o\2\2\u0399"+
		"\u039a\7R\2\2\u039a\u039b\5\u0086D\2\u039b\u039c\7\u00be\2\2\u039c\u039d"+
		"\7\26\2\2\u039d\u03f4\3\2\2\2\u039e\u039f\7o\2\2\u039f\u03a0\7R\2\2\u03a0"+
		"\u03a1\5\u0086D\2\u03a1\u03a2\7\"\2\2\u03a2\u03a3\7\u00be\2\2\u03a3\u03f4"+
		"\3\2\2\2\u03a4\u03a5\7o\2\2\u03a5\u03a6\7R\2\2\u03a6\u03a7\5\u0086D\2"+
		"\u03a7\u03a8\7\"\2\2\u03a8\u03a9\7\u00bf\2\2\u03a9\u03aa\7\20\2\2\u03aa"+
		"\u03ab\7\u00c0\2\2\u03ab\u03f4\3\2\2\2\u03ac\u03ad\7o\2\2\u03ad\u03ae"+
		"\7R\2\2\u03ae\u03af\5\u0086D\2\u03af\u03b0\7u\2\2\u03b0\u03b1\7\u00be"+
		"\2\2\u03b1\u03b2\7\u00c1\2\2\u03b2\u03f4\3\2\2\2\u03b3\u03b4\7o\2\2\u03b4"+
		"\u03b5\7R\2\2\u03b5\u03b6\5\u0086D\2\u03b6\u03b7\7\u00c2\2\2\u03b7\u03b8"+
		"\7D\2\2\u03b8\u03f4\3\2\2\2\u03b9\u03ba\7o\2\2\u03ba\u03bb\7R\2\2\u03bb"+
		"\u03bc\5\u0086D\2\u03bc\u03bd\7\u00c3\2\2\u03bd\u03be\7D\2\2\u03be\u03f4"+
		"\3\2\2\2\u03bf\u03c0\7o\2\2\u03c0\u03c1\7R\2\2\u03c1\u03c2\5\u0086D\2"+
		"\u03c2\u03c3\7\u00c4\2\2\u03c3\u03c4\7D\2\2\u03c4\u03f4\3\2\2\2\u03c5"+
		"\u03c6\7o\2\2\u03c6\u03c7\7R\2\2\u03c7\u03c8\5\u0086D\2\u03c8\u03c9\7"+
		"\u00c6\2\2\u03c9\u03f4\3\2\2\2\u03ca\u03cb\7o\2\2\u03cb\u03cc\7R\2\2\u03cc"+
		"\u03ce\5\u0086D\2\u03cd\u03cf\5 \21\2\u03ce\u03cd\3\2\2\2\u03ce\u03cf"+
		"\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d1\7\u00c7\2\2\u03d1\u03f4\3\2\2"+
		"\2\u03d2\u03d3\7o\2\2\u03d3\u03d4\7R\2\2\u03d4\u03d6\5\u0086D\2\u03d5"+
		"\u03d7\5 \21\2\u03d6\u03d5\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03d8\3\2"+
		"\2\2\u03d8\u03d9\7\u00c8\2\2\u03d9\u03f4\3\2\2\2\u03da\u03db\7o\2\2\u03db"+
		"\u03dc\7R\2\2\u03dc\u03de\5\u0086D\2\u03dd\u03df\5 \21\2\u03de\u03dd\3"+
		"\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e1\7u\2\2\u03e1"+
		"\u03e2\7\u00c5\2\2\u03e2\u03f4\3\2\2\2\u03e3\u03e4\7o\2\2\u03e4\u03e5"+
		"\7R\2\2\u03e5\u03e7\5\u0086D\2\u03e6\u03e8\5 \21\2\u03e7\u03e6\3\2\2\2"+
		"\u03e7\u03e8\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03ea\7U\2\2\u03ea\u03eb"+
		"\7b\2\2\u03eb\u03f4\3\2\2\2\u03ec\u03ed\7x\2\2\u03ed\u03f4\7y\2\2\u03ee"+
		"\u03f4\7z\2\2\u03ef\u03f4\7{\2\2\u03f0\u03f4\7\u00d3\2\2\u03f1\u03f2\7"+
		"W\2\2\u03f2\u03f4\7\16\2\2\u03f3\u0349\3\2\2\2\u03f3\u034b\3\2\2\2\u03f3"+
		"\u034d\3\2\2\2\u03f3\u0351\3\2\2\2\u03f3\u0355\3\2\2\2\u03f3\u0357\3\2"+
		"\2\2\u03f3\u035c\3\2\2\2\u03f3\u035e\3\2\2\2\u03f3\u0360\3\2\2\2\u03f3"+
		"\u0363\3\2\2\2\u03f3\u0365\3\2\2\2\u03f3\u0367\3\2\2\2\u03f3\u0369\3\2"+
		"\2\2\u03f3\u036c\3\2\2\2\u03f3\u036e\3\2\2\2\u03f3\u0370\3\2\2\2\u03f3"+
		"\u0372\3\2\2\2\u03f3\u0374\3\2\2\2\u03f3\u0376\3\2\2\2\u03f3\u0378\3\2"+
		"\2\2\u03f3\u037a\3\2\2\2\u03f3\u037c\3\2\2\2\u03f3\u037e\3\2\2\2\u03f3"+
		"\u0380\3\2\2\2\u03f3\u0383\3\2\2\2\u03f3\u0386\3\2\2\2\u03f3\u038c\3\2"+
		"\2\2\u03f3\u0392\3\2\2\2\u03f3\u0398\3\2\2\2\u03f3\u039e\3\2\2\2\u03f3"+
		"\u03a4\3\2\2\2\u03f3\u03ac\3\2\2\2\u03f3\u03b3\3\2\2\2\u03f3\u03b9\3\2"+
		"\2\2\u03f3\u03bf\3\2\2\2\u03f3\u03c5\3\2\2\2\u03f3\u03ca\3\2\2\2\u03f3"+
		"\u03d2\3\2\2\2\u03f3\u03da\3\2\2\2\u03f3\u03e3\3\2\2\2\u03f3\u03ec\3\2"+
		"\2\2\u03f3\u03ee\3\2\2\2\u03f3\u03ef\3\2\2\2\u03f3\u03f0\3\2\2\2\u03f3"+
		"\u03f1\3\2\2\2\u03f4\21\3\2\2\2\u03f5\u03f7\7Q\2\2\u03f6\u03f8\7\u00b8"+
		"\2\2\u03f7\u03f6\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03fa\3\2\2\2\u03f9"+
		"\u03fb\7\u00da\2\2\u03fa\u03f9\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03fc"+
		"\3\2\2\2\u03fc\u0400\7R\2\2\u03fd\u03fe\7\u0081\2\2\u03fe\u03ff\7\"\2"+
		"\2\u03ff\u0401\7$\2\2\u0400\u03fd\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0402"+
		"\3\2\2\2\u0402\u0403\5\u0086D\2\u0403\23\3\2\2\2\u0404\u0405\7\u00cc\2"+
		"\2\u0405\u0406\7\26\2\2\u0406\u040a\5p9\2\u0407\u0408\7\u00cd\2\2\u0408"+
		"\u0409\7\26\2\2\u0409\u040b\5t;\2\u040a\u0407\3\2\2\2\u040a\u040b\3\2"+
		"\2\2\u040b\u040c\3\2\2\2\u040c\u040d\7X\2\2\u040d\u040e\7\u00f7\2\2\u040e"+
		"\u040f\7\u00bd\2\2\u040f\25\3\2\2\2\u0410\u0411\7\u00be\2\2\u0411\u0412"+
		"\7\26\2\2\u0412\u0413\5p9\2\u0413\u0416\7?\2\2\u0414\u0417\5\66\34\2\u0415"+
		"\u0417\58\35\2\u0416\u0414\3\2\2\2\u0416\u0415\3\2\2\2\u0417\u041b\3\2"+
		"\2\2\u0418\u0419\7\u00bf\2\2\u0419\u041a\7\20\2\2\u041a\u041c\7\u00c0"+
		"\2\2\u041b\u0418\3\2\2\2\u041b\u041c\3\2\2\2\u041c\27\3\2\2\2\u041d\u041e"+
		"\7\u00c1\2\2\u041e\u041f\7\u00f3\2\2\u041f\31\3\2\2\2\u0420\u0422\5(\25"+
		"\2\u0421\u0420\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u0423\3\2\2\2\u0423\u0424"+
		"\5B\"\2\u0424\33\3\2\2\2\u0425\u0426\7V\2\2\u0426\u0427\7\u009e\2\2\u0427"+
		"\u0428\7R\2\2\u0428\u042f\5\u0086D\2\u0429\u042d\5 \21\2\u042a\u042b\7"+
		"\u0081\2\2\u042b\u042c\7\"\2\2\u042c\u042e\7$\2\2\u042d\u042a\3\2\2\2"+
		"\u042d\u042e\3\2\2\2\u042e\u0430\3\2\2\2\u042f\u0429\3\2\2\2\u042f\u0430"+
		"\3\2\2\2\u0430\u0456\3\2\2\2\u0431\u0432\7V\2\2\u0432\u0434\7X\2\2\u0433"+
		"\u0435\7R\2\2\u0434\u0433\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u0436\3\2"+
		"\2\2\u0436\u0438\5\u0086D\2\u0437\u0439\5 \21\2\u0438\u0437\3\2\2\2\u0438"+
		"\u0439\3\2\2\2\u0439\u0456\3\2\2\2\u043a\u043b\7V\2\2\u043b\u043d\7\u009e"+
		"\2\2\u043c\u043e\7\u00f0\2\2\u043d\u043c\3\2\2\2\u043d\u043e\3\2\2\2\u043e"+
		"\u043f\3\2\2\2\u043f\u0440\7S\2\2\u0440\u0442\7\u00f3\2\2\u0441\u0443"+
		"\5\u0084C\2\u0442\u0441\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u0445\3\2\2"+
		"\2\u0444\u0446\5:\36\2\u0445\u0444\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u0456"+
		"\3\2\2\2\u0447\u0448\7V\2\2\u0448\u044a\7\u009e\2\2\u0449\u044b\7\u00f0"+
		"\2\2\u044a\u0449\3\2\2\2\u044a\u044b\3\2\2\2\u044b\u044c\3\2\2\2\u044c"+
		"\u044e\7S\2\2\u044d\u044f\7\u00f3\2\2\u044e\u044d\3\2\2\2\u044e\u044f"+
		"\3\2\2\2\u044f\u0450\3\2\2\2\u0450\u0453\5,\27\2\u0451\u0452\7\u00b9\2"+
		"\2\u0452\u0454\5.\30\2\u0453\u0451\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0456"+
		"\3\2\2\2\u0455\u0425\3\2\2\2\u0455\u0431\3\2\2\2\u0455\u043a\3\2\2\2\u0455"+
		"\u0447\3\2\2\2\u0456\35\3\2\2\2\u0457\u0459\5 \21\2\u0458\u045a\5\30\r"+
		"\2\u0459\u0458\3\2\2\2\u0459\u045a\3\2\2\2\u045a\37\3\2\2\2\u045b\u045c"+
		"\7D\2\2\u045c\u045d\7\3\2\2\u045d\u0462\5\"\22\2\u045e\u045f\7\5\2\2\u045f"+
		"\u0461\5\"\22\2\u0460\u045e\3\2\2\2\u0461\u0464\3\2\2\2\u0462\u0460\3"+
		"\2\2\2\u0462\u0463\3\2\2\2\u0463\u0465\3\2\2\2\u0464\u0462\3\2\2\2\u0465"+
		"\u0466\7\4\2\2\u0466!\3\2\2\2\u0467\u046a\5\u00c2b\2\u0468\u0469\7\u0084"+
		"\2\2\u0469\u046b\5\u0098M\2\u046a\u0468\3\2\2\2\u046a\u046b\3\2\2\2\u046b"+
		"#\3\2\2\2\u046c\u0472\5\u00c0a\2\u046d\u0472\7\u00f3\2\2\u046e\u0472\5"+
		"\u009aN\2\u046f\u0472\5\u009cO\2\u0470\u0472\5\u009eP\2\u0471\u046c\3"+
		"\2\2\2\u0471\u046d\3\2\2\2\u0471\u046e\3\2\2\2\u0471\u046f\3\2\2\2\u0471"+
		"\u0470\3\2\2\2\u0472%\3\2\2\2\u0473\u0478\5\u00c2b\2\u0474\u0475\7\6\2"+
		"\2\u0475\u0477\5\u00c2b\2\u0476\u0474\3\2\2\2\u0477\u047a\3\2\2\2\u0478"+
		"\u0476\3\2\2\2\u0478\u0479\3\2\2\2\u0479\'\3\2\2\2\u047a\u0478\3\2\2\2"+
		"\u047b\u047c\7O\2\2\u047c\u0481\5*\26\2\u047d\u047e\7\5\2\2\u047e\u0480"+
		"\5*\26\2\u047f\u047d\3\2\2\2\u0480\u0483\3\2\2\2\u0481\u047f\3\2\2\2\u0481"+
		"\u0482\3\2\2\2\u0482)\3\2\2\2\u0483\u0481\3\2\2\2\u0484\u0486\5\u00c2"+
		"b\2\u0485\u0487\7\20\2\2\u0486\u0485\3\2\2\2\u0486\u0487\3\2\2\2\u0487"+
		"\u0488\3\2\2\2\u0488\u0489\7\3\2\2\u0489\u048a\5\32\16\2\u048a\u048b\7"+
		"\4\2\2\u048b+\3\2\2\2\u048c\u048d\7\u00a1\2\2\u048d\u048e\5\u00c0a\2\u048e"+
		"-\3\2\2\2\u048f\u0490\7\3\2\2\u0490\u0495\5\60\31\2\u0491\u0492\7\5\2"+
		"\2\u0492\u0494\5\60\31\2\u0493\u0491\3\2\2\2\u0494\u0497\3\2\2\2\u0495"+
		"\u0493\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u0498\3\2\2\2\u0497\u0495\3\2"+
		"\2\2\u0498\u0499\7\4\2\2\u0499/\3\2\2\2\u049a\u049f\5\62\32\2\u049b\u049d"+
		"\7\u0084\2\2\u049c\u049b\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u049e\3\2\2"+
		"\2\u049e\u04a0\5\64\33\2\u049f\u049c\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0"+
		"\61\3\2\2\2\u04a1\u04a6\5\u00c2b\2\u04a2\u04a3\7\6\2\2\u04a3\u04a5\5\u00c2"+
		"b\2\u04a4\u04a2\3\2\2\2\u04a5\u04a8\3\2\2\2\u04a6\u04a4\3\2\2\2\u04a6"+
		"\u04a7\3\2\2\2\u04a7\u04ab\3\2\2\2\u04a8\u04a6\3\2\2\2\u04a9\u04ab\7\u00f3"+
		"\2\2\u04aa\u04a1\3\2\2\2\u04aa\u04a9\3\2\2\2\u04ab\63\3\2\2\2\u04ac\u04b1"+
		"\7\u00f7\2\2\u04ad\u04b1\7\u00f8\2\2\u04ae\u04b1\5\u00a0Q\2\u04af\u04b1"+
		"\7\u00f3\2\2\u04b0\u04ac\3\2\2\2\u04b0\u04ad\3\2\2\2\u04b0\u04ae\3\2\2"+
		"\2\u04b0\u04af\3\2\2\2\u04b1\65\3\2\2\2\u04b2\u04b3\7\3\2\2\u04b3\u04b8"+
		"\5\u0098M\2\u04b4\u04b5\7\5\2\2\u04b5\u04b7\5\u0098M\2\u04b6\u04b4\3\2"+
		"\2\2\u04b7\u04ba\3\2\2\2\u04b8\u04b6\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9"+
		"\u04bb\3\2\2\2\u04ba\u04b8\3\2\2\2\u04bb\u04bc\7\4\2\2\u04bc\67\3\2\2"+
		"\2\u04bd\u04be\7\3\2\2\u04be\u04c3\5\66\34\2\u04bf\u04c0\7\5\2\2\u04c0"+
		"\u04c2\5\66\34\2\u04c1\u04bf\3\2\2\2\u04c2\u04c5\3\2\2\2\u04c3\u04c1\3"+
		"\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04c6\3\2\2\2\u04c5\u04c3\3\2\2\2\u04c6"+
		"\u04c7\7\4\2\2\u04c79\3\2\2\2\u04c8\u04c9\7\u00bf\2\2\u04c9\u04ca\7\20"+
		"\2\2\u04ca\u04cf\5<\37\2\u04cb\u04cc\7\u00bf\2\2\u04cc\u04cd\7\26\2\2"+
		"\u04cd\u04cf\5> \2\u04ce\u04c8\3\2\2\2\u04ce\u04cb\3\2\2\2\u04cf;\3\2"+
		"\2\2\u04d0\u04d1\7\u00cf\2\2\u04d1\u04d2\7\u00f3\2\2\u04d2\u04d3\7\u00d0"+
		"\2\2\u04d3\u04d6\7\u00f3\2\2\u04d4\u04d6\5\u00c2b\2\u04d5\u04d0\3\2\2"+
		"\2\u04d5\u04d4\3\2\2\2\u04d6=\3\2\2\2\u04d7\u04db\7\u00f3\2\2\u04d8\u04d9"+
		"\7O\2\2\u04d9\u04da\7\u00a3\2\2\u04da\u04dc\5.\30\2\u04db\u04d8\3\2\2"+
		"\2\u04db\u04dc\3\2\2\2\u04dc?\3\2\2\2\u04dd\u04de\5\u00c2b\2\u04de\u04df"+
		"\7\u00f3\2\2\u04dfA\3\2\2\2\u04e0\u04e2\5\34\17\2\u04e1\u04e0\3\2\2\2"+
		"\u04e1\u04e2\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e4\5H%\2\u04e4\u04e5"+
		"\5D#\2\u04e5\u04ed\3\2\2\2\u04e6\u04e8\5T+\2\u04e7\u04e9\5F$\2\u04e8\u04e7"+
		"\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04e8\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb"+
		"\u04ed\3\2\2\2\u04ec\u04e1\3\2\2\2\u04ec\u04e6\3\2\2\2\u04edC\3\2\2\2"+
		"\u04ee\u04ef\7\33\2\2\u04ef\u04f0\7\26\2\2\u04f0\u04f5\5L\'\2\u04f1\u04f2"+
		"\7\5\2\2\u04f2\u04f4\5L\'\2\u04f3\u04f1\3\2\2\2\u04f4\u04f7\3\2\2\2\u04f5"+
		"\u04f3\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04f9\3\2\2\2\u04f7\u04f5\3\2"+
		"\2\2\u04f8\u04ee\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9\u0504\3\2\2\2\u04fa"+
		"\u04fb\7\u009c\2\2\u04fb\u04fc\7\26\2\2\u04fc\u0501\5\u008eH\2\u04fd\u04fe"+
		"\7\5\2\2\u04fe\u0500\5\u008eH\2\u04ff\u04fd\3\2\2\2\u0500\u0503\3\2\2"+
		"\2\u0501\u04ff\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0505\3\2\2\2\u0503\u0501"+
		"\3\2\2\2\u0504\u04fa\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0510\3\2\2\2\u0506"+
		"\u0507\7\u009d\2\2\u0507\u0508\7\26\2\2\u0508\u050d\5\u008eH\2\u0509\u050a"+
		"\7\5\2\2\u050a\u050c\5\u008eH\2\u050b\u0509\3\2\2\2\u050c\u050f\3\2\2"+
		"\2\u050d\u050b\3\2\2\2\u050d\u050e\3\2\2\2\u050e\u0511\3\2\2\2\u050f\u050d"+
		"\3\2\2\2\u0510\u0506\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u051c\3\2\2\2\u0512"+
		"\u0513\7\u009b\2\2\u0513\u0514\7\26\2\2\u0514\u0519\5L\'\2\u0515\u0516"+
		"\7\5\2\2\u0516\u0518\5L\'\2\u0517\u0515\3\2\2\2\u0518\u051b\3\2\2\2\u0519"+
		"\u0517\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051d\3\2\2\2\u051b\u0519\3\2"+
		"\2\2\u051c\u0512\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u051f\3\2\2\2\u051e"+
		"\u0520\5\u00b6\\\2\u051f\u051e\3\2\2\2\u051f\u0520\3\2\2\2\u0520\u0526"+
		"\3\2\2\2\u0521\u0524\7\35\2\2\u0522\u0525\7\21\2\2\u0523\u0525\5\u008e"+
		"H\2\u0524\u0522\3\2\2\2\u0524\u0523\3\2\2\2\u0525\u0527\3\2\2\2\u0526"+
		"\u0521\3\2\2\2\u0526\u0527\3\2\2\2\u0527E\3\2\2\2\u0528\u052a\5\34\17"+
		"\2\u0529\u0528\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u052c"+
		"\5N(\2\u052c\u052d\5D#\2\u052dG\3\2\2\2\u052e\u052f\b%\1\2\u052f\u0530"+
		"\5J&\2\u0530\u0548\3\2\2\2\u0531\u0532\f\5\2\2\u0532\u0533\6%\3\2\u0533"+
		"\u0535\t\t\2\2\u0534\u0536\5b\62\2\u0535\u0534\3\2\2\2\u0535\u0536\3\2"+
		"\2\2\u0536\u0537\3\2\2\2\u0537\u0547\5H%\6\u0538\u0539\f\4\2\2\u0539\u053a"+
		"\6%\5\2\u053a\u053c\7k\2\2\u053b\u053d\5b\62\2\u053c\u053b\3\2\2\2\u053c"+
		"\u053d\3\2\2\2\u053d\u053e\3\2\2\2\u053e\u0547\5H%\5\u053f\u0540\f\3\2"+
		"\2\u0540\u0541\6%\7\2\u0541\u0543\t\n\2\2\u0542\u0544\5b\62\2\u0543\u0542"+
		"\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0547\5H%\4\u0546"+
		"\u0531\3\2\2\2\u0546\u0538\3\2\2\2\u0546\u053f\3\2\2\2\u0547\u054a\3\2"+
		"\2\2\u0548\u0546\3\2\2\2\u0548\u0549\3\2\2\2\u0549I\3\2\2\2\u054a\u0548"+
		"\3\2\2\2\u054b\u0554\5N(\2\u054c\u054d\7R\2\2\u054d\u0554\5\u0086D\2\u054e"+
		"\u0554\5~@\2\u054f\u0550\7\3\2\2\u0550\u0551\5B\"\2\u0551\u0552\7\4\2"+
		"\2\u0552\u0554\3\2\2\2\u0553\u054b\3\2\2\2\u0553\u054c\3\2\2\2\u0553\u054e"+
		"\3\2\2\2\u0553\u054f\3\2\2\2\u0554K\3\2\2\2\u0555\u0557\5\u008eH\2\u0556"+
		"\u0558\t\13\2\2\u0557\u0556\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u055b\3"+
		"\2\2\2\u0559\u055a\7,\2\2\u055a\u055c\t\f\2\2\u055b\u0559\3\2\2\2\u055b"+
		"\u055c\3\2\2\2\u055cM\3\2\2\2\u055d\u055e\7\r\2\2\u055e\u055f\7\u009f"+
		"\2\2\u055f\u0560\7\3\2\2\u0560\u0561\5\u008cG\2\u0561\u0562\7\4\2\2\u0562"+
		"\u0568\3\2\2\2\u0563\u0564\7r\2\2\u0564\u0568\5\u008cG\2\u0565\u0566\7"+
		"\u00a0\2\2\u0566\u0568\5\u008cG\2\u0567\u055d\3\2\2\2\u0567\u0563\3\2"+
		"\2\2\u0567\u0565\3\2\2\2\u0568\u056a\3\2\2\2\u0569\u056b\5\u0084C\2\u056a"+
		"\u0569\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u056e\3\2\2\2\u056c\u056d\7\u00a5"+
		"\2\2\u056d\u056f\7\u00f3\2\2\u056e\u056c\3\2\2\2\u056e\u056f\3\2\2\2\u056f"+
		"\u0570\3\2\2\2\u0570\u0571\7\u00a1\2\2\u0571\u057e\7\u00f3\2\2\u0572\u057c"+
		"\7\20\2\2\u0573\u057d\5r:\2\u0574\u057d\5\u00acW\2\u0575\u0578\7\3\2\2"+
		"\u0576\u0579\5r:\2\u0577\u0579\5\u00acW\2\u0578\u0576\3\2\2\2\u0578\u0577"+
		"\3\2\2\2\u0579\u057a\3\2\2\2\u057a\u057b\7\4\2\2\u057b\u057d\3\2\2\2\u057c"+
		"\u0573\3\2\2\2\u057c\u0574\3\2\2\2\u057c\u0575\3\2\2\2\u057d\u057f\3\2"+
		"\2\2\u057e\u0572\3\2\2\2\u057e\u057f\3\2\2\2\u057f\u0581\3\2\2\2\u0580"+
		"\u0582\5\u0084C\2\u0581\u0580\3\2\2\2\u0581\u0582\3\2\2\2\u0582\u0585"+
		"\3\2\2\2\u0583\u0584\7\u00a4\2\2\u0584\u0586\7\u00f3\2\2\u0585\u0583\3"+
		"\2\2\2\u0585\u0586\3\2\2\2\u0586\u0588\3\2\2\2\u0587\u0589\5T+\2\u0588"+
		"\u0587\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u058c\3\2\2\2\u058a\u058b\7\24"+
		"\2\2\u058b\u058d\5\u0090I\2\u058c\u058a\3\2\2\2\u058c\u058d\3\2\2\2\u058d"+
		"\u05bb\3\2\2\2\u058e\u0592\7\r\2\2\u058f\u0591\5P)\2\u0590\u058f\3\2\2"+
		"\2\u0591\u0594\3\2\2\2\u0592\u0590\3\2\2\2\u0592\u0593\3\2\2\2\u0593\u0596"+
		"\3\2\2\2\u0594\u0592\3\2\2\2\u0595\u0597\5b\62\2\u0596\u0595\3\2\2\2\u0596"+
		"\u0597\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u059a\5\u008cG\2\u0599\u059b"+
		"\5T+\2\u059a\u0599\3\2\2\2\u059a\u059b\3\2\2\2\u059b\u05a5\3\2\2\2\u059c"+
		"\u05a2\5T+\2\u059d\u059f\7\r\2\2\u059e\u05a0\5b\62\2\u059f\u059e\3\2\2"+
		"\2\u059f\u05a0\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1\u05a3\5\u008cG\2\u05a2"+
		"\u059d\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a5\3\2\2\2\u05a4\u058e\3\2"+
		"\2\2\u05a4\u059c\3\2\2\2\u05a5\u05a9\3\2\2\2\u05a6\u05a8\5`\61\2\u05a7"+
		"\u05a6\3\2\2\2\u05a8\u05ab\3\2\2\2\u05a9\u05a7\3\2\2\2\u05a9\u05aa\3\2"+
		"\2\2\u05aa\u05ae\3\2\2\2\u05ab\u05a9\3\2\2\2\u05ac\u05ad\7\24\2\2\u05ad"+
		"\u05af\5\u0090I\2\u05ae\u05ac\3\2\2\2\u05ae\u05af\3\2\2\2\u05af\u05b1"+
		"\3\2\2\2\u05b0\u05b2\5V,\2\u05b1\u05b0\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2"+
		"\u05b5\3\2\2\2\u05b3\u05b4\7\34\2\2\u05b4\u05b6\5\u0090I\2\u05b5\u05b3"+
		"\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6\u05b8\3\2\2\2\u05b7\u05b9\5\u00b6\\"+
		"\2\u05b8\u05b7\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9\u05bb\3\2\2\2\u05ba\u0567"+
		"\3\2\2\2\u05ba\u05a4\3\2\2\2\u05bbO\3\2\2\2\u05bc\u05bd\7\7\2\2\u05bd"+
		"\u05c4\5R*\2\u05be\u05c0\7\5\2\2\u05bf\u05be\3\2\2\2\u05bf\u05c0\3\2\2"+
		"\2\u05c0\u05c1\3\2\2\2\u05c1\u05c3\5R*\2\u05c2\u05bf\3\2\2\2\u05c3\u05c6"+
		"\3\2\2\2\u05c4\u05c2\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u05c7\3\2\2\2\u05c6"+
		"\u05c4\3\2\2\2\u05c7\u05c8\7\b\2\2\u05c8Q\3\2\2\2\u05c9\u05d7\5\u00c2"+
		"b\2\u05ca\u05cb\5\u00c2b\2\u05cb\u05cc\7\3\2\2\u05cc\u05d1\5\u0096L\2"+
		"\u05cd\u05ce\7\5\2\2\u05ce\u05d0\5\u0096L\2\u05cf\u05cd\3\2\2\2\u05d0"+
		"\u05d3\3\2\2\2\u05d1\u05cf\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\u05d4\3\2"+
		"\2\2\u05d3\u05d1\3\2\2\2\u05d4\u05d5\7\4\2\2\u05d5\u05d7\3\2\2\2\u05d6"+
		"\u05c9\3\2\2\2\u05d6\u05ca\3\2\2\2\u05d7S\3\2\2\2\u05d8\u05d9\7\16\2\2"+
		"\u05d9\u05de\5d\63\2\u05da\u05db\7\5\2\2\u05db\u05dd\5d\63\2\u05dc\u05da"+
		"\3\2\2\2\u05dd\u05e0\3\2\2\2\u05de\u05dc\3\2\2\2\u05de\u05df\3\2\2\2\u05df"+
		"\u05e4\3\2\2\2\u05e0\u05de\3\2\2\2\u05e1\u05e3\5`\61\2\u05e2\u05e1\3\2"+
		"\2\2\u05e3\u05e6\3\2\2\2\u05e4\u05e2\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5"+
		"\u05e8\3\2\2\2\u05e6\u05e4\3\2\2\2\u05e7\u05e9\5Z.\2\u05e8\u05e7\3\2\2"+
		"\2\u05e8\u05e9\3\2\2\2\u05e9U\3\2\2\2\u05ea\u05eb\7\25\2\2\u05eb\u05ec"+
		"\7\26\2\2\u05ec\u05f1\5\u008eH\2\u05ed\u05ee\7\5\2\2\u05ee\u05f0\5\u008e"+
		"H\2\u05ef\u05ed\3\2\2\2\u05f0\u05f3\3\2\2\2\u05f1\u05ef\3\2\2\2\u05f1"+
		"\u05f2\3\2\2\2\u05f2\u0605\3\2\2\2\u05f3\u05f1\3\2\2\2\u05f4\u05f5\7O"+
		"\2\2\u05f5\u0606\7\32\2\2\u05f6\u05f7\7O\2\2\u05f7\u0606\7\31\2\2\u05f8"+
		"\u05f9\7\27\2\2\u05f9\u05fa\7\30\2\2\u05fa\u05fb\7\3\2\2\u05fb\u0600\5"+
		"X-\2\u05fc\u05fd\7\5\2\2\u05fd\u05ff\5X-\2\u05fe\u05fc\3\2\2\2\u05ff\u0602"+
		"\3\2\2\2\u0600\u05fe\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u0603\3\2\2\2\u0602"+
		"\u0600\3\2\2\2\u0603\u0604\7\4\2\2\u0604\u0606\3\2\2\2\u0605\u05f4\3\2"+
		"\2\2\u0605\u05f6\3\2\2\2\u0605\u05f8\3\2\2\2\u0605\u0606\3\2\2\2\u0606"+
		"\u0617\3\2\2\2\u0607\u0608\7\25\2\2\u0608\u0609\7\26\2\2\u0609\u060a\7"+
		"\27\2\2\u060a\u060b\7\30\2\2\u060b\u060c\7\3\2\2\u060c\u0611\5X-\2\u060d"+
		"\u060e\7\5\2\2\u060e\u0610\5X-\2\u060f\u060d\3\2\2\2\u0610\u0613\3\2\2"+
		"\2\u0611\u060f\3\2\2\2\u0611\u0612\3\2\2\2\u0612\u0614\3\2\2\2\u0613\u0611"+
		"\3\2\2\2\u0614\u0615\7\4\2\2\u0615\u0617\3\2\2\2\u0616\u05ea\3\2\2\2\u0616"+
		"\u0607\3\2\2\2\u0617W\3\2\2\2\u0618\u0621\7\3\2\2\u0619\u061e\5\u008e"+
		"H\2\u061a\u061b\7\5\2\2\u061b\u061d\5\u008eH\2\u061c\u061a\3\2\2\2\u061d"+
		"\u0620\3\2\2\2\u061e\u061c\3\2\2\2\u061e\u061f\3\2\2\2\u061f\u0622\3\2"+
		"\2\2\u0620\u061e\3\2\2\2\u0621\u0619\3\2\2\2\u0621\u0622\3\2\2\2\u0622"+
		"\u0623\3\2\2\2\u0623\u0626\7\4\2\2\u0624\u0626\5\u008eH\2\u0625\u0618"+
		"\3\2\2\2\u0625\u0624\3\2\2\2\u0626Y\3\2\2\2\u0627\u0628\7@\2\2\u0628\u0629"+
		"\7\3\2\2\u0629\u062a\5\u008cG\2\u062a\u062b\7/\2\2\u062b\u062c\5\\/\2"+
		"\u062c\u062d\7!\2\2\u062d\u062e\7\3\2\2\u062e\u0633\5^\60\2\u062f\u0630"+
		"\7\5\2\2\u0630\u0632\5^\60\2\u0631\u062f\3\2\2\2\u0632\u0635\3\2\2\2\u0633"+
		"\u0631\3\2\2\2\u0633\u0634\3\2\2\2\u0634\u0636\3\2\2\2\u0635\u0633\3\2"+
		"\2\2\u0636\u0637\7\4\2\2\u0637\u0638\7\4\2\2\u0638[\3\2\2\2\u0639\u0646"+
		"\5\u00c2b\2\u063a\u063b\7\3\2\2\u063b\u0640\5\u00c2b\2\u063c\u063d\7\5"+
		"\2\2\u063d\u063f\5\u00c2b\2\u063e\u063c\3\2\2\2\u063f\u0642\3\2\2\2\u0640"+
		"\u063e\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u0643\3\2\2\2\u0642\u0640\3\2"+
		"\2\2\u0643\u0644\7\4\2\2\u0644\u0646\3\2\2\2\u0645\u0639\3\2\2\2\u0645"+
		"\u063a\3\2\2\2\u0646]\3\2\2\2\u0647\u064c\5\u008eH\2\u0648\u064a\7\20"+
		"\2\2\u0649\u0648\3\2\2\2\u0649\u064a\3\2\2\2\u064a\u064b\3\2\2\2\u064b"+
		"\u064d\5\u00c2b\2\u064c\u0649\3\2\2\2\u064c\u064d\3\2\2\2\u064d_\3\2\2"+
		"\2\u064e\u064f\7A\2\2\u064f\u0651\7T\2\2\u0650\u0652\78\2\2\u0651\u0650"+
		"\3\2\2\2\u0651\u0652\3\2\2\2\u0652\u0653\3\2\2\2\u0653\u0654\5\u00c0a"+
		"\2\u0654\u065d\7\3\2\2\u0655\u065a\5\u008eH\2\u0656\u0657\7\5\2\2\u0657"+
		"\u0659\5\u008eH\2\u0658\u0656\3\2\2\2\u0659\u065c\3\2\2\2\u065a\u0658"+
		"\3\2\2\2\u065a\u065b\3\2\2\2\u065b\u065e\3\2\2\2\u065c\u065a\3\2\2\2\u065d"+
		"\u0655\3\2\2\2\u065d\u065e\3\2\2\2\u065e\u065f\3\2\2\2\u065f\u0660\7\4"+
		"\2\2\u0660\u066c\5\u00c2b\2\u0661\u0663\7\20\2\2\u0662\u0661\3\2\2\2\u0662"+
		"\u0663\3\2\2\2\u0663\u0664\3\2\2\2\u0664\u0669\5\u00c2b\2\u0665\u0666"+
		"\7\5\2\2\u0666\u0668\5\u00c2b\2\u0667\u0665\3\2\2\2\u0668\u066b\3\2\2"+
		"\2\u0669\u0667\3\2\2\2\u0669\u066a\3\2\2\2\u066a\u066d\3\2\2\2\u066b\u0669"+
		"\3\2\2\2\u066c\u0662\3\2\2\2\u066c\u066d\3\2\2\2\u066da\3\2\2\2\u066e"+
		"\u066f\t\r\2\2\u066fc\3\2\2\2\u0670\u0674\5|?\2\u0671\u0673\5f\64\2\u0672"+
		"\u0671\3\2\2\2\u0673\u0676\3\2\2\2\u0674\u0672\3\2\2\2\u0674\u0675\3\2"+
		"\2\2\u0675e\3\2\2\2\u0676\u0674\3\2\2\2\u0677\u0678\5h\65\2\u0678\u0679"+
		"\7\66\2\2\u0679\u067b\5|?\2\u067a\u067c\5j\66\2\u067b\u067a\3\2\2\2\u067b"+
		"\u067c\3\2\2\2\u067c\u0683\3\2\2\2\u067d\u067e\7>\2\2\u067e\u067f\5h\65"+
		"\2\u067f\u0680\7\66\2\2\u0680\u0681\5|?\2\u0681\u0683\3\2\2\2\u0682\u0677"+
		"\3\2\2\2\u0682\u067d\3\2\2\2\u0683g\3\2\2\2\u0684\u0686\79\2\2\u0685\u0684"+
		"\3\2\2\2\u0685\u0686\3\2\2\2\u0686\u069b\3\2\2\2\u0687\u069b\7\67\2\2"+
		"\u0688\u068a\7:\2\2\u0689\u068b\78\2\2\u068a\u0689\3\2\2\2\u068a\u068b"+
		"\3\2\2\2\u068b\u069b\3\2\2\2\u068c\u068d\7:\2\2\u068d\u069b\7;\2\2\u068e"+
		"\u0690\7<\2\2\u068f\u0691\78\2\2\u0690\u068f\3\2\2\2\u0690\u0691\3\2\2"+
		"\2\u0691\u069b\3\2\2\2\u0692\u0694\7=\2\2\u0693\u0695\78\2\2\u0694\u0693"+
		"\3\2\2\2\u0694\u0695\3\2\2\2\u0695\u069b\3\2\2\2\u0696\u0698\7:\2\2\u0697"+
		"\u0696\3\2\2\2\u0697\u0698\3\2\2\2\u0698\u0699\3\2\2\2\u0699\u069b\7\u00ef"+
		"\2\2\u069a\u0685\3\2\2\2\u069a\u0687\3\2\2\2\u069a\u0688\3\2\2\2\u069a"+
		"\u068c\3\2\2\2\u069a\u068e\3\2\2\2\u069a\u0692\3\2\2\2\u069a\u0697\3\2"+
		"\2\2\u069bi\3\2\2\2\u069c\u069d\7?\2\2\u069d\u06ab\5\u0090I\2\u069e\u069f"+
		"\7\u00a1\2\2\u069f\u06a0\7\3\2\2\u06a0\u06a5\5\u00c2b\2\u06a1\u06a2\7"+
		"\5\2\2\u06a2\u06a4\5\u00c2b\2\u06a3\u06a1\3\2\2\2\u06a4\u06a7\3\2\2\2"+
		"\u06a5\u06a3\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6\u06a8\3\2\2\2\u06a7\u06a5"+
		"\3\2\2\2\u06a8\u06a9\7\4\2\2\u06a9\u06ab\3\2\2\2\u06aa\u069c\3\2\2\2\u06aa"+
		"\u069e\3\2\2\2\u06abk\3\2\2\2\u06ac\u06ad\7m\2\2\u06ad\u06af\7\3\2\2\u06ae"+
		"\u06b0\5n8\2\u06af\u06ae\3\2\2\2\u06af\u06b0\3\2\2\2\u06b0\u06b1\3\2\2"+
		"\2\u06b1\u06b2\7\4\2\2\u06b2m\3\2\2\2\u06b3\u06b5\7\u008d\2\2\u06b4\u06b3"+
		"\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06b6\3\2\2\2\u06b6\u06b7\t\16\2\2"+
		"\u06b7\u06cc\7\u0097\2\2\u06b8\u06b9\5\u008eH\2\u06b9\u06ba\7F\2\2\u06ba"+
		"\u06cc\3\2\2\2\u06bb\u06bc\7\u0098\2\2\u06bc\u06bd\7\u00f7\2\2\u06bd\u06be"+
		"\7\u0099\2\2\u06be\u06bf\7\u009a\2\2\u06bf\u06c8\7\u00f7\2\2\u06c0\u06c6"+
		"\7?\2\2\u06c1\u06c7\5\u00c2b\2\u06c2\u06c3\5\u00c0a\2\u06c3\u06c4\7\3"+
		"\2\2\u06c4\u06c5\7\4\2\2\u06c5\u06c7\3\2\2\2\u06c6\u06c1\3\2\2\2\u06c6"+
		"\u06c2\3\2\2\2\u06c7\u06c9\3\2\2\2\u06c8\u06c0\3\2\2\2\u06c8\u06c9\3\2"+
		"\2\2\u06c9\u06cc\3\2\2\2\u06ca\u06cc\5\u008eH\2\u06cb\u06b4\3\2\2\2\u06cb"+
		"\u06b8\3\2\2\2\u06cb\u06bb\3\2\2\2\u06cb\u06ca\3\2\2\2\u06cco\3\2\2\2"+
		"\u06cd\u06ce\7\3\2\2\u06ce\u06cf\5r:\2\u06cf\u06d0\7\4\2\2\u06d0q\3\2"+
		"\2\2\u06d1\u06d6\5\u00c2b\2\u06d2\u06d3\7\5\2\2\u06d3\u06d5\5\u00c2b\2"+
		"\u06d4\u06d2\3\2\2\2\u06d5\u06d8\3\2\2\2\u06d6\u06d4\3\2\2\2\u06d6\u06d7"+
		"\3\2\2\2\u06d7s\3\2\2\2\u06d8\u06d6\3\2\2\2\u06d9\u06da\7\3\2\2\u06da"+
		"\u06df\5v<\2\u06db\u06dc\7\5\2\2\u06dc\u06de\5v<\2\u06dd\u06db\3\2\2\2"+
		"\u06de\u06e1\3\2\2\2\u06df\u06dd\3\2\2\2\u06df\u06e0\3\2\2\2\u06e0\u06e2"+
		"\3\2\2\2\u06e1\u06df\3\2\2\2\u06e2\u06e3\7\4\2\2\u06e3u\3\2\2\2\u06e4"+
		"\u06e6\5\u00c2b\2\u06e5\u06e7\t\13\2\2\u06e6\u06e5\3\2\2\2\u06e6\u06e7"+
		"\3\2\2\2\u06e7w\3\2\2\2\u06e8\u06e9\7\3\2\2\u06e9\u06ee\5z>\2\u06ea\u06eb"+
		"\7\5\2\2\u06eb\u06ed\5z>\2\u06ec\u06ea\3\2\2\2\u06ed\u06f0\3\2\2\2\u06ee"+
		"\u06ec\3\2\2\2\u06ee\u06ef\3\2\2\2\u06ef\u06f1\3\2\2\2\u06f0\u06ee\3\2"+
		"\2\2\u06f1\u06f2\7\4\2\2\u06f2y\3\2\2\2\u06f3\u06f6\5\u00c2b\2\u06f4\u06f5"+
		"\7t\2\2\u06f5\u06f7\7\u00f3\2\2\u06f6\u06f4\3\2\2\2\u06f6\u06f7\3\2\2"+
		"\2\u06f7{\3\2\2\2\u06f8\u06fa\5\u0086D\2\u06f9\u06fb\5l\67\2\u06fa\u06f9"+
		"\3\2\2\2\u06fa\u06fb\3\2\2\2\u06fb\u06fc\3\2\2\2\u06fc\u06fd\5\u0082B"+
		"\2\u06fd\u0711\3\2\2\2\u06fe\u06ff\7\3\2\2\u06ff\u0700\5B\"\2\u0700\u0702"+
		"\7\4\2\2\u0701\u0703\5l\67\2\u0702\u0701\3\2\2\2\u0702\u0703\3\2\2\2\u0703"+
		"\u0704\3\2\2\2\u0704\u0705\5\u0082B\2\u0705\u0711\3\2\2\2\u0706\u0707"+
		"\7\3\2\2\u0707\u0708\5d\63\2\u0708\u070a\7\4\2\2\u0709\u070b\5l\67\2\u070a"+
		"\u0709\3\2\2\2\u070a\u070b\3\2\2\2\u070b\u070c\3\2\2\2\u070c\u070d\5\u0082"+
		"B\2\u070d\u0711\3\2\2\2\u070e\u0711\5~@\2\u070f\u0711\5\u0080A\2\u0710"+
		"\u06f8\3\2\2\2\u0710\u06fe\3\2\2\2\u0710\u0706\3\2\2\2\u0710\u070e\3\2"+
		"\2\2\u0710\u070f\3\2\2\2\u0711}\3\2\2\2\u0712\u0713\7P\2\2\u0713\u0718"+
		"\5\u008eH\2\u0714\u0715\7\5\2\2\u0715\u0717\5\u008eH\2\u0716\u0714\3\2"+
		"\2\2\u0717\u071a\3\2\2\2\u0718\u0716\3\2\2\2\u0718\u0719\3\2\2\2\u0719"+
		"\u071b\3\2\2\2\u071a\u0718\3\2\2\2\u071b\u071c\5\u0082B\2\u071c\177\3"+
		"\2\2\2\u071d\u071e\5\u00c2b\2\u071e\u0727\7\3\2\2\u071f\u0724\5\u008e"+
		"H\2\u0720\u0721\7\5\2\2\u0721\u0723\5\u008eH\2\u0722\u0720\3\2\2\2\u0723"+
		"\u0726\3\2\2\2\u0724\u0722\3\2\2\2\u0724\u0725\3\2\2\2\u0725\u0728\3\2"+
		"\2\2\u0726\u0724\3\2\2\2\u0727\u071f\3\2\2\2\u0727\u0728\3\2\2\2\u0728"+
		"\u0729\3\2\2\2\u0729\u072a\7\4\2\2\u072a\u072b\5\u0082B\2\u072b\u0081"+
		"\3\2\2\2\u072c\u072e\7\20\2\2\u072d\u072c\3\2\2\2\u072d\u072e\3\2\2\2"+
		"\u072e\u072f\3\2\2\2\u072f\u0731\5\u00c4c\2\u0730\u0732\5p9\2\u0731\u0730"+
		"\3\2\2\2\u0731\u0732\3\2\2\2\u0732\u0734\3\2\2\2\u0733\u072d\3\2\2\2\u0733"+
		"\u0734\3\2\2\2\u0734\u0083\3\2\2\2\u0735\u0736\7N\2\2\u0736\u0737\7[\2"+
		"\2\u0737\u0738\7\u00a2\2\2\u0738\u073c\7\u00f3\2\2\u0739\u073a\7O\2\2"+
		"\u073a\u073b\7\u00a3\2\2\u073b\u073d\5.\30\2\u073c\u0739\3\2\2\2\u073c"+
		"\u073d\3\2\2\2\u073d\u0767\3\2\2\2\u073e\u073f\7N\2\2\u073f\u0740\7[\2"+
		"\2\u0740\u074a\7\u00a6\2\2\u0741\u0742\7\u00a7\2\2\u0742\u0743\7\u00a8"+
		"\2\2\u0743\u0744\7\26\2\2\u0744\u0748\7\u00f3\2\2\u0745\u0746\7\u00ac"+
		"\2\2\u0746\u0747\7\26\2\2\u0747\u0749\7\u00f3\2\2\u0748\u0745\3\2\2\2"+
		"\u0748\u0749\3\2\2\2\u0749\u074b\3\2\2\2\u074a\u0741\3\2\2\2\u074a\u074b"+
		"\3\2\2\2\u074b\u0751\3\2\2\2\u074c\u074d\7\u00a9\2\2\u074d\u074e\7\u00aa"+
		"\2\2\u074e\u074f\7\u00a8\2\2\u074f\u0750\7\26\2\2\u0750\u0752\7\u00f3"+
		"\2\2\u0751\u074c\3\2\2\2\u0751\u0752\3\2\2\2\u0752\u0758\3\2\2\2\u0753"+
		"\u0754\7r\2\2\u0754\u0755\7\u00ab\2\2\u0755\u0756\7\u00a8\2\2\u0756\u0757"+
		"\7\26\2\2\u0757\u0759\7\u00f3\2\2\u0758\u0753\3\2\2\2\u0758\u0759\3\2"+
		"\2\2\u0759\u075e\3\2\2\2\u075a\u075b\7\u00ad\2\2\u075b\u075c\7\u00a8\2"+
		"\2\u075c\u075d\7\26\2\2\u075d\u075f\7\u00f3\2\2\u075e\u075a\3\2\2\2\u075e"+
		"\u075f\3\2\2\2\u075f\u0764\3\2\2\2\u0760\u0761\7)\2\2\u0761\u0762\7\u00db"+
		"\2\2\u0762\u0763\7\20\2\2\u0763\u0765\7\u00f3\2\2\u0764\u0760\3\2\2\2"+
		"\u0764\u0765\3\2\2\2\u0765\u0767\3\2\2\2\u0766\u0735\3\2\2\2\u0766\u073e"+
		"\3\2\2\2\u0767\u0085\3\2\2\2\u0768\u0769\5\u00c2b\2\u0769\u076a\7\6\2"+
		"\2\u076a\u076c\3\2\2\2\u076b\u0768\3\2\2\2\u076b\u076c\3\2\2\2\u076c\u076d"+
		"\3\2\2\2\u076d\u076e\5\u00c2b\2\u076e\u0087\3\2\2\2\u076f\u0770\5\u00c2"+
		"b\2\u0770\u0771\7\6\2\2\u0771\u0773\3\2\2\2\u0772\u076f\3\2\2\2\u0772"+
		"\u0773\3\2\2\2\u0773\u0774\3\2\2\2\u0774\u0775\5\u00c2b\2\u0775\u0089"+
		"\3\2\2\2\u0776\u077e\5\u008eH\2\u0777\u0779\7\20\2\2\u0778\u0777\3\2\2"+
		"\2\u0778\u0779\3\2\2\2\u0779\u077c\3\2\2\2\u077a\u077d\5\u00c2b\2\u077b"+
		"\u077d\5p9\2\u077c\u077a\3\2\2\2\u077c\u077b\3\2\2\2\u077d\u077f\3\2\2"+
		"\2\u077e\u0778\3\2\2\2\u077e\u077f\3\2\2\2\u077f\u008b\3\2\2\2\u0780\u0785"+
		"\5\u008aF\2\u0781\u0782\7\5\2\2\u0782\u0784\5\u008aF\2\u0783\u0781\3\2"+
		"\2\2\u0784\u0787\3\2\2\2\u0785\u0783\3\2\2\2\u0785\u0786\3\2\2\2\u0786"+
		"\u008d\3\2\2\2\u0787\u0785\3\2\2\2\u0788\u0789\5\u0090I\2\u0789\u008f"+
		"\3\2\2\2\u078a\u078b\bI\1\2\u078b\u078c\7\"\2\2\u078c\u0797\5\u0090I\7"+
		"\u078d\u078e\7$\2\2\u078e\u078f\7\3\2\2\u078f\u0790\5\32\16\2\u0790\u0791"+
		"\7\4\2\2\u0791\u0797\3\2\2\2\u0792\u0794\5\u0094K\2\u0793\u0795\5\u0092"+
		"J\2\u0794\u0793\3\2\2\2\u0794\u0795\3\2\2\2\u0795\u0797\3\2\2\2\u0796"+
		"\u078a\3\2\2\2\u0796\u078d\3\2\2\2\u0796\u0792\3\2\2\2\u0797\u07a0\3\2"+
		"\2\2\u0798\u0799\f\4\2\2\u0799\u079a\7 \2\2\u079a\u079f\5\u0090I\5\u079b"+
		"\u079c\f\3\2\2\u079c\u079d\7\37\2\2\u079d\u079f\5\u0090I\4\u079e\u0798"+
		"\3\2\2\2\u079e\u079b\3\2\2\2\u079f\u07a2\3\2\2\2\u07a0\u079e\3\2\2\2\u07a0"+
		"\u07a1\3\2\2\2\u07a1\u0091\3\2\2\2\u07a2\u07a0\3\2\2\2\u07a3\u07a5\7\""+
		"\2\2\u07a4\u07a3\3\2\2\2\u07a4\u07a5\3\2\2\2\u07a5\u07a6\3\2\2\2\u07a6"+
		"\u07a7\7%\2\2\u07a7\u07a8\5\u0094K\2\u07a8\u07a9\7 \2\2\u07a9\u07aa\5"+
		"\u0094K\2\u07aa\u07d4\3\2\2\2\u07ab\u07ad\7\"\2\2\u07ac\u07ab\3\2\2\2"+
		"\u07ac\u07ad\3\2\2\2\u07ad\u07ae\3\2\2\2\u07ae\u07af\7!\2\2\u07af\u07b0"+
		"\7\3\2\2\u07b0\u07b5\5\u008eH\2\u07b1\u07b2\7\5\2\2\u07b2\u07b4\5\u008e"+
		"H\2\u07b3\u07b1\3\2\2\2\u07b4\u07b7\3\2\2\2\u07b5\u07b3\3\2\2\2\u07b5"+
		"\u07b6\3\2\2\2\u07b6\u07b8\3\2\2\2\u07b7\u07b5\3\2\2\2\u07b8\u07b9\7\4"+
		"\2\2\u07b9\u07d4\3\2\2\2\u07ba\u07bc\7\"\2\2\u07bb\u07ba\3\2\2\2\u07bb"+
		"\u07bc\3\2\2\2\u07bc\u07bd\3\2\2\2\u07bd\u07be\7!\2\2\u07be\u07bf\7\3"+
		"\2\2\u07bf\u07c0\5\32\16\2\u07c0\u07c1\7\4\2\2\u07c1\u07d4\3\2\2\2\u07c2"+
		"\u07c4\7\"\2\2\u07c3\u07c2\3\2\2\2\u07c3\u07c4\3\2\2\2\u07c4\u07c5\3\2"+
		"\2\2\u07c5\u07c6\t\17\2\2\u07c6\u07d4\5\u0094K\2\u07c7\u07c9\7(\2\2\u07c8"+
		"\u07ca\7\"\2\2\u07c9\u07c8\3\2\2\2\u07c9\u07ca\3\2\2\2\u07ca\u07cb\3\2"+
		"\2\2\u07cb\u07d4\7)\2\2\u07cc\u07ce\7(\2\2\u07cd\u07cf\7\"\2\2\u07ce\u07cd"+
		"\3\2\2\2\u07ce\u07cf\3\2\2\2\u07cf\u07d0\3\2\2\2\u07d0\u07d1\7\23\2\2"+
		"\u07d1\u07d2\7\16\2\2\u07d2\u07d4\5\u0094K\2\u07d3\u07a4\3\2\2\2\u07d3"+
		"\u07ac\3\2\2\2\u07d3\u07bb\3\2\2\2\u07d3\u07c3\3\2\2\2\u07d3\u07c7\3\2"+
		"\2\2\u07d3\u07cc\3\2\2\2\u07d4\u0093\3\2\2\2\u07d5\u07d6\bK\1\2\u07d6"+
		"\u07da\5\u0096L\2\u07d7\u07d8\t\20\2\2\u07d8\u07da\5\u0094K\t\u07d9\u07d5"+
		"\3\2\2\2\u07d9\u07d7\3\2\2\2\u07da\u07f0\3\2\2\2\u07db\u07dc\f\b\2\2\u07dc"+
		"\u07dd\t\21\2\2\u07dd\u07ef\5\u0094K\t\u07de\u07df\f\7\2\2\u07df\u07e0"+
		"\t\22\2\2\u07e0\u07ef\5\u0094K\b\u07e1\u07e2\f\6\2\2\u07e2\u07e3\7\u0093"+
		"\2\2\u07e3\u07ef\5\u0094K\7\u07e4\u07e5\f\5\2\2\u07e5\u07e6\7\u0096\2"+
		"\2\u07e6\u07ef\5\u0094K\6\u07e7\u07e8\f\4\2\2\u07e8\u07e9\7\u0094\2\2"+
		"\u07e9\u07ef\5\u0094K\5\u07ea\u07eb\f\3\2\2\u07eb\u07ec\5\u009aN\2\u07ec"+
		"\u07ed\5\u0094K\4\u07ed\u07ef\3\2\2\2\u07ee\u07db\3\2\2\2\u07ee\u07de"+
		"\3\2\2\2\u07ee\u07e1\3\2\2\2\u07ee\u07e4\3\2\2\2\u07ee\u07e7\3\2\2\2\u07ee"+
		"\u07ea\3\2\2\2\u07ef\u07f2\3\2\2\2\u07f0\u07ee\3\2\2\2\u07f0\u07f1\3\2"+
		"\2\2\u07f1\u0095\3\2\2\2\u07f2\u07f0\3\2\2\2\u07f3\u07f4\bL\1\2\u07f4"+
		"\u07f6\7\61\2\2\u07f5\u07f7\5\u00b4[\2\u07f6\u07f5\3\2\2\2\u07f7\u07f8"+
		"\3\2\2\2\u07f8\u07f6\3\2\2\2\u07f8\u07f9\3\2\2\2\u07f9\u07fc\3\2\2\2\u07fa"+
		"\u07fb\7\64\2\2\u07fb\u07fd\5\u008eH\2\u07fc\u07fa\3\2\2\2\u07fc\u07fd"+
		"\3\2\2\2\u07fd\u07fe\3\2\2\2\u07fe\u07ff\7\65\2\2\u07ff\u0885\3\2\2\2"+
		"\u0800\u0801\7\61\2\2\u0801\u0803\5\u008eH\2\u0802\u0804\5\u00b4[\2\u0803"+
		"\u0802\3\2\2\2\u0804\u0805\3\2\2\2\u0805\u0803\3\2\2\2\u0805\u0806\3\2"+
		"\2\2\u0806\u0809\3\2\2\2\u0807\u0808\7\64\2\2\u0808\u080a\5\u008eH\2\u0809"+
		"\u0807\3\2\2\2\u0809\u080a\3\2\2\2\u080a\u080b\3\2\2\2\u080b\u080c\7\65"+
		"\2\2\u080c\u0885\3\2\2\2\u080d\u080e\7_\2\2\u080e\u080f\7\3\2\2\u080f"+
		"\u0810\5\u008eH\2\u0810\u0811\7\20\2\2\u0811\u0812\5\u00aaV\2\u0812\u0813"+
		"\7\4\2\2\u0813\u0885\3\2\2\2\u0814\u0815\7s\2\2\u0815\u081e\7\3\2\2\u0816"+
		"\u081b\5\u008aF\2\u0817\u0818\7\5\2\2\u0818\u081a\5\u008aF\2\u0819\u0817"+
		"\3\2\2\2\u081a\u081d\3\2\2\2\u081b\u0819\3\2\2\2\u081b\u081c\3\2\2\2\u081c"+
		"\u081f\3\2\2\2\u081d\u081b\3\2\2\2\u081e\u0816\3\2\2\2\u081e\u081f\3\2"+
		"\2\2\u081f\u0820\3\2\2\2\u0820\u0885\7\4\2\2\u0821\u0822\7K\2\2\u0822"+
		"\u0823\7\3\2\2\u0823\u0826\5\u008eH\2\u0824\u0825\7}\2\2\u0825\u0827\7"+
		",\2\2\u0826\u0824\3\2\2\2\u0826\u0827\3\2\2\2\u0827\u0828\3\2\2\2\u0828"+
		"\u0829\7\4\2\2\u0829\u0885\3\2\2\2\u082a\u082b\7M\2\2\u082b\u082c\7\3"+
		"\2\2\u082c\u082f\5\u008eH\2\u082d\u082e\7}\2\2\u082e\u0830\7,\2\2\u082f"+
		"\u082d\3\2\2\2\u082f\u0830\3\2\2\2\u0830\u0831\3\2\2\2\u0831\u0832\7\4"+
		"\2\2\u0832\u0885\3\2\2\2\u0833\u0834\7\u0082\2\2\u0834\u0835\7\3\2\2\u0835"+
		"\u0836\5\u0094K\2\u0836\u0837\7!\2\2\u0837\u0838\5\u0094K\2\u0838\u0839"+
		"\7\4\2\2\u0839\u0885\3\2\2\2\u083a\u0885\5\u0098M\2\u083b\u0885\7\u008e"+
		"\2\2\u083c\u083d\5\u00c0a\2\u083d\u083e\7\6\2\2\u083e\u083f\7\u008e\2"+
		"\2\u083f\u0885\3\2\2\2\u0840\u0841\7\3\2\2\u0841\u0844\5\u008aF\2\u0842"+
		"\u0843\7\5\2\2\u0843\u0845\5\u008aF\2\u0844\u0842\3\2\2\2\u0845\u0846"+
		"\3\2\2\2\u0846\u0844\3\2\2\2\u0846\u0847\3\2\2\2\u0847\u0848\3\2\2\2\u0848"+
		"\u0849\7\4\2\2\u0849\u0885\3\2\2\2\u084a\u084b\7\3\2\2\u084b\u084c\5\32"+
		"\16\2\u084c\u084d\7\4\2\2\u084d\u0885\3\2\2\2\u084e\u084f\5\u00c0a\2\u084f"+
		"\u085b\7\3\2\2\u0850\u0852\5b\62\2\u0851\u0850\3\2\2\2\u0851\u0852\3\2"+
		"\2\2\u0852\u0853\3\2\2\2\u0853\u0858\5\u008eH\2\u0854\u0855\7\5\2\2\u0855"+
		"\u0857\5\u008eH\2\u0856\u0854\3\2\2\2\u0857\u085a\3\2\2\2\u0858\u0856"+
		"\3\2\2\2\u0858\u0859\3\2\2\2\u0859\u085c\3\2\2\2\u085a\u0858\3\2\2\2\u085b"+
		"\u0851\3\2\2\2\u085b\u085c\3\2\2\2\u085c\u085d\3\2\2\2\u085d\u0860\7\4"+
		"\2\2\u085e\u085f\7C\2\2\u085f\u0861\5\u00ba^\2\u0860\u085e\3\2\2\2\u0860"+
		"\u0861\3\2\2\2\u0861\u0885\3\2\2\2\u0862\u0863\5\u00c0a\2\u0863\u0864"+
		"\7\3\2\2\u0864\u0865\t\23\2\2\u0865\u0866\5\u008eH\2\u0866\u0867\7\16"+
		"\2\2\u0867\u0868\5\u008eH\2\u0868\u0869\7\4\2\2\u0869\u0885\3\2\2\2\u086a"+
		"\u086b\7\u00fb\2\2\u086b\u086c\7\t\2\2\u086c\u0885\5\u008eH\2\u086d\u086e"+
		"\7\3\2\2\u086e\u0871\7\u00fb\2\2\u086f\u0870\7\5\2\2\u0870\u0872\7\u00fb"+
		"\2\2\u0871\u086f\3\2\2\2\u0872\u0873\3\2\2\2\u0873\u0871\3\2\2\2\u0873"+
		"\u0874\3\2\2\2\u0874\u0875\3\2\2\2\u0875\u0876\7\4\2\2\u0876\u0877\7\t"+
		"\2\2\u0877\u0885\5\u008eH\2\u0878\u0885\5\u00c2b\2\u0879\u087a\7\3\2\2"+
		"\u087a\u087b\5\u008eH\2\u087b\u087c\7\4\2\2\u087c\u0885\3\2\2\2\u087d"+
		"\u087e\7\u0083\2\2\u087e\u087f\7\3\2\2\u087f\u0880\5\u00c2b\2\u0880\u0881"+
		"\7\16\2\2\u0881\u0882\5\u0094K\2\u0882\u0883\7\4\2\2\u0883\u0885\3\2\2"+
		"\2\u0884\u07f3\3\2\2\2\u0884\u0800\3\2\2\2\u0884\u080d\3\2\2\2\u0884\u0814"+
		"\3\2\2\2\u0884\u0821\3\2\2\2\u0884\u082a\3\2\2\2\u0884\u0833\3\2\2\2\u0884"+
		"\u083a\3\2\2\2\u0884\u083b\3\2\2\2\u0884\u083c\3\2\2\2\u0884\u0840\3\2"+
		"\2\2\u0884\u084a\3\2\2\2\u0884\u084e\3\2\2\2\u0884\u0862\3\2\2\2\u0884"+
		"\u086a\3\2\2\2\u0884\u086d\3\2\2\2\u0884\u0878\3\2\2\2\u0884\u0879\3\2"+
		"\2\2\u0884\u087d\3\2\2\2\u0885\u0890\3\2\2\2\u0886\u0887\f\7\2\2\u0887"+
		"\u0888\7\n\2\2\u0888\u0889\5\u0094K\2\u0889\u088a\7\13\2\2\u088a\u088f"+
		"\3\2\2\2\u088b\u088c\f\5\2\2\u088c\u088d\7\6\2\2\u088d\u088f\5\u00c2b"+
		"\2\u088e\u0886\3\2\2\2\u088e\u088b\3\2\2\2\u088f\u0892\3\2\2\2\u0890\u088e"+
		"\3\2\2\2\u0890\u0891\3\2\2\2\u0891\u0097\3\2\2\2\u0892\u0890\3\2\2\2\u0893"+
		"\u08a0\7)\2\2\u0894\u08a0\5\u00a2R\2\u0895\u0896\5\u00c2b\2\u0896\u0897"+
		"\7\u00f3\2\2\u0897\u08a0\3\2\2\2\u0898\u08a0\5\u00c8e\2\u0899\u08a0\5"+
		"\u00a0Q\2\u089a\u089c\7\u00f3\2\2\u089b\u089a\3\2\2\2\u089c\u089d\3\2"+
		"\2\2\u089d\u089b\3\2\2\2\u089d\u089e\3\2\2\2\u089e\u08a0\3\2\2\2\u089f"+
		"\u0893\3\2\2\2\u089f\u0894\3\2\2\2\u089f\u0895\3\2\2\2\u089f\u0898\3\2"+
		"\2\2\u089f\u0899\3\2\2\2\u089f\u089b\3\2\2\2\u08a0\u0099\3\2\2\2\u08a1"+
		"\u08a2\t\24\2\2\u08a2\u009b\3\2\2\2\u08a3\u08a4\t\25\2\2\u08a4\u009d\3"+
		"\2\2\2\u08a5\u08a6\t\26\2\2\u08a6\u009f\3\2\2\2\u08a7\u08a8\t\27\2\2\u08a8"+
		"\u00a1\3\2\2\2\u08a9\u08ad\7\60\2\2\u08aa\u08ac\5\u00a4S\2\u08ab\u08aa"+
		"\3\2\2\2\u08ac\u08af\3\2\2\2\u08ad\u08ab\3\2\2\2\u08ad\u08ae\3\2\2\2\u08ae"+
		"\u00a3\3\2\2\2\u08af\u08ad\3\2\2\2\u08b0\u08b1\5\u00a6T\2\u08b1\u08b4"+
		"\5\u00c2b\2\u08b2\u08b3\7l\2\2\u08b3\u08b5\5\u00c2b\2\u08b4\u08b2\3\2"+
		"\2\2\u08b4\u08b5\3\2\2\2\u08b5\u00a5\3\2\2\2\u08b6\u08b8\t\30\2\2\u08b7"+
		"\u08b6\3\2\2\2\u08b7\u08b8\3\2\2\2\u08b8\u08b9\3\2\2\2\u08b9\u08bc\t\16"+
		"\2\2\u08ba\u08bc\7\u00f3\2\2\u08bb\u08b7\3\2\2\2\u08bb\u08ba\3\2\2\2\u08bc"+
		"\u00a7\3\2\2\2\u08bd\u08c1\7K\2\2\u08be\u08bf\7L\2\2\u08bf\u08c1\5\u00c2"+
		"b\2\u08c0\u08bd\3\2\2\2\u08c0\u08be\3\2\2\2\u08c1\u00a9\3\2\2\2\u08c2"+
		"\u08c3\7q\2\2\u08c3\u08c4\7\u0088\2\2\u08c4\u08c5\5\u00aaV\2\u08c5\u08c6"+
		"\7\u008a\2\2\u08c6\u08e5\3\2\2\2\u08c7\u08c8\7r\2\2\u08c8\u08c9\7\u0088"+
		"\2\2\u08c9\u08ca\5\u00aaV\2\u08ca\u08cb\7\5\2\2\u08cb\u08cc\5\u00aaV\2"+
		"\u08cc\u08cd\7\u008a\2\2\u08cd\u08e5\3\2\2\2\u08ce\u08d5\7s\2\2\u08cf"+
		"\u08d1\7\u0088\2\2\u08d0\u08d2\5\u00b0Y\2\u08d1\u08d0\3\2\2\2\u08d1\u08d2"+
		"\3\2\2\2\u08d2\u08d3\3\2\2\2\u08d3\u08d6\7\u008a\2\2\u08d4\u08d6\7\u0086"+
		"\2\2\u08d5\u08cf\3\2\2\2\u08d5\u08d4\3\2\2\2\u08d6\u08e5\3\2\2\2\u08d7"+
		"\u08e2\5\u00c2b\2\u08d8\u08d9\7\3\2\2\u08d9\u08de\7\u00f7\2\2\u08da\u08db"+
		"\7\5\2\2\u08db\u08dd\7\u00f7\2\2\u08dc\u08da\3\2\2\2\u08dd\u08e0\3\2\2"+
		"\2\u08de\u08dc\3\2\2\2\u08de\u08df\3\2\2\2\u08df\u08e1\3\2\2\2\u08e0\u08de"+
		"\3\2\2\2\u08e1\u08e3\7\4\2\2\u08e2\u08d8\3\2\2\2\u08e2\u08e3\3\2\2\2\u08e3"+
		"\u08e5\3\2\2\2\u08e4\u08c2\3\2\2\2\u08e4\u08c7\3\2\2\2\u08e4\u08ce\3\2"+
		"\2\2\u08e4\u08d7\3\2\2\2\u08e5\u00ab\3\2\2\2\u08e6\u08eb\5\u00aeX\2\u08e7"+
		"\u08e8\7\5\2\2\u08e8\u08ea\5\u00aeX\2\u08e9\u08e7\3\2\2\2\u08ea\u08ed"+
		"\3\2\2\2\u08eb\u08e9\3\2\2\2\u08eb\u08ec\3\2\2\2\u08ec\u00ad\3\2\2\2\u08ed"+
		"\u08eb\3\2\2\2\u08ee\u08ef\5\u00c2b\2\u08ef\u08f2\5\u00aaV\2\u08f0\u08f1"+
		"\7t\2\2\u08f1\u08f3\7\u00f3\2\2\u08f2\u08f0\3\2\2\2\u08f2\u08f3\3\2\2"+
		"\2\u08f3\u00af\3\2\2\2\u08f4\u08f9\5\u00b2Z\2\u08f5\u08f6\7\5\2\2\u08f6"+
		"\u08f8\5\u00b2Z\2\u08f7\u08f5\3\2\2\2\u08f8\u08fb\3\2\2\2\u08f9\u08f7"+
		"\3\2\2\2\u08f9\u08fa\3\2\2\2\u08fa\u00b1\3\2\2\2\u08fb\u08f9\3\2\2\2\u08fc"+
		"\u08fd\5\u00c2b\2\u08fd\u08fe\7\f\2\2\u08fe\u0901\5\u00aaV\2\u08ff\u0900"+
		"\7t\2\2\u0900\u0902\7\u00f3\2\2\u0901\u08ff\3\2\2\2\u0901\u0902\3\2\2"+
		"\2\u0902\u00b3\3\2\2\2\u0903\u0904\7\62\2\2\u0904\u0905\5\u008eH\2\u0905"+
		"\u0906\7\63\2\2\u0906\u0907\5\u008eH\2\u0907\u00b5\3\2\2\2\u0908\u0909"+
		"\7B\2\2\u0909\u090e\5\u00b8]\2\u090a\u090b\7\5\2\2\u090b\u090d\5\u00b8"+
		"]\2\u090c\u090a\3\2\2\2\u090d\u0910\3\2\2\2\u090e\u090c\3\2\2\2\u090e"+
		"\u090f\3\2\2\2\u090f\u00b7\3\2\2\2\u0910\u090e\3\2\2\2\u0911\u0912\5\u00c2"+
		"b\2\u0912\u0913\7\20\2\2\u0913\u0914\5\u00ba^\2\u0914\u00b9\3\2\2\2\u0915"+
		"\u0944\5\u00c2b\2\u0916\u0917\7\3\2\2\u0917\u0918\5\u00c2b\2\u0918\u0919"+
		"\7\4\2\2\u0919\u0944\3\2\2\2\u091a\u093d\7\3\2\2\u091b\u091c\7\u009c\2"+
		"\2\u091c\u091d\7\26\2\2\u091d\u0922\5\u008eH\2\u091e\u091f\7\5\2\2\u091f"+
		"\u0921\5\u008eH\2\u0920\u091e\3\2\2\2\u0921\u0924\3\2\2\2\u0922\u0920"+
		"\3\2\2\2\u0922\u0923\3\2\2\2\u0923\u093e\3\2\2";
	private static final String _serializedATNSegment1 =
		"\2\u0924\u0922\3\2\2\2\u0925\u0926\t\31\2\2\u0926\u0927\7\26\2\2\u0927"+
		"\u092c\5\u008eH\2\u0928\u0929\7\5\2\2\u0929\u092b\5\u008eH\2\u092a\u0928"+
		"\3\2\2\2\u092b\u092e\3\2\2\2\u092c\u092a\3\2\2\2\u092c\u092d\3\2\2\2\u092d"+
		"\u0930\3\2\2\2\u092e\u092c\3\2\2\2\u092f\u0925\3\2\2\2\u092f\u0930\3\2"+
		"\2\2\u0930\u093b\3\2\2\2\u0931\u0932\t\32\2\2\u0932\u0933\7\26\2\2\u0933"+
		"\u0938\5L\'\2\u0934\u0935\7\5\2\2\u0935\u0937\5L\'\2\u0936\u0934\3\2\2"+
		"\2\u0937\u093a\3\2\2\2\u0938\u0936\3\2\2\2\u0938\u0939\3\2\2\2\u0939\u093c"+
		"\3\2\2\2\u093a\u0938\3\2\2\2\u093b\u0931\3\2\2\2\u093b\u093c\3\2\2\2\u093c"+
		"\u093e\3\2\2\2\u093d\u091b\3\2\2\2\u093d\u092f\3\2\2\2\u093e\u0940\3\2"+
		"\2\2\u093f\u0941\5\u00bc_\2\u0940\u093f\3\2\2\2\u0940\u0941\3\2\2\2\u0941"+
		"\u0942\3\2\2\2\u0942\u0944\7\4\2\2\u0943\u0915\3\2\2\2\u0943\u0916\3\2"+
		"\2\2\u0943\u091a\3\2\2\2\u0944\u00bb\3\2\2\2\u0945\u0946\7E\2\2\u0946"+
		"\u0956\5\u00be`\2\u0947\u0948\7F\2\2\u0948\u0956\5\u00be`\2\u0949\u094a"+
		"\7E\2\2\u094a\u094b\7%\2\2\u094b\u094c\5\u00be`\2\u094c\u094d\7 \2\2\u094d"+
		"\u094e\5\u00be`\2\u094e\u0956\3\2\2\2\u094f\u0950\7F\2\2\u0950\u0951\7"+
		"%\2\2\u0951\u0952\5\u00be`\2\u0952\u0953\7 \2\2\u0953\u0954\5\u00be`\2"+
		"\u0954\u0956\3\2\2\2\u0955\u0945\3\2\2\2\u0955\u0947\3\2\2\2\u0955\u0949"+
		"\3\2\2\2\u0955\u094f\3\2\2\2\u0956\u00bd\3\2\2\2\u0957\u0958\7G\2\2\u0958"+
		"\u095f\t\33\2\2\u0959\u095a\7J\2\2\u095a\u095f\7N\2\2\u095b\u095c\5\u008e"+
		"H\2\u095c\u095d\t\33\2\2\u095d\u095f\3\2\2\2\u095e\u0957\3\2\2\2\u095e"+
		"\u0959\3\2\2\2\u095e\u095b\3\2\2\2\u095f\u00bf\3\2\2\2\u0960\u0965\5\u00c2"+
		"b\2\u0961\u0962\7\6\2\2\u0962\u0964\5\u00c2b\2\u0963\u0961\3\2\2\2\u0964"+
		"\u0967\3\2\2\2\u0965\u0963\3\2\2\2\u0965\u0966\3\2\2\2\u0966\u00c1\3\2"+
		"\2\2\u0967\u0965\3\2\2\2\u0968\u0978\5\u00c4c\2\u0969\u0978\7\u00ef\2"+
		"\2\u096a\u0978\7=\2\2\u096b\u0978\79\2\2\u096c\u0978\7:\2\2\u096d\u0978"+
		"\7;\2\2\u096e\u0978\7<\2\2\u096f\u0978\7>\2\2\u0970\u0978\7\66\2\2\u0971"+
		"\u0978\7\67\2\2\u0972\u0978\7?\2\2\u0973\u0978\7h\2\2\u0974\u0978\7k\2"+
		"\2\u0975\u0978\7i\2\2\u0976\u0978\7j\2\2\u0977\u0968\3\2\2\2\u0977\u0969"+
		"\3\2\2\2\u0977\u096a\3\2\2\2\u0977\u096b\3\2\2\2\u0977\u096c\3\2\2\2\u0977"+
		"\u096d\3\2\2\2\u0977\u096e\3\2\2\2\u0977\u096f\3\2\2\2\u0977\u0970\3\2"+
		"\2\2\u0977\u0971\3\2\2\2\u0977\u0972\3\2\2\2\u0977\u0973\3\2\2\2\u0977"+
		"\u0974\3\2\2\2\u0977\u0975\3\2\2\2\u0977\u0976\3\2\2\2\u0978\u00c3\3\2"+
		"\2\2\u0979\u097d\7\u00fb\2\2\u097a\u097d\5\u00c6d\2\u097b\u097d\5\u00ca"+
		"f\2\u097c\u0979\3\2\2\2\u097c\u097a\3\2\2\2\u097c\u097b\3\2\2\2\u097d"+
		"\u00c5\3\2\2\2\u097e\u097f\7\u00fc\2\2\u097f\u00c7\3\2\2\2\u0980\u0982"+
		"\7\u008d\2\2\u0981\u0980\3\2\2\2\u0981\u0982\3\2\2\2\u0982\u0983\3\2\2"+
		"\2\u0983\u099d\7\u00f8\2\2\u0984\u0986\7\u008d\2\2\u0985\u0984\3\2\2\2"+
		"\u0985\u0986\3\2\2\2\u0986\u0987\3\2\2\2\u0987\u099d\7\u00f7\2\2\u0988"+
		"\u098a\7\u008d\2\2\u0989\u0988\3\2\2\2\u0989\u098a\3\2\2\2\u098a\u098b"+
		"\3\2\2\2\u098b\u099d\7\u00f4\2\2\u098c\u098e\7\u008d\2\2\u098d\u098c\3"+
		"\2\2\2\u098d\u098e\3\2\2\2\u098e\u098f\3\2\2\2\u098f\u099d\7\u00f5\2\2"+
		"\u0990\u0992\7\u008d\2\2\u0991\u0990\3\2\2\2\u0991\u0992\3\2\2\2\u0992"+
		"\u0993\3\2\2\2\u0993\u099d\7\u00f6\2\2\u0994\u0996\7\u008d\2\2\u0995\u0994"+
		"\3\2\2\2\u0995\u0996\3\2\2\2\u0996\u0997\3\2\2\2\u0997\u099d\7\u00f9\2"+
		"\2\u0998\u099a\7\u008d\2\2\u0999\u0998\3\2\2\2\u0999\u099a\3\2\2\2\u099a"+
		"\u099b\3\2\2\2\u099b\u099d\7\u00fa\2\2\u099c\u0981\3\2\2\2\u099c\u0985"+
		"\3\2\2\2\u099c\u0989\3\2\2\2\u099c\u098d\3\2\2\2\u099c\u0991\3\2\2\2\u099c"+
		"\u0995\3\2\2\2\u099c\u0999\3\2\2\2\u099d\u00c9\3\2\2\2\u099e\u099f\t\34"+
		"\2\2\u099f\u00cb\3\2\2\2\u014a\u00e6\u00eb\u00ee\u00f3\u0100\u0104\u010b"+
		"\u0119\u011b\u011f\u0122\u0129\u013a\u013c\u0140\u0143\u014a\u0150\u0157"+
		"\u015b\u0161\u0169\u0189\u0191\u0195\u019a\u01a0\u01a8\u01ae\u01bb\u01c0"+
		"\u01c9\u01ce\u01de\u01e5\u01e9\u01f1\u01f8\u01ff\u020e\u0212\u0218\u021e"+
		"\u0221\u0224\u022a\u022e\u0232\u0237\u023b\u0243\u0246\u024f\u0254\u025a"+
		"\u0261\u0264\u026a\u0275\u0278\u027c\u0281\u0286\u028d\u0290\u0293\u029a"+
		"\u029f\u02a4\u02a7\u02b0\u02b8\u02be\u02c2\u02c6\u02ca\u02cc\u02d5\u02db"+
		"\u02e0\u02e3\u02e7\u02ea\u02f4\u02f7\u02fb\u0300\u0303\u0309\u0311\u0316"+
		"\u031c\u0322\u032d\u0335\u033c\u0344\u0347\u034f\u0353\u035a\u03ce\u03d6"+
		"\u03de\u03e7\u03f3\u03f7\u03fa\u0400\u040a\u0416\u041b\u0421\u042d\u042f"+
		"\u0434\u0438\u043d\u0442\u0445\u044a\u044e\u0453\u0455\u0459\u0462\u046a"+
		"\u0471\u0478\u0481\u0486\u0495\u049c\u049f\u04a6\u04aa\u04b0\u04b8\u04c3"+
		"\u04ce\u04d5\u04db\u04e1\u04ea\u04ec\u04f5\u04f8\u0501\u0504\u050d\u0510"+
		"\u0519\u051c\u051f\u0524\u0526\u0529\u0535\u053c\u0543\u0546\u0548\u0553"+
		"\u0557\u055b\u0567\u056a\u056e\u0578\u057c\u057e\u0581\u0585\u0588\u058c"+
		"\u0592\u0596\u059a\u059f\u05a2\u05a4\u05a9\u05ae\u05b1\u05b5\u05b8\u05ba"+
		"\u05bf\u05c4\u05d1\u05d6\u05de\u05e4\u05e8\u05f1\u0600\u0605\u0611\u0616"+
		"\u061e\u0621\u0625\u0633\u0640\u0645\u0649\u064c\u0651\u065a\u065d\u0662"+
		"\u0669\u066c\u0674\u067b\u0682\u0685\u068a\u0690\u0694\u0697\u069a\u06a5"+
		"\u06aa\u06af\u06b4\u06c6\u06c8\u06cb\u06d6\u06df\u06e6\u06ee\u06f6\u06fa"+
		"\u0702\u070a\u0710\u0718\u0724\u0727\u072d\u0731\u0733\u073c\u0748\u074a"+
		"\u0751\u0758\u075e\u0764\u0766\u076b\u0772\u0778\u077c\u077e\u0785\u0794"+
		"\u0796\u079e\u07a0\u07a4\u07ac\u07b5\u07bb\u07c3\u07c9\u07ce\u07d3\u07d9"+
		"\u07ee\u07f0\u07f8\u07fc\u0805\u0809\u081b\u081e\u0826\u082f\u0846\u0851"+
		"\u0858\u085b\u0860\u0873\u0884\u088e\u0890\u089d\u089f\u08ad\u08b4\u08b7"+
		"\u08bb\u08c0\u08d1\u08d5\u08de\u08e2\u08e4\u08eb\u08f2\u08f9\u0901\u090e"+
		"\u0922\u092c\u092f\u0938\u093b\u093d\u0940\u0943\u0955\u095e\u0965\u0977"+
		"\u097c\u0981\u0985\u0989\u098d\u0991\u0995\u0999\u099c";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}