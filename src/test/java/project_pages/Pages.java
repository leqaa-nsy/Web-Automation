package project_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pages {

    WebDriver driver;

    public Pages(WebDriver driver) {
        this.driver = driver;
    }

    public void click_on_ForgottenPassword_button() {
        driver.findElement(By.linkText("Forgotten Password")).click();

    }

    public void enter_email(String email) {
        driver.findElement(By.id("input-email")).sendKeys(email);
    }

    public void click_on_continue_button() {
        driver.findElement(By.className("pull-right")).click();
    }

    //////

    public void select_login_tab() {
        driver.findElement(By.linkText("Login")).click();
    }

    public void enter_password(String password) {
        driver.findElement(By.id("input-password")).sendKeys(password);
    }

    public void click_on_login_button() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
    }


    public void search(String element) {
        driver.findElement(By.name("search")).sendKeys(element);
    }

    public void click_on_search_button() {
        driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
    }

    ///////

    public void click_on_anyItem_onThe_topOf_page() {
        driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[4]/a")).click();
    }


    public void click_on_AddToWishlist_button() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[2]")).click();
    }



    public void click_on_theImage_of_AnyItem() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[1]/a/img")).click();
    }
    public void click_on_AddToWishlist_button2() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div[1]/button[1]")).click();
    }

    ///////

    public void click_on_AddToCart1() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[1]")).click();
    }

    public void click_on_AddToCart2() {
        driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
    }

    ///////

    public void click_on_compareThisProduct_button1() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[3]")).click();
    }

    public void click_on_compareThisProduct_button2() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div[1]/button[2]")).click();
    }

}