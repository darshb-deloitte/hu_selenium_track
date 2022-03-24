import java.awt.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium. WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import java.util.*;

public class Scenario2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\darshb\\Downloads\\selenium\\selenium 4.1.2\\chromdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        Thread.sleep(3000);

        WebElement frm = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(frm);
        Actions builder = new Actions(driver);
        WebElement src= driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
        WebElement dest = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));


        Action dragAndDrop = builder.clickAndHold(src)
                .moveToElement(dest)
                .release(dest)
                .build();

        dragAndDrop.perform();
    }
}