#!/usr/bin/env sh

rm -rf openapi-jaxrs-server/

mvn io.quarkus:quarkus-maven-plugin:1.0.1.Final:create \
  -DprojectGroupId=org.openapitools \
  -DprojectArtifactId=openapi-jaxrs-server \
  -DclassName="org.openapi.openapitools.PingApi" \
  -Dpath="/ping" \
  -Dextensions="smallrye-openapi"