package main.abhi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SortArrayUsingRecurssion {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 5, 6, 7, 9, 44, 66, 32, 12,3,3,3,3};

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        //System.out.println(Arrays.toString(arr));
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (Integer s : arr) {
            set.add(s);

        }
        System.out.println(set);

    }
}
