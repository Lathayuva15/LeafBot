package com.leafBot.pages;

public class LeadsMainPage extends MyHomePage{

	
	
//	public FindLeadPage ClickFindLeads()
//	{
//		
//		driver.findElementByLinkText("Find Leads").click();
//		return new FindLeadPage();
//	}
	
	
	public CreateLeadPage clickCreateLead()
	{
		click(locateElement("link","Create Lead"));
	
		return new CreateLeadPage();
	}
	
}
