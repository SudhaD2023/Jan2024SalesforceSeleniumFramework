package com.automation.tests.scripts;

import java.util.Properties;

import org.apache.commons.compress.archivers.sevenz.CLI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.tests.base.BaseTest;
import com.automation.tests.utilities.PropertiesUtility;

public class SalesforceProjectRandomScenarios extends BaseTest {
	
	@Test
	public static void SalesforceTestCase33() {
	     TestcaseNum("TestCase33");
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
		 WebElement Home=driver.findElement(By.linkText("Home"));
		 ClickElement(Home, "Home_tab");
		 WebElement FirstLastName=driver.findElement(By.linkText("Sudha EFGH"));
		 ClickElement(FirstLastName,"FirstLastName_link");
		 WebElement FirstLastNamePageEle=driver.findElement(By.id("tailBreadcrumbNode"));
		 String ActFirstLastNamePage=FirstLastNamePageEle.getText();
		 WebElement UserMenuDropdown=driver.findElement(By.id("userNavButton"));
		 ClickElement(UserMenuDropdown,"UserMenuDropdown");
		 MveToEle(UserMenuDropdown);
		 WebElement MyProfileEle=driver.findElement(By.linkText("My Profile"));
		 ClickElement(MyProfileEle,"MyProfile_option");
		 WebElement MyProfilePage=driver.findElement(By.id("tailBreadcrumbNode"));
		 String ExpFirstLastName=MyProfilePage.getText();
		 Assert.assertEquals(ActFirstLastNamePage, ExpFirstLastName);
	}
	
	@Test
	public static void SalesforceTestCase34() {
	     TestcaseNum("TestCase34");
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
		 WebElement Home=driver.findElement(By.linkText("Home"));
		 ClickElement(Home, "Home_tab");
		 WebElement FirstLastNameLink=driver.findElement(By.xpath("//div[@id='mru005Hs00000Dcqnj']/a/span[@class='mruText']"));
		 ClickElement(FirstLastNameLink, "FirstLastName_Link");
		 WebElement EditProfile=driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']/img[@title='Edit Profile']"));
		 ClickElement(EditProfile, "EditProfile_link");
		 WebElement EditProfileFrame=driver.findElement(By.id("contactInfoContentId"));
		 SwitchtoFrame(EditProfileFrame,"EditProfile_Frame");
		 WebElement About=driver.findElement(By.xpath("//li[@id='aboutTab']/a"));
		 ClickElement(About,"About_tab");
		 WebElement LastNameEle=driver.findElement(By.id("lastName"));
		 String LastName=appProp.getProperty("Last.Name");
		 EnterText(LastNameEle, LastName, "LastName_box");
		 WebElement SaveAll=driver.findElement(By.xpath("//input[@value='Save All']"));
		 ClickElement(SaveAll,"SaveAll");
	}
	@Test
	public static void SalesforceTestCase35() {
	     TestcaseNum("TestCase35");
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
		 WebElement AllTabs=driver.findElement(By.xpath("//img[@title='All Tabs']"));
		 ClickElement(AllTabs,"AllTabs");
		 WebElement CustomizeMyTab=driver.findElement(By.name("customize"));
		 ClickElement(CustomizeMyTab, "CustomizeMyTab_button");
		 WebElement SelectedTabs=driver.findElement(By.id("duel_select_1"));
		 MveToEle(SelectedTabs);
		 selectFromDropdownByVisibleText(SelectedTabs,"Chatter");
		 WebElement Remove=driver.findElement(By.xpath("//img[@title='Remove']"));
		 ClickElement(Remove, "Remove_button");
		 WebElement Save=driver.findElement(By.name("save"));
		 ClickElement(Save, "Save_button");
		 WebElement UserMenuDropdown=driver.findElement(By.id("userNavLabel"));
		 ClickElement(UserMenuDropdown, "UserMenuDropdown");
		 MveToEle(UserMenuDropdown);
		 WebElement Logout=driver.findElement(By.linkText("Logout"));
		 ClickElement(Logout, "Logout_button");
		 UsernameEle=driver.findElement(By.name("username"));
		 waitforvisibility(UsernameEle,11,"implicit wait");
		 EnterText(UsernameEle,Username,"UserName.textbox");
	}
	
	@Test
	public static void SalesforceTestCase36() {
	     TestcaseNum("TestCase36");
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
		 WebElement Home=driver.findElement(By.linkText("Home"));
		 ClickElement(Home, "Home_tab");
		 WebElement CurrentDateLink=driver.findElement(By.linkText("Tuesday January 16, 2024"));
		 ClickElement(CurrentDateLink, "CurrentDate_Link");
		 JavascriptExecutor jse=(JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(0,700)");
		 WebElement EightPMLink=driver.findElement(By.linkText("//div[@id='p:f:j_id25:j_id61:28:j_id64']/a"));
		 waitforvisibility(EightPMLink, 5,"EightPM_Link");
		 ClickElement(EightPMLink,"EightPM_Link");
		 WebElement SubjectCombo=driver.findElement(By.className("comboboxIcon"));
		 ClickElement(SubjectCombo, "SubjectCombo");
	}

}
