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
    public WebElement locate_username() {
      return  driver.findElement(By.id("username"));
    }
    public WebElement locate_password() {
        return  driver.findElement(By.id("password"));
    }
    public WebElement locate_login_button() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));     //بستني حاجه معينه تظهر زي الزرار او كدا علشان اعمل اكشن(استنى لحد ما الشرط ده يتحقق" (مثلاً الزرار يبقى Clickable))     المزامنه المشروطه   Explicit wait
        WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("radius")));
        return  driver.findElement(By.className("radius"));
    }
}
