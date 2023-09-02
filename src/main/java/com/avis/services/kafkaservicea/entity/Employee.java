package com.avis.services.kafkaservicea.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    private int empId;
    private String firstName;
    private String lastName;
    private Long salary;

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
