package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.Annotations;

public class MyHomePage extends Annotations {
	
	public void clickLeadsTab() {
		
		WebElement eleClickLeads = locateElement("link","Leads");
		click(eleClickLeads);
	}

}
