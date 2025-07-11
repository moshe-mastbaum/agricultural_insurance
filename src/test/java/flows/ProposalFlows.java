package flows;

import Pageobject.*;
import org.openqa.selenium.WebDriver;


public class ProposalFlows   {
    private final WebDriver driver;
    private final HomePage homePage;
    private final WhyUsPage whyUsPage;
    private final IsFirstTimePage isFirstTimePage;
    private final IsFromIsraelPage isFromIsraelPage;
    private final WhereToPage whereToPage;
    private final DatePage datePage;
    private final PassengersPage passengersPage;
    private final CoversPage coversPage;

    public ProposalFlows(WebDriver driver,
                         HomePage homePage,
                         WhyUsPage whyUsPage,
                         IsFirstTimePage isFirstTimePage,
                         IsFromIsraelPage isFromIsraelPage,
                         WhereToPage whereToPage,
                         DatePage datePage,
                         PassengersPage passengersPage,
                         CoversPage coversPage) {
        this.driver = driver;
        this.homePage = homePage;
        this.whyUsPage = whyUsPage;
        this.isFirstTimePage = isFirstTimePage;
        this.isFromIsraelPage = isFromIsraelPage;
        this.whereToPage = whereToPage;
        this.datePage = datePage;
        this.passengersPage = passengersPage;
        this.coversPage = coversPage;
    }
    //   short steps

    public void from_start_to_passengers_page() throws InterruptedException{
        homePage.click_purchase_btn();
        whyUsPage.click_lets_continue_btn();
        isFirstTimePage.click_first_time_btn();
        isFromIsraelPage.click_yes();
        whereToPage.click_destintion_box();
        whereToPage.click_continue_btn();
        datePage.enter_start_date();
        datePage.enter_end_date();
        datePage.to_continue();
    }

    public void from_start_to_special_covers_page() throws InterruptedException{
        from_start_to_passengers_page();
        passengersPage.fill_details();
        passengersPage.click_continue_btn();
        coversPage.fill_luggage();
        coversPage.to_continue();
    }

}
