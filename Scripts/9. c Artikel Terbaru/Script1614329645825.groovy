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

WebUI.delay(5)

text_artikel1 = WebUI.getText(findTestObject('Page KLBP/Artikel Terbaru/baru1'))
WebUI.verifyNotEqual(text_artikel1, '')

text_artikel2 = WebUI.getText(findTestObject('Page KLBP/Artikel Terbaru/baru2'))
WebUI.verifyNotEqual(text_artikel2, '')

text_artikel3 = WebUI.getText(findTestObject('Page KLBP/Artikel Terbaru/baru3'))
WebUI.verifyNotEqual(text_artikel3, '')

text_artikel4 = WebUI.getText(findTestObject('Page KLBP/Artikel Terbaru/baru4'))
WebUI.verifyNotEqual(text_artikel4, '')

text_artikel5 = WebUI.getText(findTestObject('Page KLBP/Artikel Terbaru/baru5'))
WebUI.verifyNotEqual(text_artikel5, '')

WebUI.closeBrowser()

