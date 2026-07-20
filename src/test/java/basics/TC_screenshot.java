package basics;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_screenshot {
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser"})
	public void browserSetup(String browser) {
		try {
			if(browser.equalsIgnoreCase("Chrome")) {
				driver = new ChromeDriver();
				
			}else if(browser.equalsIgnoreCase("Edge")) {
				driver = new EdgeDriver();
				
			}
			driver.get("https://www.google.com/");
		}catch (Exception e) {
	        System.out.println("Illegal browser handling");
	        e.printStackTrace();
	    }
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
		
	}
	
	@Test
	public void testFullScreenshot() {
		WebElement element = driver.findElement(By.id("container"));
		
		File scr = element.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scr, new File(System.getProperty("user.dir")+"//screenshot//image.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
