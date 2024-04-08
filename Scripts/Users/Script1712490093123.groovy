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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

not_run: WebUI.callTestCase(findTestCase('Unifiller Login/Login - Negative Scenarios'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Customer'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Users/Page_Unifiller Content Management System/a_Users'))

WebUI.click(findTestObject('Object Repository/Users/Page_Unifiller Content Management System/button_Add New'))

def firstname = org.apache.commons.lang.RandomStringUtils.randomAlphabetic(4)

WebUI.setText(findTestObject('Object Repository/Users/Page_Unifiller Content Management System/input__firstName'), firstname)

def lastname = org.apache.commons.lang.RandomStringUtils.randomAlphabetic(4)

WebUI.setText(findTestObject('Object Repository/Users/Page_Unifiller Content Management System/input__lastName'), lastname)

int rn

rn = ((Math.random() * 5000) as int)

String ab

ab = (('ujjwal' + rn) + '@mailinator.com')

WebUI.setText(findTestObject('Object Repository/Users/Page_Unifiller Content Management System/input__email'), ab)

WebUI.click(findTestObject('Object Repository/Users/Page_Unifiller Content Management System/div_Select location'))

WebUI.click(findTestObject('Object Repository/Users/Page_Unifiller Content Management System/div_Other_1'))

WebUI.click(findTestObject('Object Repository/Users/Page_Unifiller Content Management System/button_Save'))

WebUI.setText(findTestObject('Object Repository/Users/Page_Unifiller Content Management System/input_Who are you looking for_machine-search'), 
    (firstname + ' ') + lastname)

WebUI.click(findTestObject('Object Repository/Users/Page_Unifiller Content Management System/img'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Users/Page_Unifiller Content Management System/div_Select a department'))

WebUI.click(findTestObject('Object Repository/Users/Page_Unifiller Content Management System/div_Unifiller Team_1'))

WebUI.click(findTestObject('Object Repository/Users/Page_Unifiller Content Management System/div_Select a location_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Users/Page_Unifiller Content Management System/div_Other_1_2'))

WebUI.click(findTestObject('Object Repository/Users/Page_Unifiller Content Management System/div_Select a role_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Users/Page_Unifiller Content Management System/div_Super Admin'))

WebUI.click(findTestObject('Object Repository/Users/Page_Unifiller Content Management System/span_Name'))

WebUI.click(findTestObject('Object Repository/Users/Page_Unifiller Content Management System/span_Email'))

WebUI.click(findTestObject('Object Repository/Users/Page_Unifiller Content Management System/img_Super Admin_resetFiltersImg__exLYu'))

WebUI.click(findTestObject('Object Repository/Users/Page_Unifiller Content Management System/img_1'))

WebUI.closeBrowser()

