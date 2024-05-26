package org.example.assertions;

import io.restassured.response.Response;
import org.junit.Assert;

public class Assertions {

    private static final String FAILED_MSG_CODE = "Respuesta no Exitosa : codigo ";

    private Assertions() {
        super();
    }
    public static void assertValidAnswer(final Response response, final int statusCode) {
        Assert.assertEquals(FAILED_MSG_CODE + response.statusCode(), response.statusCode(), statusCode);
    }
}
