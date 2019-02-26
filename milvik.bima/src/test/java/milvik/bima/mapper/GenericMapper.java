package milvik.bima.mapper;

import java.util.concurrent.TimeUnit;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

import milvik.bima.pages.BimaHomePage;

public class GenericMapper {

	BimaHomePage bimaHomePage;

	public WebDriver driver;
	String bimaURL = "http://www.bimamobile.com/";


	@Given("BIMA mobile is launched in chrome browser")
	public void launchBimaInChromeBrowser(){
		driver = bimaHomePage.getDriver();
		driver.get(bimaURL);
	}
	@Given("the <url> is launched")
	public void launchTheGivenURL(@Named("url")String url){
		driver = bimaHomePage.getDriver();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Given("print my name")
	public void givenPrintMyName() {
		System.out.println("khhdh");
		}

	/*@Given("print my name")
	public void printName(){
		System.out.println("Sandy");
	}*/
	@When("brother name added")
	public void printBroName(){
		System.out.println("Dilep");
	}
	@Then("both names should display")
	public void printBoth(){
		System.out.println("sandeep & Dileep");
	}

}
