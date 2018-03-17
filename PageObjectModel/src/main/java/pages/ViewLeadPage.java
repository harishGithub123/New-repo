package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class ViewLeadPage extends OpentapsWrappers  {

	public ViewLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("View Lead | opentaps CRM")){
			reportStep("This is not Viewlead Page", "FAIL");
		}
	}


	public void captureleadId()
	{
		String str = getTextById("viewLead_companyName_sp");
		String leadID=numbers(str);
		System.out.println(leadID);
	}

	public static String numbers(CharSequence input )
	{
		StringBuffer sb = new StringBuffer(input.length());

		for(int i = 0; i < input.length(); i++){
			char c = input.charAt(i);
			if(c > 47 && c < 58){
				sb.append(c);
			}
		}
		return sb.toString();
	}
	public ViewLeadPage getFirstName(String firstName)
	{
		verifyTextContainsById("viewLead_firstName_sp", firstName);	
		return this;
	}

	public EditLeadPage clickEdit()
	{
		clickByXpath("(//a[@class='subMenuButton'])[3]");
		return new EditLeadPage(driver, test);
	}

	public ViewLeadPage verifyChangedName(String changeCompacnyName)
	{
		String a =getTextById("viewLead_companyName_sp");
		String[] b = a.split(" "); 
		verifyTextContainsById("viewLead_companyName_sp",changeCompacnyName );
		
		//if(b[0].equals(changeCompacnyName)){
		//	reportStep(desc, status);
		//}
		return this;
	}
	public MyLeadsPage clickDeleteLeadButton()
	{
		clickByClassName("subMenuButtonDangerous");
		return new MyLeadsPage(driver,test);
	}
	public DuplicateLeadPage clickDuplicateLeadButton()
	{
		clickByLink("Duplicate Lead");
		return new DuplicateLeadPage(driver, test);
	}

}


