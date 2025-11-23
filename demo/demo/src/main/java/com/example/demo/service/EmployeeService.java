package com.example.demo.service;

import com.example.demo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class EmployeeService {
    private final List<Employee> employees = new ArrayList<>();
    private Long nextId = 1L;

    public void addEmployee(Employee employee) {
        employee.setId(nextId++);
        employees.add(employee);

    }
    public List<Employee> getEmployees() {
        return employees;
    }

//    public Employee getEmployeebyId(Long id) {
//        Optional<Employee> emp=Employee.stream().filter(e->e.getId().equals(id)).findFirst();
//        return emp.orElse(null);
//    }
//
//    public Employee UpdateEmployee(long id, Employee employee) {
//        Employee existing = getEmployeebyId(id);
//
//    }


}
