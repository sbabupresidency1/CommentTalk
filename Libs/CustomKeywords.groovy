
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.testobject.TestObject

import java.util.ArrayList

import java.util.HashMap

import java.util.List

import com.kms.katalon.core.model.FailureHandling

import java.sql.Connection

import com.katalon.plugin.keyword.connection.DBType

import java.sql.ResultSet

import org.openqa.selenium.By


def static "mfa.readMFA.GetMFAToken"(
    	String secret	) {
    (new mfa.readMFA()).GetMFAToken(
        	secret)
}

def static "com.kms.katalon.webui.keyword.vuejs.ModalKeywords.clickConfirmButtonByText"(
    	TestObject toModalContainer	
     , 	String buttonText	) {
    (new com.kms.katalon.webui.keyword.vuejs.ModalKeywords()).clickConfirmButtonByText(
        	toModalContainer
         , 	buttonText)
}

def static "com.kms.katalon.webui.keyword.vuejs.ModalKeywords.clickConfirmButtonByText"(
    	TestObject toModalContainer	) {
    (new com.kms.katalon.webui.keyword.vuejs.ModalKeywords()).clickConfirmButtonByText(
        	toModalContainer)
}

def static "com.kms.katalon.webui.keyword.vuejs.ModalKeywords.getModalTitleText"(
    	TestObject toModalContainer	) {
    (new com.kms.katalon.webui.keyword.vuejs.ModalKeywords()).getModalTitleText(
        	toModalContainer)
}

def static "com.kms.katalon.webui.keyword.vuejs.ModalKeywords.getModalContentText"(
    	TestObject toModalContainer	) {
    (new com.kms.katalon.webui.keyword.vuejs.ModalKeywords()).getModalContentText(
        	toModalContainer)
}

def static "com.kms.katalon.keyword.uploadfile.UploadFile.uploadFile"(
    	TestObject object	
     , 	String file	) {
    (new com.kms.katalon.keyword.uploadfile.UploadFile()).uploadFile(
        	object
         , 	file)
}

def static "com.kms.katalon.keyword.uploadfile.UploadFile.uploadFileUsingRobot"(
    	TestObject object	
     , 	String file	) {
    (new com.kms.katalon.keyword.uploadfile.UploadFile()).uploadFileUsingRobot(
        	object
         , 	file)
}

def static "com.kms.katalon.keyword.testsuite.RerunKeyword.createFile"(
    	String fullPathWithoutExtension	
     , 	String template	
     , 	String extension	) {
    (new com.kms.katalon.keyword.testsuite.RerunKeyword()).createFile(
        	fullPathWithoutExtension
         , 	template
         , 	extension)
}

def static "com.kms.katalon.keyword.testsuite.RerunKeyword.deleteTestSuite"(
    	String testSuiteName	) {
    (new com.kms.katalon.keyword.testsuite.RerunKeyword()).deleteTestSuite(
        	testSuiteName)
}

def static "com.kms.katalon.keyword.testsuite.RerunKeyword.getExecutedBrowser"() {
    (new com.kms.katalon.keyword.testsuite.RerunKeyword()).getExecutedBrowser()
}

def static "com.kms.katalon.keyword.testsuite.RerunKeyword.isStringBelongToList"(
    	String text	
     , 	java.util.ArrayList<String> list	) {
    (new com.kms.katalon.keyword.testsuite.RerunKeyword()).isStringBelongToList(
        	text
         , 	list)
}

def static "com.kms.katalon.keyword.testsuite.RerunKeyword.replaceFailedRowsForBindingData"(
    	java.util.HashMap<String, java.util.List<java.lang.Integer>> listFailedRowsBelongToTC	
     , 	String testCaseTemp	) {
    (new com.kms.katalon.keyword.testsuite.RerunKeyword()).replaceFailedRowsForBindingData(
        	listFailedRowsBelongToTC
         , 	testCaseTemp)
}

