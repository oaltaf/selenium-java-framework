package com.learnautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.learnautomation.testcases.LoginTestCRM;
import com.learnautomation.utilities.BrowserFactory;

public class LoginPage extends BrowserFactory{
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(name = "email") 
	WebElement username;
	
	@FindBy(name = "password") WebElement password;
	
	@FindBy(xpath = "//button[normalize-space()=\"Login\"]") WebElement loginBtn;
	
	
	public void loginToCRM(String user, String pass) {
		
		System.out.println("driver in logintoCRM --- " + driver);
		System.out.println("I am in loginToCRM function");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		username.sendKeys(user);
		
		password.sendKeys(pass);
		
		loginBtn.click();
		
	}
}
