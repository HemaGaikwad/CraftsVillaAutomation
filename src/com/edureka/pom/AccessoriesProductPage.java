package com.edureka.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edureka.generic.BasePage;

public class AccessoriesProductPage extends BasePage
{
	
	//Declaration of WebElements on accessories Page
	
	@FindBy(xpath  = "//a[@href='/accessories/?MID=megamenu_accessories_seeall']")
	private WebElement accessories = null;
	
	@FindBy(linkText = "Watches")
	private WebElement watches = null;
	
	@FindBy(xpath = "//img[@src='https://img3.craftsvilla.com/image/upload/w_300,h_450,c_lfill,f_auto/C/V/CV-18619-MSHOB28549141970--Shobhanita-1477054196-Craftsvilla_1.JPG']")
	private WebElement product=null;
	
	@FindBy(id = "buynow")
	private WebElement buy = null;
	
	//Initializing all the webelements on accessories page
	public AccessoriesProductPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//utilization of all the webelements that are identified
	
	public void goToAccessories()
	{
		mouseOver(driver, accessories);
	}
	
	public void clickOn()
	{
		verifyElementPresent(watches);
		watches.click();
	}
	
	public void clickOnProduct()
	{
		verifyElementPresent(product);
		product.click();
		
	}
	
	public void buyNow()
	{
		verifyElementPresent(buy);
		buy.click();
	}

}
