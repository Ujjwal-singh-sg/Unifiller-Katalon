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

WebUI.callTestCase(findTestCase('Unifiller Login/Login - Valid Credentials'), [('email') : '', ('password') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/div_Select a machine'))

WebUI.setText(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/input_Select Machine_react-select-2-input'), 
    'multistation 2023')

WebUI.click(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/div_MultiStation 2023'))

WebUI.click(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/div_Select a category'))

WebUI.click(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/div_New Cat'))

WebUI.click(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/div_Select a sub-category'))

WebUI.click(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/div_New Subcat'))

WebUI.click(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/div_New Subcat  V234MultiStation 2023  New Cat'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/li_Maintenance'))

WebUI.click(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/button_Add new event'))

def eventname = org.apache.commons.lang.RandomStringUtils.randomAlphabetic(4)

WebUI.setText(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/input__events0.eventName'), 
    eventname)

WebUI.click(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/div_Select category_css-15lsz6c-indicatorContainer'))

WebUI.click(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/div_Maintenance'))

WebUI.setText(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/input__events0.cycleCount'), 
    '1,250')

WebUI.click(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/button_Save'))

WebUI.click(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/div_Event Name A-Z'))

WebUI.click(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/div_Event Name Z-A'))

WebUI.click(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/button_Edit'))

WebUI.click(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/button_Continue'))

WebUI.click(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/button_Continue_1'))

WebUI.click(findTestObject('Machine/Page_Unifiller Content Management System/button_Finish'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/div_Maintenance'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/button_Archive'))

WebUI.click(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/button_Archive_1'))

WebUI.click(findTestObject('Additional Cases/Page_Unifiller Content Management System/div_SuccessThis machine has been successfully archived. View Machine'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/div_What are you looking for_input-field__RQCOL'))

WebUI.setText(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/input_What are you looking for_machine-search'), 
    'abc')

WebUI.click(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/div_new subcat  V70Curtis Schamberger  new _1fcd7e'))

WebUI.click(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/span_Back'))

WebUI.click(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/div_Version Decremental'))

WebUI.click(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/div_Version Incremental'))

WebUI.click(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/img'))

WebUI.click(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/svg_Select a machine_css-8mmkcg'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/input_Select Machine_react-select-35-input'), 
    'multistation')

WebUI.click(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/div_MultiStation 2023_1'))

WebUI.click(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/div_Select a category'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/div_New cat 2023'))

WebUI.click(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/svg_Select a sub-category_css-8mmkcg'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/div_New sub cat 2023'))

WebUI.click(findTestObject('Object Repository/Machine/Page_Unifiller Content Management System/span_Reset Filters'))

