package pack1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SolutionActivity1 {

	public static void main(String[] args) throws MalformedURLException {
		
DesiredCapabilities caps=new DesiredCapabilities();
		
		caps.setCapability("automationName","UiAutomator2");
		caps.setCapability("deviceName","Redmi");
		//caps.setCapability("language","fr");
		caps.setCapability("platformName","Android");
		//caps.setCapability("autoWebview","true");
		//caps.setCapability("fullReset","true");
		//caps.setCapability("eventTimings","ture");
		caps.setCapability("platformVersion","7.1.2");
		caps.setCapability("appPackage","com.plunes");
		caps.setCapability("appActivity","com.plunes.MainActivity");
		//caps.setCapability("app","/Users/user/eclipse-workspace/MyTest/APKFiles/Plunes.apk");
		//caps.setCapability("noReset",true);
		
		AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),caps);
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//click on SolutionActivity
		
		driver.findElementByXPath("//android.widget.ImageView[@text='Solution']").click();
		driver.findElementByXPath("//android.view.View[@text='Solution Activity']").click();
		
		
		
		
		
		
	
	}

}
