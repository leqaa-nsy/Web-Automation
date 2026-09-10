package project_pages;

    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;

public class Registrationpage
    {
    WebDriver driver;
    public Registrationpage(WebDriver x){driver =x;}
        public WebElement My_account(){return driver.findElements(By.className("dropdown")).get(0);}
        public WebElement Register(){return  driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[1]/a"));}
        public WebElement First_Name(){return driver.findElement(By.id("input-firstname"));}
        public WebElement Last_Name(){return driver.findElement(By.id("input-lastname"));}
        public WebElement EMail(){return driver.findElement(By.id("input-email"));}
        public WebElement Telephone(){return driver.findElement(By.id("input-telephone"));}
        public WebElement Password(){return driver.findElement(By.id("input-password"));}
        public WebElement Password_Confirm(){return driver.findElement(By.id("input-confirm"));}
        public WebElement Subscribe(){return  driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[3]/div/div/label[2]/input"));}
        public WebElement  Privacy_Policy(){return driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[1]"));}
        public WebElement Continue(){return  driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]"));}

    }

