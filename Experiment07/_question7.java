package Experiment7;

import java.util.ArrayList;
import java.util.Scanner;

//You are tasked with developing a basic payroll system for a company. The system should be built using
//object-oriented programming principles, with a focus on implementing polymorphism.
//The payroll system should have the following requirements:
//1. Create a base class called "Employee" with common attributes such as employee ID, name, and
//basic salary.
//2. Implement two derived classes, "FullTimeEmployee" and "PartTimeEmployee," which inherit
//from the base class "Employee." Each derived class should have specific attributes like hours
//worked or hourly rate, along with any additional attributes required.
//3. Implement a method in the base class called "calculateSalary()" that calculates and returns the
//monthly salary of an employee based on their specific attributes. The formula for calculating the
//salary should differ for full-time and part-time employees.
//4. Allow the user to input employee details, including their employee ID, name, and specific
//attributes based on the employee type (full-time or part-time).
//5. Store the employee objects in a list or an appropriate data structure.
//6. Implement a method to display the details of all employees, including their employee ID, name,
//and monthly salary.
//7. Demonstrate polymorphism by iterating through the list of employees and invoking the
//"calculateSalary()" method for each employee. The correct implementation of the method
//should be automatically selected based on the object type.
//
//8. Finally, display the details and monthly salary of each employee using the method implemented
//in step
class Employee {
    static Scanner io = new Scanner(System.in);
    static ArrayList<Employee> employeeArrayList = new ArrayList<>();
    protected int employeeId;
    protected String name;
    private final double basicSalary = 30000.00;
    protected int hoursWorked;
    protected double hourlyRate;

    protected int experience;
    private double finalSalary;

    Employee() {
        System.out.println("Enter the employee id -->");
        employeeId = io.nextInt();
        io.nextLine();
        System.out.println("Enter the name of the employee -->");
        name = io.nextLine();
        System.out.println("Enter the amount of hours employee has worked -->");
        hoursWorked = io.nextInt();
        System.out.println("Enter the hourly rate of the employee -->");
        hourlyRate = io.nextDouble();
    }

    double calculateSalary() {
        if (experience < 1) experience = 1;
        finalSalary = (basicSalary) + (hoursWorked * hourlyRate * (1.1 * experience));
        return finalSalary;
    }

    static void display() {
        for (Employee e :
                employeeArrayList) {
            System.out.println("The employee id is :" + e.employeeId);
            System.out.println("The employee name is :" + e.name);
            e.calculateSalary();
            System.out.println("The salary of employee is :" + e.finalSalary);
        }
    }
}

class FullTimeEmployee extends Employee {
    FullTimeEmployee() {
        super();
        System.out.println("Enter how many years did the employee has worked in this industry -->");
        experience = io.nextInt();
    }
}

class PartTimeEmployee extends Employee {
    PartTimeEmployee() {
        super();
        experience = 1;
    }
}

public class _question7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        while (true) {
            System.out.println("1.Create FullTime Employee 2.Create PartTime Employee 3.Display all employee information\n0.EXIT");
            a = scan.nextInt();
            switch (a) {
                case 1 -> {
                    FullTimeEmployee e = new FullTimeEmployee();
                    Employee.employeeArrayList.add(e);
                }
                case 2 -> {
                    PartTimeEmployee e = new PartTimeEmployee();
                    Employee.employeeArrayList.add(e);
                }
                case 3 -> Employee.display();
                case 0 -> {
                    System.out.println("Program has been terminated");
                    System.exit(0);
                }
                default -> System.out.println("Invalid Input!!!!");
            }
        }
    }
}
