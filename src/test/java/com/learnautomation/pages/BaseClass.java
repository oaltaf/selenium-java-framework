package com.learnautomation.pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.learnautomation.utilities.BrowserFactory;
import com.learnautomation.utilities.ExcelDataProvider;

public class BaseClass{

	public static WebDriver driver;


	@BeforeMethod
	@BeforeClass
	public void setUp() {
		System.out.println("DRIVER IN BEFORE TEST :: " + driver);
		System.out.println("I AM IN BEFORE CLASS");
		ExcelDataProvider excel = new ExcelDataProvider();
		
		String header_username = excel.getStringData("Login", 1, 0);
		String header_password = excel.getStringData("Login", 1, 1);
		String header_browser = excel.getStringData("Login", 1, 2);
		System.out.println("Username and passwords are " + header_username + "  " + header_password + " " + header_browser);
//		String username = excel.getStringData("Login", 1, 0);
//		String password = excel.getStringData("Login", 1, 1);
//		System.out.println("Username and passwords are " + username + "  " + password);
		String prodURL = "https://stage.followupcrm.com/login";
		BrowserFactory.startApplication("Chrome", prodURL);


	}

	@AfterMethod
	@AfterClass
	public void tearDown() {
		BrowserFactory.quitBrowser();
	}
}
