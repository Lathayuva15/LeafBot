package com.leafBot.pages;

public class ViewLeadPage extends CreateLeadPage{

public ViewLeadPage ViewCreateLead()
	
	{
	
	
		String firstName = getElementText(locateElement("id", "viewLead_firstName_sp"));;
		 System.out.println(firstName);
		 return this;
	}

public ViewLeadPage ClickEditbutton()

{
	driver.findElementByLinkText("Edit").click();
	 return this;
}

public ViewLeadPage ViewUpdatedName()

{
	String changedname = driver.findElementById("viewLead_companyName_sp").getText();
	System.out.println(changedname);
	return this;
}

public ViewLeadPage clickLogout() {
	click(locateElement("class","decorativeSubmit"));
	return this;

}
}


