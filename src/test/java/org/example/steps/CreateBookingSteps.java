package org.example.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import org.example.assertions.Assertions;
import org.example.utilities.*;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateBookingSteps {

    private UtlCreateBooking1 utlCreateBooking1;
    private UtlCreateBooking2 utlCreateBooking2;
    private UtlGetBookingUno utlGetBookingUno;
    private UtlGetBookingDos utlGetBookingDos;
    private static final Logger LOGGER = LoggerFactory.getLogger(AuthSteps.class);
    private Response response;
    
    @Given("^Que deseo crear un nuevo libro para Pedro$")
    public void queDeseoCrearUnNuevoLibroParaPedro() {
        utlCreateBooking1 = new UtlCreateBooking1();
        utlCreateBooking1.loadData();
    }

    @When("^Ingreso la informacion solicitada para libro de Pedro$")
    public void ingresoLaInformacionSolicitadaParaLibroDePedro() {
        response = utlCreateBooking1.getPostCreateBooking();
    }

    @Then("^Se recibe una respuesta exitosa del libro de Pedro$")
    public void seRecibeUnaRespuestaExitosaDelLibroDePedro() {
        LOGGER.info("CREATE BOOKING 1 RESPONSE: {}", response.asString());
        LOGGER.info("NOMBRE UNO: {}", utlCreateBooking1.getFirstname());
        LOGGER.info("BOOKINGID UNO: {}", utlCreateBooking1.getbookingid());
        LOGGER.info("x {}", utlCreateBooking1.getNewbookingid());
        Assertions.assertValidAnswer(response,200);
        Assert.assertEquals(Constants.TEST_FIRSTNAME_1,utlCreateBooking1.getFirstname());
    }

    @Given("^Que deseo crear un nuevo libro para Javier$")
    public void queDeseoCrearUnNuevoLibroParaJavier() {
        utlCreateBooking2 = new UtlCreateBooking2();
        utlCreateBooking2.loadData();
    }

    @When("^Ingreso la informacion solicitada para libro de Javier$")
    public void ingresoLaInformacionSolicitadaParaLibroDeJavier() {
        response = utlCreateBooking2.getPostCreateBooking();
    }

    @Then("^Se recibe una respuesta exitosa del libro de Javier$")
    public void seRecibeUnaRespuestaExitosaDelLibroDeJavier() {
        LOGGER.info("CREATE BOOKING 2 RESPONSE: {}", response.asString());
        LOGGER.info("NOMBRE DOS: {}", utlCreateBooking2.getFirstname());
        LOGGER.info("BOOKINGID DOS: {}", utlCreateBooking2.getbookingid());
        LOGGER.info("x {}", utlCreateBooking2.getNewbookingid());
        Assertions.assertValidAnswer(response,200);
        Assert.assertEquals(Constants.TEST_FIRSTNAME_2,utlCreateBooking2.getFirstname());
    }
    
    @Given("^Que deseo consultar un libro$")
    public void queDeseoConsultarUnLibro() {
        System.out.println("PASO INICIAL");
    }

    @When("^Genero la consulta para libro de Pedro$")
    public void generoLaConsultaParaLibroDePedro() {
        utlGetBookingUno = new UtlGetBookingUno();
        response = utlGetBookingUno.getBookingGet();
    }

    @Then("^Se recibe una respuesta exitosa de la consulta del libro de Pedro$")
    public void seRecibeUnaRespuestaExitosaDeLaConsultaDelLibroDePedro() {
        LOGGER.info("GET BOOKING 1 RESPONSE: {}", response.asString());
        LOGGER.info("GET NOMBRE 1: {}", utlGetBookingUno.getBookingname());
        Assertions.assertValidAnswer(response,200);
        Assert.assertEquals(Constants.TEST_FIRSTNAME_1, utlGetBookingUno.getBookingname());
    }


    @When("^Genero la consulta para libro de Javier$")
    public void generoLaConsultaParaLibroDeJavier() {
        utlGetBookingDos = new UtlGetBookingDos();
        response = utlGetBookingDos.getBookingGet();
    }

    @Then("^Se recibe una respuesta exitosa de la consulta del libro de Javier$")
    public void seRecibeUnaRespuestaExitosaDeLaConsultaDelLibroDeJavier() {
        LOGGER.info("GET BOOKING 2 RESPONSE: {}", response.asString());
        LOGGER.info("GET NOMBRE 2: {}", utlGetBookingDos.getBookingname());
        Assertions.assertValidAnswer(response,200);
        Assert.assertEquals(Constants.TEST_FIRSTNAME_2, utlGetBookingDos.getBookingname());
    }
}
