package org.example.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import io.restassured.response.Response;
import org.example.assertions.Assertions;
import org.example.utilities.UtlAuth;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AuthSteps {

    private UtlAuth utlAuth;
    private static final Logger LOGGER = LoggerFactory.getLogger(AuthSteps.class);
    private Response response;

    @Given("Que deseo consumir el servicio")
    public void queDeseoConsumirElServicio() {
        utlAuth = new UtlAuth();
        utlAuth.loadData();
    }

    @When("Ingreso la información solicitada")
    public void ingresoLaInformacionSolicitada() {
        response = utlAuth.getPostAuth();
    }

    @Then("Recibo una respuesta exitosa")
    public void reciboUnaRespuestaExitosa() {
        LOGGER.info("AUTH RESPONSE: {}", response.asString());
        LOGGER.info("TOKEN: {}", utlAuth.getToken());
        Assertions.assertValidAnswer(response,200);
        Assert.assertNotNull(utlAuth.getToken());
    }
}
