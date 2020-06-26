package stepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefination {
	
	@Given("^user is on netbanking landing page$")
	public void user_is_on_netbanking_landing_page(){
	
		System.out.println("user is on netbanking landing page");
	}
	

	@When("^user is login using username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_is_login_using_username_and_password(String str1,String str2){
		
		System.out.println("user is login using username and password");
		
	}
	
	@Then("^Home page is populated$")
	public void Home_page_is_populated(){
		
		System.out.println("Home page is populated");
	}
	
	@And("^Cards displayed \"([^\"]*)\"$")
    public void cards_are_displayed(String str3) throws Throwable {
       
		System.out.println("Cards are displayed");
		
    }
	
	
};
