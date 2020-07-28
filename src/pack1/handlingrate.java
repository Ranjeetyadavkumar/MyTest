package pack1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class handlingrate {

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

//String trate = driver.findElementById("com.grofers.customerapp:id/title").getText();
		//System.out.println(trate);
	List<MobileElement> puptext = driver.findElementsByAccessibilityId("android.widget.FrameLayout");
	System.out.println(puptext);
		
		//driver.findElementsByAccessibilityId("android.widget.FrameLayout");	
		
	//	String diid = driver.findElementById("com.grofers.customerapp:id/body").getText();
	//	System.out.println(diid);
//		driver.findElementById("com.grofers.customerapp:id/button_positive").click();
		
		
		
		
	}

}
