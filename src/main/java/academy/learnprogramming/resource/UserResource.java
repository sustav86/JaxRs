package academy.learnprogramming.resource;

import academy.learnprogramming.entities.ApplicationUser;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

/**
 * @author Anton Sustavov
 * @since 2019/01/05
 */
@Path("users")
@Consumes("application/json")
@Produces("application/json")
public class UserResource {

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Path("form")
    public Response createUser(@FormParam("email") String email,
                               @FormParam("password") String password,
                               @HeaderParam("Referer") String referer) {

        return Response.ok().build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Path("map")
    public Response createUser(MultivaluedMap<String, String> formMap,
                               @Context HttpHeaders httpHeaders) {

        String referer = httpHeaders.getHeaderString("Referer");
        String email = formMap.getFirst("email");
        String password = formMap.getFirst("password");

        return Response.ok().build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Path("bean")
    public Response createUser(@BeanParam ApplicationUser applicationUser,
                               @CookieParam("user") String user) {

        return Response.ok().build();
    }
}
