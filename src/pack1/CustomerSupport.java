package pack1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CustomerSupport {

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
		
		// create the script for customer support
		
		//Identify Elememt using Text
		   MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
		"new UiScrollable(new UiSelector().resourceId(\"com.grofers.customerapp:id/root_view\")).scrollIntoView("
		+ "new UiSelector().text(\"Customer Support\"))"));
		   element.click();
		   
		   
    String prq = driver.findElementById("com.grofers.customerapp:id/help_group_textview").getText();

     System.out.println(prq);
     
     //creatimg back button script
     
     driver.findElementById("com.grofers.customerapp:id/button_help").click();
    driver.findElementByXPath("//android.view.View[@text='i']").click();
    //driver.findElementsByAccessibilityId("Navigate up").click();
    driver.findElementByAccessibilityId("Navigate up").click();
	 
		/*String gttext = driver.findElementByXPath("//assets/images/login/first_user.png[@text='Hi, welcome to Grofers!\n" + 
		 		"']").getText();
		 
		 System.out.println(gttext);
		 
		String gtext = driver.findElementByXPath("//android.view.View[@text='Please select one issue.\n" + 
		 		"']").getText();
		System.out.println(gtext);
		driver.findElementById("joe-radio-1").click();
		driver.findElementById("joe-radio-2").click();
		*/ 
		 
		 
    
    
	
	}

}
