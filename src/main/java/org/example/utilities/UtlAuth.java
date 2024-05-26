package org.example.utilities;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.example.dto.AuthDTO;
import org.example.wrappers.WrpAuth;

public class UtlAuth {

    private Response response;
    private AuthDTO authDTO;

    public void loadData() {
        authDTO = new AuthDTO();

        authDTO.setUsername(Constants.TEST_USERNAME);
        authDTO.setPassword(Constants.TEST_PASSWORD);
    }

    public Response getPostAuth() {
        final WrpAuth wrpAuth = new WrpAuth();
        response = wrpAuth.postAuth(authDTO);
        return response;
    }


    public String getToken() {
        final JsonPath jsonPathEvaluator = response.jsonPath();
        return jsonPathEvaluator.get("token");
    }

}
