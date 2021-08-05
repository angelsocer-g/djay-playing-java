package google.djay.djayplayingjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class DjayListener implements ApplicationListener<ApplicationStartedEvent> {

    @Autowired
    Environment environment;

    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
//        System.out.println(">>> start");
//        System.out.println(environment.getProperty("djay.name"));
//        System.out.println(">>> end");
    }
}
