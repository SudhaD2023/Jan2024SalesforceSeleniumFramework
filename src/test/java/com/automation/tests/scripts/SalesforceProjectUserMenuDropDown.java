package com.automation.tests.scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.tests.base.BaseTest;
import com.automation.tests.utilities.PropertiesUtility;

public class SalesforceProjectUserMenuDropDown extends BaseTest {
	
       
	 @Test
	 public static void SalesforceTestCase5() {
    	   TestcaseNum("TestCase5");
    	   ArrayList<String> ExpOptions=new ArrayList<String>();
   		   ExpOptions.add("My profile");
   		   ExpOptions.add("My Settings");
   		   ExpOptions.add("Developer Console");
   		   ExpOptions.add("Switching to lightning Experience");
   		   ExpOptions.add("Logout");
   		   LaunchBrowser("Chrome");
   		   ArrayList<WebElement> Actual=new ArrayList<WebElement>();
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
   		   WebElement Login=driver.findElement(By.id("Login"));
   		   ClickElement(Login,"Login.button");
   		   WebElement UserMenuDropDown=driver.findElement(By.id("userNavLabel"));
		   ClickElement(UserMenuDropDown,"UserMenu.DropDown");
		   Actions action=new Actions(driver);
		   action.moveToElement(UserMenuDropDown).build().perform();
		   List<WebElement> UserMenuList=driver.findElements(By.id("userNav-menuItems"));
		   System.out.println("UserMenuList");
			for(WebElement ele:UserMenuList)
			{
				System.out.println(ele.getText());
				Actual.add(ele);
			}
			Assert.assertEquals(Actual,ExpOptions,"Fail:TestCase Failed");
			driverclose();
       }
	 
	 @Test
	 public static void SalesforceTestCase6() throws AWTException {
		 TestcaseNum("TestCase6");
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
		 WebElement UserMenuDropDown=driver.findElement(By.id("userNavLabel"));
		 ClickElement(UserMenuDropDown, "UserMenu.DropDown");
		 Actions action=new Actions(driver);
		 action.moveToElement(UserMenuDropDown).build().perform();
		 WebElement MyProfile=driver.findElement(By.xpath("//div[@id='userNav-menuItems']/a[@class='menuButtonMenuLink firstMenuItem']"));
		 ClickElement(MyProfile,"MyProfile.Option");
		 WebElement ContactEdit=driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']/img[@title='Edit Profile']"));
		 ClickElement(ContactEdit,"ContactEdit.button");
		 WebElement FrameElement=driver.findElement(By.id("contactInfoContentId"));
		 SwitchtoFrame(FrameElement,"FrameElement");
		 WebElement About=driver.findElement(By.xpath("//li[@id='aboutTab']/a"));
		 waitforvisibility(About, 5, "About.tab");
		 ClickElement(About,"About.tab");
		 WebElement LastName=driver.findElement(By.xpath("//input[@id='lastName']"));
		 clearText(LastName,"LastName.textbox");
		 EnterText(LastName,"EFGH","LastName.textbox");
		 WebElement SaveAll=driver.findElement(By.xpath("//input[@class='zen-btn zen-primaryBtn zen-pas']"));
		 ClickElement(SaveAll,"SaveAll.button");
		 //SwitchToDefaultContent();
		 WebElement ChangedLastName=driver.findElement(By.xpath("//div[@id='0D5Hs0000BZMsX9']/div/div/div/div/span/span/a[contains(@id,'hoverItem')]"));
		 waitforvisibility(ChangedLastName,5,"ChangedLastName");
		 String ExpLastName="Sudha EFGH";
		 String ActualLastName=ChangedLastName.getText();
		 Assert.assertEquals(ActualLastName, ExpLastName,"Fail:Last Name do not match");
		 WebElement Post=driver.findElement(By.xpath("//a[@id='publisherAttachTextPost']/span[@class='publisherattachtext ']"));
		 ClickElement(Post,"Post.button");
		 WebElement PostFrame=driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		 SwitchtoFrame(PostFrame,"PostFrame");
		 WebElement PostText=driver.findElement(By.xpath("//body[text()='Share an update, @mention someone...']"));
		 EnterText(PostText,"writing in post text box","Post.textbox");
		 SwitchToDefaultContent();
		 WebElement Share=driver.findElement(By.id("publishersharebutton"));
		 ClickElement(Share,"Share.button");
		 WebElement ActualPostTextEle=driver.findElement(By.xpath("//div[contains(@id,'0D5Hs0000BZMs')]"));
		 String ExpectedPostText="writing in post text box";
		 String ActualPostText=ActualPostTextEle.getText();
		// Assert.assertEquals(ActualPostText, ExpectedPostText,"Fail:Post text do not match");
		 WebElement File=driver.findElement(By.xpath("//span[text()='File']"));
		 ClickElement(File, "File.button");
		 WebElement UploadFileFromComputer=driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']"));
		 ClickElement(UploadFileFromComputer,"UploadFileFromComputer.button");
		 WebElement ChooseFile=driver.findElement(By.xpath("//input[@id='chatterFile']"));
		// uploadingfilefromdesktopwindow(ChooseFile,"ChooseFile.button","C:\\Users\\sudha\\OneDrive\\Desktop\\TechArch\\TekarchFileUpload.txt");
		 WebElement AddPhoto=driver.findElement(By.id("displayBadge"));
		 ClickElement(AddPhoto,"AddPhoto.button");
		 WebElement AddPhotoFrame=driver.findElement(By.xpath("//iframe[@id='uploadPhotoContentId']"));
		 SwitchtoFrame(AddPhotoFrame,"AddPhotoFrame");
		 WebElement AddPhotoChooseFile=driver.findElement(By.id("j_id0:uploadFileForm:uploadInputFile"));
		 uploadingfilefromdesktopwindow(AddPhotoChooseFile,"AddPhotoChooseFile.button" ,"C:\\Users\\sudha\\OneDrive\\Desktop\\TechArch\\TekarchFileUpload.txt");
		 ClickElement(AddPhotoChooseFile,"AddPhotoChooseFile.button");
	 }
	 
