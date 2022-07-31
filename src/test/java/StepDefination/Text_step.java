package StepDefination;

import org.testng.Assert;

import BaseTest.BaseClass;
import Hooks.Hook;
import POM.TextPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Text_step extends BaseClass {
	
	TextPage tp=new TextPage(driver);
	
	public Text_step()
	{
		Text_step.driver=Hook.GetDriver();
	}
	
	@Given("^I launching the App$")
	public void i_launching_the_App() throws Throwable {
		String p = tp.Hometext();
	    Assert.assertEquals("API Demos", p);
	    System.out.println("APP IS LAUNCHED");
	    logger.info("Application is Launch for Validate Text option");
	    
	}

	@Given("^I scrolling the screen$")
	public void i_scrolling_the_screen() throws Throwable {
	    tp.scrolling();
	    logger.info("Scrolling the screen");
	}

	@When("^I click on Text option$")
	public void i_click_on_Text_option() throws Throwable {
	    tp.ClickonText();
	}

	@When("^I tab on LogTextBox$")
	public void i_tab_on_LogTextBox() throws Throwable {
		tp.ClickonLogTextBox();
	    
	}

	@Then("^I click on Add button tow times$")
	public void i_click_on_Add_button_tow_times() throws Throwable {
	   tp.ClickonADD();
	}

}
