package project_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GridListViewPage {
    WebDriver driver;
    public GridListViewPage(WebDriver x) { driver = x; }

    public WebElement ListViewButton() { return driver.findElement(By.id("list-view")); }
    public WebElement GridViewButton() { return driver.findElement(By.id("grid-view")); }
    public boolean isListViewActive() {
        return driver.findElement(By.id("list-view")).getAttribute("class").contains("active");
    }
    public boolean isGridViewActive() {
        return driver.findElement(By.id("grid-view")).getAttribute("class").contains("active");
    }
}
