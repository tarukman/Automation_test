package com.flipkart.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;


public class LoginPage {

	WebDriver driver;
	By username= By.id("user_login");
	By password = By.id("user_pass");
	By submit_btn= By.id("wp-submit");

	public LoginPage (WebDriver driver)
	{
		this.driver= driver;
	}

	public void setUsername()
	{
		driver.findElement(username).sendKeys("admin");
	}
	public void setPassword()
	{
		driver.findElement(password).sendKeys("demo123");
	}
	public void submit()
	{
		driver.findElement(submit_btn).click();
	}
}



