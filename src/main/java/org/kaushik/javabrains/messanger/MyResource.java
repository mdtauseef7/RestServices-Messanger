package org.kaushik.javabrains.messanger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.swagger.annotations.Api;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
@Api(value = "/", description = "Operations on the Solr server")
public class MyResource {

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to the client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getIt() {
		return "Got it!";
	}
}
