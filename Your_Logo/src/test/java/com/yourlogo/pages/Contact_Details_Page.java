package com.yourlogo.pages;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Contact_Details_Page
{
	protected WebDriver driver;
	
	public Contact_Details_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By contact = By.xpath("//a[@title='Contact Us']");
	By heading = By.xpath("//select[@id='id_contact']");
	By message = By.xpath("//textarea[@id='message']");
	By file = By.xpath("//div[@id='uniform-fileUpload']");
	By send = By.xpath("//button[@id='submitMessage']");
	By mail=By.xpath("//input[@id='email']");
	By error=By.xpath("//div[@class='alert alert-danger']//ol//li");

	public void contact(String file) throws InterruptedException, IOException
	{
		// Contact Us
		driver.findElement(contact).click();
		Thread.sleep(1000);

		// Selecting Subject Heading
		WebElement we = driver.findElement(heading);
		Select sel = new Select(we);
		sel.selectByVisibleText("Customer service");
		Thread.sleep(1000);
		// Writing message
		driver.findElement(message).sendKeys("Testing with the application functionality");
		Thread.sleep(1000);

		// Attaching file
		//driver.findElement(file).click();
		//Thread.sleep(2000);
		//Runtime.getRuntime().exec("F:\\AutoIt\\UploadDoc.exe");
		//Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName('filename')[0].innerHTML='"+file+"'");
	}
	
	public void mailaddress(String email)
	{
		driver.findElement(mail).sendKeys(email);
	}

	public void submit() throws InterruptedException
	{
		// Send
		driver.findElement(send).click();
		Thread.sleep(1000);
	}
	
	public void errorMessage()
	{
		String message=driver.findElement(error).getText();
		Assert.assertEquals(message,"Invalid email address.");
//		if(message.contains("Invalid email address."))
//		{
//			System.out.println("TEST CASE PASSED");
//		}
//		else
//			System.out.println("TEST CASE FAILED");
	}




}
