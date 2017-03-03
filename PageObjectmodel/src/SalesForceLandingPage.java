import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class SalesForceLandingPage extends ReUsableMethods{
	
	
	public void lauchApp(){
		Driver.driver.get("https://www.salesforce.com/in/?ir=1");
		System.out.println("Application is launched...");
	}
	
	public  void clickLogin() throws IOException{
		
		WebElement webObj = Driver.driver.findElement(By.cssSelector(".btn.btn-lg.btn-link"));
		clickButton(webObj, objName);
		
	}

}
