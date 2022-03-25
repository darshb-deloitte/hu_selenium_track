package test;
import org.openqa.selenium.WebDriver;


import page.BasePage;

public class basetest extends BasePage {


    private static void launchsauce() {
        driver.get("https://www.saucedemo.com/");
    }
}
