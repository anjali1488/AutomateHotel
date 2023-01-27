package test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PromptHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		// Clicking on First Alert
		driver.findElement(By.id("alertButton")).click();
		Alert promptAlert1 = driver.switchTo().alert();
		System.out.println("Text of first Alert " + promptAlert1.getText());
		
		promptAlert1.accept();
		
		// Clicking on second Alert
		driver.findElement(By.id("timerAlertButton")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		
		
		Alert promptAlert2 = driver.switchTo().alert();
		
		System.out.println("Text of second Alert " + promptAlert2.getText());
				
		promptAlert2.accept();
		
		
		// Clicking on third Alert
		WebElement prompt1 = driver.findElement(By.id("confirmButton"));
		
		// to click on the button that's not visible without scroll
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",prompt1);
		
		Alert promptAlert3 = driver.switchTo().alert();
		System.out.println("Text of third Alert " + promptAlert3.getText());
		
		promptAlert3.accept();
			
		//clicking on fourth button
		WebElement prompt2 = driver.findElement(By.id("promtButton"));
		
		// to click on the button that's not visible without scroll
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",prompt2);
		
		//switch to alert
		Alert promptAlert = driver.switchTo().alert();
		
		System.out.println(promptAlert.getText());
		
		promptAlert.sendKeys("Anjali");
		promptAlert.accept();
		
		System.out.println(driver.findElement(By.id("promptResult")).getText());
		
		driver.quit();
		
		
		
	}

}
