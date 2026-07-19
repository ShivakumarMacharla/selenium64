package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataPickers {
	
	@Test
	public void calenderDataPicker() throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://jqueryui.com/datepicker/");
			driver.manage().window().maximize();
			
			//method 1 SendKeys
			driver.switchTo().frame(0);
		//	driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("08/19/1999");
			
			//method 2 using date picker
			String year = "2029";
			String month = "August";
			String date = "12";
			
			driver.findElement(By.xpath("//input[@id='datepicker']")).click(); //open date picker
			
			//select month and Year
			while(true) {
				String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
				if(currentMonth.equals(month) && currentYear.equals(year)) {
					break;
				}
			
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //next
				
			}
				//select date
				driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a[contains(text(),'"+date+"')]")).click();
				
	}

}
