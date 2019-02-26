package milvik.bima.mapper;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import milvik.bima.steps.BimaSteps;
import net.thucydides.core.annotations.Steps;

public class BimaHomePageMapper {
	
	@Steps
	BimaSteps bimaSteps;
	
	@When("click on about BIMA hyperlink")
	public void clickOnAboutBima(){
		bimaSteps.clickOnBima();
	}
	
	@Then("verify that content is displayed")
	public void verifyBIMAContentIsDisplayed(){
		bimaSteps.validateBIMAcontentIsDisplayed();
	}

}
