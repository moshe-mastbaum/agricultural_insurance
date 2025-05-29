package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindDocumentsPage extends BasePage{

    static WebDriver driver;

    //Attributes (elements)
    By opentext = By.id("opentext");
    By all_subjects = By.id("primary");
    By subject_options = By.cssSelector("#primary > option");
    By all_kinds = By.id("secondary");
    By subject_kinds = By.cssSelector("#secondary > option");
    By search_btn = By.cssSelector("button[type='submit']");
    By clear_btn = By.cssSelector("button[type='reset']");
    By results = By.cssSelector(".table__text");

    //Constructor
    public FindDocumentsPage(WebDriver driver) {
        super(driver);
    }

    public FindDocumentsPage find_open_text(){
        writeText(opentext,"בקשה");
        click(search_btn);
        return this;
    }

    public FindDocumentsPage find_by_choos(){
        chooseFromList(all_subjects,subject_options,"רכב");
        chooseFromList(all_kinds,subject_kinds,"תקנון רכב");
        click(search_btn);
        click(clear_btn);
        return this;
    }

    public boolean check_result(){
        return isVisible(results);
    }

}
