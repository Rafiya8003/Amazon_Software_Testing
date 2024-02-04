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

WebUI.navigateToUrl('https://www.amazon.in/')

WebUI.click(findTestObject('Object Repository/Amazon_Account_Management/span_Hello, sign in'))

WebUI.setText(findTestObject('Object Repository/Amazon_Account_Management/input_email'), 'mail4pics04@gmail.com')

WebUI.click(findTestObject('Object Repository/Amazon_Account_Management/inputcontinue'))

WebUI.setEncryptedText(findTestObject('Object Repository/Amazon_Account_Management/input_password'), 'SVJ1n5OxrlXGY4qaIJ6nWw==')

WebUI.click(findTestObject('Object Repository/Amazon_Account_Management/inputsignInSubmit'))

WebUI.click(findTestObject('Object Repository/Amazon_Account_Management/a_Hello, PIC  Account  Lists'))

WebUI.click(findTestObject('Object Repository/Amazon_Account_Management/h2_Login  security'))

WebUI.click(findTestObject('Object Repository/Amazon_Account_Management/a_Edit'))

WebUI.click(findTestObject('Object Repository/Amazon_Account_Management/div_Your Account                           _7db742'))

WebUI.setText(findTestObject('Object Repository/Amazon_Account_Management/input_customerName'), 'Pic')

WebUI.click(findTestObject('Object Repository/Amazon_Account_Management/inputcnep_1C_submit_button'))

WebUI.verifyElementText(findTestObject('Object Repository/Amazon_Account_Management/div_Name updated'), 'Name updated.')

WebUI.closeBrowser()

