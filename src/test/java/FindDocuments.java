import org.testng.annotations.Test;

//<div class="insurances-title">איזה פלוס אפשר להציע לך היום?</div>
public class FindDocuments extends Base {

    @Test //TC-58   לא עובד
    public void test54() throws InterruptedException{
        homePage.to_find_documents();
        findDocumentsPage.find_open_text();
    }

    @Test //TC-59
    public void test59() throws InterruptedException{
        homePage.to_find_documents();
        findDocumentsPage.find_by_choos();
    }


}
