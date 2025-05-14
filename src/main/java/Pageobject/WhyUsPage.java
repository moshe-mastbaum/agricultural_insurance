package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class WhyUsPage extends BasePage{

    static WebDriver driver;

    //Attributes (elements)

//    By purchase = By.id("abroadplus");
//    By insurances_title = By.cssSelector(".insurances-title");
//    By fast_actions_title = By.cssSelector(".titleline--left");
//    By is_car_insurence = By.partialLinkText("האם הרכב מבוטח");
//    By find_documents = By.partialLinkText("חיפוש מסמכים");
//    By find_contact_us = By.partialLinkText("צור קשר");

    By cookies_btn = By.id("acceptButton");
    By to_continue = By.cssSelector(".sc-papXJ");

    //Constructor
    public WhyUsPage(WebDriver driver) {
        super(driver);
    }

    public WhyUsPage lets_continue(){
        click(cookies_btn);
        click(to_continue);
        return this;
    }




}
