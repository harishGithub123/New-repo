package training;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Swipe {

	AndroidDriver<WebElement> driver;
	Dimension size;
	
	@Test
	public void swipeMenu() throws InterruptedException, WebDriverException, IOException
	{
		size = driver.manage().window().getSize();
		DesiredCapabilities cap = new DesiredCapabilities();
		//File targetApp=new File("G:\\Appium\\LeafOrg.apk");
		cap.setCapability("deviceName", "4200cdf6da517417");
		cap.setCapability("platformName", "Android");
		//cap.setCapability("app", targetApp.getAbsolutePath());
		cap.setCapability("appPackage", "com.sec.android.app.launcher");
		cap.setCapability("appActivity", "com.sec.android.app.launcher.activities.LauncherActivity");
		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		//MobileElement elementOrder=(MobileElement)driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/com.android.launcher3.home.Workspace/android.view.ViewGroup/android.view.ViewGroup"));
		//elementOrder.swipe(SwipeElementDirection.UP,500)
		int x = size.width / 2;
		  int y = size.height / 2;
		TouchAction finger1=new TouchAction(driver);
		finger1.press(x, y).perform().moveTo(447, 450).perform().release();
}
}
