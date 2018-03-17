package training;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.UUID;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class MultiTouch {

	AndroidDriver<WebElement> driver;
	Dimension size;
	@BeforeMethod
	public void touchMulti() throws InterruptedException, WebDriverException, IOException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		//File targetApp=new File("G:\\Appium\\LeafOrg.apk");
		cap.setCapability("deviceName", "4200cdf6da517417");
		cap.setCapability("platformName", "Android");
		//cap.setCapability("app", targetApp.getAbsolutePath());
		cap.setCapability("appPackage", "com.the511plus.MultiTouchTester");
		cap.setCapability("appActivity", "com.the511plus.MultiTouchTester.MultiTouchTester");
		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
}
	//@Test(priority=1)
	public void touchActPress() throws InterruptedException
	{
		int x=driver.findElement(MobileBy.id("com.the511plus.MultiTouchTester:id/points")).getLocation().getX();
		int y= driver.findElement(MobileBy.id("com.the511plus.MultiTouchTester:id/points")).getLocation().getY();
		System.out.println("X-Axis"+x+"Y-Axis"+y);
		MultiTouchAction multiTouch=new MultiTouchAction(driver);
		TouchAction finger1=new TouchAction(driver);
		TouchAction finger2=new TouchAction(driver);
		TouchAction finger3=new TouchAction(driver);
		TouchAction finger4=new TouchAction(driver);
		TouchAction finger5=new TouchAction(driver);
		finger1.press(x+5,y+5).waitAction(Duration.ofMillis(2000)).release();
		finger2.press(x+300,y+300).waitAction(Duration.ofMillis(2000)).release();
        finger3.press(x+250,y+250).waitAction(Duration.ofMillis(2000)).release();
        finger4.press(x+150,y+150).waitAction(Duration.ofMillis(2000)).release();
        finger5.press(x-100,y-100).waitAction(Duration.ofMillis(2000)).release();
        multiTouch.add(finger1).add(finger2).add(finger3).add(finger4).add(finger5).perform();
        Thread.sleep(1000);
	}
	@SuppressWarnings("rawtypes")
@Test
	public void touchActionLongPress() throws InterruptedException
	{
		size = driver.manage().window().getSize();
		System.out.println(size);
		Thread.sleep(5000);
		  //Get X Y Coordinates for touch action 1(Top left side).
		  int x1 = (int) (size.width * 0.20);
		  int y1 = (int) (size.height * 0.20);
		  
		  //Get X Y Coordinates for touch action 2(Top right side).
		  int x2 = (int) (size.width * 0.80);
		  int y2 = (int) (size.height * 0.20);
		  
		  //Get X Y Coordinates for touch action 3(Bottom left side).
		  int x3 = (int) (size.width * 0.20);
		  int y3 = (int) (size.height * 0.80);
		  
		  //Get X Y Coordinates for touch action 4(Bottom right side).
		  int x4 = (int) (size.width * 0.80);
		  int y4 = (int) (size.height * 0.80);
		  
		  //Get X Y Coordinates for touch action 5(middle of the screen).
		  int x5 = size.width / 2;
		  int y5 = size.height / 2;
		  int x6=  (int)(size.width *0.20);
		  int y6= (int)(size.height)/2;
		  int x7=(int)(size.width *0.80);
		  int y7=(int)(size.height)/2;
		  
		  // Create object of MultiTouchAction class.
		  MultiTouchAction multiTouches = new MultiTouchAction(driver);

		  // Set touch action1 on given X Y Coordinates of screen.
		  TouchAction finger1 = new TouchAction((MobileDriver) driver).longPress(x1, y1).waitAction(Duration.ofMillis(1500));
		  System.out.println("X1-AXIS="+x1+" Y1-AXIS="+y1);
		  // Set touch action2 on given X Y Coordinates of screen.
		  TouchAction finger2 = new TouchAction((MobileDriver) driver).longPress(x2, y2).waitAction(Duration.ofMillis(1500));
//		  // Set touch action3 on given X Y Coordinates of screen.
		  TouchAction finger3 = new TouchAction((MobileDriver) driver).longPress(x3, y3).waitAction(Duration.ofMillis(1500));
//		  // Set touch action4 on given X Y Coordinates of screen.
		  TouchAction finger4 = new TouchAction((MobileDriver) driver).longPress(x4, y4).waitAction(Duration.ofMillis(1500));
//		  // Set touch action5 on given X Y Coordinates of screen.
		  TouchAction finger5 = new TouchAction((MobileDriver) driver).longPress(x5, y5).waitAction(Duration.ofMillis(1500));
		  TouchAction finger6 = new TouchAction((MobileDriver) driver).longPress(x6, y6).waitAction(Duration.ofMillis(1500));
		  TouchAction finger7 = new TouchAction((MobileDriver) driver).longPress(x7, y7).waitAction(Duration.ofMillis(1500));

		  // Generate multi touch action chain using different actions and perform It.
		  multiTouches.add(finger1).add(finger2).add(finger3).add(finger4).add(finger5).add(finger6).add(finger7).perform();
		  Thread.sleep(5000);
	}
	//@Test(priority=3)
	
	public void touchActionTap() throws InterruptedException, IOException
	{
		TouchAction tapElement = new TouchAction(driver);
		tapElement.tap(driver.findElement(MobileBy.id("com.the511plus.MultiTouchTester:id/points")));
		tapElement.release().perform();
		File srcFile=driver.getScreenshotAs(OutputType.FILE);
		String filename=UUID.randomUUID().toString(); 
		File targetFile=new File("G:\\Appium\\" + filename +".jpg");
		org.apache.commons.io.FileUtils.copyFile(srcFile,targetFile);
	}
	//@Test(priority=4)
	public void touchActionSwipe()
	{
		MobileElement elementOrder=(MobileElement)driver.findElement(MobileBy.id("com.the511plus.MultiTouchTester:id/points"));
		//elementOrder.swipe(SwipeElementDirection.UP,500)
		TouchAction finger1=new TouchAction(driver);
		finger1.press(elementOrder, 556, 942).perform().moveTo(447, 450).perform().release();
		
	}
	@AfterMethod
	public void logout()
	{
		driver.quit();
	}
	
}
