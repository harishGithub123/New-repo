package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC_005_DuplicateLead extends OpentapsWrappers{


@BeforeClass
@Parameters("browser")
public void setData(String browser) {
	testCaseName="Login";
	testDescription="Login To Opentaps";
	browserName=browser;
	dataSheetName="TC_005_DuplicateLead";
	category="Smoke";
	authors="Babu";
}
@Test(dataProvider="fetchData")
public void DuplicateLead(String userName, String password, String emailId) throws InterruptedException
{
	LoginPage login = new LoginPage(driver, test);
	login.enterUserName(userName)
	.enterPassword(password)
	.clickLogin()
	.clickCRMSFA()
	.clickLeads()
	.clickFindLeadsLink()
	.clickEmail()
	.enterEmailAddress(emailId)
	.clickFindLeadsButton()
	.captureFirstLeadName()
	.clickFirstResultingLead()
	.clickDuplicateLeadButton()
	.clickCreateLeadButon();

}







}