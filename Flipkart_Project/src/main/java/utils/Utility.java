package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import testbase.WebTestBase;

import javax.print.attribute.AttributeSetUtilities;
import java.io.IOException;
import java.net.CookieStore;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Utility extends WebTestBase {
    public static final long PAGE_LOAD_TIMEOUT = 20;
    public static final long IMPLICITLY_WAIT = 20;


    public static void waitUntilElementToBeClick(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IMPLICITLY_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

    //DropDown Method
    public static void selectValue(WebElement element, String term, String value) {


        Select dropDown = new Select(element);
        if (term.equalsIgnoreCase("byValue")) {
            dropDown.selectByValue(value);

        } else if (term.equalsIgnoreCase("byIndex")) {
            dropDown.selectByIndex(Integer.parseInt(value));


        } else if (term.equalsIgnoreCase("byVisibleText")) {
            dropDown.selectByVisibleText(value);


        } else {
            System.out.println("Please select correct option");
        }


    }


    //MouseHover Method using Actions
    public static void mouseHover(WebDriver driver, WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    //Window Handle method
    public static void windowHandle(WebDriver driver) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));


        String parentWindowid = driver.getWindowHandle();
        Set<String> allWindow = driver.getWindowHandles();

        for (String s : allWindow) {
            if (!parentWindowid.contentEquals(s)) {
                driver.switchTo().window(s);
                Thread.sleep(5000);
                driver.close();
            }
        }

        driver.switchTo().window(parentWindowid);


    }

    //Cookies Method
    public static void getCookies() {
        Set<Cookie> cookies = driver.manage().getCookies();
        for (Cookie c : cookies) {
            System.out.println(c);
        }
    }


    public static void addCookies(String key1, String key2) {
        Cookie cookie = new Cookie(key1, key2);
        driver.manage().addCookie(cookie);

    }





    //ScrollDown Method
    public static void scrollDown(WebDriver driver, WebElement careers) {
        //to perform Scroll on application using Selenium
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,800)");
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", careers);
    }

        //Wait Method
        public static void explicitWait() {
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='link-color'][normalize-space()='Services']")));
            // Print the first result
            System.out.println(firstResult.getText());
        }



public static void Search(String searchValue){
try {
    List<WebElement> listWe = driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1']"));
    for (WebElement e1 : listWe) {
        System.out.println(e1.getText());
        if (e1.getText().equalsIgnoreCase(searchValue)) {
            e1.click();//mouse action


            break;
        }
    }
}
       catch(Exception e) {
        e.printStackTrace();
    }

}

//public  static void checkBoxes(WebElement checkbox){
//
//    JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
//    javascriptExecutor.executeScript("window.scrollBy(0,300)");
//    javascriptExecutor.executeScript("arguments[0].scrollIntoView();", checkbox);
//
//}


}




