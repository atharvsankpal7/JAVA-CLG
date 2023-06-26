package Experiment10.Package1;

public class PrimeNo {
   public boolean check(int n) {
        if (n < 1 || n == 1 || n == 2)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }


}
