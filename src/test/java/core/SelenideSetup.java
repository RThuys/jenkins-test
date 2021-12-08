package core;

import com.codeborne.selenide.Configuration;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import pages.LoginPage;

public class SelenideSetup {
    private static final LoginPage loginPage = new LoginPage();

    @BeforeClass
    public static void beforeClass(){
        System.out.println("This is the global before class");
        Configuration.browser = "chrome";

        loginPage.navigateTo();
        loginPage.login();
    }

    @Before
    public void beforeEach(){
        System.out.println("This is the global before each");
    }

    @After
    public void afterEach(){
        System.out.println("This is the global after each");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("This is the global after class");
    }
}
