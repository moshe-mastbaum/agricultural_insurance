package flows;

import tests.Base;

public class ProposalFlows {

    //   shorten steps

    public void from_start_to_passengers_page(Base base) throws InterruptedException{
        base.homePage.click_purchase_btn();
        base.whyUsPage.click_lets_continue_btn();
        base.isFirstTimePage.click_first_time_btn();
        base.isFromIsraelPage.click_yes();
        base.whereToPage.click_destintion_box();
        base.whereToPage.click_continue_btn();
        base.datePage.enter_start_date();
        base.datePage.enter_end_date();
        base.datePage.to_continue();
    }

    public void from_start_to_special_covers_page(Base base) throws InterruptedException{
        from_start_to_passengers_page(base);
        base.passengersPage.fill_details();
        base.passengersPage.click_continue_btn();
        base.coversPage.fill_luggage();
        base.coversPage.to_continue();
    }

}
