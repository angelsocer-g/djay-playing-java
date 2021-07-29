package google.djay.djayplayingjava.exception;

public class PlayException {

    public static void main(String[] args) {

        try {
            throw new Exception("test Exception");
        } catch (Exception e) {
            System.out.println(e.getStackTrace()[0].getClassName());
            System.out.println(e.getStackTrace()[0].getMethodName());
            e.printStackTrace();
        }
    }

}
