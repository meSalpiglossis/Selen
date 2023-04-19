package hw20221207;

public class HomePage extends BasePage{
    /*
    public HomePage() {
        System.out.println("HomePage default constructor call");
    }
    */

    static public boolean isImportantLabelAvailable() {
        System.out.println("HomePage isImportantLabelAvailable call");
        return isLabelAvailable();
    }

    static public boolean isLabelAvailable() {
        System.out.println("HomePage isLabelAvailable call");

        getDriver();
        return important_label.isVisible() && important_label.isClickable();
    }


    static private WebElement important_label = new WebElement("Important Label Locator");
}
