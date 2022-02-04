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

WebUI.openBrowser(GlobalVariable.Url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Button/button_buynow'))

WebUI.sendKeys(findTestObject('Checkout/input_list_price'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Checkout/input_list_price'), GlobalVariable.price)

Price = WebUI.getAttribute(findTestObject('Checkout/input_list_price'), 'Value')

isPrice = GlobalVariable.price

System.out.println(isPrice)

total = WebUI.getText(findTestObject('Checkout/verify_total_amount'))

System.out.println(total)

WebUI.verifyEqual(isPrice, total)

WebUI.setText(findTestObject('Checkout/txt_name'), GlobalVariable.name)

name = WebUI.getAttribute(findTestObject('Checkout/txt_name'), 'Value')

isName = GlobalVariable.name

System.out.println(isName)

WebUI.setText(findTestObject('Checkout/txt_email'), GlobalVariable.email)

email = WebUI.getAttribute(findTestObject('Checkout/txt_email'), 'Value')

isEmail = GlobalVariable.email

System.out.println(isEmail)

WebUI.setText(findTestObject('Checkout/phone_number'), GlobalVariable.phonenumber)

phone = WebUI.getAttribute(findTestObject('Checkout/phone_number'), 'Value')

isPhone = GlobalVariable.phonenumber

System.out.println(isPhone)

WebUI.setText(findTestObject('Checkout/txt_city'), GlobalVariable.city)

WebUI.setText(findTestObject('Checkout/txt_addres'), GlobalVariable.addres)

addres = WebUI.getAttribute(findTestObject('Checkout/txt_addres'), 'Value')

isAddres = GlobalVariable.addres+" "+GlobalVariable.city+" "+GlobalVariable.PostalCode

System.out.println(isAddres)

WebUI.setText(findTestObject('Checkout/postal_code'), GlobalVariable.PostalCode)

WebUI.click(findTestObject('Button/button_checkout'))

WebUI.click(findTestObject('EqualSum/click_verify_shiporcustomdetail'))

toName = WebUI.getText(findTestObject('EqualSum/name_sum'))

System.out.println(toName)

WebUI.verifyEqual(isName, toName)

toEmail = WebUI.getText(findTestObject('EqualSum/email_sum'))

System.out.println(toEmail)

WebUI.verifyEqual(isEmail, toEmail)

toPhone = WebUI.getText(findTestObject('EqualSum/phone_sum'))

System.out.println(toPhone)

WebUI.verifyEqual(isPhone, toPhone)

toAddres = WebUI.getText(findTestObject('EqualSum/addres_sum'))

System.out.println(toAddres)

WebUI.verifyEqual(isAddres, toAddres)

WebUI.closeBrowser()

