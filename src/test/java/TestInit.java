import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestInit {
    WebDriver driver;

    @BeforeMethod
    public void beforeMyTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void afterMyTest() {
        driver.quit();
    }

    public void search(String googleWord, String searchUrl) {
        driver.get(searchUrl);
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(googleWord + "\n");
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void waitTillElementContainsText(String locator, String text) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(locator), text));
    }

    public WebElement getElementByXpath(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }

    @Test
    public void doit(){
        int[] a = {1,2,3,4,5,6,6,6,6,6,6,6};

        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(10);
        ints.add(100);
        ints.add(10000);
        ints.add(1123);

        List<String> strings = new ArrayList<>();
        strings.add("aaaaa");
        strings.add("bbbb");
        strings.add("cccc");
        strings.add("ffff");


        for (String elementInArray : strings){
            System.out.println(elementInArray);
        }
    }
}
