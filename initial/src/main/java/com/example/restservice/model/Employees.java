package com.example.restservice.model;

import com.example.restservice.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class Employees {

    private List<Employee> employeesList;

    public Employees(){
        this.employeesList = new ArrayList<>();
    }

    // setter
    public void setEmployeesList(List<Employee> employeesList) {
        this.employeesList = employeesList;
    }

    // getter
    public List<Employee> getEmployeesList(){
        return employeesList;
    }
}