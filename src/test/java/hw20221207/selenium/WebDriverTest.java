package hw20221207.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WebDriverTest {

    @Test(timeOut = 5000)
    public void webDriverTest() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        List<WebElement> allLinks = driver.findElements(By.cssSelector("li a"));

        allLinks.get(9).click();

        String successText = driver.findElement(By.id("content")).getText();
        Assert.assertTrue(successText.contains("Drag and Drop"));
        driver.quit();
    }
}
