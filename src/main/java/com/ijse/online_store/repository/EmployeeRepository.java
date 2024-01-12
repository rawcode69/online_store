package com.ijse.online_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.online_store.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

//Add custom quries here...
  
}
