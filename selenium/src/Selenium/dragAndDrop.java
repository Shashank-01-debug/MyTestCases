package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		//select the total frame then select the first box from it.
driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
driver.findElement(By.id("draggable")).click();
          //for frame tagname starts from iframe.
		 //selenium is unable to find such element.
		 //so we need to tell selenium that this webelement is different and it is frame.
		 // a frame is a part of a web page or browser window which displays content
		// independent of its container, with the ability to load content independently
Actions a = new Actions(driver);
WebElement source = driver.findElement(By.id("draggable"));
WebElement target = driver.findElement(By.id("droppable"));

a.dragAndDrop(source, target).build().perform();
//it is given to comeback from frames and works like usual.
driver.switchTo().defaultContent();

		

	}

}
