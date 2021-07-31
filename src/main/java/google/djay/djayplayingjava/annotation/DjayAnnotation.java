package google.djay.djayplayingjava.annotation;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) // default: Class
//@Target(ElementType.TYPE)
@Inherited
public @interface DjayAnnotation {

    boolean value() default false;

}
