package org.kaushik.javabrains.messanger.message;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.swagger.annotations.Api;

@Path("/message")
@Api(value = "/", description = "Operations on the Solr server")
public class Message {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage() {
		return "Hello World !";
	}

}
