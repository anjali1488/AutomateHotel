package test;


	
	import java.util.Iterator;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Amazon {

		public static void main(String[] args) {
			
			//Set the chrome driver path
			 System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
			
			//Calling the chromedriver and maximize the window
					WebDriver driver = new ChromeDriver();
					driver.manage().window().maximize();
			
			//Open browser
			driver.get("http://www.amazon.in");
				
			//Click on Search box and search for bags
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags");

			//Click on the Search button after entering the text
			driver.findElement(By.id("nav-search-submit-text")).click();
			

			/*Scroll down the page- use javascript executor - 4 methods are possible
			 * Scroll By pixels
			 * Scroll to element
			 * Scroll to page end
			 * Horizontal scroll (not used frequently)
			 */
			
			//Scroll By pixels
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)"); //x-axis and y-axis values for the location
			
			//Find all elements
			List<WebElement> results = 
		   driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		    //driver.findElements(By.cssSelector(".a-size-medium a-color-base a-text-normal"));
		   // driver.findElements(By.className("a-size-medium a-color-base a-text-normal"));

			
			//Get title of all the product on the results page
			System.out.println(results.size());
			
			for (int i = 0; i<results.size();i++)
			{
				System.out.println(results.get(i).getText());
			}
			
				
			
			//Navigate back to home page
			driver.findElement(By.id("nav-logo-sprites")).click();
			
			//Close the browser
			//driver.quit();
			 
			 
		}

	}



