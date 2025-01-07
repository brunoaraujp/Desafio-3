package configuração;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class Rabbtmqconfig {

    @Value("${broker.queue.ticket.name}")
    private String queue ;

    @Bean
    public Queue getQueue() {
        return new Queue(queue,true,false,false);
    }


}
