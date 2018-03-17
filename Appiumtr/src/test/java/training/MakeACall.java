package training;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class MakeACall {

	AndroidDriver<WebElement> driver;
	Dimension size;
	
	@Test
	public void callMake() throws InterruptedException, WebDriverException, IOException
	{
		//size = driver.manage().window().getSize();
		DesiredCapabilities cap = new DesiredCapabilities();
		//File targetApp=new File("G:\\Appium\\LeafOrg.apk");
		cap.setCapability("deviceName", "4200cdf6da517417");
		cap.setCapability("platformName", "Android");
		//cap.setCapability("app", targetApp.getAbsolutePath());
		cap.setCapability("appPackage", "com.samsung.android.contacts");
		cap.setCapability("appActivity", "com.android.dialer.DialtactsActivity");
		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		//driver.findElementById("android:id/search_src_text").sendKeys("Hari(tiaa");
		//driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView").click();
		//driver.findElementByXPath("(//android.widget.ImageView[@content-desc='8 7 5 4 5 0 5 4 2 0, Double tap to call.''])[1]").click();
		//(//android.widget.ImageView[@content-desc="8 7 5 4 5 0 5 4 2 0, Double tap to call."])[1]
		String number="08754505420";
		char s;
		for(int i=0;i<=number.length();i++)
		{
			
			int n=Character.getNumericValue(number.charAt(i));
			if(n!=0)
			{
				driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc='+n+']/android.widget.TextView[1]").click();
			}
			else
			{
				driver.findElementById("com.samsung.android.contacts:id/zero").click();
			}
		}
		/*driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc='8']/android.widget.TextView[1]").click();
		driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc='7']/android.widget.TextView[1]").click();
		driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc='5']/android.widget.TextView[1]").click();
		driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc='4']/android.widget.TextView[1]").click();
		driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc='5']/android.widget.TextView[1]").click();
		driver.findElementById("com.samsung.android.contacts:id/zero").click();
		driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc='5']/android.widget.TextView[1]").click();
		driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc='4']/android.widget.TextView[1]").click();
		driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc='2']/android.widget.TextView[1]").click();
		driver.findElementById("com.samsung.android.contacts:id/zero").click();
		driver.findElementByXPath("//android.widget.ImageView[@content-desc='SIM card 1 call']").click();*/
		
		
		
		
}
}
