import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

//<div class="insurances-title">איזה פלוס אפשר להציע לך היום?</div>
public class FindDocuments extends Base {

    @Test (description = "Verify  open search") //tc-58
    @Description("verify open search")
    public void test58() throws InterruptedException{
        homePage.to_find_documents();
        findDocumentsPage.find_open_text();
        Allure.step("Assertion result", () -> {
            softAssert.assertTrue(findDocumentsPage.check_result(), "result is not present");
        });
        softAssert.assertAll();
    }

    @Test (description = "Verify  cleaning") //tc-59
    @Description("verify cleaning")
    public void test59() throws InterruptedException{
        homePage.to_find_documents();
        findDocumentsPage.find_by_choos();
        Allure.step("Assertion cleaning", () -> {
            softAssert.assertTrue(!findDocumentsPage.check_result(), "result is steel present");
        });
        softAssert.assertAll();
    }


}
