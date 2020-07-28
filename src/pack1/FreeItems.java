package pack1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class FreeItems {

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
				
				// create Menu script
				
						driver.findElementById("com.grofers.customerapp:id/navigation_drawer_icon").click();
				
				
				//Identify Element using Text
				   MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.grofers.customerapp:id/root_view\")).scrollIntoView("
				+ "new UiSelector().text(\"Free items\"))"));
				   element.click();
				   
				   
				 String tttxe = driver.findElementByXPath("//android.widget.TextView[@text='Ask your friend to use the code below at Sign Up']").getText();

				System.out.println(tttxe);		
				
				driver.findElementByAccessibilityId("Navigate up").click();
							 
	}

}
