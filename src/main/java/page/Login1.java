package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseURL;

public class Login1 extends BaseURL{
	@FindBy (xpath = "//input[@id=\"user-name\"]") private WebElement username;
	@FindBy (xpath = "//input[@id=\"password\"]") private WebElement password;
	@FindBy (xpath =  "//input[@id=\"login-button\"]") private WebElement closeBtn;
	
	
	public Login1(){ 
		PageFactory.initElements(driver, this);
	}
	
	public String loginPage() {
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		closeBtn.click();
		return driver.getCurrentUrl();	
	}
}
