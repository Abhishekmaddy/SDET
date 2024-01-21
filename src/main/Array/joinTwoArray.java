package main.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class joinTwoArray {
    public static void main(String[] args) {

//        ArrayList<Integer> arr1 =new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        ArrayList<Integer> arr2 =new ArrayList<>(Arrays.asList(6,7,8,9,10));
        ArrayList<String> arr1 =new ArrayList<>(Arrays.asList("A","B"));
        ArrayList<String> arr2 =new ArrayList<>(Arrays.asList("C","D"));


        ArrayList<String> combine = new ArrayList<>();
        combine.addAll(arr1);
        combine.addAll(arr2);
        System.out.println(combine);

        Object[] combo = combine.toArray();

        System.out.println(Arrays.toString(combo));


    }
}
