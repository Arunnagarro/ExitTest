package BaseTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.AppiumTesting_Exit_test.Utility.ScreenShot;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BaseClass {

	public static AppiumDriver<MobileElement> driver;
	public static File file;
	public static FileInputStream fis;
	public static Properties prop;
	
	
	
	static
	{
		try 
		{
			file = new File("./Resources/config.Properties");
			fis = new FileInputStream(file);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}	
		prop = new Properties();
		try 
		{
			prop.load(fis);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	static
	{ 
		String log4jConfigFile = System.getProperty("user.dir") +
			File.separator + "./Resources/log4j2.xml";

			Configurator.initialize(null,log4jConfigFile);
			}
			public static Logger logger = LogManager.getLogger(BaseClass.class.getName());
	
}
