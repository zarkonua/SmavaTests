package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Credit extends Page {

    public Credit(WebDriver driver) {
        super(driver);
    }

    public boolean isProgressBarLoaded() {
        return $(By.xpath("//*[@id=\"form_V1\"]/div/div[1]")).isDisplayed();
    }

    public boolean isProgressBarHasCorrectProgress() {
        return $(By.xpath("//*[@id=\"form_V1\"]/div/div[1]/div/div[2]/div")).isDisplayed();
    }

    public boolean isCreditCategoryLoaded() {
        return $(By.xpath("//*[@id=\"applicant0.loan.selection.category\"]")).isDisplayed();
    }

    public boolean isCreditAmountLoaded() {
        return $(By.xpath("//*[@id=\"applicant0.loan.selection.amount\"]")).isDisplayed();
    }

    public boolean isCreditDurationLoaded() {
        return $(By.xpath("//*[@id=\"applicant0.loan.selection.duration\"]")).isDisplayed();
    }
}