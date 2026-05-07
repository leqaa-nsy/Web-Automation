package RegistrationTests;

import BeforAndAfter.BeforAndAfter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class RegistrationTests extends BeforAndAfter {
    @Test (priority = 0)
    public static void validRegistration() throws InterruptedException {
        driver.findElements(By.className("dropdown")).get(0).click();
        driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[1]/a")).click();
        driver.findElement(By.id("input-firstname")).sendKeys("team");
        driver.findElement(By.id("input-lastname")).sendKeys("1st");
        driver.findElement(By.id("input-email")).sendKeys("ha45y@gmail.com");
        driver.findElement(By.id("input-telephone")).sendKeys("01210949358");
        driver.findElement(By.id("input-password")).sendKeys("teamworkwin");
        driver.findElement(By.id("input-confirm")).sendKeys("teamworkwin");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[3]/div/div/label[2]/input")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[1]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]")).click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[2]/div/div/h1")).getText().contains("Your Account Has Been Created!"));
        Thread.sleep(3000);
    }
    @Test (priority = 1)
    public static void invalidRegistration() throws InterruptedException {
        driver.findElements(By.className("dropdown")).get(0).click();
        driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[1]/a")).click();
        driver.findElement(By.id("input-firstname")).sendKeys("team");
        driver.findElement(By.id("input-lastname")).sendKeys("1st");
        driver.findElement(By.id("input-email")).sendKeys("ha45u@gmail.com");
        driver.findElement(By.id("input-telephone")).sendKeys("01210949358");
        driver.findElement(By.id("input-password")).sendKeys("teamworkwin");
        driver.findElement(By.id("input-confirm")).sendKeys("teamworkwin");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[3]/div/div/label[2]/input")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[1]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]")).click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[2]/div/div/h1")).getText().contains("Your Account Has Been Created!"));
        Thread.sleep(3000);
    }
}
