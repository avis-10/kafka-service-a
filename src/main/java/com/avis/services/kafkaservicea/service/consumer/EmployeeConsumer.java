package com.avis.services.kafkaservicea.service.consumer;

import com.avis.services.kafkaservicea.entity.Employee;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class EmployeeConsumer {

    @KafkaListener(topics = "topic")
    public void consumeEmployee(String employee) {
        System.out.println("Detected an event and consuming the message! ");
        System.out.println(employee);
    }
}
