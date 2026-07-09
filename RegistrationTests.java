package project_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import project_pages.Registrationpage;

public class RegistrationTests {
    static WebDriver drivers;
    static Registrationpage regist ;
    @BeforeMethod
    public static void openbrowser(){
        drivers=new ChromeDriver();
        drivers.manage().window().maximize();
        drivers.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        regist = new Registrationpage(drivers);
    }
    @Test (priority = 0)
    public static void validRegistration() throws InterruptedException {
    regist.My_account().click();
    regist.Register().click();
    regist.First_Name().sendKeys("team");
    regist.Last_Name().sendKeys("1st");
    regist.EMail().sendKeys("user" + System.currentTimeMillis() +"@gmail.com");
    regist.Telephone().sendKeys("01210949358");
    regist.Password().sendKeys("teamworkwin");
    regist.Password_Confirm().sendKeys("teamworkwin");
    regist.Subscribe().click();
    regist.Privacy_Policy().click();
    regist.Continue().click();
    Assert.assertTrue(drivers.findElement(By.xpath("/html/body/div[2]/div/div/h1")).getText().contains("Your Account Has Been Created!"));
        Thread.sleep(3000);
    }
    @Test (priority =1)
    public static void invalidRegistration() throws InterruptedException {
        regist.My_account().click();
        regist.Register().click();
        regist.First_Name().sendKeys("team");
        regist.Last_Name().sendKeys("1st");
        regist.EMail().sendKeys("ha45y@gmail.com");
        regist.Telephone().sendKeys("01210949358");
        regist.Password().sendKeys("teamworkwin");
        regist.Password_Confirm().sendKeys("teamworkwin");
        regist.Subscribe().click();
        regist.Privacy_Policy().click();
        regist.Continue().click();
        Assert.assertFalse(drivers.findElement(By.xpath("/html/body/div[2]/div/div/h1")).getText().contains("Your Account Has Been Created!"));
        Thread.sleep(3000);
    }
    @AfterMethod
    public void postconditions() throws InterruptedException {
        Thread.sleep(2000);
        drivers.manage().deleteAllCookies();
        drivers.quit();
    }
}
