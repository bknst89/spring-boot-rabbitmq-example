package by.bknst.practise.rabbitmq.controller;

import by.bknst.practise.rabbitmq.domain.Order;
import by.bknst.practise.rabbitmq.service.OrderSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rabbitmq")
public class OrderController {

    @Autowired
    private OrderSender orderSender;

    @PostMapping(value = "/send")
    public String producer(@RequestBody Order order) {
        orderSender.send(order);
        return "Message sent to the RabbitMQ Queue Successfully";
    }
}
