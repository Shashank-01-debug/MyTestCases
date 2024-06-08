package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class scrollAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,450)");
		Thread.sleep(3000);
	/*System.out.println(driver.findElement(By.xpath("//td[text()='Rahul Shetty']")).getText());
		System.out.println(driver.findElement(By.xpath("//td[text()='Learn SQL in Practical + Database Testing from Scratch']")).getText());
		*/System.out.println(driver.findElement(By.xpath("//td[text()='25']")).getText());
		
		
		WebElement table = driver.findElement(By.id("product"));
	System.out.println("Rows are:" +table.findElements(By.tagName("tr")).size());
	System.out.println("Columns are:" +table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
	
	List<WebElement> row2Text = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
	
	System.out.println(row2Text.get(0).getText());
	System.out.println(row2Text.get(1).getText());
	System.out.println(row2Text.get(2).getText());
				

	}

}
