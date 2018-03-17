package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC_003_DeleteLead extends OpentapsWrappers{


	@BeforeClass
	@Parameters("browser")
	public void setData(String browser) {
		testCaseName="Login";
		testDescription="Login To Opentaps";
		browserName=browser;
		dataSheetName="TC_003_DeleteLead";
		category="Smoke";
		authors="Babu";
	}
	@ Test(dataProvider="fetchData")
	public void deleteLead(String userName, String pwd, String phoneNum) throws InterruptedException
	{
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeadsLink()
		.clickPhone()
		.enterPhoneNumber(phoneNum)
		.clickFindLeadsButton()
		.captureFirstLeadID()
		.clickFirstResultingLead()
		.clickDeleteLeadButton()
		.clickFindLeadsLink()
		.enterCapturedLeadId()
		.clickFindLeadsButton();
	}
}

