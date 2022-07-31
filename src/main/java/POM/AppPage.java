package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AppPage 
{
	public AppiumDriver<MobileElement> driver=null;
	public AppPage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	    this.driver=driver;
	}
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	public WebElement APIDemostext;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]")
	public WebElement app_button;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]")
	public WebElement ActionBar_button;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[5]")
	public WebElement DisplayOptions_button;
	
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Button[6]")
	public WebElement NAVIGATION_button;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Button[4]")
	public WebElement DISPLAYSHOWTITLE_button;
	
	
	public String Hometext()
	{
		String b = APIDemostext.getText();
		return b;
	}
	
	public void ClickonApp()
	{
		app_button.click();
	}
	public void ClickonActionBar()
	{
		ActionBar_button.click();
	}
	public void ClickonDisplayOptions()
	{
		DisplayOptions_button.click();
	}
	public void ClickonNAVIGATION()
	{
		NAVIGATION_button.click();
	}
	public void ClickonDISPLAYSHOWTITLE()
	{
		DISPLAYSHOWTITLE_button.click();
	}
}
