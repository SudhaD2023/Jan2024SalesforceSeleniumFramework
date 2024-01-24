package com.automation.tests.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.automation.tests.utilities.ExtentReportsUtility;
import com.automation.tests.utilities.PropertiesUtility;
import com.automation.tests.utilities.constants;
import com.automation.tests.utilities.log4jUtility;
import com.aventstack.extentreports.model.Report;
import com.google.common.io.Files;


public class BaseTest {
	protected static WebDriver driver=null;
	 static WebDriverWait wait=null;
	 protected log4jUtility logObject=log4jUtility.getInstance();
	 protected static Logger myLog;
	 protected static ExtentReportsUtility report=ExtentReportsUtility.getInstance();
	 protected static ChromeOptions options=null;
	public static ArrayList<WebElement> actualOpts=new ArrayList<WebElement>();
	
	 
	@BeforeTest
	 public void setupBeforeTest() {
		 myLog=logObject.getlogger();
	 }
	 
	 @BeforeMethod
	 @Parameters("browsername")
		public static void setupBeforeTestMethod(@Optional("Chrome")String browser_name)
		{
		    PropertiesUtility pro=new PropertiesUtility();
		    Properties applicationProFile=pro.loadFile("applicationDataProperties");
		    String url=applicationProFile.getProperty("url");
			LaunchBrowser(browser_name);
	   	    MaximizeBrowser();
	   	    gotoUrl(url);
		}
	 
	@AfterMethod
	 public static void TearDownAfterTestMethod() {
		 driverclose();
		 myLog.info("login to Salesforce automation script ended");
	 }

	public static void TestcaseNum(String Testcase) {
		myLog.info("********login to Salesforce Appication"+ Testcase+("Started******************"));
	}
	
	public static void LaunchBrowser(String BrowserName)
	{
		 switch(BrowserName)
		    {
            case "Chrome":driver=new ChromeDriver();
            myLog.info("Chrome driver is launched");
                         break;
	           case "Firefox":driver=new FirefoxDriver();
	           myLog.info("Firefox driver is launched");
	                          break;
	           default:myLog.error("you have not entered the correct browser");
	        }
	 }
	  public static void MaximizeBrowser() 
	     {
		      driver.manage().window().maximize();
	     }
	  public static void gotoUrl(String Url)
	    {
	    	driver.get(Url);
	    	myLog.info(Url+"is entered");
	    }
	  public static void waitforvisibility(WebElement ele,int time,String objectName)
	    {
	    	 wait=new WebDriverWait(driver,Duration.ofSeconds(time));
			wait.until(ExpectedConditions.visibilityOf(ele));
			myLog.info(objectName+"is waited");
	    }
	  public static void FindElement(WebElement ele,String Objectname)
	    {
	    	if(ele.isDisplayed())
	    	{
	    		myLog.info(Objectname+" is displayed");
	    	}else
	    	{
	    		myLog.error(Objectname+" is not displayed");
	    	}
	    }
	  public static void EnterText(WebElement ele,String data,String objectName)
	    {
	    	if(ele.isDisplayed())
			{
				ele.clear();
				ele.sendKeys(data);
				myLog.info("data is entered in the "+objectName);
				//report.logTestInfo("Pass:"+objectName+" is entered to the username filed");
			}else
			{
				myLog.error(objectName+"Element is not displayed");
			}
	    }
	  public static void ClickElement(WebElement ele,String objectName)
	    {
	    	if(ele.isDisplayed())
	    	{
	    		ele.click();
	    		myLog.info(objectName+" button is clicked");
	    	}else
	    	{
	    		myLog.error(objectName+" button is not displayed");
	    	}
	    }
	 
	  public static void clearText(WebElement ele,String objectName) 
	    {
	    	if(ele.isDisplayed())
			{
				ele.clear();
				myLog.info("data is cleared in the "+objectName);
			}else
			{
				myLog.error(objectName+"Element is not displayed");
			}
	    }
	  public static void driverclose()
	    {
	    	driver.close();
	    }
	  public static String gettext(WebElement ele,String Objectname)
	  {
		   Objectname=ele.getText();
		   return Objectname;
	   }
	  public static void SwitchtoFrame(WebElement ele,String objectname) 
	  {
		  if(ele.isDisplayed())
				  {
			driver.switchTo().frame(ele);
			myLog.info("Switched to"+objectname);
				  }
		  else
				  {
			  myLog.error(objectname +"is not displayed");
				  }
	  }
	  
