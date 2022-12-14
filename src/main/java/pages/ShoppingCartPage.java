package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends BasePage{
    public ShoppingCartPage(WebDriver driver) {

        super(driver);
    }
    By allCartRows = By.xpath("//tr[contains(@id,'product-')]");

    By firstProductPrice = By.xpath("//tr[@id=\"product-1\"]/td[@class=\"cart_price\"]") ;
    By firstProductQuantity = By.xpath("//button[@class=\"disabled\"][1]");
    By firstProductTotal = By.xpath("(//p[@class=\"cart_total_price\"])[1]");
    By secondProductPrice = By.xpath("//tr[@id=\"product-2\"]/td[@class=\"cart_price\"]") ;
    By secondProductQuantity = By.xpath("//button[@class=\"disabled\"][1]");
    By secondProductTotal = By.xpath("(//p[@class=\"cart_total_price\"])[2]");
    public int getSizeOfAddedProducts ()
    {
        return locateListOfElements(allCartRows).size();
    }
    public String getFirstProductPrice ()
    {
        return getTextOfWebElement(firstProductPrice) ;
    }
    public String getFirstProductQuantity ()
    {
        return getTextOfWebElement(firstProductQuantity) ;
    }
    public String getFirstProductTotal ()
    {
        return getTextOfWebElement(firstProductTotal) ;
    }
    public String getSecondProductPrice ()
    {
        return getTextOfWebElement(secondProductPrice) ;
    }
    public String getSecondProductQuantity () {return getTextOfWebElement(secondProductQuantity) ;}
    public String getSecondProductTotal ()
    {
        return getTextOfWebElement(secondProductTotal) ;
    }

}
