package com.yourlogo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class User_Name_Page
{
	
	private WebDriver driver;
	public User_Name_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
By username=By.xpath("//a[@title='View my customer account']");
String name;
public void username(String user)
{
	
	name=driver.findElement(username).getText();
	if(name.equalsIgnoreCase(user))
	{
		System.out.println("The user name is correct");
		
	}
	
}


}
