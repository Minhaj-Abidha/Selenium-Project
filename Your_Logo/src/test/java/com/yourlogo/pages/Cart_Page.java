package com.yourlogo.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart_Page
{
	private WebDriver driver;

	public Cart_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By viewcart=By.xpath("//a[@title='View my shopping cart']");
	By cartitems=By.xpath("//a[@title='View my shopping cart']//span[@class='ajax_cart_quantity']");
	By colour=By.xpath("//td[@class='cart_description']//small[2]");


	public void view_Cart() throws InterruptedException
	{
		driver.findElement(viewcart).click();
		Thread.sleep(2000);	
	}	
	
	public void view_Cart_items(int i)
	{
		String number=driver.findElement(cartitems).getText();
		int cartproducts=Integer.parseInt(number);
		if(cartproducts==i)
		{
			System.out.println("No of items in cart is "+i);
		}
	}
	
	public void colour_verify()
	{
		String chroma=driver.findElement(colour).getText().substring(8,12);
		Assert.assertEquals(chroma,"Blue");
//		if(chroma.contains("Blue"))
//		{
//			System.out.println("The colour selected is present");
//		}
	}


}
