package Experiment5;

class Employee {
    int emp_no;
    String name;
    float salary = 50000;
    int incrFactor;

    Employee(int emp_no, String name) {
        this.emp_no = emp_no;
        this.name = name;
    }

    void show() {
        System.out.println("The salary of employee is " + salary);
    }
}

class FullTime extends Employee {
    FullTime(int emp_no, String name) {
        super(emp_no, name);
        incrFactor = 50;
    }


    void incrSalary() {

        salary += (salary) * (incrFactor / (float) 100);
    }


}

class Intern extends Employee {


    Intern(int emp_id, String name) {
        super(emp_id, name);
        incrFactor = 25;
    }

    void incrSalary() {
        salary += salary * (incrFactor / (float) 100);
    }


}

public class _q3_Hierarchicalinheritance {
    public static void main(String[] args) {
        Intern i1 = new Intern(2000, "Atharv Santosh Sankpal");
        FullTime f1 = new FullTime(1000, "Hemant Sashikant Yadav");
        FullTime f2 = new FullTime(100, "Sanmesh Sachin Satardekar");
        i1.incrSalary();
        i1.show();
        f1.incrSalary();
        f1.show();
        f2.incrSalary();
        f2.show();
    }
}
