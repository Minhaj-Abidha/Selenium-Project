package com.yourlogo.baseclass;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Base_Class_Main 
{
	public WebDriver driver;

	//To Launch the browser and open the website
	public void launch(String browser) throws InterruptedException
	{

		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://automationpractice.com/index.php");
			Thread.sleep(2000);
		}
		else
		{
			System.setProperty("webdriver.gecko.driver","src\\main\\resources\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://automationpractice.com/index.php");
			Thread.sleep(2000);
		}
	}

	//To take the screenshot
	public void images(String fullscreenshot) throws IOException
	{
		String path=System.getProperty("user.dir")+File.separator+"Screenshots";
		//Full Screenshot
		Screenshot sc=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver); 
		String fullpath=path+fullscreenshot;
		ImageIO.write(sc.getImage(), "png", new File(fullpath));
	}
	
	
	//To close the browser
	public void end()
	{
		driver.close();
	}
	
}
