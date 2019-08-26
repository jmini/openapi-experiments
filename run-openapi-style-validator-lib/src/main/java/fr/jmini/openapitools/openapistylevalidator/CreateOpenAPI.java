package fr.jmini.openapitools.openapistylevalidator;

import static org.eclipse.microprofile.openapi.OASFactory.createAPIResponse;
import static org.eclipse.microprofile.openapi.OASFactory.createAPIResponses;
import static org.eclipse.microprofile.openapi.OASFactory.createInfo;
import static org.eclipse.microprofile.openapi.OASFactory.createOpenAPI;
import static org.eclipse.microprofile.openapi.OASFactory.createOperation;
import static org.eclipse.microprofile.openapi.OASFactory.createPathItem;
import static org.eclipse.microprofile.openapi.OASFactory.createPaths;
import static org.eclipse.microprofile.openapi.OASFactory.createServer;

import org.eclipse.microprofile.openapi.models.OpenAPI;

public class CreateOpenAPI {

    
    public static OpenAPI create() {
        return createOpenAPI()
            .openapi("3.0.1")
            .info(
                createInfo()
                    .title("Ping Specification")
                    .version("1.0")
            )
            .addServer(
                createServer()
                    .url("http://localhost:8000/")
            )
            .paths(
                createPaths()
                    .addPathItem(
                        "/ping", createPathItem()
                            .GET(
                                createOperation()
                                    .operationId("pingGet")
                                    .responses(
                                        createAPIResponses()
                                            .addAPIResponse(
                                                "200", createAPIResponse()
                                                    .description("OK")
                                            )
                                    )
                            )
                    )
            )
//            .components(createComponents().schemas(Collections.emptyMap()))
            ;
    }
}
