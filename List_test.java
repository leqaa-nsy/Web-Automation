package project_tests;
import project_pages.List_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class List_test {
    WebDriver driver;
    List_page listPage;


    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        listPage = new List_page(driver);
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=account/register");

        listPage.Login().click();
        listPage.LocateEmail().sendKeys("eslam.farag.work@gmail.com");
        listPage.LocatePass().sendKeys("1234");
        listPage.LocateLoginBTN().click();
    }
    @Test
    public void ToggleViewMode (){
        listPage.clickTabletsPar();
        listPage.clickListMode();
        Assert.assertTrue(driver.findElement(By.id("list-view")).isDisplayed());

        listPage.clickGridMode();
        Assert.assertTrue(driver.findElement(By.id("grid-view")).isDisplayed());

        listPage.clickListMode();
        Assert.assertTrue(driver.findElement(By.id("list-view")).isDisplayed());

    }
    @AfterMethod
    public void Postcondition() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}