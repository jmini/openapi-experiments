package fr.jmini.openapitools.openapistylevalidator;

import org.eclipse.microprofile.openapi.models.OpenAPI;
import org.junit.Assert;
import org.junit.Test;
import org.openapitools.openapistylevalidator.OpenApiSpecStyleValidator;
import org.openapitools.openapistylevalidator.ValidatorParameters;
import org.openapitools.openapistylevalidator.styleerror.StyleError;

import java.util.List;

public class CreateOpenAPITest {
    
    @Test
    public void validateOpenAPIStyle() throws Exception {
        OpenAPI openAPI = CreateOpenAPI.create();
        
        OpenApiSpecStyleValidator openApiSpecStyleValidator = new OpenApiSpecStyleValidator(openAPI);
        ValidatorParameters parameters = new ValidatorParameters();
        List<StyleError> errors = openApiSpecStyleValidator.validate(parameters);
        
        for (StyleError styleError : errors) {
            System.out.println(styleError);
        }
        
        Assert.assertEquals(0, errors.size());
    }
    
    @Test
    public void validateWithJsonOptionFile() throws Exception {
        OpenAPI openAPI = CreateOpenAPI.create();
        
        OpenApiSpecStyleValidator openApiSpecStyleValidator = new OpenApiSpecStyleValidator(openAPI);
        
        ValidatorParameters parameters = new ValidatorParameters();
        List<StyleError> errors = openApiSpecStyleValidator.validate(parameters);
        
        for (StyleError styleError : errors) {
            System.out.println(styleError);
        }
        
        Assert.assertEquals(0, errors.size());
    }
    
    
}

