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

WebUI.openBrowser('https://demo.midtrans.com/')

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('MidtransUrl/verify_elementtitle'), 0)

WebUI.click(findTestObject('Button/button_buynow'))

WebUI.delay(2)

WebUI.click(findTestObject('Button/button_checkout'))

WebUI.verifyElementPresent(findTestObject('Payment/verify_orderid'), 0)

WebUI.click(findTestObject('Button/button_continue'))

WebUI.click(findTestObject('Button/button_kartukredit'))

WebUI.setText(findTestObject('Payment/input_cardnumberCC'), findTestData('Payment').getValue(2, 2))

WebUI.setText(findTestObject('Payment/input_expirydateCC'), findTestData('Payment').getValue(3, 2))

WebUI.setText(findTestObject('Payment/input_cvvCC'), findTestData('Payment').getValue(4, 2))

WebUI.scrollToPosition(0, 30)

Diskon = WebUI.getAttribute(findTestObject('Payment/select_promo10'), 'Value')

WebUI.click(findTestObject('Button/button_paynow'))

WebUI.setText(findTestObject('Payment/input_OTPbank'), findTestData('Payment').getValue(5, 2))

WebUI.click(findTestObject('Button/button_okOTPbank'))

WebUI.waitForElementPresent(findTestObject('Payment/verify_notifFailed'), 0)

WebUI.closeBrowser()

