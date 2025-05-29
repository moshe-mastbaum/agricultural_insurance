package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PassengersPage extends BasePage{

    static WebDriver driver;

    //Attributes (elements)
    By id_num = By.id("idNumber_0");
    By cell_num = By.id("cellphoneNumber_0");
    By first_name_he = By.id("firstNameHeb_0");
    By last_name_he = By.id("lastNameHeb_0");
    By first_name_en = By.id("firstNameEng_0");
    By last_name_en = By.id("lastNameEng_0");
    By birth_date = By.id("dateOfBirth_0");
    By email = By.id("emailAddressLabel_0");
    By male = By.id("זכר");
    By continue_btn = By.cssSelector(".jyxUhb");

    //Constructor
    public PassengersPage(WebDriver driver) {
        super(driver);
    }

    public PassengersPage fill_details(){
        writeText(id_num,"123456782");
        writeText(cell_num,"0501231234");
        writeText(first_name_he,"ישראל");
        writeText(last_name_he,"כהן");
        writeText(first_name_en,"israel");
        writeText(last_name_en,"cohen");
        writeText(email,"israel@gamil.com");
        enterDate(birth_date,"02/06/2000");
        click(male);
        return this;
    }

    public PassengersPage to_continue(){
        click(continue_btn);
        return this;
    }

}
