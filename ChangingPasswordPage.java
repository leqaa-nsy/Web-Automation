package project_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ChangingPasswordPage {
    WebDriver driver;

    public ChangingPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement Login() {
        return driver.findElement(By.cssSelector("#content > p > a"));
    }

    public WebElement LocateEmail() {
        return driver.findElement(By.id("input-email"));
    }

    public WebElement LocatePass() {
        return driver.findElement(By.id("input-password"));

    }
    public WebElement LocateLoginBTN() {
        return driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
    }
    public WebElement changingpasslink1 () {
        return driver.findElement(By.xpath("//a[contains(text(), 'Password')]"));
    }


    public void changingpasslink2() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='content']/ul[1]/li[2]/a"))).click();
    }


    public WebElement Password () {
        return driver.findElement(By.id("input-password"));
    }
    public WebElement confirmPassword () {
        return driver.findElement(By.id("input-confirm"));
    }
    public WebElement locatecontinueBTN () {
        return driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/input"));
    }
}
