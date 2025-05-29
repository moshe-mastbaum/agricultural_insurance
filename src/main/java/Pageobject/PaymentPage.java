package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage extends BasePage{

    static WebDriver driver;

    //Attributes (elements)
    By card_number_input = By.id("card-number");
    By frame1 = By.id("payerCityName");
    By CityName = By.id("payerCityName");

    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    public boolean is_enter_card_number_exist(){
        waitVisibility(CityName);
        scroll(CityName);
        waitVisibility(frame1);
        switchFtame("creditFrame");
        return checkIfElementExist(card_number_input);

    }
}
