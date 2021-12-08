package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class LoginPage {
    public void navigateTo() {
        open("http://localhost:4200/login");
    }

    public void login() {
        $("#username").shouldBe(visible);

        $("#username").sendKeys("fox");
        $("#password").sendKeys("forest");
        $("#login-button").click();
        $("h1").shouldHave(text("RTs Magical Forest"));
    }
}
