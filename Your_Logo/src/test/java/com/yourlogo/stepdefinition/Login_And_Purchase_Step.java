package com.yourlogo.stepdefinition;

import com.yourlogo.baseclass.Base_Class_Main;
import com.yourlogo.pages.Login_Logout_Page;
import com.yourlogo.pages.Purchase_Page;
import com.yourlogo.pages.Search_And_Cart_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//TC_05

public class Login_And_Purchase_Step extends Base_Class_Main

{
	Login_Logout_Page login;
	Search_And_Cart_Page searching;
	Purchase_Page purchase;

	@Given("^the user launches chrome browser and opens the website Your Logo online store$")
	public void the_user_launches_chrome_browser_and_opens_the_website_Your_Logo_online_store() throws Throwable {
		launch("chrome");
		login=new Login_Logout_Page(driver);
		searching= new Search_And_Cart_Page(driver);
		purchase=new Purchase_Page(driver);
	}

	@When("^the user logs in with valid username and password$")
	public void the_user_login_with_valid_username_and_password() throws Throwable
	{
		login.logging("kolan@gmail.com", "zaqwsx~369!");
	}

	@When("^search \"([^\"]*)\"$")
    public void search_something(String strArg1) throws Throwable
	{
		searching.search(strArg1);
	}

	@When("^add the dress to the cart$")
	public void add_it_to_the_cart() throws Throwable 
	{
		purchase.cart();
	}

	@Then("^purchase the dress$")
	public void purchase_the_dress() throws Throwable
	{
		purchase.purchase();
	}

	@Then("^gets successful message as response$")
	public void gets_successful_message() throws Throwable
	{
		purchase.reply();
		images("\\Purchase.png");
	}

	@Then("^closing the browser$")
	public void close_the_browser() throws Throwable 
	{
		end();
	}
}
