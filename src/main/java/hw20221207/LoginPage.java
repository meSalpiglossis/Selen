package hw20221207;

public class LoginPage extends BasePage{

    private WebElement login_eb = new WebElement("Login Edit Box Locator");
    private WebElement password_eb = new WebElement("Password Edit Box Locator");
    private WebElement phone_eb = new WebElement("Phone Edit Box Locator");
    private WebElement code_eb = new WebElement("Code Edit Box Locator");
    private WebElement submit_button = new WebElement("Submit Button Locator");

    public LoginPage() {
        System.out.println("LoginPage default constructor call");
    }

    public void login(Credentials cred) {
        System.out.println("LoginPage login call with parameters: " + cred.toString());
        enterLogin(cred.getLogin());
        enterPassword(cred.getPassword());
        enterPhone(cred.getPhone());
        enterCode(cred.getCode());
        clickSubmitButton();
    }

    private void enterLogin(String login) {
        System.out.println("LoginPage enterLogin call with parameter: " + login);

        getDriver();
        login_eb.enterText(login);
    }

    private void enterPassword(String password) {
        System.out.println("LoginPage enterPassword call with parameter: " + password);

        getDriver();
        password_eb.enterText(password);
    }

    private void enterPhone(String phone) {
        System.out.println("LoginPage enterPhone call with parameter: " + phone);

        getDriver();
        phone_eb.enterText(phone);
    }

    private void enterCode(String code) {
        System.out.println("LoginPage enterCode call with parameter: " + code);

        getDriver();
        code_eb.enterText(code);
    }

    private void clickSubmitButton() {
        System.out.println("LoginPage clickSubmitButton call");

        getDriver();
        submit_button.click();
    }
}
