package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.FindLeadsPopup;
import pages.LoginPage;
import pages.MergeLeadPage;
import wrappers.OpentapsWrappers;

public class TC_004_MergeLead extends OpentapsWrappers{

	@BeforeClass
	@Parameters("browser")
	public void setData(String browser) {
		testCaseName="Login";
		testDescription="Login To Opentaps";
		browserName=browser;
		dataSheetName="TC_004_MergeLead";
		category="Smoke";
		authors="Babu";
	}
	@Test(dataProvider="fetchData")
	public void mergeLead(String userName,String pwd,String  fromLeadId,String toLeadId) throws Exception
	{
		LoginPage login =new LoginPage(driver,test);
		login.enterUserName(userName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLeadsLink()
		.clickFromLeadIcon()
		.enterFromLeadID(fromLeadId)
		.clickFindLeadsButton()
		.clickFirstResultingLead1()
		.clickToLeadsIcon()
		.enterToLeadID(toLeadId)
		.clickFindLeadsButton()
		.clickFirstResultingLead1()
		.clickMergeLeadButton()
		.clickFindLeadsLink()
		.enterLeadId()
		.clickFindLeadsButton();
	
		//	FindLeadsPopup popupwindow=	new FindLeadsPopup(driver,test);
		//		.moveToParentWindow()


	}


}