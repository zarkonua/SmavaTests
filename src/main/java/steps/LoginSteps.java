package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Login;

public class LoginSteps {

    private Login login;
    private WebDriverWait wait;

    public LoginSteps(WebDriver driver) {
        login = new Login(driver);
        wait = new WebDriverWait(driver, 30);
    }

    public boolean isErrorMessageDisplayed() {
        return login.getErrorMessage().isDisplayed();
    }

    public void fillInCredentials(String email, String password) {
        login.getEmailInput().sendKeys(email);
        login.getPasswordInput().sendKeys(password);
        login.getSubmitButton().click();
    }
}
