package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class DuplicateLeadPage extends OpentapsWrappers  {

	public DuplicateLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Duplicate Lead | opentaps CRM")){
			reportStep("This is not Duplicate Lead Page", "FAIL");
		}
	}
	
	public DuplicateLeadPage enterCompanyName(String name)
	{
		enterById("createLeadForm_companyName", name);
		return this;
	}
	
	public DuplicateLeadPage enterFirstName(String name)
	{
		enterById("createLeadForm_firstName", name);
		return this;
	}
	public DuplicateLeadPage enterLastName(String name)
	{
		enterById("createLeadForm_lastName", name);
		return this;
	}
	public ViewLeadPage clickCreateLeadButon()
	{
		clickByName("submitButton");
		return new ViewLeadPage(driver,test); 
	}
}
