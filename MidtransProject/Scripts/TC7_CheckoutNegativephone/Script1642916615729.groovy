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

WebUI.verifyElementPresent(findTestObject('MidtransUrl/verify_element_price'), 0)

WebUI.click(findTestObject('Button/button_buynow'))

WebUI.verifyElementPresent(findTestObject('Checkout/verify_shoppingcart'), 0)

WebUI.verifyElementPresent(findTestObject('Checkout/verify_total_amount'), 0)

WebUI.setText(findTestObject('Checkout/txt_name'), GlobalVariable.name)

WebUI.setText(findTestObject('Checkout/txt_email'), GlobalVariable.email)

WebUI.setText(findTestObject('Checkout/phone_number'), ' ')

WebUI.setText(findTestObject('Checkout/txt_city'), GlobalVariable.city)

WebUI.setText(findTestObject('Checkout/txt_addres'), GlobalVariable.addres)

WebUI.setText(findTestObject('Checkout/postal_code'), GlobalVariable.PostalCode)

WebUI.click(findTestObject('Button/button_checkout'))

WebUI.closeBrowser()

