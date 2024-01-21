package main.Array;

import java.util.Arrays;

public class ArrayMinMax {

    public static void main(String[] args) {

        //Initialize array
        int [] arr = new int [] {1, 11, 7, 75, 56};
        Arrays.sort(arr);

        //Initialize max with first element of array.
        int max = arr[0];
        int min= arr[0];
        int secondLarge=arr[0];
        int secondMin=arr[0];
        //Loop through the array
        for (int i = 0; i < arr.length; i++) {
            //Compare elements of array with max
            if(arr[i] > max) {
                secondLarge=max;
                max = arr[i];
            }
            if (arr[i]<min){
                secondMin=min;
                min=arr[i];
            }
        }
        System.out.println("Largest element present in given array: " + max);
        //System.out.println("Smalest element present in given array: " + min);
        //System.out.println("Smalest element present in given array: " + secondLarge);
       // System.out.println("Smalest element present in given array: " + secondMin);
    }
}