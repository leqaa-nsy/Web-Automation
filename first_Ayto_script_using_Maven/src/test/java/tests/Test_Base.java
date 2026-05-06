package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.login_page;
import pages.secureArea_page;

import java.time.Duration;

public class Test_Base {
    WebDriver driver;
    login_page loginpage;
    secureArea_page secureAreaPage;
    @BeforeMethod
    public void OpenBrowser() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
       // loginpage =new login_page(driver); ??????????????????????????????????????????????????????
      // secureArea_page =new secureAreaPage(driver);  ???????????????????????????????????????????????
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//بستني وقت معين علشان اعمل اكشن (بتحدد وقت معين للمتصفح يستناه قبل ما يرمي)    المزامنه العامه  Implicit wait
        driver.navigate().to("https://the-internet.herokuapp.com/login");
    }
    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }
}
