package pack1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class SmartBatchClub {

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
		
//driver.findElementByXPath("//android.widget.TextView[@text='Vegetables & Fruits']").click();

String textx = driver.findElementById("com.grofers.customerapp:id/header_text").getText();
		
		System.out.println(textx);
		
		 //Identify Elememt using Text
		   MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
		"new UiScrollable(new UiSelector().resourceId(\"com.grofers.customerapp:id/view_all_button\")).scrollIntoView("
		+ "new UiSelector().text(\"See all\"))"));
		   element.click();
		   
		   String textu = driver.findElementById("com.grofers.customerapp:id/product_offer").getText();
		   System.out.println(textu);
		   String testg = driver.findElementById("com.grofers.customerapp:id/product_mrp").getText();
		   System.out.println(testg);
		   String gtyr = driver.findElementById("com.grofers.customerapp:id/txt_sbc_price").getText();
		   	   System.out.println(gtyr);
		   	   String testy = driver.findElementById("com.grofers.customerapp:id/product_non_member_price").getText();
		   	   System.out.println(testy);
		   	   
		   	   String ghty = driver.findElementById("com.grofers.customerapp:id/product_name").getText();
		   	   System.out.println(ghty);
		   	 String Tesb = driver.findElementById("com.grofers.customerapp:id/units").getText();
		   	   System.out.println(Tesb);
		   	   driver.findElementById("com.grofers.customerapp:id/product_layout").click();
		   	   driver.findElementById("com.grofers.customerapp:id/tv_add").click();
		   	 
		   	   TouchAction action = new TouchAction(driver);
		   	  action.longPress(longPressOptions);
		   	   action.perform();
		   	   
		   	   
		   	   
//		   	   driver.findElementById("com.grofers.customerapp:id/btn_increase_product_count").click();
//		   	   driver.findElementById("com.grofers.customerapp:id/btn_decrease_product_count").click();
		   List<MobileElement> elet = driver.findElementsByAccessibilityId("com.grofers.customerapp:id/footer_parent");
		   	   
		   	   
		   	   
//driver.findElementByXPath("//android.widget.TextView[@text='View More']").click();
//driver.findElementByXPath("//android.widget.TextView[@text='View Less']").click();
		   
		   //driver.findElementById("com.grofers.customerapp:id/view_all_button").click();
		   
		   

		
		

	}

}
