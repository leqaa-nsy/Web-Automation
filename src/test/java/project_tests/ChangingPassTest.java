package project_tests;

import org.openqa.selenium.WebElement;
import project_pages.ChangingPasswordPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ChangingPassTest {
    WebDriver driver;
    ChangingPasswordPage changingpass ;


    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        changingpass = new ChangingPasswordPage(driver);
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=account/register");
        changingpass .Login().click();
        changingpass.LocateEmail().sendKeys("aya007610@gmail.com");
        changingpass.LocatePass().sendKeys("1234");
        changingpass.LocateLoginBTN().click();
    }
    @Test (priority = 1)
    public void changingpass (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"content\"]/ul[1]/li[2]/a")));
        link.click();
        changingpass.changingpasslink1().click();
        changingpass.Password().sendKeys("1234");
        changingpass.confirmPassword().sendKeys("1234");
        changingpass.locatecontinueBTN().click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("route=account/account"));
       Assert.assertTrue(driver.getCurrentUrl().contains("https://awesomeqa.com/ui/index.php?route=account/account"));
    }
    @Test (priority = 2)
    public void changinginvalidpass (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='content']/ul[1]/li[2]/a")));
        changingpass.changingpasslink2();
        changingpass.Password().sendKeys("1234");
        changingpass.confirmPassword().sendKeys("12345");
        changingpass.locatecontinueBTN().click();
         wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("text-danger")));
        Assert.assertTrue(errorMessage.isDisplayed());
    }
    @AfterMethod
    public void Postcondition() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
