package fr.jmini.openapi.openapitools.feign.auth;

import feign.RequestInterceptor;
import feign.RequestTemplate;

public class ApiKeyAuth implements RequestInterceptor {
    private final String location;
    private final String paramName;

    private String apiKey;

    public ApiKeyAuth(String location, String paramName) {
        this.location = location;
        this.paramName = paramName;
    }

    public String getLocation() {
        return location;
    }

    public String getParamName() {
        return paramName;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public void apply(RequestTemplate template) {
        if ("query".equals(location)) {
            template.query(paramName, apiKey);
        } else if ("header".equals(location)) {
            template.header(paramName, apiKey);
        } else if ("cookie".equals(location)) {
            template.header("Cookie", String.format("%s=%s", paramName, apiKey));
        }
    }
}