def static "com.kms.katalon.keyword.testsuite.RerunKeyword.getProjectFileName"() {
    (new com.kms.katalon.keyword.testsuite.RerunKeyword()).getProjectFileName()
}

def static "com.kms.katalon.keyword.testsuite.RerunKeyword.createConsoleModeFile"(
    	String relativeTestSuitePath	) {
    (new com.kms.katalon.keyword.testsuite.RerunKeyword()).createConsoleModeFile(
        	relativeTestSuitePath)
}

def static "com.kms.katalon.keyword.testsuite.RerunKeyword.getListExecutedRows"(
    	String testCaseId	
     , 	String iterationType	
     , 	String iterationValue	
     , 	int dataTotalRows	) {
    (new com.kms.katalon.keyword.testsuite.RerunKeyword()).getListExecutedRows(
        	testCaseId
         , 	iterationType
         , 	iterationValue
         , 	dataTotalRows)
}

def static "com.kms.katalon.keyword.testsuite.RerunKeyword.createNameForNewSuite"(
    	String oldTestSuitePath	) {
    (new com.kms.katalon.keyword.testsuite.RerunKeyword()).createNameForNewSuite(
        	oldTestSuitePath)
}

def static "com.kms.katalon.keyword.testsuite.RerunKeyword.replaceTSTemplateWithListNewTC"(
    	String oldTSTemplate	
     , 	String newTCList	) {
    (new com.kms.katalon.keyword.testsuite.RerunKeyword()).replaceTSTemplateWithListNewTC(
        	oldTSTemplate
         , 	newTCList)
}

