package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DatePage extends BasePage{

    static WebDriver driver;

    //Attributes (elements)
    By start_date = By.id("startDate");
    By end_date = By.id("endDate");
    By continue_btn = By.cssSelector(".jyxUhb");

    //Constructor
    public DatePage(WebDriver driver) {
        super(driver);
    }

    public DatePage enter_start(){
        enterDate(start_date,"02/06/2025");
        return this;
    }
    public DatePage enter_end(){
        enterDate(end_date,"09/06/2025");
        return this;
    }

    public DatePage to_continue(){
        click(continue_btn);
        return this;
    }

}
