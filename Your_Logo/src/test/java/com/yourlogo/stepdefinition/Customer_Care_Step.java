package com.yourlogo.stepdefinition;

import com.yourlogo.baseclass.Base_Class_Main;
import com.yourlogo.pages.Contact_Details_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//TC_04

public class Customer_Care_Step extends Base_Class_Main 
{
	Contact_Details_Page contact;
	
	@Given("^The user opens Your Logo online store using chrome browser$")
	public void the_user_opens_Your_Logo_online_store_using_chrome_browser() throws Throwable 
	{
	    launch("chrome");
	    contact=new Contact_Details_Page(driver);
	}
	
	@When("^the user clicks and fills contact us details,leaving the mail address textbox empty$")
	public void the_user_clicks_and_fills_contact_us_details_leaving_the_mail_address_textbox_empty() throws Throwable
	{
		 contact.contact("src\\test\\resources\\Uploading_Doc\\The Selenium Automation Project.docx");
	}

	@When("^clicks submit button$")
	public void clicks_submit_button() throws Throwable
	{
	    contact.submit();
	}

	@Then("^an error message should be displayed$")
	public void an_error_message_should_be_displayed() throws Throwable
	{
	    contact.errorMessage();
	    images("\\Customer_Care.png");
	}
	
	@Then("^The browser is closed$")
	public void the_browser_is_closed() throws Throwable 
	{
		end();
	}

}
