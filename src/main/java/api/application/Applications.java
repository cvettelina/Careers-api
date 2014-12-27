package api.application;

import java.util.List;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import api.application.request.Application;
import api.application.request.ChangeStatusRequest;
import api.application.request.Degree;
import api.application.request.Status;
import api.application.response.ApplicationResponse;

@Path(Applications.PATH)
public interface Applications {

    public static final String PATH = "/applications";

    /**
     * Creates an application
     * @param request
     * @param httpReqest
     *
     * Example request
     *
     * POST /careers/applications
     * {
     *     "personalInformation": 
     *     {
     *         "firstName": "Ivan",
     *         "lastName": "Ivanov",
     *         "dateOfBirth": "1991-05-12",
     *         "address":
     *         {
     *             "country": "Plovdiv",
     *             "city": "Bulgaria",
     *             "addressLine": "Han Asparuh 16",
     *             "phoneNumber": "09895626622"
     *         },
     *         "email": "bla@bla.com"
     *     },
     *     "education":
     *     [
     *         {
     *             "duration":
     *             {
     *                 "startDate": "2003-02-12",
     *                 "endDate": "2004-02-12"
     *             },
     *             "country": "Bulgaria",
     *             "city": "Plovdiv",
     *             "schoolName": "Sv.Sv. Kiril i metodii",
     *             "schoolType": "HIGH_SCHOOL",
     *             "degree": "human"
     *         },
     *         {
     *             "duration":
     *             {
     *                 "startDate": "2004-02-12",
     *                 "endDate": "2008-02-12"
     *             },
     *             "country": "Bulgaria",
     *             "city": "Sofia",
     *             "schoolName": "Technical University",
     *             "schoolType": "UNIVERSITY",
     *             "degree": "ENGENEER"
     *         }
     *     ],
     *     "employement":
     *      [
     *         {
     *             "duration":
     *             {
     *                 "startDate": "2003-02-12",
     *                 "endDate": "2004-02-12"
     *             },
     *             "country": "Bulgaria",
     *             "city": "Plovdiv",
     *             "companyName": "IBM",
     *             "position": "Boss",
     *             "desription": "I was the boss"
     *         },
     *         {
     *             "duration":
     *             {
     *                 "startDate": "2004-02-12",
     *                 "endDate": "2008-02-12"
     *             },
     *             "country": "Bulgaria",
     *             "city": "Sofia",
     *             "companyName": "Google",
     *             "position": "CEO",
     *             "description": "I am still the big boss"
     *         }
     *     ],
     *     "personalSkills": "I am very good in everything",
     *     "technicalSkills": "I am very good in everything"
     * }
     *
     * Example response
     *
     * @HTTP 204 No-Content
     *
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @PermitAll
    public void apply(Application request, @Context HttpServletRequest httpReqest);

    /**
     * Creates an application
     * @param request
     * @param httpReqest
     *
     * Example request
     *
     * POST /careers/applications
     * {
     *     "personalInformation": 
     *     {
     *         "firstName": "Ivan",
     *         "lastName": "Ivanov",
     *         "dateOfBirth": "1991-05-12",
     *         "address":
     *         {
     *             "country": "Plovdiv",
     *             "city": "Bulgaria",
     *             "addressLine": "Han Asparuh 16",
     *             "phoneNumber": "09895626622"
     *         },
     *         "email": "bla@bla.com"
     *     },
     *     "education":
     *     [
     *         {
     *             "duration":
     *             {
     *                 "startDate": "2003-02-12",
     *                 "endDate": "2004-02-12"
     *             },
     *             "country": "Bulgaria",
     *             "city": "Plovdiv",
     *             "schoolName": "Sv.Sv. Kiril i metodii",
     *             "schoolType": "HIGH_SCHOOL",
     *             "degree": "human"
     *         },
     *         {
     *             "duration":
     *             {
     *                 "startDate": "2004-02-12",
     *                 "endDate": "2008-02-12"
     *             },
     *             "country": "Bulgaria",
     *             "city": "Sofia",
     *             "schoolName": "Technical University",
     *             "schoolType": "UNIVERSITY",
     *             "degree": "ENGENEER"
     *         }
     *     ],
     *     "employement":
     *      [
     *         {
     *             "duration":
     *             {
     *                 "startDate": "2003-02-12",
     *                 "endDate": "2004-02-12"
     *             },
     *             "country": "Bulgaria",
     *             "city": "Plovdiv",
     *             "companyName": "IBM",
     *             "position": "Boss",
     *             "desription": "I was the boss"
     *         },
     *         {
     *             "duration":
     *             {
     *                 "startDate": "2004-02-12",
     *                 "endDate": "2008-02-12"
     *             },
     *             "country": "Bulgaria",
     *             "city": "Sofia",
     *             "companyName": "Google",
     *             "position": "CEO",
     *             "description": "I am still the big boss"
     *         }
     *     ],
     *     "personalSkills": "I am very good in everything",
     *     "technicalSkills": "I am very good in everything"
     * }
     *
     * Example response
     *
     * @HTTP 204 No-Content
     *
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{applicationId}")
    @RolesAllowed("USER")
    public ApplicationResponse getById(@PathParam("applicationId") Long applicationId);
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @RolesAllowed("USER")
    public List<ApplicationResponse> getByFilter(@QueryParam("position") Long position, @QueryParam("period") Integer period,
            @QueryParam("status") Status status, @QueryParam("degree") Degree degree);

    @POST
    @Path("/{applicationId}/status")
    @Consumes(MediaType.APPLICATION_JSON)
    @RolesAllowed("USER")
    public void changeStatus(@PathParam("applicationId") Long applicationId, ChangeStatusRequest request);
}
