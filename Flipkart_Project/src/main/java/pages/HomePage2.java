package pages;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase2;

import utils.Utility;
import utils.Utility2;

public class HomePage2 extends WebTestBase2 {


    @FindBy(xpath ="//input[@id='alertbtn']")
    WebElement alert;


    @FindBy(id = "name")
    WebElement promptAlert;

@FindBy(tagName = "iframe")
WebElement frame;

public void alerts(){
    promptAlert.sendKeys("Amrita");
    Utility2.alert(alert,promptAlert);
}


public void iframes(){

    Utility2.iframe();
}



    public HomePage2() {

        PageFactory.initElements(driver, this);
    }





}
