package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.NavigateBarPage;

public class LoginTests extends BaseTests {


    @Test
    public void alertTests() {

        NavigateBarPage navigateBarPage = new NavigateBarPage(driver);
        LoginPage loginPage = navigateBarPage.clickLoginFromNavBar();
        HomePage homepage = loginPage.loginToApp("abxy@gmail.com", "123456");
        Assert.assertEquals(homepage.getFeaturedItemDisplay(), "CATEGORY");
        Assert.assertTrue(homepage.isFeaturedItemDisplay());
    }

}