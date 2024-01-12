package com.ijse.online_store.service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ijse.online_store.entity.Employee;
import com.ijse.online_store.repository.EmployeeRepository;
import com.ijse.online_store.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  @Autowired
  EmployeeRepository employeeRepository;

  @Override
  public List<Employee> getAllEmployees() {
    return employeeRepository.findAll();
  }

  @Override
  public Employee getEmployeeById(Long Id) {
    return employeeRepository.findById(Id).orElse(null);
  }

  @Override
  public Employee createEmployee(Employee employee) {
    return employeeRepository.save(employee);
  }

  @Override
  public Employee updateEmployee(Long Id, Employee employee) {

    Employee existingEmployee = employeeRepository.findById(Id).orElse(employee);

    if (existingEmployee != null) {

      existingEmployee.setEmployeeEmail(employee.getEmployeeEmail());
      existingEmployee.setEmployeePassword(employee.getEmployeePassword());
      existingEmployee.setEmployeeRole(employee.getEmployeeRole());
      existingEmployee.setEmployeeUserName(employee.getEmployeeUserName());

      return employeeRepository.save(existingEmployee);

    } else {
      return null;
    }

  }

  @Override
  public void deleteEmployee(Long Id) {
    employeeRepository.deleteById(Id);
  }

}
