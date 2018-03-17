package training1;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class HybridApp {

	AndroidDriver<WebElement> driver = null;
	@BeforeMethod
	public void openLeaf() throws MalformedURLException{
	DesiredCapabilities cap = new DesiredCapabilities();
	File targetApp=new File("G:\\Appium\\LeafOrg.apk");
	cap.setCapability("deviceName", "4200cdf6da517417");
	cap.setCapability("platformName", "Android");
	cap.setCapability("app", targetApp.getAbsolutePath());
	cap.setCapability("appPackage", " com.testleaf.leaforg");
	cap.setCapability("appActivity", "com.testleaf.leaforg.MainActivity");
	driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
	}
	
	@Test
	public void loginLeaf() throws InterruptedException
	{
		String userName="rajkumar@testleaf.com";
		String password="Leaf@123";
		Set<String> contextNames=driver.getContextHandles();
		for(String contextname:contextNames)
		{
			if(contextname.contentEquals("WEBVIEW"))
			{
				driver.context(contextname);
			}
			System.out.println(contextname);
		}
		Thread.sleep(10000);
		WebDriverWait wait= new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Create an Account')]")));
		WebElement ele1 = driver.findElementByXPath("(//input[@formcontrolname='email'])");

		ele1.sendKeys("sakthivel@testleaf.com");
//		driver.findElementByXPath("(//input[@formcontrolname='password'])").sendKeys("cPass");
		Thread.sleep(5000);
		driver.quit();
		
	}
}
