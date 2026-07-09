package project_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registration_Page2 {
    WebDriver driver;

    public Registration_Page2(WebDriver driver) {
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
    public WebElement Logout() {
        return driver.findElement(By.linkText("Logout"));
    }
    public WebElement Register(){
        return driver.findElement(By.linkText("Register"));
    }
    public WebElement FristName(){
        return driver.findElement(By.id("input-firstname"));
    }
    public WebElement LastName(){
        return driver.findElement(By.id("input-lastname"));
    }
    public WebElement Email(){
        return driver.findElement(By.id("input-email"));
    }
    public WebElement Phone(){
        return driver.findElement(By.id("input-telephone"));
    }
    public WebElement passWord(){
        return driver.findElement(By.id("input-password"));
    }
    public WebElement ConfirmPass(){
        return driver.findElement(By.id("input-confirm"));
    }
    public WebElement Privacy(){
        return driver.findElement(By.name("agree"));
    }
    public WebElement Continue(){
        return driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));
    }


}
