package fr.jmini.openapi.smallrye;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.OpenAPI;
import org.eclipse.microprofile.openapi.models.Operation;
import org.eclipse.microprofile.openapi.models.PathItem;
import org.eclipse.microprofile.openapi.models.Paths;
import org.eclipse.microprofile.openapi.models.info.Info;
import org.eclipse.microprofile.openapi.models.responses.APIResponse;
import org.eclipse.microprofile.openapi.models.responses.APIResponses;
import org.eclipse.microprofile.openapi.models.servers.Server;

import io.smallrye.openapi.runtime.io.OpenApiSerializer;
import io.smallrye.openapi.runtime.io.OpenApiSerializer.Format;

public class SmallryeSerializerMain {

    public static void main(String[] args) throws Exception {
        OpenAPI openAPI = OASFactory.createObject(OpenAPI.class);
        openAPI.setOpenapi("3.0.1");
        openAPI.setInfo(OASFactory.createObject(Info.class)
                .title("Ping Specification")
                .version("1.0"));
        openAPI.addServer(OASFactory.createObject(Server.class)
                .url("http://localhost:8000/"));
        openAPI.setPaths(OASFactory.createObject(Paths.class)
                .addPathItem("/ping", OASFactory.createObject(PathItem.class)
                        .GET(OASFactory.createObject(Operation.class)
                                .operationId("pingGet")
                                .responses(OASFactory.createObject(APIResponses.class)
                                        .addApiResponse("200", OASFactory.createObject(APIResponse.class)
                                                .description("OK"))))));

        String json = OpenApiSerializer.serialize(openAPI, Format.JSON);
        System.out.println(json);
    }
}
