package Test.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;

public class TestsForIdLocator {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("Chrome");
        driver.get("https://practice.cybertekschool.com/multiple_buttons");

// id = "disappering_button"
        WebElement button = driver.findElement(By.id("dissappering_button"));

        button.click();

        WebElement result = driver.findElement(By.id("result"));
//<p id= "result" style = "color:green">Now it's gone!</p>

//      Now it's gone! <---- text, get.Text() will return this text
        System.out.println(result.getText());

        driver.quit();
    }
}
