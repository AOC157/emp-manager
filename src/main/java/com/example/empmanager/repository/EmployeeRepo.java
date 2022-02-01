package com.example.empmanager.repository;

import com.example.empmanager.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee , Long> {
}
