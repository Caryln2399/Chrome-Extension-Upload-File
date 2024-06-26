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

import org.openqa.selenium.WebDriver

import org.openqa.selenium.chrome.ChromeDriver

import org.openqa.selenium.chrome.ChromeOptions

import org.openqa.selenium.remote.DesiredCapabilities

import com.kms.katalon.core.webui.driver.DriverFactory

// Copy the path to Chromedriver

String pathToChromeDriver = '/Applications/Katalon Studio v9.3.app/Contents/Eclipse/configuration/resources/drivers/chromedriver_mac/chromedriver'

System.setProperty('webdriver.chrome.driver', pathToChromeDriver)

// This class is used for customizing the Chrome session..

ChromeOptions options = new ChromeOptions()

options.addExtensions(new File("/Users/thi.thai/Desktop/eningockdidmgiojffjmkdblpjocbhgh/4.1.1_0.crx"))

DesiredCapabilities caps = new DesiredCapabilities()

caps.setCapability(ChromeOptions.CAPABILITY, options)

WebDriver driver = new ChromeDriver(caps)

DriverFactory.changeWebDriver(driver)

WebUI.navigateToUrl("https://google.com")