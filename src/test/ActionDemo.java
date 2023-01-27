package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		//instantiate Actions class to perform below actions like double click, right click
		Actions obj1 = new Actions(driver);
		
		//right click a button "Right Click Me"
		WebElement rightBtn = driver.findElement(By.id("rightClickBtn"));
		
		//Action Chaining
		//obj1.contextClick(rightBtn).build().perform();
		
		//Performing without action chaining 
		//obj1.contextClick(rightBtn).perform();
		
		//Performing with action chaining 
		obj1.moveToElement(rightBtn).contextClick().build().perform();
		
		//Action action = obj1.build();
		//action.perform();
				
				
		//clicking the button named  Click me
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,500)"); 
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		
	
		
		
		//WebElement clickMeBtn = driver.findElement(By.id("jW79W"));
		//driver.close();
	}

}
