import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[class='inputs']")).sendKeys("shashank");
		driver.findElement(By.id("alertbtn")).click();

		driver.switchTo().alert().accept();
		// driver.switchTo() is to used alert.
		// if we want to accept or give ok/yes. then we use accept()
		// if we want to negate or want to give no then we use dismiss()
		Thread.sleep(2000);
		// System.out.println(driver.switchTo().alert().getText());

		driver.findElement(By.cssSelector("input[class='inputs']")).sendKeys("shashank");
		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().dismiss();
		System.out.println(driver.switchTo().alert().getText());

	}

}
