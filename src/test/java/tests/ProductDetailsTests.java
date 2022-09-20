package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class ProductDetailsTests extends BaseTests{
NavigateBarPage navigateBarPage;
HomePage homePage;

@BeforeMethod
    public void loginToApp() {
        navigateBarPage = new NavigateBarPage(driver);
    LoginPage loginPage = navigateBarPage.clickLoginFromNavBar();
    homePage= loginPage.loginToApp("abxy@gmail.com", "123456");

    }
@Test
    public void testProductsDetails() {
    ProductsDetailsPage productsDetailsPage = navigateBarPage.clickProductsFromNavBar();
    String productToSearchFor = "Tops" ;
  SearchedProductionPage searchedProductionPage = productsDetailsPage.productType(productToSearchFor);
    Assert.assertEquals(searchedProductionPage.getFeaturedItemDisplay(),"SEARCHED PRODUCTS" );
    Assert.assertTrue(searchedProductionPage.isFeaturedItemDisplay());
    Assert.assertFalse(searchedProductionPage.isKeywordInProductTitle());
    }
}


