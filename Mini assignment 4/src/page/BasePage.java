package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

public class BasePage {
     public static WebDriver driver;
     public static WebDriver initialSetup(){
         System.setProperty("webdriver.chrome.driver","C:\\Users\\darshb\\Downloads\\selenium\\selenium 4.1.2\\chromdriver\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         return driver;
     }


}
