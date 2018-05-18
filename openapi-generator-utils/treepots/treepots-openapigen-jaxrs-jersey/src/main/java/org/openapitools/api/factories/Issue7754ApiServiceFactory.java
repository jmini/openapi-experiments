package org.openapitools.api.factories;

import org.openapitools.api.Issue7754ApiService;
import org.openapitools.api.impl.Issue7754ApiServiceImpl;


public class Issue7754ApiServiceFactory {
    private final static Issue7754ApiService service = new Issue7754ApiServiceImpl();

    public static Issue7754ApiService getIssue7754Api() {
        return service;
    }
}
