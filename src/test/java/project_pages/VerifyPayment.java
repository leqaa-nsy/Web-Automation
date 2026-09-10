package project_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyPayment {
    WebDriver driver;
    public VerifyPayment (WebDriver x){driver =x;}
   public WebElement Item1(){return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div/div[3]/button[1]"));}
    public WebElement Item2(){return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div[3]/button[1]"));}
    public WebElement item1(){return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div/div[1]/a/img"));}
    public WebElement item2(){return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div[1]/a/img"));}
    public WebElement Home(){return driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/a/img"));}
    public String GetPriceItem1(){return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/ul[2]/li[1]/h2")).getText(); }
    public String GetPriceItem2(){return driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/ul[2]/li[1]/h2")).getText(); }
    public WebElement Cart(){return driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[4]/a/span"));}
    public String TotalPrice(){return driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/table/tbody/tr[4]/td[2]")).getText();}

}
