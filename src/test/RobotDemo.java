package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotDemo {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://my.monsterindia.com/create_account.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@class = 'browse-text']")).click();
		
		//Instantiate Robot class
		Robot robo = new Robot();
		
		//path where file is stored
		StringSelection path = new StringSelection("C:\\Users\\Anjali.Dhawan\\Downloads\\TestFileRobot.docx");
		System.out.println("Done");
		
		//put path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
	
		robo.delay(2000);
		//paste the file in popup
		robo.keyPress(KeyEvent.VK_ENTER);//Its like key up in action event, we r pressing enter to make sure we r on the pop up
		robo.keyRelease(KeyEvent.VK_ENTER);//Release enter key
		
	
		robo.delay(2000);
		robo.keyPress(KeyEvent.VK_CONTROL); //Press control
		robo.keyPress(KeyEvent.VK_V);  //Press control v
		System.out.println("Done");
		
		robo.delay(2000);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		
		robo.delay(2000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		robo.delay(2000);
		
		System.out.println("Done");
	}

}
