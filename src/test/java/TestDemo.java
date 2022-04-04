import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo {

    @Test
    public void doIt(){
        Assert.assertTrue(summ(5,10) == 15);
    }

    public int summ(int a, int b){
        return a + b;
    }

    @Test
    public void runBrowser(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://qa2.eatstreet.com/");
        driver.findElement(By.xpath("//a[@id='menu-signin']")).click();
        driver.findElement(By.xpath("//a[contains(@ui-sref, 'signup')]")).click();

        String username = "vadym" + System.currentTimeMillis() + "@gmail.com";

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("!@#qweQWE");
        driver.findElement(By.xpath("//input[@id='passwordAgain']")).sendKeys("!@#qweQWE");

        driver.findElement(By.xpath("//button[@id='signup']")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertTrue(driver.findElement(By.xpath("//a[@id='menu-my-account']")).isDisplayed());

        driver.quit();
    }
}
