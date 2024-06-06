import static org.testng.Assert.assertFalse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
	
driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
//to check whether checkbox is checked or not we use isSelected()
//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
System.out.println("before");
Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//this method will expect false inside argument. If there is false inside argument
// then it will passed otherwise got failed.
//if test passes then it proceeds to next step.
System.out.println("after");

System.out.println(driver.findElement(By.cssSelector("input[id*='mainContent_chk_IndArm']")).isSelected());
//count the no. of checkbox
//find one common value from each checkbox
System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
driver.close();


	}

}
