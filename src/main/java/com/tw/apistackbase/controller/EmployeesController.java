package com.tw.apistackbase.controller;

import com.tw.apistackbase.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/employees")
public class EmployeesController {

    @GetMapping
    public List<Employee> getEmployees () {
        return Employee.createTestEmployees();
    }


    @PostMapping
    public List<Employee> addEmployee (@RequestBody Employee employee) {
        List<Employee> employees = Employee.createTestEmployees();
        employees.add(employee);
        return employees;
    }

    @DeleteMapping(value = "/{id}")
    public List<Employee> addEmployee (@PathVariable String id) {
        List<Employee> employees = Employee.createTestEmployees();
        employees.removeAll(employees.stream().filter(i -> i.getId().equals(id)).collect(Collectors.toList()));
        return employees;
    }
    
}
