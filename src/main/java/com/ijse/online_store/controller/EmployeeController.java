package com.ijse.online_store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ijse.online_store.entity.Employee;
import com.ijse.online_store.service.EmployeeService;

@RestController
public class EmployeeController {

  @Autowired
  EmployeeService employeeService;

  @GetMapping("/employee")
  public ResponseEntity<List<Employee>> getAllEmpoyee() {

    try {
      return ResponseEntity.status(HttpStatus.OK).body(employeeService.getAllEmployees());
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

  }

  @GetMapping("/employee/{id}")
  public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {

    Employee employee = employeeService.getEmployeeById(id);

    if (employee != null) {
      return ResponseEntity.status(HttpStatus.OK).body(employee);
    } else {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

  }

  @PostMapping("/employee")
  public ResponseEntity<?> createEmployee(@RequestBody Employee employee) {

    Employee newEmployee = employeeService.createEmployee(employee);

    if (newEmployee != null) {
      return ResponseEntity.status(HttpStatus.CREATED).body(newEmployee);
    } else {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Employee Not Found");
    }

  }

  @PutMapping("/employee/{id}")
  public ResponseEntity<?> updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {

    Employee updatedEmployee = employeeService.updateEmployee(id, employee);

    if (updatedEmployee != null) {
      return ResponseEntity.status(HttpStatus.CREATED).body(updatedEmployee);
    } else {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Employee Not Updated");
    }

  }

  @DeleteMapping("/employee/{id}")
  public ResponseEntity<?> deleteEmployee(@PathVariable Long id) {

    Employee employee = employeeService.getEmployeeById(id);

    try {
      if (employee != null) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.status(HttpStatus.OK).body("Employee Delete Succesfully");
      } else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee Not Found");
      }
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error Deleting Employee");
    }

  }

}
