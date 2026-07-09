package project_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;


import org.openqa.selenium.WebElement;

public class List_page {
    WebDriver driver;

    public List_page(WebDriver driver) {
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
    public void clickListMode() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("#list-view > i")))
                .click();
    }

    public void clickGridMode() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("#grid-view")))
                .click();
    }

    public void clickTabletsPar() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(4) > a")))
                .click();
    }
}