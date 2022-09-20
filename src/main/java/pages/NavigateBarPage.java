package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.security.Key;

public class NavigateBarPage extends BasePage {

    public NavigateBarPage(WebDriver driver) {

        super(driver);
    }

    By loginFromNavBar = By.xpath(("//ul[@class=\"nav navbar-nav\"]/li[4]/a"));
    By productsKey = By.xpath(("//ul[@class=\"nav navbar-nav\"]/li[2]/a"));


    public LoginPage clickLoginFromNavBar() {

        clickElement(loginFromNavBar);

        return new LoginPage(driver);
    }

    public ProductsDetailsPage clickProductsFromNavBar() {

        clickElement(productsKey);

        return new ProductsDetailsPage(driver);
    }
}
