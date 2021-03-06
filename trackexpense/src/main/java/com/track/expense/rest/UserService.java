package com.track.expense.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.stereotype.Component;

import com.track.expense.dto.Test;

@Component
@Path("/user")
public class UserService {

	  @GET
	  @Produces(MediaType.APPLICATION_JSON)
	  public Response sayPlainTextHello() {
		  return Response.status(Status.OK).entity(new Test()).build();
	  }
}
