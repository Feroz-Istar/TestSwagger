package myservice;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import io.swagger.annotations.ApiResponses;
import pojo.User;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;

import util.WebResponse;

@Path("/message")
public class JerseyService {
	@Context
	private ContainerRequestContext req;

	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successful", response = WebResponse.class),
			@ApiResponse(code = 400, message = "Bad Request", response = WebResponse.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = WebResponse.class) })

	@GET
	@Path("/google")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMsg(@ApiParam(value = "description for query-parameter") @QueryParam("id") String username) {

		WebResponse web = null;

		web = new WebResponse(200, "great", "");
		Collection<String> k = req.getPropertyNames();
		System.out.println(username);

		String user_id = req.getProperty("id") == null ? "-1" : (String) req.getProperty("id");
		System.out.println(user_id);
		return Response.status(Response.Status.OK).entity(new Gson().toJson(web)).build();
	}
	
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successful", response = WebResponse.class),
			@ApiResponse(code = 400, message = "Bad Request", response = WebResponse.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = WebResponse.class) })

	@POST
	@Path("/auth")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response autenticate(User user) {

		WebResponse web = null;

		web = new WebResponse(200, "great", "");

		System.out.println(user.getEmail());
		return Response.status(Response.Status.OK).entity(new Gson().toJson(web)).build();
	}
}
