package com.Restaurant.testCases;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Restaurant.pageObjects.LoginPage;


public class TC_LoginTest_001 extends BaseClass
{

	@Test
	public void loginTest() throws IOException, InterruptedException 
	{
			
		logger.info("URL is opened");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
		LoginPage lp=new LoginPage(driver);
		lp.setPostcode();
		logger.info("Entered Postalcode");
		
		lp.clickSubmit();;
		logger.info("Clicked On Search Button");
		
		lp.restaruntaCount();
		logger.info("Found Restaurants in your Area");
		
		
		if(driver.getTitle().contains("Just Eat"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
	}
}
