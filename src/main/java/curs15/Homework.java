package curs15;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import SeleniumUtils.BaseTest;

public class Homework extends BaseTest {
	
	@Test
	public void messageTest() throws InterruptedException {
	
	
	WebElement contactsTab = driver.findElement(By.cssSelector("#menu-item-72 > a"));
	contactsTab.click();	
		
	WebElement nameBox = driver.findElement(By.cssSelector("#wpcf7-f1328-p51-o1 > form > p:nth-child(2) > span > input"));
	nameBox.sendKeys("Cristi");
	
	WebElement mailBox = driver.findElement(By.cssSelector("#wpcf7-f1328-p51-o1 > form > p:nth-child(3) > span > input"));
	mailBox.sendKeys("test@mail.com");
	
	WebElement subjectBox = driver.findElement(By.cssSelector("#wpcf7-f1328-p51-o1 > form > p:nth-child(4) > span > input"));
	subjectBox.sendKeys("Subject test");
	
	WebElement messageBox = driver.findElement(By.cssSelector("#wpcf7-f1328-p51-o1 > form > p:nth-child(5) > span > textarea"));
	messageBox.sendKeys("Message test");
	
	WebElement sendMessage = driver.findElement(By.cssSelector("#wpcf7-f1328-p51-o1 > form > p:nth-child(6) > input"));
	sendMessage.click();
	
	WebElement assertText = driver.findElement(By.className("wpcf7-response-output"));
	System.out.println(assertText.getText());
	assertTrue(assertText.getText().contains("Thank you for your message. It has been sent."));
	
	Thread.sleep(3000);
	}

}
