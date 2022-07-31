package ReusableMethods;


import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

import static io.appium.java_client.touch.TapOptions.tapOptions;

import static io.appium.java_client.touch.offset.ElementOption.element;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import static io.appium.java_client.touch.offset.PointOption.point;

import static io.appium.java_client.touch.WaitOptions.waitOptions;

import static java.time.Duration.ofMillis;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.Dimension;

import BaseTest.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
public class ResuableMethods extends BaseClass
{
	
     public ResuableMethods(AppiumDriver<MobileElement> driver) 
     {
    	 this.driver = driver;
     }
     
		//for Virtical Swipe     
		public void VerticalSwipeByPercentage(Double StartPercentage , Double EndPercentage , Double AnchorPercentage) 
		{
				
				Dimension size = driver.manage().window().getSize();
				int Anchor = (int)(size.width * AnchorPercentage);
				int StartPoint = (int)(size.height * StartPercentage);
				int EndPoint = (int)(size.height * EndPercentage);
				
				new TouchAction(driver).press(point(Anchor,StartPoint)).waitAction(waitOptions(ofMillis(1000))).moveTo(point(Anchor,EndPoint)).release().perform();
		}
		
		//For Horizontally Swipe
		public void HorizontalSwipeByPercentage(Double StartPercentage , Double EndPercentage , Double AnchorPercentage) 
		{
				
				Dimension size = driver.manage().window().getSize();
				int Anchor = (int)(size.width * AnchorPercentage);
				int StartPoint = (int)(size.height * StartPercentage);
				int EndPoint = (int)(size.height * EndPercentage);
				
				new TouchAction(driver).press(point(StartPoint,Anchor)).waitAction(waitOptions(ofMillis(1000))).moveTo(point(EndPoint,Anchor)).release().perform();
		
		}
}
