package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




import pages.LoginPage;
import wrappers.OpentapsWrappers;


public class TC001_CreateLead extends OpentapsWrappers{

	@BeforeClass
	@Parameters("browser")
	public void setData(String brow) {
		testCaseName="Login";
		testDescription="Login To Opentaps";
		browserName=brow;
		dataSheetName="TC002";
		category="Smoke";
		authors="Babu";
	}
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord,
			String companyName, String firstName,String lastName, String source, String marketCampaign,
			String phonNumber, String emailId){

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCRMSFA()
		.clickCreateLead()
		.enterCompanyName(companyName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.selectSOurce(source)
		.selectMarketCampaign(marketCampaign)
		.enterPhoneNumber(phonNumber)
		.enterEmailID(emailId)
		.clickCreateLeadButon()
		.getFirstName(firstName)
		.captureleadId();
	
		
		//.verifyUserName(loginName)
//		.clickLogOut();

	}

}
