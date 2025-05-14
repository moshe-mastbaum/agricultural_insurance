package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InsuranceCheckPage extends BasePage{

    static WebDriver driver;

    //Attributes (elements)

//    By purchase = By.id("abroadplus");
//    By insurances_title = By.cssSelector(".insurances-title");
//    By fast_actions_title = By.cssSelector(".titleline--left");
//    By is_car_insurence = By.partialLinkText("האם הרכב מבוטח");
//    By find_documents = By.partialLinkText("חיפוש מסמכים");
//    By find_contact_us = By.partialLinkText("צור קשר");

    By enter_license = By.id("license-number");
    By date_btn = By.id("search-date");
    By search_btn = By.id("check-sub");
    By enter_date = By.cssSelector("td[data-handler='selectDay']");
    //Constructor
    public InsuranceCheckPage(WebDriver driver) {
        super(driver);
    }

    public InsuranceCheckPage check_license(String licenseNumber){
        writeText(enter_license,licenseNumber);
        click(date_btn);
        click(enter_date);
//        writeText(enter_date,"01/05/2025");
        click(search_btn);
        return this;
    }






}
