import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		//implicit wait
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//waiting for object to show on the page.
driver.get("https://rahulshettyacademy.com/locatorspractice/");

driver.findElement(By.id("inputUsername")).sendKeys("8989282668");
driver.findElement(By.name("inputPassword")).sendKeys("0000000");
driver.findElement(By.className("signInBtn")).click();
System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
driver.findElement(By.linkText("Forgot your password?")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Rahul");
driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Rahulshetty@gmail.com");
driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("8989282668");
//System.out.println("again");
driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
System.out.println(driver.findElement(By.xpath("//p[@class='infoMsg']")).getText());

driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("shashank");
driver.findElement(By.cssSelector("input[type*=pass]")).sendKeys("rahulshettyacademy");
driver.findElement(By.id("chkboxOne")).click();
driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();






	}

}
