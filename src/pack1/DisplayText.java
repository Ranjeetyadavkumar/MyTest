package pack1;

import java.awt.datatransfer.Transferable;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableList;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DisplayText {

	public static void main(String[] args) {
		
DesiredCapabilities dc=new DesiredCapabilities();
		
		dc.setCapability("automationName","UiAutomator2");
		dc.setCapability("deviceName","Redmi");
		dc.setCapability("platformName","Android");
		dc.setCapability("platformVersion","7.1.2");
		dc.setCapability("appPackage","com.plunes");
		dc.setCapability("appActivity","com.plunes.MainActivity");
		dc.setCapability("noReset",true);
		
		AndroidDriver<MobileElement>driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		
	
		System.out.println("i will display all the text and each of their languages");

	    // I find all the elements on the page as such
	    List<MobileElement> list = (List<MobileElement>) driver.findElementByClassName("android.view.View");


	    assertTrue(list.size()>0) ;

	    System.out.println(list.size());

	    //foreach of the elements detected I determine the language



	    for(int i=0;i<list.size();i++)
	    { if (list.get(i).getText()!= null) {
	        String SeenText = list.get(i).getText();
	        System.out.println(SeenText);

	        //Lang detection

	    List<Detection> detections 
	    =Transferable.detect(ImmutableList.of(list.get(0).getText()));
	    System.out.println("Language(s) detected:");
	    for (Detection detection : detections) {
	    System.out.printf("\t%s\n", detection);}


	    }}

	System.out.println(driver1.getPageSource());
		
		
		
	}

}
