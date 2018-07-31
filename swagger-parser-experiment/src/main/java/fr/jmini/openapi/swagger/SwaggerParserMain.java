package fr.jmini.openapi.swagger;

import io.swagger.parser.OpenAPIParser;
import io.swagger.v3.core.util.Yaml;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.parser.core.models.ParseOptions;

public class SwaggerParserMain {

	public static void main(String[] args) throws Exception {
		final String inputSpec = "../openapi-generator-utils/petstore/petstore.json";

		OpenAPIParser openApiParser = new OpenAPIParser();
		ParseOptions options = new ParseOptions();
		options.setResolve(true);
		options.setFlatten(true);

		OpenAPI openAPI = openApiParser.readLocation(inputSpec, null, options).getOpenAPI();
		String string = Yaml.mapper().writerWithDefaultPrettyPrinter().writeValueAsString(openAPI);

		System.out.println(string);
	}
}
