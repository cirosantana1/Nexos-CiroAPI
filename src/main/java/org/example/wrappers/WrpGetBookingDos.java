package org.example.wrappers;

import io.restassured.response.Response;
import org.example.utilities.Constants;
import org.example.utilities.SesionUtl;
import org.example.utilities.UtlRestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WrpGetBookingDos {

    private final String getBooking;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public WrpGetBookingDos(){
        getBooking = Constants.URL_GETBOOKING;
    }

    public Response getBooking() {
        final String getUrl = getBooking + SesionUtl.bookingidDos;
        final UtlRestClient getBookingService = new UtlRestClient(getUrl);
        logger.info("URL DOS: {}", getUrl);
        return getBookingService.getRequest();
    }

}
