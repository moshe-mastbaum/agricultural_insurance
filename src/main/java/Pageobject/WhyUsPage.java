package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WhyUsPage extends BasePage{

    static WebDriver driver;

    //Attributes (elements)
    By cookies_btn = By.id("acceptButton");
    By to_continue = By.cssSelector(".sc-papXJ");
    By why_us_text = By.cssSelector("div.line-wrap > div > span");

    //Constructor
    public WhyUsPage(WebDriver driver) {
        super(driver);
    }

    public WhyUsPage click_lets_continue_btn(){
        click(cookies_btn);
        click(to_continue);
        return this;
    }

    public String why_us_text(){
        return getText(why_us_text);
    }

    public boolean is_continue_exist(){
        return checkIfElementExist(to_continue);
    }

}
