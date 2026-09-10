package project_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import project_pages.HoverCategory;

public class HoverCategoryTest {
    static WebDriver drivers;
    static HoverCategory hover;

    @BeforeMethod
    public static void openbrowser() {
        drivers = new ChromeDriver();
        drivers.manage().window().maximize();
        drivers.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        hover = new HoverCategory(drivers);
    }

    @Test(priority = 0)
    public static void hoverMainCategory() {
        Actions actions = new Actions(drivers);
        actions.moveToElement(hover.DesktopsMenu()).perform();
        Assert.assertTrue(hover.DesktopsSubMac().isDisplayed());
    }

    @Test(priority = 1)
    public static void hoverSubCategory() {
        Actions actions = new Actions(drivers);
        actions.moveToElement(hover.DesktopsMenu()).perform();
        actions.moveToElement(hover.DesktopsSubMac()).perform();
        Assert.assertTrue(hover.DesktopsSubMac().isDisplayed());
    }

    @Test(priority = 2)
    public static void hoverAnotherMainCategory() {
        Actions actions = new Actions(drivers);
        actions.moveToElement(hover.LaptopsMenu()).perform();
        Assert.assertTrue(hover.LaptopsSubWindows().isDisplayed());
    }

    @Test(priority = 3)
    public static void hoverAnotherSubCategory() {
        Actions actions = new Actions(drivers);
        actions.moveToElement(hover.LaptopsMenu()).perform();
        actions.moveToElement(hover.LaptopsSubWindows()).perform();
        Assert.assertTrue(hover.LaptopsSubWindows().isDisplayed());
    }

    @AfterMethod
    public void closebrowser() {
        drivers.quit();
    }
}
