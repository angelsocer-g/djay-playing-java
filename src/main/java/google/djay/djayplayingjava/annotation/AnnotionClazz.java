package google.djay.djayplayingjava.annotation;

import google.djay.djayplayingjava.clazz.Djay;

import java.util.Arrays;

public class AnnotionClazz {

    public static void main(String[] args) {
        Djay djay = new Djay();
        System.out.println(djay.toString());

        Arrays.stream(djay.getClass().getAnnotations()).forEach(System.out::println);

        djay.getClass().getAnnotation(EwanAnnotation.class).fatherName();
    }

}
