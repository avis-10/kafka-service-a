package com.avis.services.kafkaservicea.service.producer;

import com.avis.services.kafkaservicea.entity.Employee;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmployeeProducer {

    private final KafkaTemplate<String, Employee> template;

    public EmployeeProducer(KafkaTemplate<String, Employee> template) {
        this.template = template;
    }

    public void produceEmployee(Employee employee) {
        template.send("topic", employee);
    }
}
