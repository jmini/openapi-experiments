package fr.jmini.openapi.server;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DefaultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest("GET", request, response);
	}

	@Override
	protected void doHead(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest("HEAD", request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest("POST", request, response);
	}

	@Override
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest("PUT", request, response);
	}

	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest("DELETE", request, response);
	}

	@Override
	protected void doOptions(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest("OPTIONS", request, response);
	}

	@Override
	protected void doTrace(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest("TRACE", request, response);
	}

	private void doRequest(String method, HttpServletRequest request, HttpServletResponse response) throws IOException {
		printRequest(method, request);
		response.setContentType("application/json");
		response.setStatus(HttpServletResponse.SC_OK);
		response.getWriter().println("{ \"status\": \"ok\"}");
	}

	private void printRequest(String method, HttpServletRequest request) {
		System.out.println("[" + method + "] " + request.getRequestURI());
		Enumeration<String> headerNames = request.getHeaderNames();
		System.out.println("Headers:");
		while (headerNames.hasMoreElements()) {
			String headerName = headerNames.nextElement();
			System.out.println(" - " + headerName + ": " + request.getHeader(headerName));
		}
	}
}