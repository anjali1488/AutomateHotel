package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import com.sun.tools.javac.util.List;

public class testMyself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("books");
        driver.findElement(By.id("nav-search-submit-button")).click();
        
        JavascriptExecutor executorjs= (JavascriptExecutor)driver;
        executorjs.executeScript("window.scrollBy(0,1000)");
        
        List <WebElement> results = driver.findElement(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
        
        
       //driver.findElement(By.id("username")).sendKeys("anjali88");
       //driver.findElement(By.cssSelector("input[name=username]")).sendKeys("anjali88");
       
      // driver.findElement(By.cssSelector("input.login_input[name=password]")).sendKeys("dhawan");
       //driver.findElement(By.id("password")).sendKeys("dhawan"); 
       
       
       //driver.findElement(By.cssSelector("input.login_button[type=submit]")).click();
       //driver.findElement(By.cssSelector("#login")).click();
	}

}
