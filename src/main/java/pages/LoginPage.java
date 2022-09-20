package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{


    public LoginPage(WebDriver driver) {

        super(driver);
    }

    By emailField = By.xpath(("//div[@class=\"login-form\"]//input[2]"));
    By passwordField = By.xpath(("//input[@name='password']"));
    By loginBtn = By.xpath(("//div[@class=\"login-form\"]//button"));

    public HomePage loginToApp(String email, String password)
    {
        typeOnInputField(emailField, email);
        typeOnInputField(passwordField, password);
        clickElement(loginBtn);
        return new HomePage(driver);
    }
}
