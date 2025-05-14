package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpecialCoversPage extends BasePage{

    static WebDriver driver;

    //Attributes (elements)

//    By purchase = By.id("abroadplus");
//    By insurances_title = By.cssSelector(".insurances-title");
//    By fast_actions_title = By.cssSelector(".titleline--left");
//    By is_car_insurence = By.partialLinkText("האם הרכב מבוטח");
//    By find_documents = By.partialLinkText("חיפוש מסמכים");
//    By find_contact_us = By.partialLinkText("צור קשר");


    By continue_btn = By.cssSelector(".jyxUhb");

    public SpecialCoversPage(WebDriver driver) {
        super(driver);
    }

    public SpecialCoversPage to_continue(){
        click(continue_btn);
        return this;
    }




}
