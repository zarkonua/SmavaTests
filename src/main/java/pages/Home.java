package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class Home extends ParentPage {

    private static final String URl = "http://smava.de/v2";
    WebDriverWait wait = new WebDriverWait(driver, 30);

    public Home(WebDriver driver) {
        super(driver);
    }

    public void open() {
        open(URl);
    }

    public WebElement getCreditAmountDropDown() {
        return $(By.xpath("//*[@id=\"sticky-wrapper\"]/div[1]/div/div/div/div/div[1]/div/div/div/div"));
    }

    public WebElement chooseCreditAmount() {
        return $(By.xpath("//*[@id=\"sticky-wrapper\"]/div[1]/div/div/div/div/div[1]/div/span/div/div/div[10]"));
    }

    public WebElement getCreditDurationDropDown() {
        return $(By.xpath("//*[@id=\"sticky-wrapper\"]/div[1]/div/div/div/div/div[2]/div/div/div/div"));
    }

    public WebElement chooseCreditDuration() {
        return $(By.xpath("//*[@id=\"sticky-wrapper\"]/div[1]/div/div/div/div/div[2]/div/span/div/div/div[2]"));
    }

    public WebElement getCreditCategoryDropDown() {
        return $(By.xpath("//*[@id=\"sticky-wrapper\"]/div[1]/div/div/div/div/div[3]/div/div/div/div"));
    }

    public WebElement chooseCreditCategory() {
        return $(By.xpath("//*[@id=\"sticky-wrapper\"]/div[1]/div/div/div/div/div[3]/div/span/div/div/div[3]"));
    }

    public List<WebElement> getCreditOffers() {
        return $$(By.xpath("//*[@id='sticky-wrapper']/div[3]/div/div/div[*]/div[1]/div[1]/div[6]/a/button"));
    }

    public WebElement getLoginButton() {
        return $(By.xpath("//*[@id=\"root\"]/div/div/header/div/div/div[2]/nav/div[2]/div/span"));
    }

    public WebElement getEmailInput() {
        return $(By.xpath("//*[@id=\"root\"]/div/div/header/div/div/div[2]/nav/div[2]/section/div/form/div[1]/div/input"));
    }

    public WebElement getPasswordInput() {
        return $(By.xpath("//*[@id=\"root\"]/div/div/header/div/div/div[2]/nav/div[2]/section/div/form/div[2]/div/input"));
    }

    public WebElement getSubmitButton() {
        return $(By.xpath("//*[@id=\"root\"]/div/div/header/div/div/div[2]/nav/div[2]/section/div/form/button"));
    }
}