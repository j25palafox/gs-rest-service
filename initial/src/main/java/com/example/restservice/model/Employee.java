package com.example.restservice.model;

public class Employee {

    private String employee_id;
    private String first_name;
    private String last_name;
    private String email;
    private String title;

    public Employee() {}

    // setters

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    // getters

    public String getEmployee_id() {
        return employee_id;
    }
    public String getFirst_name() {
        return first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public String getEmail() {
        return email;
    }
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Employee [" +
                "id = " + employee_id + ", " +
                "title = " + title + ", " +
                "first_name = " + first_name + ", " +
                "last_name = " + last_name + ", " +
                "email = " + email +
                "]";
    }

}