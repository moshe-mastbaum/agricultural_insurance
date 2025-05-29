package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IsFromIsraelPage extends BasePage{

    static WebDriver driver;

    //Attributes (elements)
    By no_btn = By.cssSelector(".iGkwwW");
    By yes_btn = By.cssSelector(".jyxUhb");

    //Constructor
    public IsFromIsraelPage(WebDriver driver) {
        super(driver);
    }

    public IsFromIsraelPage click_no(){
        click(no_btn);
        return this;
    }

    public boolean is_click_yes_exist(){
        return  checkIfElementExist(yes_btn);
    }

    public IsFromIsraelPage click_yes(){
        click(yes_btn);
        return this;
    }

}
