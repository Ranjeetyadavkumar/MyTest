package pack1;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class GorefyDemo {

	public static void main(String[] args) throws MalformedURLException {
		
DesiredCapabilities dac=new DesiredCapabilities();
		
		dac.setCapability("automationName","UiAutomator2");
		dac.setCapability("deviceName","Redmi");
		dac.setCapability("platformName","Android");
		dac.setCapability("platformVersion","7.1.2");
		dac.setCapability("appPackage","com.grofers.customerapp");
		dac.setCapability("appActivity","com.grofers.customerapp.activities.ActivitySplashScreen");
		dac.setCapability("noReset",true);
		
		AndroidDriver<MobileElement>driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),dac);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	
			//driver.findElementById("com.grofers.customerapp:id/txt_btn_categories").click();
			
			// click on Menue
		
			driver.findElementById("com.grofers.customerapp:id/navigation_drawer_icon").click();
			
			
			//Create login page
			
			//driver.findElementById("com.grofers.customerapp:id/root_view").click();
//			driver.findElementById("com.grofers.customerapp:id/et_enter_phone").sendKeys("8471040953");
//	        driver.findElementById("com.grofers.customerapp:id/next_button").click();
//	        
	        //OTP Verification
//	        
//	        String Title = driver.findElementById("com.grofers.customerapp:id/toolbar_title").getText();
//	        System.out.println(Title);
//	       String SMSAct = driver.findElementById("com.grofers.customerapp:id/tv_waiting").getText();
//	      System.out.println(SMSAct);
//	      driver.findElementByXPath("//android.widget.EditText[@text='Enter OTP']").sendKeys("5385");
//	      driver.findElementById("com.grofers.customerapp:id/next_button").click();
			
			//logon with other options
			//driver.findElementById("com.grofers.customerapp:id/truecaller_container").click();
			//driver.findElementById("com.truecaller:id/confirm").click();
			
			
			//create a logout operation
			
			//driver.findElementById("com.grofers.customerapp:id/root_view").click();
			//driver.findElementByXPath("//android.widget.TextView[@text='Logout']").click();
			
			//driver.findElementByAndroidUIAutomator("new uiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Logout\"))").click();
			//driver.findElementByXPath("//android.widget.TextView[@text='Yes']").click();
			//TouchAction ta= new TouchAction(driver);
		   // ta.tap(291,4).waitAction().perform();
		    
		    
		  //Performing on Add Cart
		driver.findElementByXPath("//android.widget.TextView[@text='My Cart']").click();
		driver.findElementById("com.grofers.customerapp:id/product_image").click();
	      		
        
        
//		driver.findElementByXPath("//android.widget.TextView[@text='I accept']").click();
		//driver.findElementByXPath("//android.widget.EditText[@text='Enter OTP']").sendKeys("5385");
		//driver.findElementById("com.grofers.customerapp:id/next_button").click();
		
//		driver.findElementById("com.grofers.customerapp:id/title").click();
//		driver.findElementById("com.grofers.customerapp:id/single_cell_category_layout").click();
//		driver.findElementById("com.grofers.customerapp:id/rl_root").click();
//		//driver.findElementById("com.grofers.customerapp:id/tv_add").click();
//		driver.findElementById("com.grofers.customerapp:id/ic_add").click();
		
		//driver.findElementByXPath("//android.widget.TextView[@text='Search for products']").sendKeys("oil");
		
		    
		    //to get the size
//		     
//		    Dimension da = driver.manage().window().getSize();
//		    int startHeight = (int) (da.getHeight()*0.7);
//		    int endHeight = (int) (da.getHeight()*0.3);
//		   
//		    for (int i = 0; i < 2; i++) 
//		    {
//		    	
//		    driver.swipe(0,startHeight,0,endHeight,1000);
//		    
//		    Thread.sleep(3000);
//				
			}
		

	}

