package milvik.bima.steps;

import milvik.bima.pages.GreytHRSignInPage;
import net.thucydides.core.annotations.Step;

public class GreyHRSteps {
	
	GreytHRSignInPage greytHRSignInPage;
	
	@Step
	public void loginToGreytHR(String user, String pwd) {
		greytHRSignInPage.signInToGreytHR(user,pwd);
	}
	
	@Step
	public void verifyThatGreytHRPageIsDisplayed() {
		greytHRSignInPage.validateHomePage();
	}

}
