import org.junit.*;
import steps.CreditSteps;
import steps.HomeSteps;
import steps.LoginSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class SmavaTests extends UiTestBase {

    private static HomeSteps homeSteps;
    private static CreditSteps creditSteps;

    @Before
    public void prepare() throws InterruptedException {
        homeSteps = new HomeSteps(driver);
        creditSteps = new CreditSteps(driver);
    }

    @Test
    public void creditPageShouldBeLoaded() {
        homeSteps.open();
        homeSteps.setCreditAmount();
        homeSteps.setCreditDuration();
        homeSteps.setCreditCategory();
        CreditSteps creditSteps = homeSteps.chooseRandomOffer();
        assertThat("Progress Bar Isn't Loaded", creditSteps.isProgressBarLoaded(), equalTo(true));
        assertThat("Progress Bar Has Incorrect Progress", creditSteps.isProgressBarHasCorrectProgress(), equalTo(true));
        assertThat("Credit Category Isn't Loaded", creditSteps.isCreditCategoryLoaded(), equalTo(true));
        assertThat("Credit Amount Isn't Loaded", creditSteps.isCreditAmountLoaded(), equalTo(true));
        assertThat("Credit Duration Isn't Loaded", creditSteps.isCreditDurationLoaded(), equalTo(true));
    }

    @Test
    public void loginErrorShouldBeDisplayedIfCredsAreIncorrect() {
        homeSteps.open();
        String email = "sdafdf@i.ua";
        String password = "12345678";
        LoginSteps login = homeSteps.loginWithCreds(email, password);
        login.fillInCredentials(email, password);
        assertThat(login.isErrorMessageDisplayed(), equalTo(true));
    }
}