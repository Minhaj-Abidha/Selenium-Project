package com.yourlogo.runner;

//import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\main\\resources\\Features\\Your Logo.feature",
		plugin = {"html:Reports/Cucumber-html-Report","json:Reports/Cucumber-html-Report/Jsonreport.json","com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent Reports/Cucumber Extent Report.html"},
		glue= {"com.yourlogo.stepdefinition"},
		tags= {"@Your_Logo"},
		monochrome=true
				)
public class Your_Logo_Runner 
{
	 @AfterClass public static void setup() 
	 { 
		Reporter.loadXMLConfig("src/test/resources/extent-config.xml");
		Reporter.setSystemInfo("User Name","Minhaj Abidha ");
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine", "Windows 10" + " 64 Bit");
		Reporter.setSystemInfo("Operating System Type","Windows 10");
		Reporter.setSystemInfo("Application Name", "Eclipse IDE");
		Reporter.setSystemInfo("Eclipse IDE Version","2019-12 (4.14.0)");
		Reporter.setSystemInfo("Java Version","13.0.2");
		Reporter.setSystemInfo("Selenium Version", "3.141.59");
		Reporter.setSystemInfo("Maven Version","3.6.3");
		Reporter.setTestRunnerOutput("Test Execution Cucumber Report"); 
			  
	 }
}
