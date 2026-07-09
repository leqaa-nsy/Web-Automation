package project_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyQuantity {
    WebDriver driver;
   public VerifyQuantity (WebDriver x){driver =x;}
   public WebElement item(){return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div/div[1]/a/img"));}
    public WebElement Quantity (){return driver.findElement(By.id("input-quantity"));}
    public WebElement AddToCart(){return driver.findElement(By.id("button-cart"));}
    public WebElement Cart(){return driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[4]/a/span"));}
    public WebElement CartQuantity(){return driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/form/div/table/tbody/tr/td[4]/div/input"));}
}
