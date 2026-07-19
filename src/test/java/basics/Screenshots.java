package basics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshots {

	
	@Test
	public void fullScreenShot() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		TakesScreenshot sc = (TakesScreenshot)driver;
		File sourcefile = sc.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(sourcefile, new File(System.getProperty("user.dir")+"//screenshot//fullpages.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		String title = driver.getTitle();
		System.out.println("Title "+title);
		driver.close();
	
	}
	
	@Test
	public void specificAreaScreenshot() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement container = driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
		File sourcefile = container.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(sourcefile, new File(System.getProperty("user.dir")+"//screenshot//specificArea.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		    
		driver.close();

	}
	
	@Test
	public void getSpecificWebELmentScreenShot() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement AiMode = driver.findElement(By.id("composeButton"));
		File sourceFile = AiMode.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(sourceFile, new File(System.getProperty("user.dir")+"//screenshot//Aimode.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.close();
		
	}
	
	
}
