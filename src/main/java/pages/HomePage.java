package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{


    public HomePage(WebDriver driver) {

        super(driver);
    }
    By featuresItem = By.xpath(("//div[@class=\"left-sidebar\"]/h2"));

    public String getFeaturedItemDisplay ()
    {
      return getTextOfWebElement(featuresItem);
    }
    public boolean isFeaturedItemDisplay ()
    {

        return isElementDisplayedOnPage(featuresItem);
    }
}
