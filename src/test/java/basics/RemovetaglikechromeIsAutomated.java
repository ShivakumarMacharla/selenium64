package basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class RemovetaglikechromeIsAutomated {

	
	@Test
	public void removeTag() {
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		
		
	}
	
}
