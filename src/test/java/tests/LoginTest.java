package tests;

import core.SelenideSetup;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.UserDetailPage;

public class LoginTest extends SelenideSetup {
    private WebDriver driver;

    private final UserDetailPage userDetailPage = new UserDetailPage();

    @Test
    public void checkIfUsernameIsCorrect() {
        userDetailPage.navigateTo();
        userDetailPage.assertUsernameIsCorrect("fox");
    }
}
