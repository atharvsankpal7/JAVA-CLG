package Experiment5;


import java.util.Scanner;

public class _question_3 {
    static class Person {
        String name;
        String address;
        long phone_no;

        void getDataPerson(String name, String address, long phone_no) {
            this.name = name;
            this.address = address;
            this.phone_no = phone_no;
        }
    }

    static class Employee extends Person {
        int eno;
        String ename = name;

        void getDataEmployee(String name, String address, long phone_no, int eno) {
            getDataPerson(name, address, phone_no);
            this.eno = eno;
        }

    }

    static class Manager extends Employee {
        String designation;
        String departmentName;
        double Salary = 75000;

        void getDataManager(String name, String address, long phone_no, int eno, String designation, String departmentName, float extraSalary) {
            getDataEmployee(name, address, phone_no, eno);
            this.designation = designation;
            this.departmentName = departmentName;
            Salary += extraSalary;
        }

        void display() {
            System.out.println("The name of the manager is --> " + name);
            System.out.println("The address of the manager is --> " + address);
            System.out.println("The phone_no of the manager is --> " + phone_no);
            System.out.println("The phone_no of the manager is --> " + phone_no);
            System.out.println("The eno of the manager is --> " + eno);
            System.out.println("The designation of the manager is --> " + designation);
            System.out.println("The departmentName of the manager is --> " + departmentName);
            System.out.println("The Salary of the manager is --> " + Salary);
        }

    }

    public static int highestSalary(Manager[] marr) {
        int temp = 0;
        for (int i = 1; i < marr.length; i++) {
            if (marr[temp].Salary < marr[i].Salary) {
                temp = i;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int a = -1;
        boolean isDetailsFilled = false;
        Scanner io = new Scanner(System.in);
        System.out.println("Enter the number of managers -->");
        Manager[] mArr = new Manager[io.nextInt()];
        do {
            System.out.println("Enter you choice\n1.Enter the Details of Managers\t2.Get the manager with highest salary");
            a = io.nextInt();
            switch (a) {
                case 1:
                    isDetailsFilled = true;

                    for (int i = 0; i < mArr.length; i++) {
                        mArr[i] = new Manager();
                        System.out.println("Enter the details for manager " + (i + 1));
                        System.out.println("Enter name, address, phone number, employee number, designation, department name and extra salary respectively -->");
                        mArr[i].getDataManager(io.next(), io.next(), io.nextLong(), io.nextInt(), io.next(), io.next(), io.nextFloat());
                    }
                    break;
                case 2:
                    if (!isDetailsFilled)
                        continue;

                    System.out.println("The details of the manager with highest salary is -->");
                    int temp = highestSalary(mArr);
                    mArr[temp].display();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (a != 0);
    }
}
