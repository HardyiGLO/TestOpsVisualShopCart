
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.testobject.TestObject

import java.util.List

import java.sql.Connection

import com.katalon.plugin.keyword.connection.DBType

import java.sql.ResultSet

import org.apache.poi.ss.usermodel.Workbook

import org.apache.poi.ss.usermodel.Sheet

import org.apache.poi.ss.usermodel.Cell

import java.lang.Object

import org.apache.poi.ss.usermodel.Row

import java.util.Map



def static "sample.Login.loginIntoApplication"(
    	String applicationURL	
     , 	String username	
     , 	String password	) {
    (new sample.Login()).loginIntoApplication(
        	applicationURL
         , 	username
         , 	password)
}


def static "sample.Login.loginIntoApplicationWithGlobalVariable"() {
    (new sample.Login()).loginIntoApplicationWithGlobalVariable()
}


def static "sample.Login.logoutFromApplication"() {
    (new sample.Login()).logoutFromApplication()
}

 /**
	 * Select an option by label.
	 *
	 * @param to The select2 box object that tagged as "select" in the document.
	 * @param option The label of the option needs to select.
	 */ 
def static "sample.Select2.selectOptionByLabel"(
    	TestObject to	
     , 	String option	) {
    (new sample.Select2()).selectOptionByLabel(
        	to
         , 	option)
}

 /**
	 * Select many options by labels. This method just applies for multiple value select boxes.
	 *
	 * @param to The select2 box object that tagged as "select" in the document.
	 * @param options The labels of the options need to select.
	 */ 
def static "sample.Select2.selectManyOptionsByLabel"(
    	TestObject to	
     , 	java.util.List<String> options	) {
    (new sample.Select2()).selectManyOptionsByLabel(
        	to
         , 	options)
}

 /**
	 * Get labels of selected options.
	 *
	 * @param to The select2 box object that tagged as "select" in the document.
	 * @return A labels list of selected options.
	 */ 
def static "sample.Select2.getSelectedOptionsLabel"(
    	TestObject to	) {
    (new sample.Select2()).getSelectedOptionsLabel(
        	to)
}

 /**
	 * Get elements of selected options.
	 *
	 * @param to The select2 box object that tagged as "select" in the document.
	 * @return A list WebElement of selected options.
	 */ 
def static "sample.Select2.getSelectedOptionsList"(
    	TestObject to	) {
    (new sample.Select2()).getSelectedOptionsList(
        	to)
}

 /**
	 * Get labels of all options.
	 *
	 * @param to The select2 box object that tagged as "select" in the document.
	 * @return A list string of all options.
	 */ 
def static "sample.Select2.getAllOptionsLabel"(
    	TestObject to	) {
    (new sample.Select2()).getAllOptionsLabel(
        	to)
}

 /**
	 * Remove selected options. This method just applies for multiple value select boxes.
	 *
	 * @param to The select2 box object that tagged as "select" in the document.
	 * @param options The list of options needs to remove.
	 */ 
def static "sample.Select2.removeOptions"(
    	TestObject to	
     , 	java.util.List<String> options	) {
    (new sample.Select2()).removeOptions(
        	to
         , 	options)
}


def static "sample.Shop.navigatetoDetailPage"(
    	String productName	
     , 	String urlProduct	) {
    (new sample.Shop()).navigatetoDetailPage(
        	productName
         , 	urlProduct)
}


def static "sample.Shop.addToCart"(
    	String productName	
     , 	String urlProduct	) {
    (new sample.Shop()).addToCart(
        	productName
         , 	urlProduct)
}


def static "sample.Shop.applyCouponAndAddToCart"(
    	String productName	
     , 	String urlProduct	
     , 	String coupon	) {
    (new sample.Shop()).applyCouponAndAddToCart(
        	productName
         , 	urlProduct
         , 	coupon)
}


def static "sample.Shop.addToCartWithGlobalVariable"() {
    (new sample.Shop()).addToCartWithGlobalVariable()
}


def static "sample.Shop.applyCouponAndAddToCartWithGlobalVariable"() {
    (new sample.Shop()).applyCouponAndAddToCartWithGlobalVariable()
}


def static "sample.Checkout.CheckoutShop"(
    	String firstName	
     , 	String lastName	
     , 	String companyName	
     , 	String country	
     , 	String address	
     , 	String city	
     , 	String postCode	
     , 	String Phone	) {
    (new sample.Checkout()).CheckoutShop(
        	firstName
         , 	lastName
         , 	companyName
         , 	country
         , 	address
         , 	city
         , 	postCode
         , 	Phone)
}


def static "sample.Checkout.CheckoutShopWithGlobalVariable"() {
    (new sample.Checkout()).CheckoutShopWithGlobalVariable()
}

 /**
	 * Click on select2 text box.
	 *
	 * @param to The select2 box object that tagged as "select" in the document.
	 */ 
