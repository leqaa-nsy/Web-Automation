package project_tests;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

import project_pages.Switch_Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Switch_Test {
    WebDriver driver;
    Switch_Page switchPage;
    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        switchPage = new Switch_Page(driver);
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=account/register");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        switchPage.Login().click();
        switchPage.LocateEmail().sendKeys("eslam.farag.work@gmail.com");
        switchPage.LocatePass().sendKeys("1234");
        switchPage.LocateLoginBTN().click();
    }
    @Test(priority = 1)
    public void SwitchCurrenciesTest() {
        Actions action = new Actions(driver);
        switchPage.CurrencyMenu().click();
        action.moveToElement(switchPage.CurrencyMenu()).perform();
        switchPage.ChoiceEuro().click();
        String euroText = driver.findElement(By.id("cart-total")).getText();
        Assert.assertTrue(euroText.contains("€"), "Currency didn't switch to Euro!");
        switchPage.CurrencyMenu().click();
        action.moveToElement(switchPage.CurrencyMenu()).perform();
        switchPage.ChoiceUS().click();
        String usText = driver.findElement(By.id("cart-total")).getText();
        Assert.assertTrue(usText.contains("$"), "Currency didn't switch to US Dollar!");
    }

    @AfterMethod
    public void Postcondition() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}