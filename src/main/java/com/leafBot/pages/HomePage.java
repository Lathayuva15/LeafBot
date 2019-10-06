package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

public class HomePage extends SeleniumBase{
	public HomePage clickLogout() {
		click(locateElement("class","decorativeSubmit"));
		return this;
	}

	public MyHomePage clickCRMSFA() {
		click(locateElement("link","CRM/SFA"));
		return new MyHomePage();
	}
	
}
