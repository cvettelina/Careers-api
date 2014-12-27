package api.application;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

import api.application.request.CustomEmail;

@Path(Emails.PATH)
public interface Emails {

    public static final String PATH = "/emails";

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{recipientId}")
    @RolesAllowed("USER")
    public void sendTeplateEmail(@PathParam("recipientId") Long recipientId);

    @POST
    @Path("/custom")
    @Consumes(MediaType.APPLICATION_JSON)
    @RolesAllowed("USER")
    public void sendCustomEmail(CustomEmail request);

}
