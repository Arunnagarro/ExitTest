package StepDefination;

import org.testng.Assert;

import BaseTest.BaseClass;
import Hooks.Hook;
import POM.AnimationPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Animation_step extends BaseClass
{
	AnimationPage ap = new AnimationPage(driver);
	public Animation_step()
	{
		Animation_step.driver=Hook.GetDriver();
	}
	
	@Given("^I opened the application$")
	public void i_opened_the_application() throws Throwable {
		String a = ap.Hometext();
	    Assert.assertEquals("API Demos", a);
	    System.out.println("APP IS LAUNCHED");
	    logger.info("Application is Launch for Validate Animation Option");
	}

	@And("I tap on Animation")
	public void i_tap_on_Animation() throws Throwable {
		ap.ClickonAnimation();
		logger.info("Validate Animation");
		Thread.sleep(1000);
	}

	@When("I tap on Default Layout Animations")
	public void i_tap_on_Default_Layout_Animations() throws Throwable {
	   ap.ClickonDefaultLayoutAnimation();
	}

	@Then("I tab on two times ADD BUTTON")
	public void i_tab_on_two_times_ADD_BUTTON() throws Throwable {
	   ap.AddButton();
	}

	@Then("I remove the BUTTON")
	public void i_remove_the_Button() throws Throwable {
	    ap.RemoveButton();
	}
}
