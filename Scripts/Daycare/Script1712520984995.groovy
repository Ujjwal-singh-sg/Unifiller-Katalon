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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://daycare-fe-qa.studiographene.xyz/')

WebUI.click(findTestObject('Object Repository/Daycare/Page_Daycare SOS  Childcare You Can Count On/button_Accept'))

WebUI.click(findTestObject('Object Repository/Daycare/Page_Daycare SOS  Childcare You Can Count On/button_LOGIN'))

WebUI.setText(findTestObject('Object Repository/Daycare/Page_Daycare SOS  Childcare You Can Count On/input_Email_email'), 
    'rajesh@mailinator.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Daycare/Page_Daycare SOS  Childcare You Can Count On/input_Password_password'), 
    'cvW8qx4B2o1WegCEDy41Xg==')

WebUI.click(findTestObject('Object Repository/Daycare/Page_Daycare SOS  Childcare You Can Count On/button_Sign In'))

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Daycare/Page_My Cart  Daycare SOS/div_Dashboard'))

WebUI.click(findTestObject('Object Repository/Daycare/Page_Parent Dashboard  Daycare SOS/button_OK'))

WebUI.click(findTestObject('Object Repository/Daycare/Page_Parent Dashboard  Daycare SOS/div_Select'))

WebUI.click(findTestObject('Object Repository/Daycare/Page_Parent Dashboard  Daycare SOS/div_Child Jnr Two'))

WebUI.click(findTestObject('Object Repository/Daycare/Page_Parent Dashboard  Daycare SOS/input_Child Jnr Two_react-datepicker-ignore_b377f9'))

WebUI.click(findTestObject('Object Repository/Daycare/Page_Parent Dashboard  Daycare SOS/div_8'))

WebUI.setText(findTestObject('Object Repository/Daycare/Page_Parent Dashboard  Daycare SOS/input_Search_searchAddress'), 
    'London')

WebUI.click(findTestObject('Object Repository/Daycare/Page_Parent Dashboard  Daycare SOS/li_London'))

WebUI.click(findTestObject('Object Repository/Daycare/Page_Parent Dashboard  Daycare SOS/button_Book a Session'))

WebUI.click(findTestObject('Object Repository/Daycare/Page_Parent Dashboard  Daycare SOS/td_R'))

WebUI.click(findTestObject('Object Repository/Daycare/Page_Parent Dashboard  Daycare SOS/button_R'))

WebUI.click(findTestObject('Object Repository/Daycare/Page_Parent Dashboard  Daycare SOS/div_Googie'))

WebUI.click(findTestObject('Object Repository/Daycare/Page_Parent Dashboard  Daycare SOS/button_Request'))

WebUI.click(findTestObject('Object Repository/Daycare/Page_Parent Dashboard  Daycare SOS/button_OK'))

WebUI.click(findTestObject('Object Repository/Daycare/Page_Parent Dashboard  Daycare SOS/div_R_calendar-modal_cross-icon__seXQK icon_d0839d'))

WebUI.click(findTestObject('Object Repository/Daycare/Page_Parent Dashboard  Daycare SOS/div_Nursery Chandrayan_invited-parent-calen_52291c'))

WebUI.click(findTestObject('Object Repository/Daycare/Page_Parent Dashboard  Daycare SOS/div_Bookings'))

WebUI.click(findTestObject('Object Repository/Daycare/Page_Upcoming Bookings  Daycare SOS/a_Past Bookings'))

WebUI.click(findTestObject('Object Repository/Daycare/Page_Past Bookings  Daycare SOS/div_Date of booking'))

WebUI.click(findTestObject('Object Repository/Daycare/Page_Past Bookings  Daycare SOS/div_Date of booking'))

WebUI.click(findTestObject('Object Repository/Daycare/Page_Past Bookings  Daycare SOS/div_Notifications'))

WebUI.click(findTestObject('Object Repository/Daycare/Page_Parent Notifications  Daycare SOS/div_Date'))

WebUI.click(findTestObject('Object Repository/Daycare/Page_Parent Notifications  Daycare SOS/div_Date'))

WebUI.click(findTestObject('Object Repository/Daycare/Page_Parent Notifications  Daycare SOS/div_My Cart'))

WebUI.click(findTestObject('Object Repository/Daycare/Page_My Cart  Daycare SOS/div_Settings'))

WebUI.click(findTestObject('Object Repository/Daycare/Page_Parent Settings  Account Details  Daycare SOS/button_Children'))

WebUI.click(findTestObject('Object Repository/Daycare/Page_Parent Settings  Children  Daycare SOS/button_Card details'))

WebUI.click(findTestObject('Object Repository/Daycare/Page_Parent Settings  Card Details  Daycare SOS/button_Bank details'))

WebUI.click(findTestObject('Object Repository/Daycare/Page_Parent Settings  Bank Details  Daycare SOS/button_Terms  conditions'))

WebUI.click(findTestObject('Object Repository/Daycare/Page_Parent Settings  Terms And Conditions _60ece7/button_Privacy policy'))

WebUI.click(findTestObject('Object Repository/Daycare/Page_Parent Settings  Privacy Policy  Daycare SOS/div_Logout'))

WebUI.closeBrowser()

WebUI.acceptAlert()

