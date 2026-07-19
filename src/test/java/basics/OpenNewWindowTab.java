package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewWindowTab {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//driver.switchTo().newWindow(WindowType.WINDOW); // open new window
		driver.switchTo().newWindow(WindowType.TAB); //open new tab
		driver.get("https://www.facebook.com/");
	}

}
