package Test.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class TestsForTagNameLocator {

    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");

        driver.findElement(By.name("full_name")).sendKeys("Test User");
        driver.findElement(By.name("email")).sendKeys("testeremail@email.com");
        driver.findElement(By.name("wooden_spoon")).click();

        BrowserUtils.wait(3);

        WebElement sub_header = driver.findElement(By.tagName("h3"));

        System.out.println(sub_header.getText());

        driver.quit();




    }
}