package misc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ChangeSwToMp {

    public static void modifyFolder(Path inputDir) throws IOException {
        Files.walk(inputDir)
                .filter(f -> f.toFile()
                        .isFile()
                        && f.toFile()
                                .getName()
                                .endsWith(".java"))
                .forEach(f -> modifyFile(f));
    }

    public static void modifyFile(Path file) {
        String content;
        try {
            content = new String(Files.readAllBytes(file));
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalStateException("Could not read file: " + file, e);
        }

        content = content.replace("import io.swagger.v3.oas.models", "import org.eclipse.microprofile.openapi.models");
        content = content.replace("import org.eclipse.microprofile.openapi.models.media.ObjectSchema;", "import org.eclipse.microprofile.openapi.OASFactory;");
        content = content.replace("import org.eclipse.microprofile.openapi.models.media.ByteSchema;", "import org.eclipse.microprofile.openapi.OASFactory;");
        content = content.replace("import org.eclipse.microprofile.openapi.models.media.NumberSchema;", "import org.eclipse.microprofile.openapi.OASFactory;");
        content = content.replace("import org.eclipse.microprofile.openapi.models.media.StringSchema;", "import org.eclipse.microprofile.openapi.OASFactory;");
        content = content.replace("import org.eclipse.microprofile.openapi.models.media.IntegerSchema;", "import org.eclipse.microprofile.openapi.OASFactory;");
        content = content.replace("import org.eclipse.microprofile.openapi.models.media.ArraySchema;", "import org.eclipse.microprofile.openapi.OASFactory;");
        content = content.replace("import org.eclipse.microprofile.openapi.models.media.DateTimeSchema;", "import org.eclipse.microprofile.openapi.OASFactory;");
        content = content.replace("import org.eclipse.microprofile.openapi.models.media.MapSchema;", "import org.eclipse.microprofile.openapi.OASFactory;");
        content = content.replace("import org.eclipse.microprofile.openapi.models.media.ComposedSchema;", "import org.eclipse.microprofile.openapi.OASFactory;");
        content = content.replace("import org.eclipse.microprofile.openapi.models.parameters.QueryParameter", "import org.eclipse.microprofile.openapi.OASFactory;");

        content = content.replace("ApiResponse", "APIResponse");
        content = content.replace("Parameter.StyleEnum", "Parameter.Style");
        content = content.replace(".getDefault()", ".getDefaultValue()");
        content = content.replace("Locale.getDefaultValue()", "Locale.getDefault()");
        content = content.replace(".get$ref()", ".getRef()");
        content = content.replace(".$ref(", ".ref(");
        content = content.replace(".getEnum()", ".getEnumeration()");
        content = content.replace(".setEnum(", ".setEnumeration(");
        content = content.replace("._enum(", ".enumeration(");
        content = content.replace("._default(", ".defaultValue(");
        content = content.replace(".addServersItem(", ".addServer(");
        content = content.replace(".addProperties(", ".addProperty(");
        content = content.replace(".addSchemas(", ".addSchema(");
        content = content.replace(".addRequiredItem(", ".addRequired(");
        content = content.replace(".addAllOfItem(", ".addAllOf(");
        content = content.replace(".addEnumItem(", ".addEnumeration(");
        content = content.replace(".mapping(\"", ".addMapping(\"");

        content = content.replace(".getHead()", ".getHEAD()");
        content = content.replace(".getHead()", ".getPUT()");
        content = content.replace(".getPost()", ".getPOST()");
        content = content.replace(".getDelete()", ".getDELETE()");
        content = content.replace(".getOptions()", ".getOPTIONS()");

        content = content.replace("new OpenAPI()", "OASFactory.createOpenAPI()");
        content = content.replace("new Info()", "OASFactory.createInfo()");
        content = content.replace("new Components()", "OASFactory.createComponents()");
        content = content.replace("new PathItem()", "OASFactory.createPathItem()");
        content = content.replace("new Server()", "OASFactory.createServer()");
        content = content.replace("new APIResponses()", "OASFactory.createAPIResponses()");
        content = content.replace("new APIResponse()", "OASFactory.createAPIResponse()");
        content = content.replace("new Operation()", "OASFactory.createOperation()");
        content = content.replace("new Content()", "OASFactory.createContent()");
        content = content.replace("new MediaType()", "OASFactory.createMediaType()");
        content = content.replace("new ServerVariables()", "OASFactory.createServerVariables()");
        content = content.replace("new ServerVariable()", "OASFactory.createServerVariable()");
        content = content.replace("new RequestBody()", "OASFactory.createRequestBody()");
        content = content.replace("new Discriminator()", "OASFactory.createDiscriminator()");
        content = content.replace("new ExternalDocumentation()", "OASFactory.createExternalDocumentation()");
        content = content.replace("new SecurityRequirement()", "OASFactory.createSecurityRequirement()");
        content = content.replace("new Tag()", "OASFactory.createTag()");
        content = content.replace("new Parameter()", "OASFactory.createParameter()");
        content = content.replace("new Paths()", "OASFactory.createPaths()");
        content = content.replace("new XML()", "OASFactory.createXML()");

        content = content.replace(".type(\"object\")", ".type(Schema.SchemaType.OBJECT)");

        content = content.replace(".addRequestBodies(", ".addRequestBody(");
        content = content.replace(".addResponses(", ".addResponse(");
        content = content.replace(".addParameters(", ".addParameter(");

        content = content.replace("new ObjectSchema()", "OASFactory.createSchema().type(Schema.SchemaType.OBJECT)");
        content = content.replace("new StringSchema()", "OASFactory.createSchema().type(Schema.SchemaType.STRING)");
        content = content.replace("new IntegerSchema()", "OASFactory.createSchema().type(Schema.SchemaType.INTEGER)");
        content = content.replace("new ArraySchema()", "OASFactory.createSchema().type(Schema.SchemaType.ARRAY)");
        content = content.replace("new DateTimeSchema()", "OASFactory.createSchema().type(Schema.SchemaType.STRING).format(\"date-time\")");
        content = content.replace("new DateSchema()", "OASFactory.createSchema().type(Schema.SchemaType.STRING).format(\"date\")");
        content = content.replace("new ByteArraySchema()", "OASFactory.createSchema().type(Schema.SchemaType.STRING).format(\"byte\")");
        content = content.replace("new BinarySchema()", "OASFactory.createSchema().type(Schema.SchemaType.STRING).format(\"binary\")");
        content = content.replace("new UUIDSchema()", "OASFactory.createSchema().type(Schema.SchemaType.STRING).format(\"uuid\")");
        content = content.replace("new NumberSchema()", "OASFactory.createSchema().type(Schema.SchemaType.NUMBER)");
        content = content.replace("new BooleanSchema()", "OASFactory.createSchema().type(Schema.SchemaType.BOOLEAN)");
        content = content.replace("new MapSchema()", "OASFactory.createSchema().type(Schema.SchemaType.OBJECT)");
        content = content.replace("new ComposedSchema()", "OASFactory.createSchema().type(Schema.SchemaType.OBJECT)");
        content = content.replace("new Schema()", "OASFactory.createSchema().type(Schema.SchemaType.OBJECT)");
        content = content.replace("new Schema<>()", "OASFactory.createSchema().type(Schema.SchemaType.OBJECT)");

        content = content.replace(" instanceof ArraySchema", ".getType() == Schema.SchemaType.ARRAY");
        content = content.replace(" instanceof StringSchema", ".getType() == Schema.SchemaType.STRING");
        content = content.replace(" instanceof ObjectSchema", ".getType() == Schema.SchemaType.OBJECT");

        content = content.replace("new QueryParameter()", "OASFactory.createParameter().in(Parameter.In.QUERY)");

        content = content.replace("OASFactory.createSecurityRequirement().addList(", "OASFactory.createSecurityRequirement().addScheme(");

        content = content.replace("OASFactory.createPathItem().get(", "OASFactory.createPathItem().GET(");
        content = content.replace("OASFactory.createPathItem().post(", "OASFactory.createPathItem().POST(");
        content = content.replace(".getGet(", ".getGET(");
        content = content.replace(".getPost(", ".getPOST(");

        content = content.replace(".additionalProperties(false", ".additionalPropertiesBoolean(false");
        content = content.replace(".additionalProperties(true", ".additionalPropertiesBoolean(true");
        content = content.replace(".additionalProperties(OASFactory.createSchema()", ".additionalPropertiesSchema(OASFactory.createSchema()");

        content = content.replace("openAPI.path(", "openAPI.getPaths().addPathItem(");
        content = content.replace(".getPaths().get(", ".getPaths().getPathItem(");
        content = content.replace(".addParametersItem(", ".addParameter(");
        content = content.replace(".readOperations()", ".getOperations().values()");

        content = content.replace(".get(\"/", ".getPathItem(\"/");
        content = content.replace(".get(\"200\")", ".getAPIResponse(\"200\")");
        content = content.replace(".get(\"application/json\")", ".getMediaType(\"application/json\")");
        content = content.replace(".get(\"multipart/form-data\")", ".getMediaType(\"multipart/form-data\")");

        content = content.replace("(ArraySchema)", "");
        content = content.replace("ArraySchema", "Schema");
        content = content.replace("(ObjectSchema)", "");
        content = content.replace("ObjectSchema", "Schema");
        content = content.replace("(ComposedSchema)", "");
        content = content.replace("ComposedSchema", "Schema");
        content = content.replace("(StringSchema)", "");
        content = content.replace("StringSchema", "Schema");
        content = content.replace("(IntegerSchema)", "");
        content = content.replace("IntegerSchema", "Schema");
        content = content.replace("(BooleanSchema)", "");
        content = content.replace("BooleanSchema", "Schema");
        content = content.replace("(Schema) p.getAdditionalProperties()", "p.getAdditionalPropertiesSchema()");

        // Pattern pattern = Pattern.compile("public [A-Za-z]+ add([A-Za-z]+)\\(String ([A-Za-z]+),");
        // Matcher matcher = pattern.matcher(content);
        // int startAt = 0;
        // while (matcher.find(startAt)) {
        // System.out.println(matcher.group());
        // String methodPart = matcher.group(1);
        // String mapName = decapitalizeString(methodPart) + "s";
        // String variableName = matcher.group(2);
        //
        // Optional<Range> findRange = SubstringFinder.define("{", "}")
        // .nextRange(content, matcher.start());
        // if (!findRange.isPresent()) {
        // throw new IllegalStateException("Unxpected");
        // }
        // Range range = findRange.get();
        // // System.out.println(content.substring(range.getRangeStart(), range.getRangeEnd()));
        // // String newContent = ""
        // String newContent = "\n" +
        // "\n" +
        // " /**\n" +
        // " * @see " + classNameFqn + "#remove" + methodPart + "(java.lang.String)\n" +
        // " */\n" +
        // " @Override\n" +
        // " public void remove" + methodPart + "(String " + variableName + ") {\n" +
        // " if (this." + mapName + " != null) {\n" +
        // " this." + mapName + ".remove(" + variableName + ");\n" +
        // " }\n" +
        // " }";
        // content = content.substring(0, range.getRangeEnd()) + newContent + content.substring(range.getRangeEnd());
        // matcher = pattern.matcher(content);
        // startAt = range.getRangeEnd() + newContent.length();
        // }

        try {
            Files.write(file, content.getBytes());
        } catch (IOException e) {
            throw new IllegalStateException("Could not write file: " + file, e);
        }
    }
}
