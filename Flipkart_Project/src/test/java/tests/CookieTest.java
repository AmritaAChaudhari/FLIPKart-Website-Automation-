package tests;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import testbase.WebTestBase;

public class CookieTest extends WebTestBase {
    HomePage homePage;

    public CookieTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
    }

    @Test
    public void verifyCookie() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage.loginClosed();

        homePage.getcookies();
        homePage.addcookies("key1","key2");
    }




    @AfterMethod
    public void afterMethod()  {
        driver.close();
    }


}
