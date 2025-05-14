package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IsFirstTimePage extends BasePage{

    static WebDriver driver;

    //Attributes (elements)

//    By purchase = By.id("abroadplus");
//    By insurances_title = By.cssSelector(".insurances-title");
//    By fast_actions_title = By.cssSelector(".titleline--left");
//    By is_car_insurence = By.partialLinkText("האם הרכב מבוטח");
//    By find_documents = By.partialLinkText("חיפוש מסמכים");
//    By find_contact_us = By.partialLinkText("צור קשר");


    By first_time_btn = By.cssSelector(".sc-papXJ");
    By no_first_time_btn = By.cssSelector(".goback");
    //Constructor
    public IsFirstTimePage(WebDriver driver) {
        super(driver);
    }

    public IsFirstTimePage click_first_time(){
        click(first_time_btn);
        return this;
    }

    public IsFirstTimePage click_not_first_time(){
        click(no_first_time_btn);
        return this;
    }




}
