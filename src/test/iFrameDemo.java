package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
        
   

     //Scroll down on the page by Pixels
     //JavascriptExecutor js = (JavascriptExecutor) driver;
     //js.executeScript("window.scrollBy(0,500)"); 

		
	    //Scroll down on the page by web element
        
		//WebElement frame1 = driver.findElement(By.id("frame1")); 
    // ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",frame1);
     
     
	    //Scroll down on the page by scroll to bottom of the page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
     
     System.out.println("Am I scrolling??");

     //Get the first iframe
     //Switch to the first iframe -index, webelement,ID,name
     //driver.switchTo().frame("frame1"); //using ID
     //driver.switchTo().frame(1); //using index -first frame ????not working
     WebElement frame1 = driver.findElement(By.id("frame1")); 
     driver.switchTo().frame(frame1); //using WebElement

     System.out.println("Am I switching??");


     //Get the text
     WebElement f1_heading = driver.findElement(By.id("sampleHeading"));
     String f1_text = f1_heading.getText();
     System.out.println(f1_text);


     //Go back to the main page and get the text of the paragraph
     driver.switchTo().defaultContent(); //switch back to main
     //driver.switchTo().parentFrame();  //another way to go back to main

     String main_para = driver.findElement(By.xpath("//div[@id='framesWrapper']/child::div")).getText();
     System.out.println(main_para);







	}

}
