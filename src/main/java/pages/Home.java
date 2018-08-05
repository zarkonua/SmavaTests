package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class Home extends Page {

    private static final String URl = "http://smava.de/v2";
    WebDriverWait wait = new WebDriverWait(driver, 30);

    public void open() throws InterruptedException {
        open(URl);
        wait.until(ExpectedConditions.titleIs("SMAVA - Das Online-Vergleichsportal für Kredite | SMAVA"));
    }

    public void setCreditAmount() {
        $(By.xpath("//*[@id=\"sticky-wrapper\"]/div[1]/div/div/div/div/div[1]/div/div/div/div")).click();
        String creditSummExpression = "//*[@id=\"sticky-wrapper\"]/div[1]/div/div/div/div/div[1]/div/span/div/div/div[10]";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(creditSummExpression)));
        $(By.xpath(creditSummExpression)).click();
    }

    public void setCreditDuration() {
        $(By.xpath("//*[@id=\"sticky-wrapper\"]/div[1]/div/div/div/div/div[2]/div/div/div/div")).click();
        String creditPeriodExpression = "//*[@id=\"sticky-wrapper\"]/div[1]/div/div/div/div/div[2]/div/span/div/div/div[2]";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(creditPeriodExpression)));
        $(By.xpath(creditPeriodExpression)).click();
    }

    public void setCreditCategory() {
        $(By.xpath("//*[@id=\"sticky-wrapper\"]/div[1]/div/div/div/div/div[3]/div/div/div/div")).click();
        String creditPurposeExpression = "//*[@id=\"sticky-wrapper\"]/div[1]/div/div/div/div/div[3]/div/span/div/div/div[3]";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(creditPurposeExpression)));
        $(By.xpath(creditPurposeExpression)).click();
    }

    public Credit chooseRandomOffer() {
        List<WebElement> offers = $$(By.xpath("//*[@id='sticky-wrapper']/div[3]/div/div/div[*]/div[1]/div[1]/div[6]/a/button"));
        Random random = new Random();
        offers.get(random.nextInt(offers.size())).click();
        return new Credit(driver);
    }

    public Login loginWithIncorrectCreds(String email, String password) {
        $(By.xpath("//*[@id=\"root\"]/div/div/header/div/div/div[2]/nav/div[2]/div/span")).click();
        $(By.xpath("//*[@id=\"root\"]/div/div/header/div/div/div[2]/nav/div[2]/section/div/form/div[1]/div/input")).sendKeys(email);
        $(By.xpath("//*[@id=\"root\"]/div/div/header/div/div/div[2]/nav/div[2]/section/div/form/div[2]/div/input")).sendKeys(password);
        $(By.xpath("//*[@id=\"root\"]/div/div/header/div/div/div[2]/nav/div[2]/section/div/form/button")).click();
        return new Login(driver);
    }
}