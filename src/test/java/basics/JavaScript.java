package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScript {

	@Test
	public void javascriptApproach() throws InterruptedException {
			
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		WebElement input_user = driver.findElement(By.xpath("//input[@name='username']"));
		;
		js.executeScript("arguments[0].setAttribute('value','Admin')",input_user);
		Thread.sleep(3000);
		WebElement input_pass = driver.findElement(By.xpath("//input[@name='password']"));
		
		js.executeScript("arguments[0].setAttribute('value','admin123')", input_pass);
		Thread.sleep(3000);
		WebElement button_login = driver.findElement(By.xpath("//button[text()=' Login ']"));
		
		js.executeScript("arguments[0].click()",button_login);
		
		
		//ChromeDriver driver = new ChromeDriver();
		//JavascriptExecutor js = driver;
		
		
	
		
	}
	
	@Test
	public void scrollPage() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		
		//scrolling webpage
				
		//1.scroll to specifix diamentins
//		js.executeScript("window.scrollBy(0,5000)");
//		System.out.println(js.executeScript("return window.pageYoffset;"));
		
		//2. scroll to visibility of element
	//	js.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("(//span[text()='Flags of other dependencies and territories'])[2]")));
		//System.out.println(js.executeScript("return window.pageYoffset;"));
		
		//3. scroll to bottom of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	
	}
	
	@Test
	public void zoomOutAndIn() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
		//driver.manage().window().maximize();
		
		//maximize window by JS script
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='50%'"); //zoom level 50%
		
		
	}
	
}
