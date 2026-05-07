package BeforAndAfter;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BeforAndAfter
{

    static WebDriver driver;
    @BeforeMethod
    public static void openbrowser(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://the-internet.herokuapp.com/login");
    }
    @AfterMethod
    public static void closebrowser(){
        driver.quit();
    }
}
