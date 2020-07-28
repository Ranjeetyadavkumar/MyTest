package pack1;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class Lognpress {

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

driver.findElementById("com.grofers.customerapp:id/navigation_drawer_icon").click();
		

/*

WebElement MyAddresses = driver.findElement(MobileBy.id("com.grofers.customerapp:id/text"));
new TouchAction((MobileDriver) driver).longPress(MyAddresses).waitAction(Duration.ofMillis(10000)).release().perform();


AndroidTouchAction touch = new AndroidTouchAction (driver);
touch.longPress(LongPressOptions.longPressOptions()
                .withElement (ElementOption.element ("My Addresses")))
              .perform ();

System.out.println("LongPressed Tapped");

*/
//
//MobileElement MYadres = driver.findElementById("com.grofers.customerapp:id/text");
//Thread.sleep(3000);

//Create an object for touchation action class.


TouchActions action = new TouchActions(driver);
action.longPress(driver.findElementByXPath("//android.widget.TextView[@text='My Addresses']")).perform();;
Thread.sleep(3000);
action.release();




	}

}
