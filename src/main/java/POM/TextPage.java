package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import ReusableMethods.ResuableMethods;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TextPage {
	

	public AppiumDriver<MobileElement> driver=null;
	public TextPage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	    this.driver=driver; 
	   
	}
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	public WebElement APIDemostext;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[9]")
	public WebElement Text_button;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]")
	public WebElement LogTextBox_button;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Button[1]")
	public WebElement ADD_button;
	
	public String Hometext()
	{
		String p = APIDemostext.getText();
		return p;
	}
	public void scrolling()
	{
		ResuableMethods vsp=new ResuableMethods(driver);
		vsp.VerticalSwipeByPercentage(0.70,0.10,0.50);
	}
	public void ClickonText()
	{
		Text_button.click();
	}
	
	public void ClickonLogTextBox()
	{
		LogTextBox_button.click();
	}
	public void ClickonADD()
	{
		ADD_button.click();
		ADD_button.click();
	}
}
