package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Annotations {
    WebDriver driver;


@BeforeMethod
    public void preconditions(){
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.navigate().to("https://the-internet.herokuapp.com/login");
    }


@Test (priority = 1)
    public void valid_login() throws InterruptedException {
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
    Assert.assertTrue(driver.findElement(By.id("flash")).isDisplayed());
    Assert.assertTrue(driver.findElement(By.className("subheader")).isDisplayed());
    Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/secure");
Assert.assertTrue(driver.findElement(By.className("icon-lock")).isDisplayed());
Assert.assertTrue(driver.findElement(By.id("flash-messages")).isDisplayed());
    }

@Test (priority = 2)
    public void invalid_login_username() throws InterruptedException {
        driver.findElement(By.id("username")).sendKeys("tommith");//invalid username
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
Assert.assertTrue(driver.findElement(By.className("error")).isDisplayed());
    Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/login");


    }

@Test (priority = 3)
    public void invalid_login_password() throws InterruptedException {
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecetPassword!");//invalid password
        driver.findElement(By.className("radius")).click();
    Assert.assertTrue(driver.findElement(By.className("error")).isDisplayed());
    Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/secure");

    }


    @AfterMethod
    public void postconditions() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }




//capital then alphabetical then small them alphabetical
























//    @BeforeMethod
//   public void preconditions(){
//        System.out.println("Open Browser");
//    }
//
//
//
//@Test
//public void testcase(){     //Before method قبلها        &    After method  بعدها
//    System.out.println("Test");
//}
//
//    @Test
//    public void testcase1(){   //Before  method  قبلها   &    After method      بعدها
//        System.out.println("Test");
//    }
//
//
//
//@AfterMethod
//public void postconditions(){
//    System.out.println("Close Browser");
//}
//
////لو Before class & After class   يبقي Before class قبل كل التيستات و After class بعد كل التيستات
////لو Before test & After test يبقي Before test قبل كل الكلاسات لو فيه كذا كلاس و After test بعد كل الكلاسات
}
