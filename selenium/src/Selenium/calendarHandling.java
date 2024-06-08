package Selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class calendarHandling {

	public static void main(String[] args) {

		String year = "2027";
		String month = "12";
		String day = "23";
		
		String[] expectedList = {month,day,year};

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.findElement(By.xpath("//a[@target='_blank'][2]")).click();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();

		String parentWebsite = it.next();
		String childWebsite = it.next();

		driver.switchTo().window(childWebsite);
		driver.findElement(By.cssSelector("div.react-date-picker__inputGroup")).click();
		driver.findElement(By.cssSelector(
				"span.react-calendar__navigation__label__labelText.react-calendar__navigation__label__labelText--from"))
				.click();
		driver.findElement(By.cssSelector(
				"span.react-calendar__navigation__label__labelText.react-calendar__navigation__label__labelText--from"))
				.click();

		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElement(By.xpath("//button[12]")).click();
		driver.findElement(By.xpath("//abbr[text()='"+day+"']")).click();
		
		//System.out.println(driver.findElement(By.cssSelector("div.react-date-picker__inputGroup")).getText());
//unable to print the date as they store the date in different element.
		
		List<WebElement> actualList = driver.findElements(By.cssSelector("input.react-date-picker__inputGroup__input"));
		
		for(int i=0; i<actualList.size();i++)
		{
			System.out.println(actualList.get(i).getAttribute("value"));
			//value is only thing which gives us true value when we inspect the element.
			Assert.assertEquals(actualList.get(i).getAttribute("value"),expectedList[i] );
		}
		driver.close();
	}

}
