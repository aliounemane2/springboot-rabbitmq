package com.sn.mane.rabbitmq.restController;


import com.sn.mane.rabbitmq.dto.Person;
import com.sn.mane.rabbitmq.sender.RabbitMQSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rabbitmq")
public class RabbitMQWebController {

    @Autowired
    RabbitMQSender rabbitMQSender;

    @PostMapping("/producer")
    public String producer(@RequestBody Person person) {
        Person person1 = new Person();
        rabbitMQSender.send(person);
        return "Message sent to the RabbitMQ Successfully";
    }

}
