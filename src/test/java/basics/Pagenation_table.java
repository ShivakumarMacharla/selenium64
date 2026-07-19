package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Pagenation_table {

	@Test
	public void pageNationTable() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dynamic-pagination-table#google_vignette");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,600)");

		//select count
	    WebElement dropDown= 	driver.findElement(By.xpath("//select[@name='example_length']"));
		Select select = new Select(dropDown);
		select.selectByValue("-1");
		Thread.sleep(3000);
		//headers
		List<WebElement> tableHeaders =	driver.findElements(By.xpath("//table/thead/tr/th"));

		int colSize = tableHeaders.size();

		List<WebElement> bodyRow = driver.findElements(By.xpath("//table//tbody/tr"));
		int rowSize = bodyRow.size();

		//pageNation
		List<WebElement> pageNumbers = driver.findElements(By.xpath("//div[@id='example_paginate']/ul/li"));

		try {


			for(WebElement element :tableHeaders) {
				System.out.print(element.getText()+"   ");
				}
			System.out.println();
			for(int i=2;i<pageNumbers.size()-1;i++) {	
				driver.findElement(By.xpath("//div[@id='example_paginate']/ul/li["+i+"]")).click();
				for(int j=0;j<rowSize;j++) {
					System.out.println(bodyRow.get(j).getText()+"       ");
				}
				//driver.findElement(By.xpath("//div[@id='example_paginate']/ul/li/a[text()='Next']")).click();
					}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	



	driver.close();


}

}
