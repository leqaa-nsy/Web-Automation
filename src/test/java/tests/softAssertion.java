package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class softAssertion {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();

        //Hard Assertion
//        Assert.assertTrue(driver.findElement(By.id("flash")).isDisplayed());
//        Assert.assertTrue(driver.findElement(By.className("subheader")).isDisplayed());
//        Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/secure");

      //Soft Assertion
      SoftAssert soft = new SoftAssert();
        soft.assertTrue(driver.findElement(By.id("flash")).isDisplayed());
       soft.assertTrue(driver.findElement(By.className("subheader")).isDisplayed());
        soft.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/secure");

 driver.close();

        driver.manage().window().maximize();
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmit");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();

        driver.manage().window().maximize();
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();


        //log method
        soft.assertAll();
    }
}
