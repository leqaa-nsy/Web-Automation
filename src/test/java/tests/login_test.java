package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.login_page;
import pages.secureArea_page;

import java.time.Duration;
import java.time.Instant;

public class login_test extends Test_Base{
   WebDriver driver;
   login_page loginPage;
secureArea_page secureAreaPage;

   @BeforeMethod
   public void preconditions(){
      driver=new ChromeDriver();
     driver.manage().window().maximize();
     loginPage=new login_page(driver);
     secureAreaPage=new secureArea_page(driver);
      driver.navigate().to("https://the-internet.herokuapp.com/login");
   }


    @Test(priority = 1)
    public void valid_login() {
        loginPage.locate_username().sendKeys("tomsmith");
        loginPage.locate_password().sendKeys("SuperSecretPassword!");
        loginPage.locate_login_button().click();
        secureAreaPage.validate_login_successfully();


    }

    @Test (priority = 2)
    public void invalid_login_username() {
        loginPage.enter_username("tomsmith");
        loginPage.enter_password("SuperSecretPassword");
        loginPage.click_on_login_button();
       secureAreaPage.validate_login_username_fail();
    }

    @Test (priority = 3)
    public void invalid_login_password() {
        loginPage.enter_username("tomsmit");
        loginPage.enter_password("SuperSecretPassword!");
        loginPage.click_on_login_button();
       secureAreaPage.validate_login_password_fail();
    }



    @AfterMethod
    public void postconditions() throws InterruptedException {
    Thread.sleep(3000); //related to java & selenium
        driver.close();

    }


}
