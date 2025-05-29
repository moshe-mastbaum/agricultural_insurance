package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InsuranceCheckPage extends BasePage{

    static WebDriver driver;

    //Attributes (elements)
    By enter_license = By.id("license-number");
    By date_btn = By.id("search-date");
    By search_btn = By.id("check-sub");
    By enter_date = By.cssSelector("td[data-handler='selectDay']");
    By message_search = By.cssSelector(".msg-form[style='display: block;']");

    //Constructor
    public InsuranceCheckPage(WebDriver driver) {
        super(driver);
    }

    public InsuranceCheckPage check_license(String licenseNumber){
        writeText(enter_license,licenseNumber);
        click(date_btn);
        click(enter_date);
        click(search_btn);
        return this;
    }

    public String get_message_search (){
        return getText(message_search);
    }

}
