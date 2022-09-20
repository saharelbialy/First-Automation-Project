package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.util.List;

public class AddToCartTests extends BaseTests {

    @Test
    public void addToCart() {

        AddToCartPage addToCartPage = new AddToCartPage(driver);
         addToCartPage.clickOnAddToCart();
       Assert.assertEquals(addToCartPage.itemAdded(),"Added!" );
       addToCartPage.continueShopping();
       addToCartPage.addSecondItemToCart();
        ShoppingCartPage shoppingCartPage = addToCartPage.clickViewCartButton();
      Assert.assertEquals(shoppingCartPage.getSizeOfAddedProducts(), 2, "The added products should be 2");
      Assert.assertEquals(shoppingCartPage.getFirstProductPrice(), "Rs. 500","The 1st products price Rs.500");
      Assert.assertEquals(shoppingCartPage.getFirstProductQuantity(), "1","The 1st product quantity is 1");
      Assert.assertEquals(shoppingCartPage.getFirstProductTotal(), "Rs. 500","The 1st product quantity is 1");
        Assert.assertEquals(shoppingCartPage.getSecondProductPrice(), "Rs. 400","The 2nd products price Rs.500");
        Assert.assertEquals(shoppingCartPage.getSecondProductQuantity(), "1","The 2nd product quantity is 1");
        Assert.assertEquals(shoppingCartPage.getSecondProductTotal(), "Rs. 400","The 2nd product quantity is 1");

    }

  }