package com.yourlogo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search_And_Cart_Page
{

	protected WebDriver driver;
	public Search_And_Cart_Page(WebDriver driver)
	{
		this.driver=driver;
	}

	By search=By.xpath("//input[@placeholder='Search']");
	By searchdata=By.xpath("//input[@placeholder='Search']");
	By searchsubmit=By.xpath("//button[@name='submit_search']");
	By dress=By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 last-item-of-tablet-line']");
	By dress1=By.xpath("//img[@title='Faded Short Sleeve T-shirts']");
	By colour=By.xpath("//a[@name='Blue']");

	By cart=By.xpath("//span[contains(text(),'Add to cart')]");
	By number=By.xpath("//i[@class='icon-plus']");
	By proceed=By.xpath("//span[contains(text(),'Proceed to checkout')]");
	By close=By.xpath("//span[@title='Close window']");


	By share=By.xpath("//a[@id='send_friend_button']");
	By name=By.xpath("//input[@id='friend_name']");
	By mailid=By.xpath("//input[@id='friend_email']");
	By sendmail=By.xpath("//button[@id='sendEmail']");
	By sent=By.xpath("//div[@class='fancybox-inner']");

	public void search(String item) throws InterruptedException
	{
		//Searching dress
		driver.findElement(search).click();
		Thread.sleep(1000);
		driver.findElement(searchdata).sendKeys(item);
		Thread.sleep(1000);
		driver.findElement(searchsubmit).click();
		Thread.sleep(1000);

	}

	public void cart() throws InterruptedException
	{

		//Selecting dress 
		driver.findElement(dress).click();
		Thread.sleep(2000); 
		//Adding to cart 
		driver.findElement(cart).click();
		Thread.sleep(2000); 
		//Cart 
		String han=driver.getWindowHandle();
		driver.switchTo().window(han); 
		driver.findElement(proceed).click();
		Thread.sleep(2000);
	}


	public void multiple(int i) throws InterruptedException
	{

		//Selecting multiple dresses
		driver.findElement(dress).click();
		Thread.sleep(2000);
		for(int j=1;j<i;j++)
		{
			driver.findElement(number).click();
		}
		driver.findElement(cart).click();
		String han=driver.getWindowHandle();
		driver.switchTo().window(han); 
		Thread.sleep(2000);
		driver.findElement(close).click();
	}

	public void colour() throws InterruptedException
	{
		//Selecting the dress
		driver.findElement(dress1).click();
		Thread.sleep(2000);
		driver.findElement(colour).click();
		Thread.sleep(2000);
		driver.findElement(cart).click();
		String han=driver.getWindowHandle();
		driver.switchTo().window(han); 
		Thread.sleep(2000);
		driver.findElement(close).click();

	}

	public void share() throws InterruptedException
	{
		//Selecting the dress
		driver.findElement(dress).click();
		Thread.sleep(2000);
		//Sharing to friend
		driver.findElement(share).click();
		Thread.sleep(2000);
		String win=driver.getWindowHandle();
		driver.switchTo().window(win);
		driver.findElement(name).sendKeys("Perry");
		Thread.sleep(2000);
		driver.findElement(mailid).sendKeys("asdf!2@gmail.com");
		Thread.sleep(2000);
		driver.findElement(sendmail).click();
		Thread.sleep(2000);
	}
	public void shared_message() throws InterruptedException
	{

		//Getting success message
		String win2=driver.getWindowHandle();
		driver.switchTo().window(win2);
		Thread.sleep(2000);
		String message=driver.findElement(sent).getText();
		if(message.contains("Your e-mail has been sent successfully"))
		{
			System.out.println("Shared with friend");
		}
	}


}






