/*
 * OpenAPI Ice Spell Mint API
 * Test Spec for a \"Simple Client\"
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package fr.jmini.openapi.openapitools.restassured.jackson;

import org.threeten.bp.*;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import org.openapitools.jackson.nullable.JsonNullableModule;
import com.fasterxml.jackson.datatype.threetenbp.ThreeTenModule;

import io.restassured.internal.mapping.Jackson2Mapper;
import io.restassured.path.json.mapper.factory.Jackson2ObjectMapperFactory;


public class JacksonObjectMapper extends Jackson2Mapper {

    private JacksonObjectMapper() {
        super(createFactory());
    }

    private static Jackson2ObjectMapperFactory createFactory() {
        return (cls, charset) -> {
            ObjectMapper mapper = new ObjectMapper();
            mapper = new ObjectMapper();
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            mapper.configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, false);
            mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
            mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
            mapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
            mapper.setDateFormat(new RFC3339DateFormat());
            ThreeTenModule module = new ThreeTenModule();
            module.addDeserializer(Instant.class, CustomInstantDeserializer.INSTANT);
            module.addDeserializer(OffsetDateTime.class, CustomInstantDeserializer.OFFSET_DATE_TIME);
            module.addDeserializer(ZonedDateTime.class, CustomInstantDeserializer.ZONED_DATE_TIME);
            mapper.registerModule(module);
            JsonNullableModule jnm = new JsonNullableModule();
            mapper.registerModule(jnm);
            return mapper;
        };
    }

    public static JacksonObjectMapper jackson() {
        return new JacksonObjectMapper();
    }
}