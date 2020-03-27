package com.yourlogo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Logout_Page
{

	protected WebDriver driver;

	public Login_Logout_Page(WebDriver driver)
	{
		this.driver = driver;
	}

	By login = By.xpath("//a[@class='login']");
	By mailid = By.xpath("//input[@id='email']");
	By password = By.xpath("//input[@id='passwd']");
	By submit = By.xpath("//button[@id='SubmitLogin']");
	By logout=By.xpath("//a[@class='logout']");


	public void logging(String emailid,String passsword) throws InterruptedException
	{
		// Clicking sign in button
		driver.findElement(login).click();
		Thread.sleep(1000);
		// Email address
		driver.findElement(mailid).sendKeys(emailid);
		Thread.sleep(1000);
		// Password
		driver.findElement(password).sendKeys(passsword);
		Thread.sleep(1000);
		// Signing in
		driver.findElement(submit).click();
		Thread.sleep(2000);
	}


	public void logout() throws InterruptedException 
	{ 
		driver.findElement(logout).click();
		Thread.sleep(2000);
	}


}
