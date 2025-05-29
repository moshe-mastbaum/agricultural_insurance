package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpecialCoversPage extends BasePage{

    static WebDriver driver;

    //Attributes (elements)

    By ExtremeSports = By.id("ExtremeSports_Accordion");

    By continue_btn = By.cssSelector(".jyxUhb");

    public SpecialCoversPage(WebDriver driver) {
        super(driver);
    }

    public SpecialCoversPage to_continue(){
        click(continue_btn);
        return this;
    }

    public boolean check_ExtremeSports_exsit(){
        return checkIfElementExist(ExtremeSports);
    }




}
