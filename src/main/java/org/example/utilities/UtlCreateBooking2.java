package org.example.utilities;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.example.dto.CreateBookingDTO;
import org.example.wrappers.WrpCreateBooking;

public class UtlCreateBooking2 {

    private Response response;
    private CreateBookingDTO createBookingDTO;

    public void loadData() {
        createBookingDTO = new CreateBookingDTO();

        createBookingDTO.setFirstname(Constants.TEST_FIRSTNAME_2);
        createBookingDTO.setLastname(Constants.TEST_LASTNAME_2);
        createBookingDTO.setTotalprice(Constants.TEST_TOTALPRICE_2);
        createBookingDTO.setDepositpaid(true);
        createBookingDTO.setCheckin(Constants.TEST_CHECKIN_2);
        createBookingDTO.setCheckout(Constants.TEST_CHECKOUT_2);
        createBookingDTO.setAdditionalneeds(Constants.TEST_ADDITIONALNEEDS_2);
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
        SesionUtl.bookingidDos = getbookingid();
        return SesionUtl.bookingidDos;
    }

}
