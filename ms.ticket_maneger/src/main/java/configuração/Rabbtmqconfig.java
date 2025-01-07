package configuração;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Rabbtmqconfig {

    @Value("${broker.queue.ticket.name}")
    private String queue ;

    @Bean
    public Queue Queue() {
        return new Queue(queue,true,false,false);
    }


}
