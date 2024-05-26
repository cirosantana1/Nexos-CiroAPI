package org.example.utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;

import java.util.Map;

public class UtlRestClient {

    private final RequestSpecBuilder restRequest;
    private Response response;

    public UtlRestClient(final String baseUrl) {
        restRequest = new RequestSpecBuilder();
        restRequest.setContentType("application/json");
        restRequest.setBaseUri(baseUrl);
    }

    public Response getRequest() {
        response = SerenityRest.given(restRequest.build()).get();
        return response;
    }

    public Response postRequest() {
        response = SerenityRest.given(restRequest.build()).post();
        return response;
    }

    public void addHeader(final String headerName, final String headerValue) {
        restRequest.addHeader(headerName, headerValue);
    }

    public void setHeaders(final Map<String, String> headers) {
        restRequest.addHeaders(headers);
    }

    public void setBody(final String body) {
        restRequest.setBody(body);
    }

}
