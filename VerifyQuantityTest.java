package project_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import project_pages.Loginpage;
import project_pages.VerifyQuantity;

public class VerifyQuantityTest {
    static WebDriver drivers;
    static VerifyQuantity verify ;
    @BeforeMethod
    public static void openbrowser(){
        drivers=new ChromeDriver();
        drivers.manage().window().maximize();
        drivers.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        verify = new VerifyQuantity(drivers);
    }
    @Test
    public void CorrectQuantity() throws InterruptedException {
     verify.item().click();
     verify.Quantity().clear();
     verify.Quantity().sendKeys("2");
     verify.AddToCart().click();
     verify.Cart().click();
     Assert.assertEquals(verify.CartQuantity().getAttribute("value"),"2");
    }
    @AfterMethod
    public void closebrowser(){
        drivers.quit();
    }
}

