package project_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import project_pages.Loginpage;
import project_pages.Registrationpage;

import java.time.Duration;

public class LoginTeste {
    static WebDriver drivers;
    static WebDriverWait wait ;
    static Loginpage log ;
    @BeforeMethod
    public static void openbrowser(){
        drivers=new ChromeDriver();
        wait = new WebDriverWait(drivers, Duration.ofSeconds(10));
        drivers.manage().window().maximize();
        drivers.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        log = new Loginpage(drivers);
    }
    @Test (priority = 0)
    public static void validLogin() throws InterruptedException {
    log.My_account().click();
    log.Login().click();
    log.Email().sendKeys("ha45u@gmail.com");
    log.Password().sendKeys("teamworkwin");
    log.Submit().click();
        WebElement massage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/h2[1]")));
        Assert.assertTrue(massage.getText().contains("My Account"));
        Thread.sleep(3000);
    }
    @Test (priority = 1)
    public static void InvalidLogin () throws InterruptedException {
        log.My_account().click();
        log.Login().click();
        log.Email().sendKeys("ha45u@gmail.com");
        log.Password().sendKeys("WrongPassword");
        log.Submit().click();
        WebElement massage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[1]")));
        Assert.assertFalse(massage.getText().contains(" Warning: No match for E-Mail Address and/or Password."));
        Thread.sleep(3000);
    }
    @AfterMethod
    public void closebrowser(){
        drivers.manage().deleteAllCookies();
        drivers.quit();
    }
}
