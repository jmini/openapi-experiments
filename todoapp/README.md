## Todo-App Example


In this folder ([`openapi-experiments/todoapp/`](./) OpenAPI-Generator is used to generate some examples. Some of the projects are manually modified.

The input spec is [`todoapp.yaml`](todoapp.yaml)

### jersey

[`todoapp-jersey/`](todoapp-jersey/) is using jersey2 and `io.swagger:swagger-jersey2-jaxrs` for the OpenAPI integration.

Command to create the project:
```
mvn package -f helper/create-jaxrs-pom.xml
```

As indicated in the [generated README](todoapp-jersey/README.md) a jetty server can be started with

```
mvn clean package jetty:run -f todoapp-jersey/
```

When started, the OpenAPI specification v2 (derived from the annotations) is available at:

```
http://localhost:8080/todoapp/swagger.json
```

And the endpoint to get all tasks is:

```
http://localhost:8080/todoapp/task
```

### MicroProfile with spec file

[Eclipse MicroProfile OpenAPI](https://github.com/eclipse/microprofile-open-api) allows to have just a static `openapi.yaml` file in the application module’s root `META-INF` folder (see the ["Location and formats" section](https://github.com/eclipse/microprofile-open-api/blob/master/spec/src/main/asciidoc/microprofile-openapi-spec.adoc#location-and-formats) in the documentation)

Command to create the project:
```
mvn package -f helper/create-mp-with-spec-file.xml
```

Edit the pom to add the MicroProfile dependency.

Move the spec to the appropriate location:
```
mkdir todoapp-mp-with-spec-file/src/main/resources
mkdir todoapp-mp-with-spec-file/src/main/resources/META-INF

mv todoapp-mp-with-spec-file/src/main/openapi/openapi.yaml todoapp-mp-with-spec-file/src/main/resources/META-INF
```

See also https://github.com/OpenAPITools/openapi-generator/issues/795
