
public class question10 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        e1.setData("Robert", 1994, "64C-WallsStreat");
        e2.setData("Sam", 2000, "68D-WallsStreat");
        e3.setData("John", 1999, "26B-WallsStreat");
        e1.getData();
        System.out.println();
        e2.getData();
        System.out.println();
        e3.getData();
    }
}

class Employee {
    String name;
    int year_of_joining;
    double salary = 1200000;
    String address;

    public void setData(String name, int year_of_joining, String address) {
        this.name = name;
        this.year_of_joining = year_of_joining;
        this.address = address;
    }

    public void getData() {
        System.out.println("The name of the employee is --> " + name);
        System.out.println("The year of joining of the employee is --> " + year_of_joining);
        System.out.println("The salary of the employee is --> " + salary);
        System.out.println("The address of the employee is --> " + address);
    }
}