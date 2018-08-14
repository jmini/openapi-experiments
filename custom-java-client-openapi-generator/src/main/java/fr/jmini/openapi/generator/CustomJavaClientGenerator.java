package fr.jmini.openapi.generator;

import org.openapitools.codegen.languages.JavaClientCodegen;

public class CustomJavaClientGenerator extends JavaClientCodegen {

    public CustomJavaClientGenerator() {
        embeddedTemplateDir = templateDir = "custom-java-client";
    }

    /**
     * Configures a friendly name for the generator. This will be used by the
     * generator to select the library with the -g flag.
     * 
     * @return the friendly name for the generator
     */
    public String getName() {
        return "custom-java-client";
    }

    /**
     * Returns human-friendly help for the generator. Provide the consumer with help
     * tips, parameters here
     * 
     * @return A string value for the help message
     */
    public String getHelp() {
        return "Generates a custom-java-client client library.";
    }

}