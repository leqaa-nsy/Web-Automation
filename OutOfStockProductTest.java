package project_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import project_pages.OutOfStockProduct;
import project_pages.VerifyQuantity;

public class OutOfStockProductTest {
    static WebDriver drivers;
    static OutOfStockProduct verify ;
    @BeforeMethod
    public static void openbrowser(){
        drivers=new ChromeDriver();
        drivers.manage().window().maximize();
        drivers.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        verify = new OutOfStockProduct(drivers);
    }
    @Test
    public void OutOfStock() throws InterruptedException {
        verify.item().click();
        verify.AddToCart().click();
        verify.Cart().click();
        Assert.assertTrue(drivers.findElement(By.xpath("/html/body/div[2]/div[1]")).getText().contains("Products marked with *** are not available in the desired quantity or not in stock!"));
    }
    @AfterMethod
    public void closebrowser(){
        drivers.quit();
    }
}
