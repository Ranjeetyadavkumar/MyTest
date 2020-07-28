package pack1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class offerZone {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
DesiredCapabilities dac=new DesiredCapabilities();
		
		dac.setCapability("automationName","UiAutomator2");
		dac.setCapability("deviceName","Redmi");
		dac.setCapability("platformName","Android");
		dac.setCapability("platformVersion","7.1.2");
		dac.setCapability("appPackage","com.grofers.customerapp");
		dac.setCapability("appActivity","com.grofers.customerapp.activities.ActivitySplashScreen");
		dac.setCapability("noReset",true);
		
		AndroidDriver<MobileElement>driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),dac);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
	// Creating offer zone script
		
	//	driver.findElementById("com.grofers.customerapp:id/navigation_drawer_icon").click();
		
	//	Thread.sleep(3000);
		
	//	driver.findElementById("com.grofers.customerapp:id/drawer_layout").click();
		
		//Creating the selling item script
		
		
		String TextBt = driver.findElementByXPath("//android.widget.TextView[@text='Best Selling Items']").getText();
       
		System.out.println(TextBt);	
		
		driver.findElementByXPath("//android.widget.TextView[@text='See all']").click();
		driver.findElementById("com.grofers.customerapp:id/product_image").click();
		
		//driver.findElementByXPath("//android.widget.TextView[@text='Try Again']").click();
		
		
		
		
		
	}

}
