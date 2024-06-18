package qaPracticeNetify;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa-practice.netlify.app/double-click");
	WebElement button = driver.findElement(By.id("double-click-btn"));
	 Actions act = new Actions(driver);
	 act.doubleClick(button).perform();
	// Thread.sleep(5000);
	 System.out.println(driver.findElement(By.id("double-click-result")).getText());
		

	}

}
