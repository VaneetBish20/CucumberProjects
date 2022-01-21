package stepdefinitions;

import com.pages.ToTestMoJPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ToTestMoJSteps {
	
	private ToTestMoJPage toMOJ = new ToTestMoJPage(DriverFactory.getDriver());
	
	@Given("User logged in MOJ")
	public void user_logged_in_moj() {
		DriverFactory.getDriver().get("https://www.gov.uk/government/organisations/ministry-of-justice");
	    
	}

	@When("User clicked on Organisation")
	public void user_clicked_on_organisation() {
		toMOJ.clickOrg();
	   
	}

	@Then("User vaidate the title")
	public void user_vaidate_the_title_text() {
		toMOJ.VerifyText();
			
	    
	}

}
