package project_tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import project_pages.EditInfoPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class EditInfoTest {
    WebDriver driver;
    EditInfoPage EditInfo ;


    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        EditInfo = new EditInfoPage(driver);
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=account/register");
        EditInfo .Login().click();
        EditInfo.LocateEmail().sendKeys("aya007610@gmail.com");
        EditInfo.LocatePass().sendKeys("1234");
        EditInfo.LocateLoginBTN().click();
    }
    @Test(priority = 1)
    public void changingpass (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(EditInfo.EditInfolink()));
        EditInfo.EditInfolink().click();
        EditInfo.FirstName().clear();
        EditInfo.FirstName().sendKeys("ayah");
        EditInfo.LastName().clear();
        EditInfo.LastName().sendKeys("abdelaziz");
        EditInfo.locatecontinueBTN().click();
         wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Assert.assertTrue(driver.getCurrentUrl().contains("https://awesomeqa.com/ui/index.php?route=account/account"));

    }
    @AfterMethod
    public void Postcondition() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
