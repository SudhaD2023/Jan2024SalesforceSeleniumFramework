package com.automation.tests.scripts;

import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.tests.base.BaseTest;
import com.automation.tests.utilities.PropertiesUtility;

public class SaleforceProjectLeads extends BaseTest {
	
	@Test
	public static void SalesforceTestCase20() {
	     TestcaseNum("TestCase20");
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
		 WebElement Leads=driver.findElement(By.xpath("//a[@title='Leads Tab']"));
		 ClickElement(Leads, "Leads_tab");
	}
	
	@Test
	public static void SalesforceTestCase21() {
	     TestcaseNum("TestCase21");
	     ArrayList<String> ExpOpts=new ArrayList<String>();
	     ExpOpts.add("All Open Leads");
	     ExpOpts.add("My Unread Leads");
	     ExpOpts.add("Recently Viewed Leads");
	     ExpOpts.add("Today's Leads");
	     ExpOpts.add("View - Custom 1");
	     ExpOpts.add("View - Custom 2");
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
		 WebElement Leads=driver.findElement(By.xpath("//a[@title='Leads Tab']"));
		 ClickElement(Leads, "Leads_tab");
		 WebElement View=driver.findElement(By.id("fcf"));
		 ClickElement(View,"View_dropdown");
		 MveToEle(View);
		 selectByOptions(View);
		 Assert.assertEquals(actualOpts,ExpOpts);
		 
	}
	
	@Test
	 public static void SalesforceTestCase22() {
	     TestcaseNum("TestCase22");
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
		 WebElement Leads=driver.findElement(By.xpath("//a[@title='Leads Tab']"));
		 ClickElement(Leads, "Leads_tab");
		 WebElement View=driver.findElement(By.id("fcf"));
		 ClickElement(View,"View_dropdown");
		 MveToEle(View);
		 SwitchToDefaultContent();
		 selectFromDropdownByVisibleText(View,"My Unread Leads");
		 WebElement UserMenu=driver.findElement(By.id("userNavLabel"));
		 ClickElement(UserMenu,"UserMenu_dropdown");
		 MveToEle(UserMenu);
		 WebElement logout=driver.findElement(By.linkText("Logout"));
		 ClickElement(logout,"Logout_button");
		 try {
			 waitforvisibility(UsernameEle,11,"implicit wait");
			 EnterText(UsernameEle,Username,"UserName.textbox");
		 }catch(Exception e) {
			 Username=appProp.getProperty("login.valid.userid");
			 UsernameEle=driver.findElement(By.name("username"));
			 waitforvisibility(UsernameEle,11,"implicit wait");
			 EnterText(UsernameEle,Username,"UserName.textbox");
		 }
		 try {
			 clearText(PasswordEle, "Password.textbox");
			 EnterText(PasswordEle,Password,"Password.textbox");
		 }catch(Exception e){
			 Password=appProp.getProperty("login.valid.password");
			 PasswordEle=driver.findElement(By.id("password"));
			 clearText(PasswordEle, "Password.textbox");
			 EnterText(PasswordEle,Password,"Password.textbox");
		 }
			Loginbutton=driver.findElement(By.id("Login"));
			 ClickElement(Loginbutton, "login.button");
		}
	
	@Test
	public static void SalesforceTestCase23() {
	     TestcaseNum("TestCase23");
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
		 WebElement Leads=driver.findElement(By.xpath("//a[@title='Leads Tab']"));
		 ClickElement(Leads, "Leads_tab");
		 WebElement View=driver.findElement(By.id("fcf"));
		 ClickElement(View,"View_dropdown");
		 MveToEle(View);
		 selectFromDropdownByVisibleText(View,"Today's Leads");
		 WebElement go=driver.findElement(By.xpath("//span[@class='fBody']/input[@name='go']"));
		 ClickElement(go,"go_button");
	}
	
	@Test
	public static void SalesforceTestCase24() {
	     TestcaseNum("TestCase24");
	     String ExpValue="ABCD";
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
		 WebElement Leads=driver.findElement(By.xpath("//a[@title='Leads Tab']"));
		 ClickElement(Leads, "Leads_tab");
		 WebElement New=driver.findElement(By.xpath("//input[@name='new']"));
		 ClickElement(New, "New_button");
		 WebElement LastNameEle=driver.findElement(By.id("name_lastlea2"));
		 String LastName=appProp.getProperty("Last.Name");
		 EnterText(LastNameEle,LastName,"LastName_box");
		 WebElement CompanyNameEle=driver.findElement(By.id("lea3"));
		 String CompanyName=appProp.getProperty("Company.Name");
		 EnterText(CompanyNameEle, CompanyName,"CompanyName_box");
		 WebElement Save=driver.findElement(By.name("save"));
		 ClickElement(Save,"Save_button");
		 WebElement NewLead=driver.findElement(By.xpath("//h2[@class='topName']"));
		 String ActValue=NewLead.getText();
		 Assert.assertEquals(ActValue,ExpValue);
	}
		 
		 
	}


