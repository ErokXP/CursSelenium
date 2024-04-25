package curs16;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import SeleniumUtils.BaseTest;

public class ISSelectedExample extends BaseTest {
	
	/*
	 * isDisplayed() --> verifica daca elementul este vizibil
	 * se aplica pe orice webElement
	 * 
	 * isSelected() --> verifica daca un element de tip checkbox sau radio button este selectat sau nu
	 * se aplica doar pe elemente care au atributul type = checkbox sau radio button
	 * 
	 * isEnabled() --> verfica daca un element de tip input este disabled sau nu
	 */
	
	@Test
	public void isSelectedTest () {
		
		driver.findElement(By.cssSelector("ul[class^='menu_user_nav']>li>a")).click();
		
		WebElement rememberMeCheckbox = driver.findElement(By.cssSelector("input[type='checkbox']"));
		
		System.out.println(rememberMeCheckbox.isSelected());
		assertFalse(rememberMeCheckbox.isSelected());
		
		rememberMeCheckbox.click();
		
		System.out.println(rememberMeCheckbox.isSelected());
		assertTrue(rememberMeCheckbox.isSelected());		
		
		
		System.out.println("-------------------------------------------");
		
		WebElement usernameField = driver.findElement(By.cssSelector("input[id='log']"));
		
		usernameField.click();
		
		System.out.println(usernameField.isSelected());

	}

}
