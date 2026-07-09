package project_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Switch_Page {
    WebDriver driver;

    public Switch_Page(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement Login(){
        return    driver.findElement(By.cssSelector("#content > p > a"));
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

//    public WebElement CurrencyMenu(){
//        return driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button/span"));
//    }
// قم بإضافة هذا في الـ Page Object class الخاص بك
public WebElement CurrencyMenu() {
    // تعريف الانتظار
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    // الانتظار حتى يصبح العنصر قابلاً للنقر ثم إرجاعه
    return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form-currency\"]/div/button/span")));
}

    public WebElement  ChoiceEuro(){
        return   driver.findElement(By.name("EUR"));
    }

    public WebElement ChoiceUS(){
        return    driver.findElement(By.name("USD"));
    }
    public WebElement DesktopsPar(){
        return    driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a"));
    }
    public WebElement Desktops_Mac() {
        return driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[2]/a"));
    }
    public WebElement TabletsPar(){
        return  driver.findElement(By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(4) > a"));
    }
    public WebElement Phones_PDAs(){
        return driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]/a"));
    }
    public WebElement getPageHeading() {
        return driver.findElement(By.xpath("//*[@id=\"content\"]/h2"));
    }
}