package fr.jmini.openapi.openapitools.generator;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.parser.OpenAPIV3Parser;
import io.swagger.v3.parser.core.models.ParseOptions;

import org.openapitools.codegen.ClientOptInput;
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

	private static final String PACKAGE_ROOT = "fr.jmini.openapi.openapitools";

	public static void main(String[] args) throws IOException {
		convertJava("treepots.yaml", JavaClientCodegen.OKHTTP_GSON, null);
		convertJava("treepots.yaml", JavaClientCodegen.REST_ASSURED, null);
		convertInflector("treepots.yaml");
		convertJaxrs("treepots.yaml");
		convertJaxrsCxfClient("treepots.yaml");
		convertJaxrsCxfServer("treepots.yaml");
		convertJaxrsCxfCdi("treepots.yaml");
		convertJaxrsResteasy("treepots.yaml");
		convertJaxrsResteasyEap("treepots.yaml");
		convertJaxrsSpec("treepots.yaml", null);
		convertStaticHtml("treepots.yaml");
		convertStaticHtml2("treepots.yaml");
		convertStaticDoc("treepots.yaml");

		convertJava("petstore.json", JavaClientCodegen.OKHTTP_GSON, null);
		convertJava("petstore.json", JavaClientCodegen.REST_ASSURED, null);
		convertJava("petstore.json", JavaClientCodegen.REST_ASSURED, JavaClientCodegen.SERIALIZATION_LIBRARY_JACKSON);
		convertInflector("petstore.json");
		convertJaxrs("petstore.json");
		convertJaxrsCxfClient("petstore.json");
		convertJaxrsCxfServer("petstore.json");
		convertJaxrsCxfCdi("petstore.json");
		convertJaxrsResteasy("petstore.json");
		convertJaxrsResteasyEap("petstore.json");
		convertJaxrsSpec("petstore.json", null);
		convertJaxrsSpec("petstore.json", JavaJAXRSSpecServerCodegen.QUARKUS_LIBRARY);
		convertJaxrsSpec("petstore.json", JavaJAXRSSpecServerCodegen.THORNTAIL_LIBRARY);
		convertJaxrsSpec("petstore.json", JavaJAXRSSpecServerCodegen.OPEN_LIBERTY_LIBRARY);
		convertJaxrsSpec("petstore.json", JavaJAXRSSpecServerCodegen.HELIDON_LIBRARY);
		convertStaticHtml("petstore.json");
		convertStaticHtml2("petstore.json");
		convertStaticDoc("petstore.json");

		convertJava("icespellmint.yaml", JavaClientCodegen.FEIGN, null);
		convertJava("icespellmint.yaml", JavaClientCodegen.GOOGLE_API_CLIENT, null);
		convertJava("icespellmint.yaml", JavaClientCodegen.JERSEY2, null);
		convertJava("icespellmint.yaml", JavaClientCodegen.OKHTTP_GSON, null);
		convertJava("icespellmint.yaml", JavaClientCodegen.REST_ASSURED, null);
		convertJava("icespellmint.yaml", JavaClientCodegen.REST_ASSURED, JavaClientCodegen.SERIALIZATION_LIBRARY_JACKSON);
		convertJava("icespellmint.yaml", JavaClientCodegen.RESTEASY, null);
		convertJava("icespellmint.yaml", JavaClientCodegen.RESTTEMPLATE, null);
		convertJava("icespellmint.yaml", JavaClientCodegen.WEBCLIENT, null);
	}

	private static void convertJava(String inputSpecName, String library, String serializationLibrary) throws IOException {
		JavaClientCodegen config = new org.openapitools.codegen.languages.JavaClientCodegen();
		config.setLibrary(library);
		if (serializationLibrary != null) {
			config.setSerializationLibrary(serializationLibrary);
		}
		convertAbstractJava(inputSpecName, config, library, serializationLibrary);
	}

	private static void convertInflector(String inputSpecName) throws IOException {
		JavaInflectorServerCodegen config = new org.openapitools.codegen.languages.JavaInflectorServerCodegen();
		convertAbstractJava(inputSpecName, config, null, null);
	}

	private static void convertJaxrs(String inputSpecName) throws IOException {
		JavaJerseyServerCodegen config = new org.openapitools.codegen.languages.JavaJerseyServerCodegen();
		convertAbstractJava(inputSpecName, config, null, null);
	}

	private static void convertJaxrsCxfClient(String inputSpecName) throws IOException {
		JavaCXFClientCodegen config = new org.openapitools.codegen.languages.JavaCXFClientCodegen();
		convertAbstractJava(inputSpecName, config, null, null);
	}

	private static void convertJaxrsCxfServer(String inputSpecName) throws IOException {
		JavaCXFServerCodegen config = new org.openapitools.codegen.languages.JavaCXFServerCodegen();
		convertAbstractJava(inputSpecName, config, null, null);
	}

	private static void convertJaxrsCxfCdi(String inputSpecName) throws IOException {
		JavaJAXRSCXFCDIServerCodegen config = new org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen();
		convertAbstractJava(inputSpecName, config, null, null);
	}

	private static void convertJaxrsResteasy(String inputSpecName) throws IOException {
		JavaResteasyServerCodegen config = new org.openapitools.codegen.languages.JavaResteasyServerCodegen();
		convertAbstractJava(inputSpecName, config, null, null);
	}

	private static void convertJaxrsResteasyEap(String inputSpecName) throws IOException {
		JavaResteasyEapServerCodegen config = new org.openapitools.codegen.languages.JavaResteasyEapServerCodegen();
		convertAbstractJava(inputSpecName, config, null, null);
	}

	private static void convertJaxrsSpec(String inputSpecName, String library) throws IOException {
		JavaJAXRSSpecServerCodegen config = new org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen();
		config.setLibrary(library);
		convertAbstractJava(inputSpecName, config, library, null);
	}

	private static void convertStaticHtml(String inputSpecName) throws IOException {
		StaticHtmlGenerator config = new org.openapitools.codegen.languages.StaticHtmlGenerator();
		convert(inputSpecName, config, null, null);
	}

	private static void convertStaticHtml2(String inputSpecName) throws IOException {
		StaticHtml2Generator config = new org.openapitools.codegen.languages.StaticHtml2Generator();
		convert(inputSpecName, config, null, null);
	}

	private static void convertStaticDoc(String inputSpecName) throws IOException {
		StaticDocCodegen config = new org.openapitools.codegen.languages.StaticDocCodegen();
		convert(inputSpecName, config, null, null);
	}

	private static void convertAbstractJava(String inputSpecName, AbstractJavaCodegen config, String library, String serializationLibrary) throws IOException {
		final String artifactId = toArtifactId(inputSpecName, config, library, serializationLibrary);
		config.setArtifactId(artifactId);
		config.setJava8Mode(true);
		config.setLibrary(library);
		String packageName;
		if (library != null) {
			packageName = PACKAGE_ROOT + "." + library.replace("-", "");
		} else {
			packageName = PACKAGE_ROOT;
		}
		if (serializationLibrary != null) {
			packageName = packageName + "." + serializationLibrary.replace("-", "");
		}
		config.setInvokerPackage(packageName);
		config.setApiPackage(packageName + ".api");
		config.setModelPackage(packageName + ".model");
		convert(inputSpecName, config, library, serializationLibrary);
	}

	private static void convert(String inputSpecName, CodegenConfig config, String suffix1, String suffix2) throws IOException {
		String specNameWithoutExtension = com.google.common.io.Files.getNameWithoutExtension(inputSpecName);
		final String folder = "../" + specNameWithoutExtension;
		final String subFolder = toArtifactId(inputSpecName, config, suffix1, suffix2);
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
		config.setOutputDir(outputDirPath.toFile().getCanonicalPath());

		final OpenAPIV3Parser openApiParser = new OpenAPIV3Parser();
		final ParseOptions options = new ParseOptions();
		options.setFlatten(true);
		options.setResolve(true);
		final OpenAPI openAPI = openApiParser.read(folder + "/" + inputSpecName, null, options);

		final ClientOptInput opts = new ClientOptInput().config(config).openAPI(openAPI);
		new DefaultGenerator().opts(opts).generate();
	}

	private static String toArtifactId(String inputSpecName, CodegenConfig config, String... suffixes) {
		String specNameWithoutExtension = com.google.common.io.Files.getNameWithoutExtension(inputSpecName);
		StringBuilder sb = new StringBuilder();
		sb.append(specNameWithoutExtension);
		sb.append("-openapigen-");
		sb.append(config.getName());
		if (suffixes != null) {
			for (String suffix : suffixes) {
				if (suffix != null && suffix.length() > 0) {
					sb.append("-");
					sb.append(suffix);
				}
			}
		}
		return sb.toString();
	}
}
