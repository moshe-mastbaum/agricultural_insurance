import Pageobject.HomePage;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class IsCarInsurence  extends Base{

    @Test (description = "Verify  not found message") //tc-54
    @Description("verify not found message")
    public void test54() throws InterruptedException {
        homePage.to_is_car_insurence();
        insuranceCheckPage.check_license("12345678");
        Allure.step("Assertion not found message", () -> {
            softAssert.assertEquals(insuranceCheckPage.get_message_search(),"לא נמצא ביטוח בתוקף עבור הנתונים שהוזנו", "not expcted message");
        });
        softAssert.assertAll();
    }

    @Test // TC-55
    public void test55() throws InterruptedException {
        homePage.to_is_car_insurence();
        insuranceCheckPage.check_license("23652125");
        Allure.step("Assertion not found message", () -> {
            softAssert.assertEquals(insuranceCheckPage.get_message_search(),"בתאריך 01/05/2025 נמצא ביטוח תקף לרכב שמספרו 23652125 בביטוח חקלאי", "not expcted message");
        });
        softAssert.assertAll();
    }
}
