package com.avis.services.kafkaservicea.controller;

import com.avis.services.kafkaservicea.entity.Employee;
import com.avis.services.kafkaservicea.service.producer.EmployeeProducer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka/employee")
public class EmployeeController {

    private final EmployeeProducer employeeProducer;

    public EmployeeController(EmployeeProducer employeeProducer) {
        this.employeeProducer = employeeProducer;
    }

    @PostMapping("/produce")
    public ResponseEntity<Employee> sendEmployee(@RequestBody Employee employee) {
        employeeProducer.produceEmployee(employee);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
}
