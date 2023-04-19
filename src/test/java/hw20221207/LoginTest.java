package hw20221207;

public class LoginTest extends BaseTest{

    public LoginTest() {
        System.out.println("LoginTest default constructor call");
    }

    public void loginTest() {
        Credentials cred = new Credentials("user", "password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(cred);

//        HomePage homePage = new HomePage();
//        boolean result = homePage.isImportantLabelAvailable();
    }

}
