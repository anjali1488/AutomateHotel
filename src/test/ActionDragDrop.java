package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDragDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		Thread.sleep(3);
		
		Actions obj1 = new Actions(driver);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",drag);
		
		WebElement dropto = driver.findElement(By.xpath("//*[@id='droppable' and @class='drop-box ui-droppable']"));
		obj1.dragAndDrop(drag, dropto).build().perform();
	}

}
