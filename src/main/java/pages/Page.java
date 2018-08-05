package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Page {

    WebDriver driver;
    private WebDriverWait wait;

    public Page() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 30);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    protected void open(String url) {
        driver.get(url);
    }


    protected WebElement $(String xpath, String... args) {
        return driver.findElement(By.xpath(String.format(xpath, args)));
    }


    protected List<WebElement> $$(By by) {
        return driver.findElements(by);
    }

    protected WebElement $(By by) {
        return driver.findElement(by);
    }
}
