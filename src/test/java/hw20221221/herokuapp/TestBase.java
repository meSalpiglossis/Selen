package hw20221221.herokuapp;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static hw20221221.herokuapp.helpers.WebBrowser.webBrowser;
import static hw20221221.herokuapp.helpers.WebBrowser.closeWebBrowser;


public class TestBase {

    String testURL = "https://the-internet.herokuapp.com/";

    @BeforeMethod
    void openAppInChromeBrowser() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        webBrowser().get(testURL);
    }

    @AfterMethod
    void driverQuit() {
        closeWebBrowser();
    }
}
