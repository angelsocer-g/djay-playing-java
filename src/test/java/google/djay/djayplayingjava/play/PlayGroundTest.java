package google.djay.djayplayingjava.play;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PlayGroundTest {

    @Test
    void hello() {

        System.out.println("hello");

        List<String> list = new ArrayList<>();
        list.add("h");
        list.add("i");
        list.add("hello");
        list.add("안녕");

        list.forEach(System.out::println);

        String str = list.stream()
                .filter(s -> s.contains("h"))
                .collect(Collectors.joining(","));
        System.out.println("str = " + str);

    }
}
