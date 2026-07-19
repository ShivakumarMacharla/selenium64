package basics;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;


public class TestingDemo {
	WebDriver driver;
	@Test
	public void doSomeThing() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		String page_Title = driver.getTitle();
		System.out.println("title :"+page_Title);
		
		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("shiva");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shiva@gmail.com");
		
		WebElement male_radioBtn = driver.findElement(By.xpath("//input[@id='gender']"));
		boolean status = male_radioBtn.isSelected();
		System.out.println(status);
		Thread.sleep(2000);
		male_radioBtn.click();
		System.out.println(status);
		
		driver.findElement(By.linkText(" Selenium Tutorial")).click();
		String page_Title2 = driver.getTitle();
		System.out.println("title :"+page_Title2);
		
	//	driver.close();
		
	}
	
	@Test
	public void getMethods() {
		driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("currentUrl : "+currentUrl);
		
		String pageSource = driver.getPageSource();
		System.out.println("pageSource : "+pageSource);
		
		String id_window = driver.getWindowHandle();
		System.out.println(id_window);
		
		driver.navigate().to("https://www.google.com"); 
		Set<String> all_ids= driver.getWindowHandles();
		for(String id : all_ids) {
			System.out.println("id - "+id);
		}
		
	}
	
	@Test
	public void conditionalMethods() {
		//isSelected()
		//isEnabled()
		//isDisplayed()
		driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		WebElement male_radioBtn = driver.findElement(By.xpath("//input[@id='gender']"));
		male_radioBtn.click();
		System.out.println(male_radioBtn.isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@class='btn btn-primary']")).isDisplayed());
		System.out.println(driver.findElement(By.id("mobile")).isEnabled());
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
