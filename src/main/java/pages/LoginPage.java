package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By usernamefieldBy = By.id("user-name");

    By passwordfieldBy = By.id("password");

    By loginButtonBy = By.id("login-button");

    public void performLogin(String username, String password) {
        writeText(usernamefieldBy, username);
        writeText(passwordfieldBy, password);
        clickElement(loginButtonBy);
    }

}
