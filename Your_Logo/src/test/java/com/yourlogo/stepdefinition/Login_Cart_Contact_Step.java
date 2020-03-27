package com.yourlogo.stepdefinition;

import com.yourlogo.baseclass.Base_Class_Main;
import com.yourlogo.pages.Contact_Details_Page;
import com.yourlogo.pages.Login_Logout_Page;
import com.yourlogo.pages.Search_And_Cart_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//TC_02

public class Login_Cart_Contact_Step extends Base_Class_Main
{

	Login_Logout_Page login;
	Search_And_Cart_Page search;
	Contact_Details_Page contact;

	@Given("^User opens browser with the Your Logo online store$")
	public void user_opens_browser_with_Your_Logo_online_store() throws Throwable
	{
		launch("chrome");
		login=new Login_Logout_Page(driver);
		search=new Search_And_Cart_Page(driver);
		contact=new Contact_Details_Page(driver); 
	}

	@When("^the user login with valid username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void the_user_login_with_valid_username_something_and_password_something(String strArg1, String strArg2) throws Throwable
	{
		login.logging(strArg1, strArg2);
	}

	@When("^searches \"([^\"]*)\"$")
	public void searches_something(String strArg1) throws Throwable
	{
		search.search(strArg1);
	}

	@When("^add it to the cart$")
	public void add_it_to_the_cart() throws Throwable
	{
		search.cart();
	}

	@When("^Fill the contact us details,uploads file \"([^\"]*)\"$")
	public void fill_the_contact_us_details_uploads_src_test_resources_Uploading_Doc_The_Selenium_Automation_Project_docx(String file) throws Throwable 
	{
		contact.contact(file);
	}

	@Then("^click submit buttom$")
	public void click_submit_buttom() throws Throwable 
	{
		contact.submit();
		images("\\Login_Cart_Contact.png");
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable
	{
		end();
	}

}
