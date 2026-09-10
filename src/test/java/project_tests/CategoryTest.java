package project_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import project_pages.CategoryPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class CategoryTest {
    WebDriver driver;
    CategoryPage category;


    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        category = new CategoryPage(driver);
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=account/register");
        category.Login().click();
        category.LocateEmail().sendKeys("aya007610@gmail.com");
        category.LocatePass().sendKeys("1234");
        category.LocateLoginBTN().click();
    }
    @Test
    public void sortPrice (){
        category.phonesPar();
        category.SortByList().click();
        category.chooseFromDropList("Price (High > Low)");
        Assert.assertTrue(driver.getCurrentUrl().contains("https://awesomeqa.com/ui/index.php?route=product/category&path=24&sort=p.price&order=DESC"));

    }
    @AfterMethod
    public void Postcondition() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
