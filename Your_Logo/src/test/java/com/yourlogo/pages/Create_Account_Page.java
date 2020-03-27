package com.yourlogo.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Create_Account_Page
{
	WebDriver driver;

	public Create_Account_Page(WebDriver driver)
	{
		this.driver=driver;
	}


	By login = By.xpath("//a[@class='login']");
	By mailid=By.xpath("//input[@id='email_create']");
	By create=By.xpath("//button[@name='SubmitCreate']");
	By fname=By.xpath("//input[@name='customer_firstname']");
	By lname=By.xpath("//input[@name='customer_lastname']");
	By password=By.xpath("//input[@id='passwd']");
	By address=By.xpath("//input[@id='address1']");
	By city=By.xpath("//input[@id='city']");
	By postal=By.xpath("//input[@id='postcode']");
	By mobile=By.xpath("//input[@id='phone_mobile']");

	By register=By.xpath("//button[@id='submitAccount']");
	By error=By.xpath("//div[@class='alert alert-danger']");

	public void register_mailid(String mail) throws InterruptedException
	{
		driver.findElement(login).click();
		driver.findElement(mailid).sendKeys(mail);
		driver.findElement(create).click();
		Thread.sleep(2000);
	}


	public void register_personalinfo(int s,String info)
	{
		if(s==1)
			driver.findElement(fname).sendKeys(info);
		else if(s==2)
			driver.findElement(lname).sendKeys(info);
		else if(s==3)
			driver.findElement(password).sendKeys(info);
		else if(s==4)
			driver.findElement(address).sendKeys(info);
		else if(s==5)
			driver.findElement(city).sendKeys(info);
	}
	

	public void register_number(int q,String no)
	{
		if(q==6)
			driver.findElement(postal).sendKeys(no);
		else
			driver.findElement(mobile).sendKeys(no);
	}

	public void register() throws InterruptedException
	{
		driver.findElement(register).click();
		Thread.sleep(2000);
	}
	
	
	public void error_message()
	{
		String message=driver.findElement(error).getText().substring(11, 16);
		Assert.assertEquals(message,"error");
		
	}


}
