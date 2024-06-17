package qaPracticeNetify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class basicLoginLogout {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa-practice.netlify.app/auth_ecommerce");
		driver.findElement(By.id("email")).sendKeys("admin@admin.com");
		driver.findElement(By.id("password")).sendKeys("admin123");
driver.findElement(By.xpath("//button[@test-data='submitBtn']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//button[@class='btn btn-primary shop-item-button']")).click();
driver.findElement(By.cssSelector("button[onclick='displayCartMessage()']")).click();

Thread.sleep(5000);
driver.findElement(By.name("phone")).sendKeys("898925823");
driver.findElement(By.xpath("//input[@name='street']")).sendKeys("Hinjewadi");
driver.findElement(By.cssSelector("input[placeholder='London']")).sendKeys("PUNE");

WebElement countryDropdown = driver.findElement(By.id("countries_dropdown_menu"));

 Select dropDown = new Select(countryDropdown);
 dropDown.selectByValue("India");
 driver.findElement(By.xpath("//button[@onclick='submitOrder()']")).click();
 System.out.println(driver.findElement(By.id("message")).getText());
 
 driver.findElement(By.id("logout")).click();




	}

}
