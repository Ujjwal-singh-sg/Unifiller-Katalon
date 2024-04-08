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

WebUI.callTestCase(findTestCase('Machine'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Unifiller Login/Login - Negative Scenarios'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/a_Customers'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/input_What are you looking for_machine-search'))

WebUI.setText(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/input_What are you looking for_machine-search'), 
    'ujjwal197')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/span_Resend Invitation_tableRowImage__pXJ5Z'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/li_Users'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/button_Add New User'))

def firstname = org.apache.commons.lang.RandomStringUtils.randomAlphabetic(4)

WebUI.setText(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/input__users0.firstName'), 
    firstname)

def lastname = org.apache.commons.lang.RandomStringUtils.randomAlphabetic(4)

WebUI.setText(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/input__users0.lastName'), 
    lastname)

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/div_Select location'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/div_delhi'))

int rn

rn = ((Math.random() * 5000) as int)

String ab

ab = (('ujjwalsingh' + rn) + '@mailinator.com')

WebUI.setText(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/input__users0.email'), 
    ab)

//WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/button_Save'))
WebUI.sendKeys(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/button_Save'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/button_Save'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/li_Machines'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/button_Add new machine'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/div_Continue without DeviceWithout Device, _63f65b'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/button_Continue'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/div_Full Serial Number_input-field__RQCOL'))

WebUI.setText(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/input_Full Serial Number_machineSearch'), 
    '100')

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/img'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/button_Confirm and continue'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/div_Select a condition_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/div_New machine'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/div_Select location_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/div_delhi_1'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/button_Finish'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/li_Users'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/span_Name'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/span_Email  Phone no'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/span_Back'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/div_What are you looking for_clear-icon__i7jZ1'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/span_Customer Name'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/span_Unifiller ID'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/span_Unifiller ID'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/div_Select a subscription'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/div_Enterprise (Trial)'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/div_Select a lifetime value'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/div_AAA'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/div_Select a main location_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/div_Afghanistan'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/span_Reset Filters'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/button_Add New'))

def customername = org.apache.commons.lang.RandomStringUtils.randomAlphabetic(4)

WebUI.setText(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/input__name'), customername)

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/button_Continue_1'))

WebUI.setText(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/input__workspaces.0.name'), 
    'Loc')

WebUI.setText(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/textarea_This is a location_1'), 
    'This is a location.')

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/div_Select a country_css-19bb58m'))

WebUI.setText(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/input__react-select-29-input'), 
    'India')

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/div_India'))

WebUI.setText(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/input__workspaces.0.shippingAddress'), 
    'Gurgaon')

WebUI.setText(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/input__workspaces.0.shippingAddressCity'), 
    'Gurgaon')

WebUI.setText(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/input__workspaces.0.shippingAddressState'), 
    'Haryana')

WebUI.setText(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/input__workspaces.0.shippingAddressZipcode'), 
    'GURGAON')

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/button_Continue_1'))

WebUI.setText(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/input__users0.firstName'), 
    firstname)

WebUI.setText(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/input__users0.lastName'), 
    lastname)

WebUI.setText(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/input__users0.email'), 
    ab)

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/button_Finish'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/button_Archive'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/button_Archive_1'))

not_run: WebUI.click(findTestObject('Object Repository/Customer/Page_Unifiller Content Management System/a_View Customer'))

not_run: WebUI.switchToWindowTitle('')

not_run: WebUI.navigateToUrl('https://qa.cms.unifiller.studiographene.xyz/archives/customers/details/1bb3323e-a086-485d-a273-7682ca524c56')

WebUI.closeBrowser()