	  public static void SwitchToDefaultContent() {
		  driver.switchTo().defaultContent();
	  }
	  public static void uploadingfilefromdesktopwindow(WebElement ele,String objectname,String path) throws AWTException {
		  JavascriptExecutor js=(JavascriptExecutor)driver;
			 js.executeScript("arguements[0].click()",ele);
			 myLog.info(objectname+"is clicked");
			 Robot rb=new Robot();
			 rb.delay(2000);
			//set path to file in a clipboard
			 StringSelection ss=new StringSelection(path);
			 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			//CTRL+V
			 rb.keyPress(KeyEvent.VK_CONTROL);
			 rb.keyPress(KeyEvent.VK_V);
			 rb.keyRelease(KeyEvent.VK_CONTROL);
			 rb.keyRelease(KeyEvent.VK_V);
			 rb.keyPress(KeyEvent.VK_ENTER);
			 rb.keyRelease(KeyEvent.VK_ENTER);
	  }
	  public void takescreenshot(String filepath) {
		  TakesScreenshot screenCapture=(TakesScreenshot)driver;
		  File src=screenCapture.getScreenshotAs(OutputType.FILE);
		  File destination=new File(filepath);
		  try {
			Files.copy(src, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			myLog.error("captured the screen");
			//report.logTestFailedWithException(e);
		}
	  }
	  public void takescreenshot(WebElement ele,String filepath ) {
          File src=ele.getScreenshotAs(OutputType.FILE);
          File destination=new File(filepath);
          try {
			Files.copy(src, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			myLog.error("captured the screen");
			report.logTestFailedWithException(e);
		}
}
	 // @BeforeTest
	  public void DownloadFileToFolder() {
		  options=new ChromeOptions();
		  HashMap<String,Object> chromeprefs=new HashMap<String,Object>();
		  chromeprefs.put("profile.default_content_settings.popups",0);
		  String downloadFilepath=constants.Downloads_Folder;
		  chromeprefs.put("download.default_directory", downloadFilepath);
		  options.setExperimentalOption("prefs", chromeprefs);
		  driver=new ChromeDriver(options);
	  }
	  public static void selectFromDropdownByVisibleText(WebElement ele,String Visibletext) {
		  Select select=new Select(ele);
		  select.selectByVisibleText(Visibletext);
		  if(Visibletext.equals(select.getFirstSelectedOption()))
				  {
		  System.out.println(Visibletext+" is selected" );
				  }else
				  {
					  
						  System.out.println(Visibletext+" is not selected" );
				  }
					  
	  }
	  public static void selectFromDropdownByValue(WebElement ele,String value) {
		  Select select=new Select(ele);
		  select.selectByValue(value);
	  }
	  public static void ScrollToElement(WebElement ele) {
		  Actions action=new Actions(driver);
		  //action.keyDown(null)
	  }
	  public static void MveToEle(WebElement ele) {
		  Actions action=new Actions(driver);
			 action.moveToElement(ele).build().perform();
	  }
	  public static void getwindowhandleOfChildWindow() {
		  Set<String> handles=driver.getWindowHandles();
		 for(String handle:handles) 
		 {
		  driver.switchTo().window(handle);
		 if(driver.getCurrentUrl().equals(handle))
		 {
		 driver.switchTo().window(handle);
		 System.out.println(driver.getCurrentUrl());
		 driver.close();
		 }
		 }
		}
	  public static void popupok() {
		  driver.switchTo().alert().accept();
		  System.out.println("ok button is clicked on alert window");
	  }
	  public static void SwitchToAlertEnterText() {
		  Alert alert=driver.switchTo().alert();
		  alert.sendKeys("");
		  }
	  public static void selectByOptions(WebElement ele) {
		  Select select=new Select(ele);
		  List<WebElement> options=select.getOptions();
		  for(WebElement option:options)
		  {
			  System.out.println(option.getText());
			  actualOpts.add(option);
		  }
		  System.out.println("All options are displayed");
	  }
}