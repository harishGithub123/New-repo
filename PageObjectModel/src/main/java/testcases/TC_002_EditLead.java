package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MyLeadsPage;
import wrappers.OpentapsWrappers;

public class TC_002_EditLead extends OpentapsWrappers{


	@BeforeClass
	@Parameters("browser")
	public void setData(String browser) {
		testCaseName="Login";
		testDescription="Login To Opentaps";
		browserName=browser;
		dataSheetName="TC_002_EditLead";
		category="Smoke";
		authors="Babu";
	}

	@Test(dataProvider="fetchData")
	public void editLead(String userName, String passWord, String firstLeadName,
			String changeCompanyName) throws InterruptedException{
		LoginPage login =new LoginPage(driver,test);
		login.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeadsLink()
		.enterFirstName(firstLeadName)
		.clickFindLeadsButton()
		.clickFirstResultingLead()
		.clickEdit().
		changeCompanyName(changeCompanyName)
		.clickUpdate()
		.verifyChangedName(changeCompanyName);
		
		
	}
}

