package curs14;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import SeleniumUtils.BaseTest;

public class Homework extends BaseTest {
	
	@Test(priority = 0)
	public void loginLocator() throws InterruptedException {
		
		WebElement loginLink = driver.findElement(By.linkText("Login"));
		loginLink.click();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		assertEquals(currentUrl, "https://keybooks.ro/");
		WebElement userLogin = driver.findElement(By.cssSelector("input[name='log']"));
		userLogin.click();
		assertTrue(userLogin.isDisplayed());
		Thread.sleep(3000);
	}

}


