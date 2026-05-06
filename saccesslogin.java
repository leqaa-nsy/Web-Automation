package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class saccesslogin {
    WebDriver driver;
    SoftAssert soft =new SoftAssert();
    public saccesslogin(WebDriver x){
        driver=x;
    }
    public void checklogin(){
        Assert.assertTrue(driver.findElement(By.id("flash")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("flash")).getText().contains(" You logged into a secure area! "));
    }
    public void softchecklogin(){
        soft.assertTrue(driver.findElement(By.id("flash")).isDisplayed());
        soft.assertTrue(driver.findElement(By.id("flash")).getText().contains(" You logged into a secure area! "));
    }
}
