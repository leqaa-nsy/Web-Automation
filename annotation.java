package pack1;

import org.testng.annotations.*;

public class annotation {
    @BeforeSuite
    public void method1(){
        System.out.println("befor test1");
    }   @BeforeTest
    public void method2(){
        System.out.println("befor test2");
    }   @BeforeClass
    public void method3(){
        System.out.println("befor test3");
    }   @BeforeMethod
    public void method4(){
        System.out.println("befor test4");
    }
    @Test
    public void test(){
        System.out.println("test");
    }
    @AfterSuite
    public void method5(){
        System.out.println("after test1");
    }    @AfterTest
    public void method6(){
        System.out.println("after test2");
    }    @AfterClass
    public void method7(){
        System.out.println("after test3");
    }    @AfterMethod
    public void method8(){
        System.out.println("after test4");
    }
}
