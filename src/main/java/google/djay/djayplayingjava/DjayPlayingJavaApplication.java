package google.djay.djayplayingjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class DjayPlayingJavaApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DjayPlayingJavaApplication.class);
        app.run(args);
    }
}
