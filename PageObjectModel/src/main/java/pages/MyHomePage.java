package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class MyHomePage extends OpentapsWrappers  {

	public MyHomePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("My Home | opentaps CRM")){
			reportStep("This is not MyHome Page", "FAIL");
		}
	}
	
	public LoginPage clickLogOut(){
		clickByClassName(prop.getProperty("Home.Logout.Class"));
		return new LoginPage(driver, test); 

	
	}
	
	public CreateLeadPage clickCreateLead()
	{
		clickByLink(prop.getProperty("MyHome.CreateLeads.Link"));
		return new CreateLeadPage(driver,test);
	}
	
	
	public MyLeadsPage clickLeads()
	{
		clickByLink("Leads");
		return new MyLeadsPage(driver,test);
	}
}

