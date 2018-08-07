package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Credit;

public class CreditSteps {

    private Credit credit;
    private WebDriverWait wait;

    public CreditSteps(WebDriver driver) {
        credit = new Credit(driver);
        wait = new WebDriverWait(driver, 30);
    }

    public boolean isProgressBarLoaded() {
        return credit.getProgressBar().isDisplayed();
    }

    public boolean isProgressBarHasCorrectProgress() {
        return credit.isProgressBar25Percent().isDisplayed();
    }

    public boolean isCreditCategoryLoaded() {
        return credit.getCreditCategory().isDisplayed();
    }

    public boolean isCreditAmountLoaded() {
        return credit.getCreditAmount().isDisplayed();
    }

    public boolean isCreditDurationLoaded() {
        return credit.getCreditDuration().isDisplayed();
    }
}
