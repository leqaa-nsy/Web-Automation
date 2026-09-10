package project_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditInfoPage {
    WebDriver driver;

    public EditInfoPage(WebDriver driver) {
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
public WebElement EditInfolink() {
    return driver.findElement(By.partialLinkText("Edit your account information"));
}
    public WebElement FirstName () {
        return driver.findElement(By.id("input-firstname"));
    }
    public WebElement LastName () {
        return driver.findElement(By.id("input-lastname"));
    }

    public WebElement Telephone () {
        return driver.findElement(By.id("input-telephone"));
    }
    public WebElement locatecontinueBTN () {
        return driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/input"));
    }
}
