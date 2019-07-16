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

    @PutMapping
    public List<Employee> updateEmployee ( @RequestBody Employee employee) {
        List<Employee> employees = Employee.createTestEmployees();
        for (Employee employee1 : employees) {
            if (employee1.getId().equals(employee.getId())) {
                employee1.setGender(employee.getGender());
                employee1.setAge(employee.getAge());
                employee1.setName(employee.getName());
            }
        }
        return employees;
    }

}
