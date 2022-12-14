package com.learnautomation.testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utilities.BrowserFactory;
import com.learnautomation.utilities.ExcelDataProvider;

public class LoginTestCRM extends BaseClass{
	LoginPage loginPage;
	
	public LoginTestCRM() {
		super();
	}
	
	
	@Test
	public void loginApp() {
		
		ExcelDataProvider excel = new ExcelDataProvider();
		excel.getStringData("Login", 0, 0);
		
		System.out.println("I AM IN LOGIN APP FUNCTION");
		
		loginPage = new LoginPage();
		System.out.println("DRIVER VALUE IN TEST ::  " + driver);
		loginPage.loginToCRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		
		System.out.println("Testing");
	
	
	}
	
	
}
