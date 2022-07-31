package com.learnautomation.pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.learnautomation.utilities.BrowserFactory;

public class BaseClass{

	public static WebDriver driver;


	@BeforeMethod
	@BeforeClass
	public void setUp() {
		System.out.println("DRIVER IN BEFORE TEST :: " + driver);
		System.out.println("I AM IN BEFORE CLASS");
		String prodURL = "https://stage.followupcrm.com/login";
		BrowserFactory.startApplication("Chrome", prodURL);


	}

	@AfterMethod
	@AfterClass
	public void tearDown() {
		BrowserFactory.quitBrowser();
	}
}
