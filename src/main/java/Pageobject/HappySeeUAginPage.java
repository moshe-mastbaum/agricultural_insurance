package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HappySeeUAginPage extends BasePage{

    static WebDriver driver;

    //Attributes (elements)
    By id_input = By.id("id");

    //Constructor
    public HappySeeUAginPage(WebDriver driver) {
        super(driver);
    }

    public boolean is_id_input_exist(){
        return checkIfElementExist(id_input);
    }
}
