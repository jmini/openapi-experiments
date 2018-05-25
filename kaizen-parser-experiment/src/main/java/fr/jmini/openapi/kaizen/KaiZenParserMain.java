package fr.jmini.openapi.kaizen;

import com.reprezen.kaizen.oasparser.OpenApi3Parser;
import com.reprezen.kaizen.oasparser.model3.OpenApi3;
import com.reprezen.kaizen.oasparser.model3.Operation;
import com.reprezen.kaizen.oasparser.model3.Parameter;
import com.reprezen.kaizen.oasparser.model3.Path;
import com.reprezen.kaizen.oasparser.model3.Schema;
import com.reprezen.kaizen.oasparser.val.ValidationResults.ValidationItem;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class KaiZenParserMain {

	public static void main(String[] args) throws IOException {
		java.nio.file.Path oas3Path = Paths.get("../openapi-generator-utils/petstore/petstore.json");
		if (Files.isRegularFile(oas3Path)) {
			processOAS3(oas3Path.toFile(), false);
		} else {
			System.err.println(oas3Path.toString() + " does not exist.");
		}
	}

	private static void processOAS3(File specFile, boolean validate) {
		OpenApi3 model = new OpenApi3Parser().parse(specFile, validate);
		System.out.printf("== Model %s\n", specFile);
		if (!validate || model.isValid()) {
			describeModel(model);
		} else {
			for (ValidationItem item : model.getValidationItems()) {
				System.out.println(item);
			}
		}
		System.out.printf("------\n\n");
	}

	private static void describeModel(OpenApi3 model) {
		System.out.printf("Title: %s\n", model.getInfo().getTitle());
		for (Path path : model.getPaths().values()) {
			System.out.printf("Path %s:\n", path.getPathString());
			for (Operation op : path.getOperations().values()) {
				System.out.printf("  %s: %s\n", op.getOperationId(), op.getSummary());
				for (Parameter param : op.getParameters()) {
					System.out.printf("    %s[%s]:, %s - %s\n", param.getName(), param.getIn(), getParameterType(param),
							param.getDescription());
				}
			}
		}
	}

	private static String getParameterType(Parameter param) {
		Schema schema = param.getSchema();
		return schema != null ? schema.getType() : "unknown";
	}
}
