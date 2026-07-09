package project_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import project_pages.SelectCategory;

import java.time.Duration;

public class SelectCategoryTest {
    static WebDriver drivers;
    static WebDriverWait wait;
    static SelectCategory category;

    @BeforeMethod
    public static void openbrowser() {
        drivers = new ChromeDriver();
        wait = new WebDriverWait(drivers, Duration.ofSeconds(10));
        drivers.manage().window().maximize();
        drivers.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        category = new SelectCategory(drivers);
    }

    @Test(priority = 0)
    public static void selectSubCategory() {
        Actions actions = new Actions(drivers);
        actions.moveToElement(category.DesktopsMenu()).perform();
        category.DesktopsSubMac().click();
        wait.until(ExpectedConditions.urlContains("path=20_27"));
        Assert.assertTrue(drivers.getCurrentUrl().contains("path=20_27"));
    }

    @Test(priority = 1)
    public static void selectAnotherSubCategory() {
        Actions actions = new Actions(drivers);
        actions.moveToElement(category.LaptopsMenu()).perform();
        category.LaptopsSubWindows().click();
        wait.until(ExpectedConditions.urlContains("path=18_45"));
        Assert.assertTrue(drivers.getCurrentUrl().contains("path=18_45"));
    }

    @AfterMethod
    public void closebrowser() {
        drivers.quit();
    }
}
