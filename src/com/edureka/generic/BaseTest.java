package com.edureka.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConst
{
	public static WebDriver driver = null;
	@BeforeMethod
	public void openApp()
	{
		System.setProperty(chrome_Key, chrome_Value);
		driver = new ChromeDriver();
		driver.get("http://www.craftsvilla.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
	}
	
	

}
