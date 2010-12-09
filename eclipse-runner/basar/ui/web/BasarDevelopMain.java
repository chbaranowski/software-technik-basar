package basar.ui.web;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class BasarDevelopMain {

	public static void main(String[] args) throws Exception {
		String webapp = "web-content";
		Server httpServer = new Server(8080);
		WebAppContext context = new WebAppContext();
		context.setDescriptor(webapp + "/WEB-INF/web.xml");
		context.setResourceBase(webapp);
		context.setContextPath("/basar");
		context.setParentLoaderPriority(true);
		httpServer.setHandler(context);
		httpServer.start();
		httpServer.join();
		httpServer.stop();
	}

}
