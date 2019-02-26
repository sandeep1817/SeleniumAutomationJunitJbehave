package milvik.bima.mapper;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import milvik.bima.steps.GreyHRSteps;
import net.thucydides.core.annotations.Steps;

public class GretyHRMapper {
	
	@Steps
	GreyHRSteps greytHRSteps;
	
	@When("username <user> and password <pwd> is entered and click on sigin")
	public void enterUsernamePasswordForgreytHR(@Named("user")String user,@Named("pwd")String pwd){
		greytHRSteps.loginToGreytHR(user,pwd);
	}
	
	@Then("greytHR home page should display")
	public void validateGreytHRHomePagedisplayed(){
		greytHRSteps.verifyThatGreytHRPageIsDisplayed();
	}

}
