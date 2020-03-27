package com.yourlogo.stepdefinition;

import com.yourlogo.baseclass.Base_Class_Main;
import com.yourlogo.pages.Login_Logout_Page;
import com.yourlogo.pages.User_Name_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//TC_01

public class Login_Logout_Step extends Base_Class_Main
{
	Login_Logout_Page logs;
	User_Name_Page uname;
	@Given("^User opens browser with  Your Logo online store$")
	public void user_opens_browser_with_Your_Logo_online_store() throws Throwable 
	{
		launch("Chrome");
		logs=new Login_Logout_Page(driver);
		uname=new User_Name_Page(driver);
		
	}

	@When("^logs in with valid (.+) and (.+)$")
	public void logs_in_with_valid_and(String mailid, String password) throws Throwable 
	{
		logs.logging(mailid, password);
	}

	@Then("^verifies the (.+)$")
	public void verifies_the(String username) throws Throwable 
	{
		uname.username(username);
	}

	@Then("^take (.+)$")
	public void take(String screenshot) throws Throwable 
	{
		images(screenshot);
	}

	@Then("^logs out$")
	public void logs_out() throws Throwable
	{
		logs.logout();
	}

	@Then("^closes the browser$")
	public void closes_the_browser() throws Throwable 
	{
		end();
	}


}
