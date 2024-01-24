package com.automation.tests.scripts;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.tests.base.BaseTest;
import com.automation.tests.utilities.PropertiesUtility;

public class SalesforceProjectCreateOpty extends BaseTest{
    
	@Test
	public static void SalesforceTestCase15() {
   	     TestcaseNum("TestCase15");
   	     ArrayList<String> ExpOpts=new ArrayList<String>();
   	     ExpOpts.add("All Opportunities");
   	     ExpOpts.add("Closing Next Month");
   	     ExpOpts.add("Closing This Month");
   	     ExpOpts.add("My Opportunities");
   	     ExpOpts.add("New Last Week");
   	     ExpOpts.add("New This Week");
   	     ExpOpts.add("Opportunity Pipeline");
   	     ExpOpts.add("Private");
   	     ExpOpts.add("Recently Viewed Opportunities");
   	     ExpOpts.add("Won");
		 PropertiesUtility pro=new PropertiesUtility();
	     Properties appProp=pro.loadFile("applicationDataProperties");
	     String Username=appProp.getProperty("login.valid.userid");
	     String Password=appProp.getProperty("login.valid.password");
		 WebElement UsernameEle=driver.findElement(By.name("username"));
		 waitforvisibility(UsernameEle,10,"implicit wait");
		 EnterText(UsernameEle,Username,"UserName.textbox");
		 WebElement PasswordEle=driver.findElement(By.id("password"));
		 clearText(PasswordEle, "Password.textbox");
		 EnterText(PasswordEle,Password,"Password.textbox");
		 WebElement Loginbutton=driver.findElement(By.id("Login"));
		 ClickElement(Loginbutton, "login.button");
		 WebElement Opportunities=driver.findElement(By.xpath("//a[@title='Opportunities Tab']"));
		 ClickElement(Opportunities, "Opportunities_tab");
		 WebElement View=driver.findElement(By.id("fcf"));
		 ClickElement(View,"View_dropdown");
		 MveToEle(View);
		 selectByOptions(View);
		 Assert.assertEquals(actualOpts, ExpOpts);
	}
	
	@Test
	public static void SalesforceTestCase16() {
  	     TestcaseNum("TestCase16");
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
		 WebElement Opportunities=driver.findElement(By.xpath("//a[@title='Opportunities Tab']"));
		 ClickElement(Opportunities, "Opportunities_tab");
		 WebElement New=driver.findElement(By.xpath("//input[@name='new']"));
		 ClickElement(New,"New_button");
		 WebElement OpportunityNameEle=driver.findElement(By.id("opp3"));
		 String OpportunityName=appProp.getProperty("Opportunity.Name");
		 EnterText(OpportunityNameEle,OpportunityName,"OpportunityName_box");
		 WebElement AccountNameEle=driver.findElement(By.xpath("//input[@id='opp4']"));
		 String AccountName=appProp.getProperty("Account.Name");
		 EnterText(AccountNameEle, AccountName,"AccountName_box");
		 WebElement CloseDate=driver.findElement(By.id("opp9"));
		 ClickElement(CloseDate, "CloseDate_calender");
		 WebElement Calender=driver.findElement(By.xpath("//div[@class='calBody']"));
		 waitforvisibility(Calender, 5,"Calender");
		 WebElement todayDate=driver.findElement(By.xpath("//a[@class='calToday']"));
		 ClickElement(todayDate,"todayDate");
		 SwitchToDefaultContent();
		 WebElement StageLabel=driver.findElement(By.xpath("//div[@class='pbSubsection']/table/tbody/tr[4]/td[3]"));
		 ClickElement(StageLabel,"StageLabel");
		 WebElement Stage=driver.findElement(By.id("opp11"));
		 ClickElement(Stage,"Stage_dropdown");
		 MveToEle(Stage);
		 selectFromDropdownByVisibleText(Stage,"Qualification");
		 WebElement Probability=driver.findElement(By.id("opp12"));
		 EnterText(Probability,"10","Probability_box");
		 WebElement LeadSource=driver.findElement(By.id("opp6"));
		 ClickElement(LeadSource, "LeadSource_dropdown");
		 MveToEle(LeadSource);
		 selectFromDropdownByVisibleText(LeadSource,"Phone Inquiry");
		 WebElement PrimaryCampaignSourceEle=driver.findElement(By.id("opp17"));
		 String PrimaryCampaign=appProp.getProperty("Primary.Campaign.Source");
		 EnterText(PrimaryCampaignSourceEle,PrimaryCampaign,"PrimaryCampaign_box");
		 WebElement Save=driver.findElement(By.xpath("//input[@value=' Save ']"));
		 ClickElement(Save, "Save_button");
		 }
	
	@Test
	public static void SalesforceTestCase17() {
 	     TestcaseNum("TestCase17");
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
		 WebElement Opportunities=driver.findElement(By.xpath("//a[@title='Opportunities Tab']"));
		 ClickElement(Opportunities, "Opportunities_tab");
		 WebElement OpportunityPipeline=driver.findElement(By.linkText("Opportunity Pipeline"));
		 ClickElement(OpportunityPipeline,"OpportunityPipeline_link");
	}
	
	@Test
	public static void SalesforceTestCase18() {
	     TestcaseNum("TestCase18");
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
		 WebElement Opportunities=driver.findElement(By.xpath("//a[@title='Opportunities Tab']"));
		 ClickElement(Opportunities, "Opportunities_tab");
		 WebElement StuckOpportunities=driver.findElement(By.linkText("Stuck Opportunities"));
		 ClickElement(StuckOpportunities,"StuckOpportunities_link");
	}
	
	@Test
	public static void SalesforceTestCase19() {
	     TestcaseNum("TestCase19");
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
		 WebElement Opportunities=driver.findElement(By.xpath("//a[@title='Opportunities Tab']"));
		 ClickElement(Opportunities, "Opportunities_tab");
		 WebElement Interval=driver.findElement(By.id("quarter_q"));
		 ClickElement(Interval,"Interval_dropdown");
		 MveToEle(Interval);
		 selectFromDropdownByVisibleText(Interval,"Next FQ");
		 WebElement Include=driver.findElement(By.id("open"));
		 ClickElement(Include,"Include_dropdown");
		 MveToEle(Include);
		 selectFromDropdownByVisibleText(Include,"Closed Opportunities");
		 WebElement RunReport=driver.findElement(By.xpath("//input[@value='Run Report']"));
		 ClickElement(RunReport,"RunReport_button");
	}
	
	    
}
