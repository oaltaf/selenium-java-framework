package com.learnautomation.testcases;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseWithoutFramework {
	
	
	@Test
	public void test1() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/Drivers/chromedriver4");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://freecrm.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("Selenium_50");
		driver.findElement(By.name("password")).sendKeys("Selenium_50");
		
		driver.findElement(By.name("")).click();
	}
	

}
