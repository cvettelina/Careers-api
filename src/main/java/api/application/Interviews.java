package api.application;

import java.util.Collection;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import api.application.request.Interview;
import api.application.request.InterviewDuration;
import api.application.response.InterviewResponse;

@Path(Interviews.PATH)
public interface Interviews {

    public static final String PATH = "/interviews";

    @GET
    @RolesAllowed("USER")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<InterviewResponse> getByUser(@QueryParam("userId") Long userId);

    @GET
    @Path("/application")
    @RolesAllowed("USER")
    @Produces(MediaType.APPLICATION_JSON)
    public InterviewResponse getbyApplicationId(@QueryParam("userId") Long applicationId);

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @RolesAllowed("USER")
    public void add(Interview interview);

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @RolesAllowed("USER")
    @Path("/{interviewId}")
    public void edit(@PathParam("interviewId") Long interviewId, InterviewDuration duration);

}
