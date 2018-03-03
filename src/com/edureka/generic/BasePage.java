package com.edureka.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage 
{
	
	public WebDriver driver = null;
	
	protected BasePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void verifyTitle(String Exp_title)
	{
		WebDriverWait w = new WebDriverWait(driver, 10);
		try
		{
			w.until(ExpectedConditions.titleContains(Exp_title));
			String act_title = driver.getTitle();
			Assert.assertEquals(act_title, Exp_title);
			
		}
		catch(Exception e)
		{
			Reporter.log("fail", true);
			Assert.fail();
		}
	}
	
	public void verifyElementPresent(WebElement ele)
	{
		WebDriverWait w = new WebDriverWait(driver, 10);
		try
		{
			w.until(ExpectedConditions.visibilityOf(ele));
			Reporter.log("Element present",true);
		}
		catch(Exception e)
		{
			Reporter.log("fail, element not found",true);
			Assert.fail();
		}
	}
	
	public void mouseOver(WebDriver driver, WebElement ele)
	{
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}

}
