package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.beans.Visibility;
import java.time.Duration;

public class login_page {
    WebDriver driver;
    //Constructor


    public login_page(WebDriver driver) {
        this.driver = driver;
    }






    //first type

    public WebElement locate_username() {
      return  driver.findElement(By.id("username"));
    }
    public WebElement locate_password() {
        return  driver.findElement(By.id("password"));
    }
    public WebElement locate_login_button() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));     //بستني حاجه معينه تظهر زي الزرار او كدا علشان اعمل اكشن(استنى لحد ما الشرط ده يتحقق" (مثلاً الزرار يبقى Clickable))     المزامنه المشروطه   Explicit wait
        WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("radius")));
//        // 1. ظبط الانتظار لحد أقصى 10 ثواني
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//// 2. أمر "الانتظار الذكي"
//// الكود هنا هيقف، بس أول ما الـ URL يوصل للشكل ده، هيتحرك فوراً للسطر اللي بعده
//        wait.until(ExpectedConditions.urlToBe("https://awesomeqa.com/ui/index.php?route=account/account"));
//
//// 3. السطر ده هيتنفذ فوراً بعد ما الـ wait يخلص (حتى لو بعد 0.1 ثانية)
//        soft.assertEquals(driver.getCurrentUrl(), "https://awesomeqa.com/ui/index.php?route=account/account");



        return  driver.findElement(By.className("radius"));
    }


//second type
  /* public void enter_username() {
        driver.findElement(By.id("username")).sendKeys("tommith");
   }
    public void enter_password() {
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
    }
    public void click_on_login_button() {
        driver.findElement(By.className("radius")).click();
    }  */

// third type using parameter

    public void enter_username(String username) {
        driver.findElement(By.id("username")).sendKeys(username);
    }
    public void enter_password(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }
    public void click_on_login_button() {
        driver.findElement(By.className("radius")).click();
    }









}
