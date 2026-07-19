package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSript {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//actions class
		WebElement mp3= driver.findElement(By.xpath("//a[@class='dropdown-toggle' and text()='MP3 Players']"));
		WebElement test23 = driver.findElement(By.xpath("//a[text()='test 23 (0)']"));
		Actions action = new Actions(driver);
		action.moveToElement(mp3).click(test23).build().perform();
	
		
		driver.close();
	}

}
