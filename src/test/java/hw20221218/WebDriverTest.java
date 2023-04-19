package hw20221218;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WebDriverTest {

    @Test
    public void webDriverTest() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");
        WebElement linkRubberDucks = driver.findElement(By.linkText("Rubber Ducks"));

        linkRubberDucks.click();

        String successText = driver.findElement(By.tagName("title")).getText();
        System.out.println("successText");

//        Assert.assertTrue(successText.contains("Rubber Ducks"));
//        driver.quit();

    }
}
