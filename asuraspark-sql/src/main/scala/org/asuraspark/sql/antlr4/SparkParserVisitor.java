// Generated from E:\IdeaProjects\asuraspark\asuraspark-sql\src\main\scala\org\asuraspark\sql\antlr4\SparkParser.g4 by ANTLR 4.8
package org.asuraspark.sql.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SparkParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SparkParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#singleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatement(SparkParserParser.SingleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleExpression(SparkParserParser.SingleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTableIdentifier(SparkParserParser.SingleTableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#singleFunctionIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleFunctionIdentifier(SparkParserParser.SingleFunctionIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#singleDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleDataType(SparkParserParser.SingleDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#singleTableSchema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTableSchema(SparkParserParser.SingleTableSchemaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDefault(SparkParserParser.StatementDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code use}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse(SparkParserParser.UseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createDatabase}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabase(SparkParserParser.CreateDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setDatabaseProperties}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetDatabaseProperties(SparkParserParser.SetDatabasePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropDatabase}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDatabase(SparkParserParser.DropDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(SparkParserParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createHiveTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateHiveTable(SparkParserParser.CreateHiveTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableLike(SparkParserParser.CreateTableLikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mergeTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeTable(SparkParserParser.MergeTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyze(SparkParserParser.AnalyzeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addTableColumns}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddTableColumns(SparkParserParser.AddTableColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTable(SparkParserParser.RenameTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableProperties(SparkParserParser.SetTablePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsetTableProperties(SparkParserParser.UnsetTablePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code changeColumn}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeColumn(SparkParserParser.ChangeColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableSerDe(SparkParserParser.SetTableSerDeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddTablePartition(SparkParserParser.AddTablePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTablePartition(SparkParserParser.RenameTablePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTablePartitions(SparkParserParser.DropTablePartitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableLocation(SparkParserParser.SetTableLocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code recoverPartitions}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecoverPartitions(SparkParserParser.RecoverPartitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(SparkParserParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createView}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateView(SparkParserParser.CreateViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTempViewUsing(SparkParserParser.CreateTempViewUsingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterViewQuery(SparkParserParser.AlterViewQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunction(SparkParserParser.CreateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropFunction(SparkParserParser.DropFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explain}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain(SparkParserParser.ExplainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTables(SparkParserParser.ShowTablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTable(SparkParserParser.ShowTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showDatabases}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDatabases(SparkParserParser.ShowDatabasesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTblProperties(SparkParserParser.ShowTblPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowColumns(SparkParserParser.ShowColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowPartitions(SparkParserParser.ShowPartitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFunctions(SparkParserParser.ShowFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateTable(SparkParserParser.ShowCreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeFunction(SparkParserParser.DescribeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeDatabase}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeDatabase(SparkParserParser.DescribeDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeTable(SparkParserParser.DescribeTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshTable(SparkParserParser.RefreshTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshResource(SparkParserParser.RefreshResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCacheTable(SparkParserParser.CacheTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUncacheTable(SparkParserParser.UncacheTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClearCache(SparkParserParser.ClearCacheContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadData(SparkParserParser.LoadDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateTable(SparkParserParser.TruncateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repairTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepairTable(SparkParserParser.RepairTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManageResource(SparkParserParser.ManageResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFailNativeCommand(SparkParserParser.FailNativeCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetConfiguration(SparkParserParser.SetConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetConfiguration(SparkParserParser.ResetConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsupportedHiveNativeCommands(SparkParserParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#createTableHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableHeader(SparkParserParser.CreateTableHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#bucketSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucketSpec(SparkParserParser.BucketSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#skewSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkewSpec(SparkParserParser.SkewSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#locationSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationSpec(SparkParserParser.LocationSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(SparkParserParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertOverwriteTable}
	 * labeled alternative in {@link SparkParserParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertOverwriteTable(SparkParserParser.InsertOverwriteTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertIntoTable}
	 * labeled alternative in {@link SparkParserParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertIntoTable(SparkParserParser.InsertIntoTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertOverwriteHiveDir}
	 * labeled alternative in {@link SparkParserParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertOverwriteHiveDir(SparkParserParser.InsertOverwriteHiveDirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertOverwriteDir}
	 * labeled alternative in {@link SparkParserParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertOverwriteDir(SparkParserParser.InsertOverwriteDirContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSpecLocation(SparkParserParser.PartitionSpecLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#partitionSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSpec(SparkParserParser.PartitionSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#partitionVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionVal(SparkParserParser.PartitionValContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#describeFuncName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeFuncName(SparkParserParser.DescribeFuncNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#describeColName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeColName(SparkParserParser.DescribeColNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#ctes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtes(SparkParserParser.CtesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#namedQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedQuery(SparkParserParser.NamedQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#tableProvider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableProvider(SparkParserParser.TableProviderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#tablePropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyList(SparkParserParser.TablePropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#tableProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableProperty(SparkParserParser.TablePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyKey(SparkParserParser.TablePropertyKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyValue(SparkParserParser.TablePropertyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#constantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantList(SparkParserParser.ConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#nestedConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedConstantList(SparkParserParser.NestedConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#createFileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFileFormat(SparkParserParser.CreateFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link SparkParserParser#fileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFileFormat(SparkParserParser.TableFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link SparkParserParser#fileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericFileFormat(SparkParserParser.GenericFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#storageHandler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageHandler(SparkParserParser.StorageHandlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(SparkParserParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link SparkParserParser#queryNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleInsertQuery(SparkParserParser.SingleInsertQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link SparkParserParser#queryNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiInsertQuery(SparkParserParser.MultiInsertQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#queryOrganization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryOrganization(SparkParserParser.QueryOrganizationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiInsertQueryBody(SparkParserParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link SparkParserParser#queryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryTermDefault(SparkParserParser.QueryTermDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link SparkParserParser#queryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOperation(SparkParserParser.SetOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link SparkParserParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryPrimaryDefault(SparkParserParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code table}
	 * labeled alternative in {@link SparkParserParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(SparkParserParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link SparkParserParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTableDefault1(SparkParserParser.InlineTableDefault1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link SparkParserParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(SparkParserParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#sortItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortItem(SparkParserParser.SortItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerySpecification(SparkParserParser.QuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHint(SparkParserParser.HintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#hintStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHintStatement(SparkParserParser.HintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(SparkParserParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#aggregation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregation(SparkParserParser.AggregationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#groupingSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingSet(SparkParserParser.GroupingSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#pivotClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivotClause(SparkParserParser.PivotClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#pivotColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivotColumn(SparkParserParser.PivotColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#pivotValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivotValue(SparkParserParser.PivotValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#lateralView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLateralView(SparkParserParser.LateralViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#setQuantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetQuantifier(SparkParserParser.SetQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(SparkParserParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#joinRelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinRelation(SparkParserParser.JoinRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#joinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinType(SparkParserParser.JoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#joinCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCriteria(SparkParserParser.JoinCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#sample}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample(SparkParserParser.SampleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sampleByPercentile}
	 * labeled alternative in {@link SparkParserParser#sampleMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleByPercentile(SparkParserParser.SampleByPercentileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sampleByRows}
	 * labeled alternative in {@link SparkParserParser#sampleMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleByRows(SparkParserParser.SampleByRowsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sampleByBucket}
	 * labeled alternative in {@link SparkParserParser#sampleMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleByBucket(SparkParserParser.SampleByBucketContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sampleByBytes}
	 * labeled alternative in {@link SparkParserParser#sampleMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleByBytes(SparkParserParser.SampleByBytesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(SparkParserParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#identifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierSeq(SparkParserParser.IdentifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedIdentifierList(SparkParserParser.OrderedIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedIdentifier(SparkParserParser.OrderedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#identifierCommentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierCommentList(SparkParserParser.IdentifierCommentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#identifierComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierComment(SparkParserParser.IdentifierCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link SparkParserParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(SparkParserParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link SparkParserParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasedQuery(SparkParserParser.AliasedQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link SparkParserParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasedRelation(SparkParserParser.AliasedRelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link SparkParserParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTableDefault2(SparkParserParser.InlineTableDefault2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link SparkParserParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableValuedFunction(SparkParserParser.TableValuedFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#inlineTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTable(SparkParserParser.InlineTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#functionTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTable(SparkParserParser.FunctionTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#tableAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAlias(SparkParserParser.TableAliasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link SparkParserParser#rowFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowFormatSerde(SparkParserParser.RowFormatSerdeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link SparkParserParser#rowFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowFormatDelimited(SparkParserParser.RowFormatDelimitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#tableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIdentifier(SparkParserParser.TableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#functionIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionIdentifier(SparkParserParser.FunctionIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#namedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExpression(SparkParserParser.NamedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExpressionSeq(SparkParserParser.NamedExpressionSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SparkParserParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link SparkParserParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNot(SparkParserParser.LogicalNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link SparkParserParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicated(SparkParserParser.PredicatedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link SparkParserParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists(SparkParserParser.ExistsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link SparkParserParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalBinary(SparkParserParser.LogicalBinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(SparkParserParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link SparkParserParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpressionDefault(SparkParserParser.ValueExpressionDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link SparkParserParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(SparkParserParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link SparkParserParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticBinary(SparkParserParser.ArithmeticBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link SparkParserParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticUnary(SparkParserParser.ArithmeticUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code struct}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct(SparkParserParser.StructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDereference(SparkParserParser.DereferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCase(SparkParserParser.SimpleCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnReference(SparkParserParser.ColumnReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowConstructor(SparkParserParser.RowConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code last}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLast(SparkParserParser.LastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code star}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(SparkParserParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(SparkParserParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryExpression(SparkParserParser.SubqueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(SparkParserParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefault(SparkParserParser.ConstantDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(SparkParserParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(SparkParserParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code extract}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract(SparkParserParser.ExtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SparkParserParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchedCase(SparkParserParser.SearchedCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code position}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosition(SparkParserParser.PositionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code first}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst(SparkParserParser.FirstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link SparkParserParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(SparkParserParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link SparkParserParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalLiteral(SparkParserParser.IntervalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link SparkParserParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConstructor(SparkParserParser.TypeConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link SparkParserParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(SparkParserParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link SparkParserParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(SparkParserParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link SparkParserParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(SparkParserParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(SparkParserParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperator(SparkParserParser.ArithmeticOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#predicateOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateOperator(SparkParserParser.PredicateOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(SparkParserParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(SparkParserParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#intervalField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalField(SparkParserParser.IntervalFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#intervalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalValue(SparkParserParser.IntervalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#colPosition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColPosition(SparkParserParser.ColPositionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link SparkParserParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexDataType(SparkParserParser.ComplexDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link SparkParserParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveDataType(SparkParserParser.PrimitiveDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#colTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColTypeList(SparkParserParser.ColTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#colType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColType(SparkParserParser.ColTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#complexColTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexColTypeList(SparkParserParser.ComplexColTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#complexColType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexColType(SparkParserParser.ComplexColTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#whenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenClause(SparkParserParser.WhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#windows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindows(SparkParserParser.WindowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#namedWindow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedWindow(SparkParserParser.NamedWindowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link SparkParserParser#windowSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowRef(SparkParserParser.WindowRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link SparkParserParser#windowSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowDef(SparkParserParser.WindowDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#windowFrame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFrame(SparkParserParser.WindowFrameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#frameBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameBound(SparkParserParser.FrameBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(SparkParserParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SparkParserParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link SparkParserParser#strictIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquotedIdentifier(SparkParserParser.UnquotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link SparkParserParser#strictIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifierAlternative(SparkParserParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifier(SparkParserParser.QuotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link SparkParserParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(SparkParserParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SparkParserParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(SparkParserParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link SparkParserParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigIntLiteral(SparkParserParser.BigIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link SparkParserParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallIntLiteral(SparkParserParser.SmallIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link SparkParserParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTinyIntLiteral(SparkParserParser.TinyIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link SparkParserParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteral(SparkParserParser.DoubleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link SparkParserParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigDecimalLiteral(SparkParserParser.BigDecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkParserParser#nonReserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonReserved(SparkParserParser.NonReservedContext ctx);
}