	 @Test
	 public static void SalesforceTestCase7() {
		 TestcaseNum("TestCase7");
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
		 WebElement UserMenuDropDown=driver.findElement(By.id("userNavLabel"));
		 ClickElement(UserMenuDropDown, "UserMenu.DropDown");
		 MveToEle(UserMenuDropDown);
		 WebElement MySettings=driver.findElement(By.xpath("//a[@title='My Settings']"));
		 ClickElement(MySettings,"MySettings.Option");
		 WebElement Personal=driver.findElement(By.id("PersonalInfo_font"));
		 ClickElement(Personal,"Personal.link");
		 WebElement LoginHistory=driver.findElement(By.xpath("//span[@id='LoginHistory_font']"));
		 ClickElement(LoginHistory,"LoginHistory.link");
		 WebElement DownloadLoginHistory=driver.findElement(By.xpath("//a[@href='/servlet/servlet.LoginHistory?id=005Hs00000Dcqnj']"));
		 ClickElement(DownloadLoginHistory,"DownloadLoginHistory.link");
		 WebElement DisplayandLayout=driver.findElement(By.id("DisplayAndLayout_font"));
		 ClickElement(DisplayandLayout,"DisplayandLayout_link");
		 WebElement CustomizeMyTab=driver.findElement(By.xpath("//span[@id='CustomizeTabs_font']"));
		 ClickElement(CustomizeMyTab,"CustomizeMyTab_link");
		 WebElement CustomApp=driver.findElement(By.xpath("//select[@id='p4']"));
		 MveToEle(CustomApp);
		 selectFromDropdownByVisibleText(CustomApp,"Salesforce Chatter");
		 WebElement AvailableTabs=driver.findElement(By.xpath("//select[@id='duel_select_0']"));
		 selectFromDropdownByValue(AvailableTabs,"report");
		 WebElement AddButton=driver.findElement(By.xpath("//img[@alt='Add']"));
		 ClickElement(AddButton,"Add_Button");
		 WebElement Email=driver.findElement(By.xpath("//div[@id='EmailSetup']/a[@class='header setupFolder']"));
		 ClickElement(Email,"Email_link");
		 WebElement MyEmailSettings=driver.findElement(By.xpath("//a[@id='EmailSettings_font']"));
		 ClickElement(MyEmailSettings,"MyEmailSettings_link");
		 WebElement EmailNameEle=driver.findElement(By.id("sender_name"));
		 String EmailName=appProp.getProperty("Email.Name");
		 EnterText(EmailNameEle,EmailName,"EmailName_field");
		 WebElement EmailAdressEle=driver.findElement(By.id("sender_name"));
		 String EmailAdress=appProp.getProperty("Email.Adress");
		 EnterText(EmailAdressEle,EmailAdress,"EmailAdress_field");
		 WebElement AutomaticBccYesRadio=driver.findElement(By.id("auto_bcc1"));
		 ClickElement(AutomaticBccYesRadio,"AutomaticBccYesRadio_RadioButton");
		 WebElement Save=driver.findElement(By.name("save"));
		 ClickElement(Save,"Save_button");
		 WebElement CalenderandReminders=driver.findElement(By.id("CalendarAndReminders_font"));
		 ClickElement(CalenderandReminders,"CalenderandReminders_link");
		 WebElement ActivityReminders=driver.findElement(By.xpath("//a[@id='Reminders_font']"));
		 ClickElement(ActivityReminders,"ActivityReminders_link");
		 WebElement OpenATestReminder=driver.findElement(By.id("testbtn"));
		 ClickElement(OpenATestReminder,"OpenATestReminder_button");
	 }
	 
	 @Test
	 public static void SalesforceTestCase8() {
		 TestcaseNum("TestCase8");
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
		 WebElement UserMenuDropDown=driver.findElement(By.id("userNavLabel"));
		 ClickElement(UserMenuDropDown, "UserMenu.DropDown");
		 MveToEle(UserMenuDropDown);
		 WebElement DeveloperConsole=driver.findElement(By.xpath("//a[@class='debugLogLink menuButtonMenuLink']"));
		 ClickElement(DeveloperConsole, "DeveloperConsole_link");
		 getwindowhandleOfChildWindow();
		 
		 }
	
	 @Test
	 public static void SalesforceTestCase9() {
		 TestcaseNum("TestCase9");
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
		 WebElement UserMenuDropDown=driver.findElement(By.id("userNavLabel"));
		 ClickElement(UserMenuDropDown, "UserMenu.DropDown");
		 MveToEle(UserMenuDropDown);
		 WebElement Logout=driver.findElement(By.xpath("//div[@id='userNav-menuItems']/a[5]"));
        ClickElement(Logout,"Logout_link");
	 }
	 
}

