package com.tw.apistackbase.model;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String id;
    private String age;
    private String gender;

    public static List<Employee> createTestEmployees() {
        List<Employee> employees = new ArrayList<>();
        Employee employee = new Employee();
        employee.name = "小明";
        employee.age =  "20";
        employee.id =  "1";
        employee.gender =  "男";
        employees.add(employee);
        return employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}

