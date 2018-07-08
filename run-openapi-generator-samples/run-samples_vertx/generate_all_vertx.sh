#!/bin/sh
# update # java petstore for all supported http libraries

cd ../../../openapi-generator/

./bin/java-vertx-async-petstore-server.sh
./bin/java-vertx-rx-petstore-server.sh