package com.yourlogo.stepdefinition;

import com.yourlogo.baseclass.Base_Class_Main;
import com.yourlogo.excelutility.Excel_Utility;
import com.yourlogo.pages.Create_Account_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


//@TC_08

public class Create_Account_Step extends Base_Class_Main
{
	Excel_Utility excel=new Excel_Utility();
	Create_Account_Page account;

	@Given("^user starts chrome browser and opens Your Logo online store$")
	public void user_starts_chrome_browser_and_opens_Your_Logo_online_store() throws Throwable 
	{
		launch("Chrome");
		account=new Create_Account_Page(driver);
	}

	@When("^the user clicks sign in button$")
	public void the_user_clicks_sign_in_button() throws Throwable 
	{
		account.register_mailid(excel.mailid());
	}

	@When("^fills all information leaving one of the mandatory field empty$")
	public void fills_all_information_leaving_one_of_the_mandatory_field_empty() throws Throwable
	{
		for(int i=1;i<=5;i++)
		{	
			account.register_personalinfo(i,excel.personalinfo(i));
		}

		for(int k=6;k<=7;k++)
		{
			account.register_number(k,excel.number(k));
		}
	}

	@When("^clicks the register button$")
	public void clicks_the_register_button() throws Throwable 
	{
		account.register();
	}

	@Then("^user gets error message$")
	public void user_gets_error_message() throws Throwable
	{
		account.error_message();
		images("\\Create_Account.png");
	}

	@Then("^close the web browser$")
	public void close_the_web_browser() throws Throwable
	{
		end();
	} 
}
