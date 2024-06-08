package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class scrollDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//scroll till reach the table then add all the element in Amount Row and compare it.
		//to scroll in selenium we use java script.
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		//2nd js.executeScript is used to handle the table which is present in webpage.
		Thread.sleep(5000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		//.scrollTop is used when we want element of row to be go down.
		
		List<WebElement> values = driver.findElements(By.xpath("//td[4]"));
int sum=0;
		for(int i=0;i<values.size();i++) 
		{
			
		sum = sum + Integer.parseInt(values.get(i).getText());
		
		//Integer.parseInt convert string to integer.
		System.out.println(sum);
		
		
		}
		//Total Amount Collected: 296
		int total= Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());

		Assert.assertEquals(total, sum);
		System.out.println("pass");
		
		
	}

}
