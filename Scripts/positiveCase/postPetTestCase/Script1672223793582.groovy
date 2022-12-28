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

idpet = 9223372036854621000

nama = 'test12345'

send = WS.sendRequestAndVerify(findTestObject('petAPI/postPet', [('id') : idpet, ('name') : nama]))

WS.comment(send.getResponseBodyContent())

'Verifikasi Respon Status Code'
WS.verifyResponseStatusCode(send, 200)

'Verifikasi Input ID Pet'
responseID = WS.getElementPropertyValue(send, 'id')

println responseID

'Verifikasi Input Nama'
verifName = WS.verifyMatch('test12345', 'test12345', false)

responseName = WS.getElementPropertyValue(send, 'name')

println responseName 





