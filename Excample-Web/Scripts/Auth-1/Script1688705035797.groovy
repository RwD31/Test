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

WebUI.navigateToUrl('https://medeasy-web-staging.qbit.co.id/')

WebUI.click(findTestObject('Object Repository/New Folder/Page_Medeasy/button_Sign In'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Medeasy/button_Sign in as Doctor'))

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Medeasy/input_Input Phone Number and we will send t_c2aaf5'), 
    '1234567891')

WebUI.click(findTestObject('Object Repository/New Folder/Page_Medeasy/button_Next'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Medeasy/button_Confirm'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Medeasy/p_Hi, Reza W Daknantya'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Medeasy/img_Application_rounded-5 w-10 h-10 object-cover'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Medeasy/img_Application_rounded-5 w-10 h-10 object-cover'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Medeasy/svg'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Medeasy/svg_1'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Medeasy/button_Application_ant-btn ant-btn-default'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Medeasy/svg_1'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Medeasy/path'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Medeasy/svg_1'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Medeasy/path_1'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Medeasy/span_Doctor Information'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Medeasy/button_Edit'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Medeasy/span_Upload Image'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Medeasy/button_Upload Signature'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Medeasy/button_Save Changes'))

WebUI.closeBrowser()

