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

WebUI.callTestCase(findTestCase('Content Management System'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Archived/Page_Unifiller Content Management System/a_Archives'))

WebUI.click(findTestObject('Object Repository/Archived/Page_Unifiller Content Management System/div_machines81 Archived Machine Versions'))

WebUI.click(findTestObject('Object Repository/Archived/Page_Unifiller Content Management System/div_Formerly Archived'))

WebUI.click(findTestObject('Object Repository/Archived/Page_Unifiller Content Management System/div_Recently Archived'))

WebUI.click(findTestObject('Object Repository/Archived/Page_Unifiller Content Management System/div_Archived on Apr 07, 2024by hNLf Singh N_d8aebf'))

WebUI.click(findTestObject('Object Repository/Archived/Page_Unifiller Content Management System/li_Maintenance'))

WebUI.click(findTestObject('Object Repository/Archived/Page_Unifiller Content Management System/button_Restore'))

WebUI.click(findTestObject('Object Repository/Archived/Page_Unifiller Content Management System/button_Restore_1'))

WebUI.click(findTestObject('Object Repository/Archived/Page_Unifiller Content Management System/span_Back'))

WebUI.click(findTestObject('Object Repository/Archived/Page_Unifiller Content Management System/div_customers60 Archived Customers'))

WebUI.setText(findTestObject('Object Repository/Archived/Page_Unifiller Content Management System/input_What are you looking for_machine-search'), 
    'uni')

WebUI.click(findTestObject('Object Repository/Archived/Page_Unifiller Content Management System/span_123 New Unif Customer'))

WebUI.click(findTestObject('Object Repository/Archived/Page_Unifiller Content Management System/button_Restore'))

WebUI.click(findTestObject('Object Repository/Archived/Page_Unifiller Content Management System/button_Restore_1'))

WebUI.click(findTestObject('Object Repository/Archived/Page_Unifiller Content Management System/div_What are you looking for_clear-icon__i7jZ1'))

WebUI.click(findTestObject('Object Repository/Archived/Page_Unifiller Content Management System/span_Back'))

WebUI.click(findTestObject('Object Repository/Archived/Page_Unifiller Content Management System/div_users42 Archived Users'))

WebUI.setText(findTestObject('Object Repository/Archived/Page_Unifiller Content Management System/input_What are you looking for_machine-search'), 
    'uni')

WebUI.click(findTestObject('Object Repository/Archived/Page_Unifiller Content Management System/img'))

WebUI.click(findTestObject('Object Repository/Archived/Page_Unifiller Content Management System/span_Name'))

WebUI.click(findTestObject('Object Repository/Archived/Page_Unifiller Content Management System/span_Email'))

WebUI.click(findTestObject('Object Repository/Archived/Page_Unifiller Content Management System/span_Email'))

WebUI.click(findTestObject('Object Repository/Archived/Page_Unifiller Content Management System/span_Job Title'))

WebUI.click(findTestObject('Object Repository/Archived/Page_Unifiller Content Management System/span_Job Title'))

WebUI.click(findTestObject('Object Repository/Archived/Page_Unifiller Content Management System/span_Department'))

WebUI.click(findTestObject('Object Repository/Archived/Page_Unifiller Content Management System/span_Location'))

WebUI.click(findTestObject('Object Repository/Archived/Page_Unifiller Content Management System/span_Role'))

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Content Management System'), [:], FailureHandling.CONTINUE_ON_FAILURE)

