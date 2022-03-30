package Steps;

import Common.GooglebaseHeist;
import Pages.PageObjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GooglesearchSteps extends GooglebaseHeist{
	
	
	
	@Given("I am on google homepage")
	public void i_am_on_google_homepage() {
		
		lanuchBrowser();
		//closePopup();
	    
	}

	@When("I enter search {string}")
	public void i_enter_search(String string) {
		// step:1 identify the web element and give the element a name 
		//8 locators: id, name, tag, class linktext, partial, xpath, Css-Selector. 
		
		PageObjects po = new PageObjects(driver);
		po.entersearch(string);
		
	   
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
		
		PageObjects po = new PageObjects(driver);
		po.clickSearch();
		
	    
	}

	@Then("I receive related result return")
	public void i_receive_related_result_return() {
	    
		PageObjects po = new PageObjects(driver);
		po.resultStats();
		
		
		driver.close();
	}

	

}
