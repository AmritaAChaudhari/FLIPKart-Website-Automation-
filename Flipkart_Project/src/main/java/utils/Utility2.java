package utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import testbase.WebTestBase2;

import java.util.List;

public class Utility2 extends WebTestBase2 {


    public static  void alert(WebElement element,WebElement element2){
        element2.click();
        element.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
    }


    public static void iframe(){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,800)");
//        javascriptExecutor.executeScript("arguments[0].scrollIntoView();"element);
        List<WebElement> elements= (List<WebElement>) driver.findElement(By.xpath("//h1[normalize-space()='All Courses']"));
        System.out.println("Iframe size" + elements.size());
        driver.quit();




    }
}
