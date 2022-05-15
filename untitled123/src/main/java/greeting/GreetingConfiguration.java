package greeting;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingConfiguration {
    @Bean
    GreetingService getGreetingService(){
        return new Greeting();
    }
}
