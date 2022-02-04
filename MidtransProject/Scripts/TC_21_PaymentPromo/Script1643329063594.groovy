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

WebUI.click(findTestObject('Button/button_buynow'))

WebUI.click(findTestObject('Button/button_checkout'))

hargaitem = WebUI.getText(findTestObject('Payment/verify_ccamountrp'))

System.out.println(hargaitem)

WebUI.click(findTestObject('Button/button_continue'))

WebUI.click(findTestObject('Button/button_kartukredit'))

WebUI.setText(findTestObject('Payment/input_cardnumberCC'), '4811 1111 1111 1114')

WebUI.setText(findTestObject('Payment/input_expirydateCC'), '0125')

WebUI.setText(findTestObject('Payment/input_cvvCC'), '123')

WebUI.click(findTestObject('Payment/select_promoMidtrans'))

diskon = WebUI.getText(findTestObject('Payment/select_promoMidtrans'))

System.out.println(diskon)

hargadiskon = (hargaitem - diskon)

System.out.println(hargadiskon)

hargadiskondisplay = WebUI.getText(findTestObject('Payment/verify_ccamountrp'))

System.out.println(hargadiskondisplay)

WebUI.verifyEqual(hargadiskon, hargadiskondisplay)

WebUI.click(findTestObject('Button/button_paynow'))

WebUI.verifyElementPresent(findTestObject('Payment/promoNotAvailable'), 0)

WebUI.closeBrowser()

