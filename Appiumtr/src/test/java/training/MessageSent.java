package training;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class MessageSent {


		AndroidDriver<WebElement> driver;
		@Test()
		public void sendMessage() throws MalformedURLException, InterruptedException
		{
			DesiredCapabilities cap = new DesiredCapabilities();
			//cap.setCapability("deviceName", "ZH8006LDLL");
			cap.setCapability("deviceName", "4200cdf6da517417");
			cap.setCapability("platformName", "Android");
			cap.setCapability("appPackage", "com.samsung.android.contacts");
			cap.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");
			driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
			driver.findElementById("android:id/search_src_text").sendKeys("08754505420");
			//driver.findElementByClassName("android.widget.ListView").click();
			driver.findElementById("com.samsung.android.messaging:id/editor_body").sendKeys("Hi");
			//driver.findElementByXPath("//android.widget.LinearLayout[@content-desc='Select SIM card']/android.widget.RelativeLayout").click();
			
			//android.widget.LinearLayout[@content-desc="Select SIM card"]/android.widget.RelativeLayout
			//driver.findElementById("com.samsung.android.messaging:id/enabled_simcard").click();
			//Thread.sleep(2000);
			driver.findElementByXPath("//android.widget.Button[@content-desc='Send sim 1']").click();
			
			
			/*driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.View/android"
					+ ".widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/andro"
					+ "id.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/andr"
					+ "oid.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout"
					+ "/android.widget.LinearLayout[2]/android.widget.ImageButton").click();*/
			
	}
	}

