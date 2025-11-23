package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addemployee")
    public String addEmployee(@RequestBody Employee employee) {
         employeeService.addEmployee(employee);
         return "Employee added successfully";
    }
    @GetMapping("/getallemployee")
    public List<Employee> getEmployees(){
    return employeeService.getEmployees();
    }
}
