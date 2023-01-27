package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyPress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("userName")).sendKeys("Anjali Dhawan");
		driver.findElement(By.id("userEmail")).sendKeys("xyz@gmail.com");
		WebElement cAddress= driver.findElement(By.id("currentAddress"));
		cAddress.sendKeys("123, Road1, Street2");
		
		//Action
		
		
		//Press Ctrl + a
		Actions actions = new Actions(driver);
		/*
		actions.keyDown(Keys.CONTROL); //press control key
		actions.sendKeys("a"); //while pressing ctrol, press a
		
		actions.keyUp(Keys.CONTROL); //release control key
		actions.build().perform(); //perform the action
		*/
		//All above lines in one go
		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		/*
		//Press Ctrl + c
		
		actions.keyDown(Keys.CONTROL); //press control key
		actions.sendKeys("c"); //while pressing ctrol, press a
		actions.keyUp(Keys.CONTROL); //release control key
		actions.build().perform(); //perform the action
		*/
		
		//All above lines in one go
		
		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		/*
		// move to next element
		actions.sendKeys(Keys.TAB);
		actions.build().perform();
		
		actions.keyDown(Keys.CONTROL); //press control key
		actions.sendKeys("v"); //while pressing ctrol, press a
		actions.keyUp(Keys.CONTROL); //release control key
		actions.build().perform(); //perform the action
		*/
		
		actions.sendKeys(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}

}
