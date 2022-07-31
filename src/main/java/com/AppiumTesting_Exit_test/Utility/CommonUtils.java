package com.AppiumTesting_Exit_test.Utility;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CommonUtils {
	DesiredCapabilities capabilities = new DesiredCapabilities();
	AppiumDriver<MobileElement> driver;

	public void setAndroidCapabilities()
	{
		//Set capabilities
		File appdir = new File("APK File");		
		File app = new File(appdir, "API_Demos.apk");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		capabilities.setCapability(MobileCapabilityType.APP, "/ExitTest/APK File/API_Demos.apk");		
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
	}
	
	public AppiumDriver<MobileElement> getAndroidDriver() throws MalformedURLException
	{
		return driver =  new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		
	}

}
