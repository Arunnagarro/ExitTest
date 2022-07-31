package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AnimationPage {
	public AppiumDriver<MobileElement> driver=null;
	public AnimationPage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	    this.driver=driver; 
	}
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	public WebElement APIDemostext;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]")
	public WebElement Animation_button;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[4]")
	public WebElement DefaultLayoutAnimation;
	
	@AndroidFindBy(id="demo.fun.com.apis:id/addNewButton")
	public WebElement AddButton;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.GridLayout/android.widget.Button[1]")
	public WebElement removebutton1;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.GridLayout/android.widget.Button")
	public WebElement removebutton2;
	
	public String Hometext()
	{
		String a = APIDemostext.getText();
		return a;
	}
	public void ClickonAnimation()
	{
		Animation_button.click();
	}
	public void ClickonDefaultLayoutAnimation()
	{
		DefaultLayoutAnimation.click();
	}
	public void AddButton()
	{
		AddButton.click();
		AddButton.click();
	}
	public void RemoveButton()
	{
		removebutton1.click();
		removebutton2.click();
	}

}
