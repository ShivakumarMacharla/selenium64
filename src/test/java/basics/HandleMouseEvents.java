package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleMouseEvents {

	
	@Test
	public void mouseEvents() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://vinothqaacademy.com/mouse-event/");
		driver.manage().window().maximize();
		
		WebElement rightClick = driver.findElement(By.xpath("//button[@id='rightBtn']"));
		WebElement editButton = driver.findElement(By.xpath("//button[text()='Edit']"));
		Actions act = new Actions(driver);
		
		//move To Element 
		act.contextClick(rightClick).moveToElement(editButton).click().build().perform();
		
		String statusText = driver.findElement(By.xpath("//span[@id='rightStatus']")).getText();
		Assert.assertEquals(statusText, "Selected: Edit");
	
		// Double Click
		WebElement doubleClick = driver.findElement(By.id("doubleBtn"));
		act.doubleClick(doubleClick).build().perform();
		
		String statusTxt = driver.findElement(By.xpath("//span[@id='doubleStatus']")).getText();
		Assert.assertEquals(statusTxt, "Double Click Detected");
		
		//Drag and Drop
		WebElement dragMe = driver.findElement(By.id("dragItem"));
		WebElement dropMe = driver.findElement(By.id("dropZone"));
		act.dragAndDrop(dragMe, dropMe).build().perform();
		
		String statusDD = driver.findElement(By.xpath("//span[@id='dragStatus']")).getText();
		Assert.assertEquals(statusDD, "Dropped Successfully");
		
		driver.close();
	}
}
