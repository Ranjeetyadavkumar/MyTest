package pack1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;


public class LaunchMenu {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
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
	Thread.sleep(5000);

	driver.findElementById("com.grofers.customerapp:id/navigation_drawer_icon").click();
		
		/*driver.findElementById("com.grofers.customerapp:id/root_view").click();
		driver.findElementById("com.grofers.customerapp:id/et_enter_phone").sendKeys("7303830763");
		driver.findElementById("com.grofers.customerapp:id/next_button").click();
		driver.findElementById("com.grofers.customerapp:id/et_enter_code").sendKeys("5678");
		driver.findElementById("com.grofers.customerapp:id/next_button").click();
		*/
		
		//Thread.sleep(3000);
	//driver.findElementById("com.grofers.customerapp:id/text").click();
		//driver.findElementByXPath("//android.widget.TextView[@text='WinWin Points']");
	
		//Identify Elememt using Text
   MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
"new UiScrollable(new UiSelector().resourceId(\"com.grofers.customerapp:id/root_view\")).scrollIntoView("
+ "new UiSelector().text(\"About Us\"))"));
   element.click();

   //Perform the action on the element

   //System.out.println(element.getLocation());
	
		
		
	}

}
