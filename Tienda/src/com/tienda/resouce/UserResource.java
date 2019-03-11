/*
 * MIME type needs to be given : Different formats in which information can be exchanged.
 */

package com.tienda.resouce;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashSet;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.container.ResourceContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;



import com.tienda.bean.ExceptionMessage;
import com.tienda.bean.Link;
import com.tienda.bean.User;
import com.tienda.service.TiendaService;
import com.tienda.util.UserNotFoundException;

@Path("/users")                           			 						//  URI path through which client can access resource
public class UserResource {													// root resource class
	
	@Context
	private ResourceContext resourceContext;                                //dependency injection
	
	@Context
	private  UriInfo uriInfo;
	//client must use get to access this method if post or any other method is use user will get method not accessible error (405)
    @GET															
    
    @Produces(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})                         //Mime type
    @Path("{uname}")														//template parameter
    
    																		//MIME type for JSON : application/json
    
    public Response fetchUserDetails(@PathParam("uname")String username,@DefaultValue("plain/text") @HeaderParam("Accpet") String acceptString) throws UserNotFoundException{    	//  resource Method
		User user;
		user = new TiendaService().getUserDetails(username);
		user.setLinks(new HashSet<Link>());
		
		UriBuilder baseBuilder = uriInfo.getBaseUriBuilder();       //use to generate base uri's E.G. http://localhost:8080/Tienda
		baseBuilder.path(UserResource.class);
		baseBuilder.path(UserResource.class,"getSubResource").resolveTemplate("uname", username);
		
		user.getLinks().add(new Link(UriBuilder.fromPath(baseBuilder.toTemplate()).resolveTemplate("sub-resource-name", "orders").build().toString(),
											String.format("%s,%s", MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML)));   //type defines the mime type i.e. what kind of response is been sent
		
		baseBuilder.path(UserResource.class);
		baseBuilder.path(UserResource.class,"getSubResource").resolveTemplate("uname", username);
		
		user.getLinks().add(new Link(UriBuilder.fromPath(baseBuilder.toTemplate()).resolveTemplate("sub-resource-name", "Wishlist").build().toString(),
				String.format("%s,%s", MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML)));   //type defines the mime type i.e. what kind of response is been sent

		return Response.ok(user).build();
	}
    
    @POST
    @Consumes(value = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Response createUser(User user) throws URISyntaxException{
    	System.out.println(user.getEmail());
    	System.out.println(user.getUserName());
    	return Response.created(new URI("http://localhost:8080/tienda")).build();
    }
    @Path("{uname}/{sub-resource-name}")
    public Object getSubResource(@PathParam("sub-resource-name") String subResourceName){    //sub resource locator
    	if("orders".equals(subResourceName)){
    		
    		return resourceContext.getResource(OrderResource.class);
    }else if("Wishlist".equals(subResourceName)){
    //		return resourceContext.getResource(Wishlist.class)
    	}
    	
    	throw new WebApplicationException(Response.status(Response.Status.BAD_REQUEST).entity(new ExceptionMessage("no such Response")).build());       //from JAX-RS
    	
    }
}
