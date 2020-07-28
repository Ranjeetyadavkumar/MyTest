package pack1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SolutionActivity {

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
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		
		//creating home page Script
		
		driver.findElementByXPath("//android.widget.Button[@text='NEXT']").click();
		driver.findElementByXPath("//android.widget.Button[@text='NEXT']").click();
		driver.findElementByXPath("//android.widget.Button[@text='DONE']").click();
		driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
		
		
		//Creating login and password
	
   	driver.findElementByXPath("//android.widget.EditText[@text='Phone No or Email id']").sendKeys("8471040953");
    driver.findElementByXPath("//android.widget.EditText[@text='Password']").sendKeys("12345678");
	driver.findElementByXPath("//android.widget.Button[@text='Login']").click();

	
		
		

	}

}
