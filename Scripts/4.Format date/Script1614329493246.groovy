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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://www.kompas.id/baca/opini/2021/01/14/krisis-lingkungan-dan-bencana-pandemi/')

WebUI.maximizeWindow()

//WebUI.click(findTestObject('Page KLBP/time_14 Januari 2021'))
//WebUI.click(findTestObject('Page KLBP/time_1300 WIB'))
//println(dateToCheck)//Date().format(‘MM/dd/yyyy’)

WebUI.delay(5)

dateToCheck = WebUI.getText(findTestObject('Page KLBP/time_14 Januari 2021'))

WebUI.verifyMatch(dateToCheck, '[0-9]{4}-[0-9]{2}-[0-9]{2}', true, FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyMatch(dateToCheck, '14 Januari 2021', true, FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyMatch('2021-02-25', '[0-9]{4}-[0-9]{2}-[0-9]{2}', true, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