def static "com.kms.katalon.keyword.testsuite.RerunKeyword.removeTCPassedAndReplaceFailedRows"(
    	String oldTSTemplate	
     , 	java.util.List<String> listFailTestCases	
     , 	java.util.HashMap<String, java.util.List<java.lang.Integer>> listFailedRowsBelongToTC	) {
    (new com.kms.katalon.keyword.testsuite.RerunKeyword()).removeTCPassedAndReplaceFailedRows(
        	oldTSTemplate
         , 	listFailTestCases
         , 	listFailedRowsBelongToTC)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.baselineImage"(
    	String filename	
     , 	String baselineDir	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).baselineImage(
        	filename
         , 	baselineDir)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.baselineImage"(
    	String filename	
     , 	String baselineDir	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).baselineImage(
        	filename
         , 	baselineDir
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeScreenshot"(
    	String filename	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeScreenshot(
        	filename
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeScreenshot"(
    	String filename	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeScreenshot(
        	filename)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeCuttingScreenshot"(
    	String filename	
     , 	int headerToCut	
     , 	int footerToCut	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeCuttingScreenshot(
        	filename
         , 	headerToCut
         , 	footerToCut
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeCuttingScreenshot"(
    	String filename	
     , 	int headerToCut	
     , 	int footerToCut	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeCuttingScreenshot(
        	filename
         , 	headerToCut
         , 	footerToCut)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeWebElementScreenshot"(
    	TestObject object	
     , 	String filename	
     , 	int timeout	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeWebElementScreenshot(
        	object
         , 	filename
         , 	timeout)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeWebElementScreenshot"(
    	TestObject object	
     , 	String filename	
     , 	int timeout	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeWebElementScreenshot(
        	object
         , 	filename
         , 	timeout
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeWebElementScreenshot"(
    	TestObject object	
     , 	String filename	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeWebElementScreenshot(
        	object
         , 	filename)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot"(
    	String filename	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeEntirePageScreenshot(
        	filename
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot"(
    	String filename	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeEntirePageScreenshot(
        	filename)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeWebElementsScreenshot"(
    	java.util.List<TestObject> objects	
     , 	String filename	
     , 	int timeout	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeWebElementsScreenshot(
        	objects
         , 	filename
         , 	timeout
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeWebElementsScreenshot"(
    	java.util.List<TestObject> objects	
     , 	String filename	
     , 	int timeout	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeWebElementsScreenshot(
        	objects
         , 	filename
         , 	timeout)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeWebElementsScreenshot"(
    	java.util.List<TestObject> objects	
     , 	String filename	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeWebElementsScreenshot(
        	objects
         , 	filename)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeScalingScreenshot"(
    	String filename	
     , 	float dpr	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeScalingScreenshot(
        	filename
         , 	dpr)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeScalingScreenshot"(
    	String filename	
     , 	float dpr	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeScalingScreenshot(
        	filename
         , 	dpr
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeElementScreenshotIgnoringAreas"(
    	TestObject object	
     , 	String filename	
     , 	java.util.List<TestObject> ignoreObjs	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeElementScreenshotIgnoringAreas(
        	object
         , 	filename
         , 	ignoreObjs)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeElementScreenshotIgnoringAreas"(
    	TestObject object	
     , 	String filename	
     , 	java.util.List<TestObject> ignoreObjs	
     , 	int timeout	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeElementScreenshotIgnoringAreas(
        	object
         , 	filename
         , 	ignoreObjs
         , 	timeout)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeElementScreenshotIgnoringAreas"(
    	TestObject object	
     , 	String filename	
     , 	java.util.List<TestObject> ignoreObjs	
     , 	int timeout	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeElementScreenshotIgnoringAreas(
        	object
         , 	filename
         , 	ignoreObjs
         , 	timeout
         , 	flowControl)
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

def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.closeConnection"(
    	Connection conn	) {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).closeConnection(
        	conn)
}

def static "com.katalon.plugin.keyword.generator.DataFileKeywords.createUsingGlobalConnection"(
    	String fileName	
     , 	String query	) {
    (new com.katalon.plugin.keyword.generator.DataFileKeywords()).createUsingGlobalConnection(
        	fileName
         , 	query)
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

def static "kms.turing.katalon.plugins.visualtesting.ImageComparison.verifyMatchBaseline"(
    	String filename	
     , 	String baselinePath	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ImageComparison()).verifyMatchBaseline(
        	filename
         , 	baselinePath
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.visualtesting.ImageComparison.verifyMatchBaseline"(
    	String filename	
     , 	String baselinePath	) {
    (new kms.turing.katalon.plugins.visualtesting.ImageComparison()).verifyMatchBaseline(
        	filename
         , 	baselinePath)
}

def static "kms.turing.katalon.plugins.visualtesting.ImageComparison.getDifferenceRatio"(
    	String expected	
     , 	String actual	) {
    (new kms.turing.katalon.plugins.visualtesting.ImageComparison()).getDifferenceRatio(
        	expected
         , 	actual)
}

def static "kms.turing.katalon.plugins.visualtesting.ImageComparison.getDifferenceRatio"(
    	String expected	
     , 	String actual	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ImageComparison()).getDifferenceRatio(
        	expected
         , 	actual
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.visualtesting.ImageComparison.areMatched"(
    	String expectedImgPath	
     , 	String actualImgPath	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ImageComparison()).areMatched(
        	expectedImgPath
         , 	actualImgPath
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.visualtesting.ImageComparison.areMatched"(
    	String expectedImgPath	
     , 	String actualImgPath	) {
    (new kms.turing.katalon.plugins.visualtesting.ImageComparison()).areMatched(
        	expectedImgPath
         , 	actualImgPath)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getDayOfWeek"(
    	String date	
     , 	String dateFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getDayOfWeek(
        	date
         , 	dateFormat)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getDuration"(
    	String startTime	
     , 	String endTime	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getDuration(
        	startTime
         , 	endTime)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getDefaultTimeZone"() {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getDefaultTimeZone()
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.addDays"(
    	String stringDate	
     , 	String dateFormat	
     , 	int amount	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).addDays(
        	stringDate
         , 	dateFormat
         , 	amount)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getCurrentDate"() {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getCurrentDate()
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getFutureTime"(
    	int hrs	
     , 	int minute	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getFutureTime(
        	hrs
         , 	minute)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getCurrentMonth"() {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getCurrentMonth()
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getCurrentYear"() {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getCurrentYear()
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.formatStringDate"(
    	String value	
     , 	String currentFormat	
     , 	String newFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).formatStringDate(
        	value
         , 	currentFormat
         , 	newFormat)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getPastTime"(
    	int hrs	
     , 	int minute	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getPastTime(
        	hrs
         , 	minute)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.setDefaultTimeZone"(
    	String timeZoneId	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).setDefaultTimeZone(
        	timeZoneId)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.convertString2Date"(
    	String value	
     , 	String dateTimeFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).convertString2Date(
        	value
         , 	dateTimeFormat)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getFutureDateTime"(
    	int noOfDays	
     , 	String timeZoneId	
     , 	String dateTimeFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getFutureDateTime(
        	noOfDays
         , 	timeZoneId
         , 	dateTimeFormat)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getCurrentDateTime"(
    	String timeZoneId	
     , 	String dateTimeFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getCurrentDateTime(
        	timeZoneId
         , 	dateTimeFormat)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getPreviousDateTime"(
    	int noOfDays	
     , 	String timeZoneId	
     , 	String dateTimeFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getPreviousDateTime(
        	noOfDays
         , 	timeZoneId
         , 	dateTimeFormat)
}

def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getRowCount"(
    	ResultSet rs	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getRowCount(
        	rs)
}

def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getColumnCount"(
    	ResultSet rs	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getColumnCount(
        	rs)
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

def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.exportToCSV"(
    	ResultSet rs	
     , 	String pathFile	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).exportToCSV(
        	rs
         , 	pathFile)
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

