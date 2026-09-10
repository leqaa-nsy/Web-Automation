package project_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
    WebDriver driver;
    public Loginpage(WebDriver x){driver =x;}
    public WebElement My_account(){return driver.findElements(By.className("dropdown")).get(0);}
    public WebElement Login(){return driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/a"));}
    public WebElement Email(){return driver.findElement(By.id("input-email"));}
    public WebElement Password(){return driver.findElement(By.id("input-password"));}
    public WebElement Submit(){return driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input"));}

}
