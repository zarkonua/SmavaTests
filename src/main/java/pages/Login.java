package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends ParentPage {

    public Login(WebDriver driver) {
        super(driver);
    }

    public boolean isErrorMessageDisplayed() {
        return $(By.xpath("//li[contains(text(), 'UserDetailsService returned null, which is an interface contract violation')]")).isDisplayed();
    }

    public void fillInCredentials(String email, String password) {
        $(By.xpath("//*[@id=\"signonForm.email\"]")).sendKeys(email);
        $(By.xpath("//*[@id=\"signonForm.password\"]")).sendKeys(password);
        $(By.xpath("//*[@id=\"loginform\"]/fieldset[2]/div/ul/li/input")).click();
    }
}