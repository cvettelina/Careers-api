package api.application;

import java.util.Collection;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import api.application.request.Position;
import api.application.response.PositionResponse;

@Path(Positions.PATH)
public interface Positions {
    public static final String PATH = "/positions";

    @POST
    @RolesAllowed("USER")
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(Position request);

    @GET
    @PermitAll
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<PositionResponse> getAll();
    
    @GET
    @PermitAll
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{positionId}")
    public PositionResponse getById(@PathParam("positionId") Long positionId);
    
    @POST
    @RolesAllowed("USER")
    @Path("/{positionId}/delete")
    public void delete(@PathParam("positionId") Long positionId);
    
    @POST
    @Path("/{positionId}")
    @RolesAllowed("USER")
    public void edit(@PathParam("positionId") Long positionId, Position position);
}
