import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

//<div class="insurances-title">איזה פלוס אפשר להציע לך היום?</div>
public class ContactUs extends Base {


    @Test (description = "Verify  full name exists")// TC-94
    @Description("verify  full name exists")
    public void test94() throws InterruptedException{
        homePage.to_contact_us();
        Allure.step("Assertion Check full name exists", () -> {
            softAssert.assertTrue(contactUsPage.full_name_exist(), "full name is not present");
        });
        softAssert.assertAll();
    }

    @Test (description = "Verify  eror message exists") //tc-95
    @Description("verify  eror message exists")
    public void test95() throws InterruptedException{
        homePage.to_contact_us();
        contactUsPage.to_submit();
        Allure.step("Assertion eror message exists", () -> {
            softAssert.assertTrue(contactUsPage.full_name_exist(), "eror message is not present");
        });
        softAssert.assertAll();
    }

    @Test //tc-96
    public void test96() throws InterruptedException{
        homePage.to_contact_us();
        contactUsPage.fill_details();
        contactUsPage.to_submit();
        Allure.step("Assertion eror message exists", () -> {
            softAssert.assertEquals(contactUsPage.get_thanks_message(),"תודה", "eror message is not present");
        });
        softAssert.assertAll();
    }




}
