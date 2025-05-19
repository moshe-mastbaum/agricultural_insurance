import Pageobject.IsFirstTimePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import io.qameta.allure.*;
import io.qameta.allure.Step;
import org.testng.Assert;
//<div class="insurances-title">איזה פלוס אפשר להציע לך היום?</div>
@Listeners({io.qameta.allure.testng.AllureTestNg.class})
public class ProposalTest extends Base {

    @Test (description = "Verify why us")// TC-38
    @Description("Open why us and verify text is correct")
    public void test38() throws InterruptedException{
//        SoftAssert softAssert = new SoftAssert();
        homePage.to_purchase();
//        checkEqualString(() -> whyUsPage.why_us_text(), "למה כדאי אצלי1נו?");
//        checkBoolean(() -> whyUsPage.is_continue_exist());
//        Assert.assertEquals(whyUsPage.why_us_text(), "למה כדאי אצלינו?");
//        Assert.assertTrue(whyUsPage.is_continue_exist());

        Allure.step("Assertion 1: Check Why Us text ", () -> {
            softAssert.assertEquals(whyUsPage.why_us_text(), "למה כדאי אצלינו1?", "Mismatch: ");

        });

        Allure.step("Assertion 2: Check Continue button exists", () -> {
            softAssert.assertTrue(whyUsPage.is_continue_exist(), "Continue button is not present");

        });

        softAssert.assertAll();
        // Soft assertions
//        @Step("text  Why Us ")
//        softAssert.assertEquals(whyUsPage.why_us_text(), "למה כדאי אצלינו?", "Mismatch in 'Why Us' text");
//        softAssert.assertTrue(whyUsPage.is_continue_exist(), "'Continue' element is missing");
//
//        // This will collect and throw any failures
//        softAssert.assertAll();


//        verifyWhyUsText3(whyUsPage.why_us_text(), softAssert);
//        verifyWhyUsText4(whyUsPage.why_us_text(), softAssert);
        // Step 2: Check continue button exists

//        verifyContinueExists(whyUsPage.is_continue_exist(), softAssert);

        // Final check
//        softAssert.assertAll();

//        try {
//            String text1 = whyUsPage.why_us_text();
//            Assert.assertEquals(text1, "למה כדאי אצלינו?");
//            System.out.println("header: " + text1);
//            test.log(Status.PASS, "Test Passed");
//        }
//        catch (AssertionError e) {
//            // Handle AssertionError in case the assertion fails
//            String msg = e.getMessage().replace('<',' ').replace('>',' ');
//            System.out.println("Assertion error: " + msg);
//            test.log(Status.FAIL, "Test Failed - Assertion failed: "+msg );
//        }


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
