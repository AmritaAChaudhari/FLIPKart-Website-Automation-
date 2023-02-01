package pages;

import jdk.jshell.execution.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.Utility;

import java.io.IOException;

public class HomePage extends WebTestBase {

    @FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
    WebElement loginClose;


    @FindBy(xpath = "//input[@class='_3704LK']")
    WebElement searchTextBox;


    @FindBy(xpath = "//button[@class='L0Z3Pu']")
    WebElement searchBtn;


    @FindBy(xpath = "//span[text()='Filters']")
    WebElement searchList;


    @FindBy(xpath = "//a[text()='Login']")
    WebElement hover;


    @FindBy(xpath = "//span[text()='Become a Seller']")
    WebElement becomeSellerText;


    @FindBy(xpath = "//div[text()='Flipkart Plus Zone']")
    WebElement hoverSelectOption;


    @FindBy(xpath = "//img[@alt='APPLE iPhone 14 (Blue, 128 GB)']")
    WebElement clickIphoneImg;


    @FindBy(xpath = "//a[text()='Careers']")
    WebElement careers;


    @FindBy(xpath = "//li[2]//a[1]")
    WebElement aboutFlipkartText;




    @FindBy(xpath = "//div[@class='_1YAKP4']//select[@class='_2YxCDZ']")
    WebElement dropdown;


    @FindBy(xpath = "//a[@class='_3-PJz-']//span[contains(text(),'Become a Seller')]")
    WebElement wait;


    @FindBy(xpath = "//a[@class='link-color'][normalize-space()='Services']")
    WebElement wait2;

@FindBy(xpath = "//ul[@class='col-12-12 _1MRYA1']")
WebElement bagsList;


@FindBy(xpath = "//div[@title='Core i7']//div[@class='_24_Dny']")
WebElement checkbox;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }



    public void findElements(String searchKey3) {
        searchTextBox.click();
        searchTextBox.sendKeys(searchKey3);
        Utility.Search("bag for women");


    }
    public void explicit(){
        wait.click();
        Utility.explicitWait();
    }


    public void selectDropdown() {
        dropdown.click();

        Utility.selectValue(dropdown,"byIndex","2");


    }

    public void checkBox(){
        searchTextBox.click();
        searchBtn.click();
//        Utility.checkBoxes(checkbox);
        checkbox.click();

    }



    public void selectCareers() {

        Utility.scrollDown(driver, careers);
        careers.click();
    }




    public void windowHandles() throws InterruptedException {
        clickIphoneImg.click();
        Utility.windowHandle(driver);

    }





    public void selectMouseHover() {
        hoverSelectOption.click();
    }


    public void mouseHoverr() {

        Utility.mouseHover(driver, hover);
    }


    public void searchClick() {
        searchTextBox.click();

    }

    public void SearchInput1(String searchKey1) {
        searchTextBox.sendKeys(searchKey1);

        searchBtn.click();

    }


    public void SearchInput2(String searchKey2) {
        searchTextBox.sendKeys(searchKey2);
        searchBtn.click();


    }

    public String getTextOfMyHomePage1() {
        return searchList.getText();
    }


    public String getTextOfMyHomePage2() {
        return becomeSellerText.getText();

    }


    public String getTextOfMyCareerPage() {
        return aboutFlipkartText.getText();
    }

    public void loginClosed() {

        Utility.waitUntilElementToBeClick(driver, loginClose);
        loginClose.click();
    }

    public void getcookies() {
        Utility.getCookies();
    }

    public void addcookies(String key1,String key2) {
        Utility.addCookies(key1,key2);
    }



}


