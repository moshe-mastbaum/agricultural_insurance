package Pageobject;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;


public class BasePage {

    //Attributes
    static WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    //Constructor
    public BasePage(WebDriver driver) {
        this.driver= driver;
        wait= new WebDriverWait(driver, Duration.ofSeconds(20));
        actions = new Actions(driver);
    }

    //Functions

    //Scroll to element
    public void scroll(By elementLocation){
        WebElement elm = driver.findElement(elementLocation);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elm);
    }

    public void move_mouse(By elementLocation){
        WebElement elementToHover = driver.findElement(elementLocation);
        actions.moveToElement(elementToHover).perform();
    }


    public String get_url(){
        return driver.getCurrentUrl();
    }
    public List<String> get_window_handles(){
        Set<String> allHandles = driver.getWindowHandles();
        List<String> handleList = new ArrayList<>(allHandles);
        return handleList;
    }
    public void switch_to(String handle){
        driver.switchTo().window(handle);
    }

    //Clicking on the element
    public void click(By elementLocation){
        waitVisibility(elementLocation);
        wait.until(ExpectedConditions.elementToBeClickable(elementLocation));
        driver.findElement(elementLocation).click();
    }

    //Inserting date
    public  void enterDate(By elementLocation, String text){
        waitVisibility(elementLocation);
        driver.findElement(elementLocation).clear();
        driver.findElement(elementLocation).sendKeys(text);
    }

    //Inserting text
    public  void writeText(By elementLocation, String text){
        waitVisibility(elementLocation);
        driver.findElement(elementLocation).clear();
        driver.findElement(elementLocation).sendKeys(text);
    }

    //Waiting 1.5 seconds for the element to appear
    public void waitVisibility(By by){
        try {
            Thread.sleep(1500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    //Check if the element is selected
    public boolean selected(By elementLocation){
        waitVisibility(elementLocation);
        return driver.findElement(elementLocation).isSelected();
    }

    //Choose from list
    public void chooseFromList(By elementLocation,By options, String text){
        waitVisibility(elementLocation);
        driver.findElement(elementLocation).click();
//        waitVisibility(options);
        List<WebElement> list= driver.findElements(options);
        for (WebElement choose : list){
            if (choose.getText().equals(text))
                choose.click();
        }
    }

    //Choose select number
    public void chooseFromselect(By elementLocation, int n){
        WebElement selectElement = driver.findElement(elementLocation);
        Select select = new Select(selectElement);
        select.selectByIndex(n);
    }

    //File uploading
    public  void uploadFile(By elementLocation, String text){
        WebElement uploadFile= driver.findElement(elementLocation);
        uploadFile.sendKeys(text);
    }

    // selection i from a list
    public void click_i_FromList(By elementLocation, int i){
        waitVisibility(elementLocation);
        List<WebElement> allOptions= driver.findElements(elementLocation);
        System.out.println("Found " + allOptions.size() + " child divs.");
        allOptions.get(i).click();
    }

    //Random selection from a list
    public void selectRandomlyFromList(By elementLocation){
        waitVisibility(elementLocation);
        List<WebElement> allOptions= driver.findElements(elementLocation);
        System.out.println("Found " + allOptions.size() + " child divs.");
        Random rand = new Random();
        int randomProduct = rand.nextInt(allOptions.size());
        allOptions.get(randomProduct).click();
    }

    //Check the size of the element
    public void elementSize(By elementLocation){
        WebElement load= driver.findElement(elementLocation);
        Dimension dimension= load.getSize();
        System.out.println(dimension);
    }

    //Checks whether the element exists on the page
    public boolean checkIfElementExist(By elementLocation){
        try {
            driver.findElement(elementLocation);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    //Color of element in his Hexadecimal value
    public String elementColor(By elementLocation){
        WebElement element = driver.findElement(elementLocation);
        String color= element.getCssValue("color");
        return Color.fromString(color).asHex();
    }

    //Get text from the element
    public String getText(By elementLocation){
        return driver.findElement(elementLocation).getText();
    }

}