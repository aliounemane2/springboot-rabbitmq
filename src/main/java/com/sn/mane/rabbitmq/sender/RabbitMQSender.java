package com.sn.mane.rabbitmq.sender;

import com.sn.mane.rabbitmq.dto.Person;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Queue;

@Component
public class RabbitMQSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Value("${aliounemane.rabbitmq.exchange}")
    private String exchange;

    @Value("${aliounemane.rabbitmq.routingkey}")
    private String routingkey;

    public void send(Person person) {
        rabbitTemplate.convertAndSend(exchange, routingkey, person);
        System.out.println("Send msg = " + person);

    }
}
