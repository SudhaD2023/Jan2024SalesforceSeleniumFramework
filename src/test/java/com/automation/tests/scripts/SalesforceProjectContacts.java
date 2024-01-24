package com.automation.tests.scripts;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.tests.base.BaseTest;
import com.automation.tests.utilities.PropertiesUtility;


public class SalesforceProjectContacts extends BaseTest {
	@Test
	public static void SalesforceTestCase25() {
	     TestcaseNum("TestCase25");
	     PropertiesUtility pro=new PropertiesUtility();
	     Properties appProp=pro.loadFile("applicationDataProperties");
	     String Username=appProp.getProperty("login.valid.userid");
	     String Password=appProp.getProperty("login.valid.password");
		 WebElement UsernameEle=driver.findElement(By.name("username"));
		 waitforvisibility(UsernameEle,11,"implicit wait");
		 EnterText(UsernameEle,Username,"UserName.textbox");
		 WebElement PasswordEle=driver.findElement(By.id("password"));
		 clearText(PasswordEle, "Password.textbox");
		 EnterText(PasswordEle,Password,"Password.textbox");
		 WebElement Loginbutton=driver.findElement(By.id("Login"));
		 ClickElement(Loginbutton, "login.button");
		 WebElement Contacts=driver.findElement(By.linkText("Contacts"));
		 ClickElement(Contacts,"Contacts_tab");
		 WebElement New=driver.findElement(By.xpath("//input[@name='new']"));
		 ClickElement(New,"New_button");
		 WebElement LastNameEle=driver.findElement(By.id("name_lastcon2"));
		 String LastNmae=appProp.getProperty("Last.Name");
		 EnterText(LastNameEle, LastNmae, "LastNmae_box");
		 WebElement AccountNameEle=driver.findElement(By.id("con4"));
		 String AccountName=appProp.getProperty("Account.Name");
		 EnterText(AccountNameEle, AccountName, "AccountName_box");
		 WebElement Save=driver.findElement(By.name("save"));
		 ClickElement(Save,"save_button");
	}
	
	@Test
	public static void SalesforceTestCase26() {
	     TestcaseNum("TestCase26");
	     PropertiesUtility pro=new PropertiesUtility();
	     Properties appProp=pro.loadFile("applicationDataProperties");
	     String Username=appProp.getProperty("login.valid.userid");
	     String Password=appProp.getProperty("login.valid.password");
		 WebElement UsernameEle=driver.findElement(By.name("username"));
		 waitforvisibility(UsernameEle,11,"implicit wait");
		 EnterText(UsernameEle,Username,"UserName.textbox");
		 WebElement PasswordEle=driver.findElement(By.id("password"));
		 clearText(PasswordEle, "Password.textbox");
		 EnterText(PasswordEle,Password,"Password.textbox");
		 WebElement Loginbutton=driver.findElement(By.id("Login"));
		 ClickElement(Loginbutton, "login.button");
		 WebElement Contacts=driver.findElement(By.linkText("Contacts"));
		 ClickElement(Contacts,"Contacts_tab");
		 WebElement CreateNewView=driver.findElement(By.linkText("Create New View"));
		 ClickElement(CreateNewView,"CreateNewView_link");
		 WebElement ViewNameEle=driver.findElement(By.id("fname"));
		 String ViewName=appProp.getProperty("View.Name");
		 EnterText(ViewNameEle, ViewName, "ViewName_box");
		 WebElement ViewUniqueNameEle=driver.findElement(By.id("devname"));
		 String ViewUniqueName=appProp.getProperty("View.Unique.Name");
		 EnterText(ViewUniqueNameEle, ViewUniqueName, "ViewUniqueName_box");
		 WebElement Save=driver.findElement(By.name("save"));
		 ClickElement(Save,"Save_button");
	}
	
