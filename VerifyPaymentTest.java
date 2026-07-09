package project_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import project_pages.VerifyPayment;
import project_pages.VerifyQuantity;

public class VerifyPaymentTest {
    static WebDriver drivers;
    static VerifyPayment verify ;
    @BeforeMethod
    public static void openbrowser(){
        drivers=new ChromeDriver();
        drivers.manage().window().maximize();
        drivers.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        verify = new VerifyPayment(drivers);
    }
    @Test
        public void TotalPrice(){
        verify.Item1().click();
        verify.Item2().click();
        verify.item1().click();
       String Price1= verify.GetPriceItem1().substring(1);
       verify.Home().click();
       verify.item2().click();
       String Price2= verify.GetPriceItem2().substring(1);
       float CorrectValue=Float.parseFloat(Price1)+Float.parseFloat(Price2);
        verify.Cart().click();
        String TotalPrice= verify.TotalPrice().substring(1);
        float Total=Float.parseFloat(TotalPrice);
        Assert.assertEquals(Total,CorrectValue);
    }

    @AfterMethod
    public void closebrowser(){
        drivers.quit();
    }
}
