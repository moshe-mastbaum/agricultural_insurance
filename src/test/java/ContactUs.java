import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

//<div class="insurances-title">איזה פלוס אפשר להציע לך היום?</div>
public class ContactUs extends Base {



    @Test //tc-94
    public void test94() throws InterruptedException{
        homePage.to_contact_us();
    }

    @Test //tc-95
    public void test95() throws InterruptedException{
        homePage.to_contact_us();
        contactUsPage.to_submit();
    }

    @Test //tc-96
    public void test96() throws InterruptedException{
        homePage.to_contact_us();
        contactUsPage.fill_details();
        contactUsPage.to_submit();
    }


}
