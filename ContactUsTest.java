package project_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import project_pages.ContactUsPage;

public class ContactUsTest {
    static WebDriver drivers;
    static ContactUsPage contact;

    @BeforeMethod
    public static void openbrowser() {
        drivers = new ChromeDriver();
        drivers.manage().window().maximize();
        drivers.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        contact = new ContactUsPage(drivers);
    }

    @Test
    public static void verifyContactUsPage() {
        contact.ContactUsFooterLink().click();
        Assert.assertTrue(contact.PageHeading().contains("Contact Us"));
    }

    @AfterMethod
    public void closebrowser() {
        drivers.quit();
    }
}
