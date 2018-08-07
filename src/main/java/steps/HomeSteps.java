package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Home;

import java.util.List;
import java.util.Random;

public class HomeSteps {

    private Home home;
    private WebDriverWait wait;
    private WebDriver driver;

    public HomeSteps(WebDriver driver) {
        home = new Home(driver);
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    public void open() {
        home.open();
    }

    public void setCreditAmount() {
        home.getCreditAmountDropDown().click();
        wait.until(ExpectedConditions.elementToBeClickable(home.chooseCreditAmount())).click();
    }

    public void setCreditDuration() {
        home.getCreditDurationDropDown().click();
        wait.until(ExpectedConditions.elementToBeClickable(home.chooseCreditDuration())).click();
    }

    public void setCreditCategory() {
        home.getCreditCategoryDropDown().click();
        wait.until(ExpectedConditions.elementToBeClickable(home.chooseCreditCategory())).click();
    }

    public CreditSteps chooseRandomOffer() {
        List<WebElement> creditOffers = home.getCreditOffers();
        Random random = new Random();
        creditOffers.get(random.nextInt(creditOffers.size() / 2)).click();
        return new CreditSteps(driver);
    }

    public LoginSteps loginWithCreds(String email, String password) {
        home.getLoginButton().click();
        home.getEmailInput().sendKeys(email);
        home.getPasswordInput().sendKeys(password);
        home.getSubmitButton().click();
        return new LoginSteps(driver);
    }
}
