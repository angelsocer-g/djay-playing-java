package google.djay.djayplayingjava.play;

import java.util.Collections;

public class PlayGround {

    public static void main(String[] args) {
        System.out.println("hi PlayGround");
        fun();
    }

    public static void fun()
    {
        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();

        System.out.println("Current Method is " + methodName);

        String a = "aa";
        System.out.println(a.getClass());
        System.out.println(a.getClass().getName());
    }

}
