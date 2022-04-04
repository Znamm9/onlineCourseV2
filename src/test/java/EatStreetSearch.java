import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;


public class EatStreetSearch extends TestInit{

    @Test
    public void searchMadison(){
        driver.get("https://qa2.eatstreet.com/");
        getElementByXpath("//input[@id='input-food-search']").sendKeys("Madison, WI\n");
        getElementByXpath("//a[@id='enter-address-btn']").click();
        getElementByXpath("//a[@id='find-restaurants']").click();

        waitTillElementContainsText("//h1", "Madison");

        Assert.assertTrue(getElementByXpath("//h1").getText().contains("Madison"));
        Assert.assertTrue(getElementByXpath("//input[@id='filters-checkbox-delivery']").isDisplayed());
        Assert.assertTrue(getElementByXpath("//input[@id='filters-checkbox-takeout']").isDisplayed());
        Assert.assertTrue(getElementByXpath("//input[@id='filter-Free Delivery']/..").isDisplayed());
        Assert.assertTrue(getElementByXpath("//input[@id='filter-Rating 4+']/..").isDisplayed());
        Assert.assertTrue(getElementByXpath("//input[@id='filter-Order Ahead']/..").isDisplayed());
        Assert.assertTrue(getElementByXpath("//input[@id='filter-Specials']/..").isDisplayed());
    }
}
