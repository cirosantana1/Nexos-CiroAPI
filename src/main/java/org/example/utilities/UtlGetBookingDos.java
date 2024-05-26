package org.example.utilities;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.example.wrappers.WrpGetBookingDos;

public class UtlGetBookingDos {

    private Response response;

    public Response getBookingGet(){
        final WrpGetBookingDos wrpGetBookingDos = new WrpGetBookingDos();
        response = wrpGetBookingDos.getBooking();
        return response;
    }

    public String getBookingname() {
        final JsonPath jsonPathEvaluator = response.jsonPath();
        return jsonPathEvaluator.get("firstname");
    }
}
