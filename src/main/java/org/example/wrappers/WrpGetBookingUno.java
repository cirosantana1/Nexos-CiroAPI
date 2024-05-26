package org.example.wrappers;

import io.restassured.response.Response;
import org.example.utilities.Constants;
import org.example.utilities.SesionUtl;
import org.example.utilities.UtlRestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WrpGetBookingUno {

    private final String getBooking;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public WrpGetBookingUno(){
        getBooking = Constants.URL_GETBOOKING;
    }

    public Response getBooking() {
        final String getUrl = getBooking + SesionUtl.bookingidUno;
        final UtlRestClient getBookingService = new UtlRestClient(getUrl);
        logger.info("URL UNO: {}", getUrl);
        return getBookingService.getRequest();
    }

}
