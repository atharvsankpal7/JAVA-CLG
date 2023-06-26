package Experiment10.Package1;

public class ThreeNoOperations {
    public int max(int a, int b, int c) {
        int temp = a > b ? a : b;
        return temp > c ? temp : c;
    }

    public int min(int a, int b, int c) {
        int temp = a < b ? a : b;
        return temp < c ? temp : c;
    }
}
