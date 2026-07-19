package basics;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SSL {
	
	@Test
	public void ChromeSSl() {
		
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		System.out.println("Title page :"+driver.getTitle());
		
		
		driver.close();
	}

}
