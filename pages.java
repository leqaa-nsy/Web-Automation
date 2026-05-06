package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pages {
    WebDriver driver;
    public pages(WebDriver x){
        driver =x;
    }
    public WebElement username(){
       return driver.findElement(By.id("username"));
    }
    public WebElement password(){
       return  driver.findElement(By.id("password"));
    }
    public WebElement loginbutt(){
       return driver.findElements(By.className("radius")).getFirst();
    }
    public void enterusername (String x){
        driver.findElement(By.id("username")).sendKeys(x);
    }
    public void enterusername (){
        driver.findElement(By.id("username")).sendKeys("tomsmith");
    }
    public void enterpassword (String x){
        driver.findElement(By.id("password")).sendKeys(x);
    }
    public void enterpassword (){
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
    }
    public void loginbutton (){
        driver.findElements(By.className("radius")).get(0).click();
    }

}