def static "sample.Utils.clickOnSelect2"(
    	TestObject to	) {
    (new sample.Utils()).clickOnSelect2(
        	to)
}

 /**
	 * Find the container class after the select element.
	 *
	 * @param to The select2 box object that tagged as "select" in the document.
	 * @return The WebElement that seen as container class after the select element.
	 */ 
def static "sample.Utils.findContainer"(
    	TestObject to	) {
    (new sample.Utils()).findContainer(
        	to)
}

 /**
	 * Select the result after filling text search to select2 text box.
	 *
	 * @param option The label of option need to select.
	 * @param subContainerOpenClass The Xpath string of the container class.
	 */ 
def static "sample.Utils.selectResult"(
    	String option	
     , 	String subContainerOpenClass	) {
    (new sample.Utils()).selectResult(
        	option
         , 	subContainerOpenClass)
}

 /**
	 * Enter text search to the select2 text box.
	 *
	 * @param option The label of option need to search.
	 * @return The Xpath string of the container class.
	 */ 
def static "sample.Utils.enterText"(
    	String option	) {
    (new sample.Utils()).enterText(
        	option)
}


def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.execute"(
    	Connection conn	
     , 	String queryString	) {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).execute(
        	conn
         , 	queryString)
}


def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.executeQuery"(
    	Connection conn	
     , 	String queryString	) {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).executeQuery(
        	conn
         , 	queryString)
}


def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.closeConnection"(
    	Connection conn	) {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).closeConnection(
        	conn)
}


def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.executeUpdate"(
    	Connection conn	
     , 	String queryString	) {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).executeUpdate(
        	conn
         , 	queryString)
}


def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.createConnection"(
    	DBType type	
     , 	String server	
     , 	String port	
     , 	String dbName	
     , 	String userName	
     , 	String Password	) {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).createConnection(
        	type
         , 	server
         , 	port
         , 	dbName
         , 	userName
         , 	Password)
}


def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.getGlobalConnection"() {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).getGlobalConnection()
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getColumnCount"(
    	ResultSet rs	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getColumnCount(
        	rs)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getRowCount"(
    	ResultSet rs	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getRowCount(
        	rs)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getListCellValue"(
    	ResultSet rs	
     , 	String columnName	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getListCellValue(
        	rs
         , 	columnName)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getListCellValue"(
    	ResultSet rs	
     , 	int columnIndex	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getListCellValue(
        	rs
         , 	columnIndex)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.isEmptyResult"(
    	ResultSet rs	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).isEmptyResult(
        	rs)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleRowValue"(
    	ResultSet rs	
     , 	int rowIndex	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getSingleRowValue(
        	rs
         , 	rowIndex)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getListRowValue"(
    	ResultSet rs	
     , 	int fromRowIndex	
     , 	int toRowIndex	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getListRowValue(
        	rs
         , 	fromRowIndex
         , 	toRowIndex)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleCellValue"(
    	ResultSet rs	
     , 	int rowIndex	
     , 	String columnName	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getSingleCellValue(
        	rs
         , 	rowIndex
         , 	columnName)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleCellValue"(
    	ResultSet rs	
     , 	int rowIndex	
     , 	int colIndex	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getSingleCellValue(
        	rs
         , 	rowIndex
         , 	colIndex)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.exportToCSV"(
    	ResultSet rs	
     , 	String pathFile	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).exportToCSV(
        	rs
         , 	pathFile)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.resultSetToArrayList"(
    	ResultSet rs	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).resultSetToArrayList(
        	rs)
}


def static "com.katalon.plugin.keyword.generator.DataFileKeywords.createUsingInternalConnection"(
    	String fileName	
     , 	String query	
     , 	String user	
     , 	String password	
     , 	DBType dbType	
     , 	String host	
     , 	String port	
     , 	String dbName	) {
    (new com.katalon.plugin.keyword.generator.DataFileKeywords()).createUsingInternalConnection(
        	fileName
         , 	query
         , 	user
         , 	password
         , 	dbType
         , 	host
         , 	port
         , 	dbName)
}


