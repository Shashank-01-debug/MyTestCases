package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class relativeLocaatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nameBox = driver.findElement(By.name("name"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameBox)).getText());
		
		
		/*WebElement dob = driver.findElement(By.xpath("//label[@for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dob)).click();
		//using relative locator to trigger element which are on left side.
		
		WebElement iceCream = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
            driver.findElement(with(By.tagName("input")).toLeftOf(iceCream)).click();
          //  using relative locator to trigger element which are on right side.
          WebElement student = driver.findElement(By.id("inlineRadio1"));
          System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(student)).getText());*/
	}

}
