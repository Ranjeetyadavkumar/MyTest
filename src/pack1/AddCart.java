package pack1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AddCart {

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
		
		
		//Creatig add cart script
     driver.findElementById("com.grofers.customerapp:id/cart_icon").click();
//     String text = driver.findElementById("com.grofers.customerapp:id/layout_no_resource_title").getText();
//     
//		System.out.println(text);
//		
//		String text1 = driver.findElementById("com.grofers.customerapp:id/layout_no_resource_text").getText();
//		
//		System.out.println(text1);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Start Shopping']").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text='Categories']").click();
		
		//driver.findElementById("com.grofers.customerapp:id/header").click();
		driver.findElementById("com.grofers.customerapp:id/close").click();
		
		driver.findElementById("com.grofers.customerapp:id/category_name").click();
		driver.findElementById("com.grofers.customerapp:id/rl_root").click();
		driver.findElementById("com.grofers.customerapp:id/product_layout").click();
		String OFFText = driver.findElementById("com.grofers.customerapp:id/product_offer").getText();
		System.out.println(OFFText);
		String jarText = driver.findElementById("com.grofers.customerapp:id/tv_product_name").getText();
		System.out.println(jarText);
		String rstext = driver.findElementById("com.grofers.customerapp:id/tv_price_striked").getText();
		System.out.println(rstext);
		String rsttext = driver.findElementById("com.grofers.customerapp:id/tv_price").getText();
		System.out.println(rsttext);
		driver.findElementByXPath("//android.widget.TextView[@text='ADD']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='+']").click();
		//driver.findElementById("com.grofers.customerapp:id/btn_promo_footer").click();
		
		//Back to the main page
		driver.findElementByAccessibilityId("Navigate up").click();
		driver.findElementByAccessibilityId("Navigate up").click();
		driver.findElementById("Navigate up").click();
		driver.findElementByAccessibilityId("Navigate up").click();
		driver.findElementByAccessibilityId("Navigate up").click();
		
		

	}

}
