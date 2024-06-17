package Selenium;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class streamFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement> riceCategory = driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> newList = riceCategory.stream().filter(s -> s.getText().contains("Rice"))
				.collect(Collectors.toList());
//newList.forEach(s->System.out.println(s));
		Assert.assertEquals(riceCategory, newList);
	}

}
