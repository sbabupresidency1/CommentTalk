import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://uat.commenttalk.com/#/category-comments')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Comment Talk/a_Technology'))

WebUI.click(findTestObject('Object Repository/Page_Comment Talk/a_Business'))

WebUI.click(findTestObject('Object Repository/Page_Comment Talk/a_Entertainment'))

WebUI.click(findTestObject('Object Repository/Page_Comment Talk/a_World'))

WebUI.click(findTestObject('Object Repository/Page_Comment Talk/a_Book'))

WebUI.click(findTestObject('Object Repository/Page_Comment Talk/a_Sports'))

WebUI.click(findTestObject('Object Repository/Page_Comment Talk/a_Games'))

WebUI.click(findTestObject('Object Repository/Page_Comment Talk/a_News'))

WebUI.click(findTestObject('Object Repository/Page_Comment Talk/a_Arts  Entertainment'))

WebUI.click(findTestObject('Object Repository/Page_Comment Talk/a_Politics'))

WebUI.click(findTestObject('Object Repository/Page_Comment Talk/a_Health'))

WebUI.click(findTestObject('Object Repository/Page_Comment Talk/a_Travel'))

WebUI.click(findTestObject('Object Repository/Page_Comment Talk/a_Science'))

WebUI.click(findTestObject('Object Repository/Page_Comment Talk/a_Environment'))

WebUI.click(findTestObject('Object Repository/Page_Comment Talk/a_Shopping'))

WebUI.click(findTestObject('Object Repository/Page_Comment Talk/a_Pets'))

WebUI.click(findTestObject('Object Repository/Page_Comment Talk/a_Technology'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Comment Talk/select_SelectLast 24hrsLast WeekLast MonthL_a346f6'), 
    'today', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Comment Talk/select_SelectLast 24hrsLast WeekLast MonthL_a346f6'), 
    'week', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Comment Talk/select_SelectLast 24hrsLast WeekLast MonthL_a346f6'), 
    'month', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Comment Talk/select_SelectLast 24hrsLast WeekLast MonthL_a346f6'), 
    'year', true)

WebUI.click(findTestObject('Object Repository/Page_Comment Talk/a_Comments'))

WebUI.click(findTestObject('Object Repository/Page_Comment Talk/p'))

WebUI.setText(findTestObject('Object Repository/Page_Comment Talk/div_asdfag'), 'asdfag')

WebUI.click(findTestObject('Object Repository/Page_Comment Talk/button_Post'))

WebUI.click(findTestObject('Object Repository/Page_Comment Talk/div_Login to Post your comment'))

WebUI.click(findTestObject('Object Repository/Page_Comment Talk/i_clear'))

WebUI.click(findTestObject('Object Repository/Page_Comment Talk/i_thumb_up'))

WebUI.click(findTestObject('Object Repository/Page_Comment Talk/i_clear'))

WebUI.click(findTestObject('Object Repository/Page_Comment Talk/i_thumb_down'))

WebUI.click(findTestObject('Object Repository/Page_Comment Talk/i_clear'))

WebUI.click(findTestObject('Object Repository/Page_Comment Talk/a_comment 97'))

WebUI.click(findTestObject('Object Repository/Page_Comment Talk/a_bookmark Bookmark'))

WebUI.click(findTestObject('Object Repository/Page_Comment Talk/i_clear'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Comment Talk/i_reply'), 0)

WebUI.click(findTestObject('Object Repository/Page_Comment Talk/i_reply'))

WebUI.click(findTestObject('Object Repository/Page_Comment Talk/p_1'))

WebUI.setText(findTestObject('Object Repository/Page_Comment Talk/div_zdghdfh'), 'zdghdfh')

WebUI.click(findTestObject('Object Repository/Page_Comment Talk/i_send'))

WebUI.click(findTestObject('Object Repository/Page_Comment Talk/button_Clik to Login'))

WebUI.closeBrowser()

