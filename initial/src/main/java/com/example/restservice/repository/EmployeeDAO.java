package com.example.restservice.repository;

import com.example.restservice.model.Employee;
import com.example.restservice.model.Employees;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {

    private static Employees employees = new Employees();

    static {

        employees.getEmployeesList().add(new Employee(1, "Jimmy", "Hired", "jimmyHired@HPE.com", "sde"));
        employees.getEmployeesList().add(new Employee(2, "Alice", "Wonderland", "alice@wonderland.com", "sde"));
        employees.getEmployeesList().add(new Employee(3, "Bob", "Burger", "bob@burger.com", "sde"));
        employees.getEmployeesList().add(new Employee(4, "Charlie", "Factory", "charlie@factory.com", "sde"));
        employees.getEmployeesList().add(new Employee(5, "Dana", "Tan", "dana@tan.com", "sde"));
    }

    // get all employees
    public Employees getAllEmployees() {
        return employees;
    }

    // add a new employee
    public void addEmployee(Employee employee) {
        employees.getEmployeesList().add(employee);
    }
}