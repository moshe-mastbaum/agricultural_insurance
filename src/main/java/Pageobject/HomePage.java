package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Set;

public class HomePage extends BasePage{

    static WebDriver driver;

    //Attributes (elements)
    By purchase = By.id("abroadplus");
    By insurances_title = By.cssSelector(".insurances-title");
    By fast_actions_title = By.cssSelector(".titleline--left");
    By is_car_insurence = By.partialLinkText("האם הרכב מבוטח");
    By find_documents = By.partialLinkText("חיפוש מסמכים");
    By find_contact_us = By.id("menu-item-6129");
    By to_continue = By.cssSelector(".sc-papXJ");

    //Constructor
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage to_purchase(){
        scroll(insurances_title);
        click(purchase);
        List<String> WindowHandles = get_window_handles();
        switch_to(WindowHandles.get(1));
        click(to_continue);
        return this;
    }

    public HomePage to_is_car_insurence(){
        scroll(fast_actions_title);
        click(is_car_insurence);
        return this;
    }

    public HomePage to_find_documents(){
        scroll(fast_actions_title);
        click(find_documents);
        return this;
    }

    public HomePage to_contact_us(){
//        move_mouse(find_contact_us);
        click(find_contact_us);
        return this;
    }

}
