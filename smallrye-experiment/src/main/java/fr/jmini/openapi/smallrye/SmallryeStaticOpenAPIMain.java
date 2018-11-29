package fr.jmini.openapi.smallrye;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import org.eclipse.microprofile.openapi.models.OpenAPI;
import org.jboss.jandex.IndexView;
import org.jboss.jandex.Indexer;

import io.smallrye.openapi.runtime.io.OpenApiSerializer;
import io.smallrye.openapi.runtime.io.OpenApiSerializer.Format;
import io.smallrye.openapi.runtime.scanner.OpenApiAnnotationScanner;

public class SmallryeStaticOpenAPIMain {

    public static void main(String[] args) throws Exception {
        Path path = java.nio.file.Paths.get("/Users/jbr/Git/ece2018-openapi/todoapp/target/classes/com/example/todoapp/rest/TodoappEndpoint.class");
        InputStream stream = Files.newInputStream(path);

        Indexer indexer = new Indexer();
        indexer.index(stream);
        IndexView index = indexer.complete();

        OpenAPI openAPI = new OpenApiAnnotationScanner(null, index).scan();

        String json = OpenApiSerializer.serialize(openAPI, Format.YAML);
        System.out.println(json);
    }
}
