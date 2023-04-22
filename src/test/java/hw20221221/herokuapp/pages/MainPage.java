package hw20221221.herokuapp.pages;

import org.openqa.selenium.By;

import static hw20221221.herokuapp.helpers.WebBrowser.webBrowser;

public class MainPage extends PageBase{

    private static final String TITLE_EXPECTED = "The Internet";
    private static final By LINK_JS_ALERTS = By.xpath("//a[@href='/javascript_alerts']");

    public static boolean titleIsPresented() {
        return titleIsPresented(TITLE_EXPECTED);
    }

    public static void clickJavaScriptAlertsLink() {
        webBrowser().findElement(LINK_JS_ALERTS).click();
    }


}
