package com.example.restservice.controller;

import com.example.restservice.model.Employee;
import com.example.restservice.model.Employees;
import com.example.restservice.repository.EmployeeDAO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;


// REST Controller for managing employees

@RestController
@RequestMapping("/api/employees")

public class EmployeeController{

    @Autowired
    private EmployeeDAO employeeDao;

    // GET endpoint to fetch all employees
    @GetMapping
    public Employees getEmployees(){
        return employeeDao.getAllEmployees();
    }

    // POST endpoint to add a new employee
    @PostMapping
    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee) {

        // Generate ID for the new employee
        int id = employeeDao.getAllEmployees().getEmployeesList().size() + 1;
        employee.setEmployee_id(id);

        // Add employee to the list
        employeeDao.addEmployee(employee);

        // Build location URI for the new employee
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(employee.getEmployee_id())
                .toUri();
        return ResponseEntity.created(location).build();
    }
}

