package Experiment5;
//Incomplete questions
//Write a Program to design a student class representing student roll no. and a test class (derived class of student) representing the scores of the student in various subjects and sports class representing the score in sports. The sports and test class should be inherited by a result class having the functionality to add the scores and display the final result for a student.
class Student {
    int rollNo;

    float[] finalResult = new float[6];
}

class Test extends Student {
    float[] marks = new float[5];
}

class Sports extends Student {
    float sportMarks;
}

public class _question_7 {
}
