import Pageobject.IsFirstTimePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
//<div class="insurances-title">איזה פלוס אפשר להציע לך היום?</div>
public class ProposalTest extends Base {

    @Test // TC-38
    public void test38() throws InterruptedException{
        homePage.to_purchase();
    }

    @Test // TC-39
    public void test39() throws InterruptedException{
        homePage.to_purchase();
        whyUsPage.lets_continue();
    }

    @Test // TC-40
    public void test40() throws InterruptedException{
        homePage.to_purchase();
        whyUsPage.lets_continue();
        isFirstTimePage.click_first_time();
    }

    @Test // TC-41
    public void test41() throws InterruptedException{
        homePage.to_purchase();
        whyUsPage.lets_continue();
        isFirstTimePage.click_not_first_time();
    }

    @Test // TC-42
    public void test42() throws InterruptedException{
        homePage.to_purchase();
        whyUsPage.lets_continue();
        isFirstTimePage.click_first_time();
        isFromIsraelPage.click_no();
    }

    @Test // TC-43
    public void test43() throws InterruptedException{
        homePage.to_purchase();
        whyUsPage.lets_continue();
        isFirstTimePage.click_first_time();
        isFromIsraelPage.click_yes();
    }

    @Test  // TC-44
    public void test44() throws InterruptedException{
        homePage.to_purchase();
        whyUsPage.lets_continue();
        isFirstTimePage.click_first_time();
        isFromIsraelPage.click_yes();
        whereToPage.click_to();
        whereToPage.to_continue();
    }
//    react-datepicker__day react-datepicker__day--018 react-datepicker__day--weekend
    @Test  // TC-45
    public void test45() throws InterruptedException{
        homePage.to_purchase();
        whyUsPage.lets_continue();
        isFirstTimePage.click_first_time();
        isFromIsraelPage.click_yes();
        whereToPage.click_to();
        whereToPage.to_continue();
        datePage.enter_start();
        datePage.enter_end();
        datePage.to_continue();
    }

    @Test  // TC-46
    public void test46() throws InterruptedException{
        homePage.to_purchase();
        whyUsPage.lets_continue();
        isFirstTimePage.click_first_time();
        isFromIsraelPage.click_yes();
        whereToPage.click_to();
        whereToPage.to_continue();
        datePage.enter_start();
        datePage.enter_end();
        datePage.to_continue();
        passengersPage.fill_details();
        passengersPage.to_continue();
    }

    @Test // TC-47 covers
    public void test47() throws InterruptedException{
        homePage.to_purchase();
        whyUsPage.lets_continue();
        isFirstTimePage.click_first_time();
        isFromIsraelPage.click_yes();
        whereToPage.click_to();
        whereToPage.to_continue();
        datePage.enter_start();
        datePage.enter_end();
        datePage.to_continue();
        passengersPage.fill_details();
        passengersPage.to_continue();
        coversPage.fill_luggage();
    }

    @Test // TC-48
    public void test48() throws InterruptedException{
        homePage.to_purchase();
        whyUsPage.lets_continue();
        isFirstTimePage.click_first_time();
        isFromIsraelPage.click_yes();
        whereToPage.click_to();
        whereToPage.to_continue();
        datePage.enter_start();
        datePage.enter_end();
        datePage.to_continue();
        passengersPage.fill_details();
        passengersPage.to_continue();
        coversPage.fill_luggage();
        coversPage.to_continue();
    }

    @Test // TC-49
    public void test49() throws InterruptedException{
        homePage.to_purchase();
        whyUsPage.lets_continue();
        isFirstTimePage.click_first_time();
        isFromIsraelPage.click_yes();
        whereToPage.click_to();
        whereToPage.to_continue();
        datePage.enter_start();
        datePage.enter_end();
        datePage.to_continue();
        passengersPage.fill_details();
        passengersPage.to_continue();
        coversPage.fill_luggage();
        coversPage.to_continue();
        specialCoversPage.to_continue();
    }

    @Test // TC-50
    public void test50() throws InterruptedException{
        homePage.to_purchase();
        whyUsPage.lets_continue();
        isFirstTimePage.click_first_time();
        isFromIsraelPage.click_yes();
        whereToPage.click_to();
        whereToPage.to_continue();
        datePage.enter_start();
        datePage.enter_end();
        datePage.to_continue();
        passengersPage.fill_details();
        passengersPage.to_continue();
        coversPage.fill_luggage();
        coversPage.to_continue();
        specialCoversPage.to_continue();
        healthDeclarationPage.to_continue();
    }

    @Test // TC-51
    public void test51() throws InterruptedException{
        homePage.to_purchase();
        whyUsPage.lets_continue();
        isFirstTimePage.click_first_time();
        isFromIsraelPage.click_yes();
        whereToPage.click_to();
        whereToPage.to_continue();
        datePage.enter_start();
        datePage.enter_end();
        datePage.to_continue();
        passengersPage.fill_details();
        passengersPage.to_continue();
        coversPage.fill_luggage();
        coversPage.to_continue();
        specialCoversPage.to_continue();
        healthDeclarationPage.to_continue();
        passengersPage.to_continue();
    }



}
