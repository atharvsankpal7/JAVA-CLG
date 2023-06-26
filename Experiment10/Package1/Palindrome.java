package Experiment10.Package1;

public class Palindrome {
  public   Boolean check(int a) {
        int[] noArray = new int[10];
        int aCopy = a;
        int i = 0;
        while (a != 0) {
            noArray[i] = (a % 10);
            a /= 10;
            i++;
        }
        int cubeSum = noArray[0];
        for (int j = 1; j < i; j++) {
            cubeSum *= 10;
            cubeSum += (noArray[j]);
        }
        return cubeSum == aCopy;
    }


}
