package hw20221221.herokuapp.pages;

import org.openqa.selenium.By;

import static hw20221221.herokuapp.helpers.WebBrowser.webBrowser;

public class JSAlertPage extends PageBase{

    private static final String TITLE = "The Internet";
    private static final String H3_HEADER_ACTUAL = webBrowser().findElement(By.xpath("//h3")).getText();
    private static final String H3_HEADER_EXPECTED = "JavaScript Alerts";
    private static final String JS_ALERT_MESSAGE_EXPECTED = "I am a JS Alert";
    private static final String JS_ALERT_RESULT_EXPECTED = "You successfully clicked an alert";
    private static final String JS_CONFIRM_MESSAGE_EXPECTED = "I am a JS Confirm";
    private static final String JS_CONFIRM_RESULT_EXPECTED = "You clicked: Cancel";
    private static final String JS_PROMPT_MESSAGE_EXPECTED = "I am a JS prompt";
    private static final String JS_PROMPT_RESULT_EXPECTED = "Some nice text";
    private static final String SOME_TEXT = "Some nice text";
    private static final By BUTTON_FOR_JS_ALERT = By.xpath("//button[@onclick='jsAlert()']");
    private static final By BUTTON_FOR_JS_CONFIRM = By.xpath("//button[@onclick='jsConfirm()']");
    private static final By BUTTON_FOR_JS_PROMPT = By.xpath("//button[@onclick='jsPrompt()']");
    private static final By JS_ALERTS_RESULT = By.xpath("//p[@id='result']");

    public static boolean isProperH3HeaderPresented() {
        return H3_HEADER_ACTUAL.contains(H3_HEADER_EXPECTED);
    }

    public static void clickJSAlertButton() {
        webBrowser().findElement(BUTTON_FOR_JS_ALERT).click();
    }

    public static void clickJSConfirmButton() {
        webBrowser().findElement(BUTTON_FOR_JS_CONFIRM).click();
    }

    public static void clickJSPromptButton() {
        webBrowser().findElement(BUTTON_FOR_JS_PROMPT).click();
    }

    public static void clickAlertAccept() {
        webBrowser().switchTo().alert().accept();
    }

    public static void clickAlertDismiss() {
        webBrowser().switchTo().alert().dismiss();
    }

    public static boolean isProperJSAlertMessage() {
        return alertText().contains(JS_ALERT_MESSAGE_EXPECTED);
    }

    public static boolean isProperJSConfirmMessage() {
        return alertText().contains(JS_CONFIRM_MESSAGE_EXPECTED);
    }

    public static boolean isProperJSPromptMessage() {
        return alertText().contains(JS_PROMPT_MESSAGE_EXPECTED);
    }

    public static boolean isProperJSAlertResult() {
        return webBrowser().findElement(JS_ALERTS_RESULT).getText().contains(JS_ALERT_RESULT_EXPECTED);
    }

    public static boolean isProperJSConfirmResult() {
        return webBrowser().findElement(JS_ALERTS_RESULT).getText().contains(JS_CONFIRM_RESULT_EXPECTED);
    }

    public static boolean isProperJSPromptResult() {
        return webBrowser().findElement(JS_ALERTS_RESULT).getText().contains(JS_PROMPT_RESULT_EXPECTED);
    }

    public static void inputSomeTextToJSPromptTextField() {
        webBrowser().switchTo().alert().sendKeys(SOME_TEXT);
    }

    private static String alertText() {
        return webBrowser().switchTo().alert().getText();
    }
}
