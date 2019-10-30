package Test.day3;

import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;

public class BrowserFactoryTest {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com");
        //print source code of a page.
        System.out.println(driver.getPageSource());
        //to finish test execution.
        driver.quit();
    }
}
