package org.example.wrappers;

import io.restassured.response.Response;
import org.example.dto.AuthDTO;
import org.example.utilities.UtlRestClient;
import org.example.utilities.Constants;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WrpAuth {

    private final UtlRestClient authCcService;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public WrpAuth() {
        authCcService = new UtlRestClient(Constants.URL_AUTH);
    }

    public Response postAuth(final AuthDTO authDTO) {
        authCcService.setBody(setBodyRequest(authDTO));
        return authCcService.postRequest();
    }

    private String setBodyRequest(final AuthDTO authDTO) {
        final JSONObject requestParams = new JSONObject();
        requestParams.put("username", authDTO.getUsername());
        requestParams.put("password", authDTO.getPassword());
        logger.info("AUTH REQUEST: {}", requestParams);
        return requestParams.toString();
    }

}
