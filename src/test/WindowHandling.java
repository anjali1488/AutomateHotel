package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		//click on second window button
		driver.findElement(By.id("windowButton")).click();
	
		
		//click on third window button
WebElement prompt1 = driver.findElement(By.id("messageWindowButton"));
		
		// to click on the button that's not visible without scroll
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",prompt1);
		//driver.findElement(By.id("messageWindowButton")).click();
		
		String mainWindow = driver.getWindowHandle();
		System.out.println(mainWindow);
		
		Set <String> s1 = driver.getWindowHandles();
		Iterator <String> itr = s1.iterator();
		while(itr.hasNext())
		{
			String childWindow = itr.next();
			if(!mainWindow.equalsIgnoreCase(childWindow))
			{
				driver.switchTo().window(childWindow);
				System.out.println("Print childwindow windowhandle " + childWindow);
				//WebElement id = driver.switchTo().window(childWindow).getClass();
				
				WebElement cwText = driver.switchTo().window(childWindow).findElement(By.id("sampleHeading"));
				System.out.println(cwText.getText());
				driver.close();
				
				System.out.println("Getting child window closed");
			}
		}
		driver.switchTo().window(mainWindow);
		driver.quit();
		
		
	}

}