	@Test
	public static void SalesforceTestCase27() throws Throwable {
	     TestcaseNum("TestCase27");
	     PropertiesUtility pro=new PropertiesUtility();
	     Properties appProp=pro.loadFile("applicationDataProperties");
	     String Username=appProp.getProperty("login.valid.userid");
	     String Password=appProp.getProperty("login.valid.password");
		 WebElement UsernameEle=driver.findElement(By.name("username"));
		 waitforvisibility(UsernameEle,11,"implicit wait");
		 EnterText(UsernameEle,Username,"UserName.textbox");
		 WebElement PasswordEle=driver.findElement(By.id("password"));
		 clearText(PasswordEle, "Password.textbox");
		 EnterText(PasswordEle,Password,"Password.textbox");
		 WebElement Loginbutton=driver.findElement(By.id("Login"));
		 ClickElement(Loginbutton, "login.button");
		 WebElement Contacts=driver.findElement(By.linkText("Contacts"));
		 ClickElement(Contacts,"Contacts_tab");
		 WebElement RecentlyCreated=driver.findElement(By.id("hotlist_mode"));
		 ClickElement(RecentlyCreated,"RecentlyCreated_dropdown");
		 MveToEle(RecentlyCreated);
		 Thread.sleep(5);
		 selectFromDropdownByVisibleText(RecentlyCreated,"Recently Created");
	}
	
	@Test
	public static void SalesforceTestCase28() throws Throwable {
	     TestcaseNum("TestCase28");
	     PropertiesUtility pro=new PropertiesUtility();
	     Properties appProp=pro.loadFile("applicationDataProperties");
	     String Username=appProp.getProperty("login.valid.userid");
	     String Password=appProp.getProperty("login.valid.password");
		 WebElement UsernameEle=driver.findElement(By.name("username"));
		 waitforvisibility(UsernameEle,11,"implicit wait");
		 EnterText(UsernameEle,Username,"UserName.textbox");
		 WebElement PasswordEle=driver.findElement(By.id("password"));
		 clearText(PasswordEle, "Password.textbox");
		 EnterText(PasswordEle,Password,"Password.textbox");
		 WebElement Loginbutton=driver.findElement(By.id("Login"));
		 ClickElement(Loginbutton, "login.button");
		 WebElement Contacts=driver.findElement(By.linkText("Contacts"));
		 ClickElement(Contacts,"Contacts_tab");
		 WebElement View=driver.findElement(By.id("fcf"));
		 ClickElement(View,"view_dropdown");
		 MveToEle(View);
		 Thread.sleep(5);
		 selectFromDropdownByVisibleText(View,"My Contacts");
	}
	
	@Test
	public static void SalesforceTestCase29() {
	     TestcaseNum("TestCase29");
	     PropertiesUtility pro=new PropertiesUtility();
	     Properties appProp=pro.loadFile("applicationDataProperties");
	     String Username=appProp.getProperty("login.valid.userid");
	     String Password=appProp.getProperty("login.valid.password");
		 WebElement UsernameEle=driver.findElement(By.name("username"));
		 waitforvisibility(UsernameEle,11,"implicit wait");
		 EnterText(UsernameEle,Username,"UserName.textbox");
		 WebElement PasswordEle=driver.findElement(By.id("password"));
		 clearText(PasswordEle, "Password.textbox");
		 EnterText(PasswordEle,Password,"Password.textbox");
		 WebElement Loginbutton=driver.findElement(By.id("Login"));
		 ClickElement(Loginbutton, "login.button");
		 WebElement Contacts=driver.findElement(By.linkText("Contacts"));
		 ClickElement(Contacts,"Contacts_tab");
		 WebElement ContactName=driver.findElement(By.linkText("ABCD"));
		 ClickElement(ContactName,"ContactName_link");
	}
	
	@Test
	public static void SalesforceTestCase30() {
	     TestcaseNum("TestCase30");
	     String ExpValue="Error: You must enter a value";
	     PropertiesUtility pro=new PropertiesUtility();
	     Properties appProp=pro.loadFile("applicationDataProperties");
	     String Username=appProp.getProperty("login.valid.userid");
	     String Password=appProp.getProperty("login.valid.password");
		 WebElement UsernameEle=driver.findElement(By.name("username"));
		 waitforvisibility(UsernameEle,11,"implicit wait");
		 EnterText(UsernameEle,Username,"UserName.textbox");
		 WebElement PasswordEle=driver.findElement(By.id("password"));
		 clearText(PasswordEle, "Password.textbox");
		 EnterText(PasswordEle,Password,"Password.textbox");
		 WebElement Loginbutton=driver.findElement(By.id("Login"));
		 ClickElement(Loginbutton, "login.button");
		 WebElement Contacts=driver.findElement(By.linkText("Contacts"));
		 ClickElement(Contacts,"Contacts_tab");
		 WebElement CreateNewView=driver.findElement(By.linkText("Create New View"));
		 ClickElement(CreateNewView,"CreateNewView_link");
		 WebElement ViewUniqueNameEle=driver.findElement(By.id("devname"));
		 String ViewUniqueName=appProp.getProperty("View.Unique.Name");
		 EnterText(ViewUniqueNameEle, ViewUniqueName,"ViewUniqueName_box");
		 WebElement Save=driver.findElement(By.name("save"));
		 ClickElement(Save,"Save_button");
		 WebElement ErrorEle=driver.findElement(By.xpath("//div[@class='requiredInput']/div[@class='errorMsg']"));
		 String ActValue=ErrorEle.getText();
		 Assert.assertEquals(ActValue,ExpValue);
	}
	
