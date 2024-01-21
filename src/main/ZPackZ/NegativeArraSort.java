package ZPackZ;

import java.util.HashSet;
import java.util.Set;

public class NegativeArraSort {


    public static void main(String[] args) {
        int A[] = {1, 8, 3, 6, 4, 1, 2, 0, 3, -2, 9, 5};

        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i <= A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j] && A[i] > 0) {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }

        for (int num : A) {
            set.add(num);
        }
        System.out.print(set);


    }
}

