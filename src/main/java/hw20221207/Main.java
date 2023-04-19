package hw20221207;

public class Main {
    public static void main(String[] args) {

        Credentials cred = new Credentials("user", "password", "+322233323233", "12345");
        LoginPage loginPage = new LoginPage();
        loginPage.login(cred);

//        HomePage homePage = new HomePage();
//        boolean result = homePage.isImportantLabelAvailable();

        boolean result = HomePage.isImportantLabelAvailable();

        if(result) {
            System.out.println("Login Test successful with parameters: " + cred.toString());
        } else {
            System.out.println("Login Test failed with parameters: " + cred.toString());
        }

        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("os.name"));
    }
}
