package TestProj;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class LaunchBrowesr {

	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AppiumDriver driver= null;
		
		String appiumURL ="http://127.0.0.1:4728/wd/hub";
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "Android Device");
		desiredCapabilities.setCapability("platformVersion", "7.0");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		//desiredCapabilities.setCapability("browserName", "chrome");
		//desiredCapabilities.setCapability("chromedriverExecutable", "D:\\Appium\\chromedriver_win32\\chromedriver.exe");
		desiredCapabilities.setCapability("appPackage", "com.rjrt.NewPort");
		desiredCapabilities.setCapability("appActivity", "com.rjrt.NewPort.NewPort");
		System.out.println("the capabilities are set");
		try {
			driver = new AndroidDriver(new URL("http://127.0.0.1:4728/wd/hub"),
					desiredCapabilities);
			System.out.println("driver is set");
			Thread.sleep(5000);
			WebElement usrnme= driver.findElementByXPath("//android.view.View[@index=7]/android.widget.EditText[@index=0]");
			driver.findElementById("resource-id");
			driver.findElementByAccessibilityId("Content-desc");
			driver.findElementByClassName("classname");
			usrnme.sendKeys("newportuser72");
			usrnme.click();
		
			
	}catch (Exception e){
		e.printStackTrace();
	}

}
	
}
