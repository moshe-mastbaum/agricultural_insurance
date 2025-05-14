package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DatePage extends BasePage{

    static WebDriver driver;

    //Attributes (elements)

//    By purchase = By.id("abroadplus");
//    By insurances_title = By.cssSelector(".insurances-title");
//    By fast_actions_title = By.cssSelector(".titleline--left");
//    By is_car_insurence = By.partialLinkText("האם הרכב מבוטח");
//    By find_documents = By.partialLinkText("חיפוש מסמכים");
//    By find_contact_us = By.partialLinkText("צור קשר");


    By start_date = By.id("startDate");
    By end_date = By.id("endDate");
    By continue_btn = By.cssSelector(".jyxUhb");

    //Constructor
    public DatePage(WebDriver driver) {
        super(driver);
    }

    public DatePage enter_start(){
        enterDate(start_date,"02/06/2025");
        return this;
    }
    public DatePage enter_end(){
        enterDate(end_date,"09/06/2025");
        return this;
    }

    public DatePage to_continue(){
        click(continue_btn);
        return this;
    }



}
