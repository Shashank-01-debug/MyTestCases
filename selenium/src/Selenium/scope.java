package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//1.count amount of links on page
		//any html element which starts with <a then it is 100% link
		//2.count the link which are presented in footer section only.
		//so, we need to limit the scope of driver.
		//for this we need to create subset of driver(mini driver).
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	int count =	driver.findElements(By.tagName("a")).size();
		System.out.println(count);
		
		//to limit the scope to certain area take that element and store it in WebElement variable.
	WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
	int footerDriverLinks = footerdriver.findElements(By.tagName("a")).size();
	System.out.println("footerDriverLinks are:" + footerDriverLinks);
	
	//again limiting the scope of footerdriver to column first only.
	WebElement column1Driver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	int column1links = column1Driver.findElements(By.tagName("a")).size();
	System.out.println(column1links);
	//click on each link in column and check if the page is opening
	
	for(int i=1;i<column1links;i++)//for loop open all the tabs
	{
		
		
	
	
		String clinkonLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
		
		column1Driver.findElements(By.tagName("a")).get(i).sendKeys(clinkonLinkTab);
		Thread.sleep(5000);
		
	}
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		while(it.hasNext()) {
			
			//hasNext() either returns true or false while next() will actually iterate to the record.
			
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		
	
	
	
	
	
	driver.quit();
	

	}

}
