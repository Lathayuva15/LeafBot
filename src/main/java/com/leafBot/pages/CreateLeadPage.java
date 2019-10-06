package com.leafBot.pages;

public class CreateLeadPage extends MyHomePage{
	

	/*
	 * public CreateLeadPage clickCreateLead1() {
	 * 
	 * driver.findElementByLinkText("Create Lead").click(); return new
	 * CreateLeadPage(); }
	 */
	
	public CreateLeadPage enterFirstName(String Fname)
	{
		clearAndType(locateElement("id", "createLeadForm_firstName"), Fname);
		return this;
		
	}
	
	public CreateLeadPage enterLastname(String Lname)
	{
		clearAndType(locateElement("id", "createLeadForm_lastName"), Lname);
		return this;
	}
	
	public CreateLeadPage entercompanyName(String cname)
	{
		clearAndType(locateElement("id", "createLeadForm_companyName"), cname);
		return this;
	
}
	
	public ViewLeadPage ClickCreateLeadbtn()
	{
		click(locateElement("xpath","//input[@value='Create Lead']"));
		 return new ViewLeadPage();
	}

	

}
