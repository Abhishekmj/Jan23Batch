import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AutomationScripts extends ReUsableMethods{

	// Page object model --> POM
	

	public static void LoginErrorMessage() throws IOException{
		// Get test Data sheet
		
//		String Un = recData[][];
		SalesForceLandingPage SFLandPage = new SalesForceLandingPage();
		
		SFLandPage.lauchApp();
		SFLandPage.clickLogin();
		
		SalesforceLogin SFLoginPage = new SalesforceLogin();
		
		SFLoginPage.enterUserName("UN");
		SFLoginPage.enterPwd("");
		SFLoginPage.clickButton();
		SFLoginPage.validateErrorMessage();
		
	}


	public static void LoginToSalesForce(){
		
	}


	public static void CheckRemeberMe() throws InterruptedException{
	
	}

	
	
}
