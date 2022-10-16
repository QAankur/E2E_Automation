package org.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

	@Test
	public void Test1()
	{
		driver.findElement(By.name("q")).sendKeys("Automation",Keys.ENTER);
	}
}
