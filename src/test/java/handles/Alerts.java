package handles;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerts {

	public static final Logger log = LogManager.getLogger(Alerts.class);
	
	@Test
	public void browserSetup() throws Exception {
		log.info("browserSetup");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		//alert box
		driver.findElement(By.xpath("//button[@id='alertBox']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		System.out.println("alert box");
		log.info("alert box");
		
		//confirm box
		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
		Thread.sleep(3000);
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
		System.out.println("confirm box");
		Thread.sleep(3000);
		
		log.info("//confirm box");
		//prompt box
		WebElement promtbox = driver.findElement(By.xpath("//button[@id='promptBox']"));
		Thread.sleep(3000);
		promtbox.click();
		Alert alert2 = driver.switchTo().alert();
		
		
		Thread.sleep(3000);
		alert2.sendKeys("shiva");
		System.out.println("prmomt box");
		log.info("//prmomt box");
		
	
	}
}
