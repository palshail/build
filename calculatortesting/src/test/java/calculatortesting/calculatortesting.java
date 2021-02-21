package calculatortesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class calculatortesting {
	
	public static AppiumDriver<MobileElement> driver;
	public static final String SAUSUSERNAME = "pal_shail88";
	public static final String ACCESSKEY = "f9a86fb4dd6b4ad4aa33b34ff05c3724";
	public static final String URL = "https://" + SAUSUSERNAME + ":" + ACCESSKEY + "@ondemand.us-west-1.saucelabs.com:443/wd/hub";
		
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("platformName", "Android");
		caps.setCapability("deviceName", "Android GoogleAPI Emulator");
		caps.setCapability("platformVersion", "10.0");
		caps.setCapability("deviceOrientation", "portrait");
		caps.setCapability("appiumVersion", "1.16.0");
		caps.setCapability("app", "storage:filename=com.google.android.calculatot.apk");
		
		/*
		 * caps.setCapability(MobileCapabilityType.PLATFORM_NAME,
		 * MobilePlatform.ANDROID);
		 * caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, 10);
		 * caps.setCapability(MobileCapabilityType.DEVICE_NAME, "SM-G960U1");
		 * //caps.setCapability(MobileCapabilityType.UDID, "10ec3c21");
		 * caps.setCapability("appPackage", "com.google.android.calculator");
		 * caps.setCapability("appActivity", "com.android.calculator2.Calculator");
		 * caps.setCapability("onRest", "True");
		 */
	
		URL url1 = new URL(URL);
		driver = new AppiumDriver<MobileElement>(url1,caps);
		
		Thread.sleep(1000);
		MobileElement el1 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_2");
		el1.click();
		MobileElement el2 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_5");
		el2.click();
		MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("multiply");
		el3.click();
		MobileElement el4 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_1");
		el4.click();
		MobileElement el5 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_0");
		el5.click();
		el5.click();
		MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("equals");
		el6.click();

		String outpot = driver.findElementById("com.google.android.calculator:id/result").getText().toString();
		System.out.println(outpot);
		if (outpot.equals("2500"))
		{
			System.out.println("testcase Pass ");
		}else {
			System.out.println("testcas fail");
		}
		
	}

}
