package project_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import project_pages.Pages;
import project_pages.Ensuring;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import project_pages.TestListener;

@Listeners(TestListener.class)
public class Tests {
    WebDriver driver;
    Pages pages;
    Ensuring ensure;

    @BeforeMethod
    public void preconditions(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        pages = new Pages(driver);
        ensure = new Ensuring(driver);
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=account/register");
    }

    @Test(priority = 1)
    public void Check_ForgottenPassword() {
        pages.click_on_ForgottenPassword_button();
        pages.enter_email("lqa77@gmail.com");
        pages.click_on_continue_button();
        ensure.validate_forgottenPassword_successfully();

    }

    @Test(priority = 2)
    public void Check_Search_item_completeName() {
        pages.search("iMac");
        pages.click_on_search_button();
        ensure.validate_search1_successfully();

    }
    @Test(priority = 3)
    public void Check_Search_item_not_completeName() {
        pages.search("tab");
        pages.click_on_search_button();
        ensure.validate_search2_successfully();
    }

    @Test(priority = 4)
    public void Check_Search_item_notFound() {
        pages.search("pc");
        pages.click_on_search_button();
        ensure.validate_search3_successfully();
    }

    @Test(priority = 5)
    public void Check_Add_To_Wishlist_Scenario1() {
        pages.click_on_anyItem_onThe_topOf_page();
        pages.click_on_AddToWishlist_button();
        ensure.validate_AddToWishList_or_AddToCart_or_compareThisProduct_successfully1();
    }

    @Test(priority = 6)
    public void Check_Add_To_Wishlist_Scenario2(){
        pages.click_on_anyItem_onThe_topOf_page();
        pages.click_on_theImage_of_AnyItem();
        pages.click_on_AddToWishlist_button2();
        ensure.validate_AddToWishList_or_AddToCart_or_compareThisProduct_successfully2();
    }

    @Test(priority = 7)
    public void Check_Add_To_Cart_Scenario1(){
        pages.click_on_anyItem_onThe_topOf_page();
        pages.click_on_AddToCart1();
        ensure.validate_AddToWishList_or_AddToCart_or_compareThisProduct_successfully1();
    }

    @Test(priority = 8)
    public void Check_Add_To_Cart_Scenario2(){
        pages.click_on_anyItem_onThe_topOf_page();
        pages.click_on_theImage_of_AnyItem();
        pages.click_on_AddToCart2();
        ensure.validate_AddToWishList_or_AddToCart_or_compareThisProduct_successfully2();
    }

    @Test(priority = 9)
    public void Check_compareThisProduct_Scenario1(){
        pages.click_on_anyItem_onThe_topOf_page();
        pages.click_on_compareThisProduct_button1();
        ensure.validate_AddToWishList_or_AddToCart_or_compareThisProduct_successfully1();
    }


    @Test(priority = 10)
    public void Check_compareThisProduct_Scenario2(){
        pages.click_on_anyItem_onThe_topOf_page();
        pages.click_on_theImage_of_AnyItem();
        pages.click_on_compareThisProduct_button2();
        ensure.validate_AddToWishList_or_AddToCart_or_compareThisProduct_successfully2();
    }

    @AfterMethod
    public void postconditions() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }

    }