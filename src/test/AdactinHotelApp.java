package test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class AdactinHotelApp {



   public static void main(String[] args) {
        // TODO Auto-generated method stub



       System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        //System.setProperty("webdriver.edge.driver", "C:\\Drivers\\msedgedriver.exe");
        //System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new EdgeDriver();
        //WebDriver driver = new FirefoxDriver();
        driver.get("http://adactinhotelapp.com");
        driver.manage().window().maximize();
        //driver.navigate().to("http://google.com");
        //driver.navigate().back();
        //driver.navigate().forward();
        //driver.navigate().refresh();
        //driver.quit();
        // Find the user name element
        
        WebElement uName = driver.findElement(By.id("username"));
        uName.sendKeys("santosh13");
        
        // Passing the password
        
        driver.findElement(By.id("password")).sendKeys("Snoopy1234");
        
        //
        
        //driver.findElement(By.cssSelector(".login_register")).click();
        
        //driver.findElement(By.cssSelector("#login")).click();
        
        // tag and attribute
        
        //driver.findElement(By.cssSelector("input[name=login]")).click();
        
        // using tag , class and attribute "type"
        
        //driver.findElement(By.cssSelector("input.login_button[type=submit]")).click();
        
        // using tag , class and attribute "value
        
        driver.findElement(By.cssSelector("input.login_button[value=Login]")).click();



       //Drop down - 3 methods to select the elements - LOCATION
        //new Select(driver.findElement(By.className("search_combobox"))).selectByValue("Sydney");
        //new Select(driver.findElement(By.className("search_combobox"))).selectByIndex(3);
        new Select(driver.findElement(By.className("search_combobox"))).selectByVisibleText("Melbourne");



       
        //Drop down - HOTELS
        new Select(driver.findElement(By.cssSelector("#hotels.search_combobox"))).selectByValue("Hotel Sunshine");



       //Drop down - ROOMTYPE
        new Select(driver.findElement(By.cssSelector("select[name=room_type]"))).selectByValue("Double");
        
        
        //click on Search
        driver.findElement(By.id("Submit")).click();
        
        //Radio button on next page
        driver.findElement(By.id("radiobutton_0")).click();
        
        //Click on any hyperlink above
        driver.findElement(By.linkText("Booked Itinerary")).click();
        
        driver.findElement(By.partialLinkText("Search")).click();
        
        driver.quit();
    }}