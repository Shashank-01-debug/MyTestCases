import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentWaitDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("div[id='start'] button")).click();
		
		Wait<WebDriver> wait =new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
//here Fluentwait is class which implements Wait interface.	
		
		
	WebElement foo = wait.until(new Function<WebDriver, WebElement>() {	
		public WebElement visible(WebDriver driver) {
			
			return driver.findElement(By.cssSelector("div[id='z'] h4"));
		}

		@Override
		public WebElement apply(WebDriver t) {
			// TODO Auto-generated method stub
			return null;
		}
	})
		
		
		System.out.println(driver.findElement(By.cssSelector("div[id='z'] h4")).getText());
		
		
		
	}

}
