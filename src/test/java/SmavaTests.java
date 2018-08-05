import org.junit.*;
import pages.Credit;
import pages.Home;
import pages.Login;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class SmavaTests {

    private static Home home;

    @BeforeClass
    public static void prepare() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver.exe");
        home = new Home();
        home.open();
    }

    @Test
    public void creditPageShouldBeLoaded() {
        home.setCreditAmount();
        home.setCreditDuration();
        home.setCreditCategory();
        Credit credit = home.chooseRandomOffer();
        assertThat("Progress Bar Isn't Loaded", credit.isProgressBarLoaded(), equalTo(true));
        assertThat("Progress Bar Has Incorrect Progress", credit.isProgressBarHasCorrectProgress(), equalTo(true));
        assertThat("Credit Category Isn't Loaded", credit.isCreditCategoryLoaded(), equalTo(true));
        assertThat("Credit Amount Isn't Loaded", credit.isCreditAmountLoaded(), equalTo(true));
        assertThat("Credit Duration Isn't Loaded", credit.isCreditDurationLoaded(), equalTo(true));
    }

    @Test
    public void loginErrorShouldBeDisplayedIfCredsAreIncorrect() {
        String email = "sdafdf@i.ua";
        String password = "12345678";
        Login login = home.loginWithIncorrectCreds(email, password);
        login.fillInCredentials(email,password);
        assertThat(login.isErrorMessageDisplayed(), equalTo(true));
    }
}