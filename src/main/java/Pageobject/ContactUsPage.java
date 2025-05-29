package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage extends BasePage{

    static WebDriver driver;

    //Attributes (elements)
    By full_name = By.id("fullname");
    By phone_num = By.id("phone");
    By email = By.id("email");
    By all_subjects = By.id("subject");
    By subject_options = By.cssSelector("#subject > option");
    By message = By.id("message");
    By submit_btn = By.cssSelector("input[type='submit']");
    By thanks_message = By.cssSelector("h1");


    //Constructor
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    public ContactUsPage fill_details(){
        writeText(full_name,"ישראל כהן");
        writeText(phone_num,"0501231234");
        writeText(email,"israel@gamil.com");
        click(all_subjects);
        chooseFromList(all_subjects,subject_options, "שירות");
        writeText(message,"השירות צריך להשתפר");
        return this;
    }

    public ContactUsPage to_submit(){
        scroll(message);
        click(submit_btn);
        return this;
    }

    public boolean full_name_exist(){
        return checkIfElementExist(full_name);
    }

    public String get_thanks_message(){
        waitVisibility(thanks_message);
        return getText(thanks_message);
    }



}
