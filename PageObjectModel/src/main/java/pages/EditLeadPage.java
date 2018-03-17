package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class EditLeadPage extends OpentapsWrappers  {

	public EditLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("opentaps CRM")){
			reportStep("This is not Edit Lead Page", "FAIL");
		}
		
	}
	public EditLeadPage changeCompanyName(String changeCompanyName)
	{
		driver.findElementById("updateLeadForm_companyName").clear();
		enterById("updateLeadForm_companyName", changeCompanyName);
		return this;
	}
	
	public ViewLeadPage clickUpdate()
	{
		clickByName("submitButton");
		return new ViewLeadPage(driver,test);
	}
	
}

