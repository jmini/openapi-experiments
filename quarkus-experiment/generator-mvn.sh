#!/usr/bin/env sh

mvn io.quarkus:quarkus-maven-plugin:0.22.0:create \
  -DprojectGroupId=org.openapitools \
  -DprojectArtifactId=openapi-jaxrs-server \
  -DclassName="org.openapi.openapitools.PingApi" \
  -Dpath="/ping" \
  -Dextensions="smallrye-openapi"