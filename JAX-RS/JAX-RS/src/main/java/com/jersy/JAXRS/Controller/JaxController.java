package com.jersy.JAXRS.Controller;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;

import com.jersy.JAXRS.Entity.BusPassengers;
import com.jersy.JAXRS.Service.BusService;


import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

//@Component
@Path("JAX-RS")
public class JaxController {
	
	@Autowired
	BusService bService;
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON_PATCH_JSON)
	@Path("/passengers")
	public Collection<BusPassengers> getDtails(@RequestHeader Map<String,String> headers){
		//System.out.println("httpservlet inf :"+headers.getLocation().getPath().toString());
//		 headers.forEach((key,value) ->{
//	            System.out.println("Header Name: "+key+" Header Value: "+value);
//	        });
		return bService.getAllPassengers();
	}
	
	@POST
    @Produces("application/json")
	 @Consumes("application/json")
	 @Path("/passengers")
	public Response createPassengers(BusPassengers passenger) throws URISyntaxException {
		return bService.createResource(passenger);
	}
	
	
	@PUT
	@Path("update/{id}")
	  @Consumes("application/json")
	  @Produces(MediaType.TEXT_PLAIN)
	public Response updatePassenger(@PathParam("id") int id,BusPassengers b) {
		return bService.updatePassengerValues(id, b);
	}
	
	@DELETE
	@Path("delete/{id}")
	public Response deletePassenegr(@PathParam("id") int id) {
		return bService.DeleteUser(id);
	}
}
