package milvik.bima.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class BimaHomePage extends PageObject{
	
	@FindBy(xpath = "(//a[contains(text(),'About BIMA')])[3]")
	WebElementFacade aboutBimaHyperLink;

	public void clickOnAboutBima() {
		aboutBimaHyperLink.click();
	}

	public void validateBimaContentdisplayed() {
		System.out.println("Inside then statement");
	}

}
