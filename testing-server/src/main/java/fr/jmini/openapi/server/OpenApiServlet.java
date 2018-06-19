package fr.jmini.openapi.server;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OpenApiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		response.setStatus(HttpServletResponse.SC_OK);
		response.getWriter().println("{\n" + //
				"  \"openapi\": \"3.0.1\",\n" + //
				"  \"servers\": [\n" + //
				"    {\n" + //
				"      \"url\": \"/rel\"\n" + //
				"    }\n" + //
				"  ],\n" + //
				"  \"info\": {\n" + //
				"    \"description\": \"This is a sample server\",\n" + //
				"    \"version\": \"1.0.0\",\n" + //
				"    \"title\": \"OpenAPI Petstore\",\n" + //
				"    \"license\": {\n" + //
				"      \"name\": \"Apache-2.0\",\n" + //
				"      \"url\": \"http://www.apache.org/licenses/LICENSE-2.0.html\"\n" + //
				"    }\n" + //
				"  },\n" + //
				"  \"paths\": {\n" + //
				"    \"/ping\": {\n" + //
				"      \"get\": {\n" + //
				"        \"summary\": \"Some ping operation\",\n" + //
				"        \"description\": \"Some ping operation\",\n" + //
				"        \"operationId\": \"doPing\",\n" + //
				"        \"responses\": {\n" + //
				"          \"200\": {\n" + //
				"            \"description\": \"OK\",\n" + //
				"            \"content\" : {\n" + //
				"              \"application/json\" : {\n" + //
				"                \"schema\" : {\n" + //
				"                  \"type\" : \"object\",\n" + //
				"                  \"properties\" : {\n" + //
				"                    \"status\": {\n" + //
				"                      \"type\" : \"string\",\n" + //
				"                      \"example\" : \"ok\"\n" + //
				"                    }\n" + //
				"                  }\n" + //
				"                }\n" + //
				"              }\n" + //
				"            }\n" + //
				"          }\n" + //
				"        }\n" + //
				"      }\n" + //
				"    }\n" + //
				"  }\n" + //
				"}"); //
	} //
}