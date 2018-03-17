package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class MyLeadsPage extends OpentapsWrappers  {

	public MyLeadsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("My Leads | opentaps CRM"))
		{
			reportStep("This is not MyLeads Page", "FAIL");
		}
	}
		public FindLeadsPage clickFindLeadsLink(){
			clickByLink("Find Leads");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return new FindLeadsPage(driver, test);
		}
		
		public MergeLeadPage clickMergeLeadsLink() throws InterruptedException
		
		{
			Thread.sleep(1000);
			clickByLink("Merge Leads");
			return new MergeLeadPage(driver, test);
		}
		
		
		}
		
		
	

	
