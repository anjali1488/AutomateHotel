package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		
		//using xpath -- using contains
			//driver.findElement(By.xpath("//button[contains(@id, 'tabButton')]")).click();
				
		//uisng xpath -Method 2 -'starts-with'
				//driver.findElement(By.xpath("//button[starts-with(@id,'win')]")).click();		
		//uisng xpath -Method 3 -'*' - it will not specifically look for button type of element, so start means any type of element
				
			driver.findElement(By.xpath("//*[(@type = 'button' and @id = 'tabButton')]")).click();
			
			
			WebDriver driver1 = new ChromeDriver();
			driver1.get("https://demoqa.com/browser-windows");
			driver1.manage().window().maximize();
			
			//this ancestor only locates the form and we dont have any action to perform on it
			//driver1.findElement(By.xpath("*//input[@id='username']/ancestor::form"));
			
			
			String t1 = driver1.findElement(By.xpath("//form[@name='login_form']/child::table/tbody/tr[2]/td[1]")).getText();
			System.out.println(t1);
			
			
			//input[@id='username']/parent::td/parent::tr
	}
}
