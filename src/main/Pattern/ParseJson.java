package main.Pattern;

import java.util.ArrayList;
import java.util.Arrays;

public class ParseJson {

    public static void main(String[] args) {

        //int [] n = {11, 1, 2, 6, 0, -2};
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,3,4,5,6,-2));
//        arr.add(11);
//        arr.add(1);
//        arr.add(2);
//        arr.add(6);
//        arr.add(0);
//        arr.add(-2);
        for (int i=arr.size()-1; i>=0; i--){
            if (arr.get(i)>=0){
                System.out.println(arr.get(i));
            }

        }

    }
}
