package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DatePage extends BasePage{

    String start = "02/09/2025";
    String end = "08/09/2025";
    static WebDriver driver;

    //Attributes (elements)
    By start_date = By.id("startDate");
    By end_date = By.id("endDate");
    By continue_btn = By.cssSelector(".jyxUhb");

    //Constructor
    public DatePage(WebDriver driver) {
        super(driver);
    }

    public DatePage enter_start_date(){
        enterDate(start_date,start);
        return this;
    }
    public DatePage enter_end_date(){
        enterDate(end_date,end);
        return this;
    }

    public DatePage to_continue(){
        click(continue_btn);
        return this;
    }

}
