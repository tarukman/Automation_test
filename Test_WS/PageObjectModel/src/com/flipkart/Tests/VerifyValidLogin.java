package com.flipkart.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.flipkart.Pages.LoginPage;

public class VerifyValidLogin {
	@Test
	public void ValidateValidUser()
	{
		//WebDriver driver= new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\MT97903\\Project\\Automation\\Selenium\\Setup\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		LoginPage login= new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); 
		login.setUsername();
		login.setPassword();
		login.submit();
		driver.quit();
	}

}