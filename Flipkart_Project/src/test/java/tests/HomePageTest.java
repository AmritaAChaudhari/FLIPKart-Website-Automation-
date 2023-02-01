package tests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import testbase.WebTestBase;

public class HomePageTest extends WebTestBase {
    HomePage homePage;

    public HomePageTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
    }

    @Test
    public void verifySearchTextBox() {
        SoftAssert softAssert = new SoftAssert();
        homePage.loginClosed();
        homePage.searchClick();
        homePage.SearchInput1(prop.getProperty("searchKey1"));
        softAssert.assertEquals(homePage.getTextOfMyHomePage1(), "Filters", "MY homepage text should be match");
        softAssert.assertAll();

    }


    @Test
    public void verifyMouseHover() {
        SoftAssert softAssert = new SoftAssert();
        homePage.loginClosed();
        homePage.mouseHoverr();
        homePage.selectMouseHover();
        System.out.println("passed");
        softAssert.assertEquals(homePage.getTextOfMyHomePage2(), "Become a Seller", "MY homepage text should be match");
        softAssert.assertAll();


    }

    @Test
    public void verifyGetWindowHandle() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage.loginClosed();
        homePage.searchClick();
        homePage.SearchInput2(prop.getProperty("searchKey2"));
        homePage.windowHandles();
        softAssert.assertEquals(homePage.getTextOfMyHomePage2(), "Become a Seller", "MY homepage text should be match");
        softAssert.assertAll();

    }

    @Test
    public void verifyScrollDown() {
        SoftAssert softAssert = new SoftAssert();
        homePage.loginClosed();
        homePage.selectCareers();
        System.out.println("career selected");
//        softAssert.assertEquals(homePage.getTextOfMyCareerPage(), "About Flipkart", "Career page  text should be match");
//        softAssert.assertAll();
    }



    @Test
    public void verifyDropDown(){
        SoftAssert softAssert = new SoftAssert();
        homePage.loginClosed();
        homePage.searchClick();
        homePage.SearchInput1(prop.getProperty("searchKey1"));
        homePage.selectDropdown();
        softAssert.assertEquals(homePage.getTextOfMyHomePage1(), "Filters", "MY homepage text should be match");
        softAssert.assertAll();
    }
//    @Test
//    public void verifyExplicit(){
//        SoftAssert softAssert = new SoftAssert();
//        homePage.loginClosed();
//      homePage.explicit();
////        softAssert.assertEquals(homePage.getTextOfMyHomePage1(), "Filters", "MY homepage text should be match");
////        softAssert.assertAll();
//    }









    @Test
    public void verifyCheckbox() {
        SoftAssert softAssert = new SoftAssert();
        homePage.loginClosed();
        homePage.searchClick();
        homePage.SearchInput1(prop.getProperty("searchKey1"));
        homePage.checkBox();
        softAssert.assertEquals(homePage.getTextOfMyHomePage2(), "Become a Seller", "MY homepage text should be match");
        softAssert.assertAll();


    }
    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }

}
