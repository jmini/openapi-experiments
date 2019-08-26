package org.openapitools.openapistylevalidator;

import org.eclipse.microprofile.openapi.models.OpenAPI;
import org.openapitools.openapistylevalidator.styleerror.StyleError;

import java.util.List;

public class OpenApiSpecStyleValidatorEx extends OpenApiSpecStyleValidator{

    public OpenApiSpecStyleValidatorEx(OpenAPI openApi) {
        super(openApi);
    }
    
    @Override
    public List<StyleError> validate(ValidatorParameters parameters) {
        return super.validate(parameters);
    }
}

