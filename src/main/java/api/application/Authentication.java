package api.application;

import javax.annotation.security.PermitAll;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import api.application.request.Credentials;
import api.application.response.LoginResponse;

@Path(Authentication.PATH)
public interface Authentication {
    
    public static final String PATH = "/authenticate";
    
    @POST
    @PermitAll
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public LoginResponse login(Credentials credentials, @Context HttpServletRequest httpRequest);
    
    @POST
    @PermitAll
    @Path("/{userId}/logout")
    public void logout(@PathParam("userId") Long userId);

}
