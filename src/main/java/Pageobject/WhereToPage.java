package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WhereToPage extends BasePage{

    static WebDriver driver;

    //Attributes (elements)

//    By purchase = By.id("abroadplus");
//    By insurances_title = By.cssSelector(".insurances-title");
//    By fast_actions_title = By.cssSelector(".titleline--left");
//    By is_car_insurence = By.partialLinkText("האם הרכב מבוטח");
//    By find_documents = By.partialLinkText("חיפוש מסמכים");
//    By find_contact_us = By.partialLinkText("צור קשר");



    By continue_btn = By.cssSelector(".jyxUhb");
    By to_destintion = By.cssSelector("div.sc-ksZaOG > div");
    //Constructor
    public WhereToPage(WebDriver driver) {
        super(driver);
    }

    public WhereToPage click_to(){
        click_i_FromList(to_destintion,2);
//        selectRandomlyFromList(to_destintion);
        return this;
    }
    public WhereToPage to_continue(){
        click(continue_btn);
        return this;
    }



}
