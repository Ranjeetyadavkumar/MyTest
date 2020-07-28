package pack1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AboutUS {

	public static void main(String[] args) throws MalformedURLException {
	
DesiredCapabilities dac=new DesiredCapabilities();
		
		dac.setCapability("automationName","UiAutomator2");
		dac.setCapability("deviceName","QCA6UC45CUOZQW99");
		dac.setCapability("newCommandTimeout","120");
		dac.setCapability("platformName","Android");
		dac.setCapability("platformVersion","9");
		dac.setCapability("appPackage","com.coalshastralive.android.app");
		dac.setCapability("appActivity","com.coalshastralive.android.app.activity.Login_Activity");
		dac.setCapability("noReset",true);
		
		AndroidDriver<MobileElement>driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),dac);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		/*// create Menu script
		
				driver.findElementById("com.grofers.customerapp:id/navigation_drawer_icon").click();
		
		
		//Identify Elememt using Text
		   MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
		"new UiScrollable(new UiSelector().resourceId(\"com.grofers.customerapp:id/root_view\")).scrollIntoView("
		+ "new UiSelector().text(\"About Us\"))"));
		   element.click();
		   
		   driver.findElementByAccessibilityId("Navigate up").click();
		
		   //creating script for privacy and policies
		   
		   driver.findElementByXPath("//android.widget.TextView[@text='Privacy Policy']").click();
		   driver.findElementByAccessibilityId("Navigate up").click();
		
		   
		   //Terms and conditation
		   
		   driver.findElementByXPath("//android.widget.TextView[@text='Terms & Conditions']").click();
		    driver.findElementByAccessibilityId("Navigate up").click();
		    
		    */
	}

}
