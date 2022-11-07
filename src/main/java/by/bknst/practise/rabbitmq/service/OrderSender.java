package by.bknst.practise.rabbitmq.service;

import by.bknst.practise.rabbitmq.domain.Order;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderSender {

    private static final Logger logger = LogManager.getLogger(OrderSender.class.toString());

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    public void send(Order order) {
        rabbitTemplate.convertAndSend(queue.getName(), order);
        logger.info("Sending Message to the Queue : " + order.toString());
    }
}
