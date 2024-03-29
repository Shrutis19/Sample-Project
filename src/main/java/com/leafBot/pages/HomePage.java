package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.Annotations;

public class HomePage extends Annotations{ 

	/*public HomePage() {
       PageFactory.initElements(driver, this);
	} 
*/
//	@FindBy(how=How.CLASS_NAME, using="decorativeSubmit") WebElement eleLogout;
	public LoginPage clickLogout() {
		WebElement eleLogout = locateElement("class", "decorativeSubmit");
		click(eleLogout);  
		return new LoginPage();
	}
	
	public MyHomePage crmsfa() {
		WebElement eleCRM = locateElement("xpath", "(//a[@href='/crmsfa/control/main?externalLoginKey=EL859799620140'])[2]");
		click(eleCRM);  
		return new MyHomePage();
	}

}







