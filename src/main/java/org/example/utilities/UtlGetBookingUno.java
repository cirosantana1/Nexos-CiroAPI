package org.example.utilities;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.example.wrappers.WrpGetBookingUno;

public class UtlGetBookingUno {

    private Response response;

    public Response getBookingGet(){
        final WrpGetBookingUno wrpGetBookingUno = new WrpGetBookingUno();
        response = wrpGetBookingUno.getBooking();
        return response;
    }

    public String getBookingname() {
        final JsonPath jsonPathEvaluator = response.jsonPath();
        return jsonPathEvaluator.get("firstname");
    }
}
