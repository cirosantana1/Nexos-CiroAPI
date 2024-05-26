package org.example.utilities;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.example.dto.CreateBookingDTO;
import org.example.wrappers.WrpCreateBooking;

public class UtlCreateBooking1 {

    private Response response;
    private CreateBookingDTO createBookingDTO;

    public void loadData() {
        createBookingDTO = new CreateBookingDTO();

        createBookingDTO.setFirstname(Constants.TEST_FIRSTNAME_1);
        createBookingDTO.setLastname(Constants.TEST_LASTNAME_1);
        createBookingDTO.setTotalprice(Constants.TEST_TOTALPRICE_1);
        createBookingDTO.setDepositpaid(true);
        createBookingDTO.setCheckin(Constants.TEST_CHECKIN_1);
        createBookingDTO.setCheckout(Constants.TEST_CHECKOUT_1);
        createBookingDTO.setAdditionalneeds(Constants.TEST_ADDITIONALNEEDS_1);
    }

    public Response getPostCreateBooking() {
        final WrpCreateBooking wrpCreateBooking = new WrpCreateBooking();
        response = wrpCreateBooking.postCreateBooking(createBookingDTO);
        return response;
    }

    public String getFirstname() {
        final JsonPath jsonPathEvaluator = response.jsonPath();
        return jsonPathEvaluator.get("booking.firstname");
    }

    public String getbookingid(){
        final JsonPath jsonPathEvaluator = response.jsonPath();
        return jsonPathEvaluator.get("bookingid").toString();
    }

    public String getNewbookingid(){
        SesionUtl.bookingidUno = getbookingid();
        return SesionUtl.bookingidUno;
    }

}
