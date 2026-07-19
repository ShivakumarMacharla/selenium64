package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class DropDown {
	WebDriver driver;
	@Test
	public void selectDropDown() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dropdown#google_vignette");
		
		driver.manage().window().maximize();
		
		WebElement simpleDropDown = driver.findElement(By.id("dropdown"));
		Select select = new Select(simpleDropDown);
		//select.selectByIndex(0);
		select.selectByVisibleText("Option 1");
		Thread.sleep(3000);
		
		select.selectByValue("1");
		
		// contry selection
		WebElement countryDropDown = driver.findElement(By.id("country"));
		
		Select selectcountry = new Select(countryDropDown);
		
		selectcountry.selectByIndex(3);
		Thread.sleep(3000);
		selectcountry.selectByVisibleText("Albania");
		Thread.sleep(3000);
		selectcountry.selectByValue("AO");
		
		System.out.println("selectDropDown");
	}
	
//	@Test
	public void autoSuggestionDropdown() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(3000);
	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		
				
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
	
		System.out.println(options.size());
		
		for(int i=0;i<options.size();i++) {
			//System.out.println(options.get(i).getText());
			if(options.get(i).getText().equalsIgnoreCase("selenium testing")) {
				options.get(i).click();
			}
			
		}
		System.out.println("autoSuggestionDropdown");
	
	
	
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}


}
