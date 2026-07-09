package project_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import project_pages.SearchPage;

public class SearchTest {
    static WebDriver drivers;
    static SearchPage search;

    @BeforeMethod
    public static void openbrowser() {
        drivers = new ChromeDriver();
        drivers.manage().window().maximize();
        drivers.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        search = new SearchPage(drivers);
    }

    @Test
    public static void emptySearchShowsMessage() {
        search.SearchButton().click();
        Assert.assertFalse(search.NoResultMessage().isEmpty());
    }

    @AfterMethod
    public void closebrowser() {
        drivers.quit();
    }
}
