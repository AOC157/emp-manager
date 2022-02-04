package com.example.empmanager.repository;

import com.example.empmanager.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee , Long> {
    Optional<Employee> findEmployeeById(Long id);
}
