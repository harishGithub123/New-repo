package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class FindLeadsPopup extends OpentapsWrappers  {
	public String leadId;
	public FindLeadsPopup(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Find Leads")){
			reportStep("This is not Find Lead Pop-up Page", "FAIL");
		}
	}
	public FindLeadsPopup enterFromLeadID(String fromLeadId)
	{
		enterByXpath("//input[@name='id']", fromLeadId);
		return this;
	}
	
	
	public FindLeadsPopup clickFindLeadsButton() throws InterruptedException
	{
		clickByXpath("//button[contains(text(),'Find Leads')]");
		Thread.sleep(1000);
		return this;
	}
	
	public MergeLeadPage clickFirstResultingLead1() throws Exception
	{
		Thread.sleep(1000);
		clickByXpathwoSnap("//table[@class='x-grid3-row-table']//div/a");
		switchToParentWindow();
		return new MergeLeadPage(driver,test);
	
	}
//	public FindLeadsPopup captureFirstLeadID()
//	{
//	leadId=getTextByXpath("//table[@class='x-grid3-row-table']/tbody/tr/td/div/a");
//	System.out.println("The lead id: "+ leadId);
//	return this;
//	}
//		
//	public FindLeadsPopup enterCapturedLeadId()
//	{
//		System.out.println(leadId);
//		enterByXpath("//input[@name='id']", leadId);
//		return this;
//	}

	public FindLeadsPopup enterToLeadID(String toLeadId)
	{
		enterByXpath("//input[@name='id']", toLeadId);
		return this;
	}
	
	
	
	public FindLeadsPopup clickEmail()
	{
		clickByXpath("(//span[@class='x-tab-strip-text '])[3]");
		return this;
	}
	public FindLeadsPopup enterEmailAddress()
	{
		enterByName("emailAddress","%@%");
		return this;
	}

	
	
	
	
	
	
	
	
	
	
	
	
}

