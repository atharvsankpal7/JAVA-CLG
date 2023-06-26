package Experiment10.Package1;

public class ArmStrongNo {
   public boolean check(int a) {
        int[] noArray = new int[10];
        int aCopy = a;
        int i = 0;
        while (a != 0) {
            noArray[i] = a % 10;
            a /= 10;
            i++;
        }
        int cubeSum = 0;
        for (int j = 0; j < i; j++) {
            cubeSum += (noArray[j] * noArray[j] * noArray[j]);
        }

        return cubeSum == aCopy;
    }


}
