package hw20221207;

public class BasePage {

    static private WebDriver driver = new WebDriver(); // temporary solution. should be smart-singleton

    public BasePage() {
        System.out.println("BasePage default constructor call");
    }

    static protected WebDriver getDriver() {
        System.out.println("BasePage getDriver call");
        return driver;
    }
}
