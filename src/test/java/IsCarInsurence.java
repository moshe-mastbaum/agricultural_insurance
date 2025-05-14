import Pageobject.HomePage;
import org.testng.annotations.Test;

public class IsCarInsurence  extends Base{

    @Test // TC-54
    public void test54() throws InterruptedException {
        System.out.println("test2");
        homePage.to_is_car_insurence();
        insuranceCheckPage.check_license("12345678");
    }

    @Test // TC-55
    public void test55() throws InterruptedException {
        System.out.println("test2");
        homePage.to_is_car_insurence();
        insuranceCheckPage.check_license("23652125");
    }
}
