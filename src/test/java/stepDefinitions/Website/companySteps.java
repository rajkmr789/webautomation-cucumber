package stepDefinitions.Website;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static support.World.objCompanyPage;
import static support.World.objDashboardPage;

public class companySteps {
	@And("user enters the GSTIN value and observe all the details are auto populated")
	public void user_enters_the_GSTIN_value_and_observe_all_the_details_are_auto_populated()
			throws InterruptedException {
		objCompanyPage.enterGSTINAndClickOutsideToAutoPopulateData();
	}

	@And("select name, business type and business category and click create company")
	public void select_name_business_type_and_business_category_and_click_next_and_click_create_company()
			throws InterruptedException {
		objCompanyPage.selectNameBusinessTypeAndCategoryAndClickCreateCompany();
	}

	@And("company created is displayed on left navigation options on dashboard page")
	public void company_created_is_displayed_on_left_navigation_options_on_dashboard_page()
			throws InterruptedException {
		objDashboardPage.checkCompanyNameShownOnLeftNav();
	}

	@Then("all the sections on company settings page are loaded")
	public void all_the_sections_on_company_settings_page_are_loaded() {
		objCompanyPage.validateSectionsOnCompanySettingsPage();
	}

	@And("user can update the company settings successfully")
	public void user_can_update_the_company_settings_successfully()
			throws InterruptedException {
		objCompanyPage.updateCompanySettings();
	}

}
