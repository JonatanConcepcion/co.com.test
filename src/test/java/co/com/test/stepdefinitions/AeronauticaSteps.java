package co.com.test.stepdefinitions;

import co.com.test.questions.Verificar;
import co.com.test.tasks.IrASeccion;
import co.com.test.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AeronauticaSteps {
    @Before
    public void setStage(){
        setTheStage(new OnlineCast());

    }


    @Given("^Jon quiere ver documentos Estado de Situacion Financiero$")
    public void jonQuiereVerDocumentosEstadoDeSituacionFinanciero() {
        theActorCalled("Jon").wasAbleTo(OpenUp.thePage());

    }

    @When("^el esta en la pagina web de Aeronautica Civil$")
    public void elEstaEnLaPaginaWebDeAeronauticaCivil() {
        OnStage.theActorInTheSpotlight().attemptsTo(IrASeccion.the());
    }




    @Then("^el ve el documento (.*)$")
    public void elVeElDocumentoEstadoDeSituacionFinancieraADeAbrilDel(String NombreDocumento) {
        OnStage.theActorInTheSpotlight().should(seeThat(Verificar.el(NombreDocumento)));


    }
}
