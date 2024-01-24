package com.automation.tests.scripts;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.tests.base.BaseTest;
import com.automation.tests.utilities.PropertiesUtility;

public class SalesforceProjectCreateAccount extends BaseTest{
         
	     @Test 
	     public static void SalesforceTestCase10() {
	    	 TestcaseNum("TestCase10");
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
			 WebElement Accounts=driver.findElement(By.id("Account_Tab"));
			 ClickElement(Accounts,"Accounts_tab");
			 WebElement New=driver.findElement(By.xpath("//input[@name='new']"));
			 ClickElement(New,"New_button");
			 WebElement AccountNameEle=driver.findElement(By.xpath("//input[@id='acc2']"));
			 String AccountName=appProp.getProperty("Account.Name");
			 EnterText(AccountNameEle,AccountName,"AccountName_box" );
			 WebElement Type=driver.findElement(By.xpath("//select[@tabindex='5']"));
			 selectFromDropdownByVisibleText(Type,"Technology Partner");
			 WebElement CustomerPriority=driver.findElement(By.xpath("//select[@id='00NHs00000SIRWz']"));
	         selectFromDropdownByVisibleText(CustomerPriority,"High");
	         WebElement Save=driver.findElement(By.xpath("//td[@id='topButtonRow']/input[@name='save']"));
	         ClickElement(Save,"Save_button");
	     }
	     
	     @Test
	     public static void SalesforceTestCase11() {
	    	 TestcaseNum("TestCase11");
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
			 WebElement Accounts=driver.findElement(By.id("Account_Tab"));
			 ClickElement(Accounts,"Accounts_tab");
			 WebElement CreateNewView=driver.findElement(By.xpath("//a[text()='Create New View']"));
			 ClickElement(CreateNewView,"CreateNewView_link");
			 WebElement ViewNameEle=driver.findElement(By.id("fname"));
			 String ViewName=appProp.getProperty("View.Name");
			 EnterText(ViewNameEle,ViewName,"ViewName_box");
			 WebElement ViewUniqueNameEle=driver.findElement(By.xpath("//input[@id='devname']"));
			 String ViewUniqueName=appProp.getProperty("View.Unique.Name");
			 EnterText(ViewUniqueNameEle,ViewUniqueName,"ViewUniqueName_box");
			 WebElement Save=driver.findElement(By.xpath("//td/input[@name='save']"));
			 ClickElement(Save,"Save_button");
	     }
	     
	     @Test
	     public static void SalesforceTestCase12() {
	    	 TestcaseNum("TestCase12");
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
			 WebElement Accounts=driver.findElement(By.id("Account_Tab"));
			 ClickElement(Accounts,"Accounts_tab");
			 WebElement View=driver.findElement(By.xpath("//select[@id='fcf']"));
			 selectFromDropdownByVisibleText(View,"SudhaD");
			 WebElement Edit=driver.findElement(By.xpath("//a[text()='Edit']"));
			 ClickElement(Edit,"Edit_button");
			 WebElement ViewNameEle=driver.findElement(By.id("fname"));
			 String ViewName=appProp.getProperty("New.View.Name");
			 EnterText(ViewNameEle,ViewName,"ViewName_box");
			 WebElement Field=driver.findElement(By.xpath("//select[@id='fcol1']"));
			 selectFromDropdownByVisibleText(Field,"Account Name");
			 WebElement Operator=driver.findElement(By.xpath("//select[@id='fop1']"));
			 selectFromDropdownByVisibleText(Operator,"contains");
			 WebElement value=driver.findElement(By.xpath("//input[@id='fval1']"));
			 EnterText(value,"a","value_box");
			 WebElement Save=driver.findElement(By.xpath("//td[@class='pbButtonb']/input[@class='btn primary']"));
			 ClickElement(Save,"Save_button");
	     }
	     
	     @Test
	     public static void SalesforceTestCase13() {
	    	 TestcaseNum("TestCase13");
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
			 WebElement Accounts=driver.findElement(By.id("Account_Tab"));
			 ClickElement(Accounts,"Accounts_tab");
			 WebElement MergeAccounts=driver.findElement(By.linkText("Merge Accounts"));
			 ClickElement(MergeAccounts,"MergeAccounts_link");
			 WebElement AccountNameEle=driver.findElement(By.id("srch"));
			 String AccountName=appProp.getProperty("Merge.Accounts");
			 EnterText(AccountNameEle, AccountName,"AccountName_box");
			 WebElement FindAccounts=driver.findElement(By.name("srchbutton"));
			 ClickElement(FindAccounts,"FindAccounts_button");
			 //WebElement AccountCheckBox1=driver.findElement(By.id("cid0"));
			 //ClickElement(AccountCheckBox1, "Account_CheckBox");
			 //WebElement AccountCheckBox2=driver.findElement(By.id("cid1"));
			 //ClickElement(AccountCheckBox2, "Account_CheckBox");
			 WebElement Next=driver.findElement(By.name("goNext"));
			 ClickElement(Next,"Next_button");
			 WebElement Merge=driver.findElement(By.xpath("//input[@value=' Merge ']"));
			 ClickElement(Merge,"Merge_button");
			 popupok();
	     }
	     
	     @Test
	     public static void SalesforceTestCase14() {
	    	 TestcaseNum("TestCase14");
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
			 WebElement Accounts=driver.findElement(By.id("Account_Tab"));
			 ClickElement(Accounts,"Accounts_tab");
			 WebElement AcctWithLastActivity=driver.findElement(By.linkText("Accounts with last activity > 30 days"));
			 ClickElement(AcctWithLastActivity,"AcctWithLastActivity_link");
			 WebElement DateField=driver.findElement(By.id("ext-gen148"));
			 ClickElement(DateField,"DateField_dropdown");
			 WebElement CreateDate=driver.findElement(By.xpath("//div[text()='Created Date']"));
			 ClickElement(CreateDate,"CreateDate_link");
			 WebElement FromCalender=driver.findElement(By.id("ext-gen152"));
			 ClickElement(FromCalender,"From_Calender");
			 WebElement calender1=driver.findElement(By.id("ext-gen272"));
			 waitforvisibility(calender1,5,"implicit wait");
			 WebElement TodayFromCal=driver.findElement(By.id("ext-gen281"));
			 ClickElement(TodayFromCal,"TodaysDate_FromCal");
			 WebElement Tocalender=driver.findElement(By.id("ext-gen154"));
			 ClickElement(Tocalender,"To_calender");
			 WebElement calender2=driver.findElement(By.id("ext-gen287"));
			 waitforvisibility(calender2,5,"implicit wait");
			 WebElement TodayToCal=driver.findElement(By.id("ext-gen296"));
			 ClickElement(TodayToCal,"TodaysDate_ToCal");
			 WebElement Save=driver.findElement(By.id("ext-gen49"));
			 ClickElement(Save,"Save_button");
			 SwitchToAlertEnterText();
			 WebElement ReportNameEle=driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']"));
			 String ReportName=appProp.getProperty("Report.Name");
			 EnterText(ReportNameEle,ReportName, "ReportName_box");
			 
	     }
}
