package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {
 List<Employee> getAllEmployee();
 
 Employee saveEmployee(Employee employee);
 
 Employee getEmployeeById(int employee_id);
 Employee updateEmployee(Employee employee);
}
