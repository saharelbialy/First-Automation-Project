package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.util.List;

public class AddToCartPage extends BasePage {

    public AddToCartPage(WebDriver driver) {

        super(driver);
    }

   By addToCartKey = By.xpath("(//i[@class=\"fa fa-shopping-cart\"])[2]");

            By itemAddedTOCart = By.xpath(("//h4[text()='Added!']"));
            By continueShoppingKey = By.className("btn-block");
    By secondItemAddedTOCart = By.xpath(("(//i[@class=\"fa fa-shopping-cart\"])[4]"));
    By viewCartKey = By.xpath(" //p[@class=\"text-center\"]//u");



        public void clickOnAddToCart() {

            JavascriptExecutor js = (JavascriptExecutor) driver;
            driver.get("https://www.automationexercise.com/products");
            WebElement Element = driver.findElement(By.linkText("Add to cart"));
            js.executeScript("arguments[0].scrollIntoView();", Element);
           clickElement(addToCartKey);
        }


   public String itemAdded ()
    {
        return getTextOfWebElement(itemAddedTOCart);
    }
    public AddToCartPage continueShopping()
    {
        clickElement(continueShoppingKey);
        return new AddToCartPage(driver);
    }
public void addSecondItemToCart(){

    clickElement(secondItemAddedTOCart);

}
    public ShoppingCartPage clickViewCartButton(){

            clickElement(viewCartKey);
        return new ShoppingCartPage(driver);
    }
}
