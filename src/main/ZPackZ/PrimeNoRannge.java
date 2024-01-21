package ZPackZ;

import java.util.HashSet;

public class PrimeNoRannge {
    public static void main(String[] args) {
        int low = 20; //21
        int high = 50;


        HashSet<Integer>  hs = new HashSet<>();
        while (low < high) {
            boolean flag = false;
            for (int i = 2; i < low / 2; i++) {
                if (low % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag == true) {
                System.out.println("prime numbers are: " + low);
            }
            low++;
        }

    }
}

