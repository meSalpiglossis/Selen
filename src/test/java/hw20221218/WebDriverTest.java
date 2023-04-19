package hw20221218;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebDriverTest {

    WebDriver driver;

    @BeforeMethod
    void init() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");
    }

    @Test
    public void mainPageTest() {
        Assert.assertTrue(driver.getTitle().contains("Online Store"));
        driver.quit();
    }

    @Test
    public void linkRubberDucksTest() {
        WebElement link = driver.findElement(By.linkText("Rubber Ducks"));

        link.click();

        String titleText = driver.getTitle();
        System.out.println(titleText);
        Assert.assertTrue(titleText.contains("Rubber Ducks"));
        driver.quit();
    }

    @Test
    public void linkNewCustomersTest() {
        WebElement link = driver.findElement(By.linkText("New customers click here"));

        link.click();

        String titleText = driver.getTitle();
        System.out.println(titleText);
        Assert.assertTrue(titleText.contains("Create Account"));
        driver.quit();
    }
}
