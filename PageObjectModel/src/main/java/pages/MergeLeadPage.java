package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class MergeLeadPage extends OpentapsWrappers{

	public MergeLeadPage(RemoteWebDriver driver, ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
		
		if(!verifyTitle("Merge Leads | opentaps CRM"))
		reportStep("This is not MergeLead Page", "FAIL");
			
	}
	
	public FindLeadsPopup clickFromLeadIcon() throws Exception
	{
		clickByXpath("(//img[@alt='Lookup'])[1]");
		switchToLastWindow();
		Thread.sleep(1000);
		return  new FindLeadsPopup(driver,test);
	}
	
	
	public FindLeadsPopup clickToLeadsIcon() throws Exception
	{
		clickByXpath("(//img[@alt='Lookup'])[2]");
		switchToLastWindow();
		Thread.sleep(1000);
		return new FindLeadsPopup(driver,test);
	}
	
	public MergeLeadPage clickMergeLeadButton()
	{
		clickByLinkwoSnap("Merge");
		acceptAlert();
		return this;
	}
	
	public MergeLeadPage acceptMergeAlert()
	{
		acceptAlert();
		return this;
	}
	public FindLeadsPage clickFindLeadsLink()
	{
		clickByLink("Find Leads");
		return new FindLeadsPage(driver,test);
	}
	
	
}