def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.resultSetToArrayList"(
    	ResultSet rs	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).resultSetToArrayList(
        	rs)
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

def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleRowValue"(
    	ResultSet rs	
     , 	int rowIndex	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getSingleRowValue(
        	rs
         , 	rowIndex)
}

def static "qss.evenCheck.evenNumberCheck"(
    	int number	) {
    (new qss.evenCheck()).evenNumberCheck(
        	number)
}

def static "com.katalon.plugin.keyword.waitforangular.WaitForAngularKeywords.waitForAngularLoad"() {
    (new com.katalon.plugin.keyword.waitforangular.WaitForAngularKeywords()).waitForAngularLoad()
}

def static "com.katalon.plugin.keyword.waitforangular.WaitForAngularKeywords.findWebElementBy"(
    	By by	) {
    (new com.katalon.plugin.keyword.waitforangular.WaitForAngularKeywords()).findWebElementBy(
        	by)
}

def static "com.katalon.plugin.keyword.waitforangular.WaitForAngularKeywords.initNgDriver"() {
    (new com.katalon.plugin.keyword.waitforangular.WaitForAngularKeywords()).initNgDriver()
}

def static "com.kms.katalon.keyword.draganddrop.DragAndDropKeywords.dragAndDropBy"(
    	TestObject sourceObject	
     , 	TestObject destinationObject	
     , 	int xOffset	
     , 	int yOffset	) {
    (new com.kms.katalon.keyword.draganddrop.DragAndDropKeywords()).dragAndDropBy(
        	sourceObject
         , 	destinationObject
         , 	xOffset
         , 	yOffset)
}

def static "com.kms.katalon.keyword.draganddrop.DragAndDropKeywords.dragAndDropHtml5"(
    	TestObject sourceObject	
     , 	TestObject destinationObject	) {
    (new com.kms.katalon.keyword.draganddrop.DragAndDropKeywords()).dragAndDropHtml5(
        	sourceObject
         , 	destinationObject)
}

def static "com.kms.katalon.keyword.draganddrop.DragAndDropKeywords.dragAndDrop"(
    	TestObject sourceObject	
     , 	TestObject destinationObject	) {
    (new com.kms.katalon.keyword.draganddrop.DragAndDropKeywords()).dragAndDrop(
        	sourceObject
         , 	destinationObject)
}

