package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SummaryPage extends BasePage{

    static WebDriver driver;

    //Attributes (elements)
    By title_text = By.cssSelector("h1.center");
    By continue_btn = By.cssSelector(".jyxUhb");

    //Constructor
    public SummaryPage(WebDriver driver) {
        super(driver);
    }

    public String get_title(){
        return getText(title_text);
    }

    public SummaryPage to_continue(){
        clickIm(continue_btn);
        return this;
    }








}
