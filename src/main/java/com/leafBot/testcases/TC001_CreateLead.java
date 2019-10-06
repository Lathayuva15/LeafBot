package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC001_CreateLead extends  ProjectSpecificMethods{
	@BeforeTest
	public void setData() {
		excelFileName="TC001";
		testcaseName="Create Lead";
		testcaseDec = "Create Lead to Leaftaps";
		author="Latha";
		category="smoke";
		
	}
	
	@Test(dataProvider="fetchData")
	public void runTC001(String username, String password,String Fname,String Lname,String cname) {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.ClickLeads()
		.clickCreateLead()
		.enterFirstName(Fname)
		.enterLastname(Lname)
		.entercompanyName(cname)
		.ClickCreateLeadbtn()
		.ViewCreateLead()
		.clickLogout();

}
}