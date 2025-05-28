package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CannotContinuePage extends BasePage{

    static WebDriver driver;

    //Attributes (elements)

    By back_home_btn = By.cssSelector(".buttonhomepage");

    //Constructor
    public CannotContinuePage(WebDriver driver) {
        super(driver);
    }

    public boolean back_home_btn_exist(){
        return checkIfElementExist(back_home_btn);
    }
}
