package pack1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class sreachDemo {

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
		
		//Search button
				
				driver.findElementByXPath("//android.widget.TextView[@text='Search for products']").click();
				driver.findElementById("com.grofers.customerapp:id/edit_text_search").sendKeys("Ketchup");
				//String textg = driver.findElementByXPath("//android.widget.TextView[@text='Search History']").getText();
//System.out.println(textg);
driver.hideKeyboard();
driver.findElementById("com.grofers.customerapp:id/keyword_text_view").click();
//driver.findElementById("com.grofers.customerapp:id/more_text").click();
//driver.findElementById("com.grofers.customerapp:id/more_text").click();

driver.findElementById("com.grofers.customerapp:id/more_text").click();
driver.findElementById("com.grofers.customerapp:id/product_image").click();

String getttt = driver.findElementById("com.grofers.customerapp:id/product_offer").getText();
System.out.println(getttt);
String pdName = driver.findElementById("com.grofers.customerapp:id/tv_product_name").getText();
System.out.println(pdName);
String texty = driver.findElementById("com.grofers.customerapp:id/tv_price_striked").getText();
System.out.println(texty);
String prctext = driver.findElementById("com.grofers.customerapp:id/tv_price").getText();
System.out.println(prctext);
//driver.findElementById("com.grofers.customerapp:id/tv_add").click();
driver.findElementById("com.grofers.customerapp:id/txt_sbc_price").click();
//driver.findElementById("com.grofers.customerapp:id/unlock_price").click();
//driver.findElementById("com.grofers.customerapp:id/unlock_icon").click();
//driver.findElementById("com.grofers.customerapp:id/footer_parent").click();

driver.findElementByXPath("//android.widget.TextView[@text='View Club Membership Plans']").click();
driver.findElementByAccessibilityId("Go back").click();


	}

}
