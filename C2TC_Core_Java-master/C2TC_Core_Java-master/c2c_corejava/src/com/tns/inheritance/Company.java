package com.tns.inheritance;
import java.util.Scanner;

class Company {
    String companyName;

    Company(String name) {
        this.companyName = name;
    }

    void displayCompany() {
        System.out.println("Company Name: " + companyName);
    }
}

class Employee extends Company {
    String empName;
    int empId;

    Employee(String companyName, String empName, int empId) {
        super(companyName);
        this.empName = empName;
        this.empId = empId;
    }

    void displayEmployee() {
        displayCompany();
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }
}

class LevelOneEmployee extends Employee {
    String role;

    LevelOneEmployee(String companyName, String empName, int empId, String role) {
        super(companyName, empName, empId);
        this.role = role;
    }

    void displayLevelOneEmployee() {
        displayEmployee();
        System.out.println("Role: " + role);
    }
}

