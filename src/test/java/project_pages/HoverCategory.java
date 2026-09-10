package project_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HoverCategory {
    WebDriver driver;
    public HoverCategory(WebDriver x) { driver = x; }

    public WebElement DesktopsMenu() { return driver.findElement(By.linkText("Desktops")); }
    public WebElement DesktopsSubMac() { return driver.findElement(By.linkText("Mac (1)")); }
    public WebElement LaptopsMenu() { return driver.findElement(By.linkText("Laptops & Notebooks")); }
    public WebElement LaptopsSubWindows() { return driver.findElement(By.linkText("Windows (0)")); }
    public WebElement DesktopsDropdown() { return driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/ul")); }
    public WebElement LaptopsDropdown() { return driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[2]/ul")); }
}
