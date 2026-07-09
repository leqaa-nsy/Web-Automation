package project_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import project_pages.AccountEditPage;

import java.time.Duration;

public class AccountEditTest {
    static WebDriver drivers;
    static WebDriverWait wait;
    static AccountEditPage account;

    @BeforeMethod
    public static void openbrowser() {
        drivers = new ChromeDriver();
        wait = new WebDriverWait(drivers, Duration.ofSeconds(10));
        drivers.manage().window().maximize();
        drivers.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        account = new AccountEditPage(drivers);
    }

    @Test
    public static void updatePersonalDetails() throws InterruptedException {
        account.MyAccountMenu().click();
        account.LoginLink().click();
        account.EmailInput().clear();
        account.EmailInput().sendKeys("ha45u@gmail.com");
        account.PasswordInput().clear();
        account.PasswordInput().sendKeys("teamworkwin");
        account.SubmitLogin().click();
        wait.until(ExpectedConditions.visibilityOf(account.EditAccountLink()));
        account.EditAccountLink().click();
        account.FirstName().clear();
        account.FirstName().sendKeys("UpdatedFirst");
        account.LastName().clear();
        account.LastName().sendKeys("UpdatedLast");
        account.ContinueButton().click();
//        Assert.assertTrue(account.SuccessMessage().contains("Success: Your account has been successfully updated."));
//        Thread.sleep(3000);
        // في كود الاختبار الخاص بك، استبدل السطر الذي يسبب المشكلة بـ:

        WebDriverWait wait = new WebDriverWait(drivers, Duration.ofSeconds(10));
        WebElement successElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'alert-success')]")));

        Assert.assertTrue(successElement.getText().contains("Success: Your account has been successfully updated."));
    }

    @AfterMethod
    public void closebrowser() {
        drivers.quit();
    }
}
