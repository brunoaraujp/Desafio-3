package Consumer;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class emailConsumer {
    @RabbitListener(queues = "${broker.queue.ticket.name}")
    public void listemEmailQueue(@Payload String ticket) {

    }
}
