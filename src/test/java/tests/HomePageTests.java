package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTests extends BaseTests{

    @Test
    public void testHomepageDisplay(){

    HomePage homePage = new HomePage(driver);
    Assert.assertEquals(homePage.getFeaturedItemDisplay(), "CATEGORY");
    Assert.assertTrue(homePage.isFeaturedItemDisplay());
}
}