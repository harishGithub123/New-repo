package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class FindLeadsPage extends OpentapsWrappers  {
	public static String leadId, leadName;
	public FindLeadsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Find Leads | opentaps CRM")){
			reportStep("This is not Find Lead Page", "FAIL");
		}
	}
	public FindLeadsPage enterFirstName(String firstLeadName) throws InterruptedException
	{
		Thread.sleep(10000);
		
		enterByXpath("(//div[@class='x-form-item x-tab-item'])[2]/div/input",firstLeadName);
		return this;
	}
	public FindLeadsPage clickFindLeadsButton() throws InterruptedException
	{
		clickByXpath("//button[contains(text(),'Find Leads')]");
		Thread.sleep(1000);
		return this;

	}

	public ViewLeadPage clickFirstResultingLead() throws InterruptedException
	{
		Thread.sleep(10000);
		clickByXpath("//table[@class='x-grid3-row-table']/tbody/tr/td/div/a");
		return new ViewLeadPage(driver,test);
	}

	public FindLeadsPage clickPhone()
	{
		clickByXpath("(//span[@class='x-tab-strip-text '])[2]");
		return this;
	}

	public FindLeadsPage enterPhoneNumber(String phoneNum) throws InterruptedException
	{
		Thread.sleep(5000);
		enterByXpath("//input[@name='phoneNumber']", phoneNum);
		return  this;
	}

	public FindLeadsPage captureFirstLeadID()
	{
		leadId=getTextByXpath("//table[@class='x-grid3-row-table']/tbody/tr/td/div/a");
		System.out.println("The lead id: "+ leadId);
		return this;
	}

	public FindLeadsPage enterCapturedLeadId()
	{
		System.out.println(leadId);
		enterByXpath("//input[@name='id']", leadId);
		return this;
	}
	public FindLeadsPage enterFromLeadID(String fromLeadId)
	{
		enterByXpath("//*[@id='ext-gen26']", fromLeadId);
		return this;
	}
	public FindLeadsPage enterToLeadID(String toLeadId)
	{
		enterByXpath("//*[@id='ext-gen26']", toLeadId);
		return this;
	}

	public FindLeadsPage clickEmail()
	{
		clickByXpath("(//span[@class='x-tab-strip-text '])[3]");
		return this;
	}
	public FindLeadsPage enterEmailAddress(String emailId)
	{
		enterByName("emailAddress",emailId);
		return this;
	}
	public FindLeadsPage captureFirstLeadName()
	{
		leadName=getTextByXpath("//table[@class='x-grid3-row-table']//td[3]/div/a");
		System.out.println(leadName);
		return this;
	}
	public FindLeadsPage enterLeadId()
	{
		enterByName("id","11");
		return this;
	}
	public void verifyErrorMessage()
	{
		verifyTextByXpath("//div[contains(text(),'No records to display')]","No records to display");
	}

}

