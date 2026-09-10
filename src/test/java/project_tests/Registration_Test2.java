package project_tests;

import project_pages.Registration_Page2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Registration_Test2 {
    WebDriver driver;

    Registration_Page2 registrationPage;


    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        registrationPage =new Registration_Page2(driver);
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=account/register");
        registrationPage.Login().click();
        registrationPage.LocateEmail().sendKeys("eslam.farag.work@gmail.com");
        registrationPage.LocatePass().sendKeys("1234");
        registrationPage.LocateLoginBTN().click();
    }
@Test
public void Register () {

    registrationPage.Logout().click();
    registrationPage.Register().click();
    registrationPage.FristName().sendKeys("Eslam");
    registrationPage.LastName().sendKeys("Farag");
    registrationPage.Email().sendKeys("eslam.farag.work@gmail.com");
    registrationPage.Phone().sendKeys("01222847528");
    registrationPage.passWord().sendKeys("1234");
    registrationPage.ConfirmPass().sendKeys("1234");
    registrationPage.Privacy().click();
    registrationPage.Continue().click();
    Assert.assertTrue(driver.findElement(By.xpath(" //*[@id=\"account-register\"]/div[1]")).isDisplayed());
}
    @AfterMethod
    public void Postcondition() throws InterruptedException {
        Thread.sleep(2000);
        driver.manage().deleteAllCookies();
        driver.quit();
    }



}