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

WebUI.callTestCase(findTestCase('Users'), [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Unifiller Login/Login - Negative Scenarios'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Content Management System/Page_Unifiller Content Management System/a_Content Management'))

WebUI.click(findTestObject('Object Repository/Content Management System/Page_Unifiller Content Management System/div_Alphabetically A-Z'))

WebUI.click(findTestObject('Object Repository/Content Management System/Page_Unifiller Content Management System/div_Alphabetically Z-A'))

WebUI.click(findTestObject('Object Repository/Content Management System/Page_Unifiller Content Management System/div_Alphabetically Z-A_1'))

WebUI.click(findTestObject('Object Repository/Content Management System/Page_Unifiller Content Management System/div_Alphabetically A-Z_1'))

WebUI.click(findTestObject('Object Repository/Content Management System/Page_Unifiller Content Management System/div_3 Categories  6 Sub-Categories  3 Versions'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Content Management System/Page_Unifiller Content Management System/img'))

def name = org.apache.commons.lang.RandomStringUtils.randomAlphabetic(4)

WebUI.setText(findTestObject('Object Repository/Content Management System/Page_Unifiller Content Management System/input_Machine_machineName'), 
    name)

WebUI.click(findTestObject('Object Repository/Content Management System/Page_Unifiller Content Management System/button_Save'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Content Management System/Page_Unifiller Content Management System/div_Add New'))

def categoryname = org.apache.commons.lang.RandomStringUtils.randomAlphabetic(4)

WebUI.setText(findTestObject('Object Repository/Content Management System/Page_Unifiller Content Management System/input__category'), 
    categoryname)

def subcategoryname = org.apache.commons.lang.RandomStringUtils.randomAlphabetic(4)

WebUI.setText(findTestObject('Object Repository/Content Management System/Page_Unifiller Content Management System/input__subCategory'), 
    subcategoryname)

WebUI.click(findTestObject('Object Repository/Content Management System/Page_Unifiller Content Management System/button_Save'))

WebUI.delay(3)

WebUI.click(findTestObject('Content Management System/Page_Unifiller Content Management System/button_Add New1'))

def subcategoryname2 = org.apache.commons.lang.RandomStringUtils.randomAlphabetic(4)

WebUI.setText(findTestObject('Object Repository/Content Management System/Page_Unifiller Content Management System/input__subCategory'), 
    subcategoryname2)

WebUI.click(findTestObject('Object Repository/Content Management System/Page_Unifiller Content Management System/button_Save'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Content Management System/Page_Unifiller Content Management System/span_Back'))

WebUI.closeBrowser()

