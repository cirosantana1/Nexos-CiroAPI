package org.example.wrappers;

import io.restassured.response.Response;
import org.example.dto.CreateBookingDTO;
import org.example.utilities.Constants;
import org.example.utilities.UtlRestClient;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WrpCreateBooking {

    private final UtlRestClient createBookingService;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public WrpCreateBooking() {
        createBookingService = new UtlRestClient(Constants.URL_CREATEBOOKING);
    }

    public Response postCreateBooking(final CreateBookingDTO createBookingDTO) {
        createBookingService.setBody(setBodyRequest(createBookingDTO));
        return createBookingService.postRequest();
    }

    private String setBodyRequest(final CreateBookingDTO createBookingDTO) {
        final JSONObject requestParams = new JSONObject();
        requestParams.put("firstname", createBookingDTO.getFirstname());
        requestParams.put("lastname", createBookingDTO.getLastname());
        requestParams.put("totalprice", createBookingDTO.getTotalprice());
        requestParams.put("depositpaid", createBookingDTO.getDepositpaid());
        requestParams.put("bookingdates", buildBookingDates(createBookingDTO));
        requestParams.put("additionalneeds",createBookingDTO.getAdditionalneeds());
        logger.info("CREATE BOOKING REQUEST: {}", requestParams);
        return requestParams.toString();
    }
    private JSONObject buildBookingDates(final CreateBookingDTO createBookingDTO) {
        final JSONObject bookingdates = new JSONObject();
        bookingdates.put("checkin",createBookingDTO.getCheckin());
        bookingdates.put("checkout",createBookingDTO.getCheckout());
        return bookingdates;
    }

}
