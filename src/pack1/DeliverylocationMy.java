package pack1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DeliverylocationMy {

	public static void main(String[] args) throws MalformedURLException {
	
		
		DesiredCapabilities dac=new DesiredCapabilities();
		
		dac.setCapability("automationName","UiAutomator2");
		dac.setCapability("deviceName","Redmi");
		dac.setCapability("newCommandTimeout","120");
		dac.setCapability("platformName","Android");
		dac.setCapability("platformVersion","7.1.2");
		dac.setCapability("appPackage","com.grofers.customerapp");
		dac.setCapability("appActivity","com.grofers.customerapp.activities.ActivitySplashScreen");
		dac.setCapability("noReset",true);
						
		AndroidDriver<MobileElement>driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),dac);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElementById("com.grofers.customerapp:id/delivery_location").click();
		
		driver.findElementById("com.grofers.customerapp:id/tv_mylocation").click();
		driver.findElementById("com.grofers.customerapp:id/feedpage_location_change_icon").click();
		
	//driver.findElementById("com.grofers.customerapp:id/search_edittext")
		//driver.findElementById("com.grofers.customerapp:id/item_label").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text='Mansarovar Apartments, Sector 61, Noida']").click();
		

	}

}
