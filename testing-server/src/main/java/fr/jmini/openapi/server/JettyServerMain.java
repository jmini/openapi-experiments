package fr.jmini.openapi.server;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletHandler;

public class JettyServerMain {

	public static void main(String[] args) throws Exception {
		Server server = new Server();
		ServerConnector connector = new ServerConnector(server);
		connector.setPort(8090);
		server.setConnectors(new Connector[] { connector });

		ServletHandler servletHandler = new ServletHandler();
		servletHandler.addServletWithMapping(OpenApiServlet.class, "/openapi.json");
		servletHandler.addServletWithMapping(DefaultServlet.class, "/*");
		server.setHandler(servletHandler);
		server.start();
	}
}