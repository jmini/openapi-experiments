package fr.jmini.openapitools.openapistylevalidator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.eclipse.microprofile.openapi.models.OpenAPI;
import org.junit.Assert;
import org.junit.Test;
import org.openapitools.openapistylevalidator.OpenApiSpecStyleValidatorEx;
import org.openapitools.openapistylevalidator.ValidatorParametersEx;
import org.openapitools.openapistylevalidator.styleerror.StyleError;

import java.io.InputStreamReader;
import java.util.List;

public class CreateOpenAPITest {
    
    @Test
    public void validateOpenAPIStyle() throws Exception {
        OpenAPI openAPI = CreateOpenAPI.create();
        
        OpenApiSpecStyleValidatorEx openApiSpecStyleValidator = new OpenApiSpecStyleValidatorEx(openAPI);
        ValidatorParametersEx parameters = new ValidatorParametersEx();
        List<StyleError> errors = openApiSpecStyleValidator.validate(parameters);
        
        for (StyleError styleError : errors) {
            System.out.println(styleError);
        }
        
        Assert.assertEquals(0, errors.size());
    }
    
    @Test
    public void validateWithJsonOptionFile() throws Exception {
        OpenAPI openAPI = CreateOpenAPI.create();
        
        OpenApiSpecStyleValidatorEx openApiSpecStyleValidator = new OpenApiSpecStyleValidatorEx(openAPI);
        
        Gson gson = new GsonBuilder().create();
        ValidatorParametersEx parameters = gson.fromJson(new InputStreamReader(getClass().getResourceAsStream("/options.json")), ValidatorParametersEx.class);
        
        List<StyleError> errors = openApiSpecStyleValidator.validate(parameters);
        
        for (StyleError styleError : errors) {
            System.out.println(styleError);
        }
        
        Assert.assertEquals(0, errors.size());
    }
    
    
}

