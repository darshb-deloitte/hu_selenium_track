import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\darshb\\Downloads\\selenium\\selenium 4.1.2\\chromdriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[29]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
        String input="Ex-Test";
        driver.switchTo().alert().sendKeys(input);
        driver.switchTo().alert().accept();

        String text=driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();

        System.out.println(text);
        if(text.contains(input))
        {
            System.out.println("true");
        }else{
            System.out.println("false");
        }



    }
}
