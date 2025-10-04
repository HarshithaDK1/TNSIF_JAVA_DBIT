package com.tns.inheritance;
import java.util.Scanner;

public class InheritanceDemo {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Company input
        System.out.print("Enter Company Name: ");
        String companyName = sc.nextLine();

        Company c = new Company(companyName);
        c.displayCompany();

        System.out.println("\n--- Enter 3 Employees ---");
        Employee[] employees = new Employee[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("\nEnter Employee " + (i + 1) + " ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter Employee " + (i + 1) + " Name: ");
            String name = sc.nextLine();
            employees[i] = new Employee(companyName, name, id);
        }

        // Display employees
        for (Employee e : employees) {
            System.out.println();
            e.displayEmployee();
        }

        System.out.println("\n--- Enter 3 Level One Employees ---");
        LevelOneEmployee[] levelOneEmployees = new LevelOneEmployee[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("\nEnter LevelOne Employee " + (i + 1) + " ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter LevelOne Employee " + (i + 1) + " Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Role: ");
            String role = sc.nextLine();
            levelOneEmployees[i] = new LevelOneEmployee(companyName, name, id, role);
        }

        // Display level one employees
        for (LevelOneEmployee l : levelOneEmployees) {
            System.out.println();
            l.displayLevelOneEmployee();
        }

        sc.close();
    }
}