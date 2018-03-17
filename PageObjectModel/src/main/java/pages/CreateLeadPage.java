package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class CreateLeadPage extends OpentapsWrappers  {

	public CreateLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Create Lead | opentaps CRM")){
			reportStep("This is not CreateLead Page", "FAIL");
		}
	}
	
	public CreateLeadPage enterCompanyName(String name)
	{
		enterById("createLeadForm_companyName", name);
		return this;
	}
	
	public CreateLeadPage enterFirstName(String name)
	{
		enterById("createLeadForm_firstName", name);
		return this;
	}
	public CreateLeadPage enterLastName(String name)
	{
		enterById("createLeadForm_lastName", name);
		return this;
	}
	
	
	public CreateLeadPage selectSOurce(String source)
	{
		selectVisibileTextById("createLeadForm_dataSourceId",source);
		return this;
		
	}
	
	public CreateLeadPage selectMarketCampaign(String marketCampaign)
	{
		selectVisibileTextById("createLeadForm_marketingCampaignId",marketCampaign);
		return this;
	}
	
	public CreateLeadPage enterPhoneNumber(String phonNumber)
	{
		enterById("createLeadForm_primaryPhoneNumber",phonNumber);
		return this;
		
	}
	public CreateLeadPage enterEmailID(String emailId)
	{
		enterById("createLeadForm_primaryEmail",emailId);
		return this;
	}

	public ViewLeadPage clickCreateLeadButon()
	{
		clickByName("submitButton");
		return new ViewLeadPage(driver,test); 
	}
}
