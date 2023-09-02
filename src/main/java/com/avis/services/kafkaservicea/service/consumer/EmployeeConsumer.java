package com.avis.services.kafkaservicea.service.consumer;

import com.avis.services.kafkaservicea.entity.Employee;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class EmployeeConsumer {

    @KafkaListener(topics = "topic")
    public void consumeEmployee(Employee employee) {
        System.out.println(employee.toString());
    }
}