	@Test
	public static void SalesforceTestCase31() {
	     TestcaseNum("TestCase31");
	     PropertiesUtility pro=new PropertiesUtility();
	     Properties appProp=pro.loadFile("applicationDataProperties");
	     String Username=appProp.getProperty("login.valid.userid");
	     String Password=appProp.getProperty("login.valid.password");
		 WebElement UsernameEle=driver.findElement(By.name("username"));
		 waitforvisibility(UsernameEle,11,"implicit wait");
		 EnterText(UsernameEle,Username,"UserName.textbox");
		 WebElement PasswordEle=driver.findElement(By.id("password"));
		 clearText(PasswordEle, "Password.textbox");
		 EnterText(PasswordEle,Password,"Password.textbox");
		 WebElement Loginbutton=driver.findElement(By.id("Login"));
		 ClickElement(Loginbutton, "login.button");
		 WebElement Contacts=driver.findElement(By.linkText("Contacts"));
		 ClickElement(Contacts,"Contacts_tab");
		 WebElement CreateNewView=driver.findElement(By.linkText("Create New View"));
		 ClickElement(CreateNewView,"CreateNewView_link");
		 WebElement ViewNameEle=driver.findElement(By.id("fname"));
		 String ViewName=appProp.getProperty("View.Name");
		 EnterText(ViewNameEle, ViewName,"ViewName_box");
		 WebElement ViewUniqueNameEle=driver.findElement(By.id("devname"));
		 String ViewUniqueName=appProp.getProperty("View.Unique.Name");
		 EnterText(ViewUniqueNameEle, ViewUniqueName,"ViewUniqueName_box");
		 WebElement Cancel=driver.findElement(By.name("cancel"));
		 ClickElement(Cancel,"Cancel_button");
	}
	
	@Test
	public static void SalesforceTestCase32() {
	     TestcaseNum("TestCase32");
	     PropertiesUtility pro=new PropertiesUtility();
	     Properties appProp=pro.loadFile("applicationDataProperties");
	     String Username=appProp.getProperty("login.valid.userid");
	     String Password=appProp.getProperty("login.valid.password");
		 WebElement UsernameEle=driver.findElement(By.name("username"));
		 waitforvisibility(UsernameEle,11,"implicit wait");
		 EnterText(UsernameEle,Username,"UserName.textbox");
		 WebElement PasswordEle=driver.findElement(By.id("password"));
		 clearText(PasswordEle, "Password.textbox");
		 EnterText(PasswordEle,Password,"Password.textbox");
		 WebElement Loginbutton=driver.findElement(By.id("Login"));
		 ClickElement(Loginbutton, "login.button");
		 WebElement Contacts=driver.findElement(By.linkText("Contacts"));
		 ClickElement(Contacts,"Contacts_tab");
		 WebElement New=driver.findElement(By.xpath("//input[@name='new']"));
		 ClickElement(New,"New_button");
		 WebElement LastNameEle=driver.findElement(By.id("name_lastcon2"));
		 String LastName=appProp.getProperty("Last.Name");
		 EnterText(LastNameEle, LastName,"LastName_box");
		 WebElement AccountNameEle=driver.findElement(By.id("con4"));
		 String AccountName=appProp.getProperty("Account.Name");
		 EnterText(AccountNameEle, AccountName,"AccountName_box");
		 WebElement SaveandNew=driver.findElement(By.name("save_new"));
		 ClickElement(SaveandNew,"SaveandNew_button");
	}

}
