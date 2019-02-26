package milvik.bima.runner;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;

import net.serenitybdd.jbehave.SerenityStepFactory;
import net.serenitybdd.jbehave.SerenityStories;

public class TestRunner extends SerenityStories{
	
	protected String storiesToRun = "greytHRLogin.story";
	protected String storiesFoldersToRun = "";
 
	public TestRunner(){
		findStoriesCalled(storiesToRun);
		//findStoriesIn(storiesFoldersToRun);
	}

	@Override
	public Configuration configuration(){
		return new MostUsefulConfiguration().useStoryLoader(new LoadFromClasspath(this.getClass().getClassLoader()))
				.useStoryReporterBuilder(new StoryReporterBuilder().withDefaultFormats().withFormats(Format.CONSOLE,Format.HTML));
	}
	
	@Override
	public InjectableStepsFactory stepsFactory(){
		return SerenityStepFactory.withStepsFromPackage(getstepsPackage(), configuration()).andClassLoader(getClassLoader());
	}

	public String getstepsPackage(){
		return "milvik.bima.mapper";
	}

}
