package com.automation.tests.scripts;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.tests.base.BaseTest;
import com.automation.tests.utilities.PropertiesUtility;

public class SalesforceProjectLogin extends BaseTest{
	@Test
     public static void SalesforceTestCase1() {
    	 TestcaseNum("TestCase1");
    	 String Expected="Please enter your password.";
    	 PropertiesUtility pro=new PropertiesUtility();
    	 Properties appProp=pro.loadFile("applicationDataProperties");
    	 String Username=appProp.getProperty("login.valid.userid");
    	 //String Password=appProp.getProperty("login.valid.password");
    	 WebElement UsernameEle=driver.findElement(By.id("username"));
    	 waitforvisibility(UsernameEle,5,"implicit wait");
    	 EnterText(UsernameEle,Username,"UserName.textbox");
    	 WebElement PasswordEle=driver.findElement(By.id("password"));
    	 clearText(PasswordEle, "Password.textbox");
    	 WebElement Login=driver.findElement(By.id("Login"));
    	 ClickElement(Login,"Login.button");
    	 WebElement Error=driver.findElement(By.id("error"));
    	 String actual=Error.getText();
    	 Assert.assertEquals(actual, Expected,"Fail:Testcase failed");
    	 
     }
	@Test
	public static void SalesforceTestCase2() {
		TestcaseNum("TestCase2");
		String Expected="search";
		PropertiesUtility pro=new PropertiesUtility();
   	    Properties appProp=pro.loadFile("applicationDataProperties");
   	    String Username=appProp.getProperty("login.valid.userid");
   	    String Password=appProp.getProperty("login.valid.password");
   	    WebElement UsernameEle=driver.findElement(By.id("username"));
	    waitforvisibility(UsernameEle,5,"implicit wait");
	    EnterText(UsernameEle,Username,"UserName.textbox");
	    WebElement PasswordEle=driver.findElement(By.id("password"));
	    clearText(PasswordEle, "Password.textbox");
		EnterText(PasswordEle,Password,"Password.textbox");
		WebElement Login=driver.findElement(By.id("Login"));
		ClickElement(Login,"Login.button");
		WebElement search=driver.findElement(By.id("phSearchButton"));
		waitforvisibility(search, 10, "implicit wait");
		String Actual=search.getText();
		System.out.println(Actual);
		Assert.assertEquals(Actual, Expected,"Fail:TestCase Failed");
	}
	
	@Test
	public static void SalesforceTestCase3() {
		TestcaseNum("TestCase3");
		String Expected="sudha@techarch.com";
		PropertiesUtility pro=new PropertiesUtility();
   	    Properties appProp=pro.loadFile("applicationDataProperties");
   	    String Username=appProp.getProperty("login.valid.userid");
   	    String Password=appProp.getProperty("login.valid.password");
   	    WebElement Usernameele=driver.findElement(By.id("username"));
	    waitforvisibility(Usernameele,5,"implicit wait");
	    EnterText(Usernameele,Username,"UserName.textbox");
	    WebElement Passwordele=driver.findElement(By.id("password"));
	    clearText(Passwordele, "Password.textbox");
		EnterText(Passwordele,Password,"Password.textbox");
		WebElement Rememberme=driver.findElement(By.id("rememberUn"));
		ClickElement(Rememberme,"Rememberme.checkbox");
		WebElement Login=driver.findElement(By.id("Login"));
		ClickElement(Login,"Login.button");
		WebElement UserMenuDropDown=driver.findElement(By.id("userNavLabel"));
		ClickElement(UserMenuDropDown,"UserMenu.DropDown");
		WebElement Logout=driver.findElement(By.xpath("//*[@title='Logout']"));
		ClickElement(Logout,"Logout.button");
		WebElement UsernameField=driver.findElement(By.xpath("//span[@id='idcard-identity']"));
		waitforvisibility(UsernameField, 5,"Username_Field");
		String Actual=gettext(UsernameField,"Username.text");
		Assert.assertEquals(Actual, Expected,"Fail:TestCase Failed");
	}
	
	@Test	
	public static void SalesforceTestCase4A()
	{
		TestcaseNum("TestCase4A");
		String Expected="Check Your Email";
		PropertiesUtility pro=new PropertiesUtility();
   	    Properties appProp=pro.loadFile("applicationDataProperties");
   	    String Username=appProp.getProperty("login.valid.userid");
   	    //String Password=appProp.getProperty("login.valid.password");
   	    WebElement forgotpassword=driver.findElement(By.id("forgot_password_link"));
   	    waitforvisibility(forgotpassword, 5,"implicit wait");
   	    ClickElement(forgotpassword,"forgotpassword.button");
   	    WebElement usernameforgotpasswordpage=driver.findElement(By.id("un"));
   	    waitforvisibility(usernameforgotpasswordpage, 5,"implicit wait");
   	    EnterText(usernameforgotpasswordpage,Username, "usernameforgotpasswordpage.textbox");
   	    WebElement continuebutton=driver.findElement(By.id("continue"));
   	    ClickElement(continuebutton,"continue.button");
   	    WebElement passwordreset=driver.findElement(By.xpath("//h1[@class='mb12']"));
   	    String Actual=passwordreset.getText();
   	    Assert.assertEquals(Actual, Expected,"Fail:TestCase Failed");
   	  
	}
	
	@Test	
	public static void SalesforceTestCase4B() {
		TestcaseNum("TestCase4B");
		PropertiesUtility pro=new PropertiesUtility();
   	    Properties appProp=pro.loadFile("applicationDataProperties");
   	    String Username=appProp.getProperty("login.invalid.userid");
   	    String Password=appProp.getProperty("login.valid.password");
		String Expected="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
   	    WebElement UsernameEle=driver.findElement(By.id("username"));
	    waitforvisibility(UsernameEle,5,"implicit wait");
	    EnterText(UsernameEle,Username,"UserName.textbox");
	    WebElement PasswordEle=driver.findElement(By.id("password"));
	    clearText(PasswordEle, "Password.textbox");
		EnterText(PasswordEle,Password,"Password.textbox");
		WebElement Login=driver.findElement(By.id("Login"));
		ClickElement(Login,"Login.button");
		WebElement loginerror=driver.findElement(By.xpath("//form[@id='login_form']/div[@aria-live='polite']"));
		String Actual=loginerror.getText();
		Assert.assertEquals(Actual, Expected,"Fail:TestCase Failed");
	}
	
}
