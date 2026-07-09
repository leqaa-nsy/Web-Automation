package project_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectCategory {
    WebDriver driver;
    public SelectCategory(WebDriver x) { driver = x; }

    public WebElement DesktopsMenu() { return driver.findElement(By.linkText("Desktops")); }
    public WebElement DesktopsSubMac() { return driver.findElement(By.linkText("Mac (1)")); }
    public WebElement LaptopsMenu() { return driver.findElement(By.linkText("Laptops & Notebooks")); }
    public WebElement LaptopsSubWindows() { return driver.findElement(By.linkText("Windows (0)")); }
    public String CurrentUrl() { return driver.getCurrentUrl(); }
    public String SubPageHeading() { return driver.findElement(By.xpath("//div[@id='content']/h2")).getText(); }
}
