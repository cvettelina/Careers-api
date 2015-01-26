package api.application;

import java.util.List;

import javax.annotation.security.PermitAll;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import api.application.request.Degree;
import api.application.request.SchoolType;

@Path(StaticData.PATH)
public interface StaticData {
	
	public static final String PATH = "/static";
	
	@GET
    @Path("/degrees")
    @Produces(MediaType.APPLICATION_JSON)
    @PermitAll
    public List<Degree> getDegrees();
	
	@GET
    @Path("/schools")
    @Produces(MediaType.APPLICATION_JSON)
    @PermitAll
    public List<SchoolType> getSchoolTypes();
}
