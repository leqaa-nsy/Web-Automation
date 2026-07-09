package project_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class SoppingCartPage {
    WebDriver driver;

    public SoppingCartPage(WebDriver driver) {
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
    public WebElement shoppingcarticon () {
        return driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a"));
    }


}
