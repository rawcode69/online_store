package com.ijse.online_store.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.online_store.entity.Employee;

@Service
public interface EmployeeService {

  List<Employee> getAllEmployees();

  Employee getEmployeeById(Long Id);

  Employee createEmployee(Employee employee);

  Employee updateEmployee(Long Id, Employee employee);

  void deleteEmployee(Long Id);
}
