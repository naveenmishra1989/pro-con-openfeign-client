package com.example.client;

import com.example.dto.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "employee-service", url = "http://localhost:9000/producer")
public interface EmployeeClient {

    @PostMapping("/employees")
    Employee createEmployee(@RequestBody Employee employee);

    @GetMapping("/employees/{id}")
    Employee getEmployee(@PathVariable Long id, @RequestHeader HttpHeaders httpHeaders);

    @GetMapping("/employees")
    List<Employee> getAllEmployees();

    @PutMapping("/employees/{id}")
    Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee);

    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable Long id);
}
