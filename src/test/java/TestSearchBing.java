import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestSearchBing extends TestInit {
    String searchEngine = "https://www.bing.com";


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

        List<String> words = new ArrayList<>();

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
