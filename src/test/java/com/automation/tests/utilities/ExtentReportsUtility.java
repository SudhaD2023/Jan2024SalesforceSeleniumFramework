package com.automation.tests.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsUtility {
     public static ExtentReports report;
     public static ExtentSparkReporter spark;
     public static ExtentTest testLogger;
     public static ExtentReportsUtility extentObject;
     
     private ExtentReportsUtility() {
    	 
     }
     public static ExtentReportsUtility getInstance() {
    	 if(extentObject==null) {
    		 extentObject=new ExtentReportsUtility();
    	 }
    	 return extentObject;
     }
     
     public void startExtentReport() {
    	 report=new ExtentReports();
    	 spark=new ExtentSparkReporter(constants.SPARKS_HTML_REPORT_PATH);
    	 report.setSystemInfo("Host Name","Salesforce");
    	 report.setSystemInfo("Environment", "QA");
    	 report.setSystemInfo("User Name","Sudha");
    	 
    	 spark.config().setDocumentTitle("Test Execution Report");
    	 spark.config().setReportName("Salesforce regression tests");
    	 spark.config().setTheme(Theme.DARK);
    	 report.attachReporter(spark);
     }
     
     public void startSingleTestReport(String methodName) {
    	 testLogger=report.createTest(methodName);
     }
     public void endReport() {
    	 report.flush();
     }
     public void logTestInfo(String Text) {
    	 testLogger.log(Status.INFO,Text);
    	 //testLogger.info(Text);
     }
     public void logTestPassed(String Text) {
    	 testLogger.log(Status.PASS,MarkupHelper.createLabel(Text, ExtentColor.GREEN));
    	 }
     public void logTestFailed(String Text) {
    	 testLogger.log(Status.FAIL, MarkupHelper.createLabel(Text, ExtentColor.RED));
     }
     public void logTestFailedWithException(Throwable e) {
    	 testLogger.log(Status.FAIL,e);
     }
     public void logTestWithScreenshot(String path) {
    	 testLogger.fail(MediaEntityBuilder.createScreenCaptureFromPath(path).build());
     }
}
