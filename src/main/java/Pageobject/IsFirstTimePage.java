package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IsFirstTimePage extends BasePage{

    static WebDriver driver;

    //Attributes (elements)
    By first_time_btn = By.cssSelector(".sc-papXJ > div");
    By no_first_time_btn = By.cssSelector(".goback");

    //Constructor
    public IsFirstTimePage(WebDriver driver) {
        super(driver);
    }

    public IsFirstTimePage click_first_time(){
        click(first_time_btn);
        return this;
    }

    public String get_first_time_text(){
        return getText(first_time_btn);
    }

    public IsFirstTimePage click_not_first_time(){
        click(no_first_time_btn);
        return this;
    }

}
