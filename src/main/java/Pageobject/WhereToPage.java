package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WhereToPage extends BasePage{

    static WebDriver driver;

    //Attributes (elements)
    By continue_btn = By.cssSelector(".jyxUhb");
    By to_destintion = By.cssSelector("div.sc-ksZaOG > div");
    By steps = By.cssSelector("div.step-indicator > div");
    //Constructor
    public WhereToPage(WebDriver driver) {
        super(driver);
    }

    public WhereToPage click_destintion_box(){
        click_i_FromList(to_destintion,2);
        return this;
    }
    public WhereToPage click_continue_btn(){
        click(continue_btn);
        return this;
    }

    public String get_step_color(){
        return elementIColor(steps,0);
    }



}
