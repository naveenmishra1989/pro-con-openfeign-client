package com.example.service;

import com.example.client.EmployeeClient;
import com.example.dto.Employee;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

@Service
public class MyService {
    private final EmployeeClient employeeClient;

    public MyService(EmployeeClient employeeClient) {
        this.employeeClient = employeeClient;
    }

    public Employee createEmployee(Employee employee) {
        return employeeClient.createEmployee(employee);
    }

    public Employee getEmployee(Long id, HttpHeaders httpHeaders) {
        return employeeClient.getEmployee(id, httpHeaders);
    }

    public List<Employee> getAllEmployees() {
        return employeeClient.getAllEmployees();
    }

    public Employee updateEmployee(Long id, Employee employee) {
        return employeeClient.updateEmployee(id, employee);
    }

    public void deleteEmployee(Long id) {
        employeeClient.deleteEmployee(id);
    }
}
