package google.djay.djayplayingjava.clazz;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Clazz {

    public static void main(String[] args) throws Exception{

        // get Class 1
        System.out.println("===== S, get Class 1");
        Class<Djay> classDjay = Djay.class;
        Arrays.stream(classDjay.getConstructors()).forEach(System.out::println);
        System.out.println("===== E, get Class 1");

        // get Class 2
        System.out.println("===== S, get Class 2");
        Djay djay = new Djay();
        Class<?> classDjay2 = djay.getClass();
        Arrays.stream(classDjay.getConstructors()).forEach(System.out::println);
        System.out.println("===== E, get Class 2");

        // get Class 3
        System.out.println("===== S, get Class 3");
        Class<?> classDjay3 = Class.forName("google.djay.djayplayingjava.clazz.Djay");
        Arrays.stream(classDjay.getConstructors()).forEach(System.out::println);
        System.out.println("===== E, get Class 3");

        // get Instance
        System.out.println("===== S, print constructors");
        Arrays.stream(Djay.class.getConstructors()).forEach(System.out::println);
        System.out.println("===== E, print constructors");

        System.out.println("===== S, get Instance");
        Constructor<Djay> constructor = Djay.class.getConstructor(String.class, String.class, int.class);
        Djay djay1 = constructor.newInstance("jungju", "dogfoot", 50);
        System.out.println(djay1.toString());
        System.out.println("===== E, get Instance");


        // S, just playing
        try {
            Constructor<Djay> cons = classDjay.getConstructor(String.class, String.class, int.class);
            try {
                Djay djay2 = cons.newInstance("jungju", "dogfoot", 40);
                Arrays.stream(Djay.class.getDeclaredFields()).forEach(f -> {
                    try {
                        f.setAccessible(true);
                        System.out.println(f.get(djay2));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                });
            } catch (InstantiationException | InvocationTargetException | IllegalAccessException e) {
                e.printStackTrace();
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        // E, just playing
    }

}
