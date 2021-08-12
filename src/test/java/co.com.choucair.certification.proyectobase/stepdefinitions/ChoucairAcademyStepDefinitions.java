package co.com.certification.proyectobase.stepdefinitions;

import java.util.List;

import co.com.choucair.certification.proyectobase.model.AcademyChoucairData;
import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;



public class ChoucairAcademyStepDefinitions {
	
	@Before
	public void setStage(){
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("^than brandon wants lo learn automation at the academy choucair$")
	public void than_brandon_wants_lo_learn_automation_at_the_academy_choucair(List<AcademyChoucairData> academyChoucairData) {
		OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.ThePage(),
				Login.onThePage(academyChoucairData.get(0)));
	    
	}


	@When("^the search for the course Recursos Automatizacion Bancolombia on the choucair academy platform$")
	public void the_search_for_the_course_Recursos_Automatizacion_Bancolombia_on_the_choucair_academy_platform(List<AcademyChoucairData> academyChoucairData) {
		OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrcourse()));
	}

	@Then("^he finds the course called resources Recursos Automatizacion Bancolombia$")
	public void he_finds_the_course_called_resources_Recursos_Automatizacion_Bancolombia(List<AcademyChoucairData> academyChoucairData) {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.tothe(academyChoucairData.get(0).getStrcourse())));
	}

}
