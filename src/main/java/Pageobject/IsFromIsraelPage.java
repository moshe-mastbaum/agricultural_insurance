package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IsFromIsraelPage extends BasePage{

    static WebDriver driver;

    //Attributes (elements)

//    By purchase = By.id("abroadplus");
//    By insurances_title = By.cssSelector(".insurances-title");
//    By fast_actions_title = By.cssSelector(".titleline--left");
//    By is_car_insurence = By.partialLinkText("האם הרכב מבוטח");
//    By find_documents = By.partialLinkText("חיפוש מסמכים");
//    By find_contact_us = By.partialLinkText("צור קשר");


    By no_btn = By.cssSelector(".iGkwwW");
    By yes_btn = By.cssSelector(".jyxUhb");

    //Constructor
    public IsFromIsraelPage(WebDriver driver) {
        super(driver);
    }

    public IsFromIsraelPage click_no(){
        click(no_btn);
        return this;
    }
    public IsFromIsraelPage click_yes(){
        click(yes_btn);
        return this;
    }



}
