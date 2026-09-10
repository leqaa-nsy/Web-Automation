package project_tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import project_pages.SoppingCartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class ShoppingCartTest {
    WebDriver driver;
    SoppingCartPage shoppingcart ;


    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        shoppingcart = new SoppingCartPage(driver);
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=account/register");
        shoppingcart .Login().click();
        shoppingcart.LocateEmail().sendKeys("aya007610@gmail.com");
        shoppingcart.LocatePass().sendKeys("1234");
        shoppingcart.LocateLoginBTN().click();
    }
    @Test
    public void shoppingIcon (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement icon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a")));
        icon.click();
        shoppingcart.shoppingcarticon().click();

//        Assert.assertTrue(List<WebElement> removeButtons =driver.findElements(By.xpath("//*[@id=\"top-links\"]/ul/li[4]")).isDisplayed());
//        for (WebElement btn : removeButtons) {
//            btn.click();
//        }

        // 1. عرف القائمة أولاً
        List<WebElement> removeButtons = driver.findElements(By.xpath("//*[@id=\"top-links\"]/ul/li[4]"));

// 2. تأكد أن القائمة ليست فارغة (هذا هو الـ Assertion الصحيح)
        Assert.assertFalse(removeButtons.isEmpty(), "القائمة فارغة، لا يوجد أزرار للحذف!");

// 3. الآن قم بعمل Loop للضغط على الأزرار
        for (WebElement btn : removeButtons) {
            btn.click();
        }

    }
    @AfterMethod
    public void Postcondition() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
