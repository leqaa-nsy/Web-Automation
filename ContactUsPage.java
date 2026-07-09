package project_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPage {
    WebDriver driver;
    public ContactUsPage(WebDriver x) { driver = x; }

    public WebElement ContactUsFooterLink() { return driver.findElement(By.xpath("//footer//a[contains(text(),'Contact Us')]")); }
    public String PageHeading() { return driver.findElement(By.tagName("h1")).getText(); }
}
