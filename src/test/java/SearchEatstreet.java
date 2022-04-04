import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchEatstreet {

    WebDriver driver;

    @BeforeMethod
    public void beforeMyTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void afterMyTest(){
//        driver.quit();
    }

//    this test is for check search engine on eatsstreet website
    @Test
    public void searchMadison(){
        driver.get("https://qa2.eatstreet.com");
        driver.findElement(By.xpath("//input[@id='input-food-search']")).sendKeys("Madison\n");
        driver.findElement(By.xpath("//a[@id='enter-address-btn']")).click();
        driver.findElement(By.xpath("//a[@id='find-restaurants']")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertTrue(driver.findElement(By.xpath("//h1")).getText().contains("Madison"));
    }
}
