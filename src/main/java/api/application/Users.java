package api.application;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import api.application.request.ChangePasswordRequest;
import api.application.request.User;
import api.application.response.UserResponse;

@Path(Users.PATH)
public interface Users {

    public static final String PATH = "/users";

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @RolesAllowed("ADMIN")
    public void create(User request);

    @POST
    @Path("/{userId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @RolesAllowed("USER")
    public void changePassword(@PathParam("userId") Long userId, ChangePasswordRequest request);

    @POST
    @Path("/{userId}/status")
    @RolesAllowed("ADMIN")
    public void changeStatus(@PathParam("userId") Long userId);
    
    @GET
    @Path("/{userId}")
    @Produces(MediaType.APPLICATION_JSON)
    @RolesAllowed("USER")
    public UserResponse getUser(@PathParam("userId") Long userId);
}
