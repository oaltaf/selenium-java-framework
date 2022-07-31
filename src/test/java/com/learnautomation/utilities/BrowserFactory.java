package com.learnautomation.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.learnautomation.pages.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory extends BaseClass{


	public static void startApplication(String browsername, String appURL) {

		System.out.println("driver in startApp" + driver);
		if(browsername.equals("Chrome")) {
			driver = WebDriverManager.chromedriver().create();
		}

		else if(browsername.equals("Firefox")) {

			driver = new FirefoxDriver();

		}


		else if(browsername.equals("Safari")) {

		}

		else {
			System.out.println("This browser is not supported");
		}

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appURL);

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}


	public static void quitBrowser() {
		driver.quit();

	}
}