def static "com.katalon.plugin.keyword.generator.DataFileKeywords.createUsingGlobalConnection"(
    	String fileName	
     , 	String query	) {
    (new com.katalon.plugin.keyword.generator.DataFileKeywords()).createUsingGlobalConnection(
        	fileName
         , 	query)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelFile"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelFile(
        	filePath)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelSheets"(
    	Workbook workbook	
     , 	java.util.List<String> sheetNames	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelSheets(
        	workbook
         , 	sheetNames)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelSheet"(
    	Workbook workbook	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelSheet(
        	workbook)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelSheet"(
    	Workbook workbook	
     , 	String sheetName	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelSheet(
        	workbook
         , 	sheetName)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.saveWorkbook"(
    	String filePath	
     , 	Workbook workbook	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).saveWorkbook(
        	filePath
         , 	workbook)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.createWorkbook"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createWorkbook(
        	filePath)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getSheetNames"(
    	Workbook workbook	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getSheetNames(
        	workbook)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getWorkbook"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getWorkbook(
        	filePath)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellByAddress"(
    	Sheet sheet	
     , 	String cellAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellByAddress(
        	sheet
         , 	cellAddress)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	Workbook wbs	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	wbs)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	filePath)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	Workbook wbs	
     , 	String sheetName	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	wbs
         , 	sheetName)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	String filePath	
     , 	int sheetIndex	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	filePath
         , 	sheetIndex)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellByIndex"(
    	Sheet sheet	
     , 	int rowIdx	
     , 	int colIdx	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellByIndex(
        	sheet
         , 	rowIdx
         , 	colIdx)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValue"(
    	Cell cell	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValue(
        	cell)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.locateCell"(
    	Sheet sheet	
     , 	Object cellContent	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).locateCell(
        	sheet
         , 	cellContent)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getTableContent"(
    	Sheet sheet	
     , 	int startRow	
     , 	int endRow	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getTableContent(
        	sheet
         , 	startRow
         , 	endRow)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getDataRows"(
    	Sheet sheet	
     , 	java.util.List<java.lang.Integer> rowIndexs	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getDataRows(
        	sheet
         , 	rowIndexs)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoRows"(
    	Row row1	
     , 	Row row2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoRows(
        	row1
         , 	row2
         , 	isValueOnly)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoRows"(
    	Row row1	
     , 	Row row2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoRows(
        	row1
         , 	row2)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getColumnsByIndex"(
    	Sheet sheet	
     , 	java.util.List<java.lang.Integer> columnIndexes	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getColumnsByIndex(
        	sheet
         , 	columnIndexes)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoSheets"(
    	Sheet sheet1	
     , 	Sheet sheet2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoSheets(
        	sheet1
         , 	sheet2)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoSheets"(
    	Sheet sheet1	
     , 	Sheet sheet2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoSheets(
        	sheet1
         , 	sheet2
         , 	isValueOnly)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoExcels"(
    	Workbook workbook1	
     , 	Workbook workbook2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoExcels(
        	workbook1
         , 	workbook2)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoExcels"(
    	Workbook workbook1	
     , 	Workbook workbook2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoExcels(
        	workbook1
         , 	workbook2
         , 	isValueOnly)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoCells"(
    	Cell cell1	
     , 	Cell cell2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoCells(
        	cell1
         , 	cell2
         , 	isValueOnly)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoCells"(
    	Cell cell1	
     , 	Cell cell2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoCells(
        	cell1
         , 	cell2)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByAddresses"(
    	Sheet sheet	
     , 	Map content	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).setValueToCellByAddresses(
        	sheet
         , 	content)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByIndex"(
    	Sheet sheet	
     , 	int rowIndex	
     , 	int colIndex	
     , 	Object value	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).setValueToCellByIndex(
        	sheet
         , 	rowIndex
         , 	colIndex
         , 	value)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheetByName"(
    	String filePath	
     , 	String sheetName	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheetByName(
        	filePath
         , 	sheetName)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getRowIndexByCellContent"(
    	Sheet sheet	
     , 	String cellContent	
     , 	int columnIdxForCell	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getRowIndexByCellContent(
        	sheet
         , 	cellContent
         , 	columnIdxForCell)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByAddress"(
    	Sheet sheet	
     , 	String cellAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValueByAddress(
        	sheet
         , 	cellAddress)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByRangeAddress"(
    	Sheet sheet	
     , 	String topLeftAddress	
     , 	String rightBottomAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValueByRangeAddress(
        	sheet
         , 	topLeftAddress
         , 	rightBottomAddress)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByAddress"(
    	Sheet sheet	
     , 	String cellAddress	
     , 	Object value	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).setValueToCellByAddress(
        	sheet
         , 	cellAddress
         , 	value)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValuesByRangeIndexes"(
    	Sheet sheet	
     , 	int rowInd1	
     , 	int colInd1	
     , 	int rowInd2	
     , 	int colInd2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValuesByRangeIndexes(
        	sheet
         , 	rowInd1
         , 	colInd1
         , 	rowInd2
         , 	colInd2)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellIndexByAddress"(
    	Sheet sheet	
     , 	String cellAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellIndexByAddress(
        	sheet
         , 	cellAddress)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getMapOfKeyValueRows"(
    	Sheet sheet	
     , 	int keyRowIdx	
     , 	int valueRowIdx	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getMapOfKeyValueRows(
        	sheet
         , 	keyRowIdx
         , 	valueRowIdx)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByIndex"(
    	Sheet sheet	
     , 	int rowIdx	
     , 	int colIdx	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValueByIndex(
        	sheet
         , 	rowIdx
         , 	colIdx)
}
