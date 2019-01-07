package academy.learnprogramming.config;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import java.util.logging.Logger;

/**
 * @author Anton Sustavov
 * @since 2019/01/07
 */
public class LoggerProducer  {

    @Produces
    public Logger logger(InjectionPoint injectionPoint) {
        return Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
    }
}
