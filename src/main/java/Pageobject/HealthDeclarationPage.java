package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HealthDeclarationPage extends BasePage{

    static WebDriver driver;

    //Attributes (elements)
    By no_btn = By.id("לא");
    By continue_btn = By.cssSelector(".jyxUhb");

    public HealthDeclarationPage(WebDriver driver) {
        super(driver);
    }

    public HealthDeclarationPage click_continue_btn(){
        click(no_btn);
        click(continue_btn);
        return this;
    }

    public boolean no_health_problems_button_exist(){
        return checkIfElementExist(no_btn);
    }




}