def static "com.kms.katalon.keyword.draganddrop.DragAndDropKeywords.dragAndDropJquery"(
    	TestObject sourceObject	
     , 	TestObject destinationObject	) {
    (new com.kms.katalon.keyword.draganddrop.DragAndDropKeywords()).dragAndDropJquery(
        	sourceObject
         , 	destinationObject)
}

def static "com.kms.katalon.keyword.select2.Utils.clickOnSelect2"(
    	TestObject to	) {
    (new com.kms.katalon.keyword.select2.Utils()).clickOnSelect2(
        	to)
}

def static "com.kms.katalon.keyword.select2.Utils.selectResult"(
    	String option	
     , 	String subContainerOpenClass	) {
    (new com.kms.katalon.keyword.select2.Utils()).selectResult(
        	option
         , 	subContainerOpenClass)
}

def static "com.kms.katalon.keyword.select2.Utils.enterText"(
    	String option	) {
    (new com.kms.katalon.keyword.select2.Utils()).enterText(
        	option)
}

def static "com.kms.katalon.keyword.select2.Utils.findContainer"(
    	TestObject to	) {
    (new com.kms.katalon.keyword.select2.Utils()).findContainer(
        	to)
}

def static "com.katalon.plugin.keyword.zip.ZipKeywords.zipFile"(
    	String file	) {
    (new com.katalon.plugin.keyword.zip.ZipKeywords()).zipFile(
        	file)
}

def static "com.katalon.plugin.keyword.zip.ZipKeywords.unZip"(
    	String file	
     , 	String password	) {
    (new com.katalon.plugin.keyword.zip.ZipKeywords()).unZip(
        	file
         , 	password)
}

def static "com.katalon.plugin.keyword.zip.ZipKeywords.zipFolder"(
    	String path	) {
    (new com.katalon.plugin.keyword.zip.ZipKeywords()).zipFolder(
        	path)
}

def static "com.katalon.plugin.keyword.zip.ZipKeywords.initZipParameter"() {
    (new com.katalon.plugin.keyword.zip.ZipKeywords()).initZipParameter()
}

def static "com.katalon.plugin.keyword.zip.ZipKeywords.createZipFile"(
    	String path	) {
    (new com.katalon.plugin.keyword.zip.ZipKeywords()).createZipFile(
        	path)
}

def static "com.kms.katalon.keyword.select2.Select2.selectOptionByLabel"(
    	TestObject to	
     , 	String option	) {
    (new com.kms.katalon.keyword.select2.Select2()).selectOptionByLabel(
        	to
         , 	option)
}

def static "com.kms.katalon.keyword.select2.Select2.removeOptions"(
    	TestObject to	
     , 	java.util.List<String> options	) {
    (new com.kms.katalon.keyword.select2.Select2()).removeOptions(
        	to
         , 	options)
}

def static "com.kms.katalon.keyword.select2.Select2.selectManyOptionsByLabel"(
    	TestObject to	
     , 	java.util.List<String> options	) {
    (new com.kms.katalon.keyword.select2.Select2()).selectManyOptionsByLabel(
        	to
         , 	options)
}

def static "com.kms.katalon.keyword.select2.Select2.getSelectedOptionsLabel"(
    	TestObject to	) {
    (new com.kms.katalon.keyword.select2.Select2()).getSelectedOptionsLabel(
        	to)
}

def static "com.kms.katalon.keyword.select2.Select2.getSelectedOptionsList"(
    	TestObject to	) {
    (new com.kms.katalon.keyword.select2.Select2()).getSelectedOptionsList(
        	to)
}

def static "com.kms.katalon.keyword.select2.Select2.getAllOptionsLabel"(
    	TestObject to	) {
    (new com.kms.katalon.keyword.select2.Select2()).getAllOptionsLabel(
        	to)
}
