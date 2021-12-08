package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class UserDetailPage {
    private final SelenideElement usernameElement =  $("p");

    public void navigateTo(){
        open("http://localhost:4200/user-detail/1");
    }

    public void assertUsernameIsCorrect(String username){
        usernameElement.shouldHave(text(username));
    }
}
