package com.tw.apistackbase.controller;

import com.tw.apistackbase.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeesController {


    @GetMapping
    public List<Employee> getEmployees () {
        return Employee.createTestEmployees();
    }

    
}
