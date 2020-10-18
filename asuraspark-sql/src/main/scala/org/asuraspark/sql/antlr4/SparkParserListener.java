// Generated from E:\IdeaProjects\asuraspark\asuraspark-sql\src\main\scala\org\asuraspark\sql\antlr4\SparkParser.g4 by ANTLR 4.8
package org.asuraspark.sql.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SparkParserParser}.
 */
public interface SparkParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(SparkParserParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(SparkParserParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpression(SparkParserParser.SingleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpression(SparkParserParser.SingleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableIdentifier(SparkParserParser.SingleTableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableIdentifier(SparkParserParser.SingleTableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#singleFunctionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSingleFunctionIdentifier(SparkParserParser.SingleFunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#singleFunctionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSingleFunctionIdentifier(SparkParserParser.SingleFunctionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#singleDataType}.
	 * @param ctx the parse tree
	 */
	void enterSingleDataType(SparkParserParser.SingleDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#singleDataType}.
	 * @param ctx the parse tree
	 */
	void exitSingleDataType(SparkParserParser.SingleDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#singleTableSchema}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableSchema(SparkParserParser.SingleTableSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#singleTableSchema}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableSchema(SparkParserParser.SingleTableSchemaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDefault(SparkParserParser.StatementDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDefault(SparkParserParser.StatementDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code use}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUse(SparkParserParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code use}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUse(SparkParserParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createDatabase}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabase(SparkParserParser.CreateDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createDatabase}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabase(SparkParserParser.CreateDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setDatabaseProperties}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetDatabaseProperties(SparkParserParser.SetDatabasePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setDatabaseProperties}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetDatabaseProperties(SparkParserParser.SetDatabasePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropDatabase}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabase(SparkParserParser.DropDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropDatabase}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabase(SparkParserParser.DropDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(SparkParserParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(SparkParserParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createHiveTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateHiveTable(SparkParserParser.CreateHiveTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createHiveTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateHiveTable(SparkParserParser.CreateHiveTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableLike(SparkParserParser.CreateTableLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableLike(SparkParserParser.CreateTableLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mergeTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterMergeTable(SparkParserParser.MergeTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mergeTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitMergeTable(SparkParserParser.MergeTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze(SparkParserParser.AnalyzeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze(SparkParserParser.AnalyzeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addTableColumns}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAddTableColumns(SparkParserParser.AddTableColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addTableColumns}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAddTableColumns(SparkParserParser.AddTableColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTable(SparkParserParser.RenameTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTable(SparkParserParser.RenameTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableProperties(SparkParserParser.SetTablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableProperties(SparkParserParser.SetTablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUnsetTableProperties(SparkParserParser.UnsetTablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUnsetTableProperties(SparkParserParser.UnsetTablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code changeColumn}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterChangeColumn(SparkParserParser.ChangeColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code changeColumn}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitChangeColumn(SparkParserParser.ChangeColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableSerDe(SparkParserParser.SetTableSerDeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableSerDe(SparkParserParser.SetTableSerDeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAddTablePartition(SparkParserParser.AddTablePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAddTablePartition(SparkParserParser.AddTablePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTablePartition(SparkParserParser.RenameTablePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTablePartition(SparkParserParser.RenameTablePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTablePartitions(SparkParserParser.DropTablePartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTablePartitions(SparkParserParser.DropTablePartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableLocation(SparkParserParser.SetTableLocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableLocation(SparkParserParser.SetTableLocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code recoverPartitions}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRecoverPartitions(SparkParserParser.RecoverPartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recoverPartitions}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRecoverPartitions(SparkParserParser.RecoverPartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(SparkParserParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(SparkParserParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createView}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(SparkParserParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createView}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(SparkParserParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTempViewUsing(SparkParserParser.CreateTempViewUsingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTempViewUsing(SparkParserParser.CreateTempViewUsingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAlterViewQuery(SparkParserParser.AlterViewQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAlterViewQuery(SparkParserParser.AlterViewQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(SparkParserParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(SparkParserParser.CreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropFunction(SparkParserParser.DropFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropFunction(SparkParserParser.DropFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explain}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExplain(SparkParserParser.ExplainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explain}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExplain(SparkParserParser.ExplainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTables(SparkParserParser.ShowTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTables(SparkParserParser.ShowTablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTable(SparkParserParser.ShowTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTable(SparkParserParser.ShowTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showDatabases}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowDatabases(SparkParserParser.ShowDatabasesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showDatabases}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowDatabases(SparkParserParser.ShowDatabasesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTblProperties(SparkParserParser.ShowTblPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTblProperties(SparkParserParser.ShowTblPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowColumns(SparkParserParser.ShowColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowColumns(SparkParserParser.ShowColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowPartitions(SparkParserParser.ShowPartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowPartitions(SparkParserParser.ShowPartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowFunctions(SparkParserParser.ShowFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowFunctions(SparkParserParser.ShowFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateTable(SparkParserParser.ShowCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateTable(SparkParserParser.ShowCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeFunction(SparkParserParser.DescribeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeFunction(SparkParserParser.DescribeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeDatabase}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeDatabase(SparkParserParser.DescribeDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeDatabase}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeDatabase(SparkParserParser.DescribeDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeTable(SparkParserParser.DescribeTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeTable(SparkParserParser.DescribeTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshTable(SparkParserParser.RefreshTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshTable(SparkParserParser.RefreshTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshResource(SparkParserParser.RefreshResourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshResource(SparkParserParser.RefreshResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCacheTable(SparkParserParser.CacheTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCacheTable(SparkParserParser.CacheTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUncacheTable(SparkParserParser.UncacheTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUncacheTable(SparkParserParser.UncacheTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClearCache(SparkParserParser.ClearCacheContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClearCache(SparkParserParser.ClearCacheContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLoadData(SparkParserParser.LoadDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLoadData(SparkParserParser.LoadDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTruncateTable(SparkParserParser.TruncateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTruncateTable(SparkParserParser.TruncateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repairTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRepairTable(SparkParserParser.RepairTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repairTable}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRepairTable(SparkParserParser.RepairTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterManageResource(SparkParserParser.ManageResourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitManageResource(SparkParserParser.ManageResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFailNativeCommand(SparkParserParser.FailNativeCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFailNativeCommand(SparkParserParser.FailNativeCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetConfiguration(SparkParserParser.SetConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetConfiguration(SparkParserParser.SetConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterResetConfiguration(SparkParserParser.ResetConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link SparkParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitResetConfiguration(SparkParserParser.ResetConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void enterUnsupportedHiveNativeCommands(SparkParserParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void exitUnsupportedHiveNativeCommands(SparkParserParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableHeader(SparkParserParser.CreateTableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableHeader(SparkParserParser.CreateTableHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void enterBucketSpec(SparkParserParser.BucketSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void exitBucketSpec(SparkParserParser.BucketSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void enterSkewSpec(SparkParserParser.SkewSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void exitSkewSpec(SparkParserParser.SkewSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void enterLocationSpec(SparkParserParser.LocationSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void exitLocationSpec(SparkParserParser.LocationSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(SparkParserParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(SparkParserParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertOverwriteTable}
	 * labeled alternative in {@link SparkParserParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteTable(SparkParserParser.InsertOverwriteTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteTable}
	 * labeled alternative in {@link SparkParserParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteTable(SparkParserParser.InsertOverwriteTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertIntoTable}
	 * labeled alternative in {@link SparkParserParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertIntoTable(SparkParserParser.InsertIntoTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertIntoTable}
	 * labeled alternative in {@link SparkParserParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertIntoTable(SparkParserParser.InsertIntoTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertOverwriteHiveDir}
	 * labeled alternative in {@link SparkParserParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteHiveDir(SparkParserParser.InsertOverwriteHiveDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteHiveDir}
	 * labeled alternative in {@link SparkParserParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteHiveDir(SparkParserParser.InsertOverwriteHiveDirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertOverwriteDir}
	 * labeled alternative in {@link SparkParserParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteDir(SparkParserParser.InsertOverwriteDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteDir}
	 * labeled alternative in {@link SparkParserParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteDir(SparkParserParser.InsertOverwriteDirContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpecLocation(SparkParserParser.PartitionSpecLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpecLocation(SparkParserParser.PartitionSpecLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpec(SparkParserParser.PartitionSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpec(SparkParserParser.PartitionSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void enterPartitionVal(SparkParserParser.PartitionValContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void exitPartitionVal(SparkParserParser.PartitionValContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeFuncName(SparkParserParser.DescribeFuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeFuncName(SparkParserParser.DescribeFuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeColName(SparkParserParser.DescribeColNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeColName(SparkParserParser.DescribeColNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#ctes}.
	 * @param ctx the parse tree
	 */
	void enterCtes(SparkParserParser.CtesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#ctes}.
	 * @param ctx the parse tree
	 */
	void exitCtes(SparkParserParser.CtesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void enterNamedQuery(SparkParserParser.NamedQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void exitNamedQuery(SparkParserParser.NamedQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void enterTableProvider(SparkParserParser.TableProviderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void exitTableProvider(SparkParserParser.TableProviderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyList(SparkParserParser.TablePropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyList(SparkParserParser.TablePropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void enterTableProperty(SparkParserParser.TablePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void exitTableProperty(SparkParserParser.TablePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyKey(SparkParserParser.TablePropertyKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyKey(SparkParserParser.TablePropertyKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyValue(SparkParserParser.TablePropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyValue(SparkParserParser.TablePropertyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#constantList}.
	 * @param ctx the parse tree
	 */
	void enterConstantList(SparkParserParser.ConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#constantList}.
	 * @param ctx the parse tree
	 */
	void exitConstantList(SparkParserParser.ConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void enterNestedConstantList(SparkParserParser.NestedConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void exitNestedConstantList(SparkParserParser.NestedConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void enterCreateFileFormat(SparkParserParser.CreateFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void exitCreateFileFormat(SparkParserParser.CreateFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link SparkParserParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterTableFileFormat(SparkParserParser.TableFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link SparkParserParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitTableFileFormat(SparkParserParser.TableFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link SparkParserParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterGenericFileFormat(SparkParserParser.GenericFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link SparkParserParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitGenericFileFormat(SparkParserParser.GenericFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void enterStorageHandler(SparkParserParser.StorageHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void exitStorageHandler(SparkParserParser.StorageHandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(SparkParserParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(SparkParserParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link SparkParserParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void enterSingleInsertQuery(SparkParserParser.SingleInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link SparkParserParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void exitSingleInsertQuery(SparkParserParser.SingleInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link SparkParserParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQuery(SparkParserParser.MultiInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link SparkParserParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQuery(SparkParserParser.MultiInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void enterQueryOrganization(SparkParserParser.QueryOrganizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void exitQueryOrganization(SparkParserParser.QueryOrganizationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQueryBody(SparkParserParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQueryBody(SparkParserParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link SparkParserParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterQueryTermDefault(SparkParserParser.QueryTermDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link SparkParserParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitQueryTermDefault(SparkParserParser.QueryTermDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link SparkParserParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterSetOperation(SparkParserParser.SetOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link SparkParserParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitSetOperation(SparkParserParser.SetOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link SparkParserParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterQueryPrimaryDefault(SparkParserParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link SparkParserParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitQueryPrimaryDefault(SparkParserParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code table}
	 * labeled alternative in {@link SparkParserParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTable(SparkParserParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table}
	 * labeled alternative in {@link SparkParserParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTable(SparkParserParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link SparkParserParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault1(SparkParserParser.InlineTableDefault1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link SparkParserParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault1(SparkParserParser.InlineTableDefault1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link SparkParserParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(SparkParserParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link SparkParserParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(SparkParserParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void enterSortItem(SparkParserParser.SortItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void exitSortItem(SparkParserParser.SortItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecification(SparkParserParser.QuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecification(SparkParserParser.QuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#hint}.
	 * @param ctx the parse tree
	 */
	void enterHint(SparkParserParser.HintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#hint}.
	 * @param ctx the parse tree
	 */
	void exitHint(SparkParserParser.HintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#hintStatement}.
	 * @param ctx the parse tree
	 */
	void enterHintStatement(SparkParserParser.HintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#hintStatement}.
	 * @param ctx the parse tree
	 */
	void exitHintStatement(SparkParserParser.HintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(SparkParserParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(SparkParserParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void enterAggregation(SparkParserParser.AggregationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void exitAggregation(SparkParserParser.AggregationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void enterGroupingSet(SparkParserParser.GroupingSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void exitGroupingSet(SparkParserParser.GroupingSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#pivotClause}.
	 * @param ctx the parse tree
	 */
	void enterPivotClause(SparkParserParser.PivotClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#pivotClause}.
	 * @param ctx the parse tree
	 */
	void exitPivotClause(SparkParserParser.PivotClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#pivotColumn}.
	 * @param ctx the parse tree
	 */
	void enterPivotColumn(SparkParserParser.PivotColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#pivotColumn}.
	 * @param ctx the parse tree
	 */
	void exitPivotColumn(SparkParserParser.PivotColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#pivotValue}.
	 * @param ctx the parse tree
	 */
	void enterPivotValue(SparkParserParser.PivotValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#pivotValue}.
	 * @param ctx the parse tree
	 */
	void exitPivotValue(SparkParserParser.PivotValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void enterLateralView(SparkParserParser.LateralViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void exitLateralView(SparkParserParser.LateralViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterSetQuantifier(SparkParserParser.SetQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitSetQuantifier(SparkParserParser.SetQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(SparkParserParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(SparkParserParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#joinRelation}.
	 * @param ctx the parse tree
	 */
	void enterJoinRelation(SparkParserParser.JoinRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#joinRelation}.
	 * @param ctx the parse tree
	 */
	void exitJoinRelation(SparkParserParser.JoinRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#joinType}.
	 * @param ctx the parse tree
	 */
	void enterJoinType(SparkParserParser.JoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#joinType}.
	 * @param ctx the parse tree
	 */
	void exitJoinType(SparkParserParser.JoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void enterJoinCriteria(SparkParserParser.JoinCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void exitJoinCriteria(SparkParserParser.JoinCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#sample}.
	 * @param ctx the parse tree
	 */
	void enterSample(SparkParserParser.SampleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#sample}.
	 * @param ctx the parse tree
	 */
	void exitSample(SparkParserParser.SampleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByPercentile}
	 * labeled alternative in {@link SparkParserParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByPercentile(SparkParserParser.SampleByPercentileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByPercentile}
	 * labeled alternative in {@link SparkParserParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByPercentile(SparkParserParser.SampleByPercentileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByRows}
	 * labeled alternative in {@link SparkParserParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByRows(SparkParserParser.SampleByRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByRows}
	 * labeled alternative in {@link SparkParserParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByRows(SparkParserParser.SampleByRowsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByBucket}
	 * labeled alternative in {@link SparkParserParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByBucket(SparkParserParser.SampleByBucketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByBucket}
	 * labeled alternative in {@link SparkParserParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByBucket(SparkParserParser.SampleByBucketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByBytes}
	 * labeled alternative in {@link SparkParserParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByBytes(SparkParserParser.SampleByBytesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByBytes}
	 * labeled alternative in {@link SparkParserParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByBytes(SparkParserParser.SampleByBytesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(SparkParserParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(SparkParserParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierSeq(SparkParserParser.IdentifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierSeq(SparkParserParser.IdentifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifierList(SparkParserParser.OrderedIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifierList(SparkParserParser.OrderedIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifier(SparkParserParser.OrderedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifier(SparkParserParser.OrderedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierCommentList(SparkParserParser.IdentifierCommentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierCommentList(SparkParserParser.IdentifierCommentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierComment(SparkParserParser.IdentifierCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierComment(SparkParserParser.IdentifierCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link SparkParserParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableName(SparkParserParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link SparkParserParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableName(SparkParserParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link SparkParserParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedQuery(SparkParserParser.AliasedQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link SparkParserParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedQuery(SparkParserParser.AliasedQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link SparkParserParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedRelation(SparkParserParser.AliasedRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link SparkParserParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedRelation(SparkParserParser.AliasedRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link SparkParserParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault2(SparkParserParser.InlineTableDefault2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link SparkParserParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault2(SparkParserParser.InlineTableDefault2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link SparkParserParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableValuedFunction(SparkParserParser.TableValuedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link SparkParserParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableValuedFunction(SparkParserParser.TableValuedFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void enterInlineTable(SparkParserParser.InlineTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void exitInlineTable(SparkParserParser.InlineTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#functionTable}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTable(SparkParserParser.FunctionTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#functionTable}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTable(SparkParserParser.FunctionTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void enterTableAlias(SparkParserParser.TableAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void exitTableAlias(SparkParserParser.TableAliasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link SparkParserParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatSerde(SparkParserParser.RowFormatSerdeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link SparkParserParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatSerde(SparkParserParser.RowFormatSerdeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link SparkParserParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatDelimited(SparkParserParser.RowFormatDelimitedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link SparkParserParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatDelimited(SparkParserParser.RowFormatDelimitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentifier(SparkParserParser.TableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentifier(SparkParserParser.TableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionIdentifier(SparkParserParser.FunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionIdentifier(SparkParserParser.FunctionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpression(SparkParserParser.NamedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpression(SparkParserParser.NamedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpressionSeq(SparkParserParser.NamedExpressionSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpressionSeq(SparkParserParser.NamedExpressionSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SparkParserParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SparkParserParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link SparkParserParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(SparkParserParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link SparkParserParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(SparkParserParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link SparkParserParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterPredicated(SparkParserParser.PredicatedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link SparkParserParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitPredicated(SparkParserParser.PredicatedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exists}
	 * labeled alternative in {@link SparkParserParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterExists(SparkParserParser.ExistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link SparkParserParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitExists(SparkParserParser.ExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link SparkParserParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBinary(SparkParserParser.LogicalBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link SparkParserParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBinary(SparkParserParser.LogicalBinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(SparkParserParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(SparkParserParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link SparkParserParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpressionDefault(SparkParserParser.ValueExpressionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link SparkParserParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpressionDefault(SparkParserParser.ValueExpressionDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link SparkParserParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparison(SparkParserParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link SparkParserParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparison(SparkParserParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link SparkParserParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticBinary(SparkParserParser.ArithmeticBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link SparkParserParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticBinary(SparkParserParser.ArithmeticBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link SparkParserParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticUnary(SparkParserParser.ArithmeticUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link SparkParserParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticUnary(SparkParserParser.ArithmeticUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code struct}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStruct(SparkParserParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code struct}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStruct(SparkParserParser.StructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDereference(SparkParserParser.DereferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDereference(SparkParserParser.DereferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCase(SparkParserParser.SimpleCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCase(SparkParserParser.SimpleCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(SparkParserParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(SparkParserParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterRowConstructor(SparkParserParser.RowConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitRowConstructor(SparkParserParser.RowConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code last}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLast(SparkParserParser.LastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code last}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLast(SparkParserParser.LastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code star}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStar(SparkParserParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code star}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStar(SparkParserParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(SparkParserParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(SparkParserParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryExpression(SparkParserParser.SubqueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryExpression(SparkParserParser.SubqueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cast}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCast(SparkParserParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCast(SparkParserParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefault(SparkParserParser.ConstantDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefault(SparkParserParser.ConstantDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambda(SparkParserParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambda(SparkParserParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(SparkParserParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(SparkParserParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extract}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterExtract(SparkParserParser.ExtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extract}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitExtract(SparkParserParser.ExtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SparkParserParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SparkParserParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSearchedCase(SparkParserParser.SearchedCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSearchedCase(SparkParserParser.SearchedCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code position}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPosition(SparkParserParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code position}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPosition(SparkParserParser.PositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code first}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFirst(SparkParserParser.FirstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code first}
	 * labeled alternative in {@link SparkParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFirst(SparkParserParser.FirstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link SparkParserParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(SparkParserParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link SparkParserParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(SparkParserParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link SparkParserParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterIntervalLiteral(SparkParserParser.IntervalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link SparkParserParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitIntervalLiteral(SparkParserParser.IntervalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link SparkParserParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstructor(SparkParserParser.TypeConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link SparkParserParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstructor(SparkParserParser.TypeConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link SparkParserParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(SparkParserParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link SparkParserParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(SparkParserParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link SparkParserParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(SparkParserParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link SparkParserParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(SparkParserParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link SparkParserParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(SparkParserParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link SparkParserParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(SparkParserParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(SparkParserParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(SparkParserParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperator(SparkParserParser.ArithmeticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperator(SparkParserParser.ArithmeticOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void enterPredicateOperator(SparkParserParser.PredicateOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void exitPredicateOperator(SparkParserParser.PredicateOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(SparkParserParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(SparkParserParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(SparkParserParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(SparkParserParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#intervalField}.
	 * @param ctx the parse tree
	 */
	void enterIntervalField(SparkParserParser.IntervalFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#intervalField}.
	 * @param ctx the parse tree
	 */
	void exitIntervalField(SparkParserParser.IntervalFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void enterIntervalValue(SparkParserParser.IntervalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void exitIntervalValue(SparkParserParser.IntervalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#colPosition}.
	 * @param ctx the parse tree
	 */
	void enterColPosition(SparkParserParser.ColPositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#colPosition}.
	 * @param ctx the parse tree
	 */
	void exitColPosition(SparkParserParser.ColPositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link SparkParserParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterComplexDataType(SparkParserParser.ComplexDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link SparkParserParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitComplexDataType(SparkParserParser.ComplexDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link SparkParserParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveDataType(SparkParserParser.PrimitiveDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link SparkParserParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveDataType(SparkParserParser.PrimitiveDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void enterColTypeList(SparkParserParser.ColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void exitColTypeList(SparkParserParser.ColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#colType}.
	 * @param ctx the parse tree
	 */
	void enterColType(SparkParserParser.ColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#colType}.
	 * @param ctx the parse tree
	 */
	void exitColType(SparkParserParser.ColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#complexColTypeList}.
	 * @param ctx the parse tree
	 */
	void enterComplexColTypeList(SparkParserParser.ComplexColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#complexColTypeList}.
	 * @param ctx the parse tree
	 */
	void exitComplexColTypeList(SparkParserParser.ComplexColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#complexColType}.
	 * @param ctx the parse tree
	 */
	void enterComplexColType(SparkParserParser.ComplexColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#complexColType}.
	 * @param ctx the parse tree
	 */
	void exitComplexColType(SparkParserParser.ComplexColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(SparkParserParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(SparkParserParser.WhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#windows}.
	 * @param ctx the parse tree
	 */
	void enterWindows(SparkParserParser.WindowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#windows}.
	 * @param ctx the parse tree
	 */
	void exitWindows(SparkParserParser.WindowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void enterNamedWindow(SparkParserParser.NamedWindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void exitNamedWindow(SparkParserParser.NamedWindowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link SparkParserParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowRef(SparkParserParser.WindowRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link SparkParserParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowRef(SparkParserParser.WindowRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link SparkParserParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowDef(SparkParserParser.WindowDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link SparkParserParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowDef(SparkParserParser.WindowDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void enterWindowFrame(SparkParserParser.WindowFrameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void exitWindowFrame(SparkParserParser.WindowFrameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void enterFrameBound(SparkParserParser.FrameBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void exitFrameBound(SparkParserParser.FrameBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(SparkParserParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(SparkParserParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SparkParserParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SparkParserParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link SparkParserParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(SparkParserParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link SparkParserParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(SparkParserParser.UnquotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link SparkParserParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifierAlternative(SparkParserParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link SparkParserParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifierAlternative(SparkParserParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifier(SparkParserParser.QuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifier(SparkParserParser.QuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link SparkParserParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(SparkParserParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link SparkParserParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(SparkParserParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SparkParserParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(SparkParserParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SparkParserParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(SparkParserParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link SparkParserParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigIntLiteral(SparkParserParser.BigIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link SparkParserParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigIntLiteral(SparkParserParser.BigIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link SparkParserParser#number}.
	 * @param ctx the parse tree
	 */
	void enterSmallIntLiteral(SparkParserParser.SmallIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link SparkParserParser#number}.
	 * @param ctx the parse tree
	 */
	void exitSmallIntLiteral(SparkParserParser.SmallIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link SparkParserParser#number}.
	 * @param ctx the parse tree
	 */
	void enterTinyIntLiteral(SparkParserParser.TinyIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link SparkParserParser#number}.
	 * @param ctx the parse tree
	 */
	void exitTinyIntLiteral(SparkParserParser.TinyIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link SparkParserParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(SparkParserParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link SparkParserParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(SparkParserParser.DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link SparkParserParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigDecimalLiteral(SparkParserParser.BigDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link SparkParserParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigDecimalLiteral(SparkParserParser.BigDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkParserParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void enterNonReserved(SparkParserParser.NonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkParserParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void exitNonReserved(SparkParserParser.NonReservedContext ctx);
}