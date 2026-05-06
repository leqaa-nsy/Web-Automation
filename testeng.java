package pack1;

import org.testng.annotations.Test;
import pages.before;

public class testeng extends before {


    @Test (priority = 0)
    public static void validlogin(){
        driver.manage().window().maximize();
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        login.username().sendKeys("tomsmith");
        login.password().sendKeys("SuperSecretPassword!");
        login.loginbutt().click();
    }
    @Test (priority = 1)
    public static void invaliduserlogin(){
        driver.manage().window().maximize();
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        login.username().sendKeys("toms");
        login.password().sendKeys("SuperSecretPassword!");
        login.loginbutt().click();
    }
    @Test (priority = 2)
    public static void invalipasswordlogin() {
        driver.manage().window().maximize();
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        login.username().sendKeys("tomsmith");
        login.password().sendKeys("Super");
        login.loginbutt().click();
    }

}