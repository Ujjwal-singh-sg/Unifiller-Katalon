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

not_run: WebUI.callTestCase(findTestCase('Unifiller Login/Login - Valid Credentials'), [('email') : '', ('password') : ''], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Archive'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Profile/Page_Unifiller Content Management System/a_Profile'))

not_run: WebUI.click(findTestObject('Object Repository/Profile/Page_Unifiller Content Management System/button_Edit'))

WebUI.delay(2)

WebUI.click(findTestObject('Profile/Page_Unifiller Content Management System/span_Upload profile picture'))

WebUI.uploadFile(findTestObject('Profile/Page_Unifiller Content Management System/div'), file)

WebUI.delay(5)

not_run: WebUI.click(findTestObject('Object Repository/Profile/Page_Unifiller Content Management System/button_Save'))

WebUI.closeBrowser()

