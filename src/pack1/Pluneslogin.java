package pack1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Pluneslogin {

	public static void main(String[] args) throws MalformedURLException {
		
		
DesiredCapabilities dc=new DesiredCapabilities();
		
		dc.setCapability("automationName","UiAutomator2");
		dc.setCapability("deviceName","Redmi");
		dc.setCapability("platformName","Android");
		dc.setCapability("platformVersion","7.1.2");
		dc.setCapability("appPackage","com.plunes");
		dc.setCapability("appActivity","com.plunes.MainActivity");
		dc.setCapability("noReset",true);
		
		AndroidDriver<MobileElement>driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.ImageView[@text='PROFILE\n" + 
				"Tab 4 of 4']").click();
			
		driver.findElementByXPath("//android.view.View[@text='Edit Profile']").click();
		driver.findElementByXPath("android.widget.Button[@text='Done']").click();
		
		
		
		
		
		
	}

}
