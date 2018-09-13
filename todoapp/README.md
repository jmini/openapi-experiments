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