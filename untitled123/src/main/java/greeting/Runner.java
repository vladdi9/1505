package greeting;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        GreetingConfiguration.class);
        GreetingService service = context.getBean(GreetingService.class);
        System.out.println(service.sayGreeting());

    }
}
