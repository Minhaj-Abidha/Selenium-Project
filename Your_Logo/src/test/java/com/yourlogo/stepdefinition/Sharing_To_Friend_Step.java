package com.yourlogo.stepdefinition;

import com.yourlogo.baseclass.Base_Class_Main;
import com.yourlogo.pages.Search_And_Cart_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//TC_07

public class Sharing_To_Friend_Step extends Base_Class_Main
{
	
	Search_And_Cart_Page search;
	
	@Given("^the user starts chrome browser and opens Your Logo online store$")
	public void the_user_starts_chrome_browser_and_opens_Your_Logo_online_store() throws Throwable 
	{
		launch("Chrome");
		search=new Search_And_Cart_Page(driver);
		
	}

    @When("^user searches \"([^\"]*)\"$")
    public void user_searches_something(String strArg1) throws Throwable
    {
    	search.search(strArg1);
    }
    
    @When("^sends it to a friend$")
    public void sends_it_to_a_friend() throws Throwable 
    {
        search.share();
    }

    @Then("^gets a message- sent to a friend$")
    public void gets_a_message_sent_to_a_friend() throws Throwable 
    {
       search.shared_message();
       images("\\Sharing_To_Friend.png");
    }

    @Then("^closes the web browser$")
    public void closes_the_web_browser() throws Throwable
    {
       end();
    }


}
