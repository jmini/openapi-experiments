package fr.jmini.openapi.openapitools.generator;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.parser.OpenAPIV3Parser;
import io.swagger.v3.parser.core.models.ParseOptions;

import org.openapitools.codegen.ClientOptInput;
import org.openapitools.codegen.ClientOpts;
import org.openapitools.codegen.CodegenConfig;
import org.openapitools.codegen.DefaultGenerator;
import org.openapitools.codegen.languages.AbstractJavaCodegen;
import org.openapitools.codegen.languages.JavaCXFClientCodegen;
import org.openapitools.codegen.languages.JavaCXFServerCodegen;
import org.openapitools.codegen.languages.JavaClientCodegen;
import org.openapitools.codegen.languages.JavaInflectorServerCodegen;
import org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen;
import org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen;
import org.openapitools.codegen.languages.JavaJerseyServerCodegen;
import org.openapitools.codegen.languages.JavaResteasyEapServerCodegen;
import org.openapitools.codegen.languages.JavaResteasyServerCodegen;
import org.openapitools.codegen.languages.StaticDocCodegen;
import org.openapitools.codegen.languages.StaticHtml2Generator;
import org.openapitools.codegen.languages.StaticHtmlGenerator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RunOpenapitoolsCodegenMain {
	public static final String OKHTTP_GSON = "okhttp-gson";

	public static void main(String[] args) throws IOException {
		convertJava("treepots.yaml", OKHTTP_GSON);
		convertJava("treepots.yaml", JavaClientCodegen.REST_ASSURED);
		convertInflector("treepots.yaml");
		convertJaxrs("treepots.yaml");
		convertJaxrsCxfClient("treepots.yaml");
		convertJaxrsCxfServer("treepots.yaml");
		convertJaxrsCxfCdi("treepots.yaml");
		convertJaxrsResteasy("treepots.yaml");
		convertJaxrsResteasyEap("treepots.yaml");
		convertJaxrsSpec("treepots.yaml");
		convertStaticHtml("treepots.yaml");
		convertStaticHtml2("treepots.yaml");
		convertStaticDoc("treepots.yaml");

		convertJava("petstore.json", OKHTTP_GSON);
		convertJava("petstore.json", JavaClientCodegen.REST_ASSURED);
		convertInflector("petstore.json");
		convertJaxrs("petstore.json");
		convertJaxrsCxfClient("petstore.json");
		convertJaxrsCxfServer("petstore.json");
		convertJaxrsCxfCdi("petstore.json");
		convertJaxrsResteasy("petstore.json");
		convertJaxrsResteasyEap("petstore.json");
		convertJaxrsSpec("petstore.json");
		convertStaticHtml("petstore.json");
		convertStaticHtml2("petstore.json");
		convertStaticDoc("petstore.json");
	}

	private static void convertJava(String inputSpecName, String library) throws IOException {
		JavaClientCodegen config = new org.openapitools.codegen.languages.JavaClientCodegen();
		config.setLibrary(library);
		convertAbstractJava(inputSpecName, config, library);
	}

	private static void convertInflector(String inputSpecName) throws IOException {
		JavaInflectorServerCodegen config = new org.openapitools.codegen.languages.JavaInflectorServerCodegen();
		convertAbstractJava(inputSpecName, config, null);
	}

	private static void convertJaxrs(String inputSpecName) throws IOException {
		JavaJerseyServerCodegen config = new org.openapitools.codegen.languages.JavaJerseyServerCodegen();
		convertAbstractJava(inputSpecName, config, null);
	}

	private static void convertJaxrsCxfClient(String inputSpecName) throws IOException {
		JavaCXFClientCodegen config = new org.openapitools.codegen.languages.JavaCXFClientCodegen();
		convertAbstractJava(inputSpecName, config, null);
	}

	private static void convertJaxrsCxfServer(String inputSpecName) throws IOException {
		JavaCXFServerCodegen config = new org.openapitools.codegen.languages.JavaCXFServerCodegen();
		convertAbstractJava(inputSpecName, config, null);
	}

	private static void convertJaxrsCxfCdi(String inputSpecName) throws IOException {
		JavaJAXRSCXFCDIServerCodegen config = new org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen();
		convertAbstractJava(inputSpecName, config, null);
	}

	private static void convertJaxrsResteasy(String inputSpecName) throws IOException {
		JavaResteasyServerCodegen config = new org.openapitools.codegen.languages.JavaResteasyServerCodegen();
		convertAbstractJava(inputSpecName, config, null);
	}

	private static void convertJaxrsResteasyEap(String inputSpecName) throws IOException {
		JavaResteasyEapServerCodegen config = new org.openapitools.codegen.languages.JavaResteasyEapServerCodegen();
		convertAbstractJava(inputSpecName, config, null);
	}

	private static void convertJaxrsSpec(String inputSpecName) throws IOException {
		JavaJAXRSSpecServerCodegen config = new org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen();
		convertAbstractJava(inputSpecName, config, null);
	}

	private static void convertStaticHtml(String inputSpecName) throws IOException {
		StaticHtmlGenerator config = new org.openapitools.codegen.languages.StaticHtmlGenerator();
		convert(inputSpecName, config, null);
	}

	private static void convertStaticHtml2(String inputSpecName) throws IOException {
		StaticHtml2Generator config = new org.openapitools.codegen.languages.StaticHtml2Generator();
		convert(inputSpecName, config, null);
	}

	private static void convertStaticDoc(String inputSpecName) throws IOException {
		StaticDocCodegen config = new org.openapitools.codegen.languages.StaticDocCodegen();
		convert(inputSpecName, config, null);
	}

	private static void convertAbstractJava(String inputSpecName, AbstractJavaCodegen config, String library) throws IOException {
		final String artifactId = toArtifactId(inputSpecName, config, library);
		config.setArtifactId(artifactId);
		config.setJava8Mode(true);
		config.setLibrary(library);
		convert(inputSpecName, config, library);
	}

	private static void convert(String inputSpecName, CodegenConfig config, String suffix) throws IOException {
		String specNameWithoutExtension = com.google.common.io.Files.getNameWithoutExtension(inputSpecName);
		final String folder = "../" + specNameWithoutExtension;
		final String subFolder = toArtifactId(inputSpecName, config, suffix);
		final String outputDir = folder + "/" + subFolder;
		Path outputDirPath = Paths.get(outputDir);

		if (Files.exists(outputDirPath)) {
			Files.walk(outputDirPath) //
					.filter(Files::isRegularFile) //
					.filter(p -> !".project".equals(p.getFileName().toString()) //
							&& !".classpath".equals(p.getFileName().toString()) //
							&& !p.getFileName().toString().endsWith(".prefs")) //
					.map(Path::toFile) //
					.forEach(File::delete);
		}

		config.setHideGenerationTimestamp(true);
		config.setOutputDir(outputDir);

		final OpenAPIV3Parser openApiParser = new OpenAPIV3Parser();
		final ParseOptions options = new ParseOptions();
		options.setFlatten(true);
		options.setResolve(true);
		final OpenAPI openAPI = openApiParser.read(folder + "/" + inputSpecName, null, options);

		final ClientOptInput opts = new ClientOptInput();
		opts.setConfig(config);
		opts.setOpenAPI(openAPI);
		opts.setOpts(new ClientOpts());
		new DefaultGenerator().opts(opts).generate();
	}

	private static String toArtifactId(String inputSpecName, CodegenConfig config, String suffix) {
		String specNameWithoutExtension = com.google.common.io.Files.getNameWithoutExtension(inputSpecName);
		StringBuilder sb = new StringBuilder();
		sb.append(specNameWithoutExtension);
		sb.append("-openapigen-");
		sb.append(config.getName());
		if (suffix != null && suffix.length() > 0) {
			sb.append("-");
			sb.append(suffix);
		}
		return sb.toString();
	}
}
