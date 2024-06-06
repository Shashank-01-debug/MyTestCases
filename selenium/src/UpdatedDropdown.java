import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.className("paxinfo")).click();
		Thread.sleep(2000);
		/*int i=1;
		while(i<=3)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
			//click 4 times
		}*/
		System.out.println("initial passengers are:"+driver.findElement(By.className("paxinfo")).getText());
	for(int i=1;i<=3;i++)
	{
		driver.findElement(By.id("hrefIncAdt")).click();
		
		
	}
	
	driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println("updated passengers are:"+ driver.findElement(By.className("paxinfo")).getText());
		driver.close();
		
	}

}
