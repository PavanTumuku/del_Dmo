package sample;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ex {

public static void main(String[]args) throws InterruptedException, MalformedURLException
{
	
	AndroidDriver<MobileElement> driver;

DesiredCapabilities capabilities = new DesiredCapabilities();
	
	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "HUAWEI VNS-L31"); //DEVICE_NAME : model number   
	capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");    //AUTOMATION_NAME: by default Appium
	capabilities.setCapability("udid", "4TE7N16B25004195");                       //udid : adb device name 
	capabilities.setCapability(MobileCapabilityType.PLATFORM, "Android");    
	capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
	System.out.println("open android ...");
	Thread.sleep(3000);
	capabilities.setCapability("noReset","true");                                                                                                                   // it prevent the re-installing apk 
	capabilities.setCapability("appPackage", "com.barclays.absa.banking.uat");        //appPackage:in apk app u can find app
	//capabilities.setCapability("appPackage", "com.barclays.absa.banking");  // for real app not for uat

	capabilities.setCapability("appActivity", "com.barclays.absa.banking.v4.presentation.launch.SplashScreen2faActivity");//2
	
//capabilities.setCapability("appActivity", "com.barclays.absa.banking.passcode.passcodeLogin.SimplifiedLoginActivity");//2
// for 5 digits pwd we need to use simplify activity 
	
	 Thread.sleep(5000);
	System.out.println("open appilcation ...");
	
	URL url = new URL("http://127.0.0.1:4723/wd/hub"); 
	driver = new AndroidDriver<MobileElement>(url, capabilities);
	Thread.sleep(8000);
	System.out.println("appilcation started...");
		

	
  
		WebDriverWait wait = new  WebDriverWait(driver, 50);
		
//			 WebElement click_6 = driver.findElement(By.id("com.barclays.absa.banking.uat:id/button6_text_view"));
//			 System.out.println("click on 6 ");
//			 click_6.click();
//			 Thread.sleep(500);
			 
			 WebElement click_6 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/button6_text_view")));
			 System.out.println("click on 6 ");
			 click_6.click();
			 
			 WebElement click_1 = driver.findElement(By.id("com.barclays.absa.banking.uat:id/button1_text_view"));
			 System.out.println("click on 1 ");
			 click_1.click();
			 Thread.sleep(500);
			 
//			 WebElement click_1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/button1_text_view")));
//			 System.out.println("click on 1 ");
//			 click_1.click();
			 
			 
			 WebElement click_9 = driver.findElement(By.id("com.barclays.absa.banking.uat:id/button9_text_view"));
			 System.out.println("click on 9 ");
			 click_9.click();
			 Thread.sleep(500);
			 click_9.click();
			 
//			 WebElement click_9 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/button9_text_view")));
//			 System.out.println("click on 9 ");
//			 click_9.click();
//			 Thread.sleep(500);
//			 click_9.click();
			 
			 
			 WebElement click_3 = driver.findElement(By.id("com.barclays.absa.banking.uat:id/button3_text_view"));
			 System.out.println("click on 3 ");
			 click_3.click();
		
			 
//			 WebElement click_3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.ba8nking.uat:id/button3_text_view")));
//			 System.out.println("click on 3 ");
//			 click_3.click();


}
	
}
