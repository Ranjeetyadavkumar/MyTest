package pack1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LuanchApp {


	public static void main(String[] args) throws MalformedURLException 
	{
		DesiredCapabilities caps=new DesiredCapabilities();
		
		caps.setCapability("automationName","UiAutomator2");
		caps.setCapability("deviceName","OPPO A1k");
		//caps.setCapability("language","fr");
		caps.setCapability("platformName","Android");
		//caps.setCapability("autoWebview","true");
		//caps.setCapability("fullReset","true");
		//caps.setCapability("eventTimings","ture");
		caps.setCapability("platformVersion","9");
		caps.setCapability("appPackage","com.plunes");
		caps.setCapability("appActivity","com.plunes.MainActivity");
		//caps.setCapability("app","/Users/user/eclipse-workspace/MyTest/APKFiles/Plunes.apk");
		//caps.setCapability("noReset",true);
		
		AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),caps);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.Button[@text='NEXT']").click();
		driver.findElementByXPath("//android.widget.Button[@text='NEXT']").click();
		//driver.findElementByXPath("//android.widget.Button[@text='NEXT']").click();
		//driver.findElementByXPath("//android.widget.Button[@text='NEXT']").click();
		//driver.findElementsByXPath("//android.wideget.Button[@text='DONE']"))).click();
		driver.closeApp();		
	}
	
}
	