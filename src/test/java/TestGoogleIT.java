import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGoogleIT extends TestInit {
    String searchEngine = "https://www.google.com.ua/";

    @Test
    public void googleSomeWord() {
        String searchWord = "dogs";
        search(searchWord, searchEngine);

        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }

    @Test
    public void googleCats() {
        String searchWord = "dogs";
        search(searchWord, searchEngine);

        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }

    @Test
    public void googleStraus() {
        String searchWord = "horse";
        search(searchWord, searchEngine);

        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }

    @Test
    public void googleHorse() {
        String searchWord = "cats";
        search(searchWord, searchEngine);

        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }

}
