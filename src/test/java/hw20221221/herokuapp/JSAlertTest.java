package hw20221221.herokuapp;

import hw20221221.herokuapp.pages.JSAlertPage;
import hw20221221.herokuapp.pages.MainPage;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class JSAlertTest extends TestBase {

    @Test()
    public void mainPageReachTest() {
        assertTrue(MainPage.titleIsPresented());
    }

    @Test()
    public void javaScriptAlertsPageReachTest() {
        MainPage.clickJavaScriptAlertsLink();

        assertTrue(JSAlertPage.isProperH3HeaderPresented());
    }

    @Test()
    public void javaScriptAlertsPageJSAlertTest() {
        MainPage.clickJavaScriptAlertsLink();

        JSAlertPage.clickJSAlertButton();

        assertTrue(JSAlertPage.isProperJSAlertMessage());

        JSAlertPage.clickAlertAccept();

        assertTrue(JSAlertPage.isProperJSAlertResult());
    }

    @Test()
    public void javaScriptAlertsPageJSConfirmTest() {
        MainPage.clickJavaScriptAlertsLink();

        JSAlertPage.clickJSConfirmButton();

        assertTrue(JSAlertPage.isProperJSConfirmMessage());

        JSAlertPage.clickAlertDismiss();

        assertTrue(JSAlertPage.isProperJSConfirmResult());
    }

    @Test()
    public void javaScriptAlertsPageJSPromptTest() {
        MainPage.clickJavaScriptAlertsLink();

        JSAlertPage.clickJSPromptButton();

        assertTrue(JSAlertPage.isProperJSPromptMessage());

        JSAlertPage.inputSomeTextToJSPromptTextField();
        JSAlertPage.clickAlertAccept();

        assertTrue(JSAlertPage.isProperJSPromptResult());
    }
}
