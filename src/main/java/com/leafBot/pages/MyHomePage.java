package com.leafBot.pages;



import com.leafBot.selenium.api.base.SeleniumBase;

public class MyHomePage extends SeleniumBase {
	
	
	
	public LeadsMainPage ClickLeads()
	{
		click(locateElement("link","Leads"));
		return new LeadsMainPage();
	}
	
	
	

}
