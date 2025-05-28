package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CoversPage extends BasePage{

    static WebDriver driver;

    //Attributes (elements)

//    By purchase = By.id("abroadplus");
//    By insurances_title = By.cssSelector(".insurances-title");
//    By fast_actions_title = By.cssSelector(".titleline--left");
//    By is_car_insurence = By.partialLinkText("האם הרכב מבוטח");
//    By find_documents = By.partialLinkText("חיפוש מסמכים");
//    By find_contact_us = By.partialLinkText("צור קשר");


//    By cover_titles = By.cssSelector(".extra");
    By cover_titles = By.id("accordion-top");
    By computer_box = By.cssSelector(".col-lg-12 > div > label");
    By computer_model = By.id("pcOrTabletAddCover_pcOrTabletTypeOfCover_0");
    By continue_btn = By.cssSelector(".jyxUhb");
    By close_pop = By.id("xButton");
    By insurance_price = By.className("finalPriceValue");
    //Constructor
    public CoversPage(WebDriver driver) {
        super(driver);
    }

    public CoversPage fill_luggage(){
        click_i_FromList(cover_titles,1);
        click_i_FromList(cover_titles,2);
        click(computer_box);
        writeText(computer_model,"lenovo");
        return this;
    }

    public CoversPage to_continue(){
        click(continue_btn);
        click(close_pop);
        click(continue_btn);
        click(close_pop);
        click(continue_btn);
        return this;
    }

    public boolean is_continue_button_exist(){
        return checkIfElementExist(continue_btn);
    }

    public String get_insurance_price(){
        return getText(insurance_price);
    }

}
