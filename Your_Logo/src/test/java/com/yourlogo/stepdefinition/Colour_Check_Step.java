package com.yourlogo.stepdefinition;

import com.yourlogo.baseclass.Base_Class_Main;
import com.yourlogo.pages.Cart_Page;
import com.yourlogo.pages.Search_And_Cart_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//TC_06

public class Colour_Check_Step extends Base_Class_Main
{
	Search_And_Cart_Page search;
	Cart_Page cart;

	@Given("^User opens Your Logo online store website using chrome browser$")
	public void user_opens_Your_Logo_online_store_website_using_chrome_browser() throws Throwable
	{
		launch("Chrome");
		search=new Search_And_Cart_Page(driver);
		cart=new Cart_Page(driver);
	}

	@When("^the user searches \"([^\"]*)\"$")
	public void the_user_searches(String arg1) throws Throwable
	{
		search.search(arg1);
	}

	@When("^selects Blue colour and adds it to cart$")
	public void selects_blue_colour_and_adds_it_to_cart() throws Throwable
	{
		search.colour();
	}

	@Then("^the selected colour of the dress should be displayed in the cart$")
	public void the_selected_colour_of_the_dress_should_be_displayed_in_the_cart() throws Throwable
	{
		cart.view_Cart();
		cart.colour_verify();
		images("\\Colour_Check.png");
	}

	@Then("^closing the chrome browser$")
	public void closing_the_chrome_browser() throws Throwable 
	{
		end();
	}

}
