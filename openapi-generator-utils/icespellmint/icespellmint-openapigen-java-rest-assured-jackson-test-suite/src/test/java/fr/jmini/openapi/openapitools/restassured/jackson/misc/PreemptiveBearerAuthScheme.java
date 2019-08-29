package fr.jmini.openapi.openapitools.restassured.jackson.misc;

import java.util.Map;

import io.restassured.authentication.AuthenticationScheme;
import io.restassured.internal.http.HTTPBuilder;

public class PreemptiveBearerAuthScheme implements AuthenticationScheme {

    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public void authenticate(HTTPBuilder httpBuilder) {
        @SuppressWarnings("unchecked")
        Map<Object, Object> headers = (Map<Object, Object>) httpBuilder.getHeaders();
        headers.put("Authorization", generateAuthToken());
    }

    public String generateAuthToken() {
        return "Bearer " + token;
    }
}
