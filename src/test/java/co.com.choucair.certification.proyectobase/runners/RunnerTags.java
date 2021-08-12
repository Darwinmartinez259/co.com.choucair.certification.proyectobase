package co.com.choucair.certification.proyectobase.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/academyChoucair.feature", 
				 tags="@scenario1",
				 glue = "co.com.certification.proyectobase.stepdefinitions", 
				 snippets = SnippetType.CAMELCASE)

public class RunnerTags {

}
