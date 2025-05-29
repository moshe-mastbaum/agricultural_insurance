import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class IsCarInsurence  extends Base{

    String badLicenseNumber = "12345678";
    String goodLicenseNumber = "23652125";
    String found = "בתאריך 01/05/2025 נמצא ביטוח תקף לרכב שמספרו 23652125 בביטוח חקלאי";
    String notFound = "לא נמצא ביטוח בתוקף עבור הנתונים שהוזנו";


    @Test (description = "Verify  not found message") //TC-54
    @Description("verify not found message")
    public void test54() throws InterruptedException {
        homePage.to_is_car_insurence();
        insuranceCheckPage.check_license(badLicenseNumber);
        Allure.step("Assertion not found message", () -> {
            softAssert.assertEquals(insuranceCheckPage.get_message_search(),notFound, "not expected message");
        });
        softAssert.assertAll();
    }

    @Test (description = "Verify found message") //TC-55
    @Description("verify found message")
    public void test55() throws InterruptedException {
        homePage.to_is_car_insurence();
        insuranceCheckPage.check_license(goodLicenseNumber);
        Allure.step("Assertion not found message", () -> {
            softAssert.assertEquals(insuranceCheckPage.get_message_search(),found, "not expected message");
        });
        softAssert.assertAll();
    }
}
