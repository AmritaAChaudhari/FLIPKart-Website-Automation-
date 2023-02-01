package tests;

import org.openqa.selenium.Alert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage2;
import testbase.WebTestBase2;

public class AlertTest extends WebTestBase2 {

    HomePage2 homePage2;

    public AlertTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage2 = new HomePage2();
    }

    @Test
    public void verifyAlert() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage2.alerts();

    }

    @Test
    public void verifyIframe() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage2.iframes();

    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
Thread.sleep(5000);
        driver.close();
    }


}
