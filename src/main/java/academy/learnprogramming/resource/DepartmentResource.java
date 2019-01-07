package academy.learnprogramming.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * @author Anton Sustavov
 * @since 2019/01/07
 */
@Path("departments")
public class DepartmentResource {

    @GET
    @Produces({"application/json; qs=0.9", "application/xml; qs=0.7"})
    public Response getDepartments() {

        return null;
    }
}
