package com.yourlogo.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Purchase_Page 
{

	private WebDriver driver;

	public Purchase_Page(WebDriver driver)
	{
		this.driver=driver;
	}


	By costume=By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line last-item-of-tablet-line first-item-of-mobile-line last-mobile-line']");
	By cart=By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line last-item-of-tablet-line first-item-of-mobile-line last-mobile-line']//span[contains(text(),'Add to cart')]");
	By pro=By.xpath("//a[@class='btn btn-default button button-medium']");
	By proceed=By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']");
	By checkout=By.xpath("//button[@type='submit']//span[contains(text(),'Proceed to checkout')]");
	By checkbox=By.xpath("//input[@type='checkbox']");
	By payment=By.xpath("//a[@class='bankwire']");
	By confirm=By.xpath("//button[@type='submit']//span[contains(text(),'I confirm my order')]");
	By message=By.xpath("//strong[contains(text(),'Your order on My Store is complete.')]");

	public void cart() throws InterruptedException
	{
		WebElement we=driver.findElement(costume);
		WebElement we1=driver.findElement(cart);
		Actions a=new Actions(driver);
		a.moveToElement(we).build().perform();
		Thread.sleep(2000);
		a.moveToElement(we1).click().build().perform();
		Thread.sleep(3000);
		//Proceed
		String han=driver.getWindowHandle(); 
		driver.switchTo().window(han);
		Thread.sleep(3000);
		driver.findElement(pro).click();
		Thread.sleep(3000);
	}
	public void purchase() throws InterruptedException
	{

		driver.findElement(proceed).click();
		Thread.sleep(2000);
		driver.findElement(checkout).click();
		Thread.sleep(2000);
		driver.findElement(checkbox).click();
		Thread.sleep(2000);
		driver.findElement(checkout).click();
		Thread.sleep(2000);
		driver.findElement(payment).click();
		Thread.sleep(2000);
		driver.findElement(confirm).click();
	}

	public void reply()
	{
		String order=driver.findElement(message).getText();
		Assert.assertEquals(order,"Your order on My Store is complete.");
//		if(order.contains("Your order on My Store is complete."))
//		{
//			System.out.println("Order placed successfuly");
//		}
//		else
//			System.out.println("Order not Placed");


	}
}
