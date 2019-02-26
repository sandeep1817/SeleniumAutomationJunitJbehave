package milvik.bima.steps;

import milvik.bima.pages.BimaHomePage;
import net.thucydides.core.annotations.Step;

public class BimaSteps {
	
	BimaHomePage bimaHomePage;
	
	@Step
	public void clickOnBima() {
		bimaHomePage.clickOnAboutBima();
	}
	
	@Step
	public void validateBIMAcontentIsDisplayed() {
		bimaHomePage.validateBimaContentdisplayed();
	}

}
