package project_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import project_pages.GridListViewPage;

public class GridListViewTest {
    static WebDriver drivers;
    static GridListViewPage view;

    @BeforeMethod
    public static void openbrowser() {
        drivers = new ChromeDriver();
        drivers.manage().window().maximize();
        drivers.navigate().to("https://awesomeqa.com/ui/index.php?route=product/category&path=20");
        view = new GridListViewPage(drivers);
    }

    @Test(priority = 0)
    public static void switchToListView() {
        view.ListViewButton().click();
        Assert.assertTrue(view.isListViewActive());
    }

    @Test(priority = 1)
    public static void switchToGridView() {
        view.ListViewButton().click();
        view.GridViewButton().click();
        Assert.assertTrue(view.isGridViewActive());
    }

    @AfterMethod
    public void closebrowser() {
        drivers.quit();
    }
}
