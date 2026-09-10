package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_Login_TestCases {
    public void preconditions(){
    }


    WebDriver driver;
public void valid_login() throws InterruptedException {
     driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.navigate().to("https://the-internet.herokuapp.com/login");
    driver.findElement(By.id("username")).sendKeys("tomsmith");
    driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
    driver.findElement(By.className("radius")).click();
    Thread.sleep(3000);
    driver.close();


}


       public void invalid_login_username() throws InterruptedException {
           driver=new ChromeDriver();//   اتعرفت مره فمش هعرفه تاني
           driver.manage().window().maximize();
           driver.navigate().to("https://the-internet.herokuapp.com/login");
           driver.findElement(By.id("username")).sendKeys("tommith");//invalid username
           driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
           driver.findElement(By.className("radius")).click();
           Thread.sleep(3000);
           driver.close();


       }


public void invalid_login_password() throws InterruptedException {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.navigate().to("https://the-internet.herokuapp.com/login");
    driver.findElement(By.id("username")).sendKeys("tomsmith");
    driver.findElement(By.id("password")).sendKeys("SuperSecetPassword!");//invalid password
    driver.findElement(By.className("radius")).click();
    Thread.sleep(3000);
    driver.close();
}

//ان الويب شغال لكل البروزرز ;WebDiver driver
//اما لو حطيت كروم فلازم اعرف كل بروزر لوحده


public void postconditions(){

}





    }

