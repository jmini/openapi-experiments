/*
 * OpenAPI Tree Pots
 * Example spec
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client;

import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;

public class GsonObjectMapper implements ObjectMapper {

    private JSON json;

    private GsonObjectMapper() {
        this.json = new JSON();
    }

    public static GsonObjectMapper gson() {
        return new GsonObjectMapper();
    }

    @Override
    public Object deserialize(ObjectMapperDeserializationContext context) {
        return json.deserialize(context.getDataToDeserialize().asString(), context.getType());
    }

    @Override
    public Object serialize(ObjectMapperSerializationContext context) {
        return json.serialize(context.getObjectToSerialize());
    }
}