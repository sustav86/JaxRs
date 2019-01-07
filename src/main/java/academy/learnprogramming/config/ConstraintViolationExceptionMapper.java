package academy.learnprogramming.config;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Anton Sustavov
 * @since 2019/01/04
 */
@Provider
public class ConstraintViolationExceptionMapper implements ExceptionMapper<ConstraintViolationException> {
    @Override
    public Response toResponse(ConstraintViolationException exception) {
        Map<String, String> ex = new HashMap<>();
        for (ConstraintViolation constraintViolation : exception.getConstraintViolations()) {
            ex.put(constraintViolation.getPropertyPath().toString().split("\\.")[2], constraintViolation.getMessage());
        }
        return Response.status(Response.Status.PRECONDITION_FAILED).entity(ex).build();
    }
}
