package tests;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class ContactUs extends Base {

    String thanksText = "תודה";

    @Test (description = "Verify  full name exists")// TC-94
    @Description("verify  full name exists")
    public void test94() throws InterruptedException{
        homePage.to_contact_us();
        Allure.step("Assertion Check full name exists", () -> {
            softAssert.assertTrue(contactUsPage.full_name_exist(), "result is not present");
        });
        softAssert.assertAll();
    }

    @Test (description = "Verify  error message exists") //tc-95
    @Description("verify  error message exists")
    public void test95() throws InterruptedException{
        homePage.to_contact_us();
        contactUsPage.to_submit();
        Allure.step("Assertion error message exists", () -> {
            softAssert.assertTrue(contactUsPage.full_name_exist(), "result is steel present");
        });
        softAssert.assertAll();
    }

    @Test (description = "Verify thanks message") //tc-96
    @Description("verify thanks message")
    public void test96() throws InterruptedException{
        homePage.to_contact_us();
        contactUsPage.fill_details();
        contactUsPage.to_submit();
        Allure.step("Assertion thanks message", () -> {
            softAssert.assertEquals(contactUsPage.get_thanks_message(),thanksText, "thanks is not present");
        });
        softAssert.assertAll();
    }
}
