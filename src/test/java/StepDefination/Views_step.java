package StepDefination;

import org.testng.Assert;

import BaseTest.BaseClass;
import Hooks.Hook;
import POM.ViewsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Views_step extends BaseClass {
	
	ViewsPage vp=new ViewsPage(driver);
	
	public Views_step()
	{
		Animation_step.driver=Hook.GetDriver();
	}
	
	@Given("^I Start the app$")
	public void i_Start_the_app() throws Throwable {
		String a = vp.Hometext();
	    Assert.assertEquals("API Demos", a);
	    System.out.println("APP IS LAUNCHED");
	    logger.info("Application is Launch for Validate Views option");
	}

	@Given("^I swipe the screen Vertically$")
	public void i_swipe_the_screen_Vertically() throws Throwable {
	   vp.swipe();
	}

	@When("^I tab on Views$")
	public void i_tab_on_Views() throws Throwable {
	   vp.ClickonViews();
	}

	@When("^I click on Animation$")
	public void i_click_on_Animation() throws Throwable {
	    vp.ClickonAnimation();
	}

	@When("^I click on Transition$")
	public void i_click_on_Transition() throws Throwable {
	   vp.ClickonTransition();
	}

	@Then("^I tab on Lyon$")
	public void i_tab_on_Lyon() throws Throwable {
	    vp.ClickonLyon();
	}

}
