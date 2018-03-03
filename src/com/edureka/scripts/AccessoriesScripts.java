package com.edureka.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.edureka.generic.BaseTest;
import com.edureka.pom.AccessoriesProductPage;


public class AccessoriesScripts  extends BaseTest
{
	
	@Test
	public void BuyWatch()
	{
		AccessoriesProductPage ap = new AccessoriesProductPage(driver);
		ap.goToAccessories();
		ap.clickOn();
		ap.clickOnProduct();
		ap.buyNow();
		Assert.fail();
		
	}

}
