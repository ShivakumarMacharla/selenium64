package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardEventsTabsWindows {

	
	@Test
	public void sliderBar() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demoSite/practice/slider/range.html");
		driver.manage().window().maximize();
		
		WebElement Current_mini_slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][1]"));
		WebElement Current_max_slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][2]"));
		
		
		Point start_point = Current_mini_slider.getLocation();//(171, 46)
		System.out.println(start_point);
		
		Point end_point = Current_max_slider.getLocation();//(687, 46)
		System.out.println(end_point);
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(Current_max_slider, -100, 46).perform();
		
		Point end_point2 = Current_max_slider.getLocation();//((785, 46)
		System.out.println("end_point2 :"+end_point2);
		
		Thread.sleep(3000);
		
		act.dragAndDropBy(Current_mini_slider, -150, 46).perform();
		
		Point start_point2 = Current_mini_slider.getLocation();//(19, 46)
		System.out.println("start_point2 "+start_point2);
		
			
		
	}
	
	@Test
	public void keyBoardActions() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("inputText1")).sendKeys("selenium");
		
		Actions act = new Actions(driver);

		//ctrl+A
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		//ctrl+c
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		//tab
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		//ctrl+v
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
	}
}
