package org.openapitools.api.factories;

import org.openapitools.api.IpsumApiService;
import org.openapitools.api.impl.IpsumApiServiceImpl;


public class IpsumApiServiceFactory {
    private final static IpsumApiService service = new IpsumApiServiceImpl();

    public static IpsumApiService getIpsumApi() {
        return service;
    }
}
