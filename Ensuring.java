package project_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Ensuring {
    WebDriver driver;

    public Ensuring(WebDriver driver) {
        this.driver = driver;
    }

    public void validate_forgottenPassword_successfully(){
          SoftAssert soft = new SoftAssert();
          soft.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/ui/index.php?route=account/login");
          soft.assertAll();
    }

    public void validate_login_successfully(){
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/ui/index.php?route=account/account");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("https://awesomeqa.com/ui/index.php?route=account/account"));
        soft.assertEquals(driver.getCurrentUrl(), "https://awesomeqa.com/ui/index.php?route=account/account");
        soft.assertAll();
    }

    public void validate_search1_successfully(){
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[1]/h4/a")).isDisplayed());
        soft.assertAll();
    }

    public void validate_search2_successfully(){
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[1]/h4/a")).isDisplayed());
        soft.assertAll();
    }

    public void validate_search3_successfully(){
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/p[2]")).getText().contains("There is no product that matches the search criteria."));
        soft.assertAll();
    }


    //////

    public void validate_AddToWishList_or_AddToCart_or_compareThisProduct_successfully1(){
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(driver.findElement(By.xpath("//*[@id=\"product-category\"]/div[1]")).isDisplayed());
        soft.assertAll();
    }

    public void validate_AddToWishList_or_AddToCart_or_compareThisProduct_successfully2(){
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(driver.findElement(By.xpath("//*[@id=\"product-product\"]/div[1]")).isDisplayed());
        soft.assertAll();
    }

}