package expt3;

class Student7 {
    Student7(String cn, String clgn, int py) {
        String contactNo = cn;
        String collegeName = clgn;
        int passoutYear = py;
        System.out.println("Contact Number " + contactNo + " College Name: " + collegeName + " Pass-out Year: " + passoutYear);
    }

    int id;
    String name;

    Student7(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Id: " + this.id + " Name: " + this.name);
    }

}

public class _question_7 {
    public static void main(String[] args) {
        Student7 s1 = new Student7("1234567890", "ADCET", 2025);
        Student7 s2 = new Student7(21031040, "Atharv Santosh Sankpal");
    }
}
