import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.qameta.allure.*;

//<div class="insurances-title">איזה פלוס אפשר להציע לך היום?</div>
@Listeners({io.qameta.allure.testng.AllureTestNg.class})
public class ProposalTest extends Base {

    String firstTime = "לא, זאת הפעם הראשונה";
    String fixedPrice = "מחיר הביטוח $27.2";
    String summaryTitle = "סיכום ההצעה";
    int thisStep = 0;
    int previousStep = 1;
    int previous2Step = 2;

    @Test (description = "Verify Continue button exists")// TC-38
    @Description("Open why us and verify Continue button exists")
    public void test38() throws InterruptedException{
        homePage.to_purchase();
        Allure.step("Assertion Check Continue button exists", () -> {
            softAssert.assertTrue(whyUsPage.is_continue_exist(), "Continue button is not present");
        });
        softAssert.assertAll();
    }

    @Test (description = "Verify option you purchased before") // TC-39
    @Description("verify option you purchased before")
    public void test39() throws InterruptedException{
        homePage.to_purchase();
        whyUsPage.lets_continue();
        Allure.step("Assertion Check Why Us text ", () -> {
            softAssert.assertEquals(isFirstTimePage.get_first_time_text(), firstTime, "Mismatch: ");
        });
        softAssert.assertAll();
    }

    @Test (description = "verify yes from israel button exists")// TC-40
    @Description("verify yes from israel button exists")
    public void test40() throws InterruptedException{
        homePage.to_purchase();
        whyUsPage.lets_continue();
        isFirstTimePage.click_first_time();
        Allure.step("Assertion Check yes from israel button exists", () -> {
            softAssert.assertTrue(isFromIsraelPage.is_click_yes_exist(), "yes button is not present");
        });
        softAssert.assertAll();
    }

    @Test (description = "verify id input exists") // TC-41
    @Description("verify id input exists")
    public void test41() throws InterruptedException{
        homePage.to_purchase();
        whyUsPage.lets_continue();
        isFirstTimePage.click_not_first_time();
        Allure.step("Assertion Check id input exists", () -> {
            softAssert.assertTrue(happySeeUAginPage.is_id_input_exist(), "id input not present");
        });
        softAssert.assertAll();
    }

    @Test(description = "verify back home exists")// TC-42
    @Description("verify back home exists")
    public void test42() throws InterruptedException{
        homePage.to_purchase();
        whyUsPage.lets_continue();
        isFirstTimePage.click_first_time();
        isFromIsraelPage.click_no();
        Allure.step("Assertion Check back home exists", () -> {
            softAssert.assertTrue(cannotContinuePage.back_home_btn_exist(), "back home not present");
        });
        softAssert.assertAll();
    }

    @Test (description = "verify color step") // TC-43
    @Description("verify color step")
    public void test43() throws InterruptedException{
        homePage.to_purchase();
        whyUsPage.lets_continue();
        isFirstTimePage.click_first_time();
        isFromIsraelPage.click_yes();
        Allure.step("Assertion color step ", () -> {
            softAssert.assertEquals(stepsErea.get_step_color(thisStep), blue, "Mismatch color");
        });
        softAssert.assertAll();
    }

    @Test (description = "verify color 2 steps") // TC-44
    @Description("verify color 2 steps")
    public void test44() throws InterruptedException{
        homePage.to_purchase();
        whyUsPage.lets_continue();
        isFirstTimePage.click_first_time();
        isFromIsraelPage.click_yes();
        whereToPage.click_to();
        whereToPage.to_continue();

        String color0 = stepsErea.get_step_color(thisStep);
        String color1 = stepsErea.get_step_color(previousStep);

        Allure.step("Assertion Check back home exists", () -> {
            softAssert.assertTrue(color1.equals(blue)&&color0.equals(green)  , "Mismatch color");
        });
        softAssert.assertAll();
    }

    @Test (description = "verify color 3 steps") // TC-45
    @Description("verify color 3 steps")
    public void test45() throws InterruptedException{
        to_date_page();
        String color0 = stepsErea.get_step_color(thisStep);
        String color1 = stepsErea.get_step_color(previousStep);
        String color2 = stepsErea.get_step_color(previous2Step);
        Allure.step("Assertion Check back home exists", () -> {
            softAssert.assertTrue(color2.equals(blue)&&color1.equals(green)&&color0.equals(green)  , "Mismatch color");
        });
        softAssert.assertAll();
    }

    @Test (description = "verify continue button exist") // TC-46
    @Description("verify continue button exist")
    public void test46() throws InterruptedException{
        to_date_page();
        passengersPage.fill_details();
        passengersPage.to_continue();
        Allure.step("Assertion continue button exist", () -> {
            softAssert.assertTrue(coversPage.is_continue_button_exist(), "continue button exist not present");
        });
        softAssert.assertAll();
    }

    @Test (description = "verify insurance price update") // TC-47 covers
    @Description("verify insurance price update")
    public void test47() throws InterruptedException{
        to_date_page();
        passengersPage.fill_details();
        passengersPage.to_continue();
        coversPage.fill_luggage();
        Allure.step("Assertion color step ", () -> {
            softAssert.assertEquals(coversPage.get_insurance_price(), fixedPrice, "Mismatch color");
        });
        softAssert.assertAll();
    }

    @Test (description = "verify extreme sports exist") // TC-48
    @Description("verify extreme sports exist")
    public void test48() throws InterruptedException{
        to_covers_page();
        Allure.step("Assertion extreme sports exist", () -> {
            softAssert.assertTrue(specialCoversPage.check_ExtremeSports_exsit(), "extreme sports not present");
        });
        softAssert.assertAll();
    }

    @Test (description = "verify no health problems button exist") // TC-49
    @Description("verify no health problems button exist")
    public void test49() throws InterruptedException{
        to_covers_page();
        specialCoversPage.to_continue();
        Allure.step("Assertion no health problems button exist", () -> {
            softAssert.assertTrue(healthDeclarationPage.no_health_problems_button_exist(), "no health problems button not present");
        });
        softAssert.assertAll();
    }

    @Test (description = "verify summary title") // TC-50
    @Description("verify summary title")
    public void test50() throws InterruptedException{
        to_covers_page();
        specialCoversPage.to_continue();
        healthDeclarationPage.to_continue();
        Allure.step("Assertion color step ", () -> {
            softAssert.assertEquals(summaryPage.get_title(),summaryTitle, "Mismatch color");
        });
        softAssert.assertAll();
    }

    @Test (description = "verify enter card number exist") // TC-51
    @Description("verify enter card number exist")
    public void test51() throws InterruptedException{
        to_covers_page();
        specialCoversPage.to_continue();
        healthDeclarationPage.to_continue();
        passengersPage.to_continue();
        summaryPage.to_continue();
        Allure.step("Assertion enter card number exist", () -> {
            softAssert.assertTrue(paymentPage.is_enter_card_number_exist(), "enter card number not present");
        });
        softAssert.assertAll();
    }


    //   short steps

    public void to_date_page() throws InterruptedException{
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

    public void to_covers_page() throws InterruptedException{
        to_date_page();
        passengersPage.fill_details();
        passengersPage.to_continue();
        coversPage.fill_luggage();
        coversPage.to_continue();
    }

}
