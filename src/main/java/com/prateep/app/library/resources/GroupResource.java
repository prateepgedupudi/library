/**
 * 
 */
package com.prateep.app.library.resources;



import java.net.URI;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import com.prateep.app.library.model.Group;

/**
 * @author prateep.gedupudi
 *
 */
@Path("/group")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class GroupResource {
	@POST
	public Response addGroup(Group grp,@Context UriInfo uriInfo){
		System.out.println(grp);
		String groupName=grp.getGroupName();
		URI uri=uriInfo.getAbsolutePathBuilder().path(groupName).build();
		return Response.created(uri)
				.entity(grp)
				.build();
		
	} 

}
