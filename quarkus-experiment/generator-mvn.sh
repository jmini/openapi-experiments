#!/usr/bin/env sh

rm -rf openapi-jaxrs-server/

mvn io.quarkus:quarkus-maven-plugin:0.23.2:create \
  -DprojectGroupId=org.openapitools \
  -DprojectArtifactId=openapi-jaxrs-server \
  -DclassName="org.openapi.openapitools.PingApi" \
  -Dpath="/ping" \
  -Dextensions="smallrye-openapi"