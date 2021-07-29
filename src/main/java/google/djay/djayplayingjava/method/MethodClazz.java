package google.djay.djayplayingjava.method;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class MethodClazz {

    public static void main(String[] args) {
        PlayMethod playMethod = new PlayMethod();

        // print methods
        Arrays.stream(PlayMethod.class.getMethods()).forEach(System.out::println);

        System.out.println(System.lineSeparator());

        // invoke some methods
        Arrays.stream(PlayMethod.class.getMethods())
                .filter(m -> m.getName().contains("With"))
                .forEach(m -> {
                    try {
                        m.invoke(playMethod, "jay");
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                });

    }
}
