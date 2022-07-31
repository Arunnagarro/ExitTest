package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import ReusableMethods.ResuableMethods;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ViewsPage {
	public AppiumDriver<MobileElement> driver=null;
	public ViewsPage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	    this.driver=driver; 
	}
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	public WebElement APIDemostext;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[10]")
	public WebElement Views_button;
	
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]")
	public WebElement Animation_button;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]")
	public WebElement Transition_button;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]")
	public WebElement Lyon_button;
	

	
	public String Hometext()
	{
		String a = APIDemostext.getText();
		return a;
	}
	
	public void swipe()
	{
		ResuableMethods vsp=new ResuableMethods(driver);
		vsp.VerticalSwipeByPercentage(0.70,0.10,0.50);
	}
	public void ClickonViews()
	{
		Views_button.click();
	}
	public void ClickonAnimation()
	{
		Animation_button.click();
	}
	public void ClickonTransition()
	{
		Transition_button.click();
	}
	public void ClickonLyon()
	{
		Lyon_button.click();
	}

}
