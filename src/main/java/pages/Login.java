package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login extends ParentPage {

    public Login(WebDriver driver) {
        super(driver);
    }

    public WebElement getErrorMessage() {
        return $(By.xpath("//li[contains(text(), 'UserDetailsService returned null, which is an interface contract violation')]"));
    }

    public WebElement getEmailInput() {
        return $(By.xpath("//*[@id=\"signonForm.email\"]"));
    }

    public WebElement getPasswordInput() {
        return $(By.xpath("//*[@id=\"signonForm.password\"]"));
    }

    public WebElement getSubmitButton() {
        return $(By.xpath("//*[@id=\"loginform\"]/fieldset[2]/div/ul/li/input"));
    }
}