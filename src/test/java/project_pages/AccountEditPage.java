package project_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountEditPage {
    WebDriver driver;
    public AccountEditPage(WebDriver x) { driver = x; }

    public WebElement MyAccountMenu() { return driver.findElements(By.className("dropdown")).get(0); }
    public WebElement LoginLink() { return driver.findElement(By.linkText("Login")); }
    public WebElement EmailInput() { return driver.findElement(By.id("input-email")); }
    public WebElement PasswordInput() { return driver.findElement(By.id("input-password")); }
    public WebElement SubmitLogin() { return driver.findElement(By.xpath("//input[@value='Login']")); }
    public WebElement EditAccountLink() { return driver.findElement(By.linkText("Edit Account")); }
    public WebElement FirstName() { return driver.findElement(By.id("input-firstname")); }
    public WebElement LastName() { return driver.findElement(By.id("input-lastname")); }
    public WebElement ContinueButton() { return driver.findElement(By.xpath("//input[@value='Continue']")); }
    public String SuccessMessage() { return driver.findElement(By.xpath("//div[contains(@class,'alert-success')]")).getText(); }

}
