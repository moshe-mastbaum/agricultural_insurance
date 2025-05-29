package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StepsErea extends BasePage{

    static WebDriver driver;

    //Attributes (elements)
    By steps = By.cssSelector("div.step-indicator > div");

    //Constructor
    public StepsErea(WebDriver driver) {
        super(driver);
    }

    public String get_step_color(int stepNumber){
        return elementIColor(steps, stepNumber);
    }
}
