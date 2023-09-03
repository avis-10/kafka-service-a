package com.avis.services.kafkaservicea.service.producer;

import com.avis.services.kafkaservicea.entity.Employee;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmployeeProducer {

    private final KafkaTemplate<String, String> template;

    public EmployeeProducer(KafkaTemplate<String, String> template) {
        this.template = template;
    }

    public void produceEmployee(Employee employee) {
        System.out.println("Sending Employee type object as string to Kafka");
        template.send("topic", employee.toString());
    }
}
