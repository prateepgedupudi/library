/**
 * 
 */
package com.prateep.app.library.resources;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.prateep.app.library.model.User;
import com.prateep.app.library.resources.beans.UserCredentials;
import com.prateep.app.library.service.UserService;


/**
 * @author prateep.gedupudi
 *
 */
@Path("/user")
public class UserResource {
	UserService userService=new UserService();
	 
	@POST
    @Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public User getDashboard(UserCredentials userCredentials, @Context HttpServletRequest request) {
		if(userService.getUser(userCredentials.getUsername())!=null){
			userService.getUser(userCredentials.getUsername());
		}
		return null;
		
		
	}
	
	
	

}
