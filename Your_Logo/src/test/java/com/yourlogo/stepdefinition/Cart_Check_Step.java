package com.yourlogo.stepdefinition;

import com.yourlogo.baseclass.Base_Class_Main;
import com.yourlogo.pages.Cart_Page;
import com.yourlogo.pages.Login_Logout_Page;
import com.yourlogo.pages.Search_And_Cart_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


//TC_03

public class Cart_Check_Step extends Base_Class_Main
{
	Login_Logout_Page log;
	Cart_Page cart;
	Search_And_Cart_Page quest;

	@Given("^The user launches browser and opens Your Logo online store$")
	public void the_user_launches_browser_and_opens_Your_Logo_online_store() throws Throwable
	{
		launch("Chrome");
		log=new Login_Logout_Page(driver);
		cart=new Cart_Page(driver);
		quest=new Search_And_Cart_Page(driver);
	}

	@When("^user logins with valid credentials$")
	public void user_logins_with_valid_credentials() throws Throwable
	{
		log.logging("kolan@gmail.com", "zaqwsx~369!");
	}

	@When("^searches the dress \"([^\"]*)\"$")
    public void searches_the_dress_something(String strArg1) throws Throwable
	{
		quest.search(strArg1);
	}

	@When("^adds required number of dresses to the cart$")
	public void adds_required_number_of_dresses_to_the_cart() throws Throwable
	{
		quest.multiple(3); 
	}

	@Then("^checks whether the cart shows correct number of items added$")
	public void checks_whether_the_cart_shows_correct_number_of_items_added() throws Throwable
	{
		cart.view_Cart();
		cart.view_Cart_items(3);
		images("\\Cart_Products.png"); 
	}

	@Then("^close the chrome browser$")
	public void close_the_chrome_browser() throws Throwable 
	{
		end(); 
	}

}
