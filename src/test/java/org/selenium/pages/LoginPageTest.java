package org.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.selenium.constants.FrameworkConstants;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginPageTest extends BaseTest{
	
	@Test
	public void Test1()
	{
		driver.findElement(By.name("q")).sendKeys("Automation",Keys.ENTER);
	}
	
	@Test
	public void Test2()
	{
		driver.findElement(By.name("q")).sendKeys("Automation2",Keys.ENTER);
	}
	
	
}
