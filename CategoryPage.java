package project_pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CategoryPage {
    WebDriver driver;

    public CategoryPage(WebDriver driver) {
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
    public void phonesPar() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]/a"))).click();
    }
    public WebElement SortByList (){
        return driver.findElement(By.id("input-sort"));
    }
    public void chooseFromDropList(String option) {
        Select sortSelect = new Select(SortByList());
        sortSelect.selectByVisibleText(option);
    }
    }
