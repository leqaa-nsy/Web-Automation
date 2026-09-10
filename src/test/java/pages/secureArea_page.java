package pages;

//import org.graalvm.compiler.graph.Node;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class secureArea_page {
    //declare webdriver
    WebDriver driver;

    // create constructor
    public secureArea_page(WebDriver driver) {
        this.driver = driver;
    }

    //validate method Assertion
    public void validate_login_successfully(){
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(driver.findElement(By.id("flash")).isDisplayed());
        soft.assertTrue(driver.findElement(By.className("subheader")).isDisplayed());
        soft.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/secure");
        soft.assertTrue(driver.findElement(By.id("flash")).getText().contains("You logged into a secure area!"));
        soft.assertTrue(driver.findElement(By.id("flash")).getCssValue("background-color").contains("93, 164, 35"));

        //log method
        soft.assertAll();
    }
    public void validate_login_username_fail(){
        Assert.assertTrue(driver.findElement(By.className("error")).isDisplayed());
        Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/login");

    }
    public void validate_login_password_fail(){
        Assert.assertTrue(driver.findElement(By.className("error")).isDisplayed());
        Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/login");
    }
}
