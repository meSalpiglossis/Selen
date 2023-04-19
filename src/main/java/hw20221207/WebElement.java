package hw20221207;

public class WebElement {


    public WebElement(String locator) {
        System.out.println("WebElement constructor call with parameter: " + locator);
    }

    public void enterText(String text) {
        System.out.println("WebElement enterText call with parameter: " + text);
    }

    public void click() {
        System.out.println("WebElement click call");
    }

    public boolean isVisible() {
        System.out.println("WebElement isVisible call");
        return true;
    }

    public boolean isClickable() {
        System.out.println("WebElement isClickable call");
        return true;
    }
}
