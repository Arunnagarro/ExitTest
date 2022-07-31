package StepDefination;

import org.testng.Assert;

import BaseTest.BaseClass;
import Hooks.Hook;
import POM.AppPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class App_step extends BaseClass {
	
	AppPage app = new AppPage(driver);
	
	public App_step()
	{
		App_step.driver=Hook.GetDriver();
	}
	
	@Given("^I opened the Application$")
	public void i_opened_the_application() throws Throwable {
		String b = app.Hometext();
	    Assert.assertEquals("API Demos", b);
	    System.out.println("APP IS LAUNCHED");
	    logger.info("Application is Launch for Validate App Option");
	}
	@Given("^I tab on App option$")
	public void i_tab_on_App_option() throws Throwable {
	   app.ClickonApp();
	   //logger.info("Validate App");
	}

	@When("^I click on Action Bar option$")
	public void i_click_on_Action_Bar_option() throws Throwable {
	   app.ClickonActionBar();
	}

	@When("^I tab on Display Options$")
	public void i_tab_on_Display_Options() throws Throwable {
	    app.ClickonDisplayOptions();
	}

	@Then("^I click on NAVIGATION$")
	public void i_click_on_NAVIGATION() throws Throwable {
	    app.ClickonNAVIGATION();
	}

	@Then("^click on DISPLAY_SHOW_TITLE$")
	public void click_on_DISPLAY_SHOW_TITLE() throws Throwable {
	    app.ClickonDISPLAYSHOWTITLE();
	}
}
