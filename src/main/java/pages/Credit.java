package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Credit extends ParentPage {

    public Credit(WebDriver driver) {
        super(driver);
    }

    public WebElement getProgressBar() {
        return $(By.xpath("//*[@id=\"form_V1\"]/div/div[1]"));
    }

    public WebElement isProgressBar25Percent() {
        return $(By.xpath("//*[@id=\"form_V1\"]/div/div[1]/div/div[2]/div"));
    }

    public WebElement getCreditCategory() {
        return $(By.xpath("//*[@id=\"applicant0.loan.selection.category\"]"));
    }

    public WebElement getCreditAmount() {
        return $(By.xpath("//*[@id=\"applicant0.loan.selection.amount\"]"));
    }

    public WebElement getCreditDuration() {
        return $(By.xpath("//*[@id=\"applicant0.loan.selection.duration\"]"));
    }
}