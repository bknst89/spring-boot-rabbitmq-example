package by.bknst.practise.rabbitmq.service;

import by.bknst.practise.rabbitmq.domain.Order;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RabbitListener(queues = "rabbitmq.queue", id = "listener")
public class OrderReceiver {
    private static Logger logger = LogManager.getLogger(OrderReceiver.class.toString());

    @RabbitHandler
    public void receiver(Order order) {
        logger.info("MenuOrder listener invoked - Consuming Message with MenuOrder Identifier : " + order.getOrderIdentifier());
    }
}
