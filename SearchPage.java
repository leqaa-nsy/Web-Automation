package project_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    WebDriver driver;
    public SearchPage(WebDriver x) { driver = x; }

    public WebElement SearchButton() { return driver.findElement(By.xpath("//div[@id='search']/span/button")); }
    public String NoResultMessage() { return driver.findElement(By.xpath("//div[@id='content']//p[contains(.,'no product')]")).getText(); }
}
