package Test.day3;

import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;

public class NavigationPractice {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();//to maximize
        driver.get("http://google.com");
        driver.navigate().to("http://amazon.com");
        //navigate back to google
        driver.navigate().back();
        //move forward to amazon again
        driver.navigate().forward();
        //to refresh/reload a webpage/website
        driver.navigate().refresh();

        //shutdown browser
        driver.quit();
        //what will happen if we call the driver again
    //    driver.get("http://google.com");//we cannot call driver after quit()

    }

}
