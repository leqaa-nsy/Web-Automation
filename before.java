package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class before
{

   protected static WebDriver driver;
    protected static pages login;
    protected static saccesslogin saccess;
    @BeforeMethod
    public static void openbrowser(){
    driver=new ChromeDriver();
    login =new pages(driver);
    saccess =new saccesslogin(driver);
}
    @AfterMethod
    public static void closebrowser(){
        driver.quit();
    }
}
