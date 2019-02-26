package milvik.bima.pages;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class GreytHRSignInPage extends PageObject{
	
	@FindBy(id="j_username")
	WebElementFacade userNameTxtBox;
	
	@FindBy(id="j_password")
	WebElementFacade pwdTextBox;
	
	@FindBy(id="login-button")
	WebElementFacade signInBtn;
	
	@FindBy(xpath="(//*[@class='user-details']/div)[3]")
	WebElementFacade usernameTextIngreytHR;
	
	public void signInToGreytHR(String user, String pwd){
		userNameTxtBox.sendKeys(user);
		pwdTextBox.sendKeys(pwd);
		signInBtn.click();
	}

	public void validateHomePage() {
		String userNmae = "Sandeep Basireddy";
		Assert.assertEquals(userNmae, usernameTextIngreytHR.getText().trim());
	}

}
