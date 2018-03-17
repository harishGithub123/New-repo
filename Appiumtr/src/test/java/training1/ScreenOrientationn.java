package training1;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class ScreenOrientationn {

	AndroidDriver<WebElement> driver;
	@Test()
	public void orientationScreen() throws InterruptedException, WebDriverException, IOException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		File targetApp=new File("G:\\Appium\\LeafOrg.apk");
		cap.setCapability("deviceName", "4200cdf6da517417");
		cap.setCapability("platformName", "Android");
		cap.setCapability("app", targetApp.getAbsolutePath());
		cap.setCapability("appPackage", " com.testleaf.leaforg");
		cap.setCapability("appActivity", "com.testleaf.leaforg.MainActivity");
		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		ScreenOrientation orientation=driver.getOrientation();
		System.out.println("By Default: "+orientation.value());
		if(orientation.value().contains("landscape"))
		{
			driver.rotate(ScreenOrientation.PORTRAIT);
			Thread.sleep(10000);
			System.out.println(driver.getOrientation());
			
		}
		else
		{
			driver.rotate(ScreenOrientation.LANDSCAPE);
			Thread.sleep(10000);
			System.out.println(driver.getOrientation());
			
		}
		FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE), new File("G:\\Appium\\landscape.png"));
		//driver.close();
		driver.quit();
	
}
}
