package main.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 1, 1, 0, 0, 0};

        int temp =0;
        for (int i =0; i<arr.length; i++){
            for (int j=i+1; j<arr.length;j++){
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(Integer a : arr){
            list.add(a);
        }
        System.out.println(list);
    }
}
        //Arrays.sort(arr);
        //System.out.print(Arrays.toString(arr));
//        LinkedHashSet<Integer> set = new LinkedHashSet<>();
//        for (Integer s : arr){
//            set.add(s);
//        }
//        System.out.println(set);

//        int temp=0;
//        for (int i=0;i<arr.length;i++){
//            for (int j=i+1; j<arr.length;j++){
//                if (arr[i]>arr[j]){
//                    temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//        ArrayList<Integer> set =new ArrayList<>();
//        for (Integer s: arr){
//            set.add(s);
//        }
//        System.out.println(set);
//    }
//}
