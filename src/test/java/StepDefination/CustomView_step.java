package StepDefination;

import org.testng.Assert;
import POM.CustomPage;

import BaseTest.BaseClass;
import Hooks.Hook;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CustomView_step extends BaseClass{
	CustomPage Ac= new CustomPage(driver);
	//ResuableMethods swipe;
	public CustomView_step() {
		CustomView_step.driver=Hook.GetDriver(); 	
    }
	
	@Given("I open the application")
	public void i_open_the_application() {
		String s = Ac.Hometext();
	    Assert.assertEquals("API Demos", s);
	    System.out.println("APP IS LAUNCHED");
	    logger.info("Application is Launch for Validate Accessibility option");
	}

	@When("I tap on Accessibility")
	public void i_tap_on_accessibility() {
	    Ac.ClickonAccessibility();
	}

	@Then("I validate Custom View")
	public void i_validate_custom_view() {
		Ac.ClickonCustonView();
	}
	

}
