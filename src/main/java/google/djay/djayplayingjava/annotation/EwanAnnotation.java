package google.djay.djayplayingjava.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // default: Class
@Target({ElementType.TYPE, ElementType.METHOD})
@Inherited
public @interface EwanAnnotation {

    boolean value() default false;

    String fatherName() default "정주";

    String motherName() default "정미";

}
