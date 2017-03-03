import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class SalesforceLogin extends ReUsableMethods {

	public void enterUserName(String textVal) throws IOException{
		WebElement webObj = Driver.driver.findElement(By.xpath(".//*[@id='username']"));
		String objName = "userName";
		enterText(webObj, textVal, objName);
		
	}
	
	
	public void enterPwd(String textval){
		
	}
	
	public void clickButton(){
		
	}
	
	
	public void checkRemMe(){
		
	}
	
	public void unCheckRemMe(){
		
	}
	
	public void clickForgotPwd(){
		
	}
	
	
	public void validateErrorMessage(){
		
	}
}
